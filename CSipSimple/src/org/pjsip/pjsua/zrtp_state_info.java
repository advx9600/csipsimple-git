/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class zrtp_state_info {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  public zrtp_state_info(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(zrtp_state_info obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsuaJNI.delete_zrtp_state_info(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCall_id(int value) {
    pjsuaJNI.zrtp_state_info_call_id_set(swigCPtr, this, value);
  }

  public int getCall_id() {
    return pjsuaJNI.zrtp_state_info_call_id_get(swigCPtr, this);
  }

  public void setSecure(int value) {
    pjsuaJNI.zrtp_state_info_secure_set(swigCPtr, this, value);
  }

  public int getSecure() {
    return pjsuaJNI.zrtp_state_info_secure_get(swigCPtr, this);
  }

  public void setSas(pj_str_t value) {
    pjsuaJNI.zrtp_state_info_sas_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getSas() {
    long cPtr = pjsuaJNI.zrtp_state_info_sas_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setCipher(pj_str_t value) {
    pjsuaJNI.zrtp_state_info_cipher_set(swigCPtr, this, pj_str_t.getCPtr(value), value);
  }

  public pj_str_t getCipher() {
    long cPtr = pjsuaJNI.zrtp_state_info_cipher_get(swigCPtr, this);
    return (cPtr == 0) ? null : new pj_str_t(cPtr, false);
  }

  public void setSas_verified(int value) {
    pjsuaJNI.zrtp_state_info_sas_verified_set(swigCPtr, this, value);
  }

  public int getSas_verified() {
    return pjsuaJNI.zrtp_state_info_sas_verified_get(swigCPtr, this);
  }

  public zrtp_state_info() {
    this(pjsuaJNI.new_zrtp_state_info(), true);
  }

}
