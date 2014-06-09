package com.csipsimple.db;

import java.util.ArrayList;
import java.util.List;

import com.csipsimple.R;
import com.csipsimple.utils.contacts.ContactsWrapper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract.Data;

public class MyDBAdapter extends SQLiteOpenHelper {
	private SQLiteDatabase mReadDB = null;
	private final String TB_CONTACK_TEMP_NAME = "tb_contack_temp";
	private final String TABLE_CONTACK_TEMP_CREATE="CREATE TABLE IF NOT EXISTS "
	+TB_CONTACK_TEMP_NAME+
	"("
		+Data._ID+" TEXT,"
		+Data.CONTACT_ID+" TEXT,"
		+Data.DATA1+" TEXT,"
		+Data.DISPLAY_NAME+" TEXT,"
		+Data.PHOTO_ID+" TEXT,"
		+Data.LOOKUP_KEY+" TEXT,"
		+Data.PHOTO_URI+" TEXT,"
		+Data.MIMETYPE+" TEXT,"
		+Data.DATA2+" TEXT,"
		+Data.DATA3+" TEXT,"
		+Data.DATA5+" TEXT,"
		+Data.DATA6+" TEXT"
			+")";
	private Context mContext;
	
	public MyDBAdapter(Context context) {
		super(context, "my_selef_db.db", null, 1);
		mContext = context;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		db.execSQL(TABLE_CONTACK_TEMP_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub

	}
	
	public Cursor getSortedContact(){
		Cursor c =  ContactsWrapper.getInstance().getContactsPhones(mContext,"");
    	if (c.getCount() <1) {
    		c.close();
    		return null;
    	}
    	
    	List<Integer> sortList = new ArrayList<Integer>();
    	/* 添加特殊规则的排序 */
    	String[] sortBys = mContext.getResources().getStringArray(R.array.sort_by_names);
    	for (int i=0;i<sortBys.length;i++){    		
    		int j=0;
    		for (c.moveToFirst();!c.isAfterLast();c.moveToNext(),j++){
    			String name = c.getString(c.getColumnIndex(Data.DISPLAY_NAME));
    			if (name.startsWith(sortBys[i])){
    				sortList.add(j);
    			}
    		}
    	}
    	/* 添加普通排序  */
    	for (int i=0;i<c.getCount();i++){
    		int listCount = sortList.size();
    		int j =0;
    		for (j =0;j<listCount;j++){
    			if (sortList.get(j) == i){
    				break;
    			}
    		}
    		if (j == listCount){
    			sortList.add(i);
    		}
    	}
    	        	    	
    	SQLiteDatabase db = getWritableDatabase();
    	/* 删除已经存在的数据 */
    	db.execSQL("delete from "+TB_CONTACK_TEMP_NAME);
    	
    	for (int i=0;i<sortList.size();i++){
    		c.moveToPosition(sortList.get(i));
    		ContentValues values = new ContentValues();
			for (int j=0;j<c.getColumnCount();j++){
				values.put(c.getColumnName(j), c.getString(c.getColumnIndex(c.getColumnName(j))));
			}
			db.insert(TB_CONTACK_TEMP_NAME, null, values);
    	}
		
    	c.close();
    	db.close();
		    	
    	db = this.getReadableDatabase();
    	
    	return db.query(TB_CONTACK_TEMP_NAME,null,"",null,null,null,null);
//		SQLiteDatabase db = getWritableDatabase();		
//		while(c.moveToNext()){
//			ContentValues values = new ContentValues(); 	
//			
//			for (int i=0;i<c.getColumnCount();i++){
//				values.put(c.getColumnName(i), c.getString(c.getColumnIndex(c.getColumnName(i))));
//			}
//			
//			db.insert(TB_CONTACK_TEMP_NAME, null, values);
//		}
//		db.close();
//		return null;
	}

}
