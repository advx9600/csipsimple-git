package com.csipsimple;

import android.app.Application;

public class SipHomeData extends Application{
	private boolean isDoorMachine=false;
	
	public void onCreate(){
		super.onCreate();
	}
	
	public void setIsDoorMachine(boolean b){
		isDoorMachine=b;
	}
	
	public boolean isDoorMachine(){
		return isDoorMachine;
	}
}
