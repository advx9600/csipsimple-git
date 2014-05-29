/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.4
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua;

public class pjsua implements pjsuaConstants {
  public static pj_str_t pj_str_copy(String str) {
    return new pj_str_t(pjsuaJNI.pj_str_copy(str), true);
  }

  public static void setCallbackObject(Callback callback) {
    pjsuaJNI.setCallbackObject(Callback.getCPtr(callback), callback);
  }

  public static pj_pool_t pjsua_pool_create(String name, long init_size, long increment) {
    long cPtr = pjsuaJNI.pjsua_pool_create(name, init_size, increment);
    return (cPtr == 0) ? null : new pj_pool_t(cPtr, false);
  }

  public static void pj_pool_release(pj_pool_t pool) {
    pjsuaJNI.pj_pool_release(pj_pool_t.getCPtr(pool), pool);
  }

  public static int pjmedia_tonegen_create2(pj_pool_t pool, pj_str_t name, long clock_rate, long channel_count, long samples_per_frame, long bits_per_sample, long options, pjmedia_port pp_port) {
    return pjsuaJNI.pjmedia_tonegen_create2(pj_pool_t.getCPtr(pool), pool, pj_str_t.getCPtr(name), name, clock_rate, channel_count, samples_per_frame, bits_per_sample, options, pp_port);
  }

  public static int pjmedia_tonegen_play(pjmedia_port tonegen, long count, pjmedia_tone_desc[] tones, long options) {
    return pjsuaJNI.pjmedia_tonegen_play(pjmedia_port.getCPtr(tonegen), tonegen, count, pjmedia_tone_desc.cArrayUnwrap(tones), options);
  }

  public static int pjmedia_tonegen_play_digits(pjmedia_port tonegen, long count, pjmedia_tone_digit[] digits, long options) {
    return pjsuaJNI.pjmedia_tonegen_play_digits(pjmedia_port.getCPtr(tonegen), tonegen, count, pjmedia_tone_digit.cArrayUnwrap(digits), options);
  }

  public static int pjmedia_tonegen_rewind(pjmedia_port tonegen) {
    return pjsuaJNI.pjmedia_tonegen_rewind(pjmedia_port.getCPtr(tonegen), tonegen);
  }

  public static int pjmedia_tonegen_stop(pjmedia_port tonegen) {
    return pjsuaJNI.pjmedia_tonegen_stop(pjmedia_port.getCPtr(tonegen), tonegen);
  }

  public static int pjmedia_port_destroy(pjmedia_port port) {
    return pjsuaJNI.pjmedia_port_destroy(pjmedia_port.getCPtr(port), port);
  }

  public static void setZrtpCallbackObject(ZrtpCallback callback) {
    pjsuaJNI.setZrtpCallbackObject(ZrtpCallback.getCPtr(callback), callback);
  }

  public static int mobile_reg_handler_init() {
    return pjsuaJNI.mobile_reg_handler_init();
  }

  public static void mobile_reg_handler_set_callback(MobileRegHandlerCallback callback) {
    pjsuaJNI.mobile_reg_handler_set_callback(MobileRegHandlerCallback.getCPtr(callback), callback);
  }

  public static int sipclf_mod_init() {
    return pjsuaJNI.sipclf_mod_init();
  }

  public static int mod_earlylock_init() {
    return pjsuaJNI.mod_earlylock_init();
  }

  public static void mod_earlylock_set_callback(EarlyLockCallback callback) {
    pjsuaJNI.mod_earlylock_set_callback(EarlyLockCallback.getCPtr(callback), callback);
  }

  public synchronized static void logging_config_default(pjsua_logging_config cfg) {
    pjsuaJNI.logging_config_default(pjsua_logging_config.getCPtr(cfg), cfg);
  }

  public synchronized static void logging_config_dup(pj_pool_t pool, pjsua_logging_config dst, pjsua_logging_config src) {
    pjsuaJNI.logging_config_dup(pj_pool_t.getCPtr(pool), pool, pjsua_logging_config.getCPtr(dst), dst, pjsua_logging_config.getCPtr(src), src);
  }

  public synchronized static void config_default(pjsua_config cfg) {
    pjsuaJNI.config_default(pjsua_config.getCPtr(cfg), cfg);
  }

  public synchronized static void config_dup(pj_pool_t pool, pjsua_config dst, pjsua_config src) {
    pjsuaJNI.config_dup(pj_pool_t.getCPtr(pool), pool, pjsua_config.getCPtr(dst), dst, pjsua_config.getCPtr(src), src);
  }

  public synchronized static void msg_data_init(pjsua_msg_data msg_data) {
    pjsuaJNI.msg_data_init(pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static pjsua_msg_data msg_data_clone(pj_pool_t pool, pjsua_msg_data rhs) {
    long cPtr = pjsuaJNI.msg_data_clone(pj_pool_t.getCPtr(pool), pool, pjsua_msg_data.getCPtr(rhs), rhs);
    return (cPtr == 0) ? null : new pjsua_msg_data(cPtr, false);
  }

  public synchronized static int create() {
    return pjsuaJNI.create();
  }

  public synchronized static int start() {
    return pjsuaJNI.start();
  }

  public synchronized static pjsua_state get_state() {
    return pjsua_state.swigToEnum(pjsuaJNI.get_state());
  }

  public synchronized static int handle_events(long msec_timeout) {
    return pjsuaJNI.handle_events(msec_timeout);
  }

  public synchronized static int register_worker_thread(String name) {
    return pjsuaJNI.register_worker_thread(name);
  }

  public synchronized static void stop_worker_threads() {
    pjsuaJNI.stop_worker_threads();
  }

  public synchronized static pj_pool_t pool_create(String name, long init_size, long increment) {
    long cPtr = pjsuaJNI.pool_create(name, init_size, increment);
    return (cPtr == 0) ? null : new pj_pool_t(cPtr, false);
  }

  public synchronized static int reconfigure_logging(pjsua_logging_config c) {
    return pjsuaJNI.reconfigure_logging(pjsua_logging_config.getCPtr(c), c);
  }

  public synchronized static SWIGTYPE_p_pjsip_endpoint get_pjsip_endpt() {
    long cPtr = pjsuaJNI.get_pjsip_endpt();
    return (cPtr == 0) ? null : new SWIGTYPE_p_pjsip_endpoint(cPtr, false);
  }

  public synchronized static SWIGTYPE_p_pjmedia_endpt get_pjmedia_endpt() {
    long cPtr = pjsuaJNI.get_pjmedia_endpt();
    return (cPtr == 0) ? null : new SWIGTYPE_p_pjmedia_endpt(cPtr, false);
  }

  public synchronized static SWIGTYPE_p_pj_pool_factory get_pool_factory() {
    long cPtr = pjsuaJNI.get_pool_factory();
    return (cPtr == 0) ? null : new SWIGTYPE_p_pj_pool_factory(cPtr, false);
  }

  public synchronized static int detect_nat_type() {
    return pjsuaJNI.detect_nat_type();
  }

  public synchronized static int get_nat_type(int[] type) {
    return pjsuaJNI.get_nat_type(type);
  }

  public synchronized static int resolve_stun_servers(long count, pj_str_t[] srv, int wait, byte[] token, SWIGTYPE_p_f_p_q_const__pj_stun_resolve_result__void cb) {
    return pjsuaJNI.resolve_stun_servers(count, pj_str_t.cArrayUnwrap(srv), wait, token, SWIGTYPE_p_f_p_q_const__pj_stun_resolve_result__void.getCPtr(cb));
  }

  public synchronized static int cancel_stun_resolution(byte[] token, int notify_cb) {
    return pjsuaJNI.cancel_stun_resolution(token, notify_cb);
  }

  public synchronized static int verify_sip_url(String url) {
    return pjsuaJNI.verify_sip_url(url);
  }

  public synchronized static int verify_url(String url) {
    return pjsuaJNI.verify_url(url);
  }

  public synchronized static int schedule_timer(SWIGTYPE_p_pj_timer_entry entry, pj_time_val delay) {
    return pjsuaJNI.schedule_timer(SWIGTYPE_p_pj_timer_entry.getCPtr(entry), pj_time_val.getCPtr(delay), delay);
  }

  public static int pjsua_schedule_timer2(SWIGTYPE_p_f_p_void__void cb, byte[] user_data, long msec_delay) {
    return pjsuaJNI.pjsua_schedule_timer2(SWIGTYPE_p_f_p_void__void.getCPtr(cb), user_data, msec_delay);
  }

  public synchronized static void cancel_timer(SWIGTYPE_p_pj_timer_entry entry) {
    pjsuaJNI.cancel_timer(SWIGTYPE_p_pj_timer_entry.getCPtr(entry));
  }

  public synchronized static void perror(String sender, String title, int status) {
    pjsuaJNI.perror(sender, title, status);
  }

  public synchronized static void dump(int detail) {
    pjsuaJNI.dump(detail);
  }

  public synchronized static void transport_config_default(pjsua_transport_config cfg) {
    pjsuaJNI.transport_config_default(pjsua_transport_config.getCPtr(cfg), cfg);
  }

  public synchronized static void transport_config_dup(pj_pool_t pool, pjsua_transport_config dst, pjsua_transport_config src) {
    pjsuaJNI.transport_config_dup(pj_pool_t.getCPtr(pool), pool, pjsua_transport_config.getCPtr(dst), dst, pjsua_transport_config.getCPtr(src), src);
  }

  public synchronized static int transport_create(pjsip_transport_type_e type, pjsua_transport_config cfg, int[] p_id) {
    return pjsuaJNI.transport_create(type.swigValue(), pjsua_transport_config.getCPtr(cfg), cfg, p_id);
  }

  public synchronized static int transport_register(SWIGTYPE_p_pjsip_transport tp, int[] p_id) {
    return pjsuaJNI.transport_register(SWIGTYPE_p_pjsip_transport.getCPtr(tp), p_id);
  }

  public synchronized static int enum_transports(int[] id, long[] count) {
    return pjsuaJNI.enum_transports(id, count);
  }

  public synchronized static int transport_get_info(int id, pjsua_transport_info info) {
    return pjsuaJNI.transport_get_info(id, pjsua_transport_info.getCPtr(info), info);
  }

  public synchronized static int transport_set_enable(int id, int enabled) {
    return pjsuaJNI.transport_set_enable(id, enabled);
  }

  public synchronized static int transport_close(int id, int force) {
    return pjsuaJNI.transport_close(id, force);
  }

  public synchronized static void ice_config_from_media_config(pj_pool_t pool, pjsua_ice_config dst, pjsua_media_config src) {
    pjsuaJNI.ice_config_from_media_config(pj_pool_t.getCPtr(pool), pool, pjsua_ice_config.getCPtr(dst), dst, pjsua_media_config.getCPtr(src), src);
  }

  public synchronized static void ice_config_dup(pj_pool_t pool, pjsua_ice_config dst, pjsua_ice_config src) {
    pjsuaJNI.ice_config_dup(pj_pool_t.getCPtr(pool), pool, pjsua_ice_config.getCPtr(dst), dst, pjsua_ice_config.getCPtr(src), src);
  }

  public synchronized static void turn_config_from_media_config(pj_pool_t pool, pjsua_turn_config dst, pjsua_media_config src) {
    pjsuaJNI.turn_config_from_media_config(pj_pool_t.getCPtr(pool), pool, pjsua_turn_config.getCPtr(dst), dst, pjsua_media_config.getCPtr(src), src);
  }

  public synchronized static void turn_config_dup(pj_pool_t pool, pjsua_turn_config dst, pjsua_turn_config src) {
    pjsuaJNI.turn_config_dup(pj_pool_t.getCPtr(pool), pool, pjsua_turn_config.getCPtr(dst), dst, pjsua_turn_config.getCPtr(src), src);
  }

  public synchronized static void acc_config_default(pjsua_acc_config cfg) {
    pjsuaJNI.acc_config_default(pjsua_acc_config.getCPtr(cfg), cfg);
  }

  public synchronized static void acc_config_dup(pj_pool_t pool, pjsua_acc_config dst, pjsua_acc_config src) {
    pjsuaJNI.acc_config_dup(pj_pool_t.getCPtr(pool), pool, pjsua_acc_config.getCPtr(dst), dst, pjsua_acc_config.getCPtr(src), src);
  }

  public synchronized static long acc_get_count() {
    return pjsuaJNI.acc_get_count();
  }

  public synchronized static int acc_is_valid(int acc_id) {
    return pjsuaJNI.acc_is_valid(acc_id);
  }

  public synchronized static int acc_set_default(int acc_id) {
    return pjsuaJNI.acc_set_default(acc_id);
  }

  public synchronized static int acc_get_default() {
    return pjsuaJNI.acc_get_default();
  }

  public synchronized static int acc_add(pjsua_acc_config acc_cfg, int is_default, int[] p_acc_id) {
    return pjsuaJNI.acc_add(pjsua_acc_config.getCPtr(acc_cfg), acc_cfg, is_default, p_acc_id);
  }

  public synchronized static int acc_add_local(int tid, int is_default, int[] p_acc_id) {
    return pjsuaJNI.acc_add_local(tid, is_default, p_acc_id);
  }

  public synchronized static int acc_set_user_data(int acc_id, byte[] user_data) {
    return pjsuaJNI.acc_set_user_data(acc_id, user_data);
  }

  public synchronized static byte[] acc_get_user_data(int acc_id) {
	return pjsuaJNI.acc_get_user_data(acc_id);
}

  public synchronized static int acc_del(int acc_id) {
    return pjsuaJNI.acc_del(acc_id);
  }

  public synchronized static int acc_get_config(int acc_id, pj_pool_t pool, pjsua_acc_config acc_cfg) {
    return pjsuaJNI.acc_get_config(acc_id, pj_pool_t.getCPtr(pool), pool, pjsua_acc_config.getCPtr(acc_cfg), acc_cfg);
  }

  public synchronized static int acc_modify(int acc_id, pjsua_acc_config acc_cfg) {
    return pjsuaJNI.acc_modify(acc_id, pjsua_acc_config.getCPtr(acc_cfg), acc_cfg);
  }

  public synchronized static int acc_set_online_status(int acc_id, int is_online) {
    return pjsuaJNI.acc_set_online_status(acc_id, is_online);
  }

  public synchronized static int acc_set_online_status2(int acc_id, int is_online, pjrpid_element pr) {
    return pjsuaJNI.acc_set_online_status2(acc_id, is_online, pjrpid_element.getCPtr(pr), pr);
  }

  public synchronized static int acc_set_registration(int acc_id, int renew) {
    return pjsuaJNI.acc_set_registration(acc_id, renew);
  }

  public synchronized static int acc_get_info(int acc_id, pjsua_acc_info info) {
    return pjsuaJNI.acc_get_info(acc_id, pjsua_acc_info.getCPtr(info), info);
  }

  public synchronized static int enum_accs(int[] ids, long[] count) {
    return pjsuaJNI.enum_accs(ids, count);
  }

  public synchronized static int acc_enum_info(pjsua_acc_info info, long[] count) {
    return pjsuaJNI.acc_enum_info(pjsua_acc_info.getCPtr(info), info, count);
  }

  public synchronized static int acc_find_for_outgoing(pj_str_t url) {
    return pjsuaJNI.acc_find_for_outgoing(pj_str_t.getCPtr(url), url);
  }

  public synchronized static int acc_find_for_incoming(SWIGTYPE_p_pjsip_rx_data rdata) {
    return pjsuaJNI.acc_find_for_incoming(SWIGTYPE_p_pjsip_rx_data.getCPtr(rdata));
  }

  public synchronized static int acc_create_request(int acc_id, SWIGTYPE_p_pjsip_method method, pj_str_t target, SWIGTYPE_p_p_pjsip_tx_data p_tdata) {
    return pjsuaJNI.acc_create_request(acc_id, SWIGTYPE_p_pjsip_method.getCPtr(method), pj_str_t.getCPtr(target), target, SWIGTYPE_p_p_pjsip_tx_data.getCPtr(p_tdata));
  }

  public synchronized static int acc_create_uac_contact(pj_pool_t pool, pj_str_t contact, int acc_id, pj_str_t uri) {
    return pjsuaJNI.acc_create_uac_contact(pj_pool_t.getCPtr(pool), pool, pj_str_t.getCPtr(contact), contact, acc_id, pj_str_t.getCPtr(uri), uri);
  }

  public synchronized static int acc_create_uas_contact(pj_pool_t pool, pj_str_t contact, int acc_id, SWIGTYPE_p_pjsip_rx_data rdata) {
    return pjsuaJNI.acc_create_uas_contact(pj_pool_t.getCPtr(pool), pool, pj_str_t.getCPtr(contact), contact, acc_id, SWIGTYPE_p_pjsip_rx_data.getCPtr(rdata));
  }

  public synchronized static int acc_set_transport(int acc_id, int tp_id) {
    return pjsuaJNI.acc_set_transport(acc_id, tp_id);
  }

  public synchronized static void call_setting_default(pjsua_call_setting opt) {
    pjsuaJNI.call_setting_default(pjsua_call_setting.getCPtr(opt), opt);
  }

  public synchronized static void call_vid_strm_op_param_default(pjsua_call_vid_strm_op_param param) {
    pjsuaJNI.call_vid_strm_op_param_default(pjsua_call_vid_strm_op_param.getCPtr(param), param);
  }

  public synchronized static long call_get_max_count() {
    return pjsuaJNI.call_get_max_count();
  }

  public synchronized static long call_get_count() {
    return pjsuaJNI.call_get_count();
  }

  public synchronized static int enum_calls(int[] ids, long[] count) {
    return pjsuaJNI.enum_calls(ids, count);
  }

  public synchronized static int call_make_call(int acc_id, pj_str_t dst_uri, pjsua_call_setting opt, byte[] user_data, pjsua_msg_data msg_data, int[] p_call_id) {
    return pjsuaJNI.call_make_call(acc_id, pj_str_t.getCPtr(dst_uri), dst_uri, pjsua_call_setting.getCPtr(opt), opt, user_data, pjsua_msg_data.getCPtr(msg_data), msg_data, p_call_id);
  }

  public synchronized static int call_is_active(int call_id) {
    return pjsuaJNI.call_is_active(call_id);
  }

  public synchronized static int call_has_media(int call_id) {
    return pjsuaJNI.call_has_media(call_id);
  }

  public synchronized static int call_get_conf_port(int call_id) {
    return pjsuaJNI.call_get_conf_port(call_id);
  }

  public synchronized static int call_get_info(int call_id, pjsua_call_info info) {
    return pjsuaJNI.call_get_info(call_id, pjsua_call_info.getCPtr(info), info);
  }

  public synchronized static SWIGTYPE_p_pjsip_dialog_cap_status call_remote_has_cap(int call_id, int htype, pj_str_t hname, pj_str_t token) {
    return new SWIGTYPE_p_pjsip_dialog_cap_status(pjsuaJNI.call_remote_has_cap(call_id, htype, pj_str_t.getCPtr(hname), hname, pj_str_t.getCPtr(token), token), true);
  }

  public synchronized static int call_set_user_data(int call_id, byte[] user_data) {
    return pjsuaJNI.call_set_user_data(call_id, user_data);
  }

  public synchronized static byte[] call_get_user_data(int call_id) {
	return pjsuaJNI.call_get_user_data(call_id);
}

  public synchronized static int call_get_rem_nat_type(int call_id, int[] p_type) {
    return pjsuaJNI.call_get_rem_nat_type(call_id, p_type);
  }

  public synchronized static int call_answer(int call_id, long code, pj_str_t reason, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_answer(call_id, code, pj_str_t.getCPtr(reason), reason, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static int call_answer2(int call_id, pjsua_call_setting opt, long code, pj_str_t reason, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_answer2(call_id, pjsua_call_setting.getCPtr(opt), opt, code, pj_str_t.getCPtr(reason), reason, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static int call_hangup(int call_id, long code, pj_str_t reason, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_hangup(call_id, code, pj_str_t.getCPtr(reason), reason, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static int call_process_redirect(int call_id, pjsip_redirect_op cmd) {
    return pjsuaJNI.call_process_redirect(call_id, cmd.swigValue());
  }

  public synchronized static int call_set_hold(int call_id, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_set_hold(call_id, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static int call_set_hold2(int call_id, long options, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_set_hold2(call_id, options, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static int call_reinvite(int call_id, long options, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_reinvite(call_id, options, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static int call_reinvite2(int call_id, pjsua_call_setting opt, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_reinvite2(call_id, pjsua_call_setting.getCPtr(opt), opt, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static int call_update(int call_id, long options, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_update(call_id, options, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static int call_update2(int call_id, pjsua_call_setting opt, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_update2(call_id, pjsua_call_setting.getCPtr(opt), opt, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static int call_xfer(int call_id, pj_str_t dest, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_xfer(call_id, pj_str_t.getCPtr(dest), dest, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static int call_xfer_replaces(int call_id, int dest_call_id, long options, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_xfer_replaces(call_id, dest_call_id, options, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static int call_dial_dtmf(int call_id, pj_str_t digits) {
    return pjsuaJNI.call_dial_dtmf(call_id, pj_str_t.getCPtr(digits), digits);
  }

  public synchronized static int call_send_im(int call_id, pj_str_t mime_type, pj_str_t content, pjsua_msg_data msg_data, byte[] user_data) {
    return pjsuaJNI.call_send_im(call_id, pj_str_t.getCPtr(mime_type), mime_type, pj_str_t.getCPtr(content), content, pjsua_msg_data.getCPtr(msg_data), msg_data, user_data);
  }

  public synchronized static int call_send_typing_ind(int call_id, int is_typing, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_send_typing_ind(call_id, is_typing, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static int call_send_request(int call_id, pj_str_t method, pjsua_msg_data msg_data) {
    return pjsuaJNI.call_send_request(call_id, pj_str_t.getCPtr(method), method, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static void call_hangup_all() {
    pjsuaJNI.call_hangup_all();
  }

  public synchronized static int call_dump(int call_id, int with_media, String buffer, long maxlen, String indent) {
    return pjsuaJNI.call_dump__SWIG_0(call_id, with_media, buffer, maxlen, indent);
  }

  public synchronized static int call_get_vid_stream_idx(int call_id) {
    return pjsuaJNI.call_get_vid_stream_idx(call_id);
  }

  public synchronized static int call_vid_stream_is_running(int call_id, int med_idx, pjmedia_dir dir) {
    return pjsuaJNI.call_vid_stream_is_running(call_id, med_idx, dir.swigValue());
  }

  public synchronized static int call_set_vid_strm(int call_id, pjsua_call_vid_strm_op op, pjsua_call_vid_strm_op_param param) {
    return pjsuaJNI.call_set_vid_strm(call_id, op.swigValue(), pjsua_call_vid_strm_op_param.getCPtr(param), param);
  }

  public synchronized static int call_get_stream_info(int call_id, long med_idx, pjsua_stream_info psi) {
    return pjsuaJNI.call_get_stream_info(call_id, med_idx, pjsua_stream_info.getCPtr(psi), psi);
  }

  public synchronized static int call_get_stream_stat(int call_id, long med_idx, pjsua_stream_stat stat) {
    return pjsuaJNI.call_get_stream_stat(call_id, med_idx, pjsua_stream_stat.getCPtr(stat), stat);
  }

  public synchronized static int call_get_med_transport_info(int call_id, long med_idx, SWIGTYPE_p_pjmedia_transport_info t) {
    return pjsuaJNI.call_get_med_transport_info(call_id, med_idx, SWIGTYPE_p_pjmedia_transport_info.getCPtr(t));
  }

  public synchronized static void buddy_config_default(pjsua_buddy_config cfg) {
    pjsuaJNI.buddy_config_default(pjsua_buddy_config.getCPtr(cfg), cfg);
  }

  public synchronized static long get_buddy_count() {
    return pjsuaJNI.get_buddy_count();
  }

  public synchronized static int buddy_is_valid(int buddy_id) {
    return pjsuaJNI.buddy_is_valid(buddy_id);
  }

  public synchronized static int enum_buddies(int[] ids, long[] count) {
    return pjsuaJNI.enum_buddies(ids, count);
  }

  public synchronized static int buddy_find(pj_str_t uri) {
    return pjsuaJNI.buddy_find(pj_str_t.getCPtr(uri), uri);
  }

  public synchronized static int buddy_get_info(int buddy_id, pjsua_buddy_info info) {
    return pjsuaJNI.buddy_get_info(buddy_id, pjsua_buddy_info.getCPtr(info), info);
  }

  public synchronized static int buddy_set_user_data(int buddy_id, byte[] user_data) {
    return pjsuaJNI.buddy_set_user_data(buddy_id, user_data);
  }

  public synchronized static byte[] buddy_get_user_data(int buddy_id) {
	return pjsuaJNI.buddy_get_user_data(buddy_id);
}

  public synchronized static int buddy_add(pjsua_buddy_config buddy_cfg, int[] p_buddy_id) {
    return pjsuaJNI.buddy_add(pjsua_buddy_config.getCPtr(buddy_cfg), buddy_cfg, p_buddy_id);
  }

  public synchronized static int buddy_del(int buddy_id) {
    return pjsuaJNI.buddy_del(buddy_id);
  }

  public synchronized static int buddy_subscribe_pres(int buddy_id, int subscribe) {
    return pjsuaJNI.buddy_subscribe_pres(buddy_id, subscribe);
  }

  public synchronized static int buddy_update_pres(int buddy_id) {
    return pjsuaJNI.buddy_update_pres(buddy_id);
  }

  public synchronized static int pres_notify(int acc_id, SWIGTYPE_p_pjsua_srv_pres srv_pres, SWIGTYPE_p_pjsip_evsub_state state, pj_str_t state_str, pj_str_t reason, int with_body, pjsua_msg_data msg_data) {
    return pjsuaJNI.pres_notify(acc_id, SWIGTYPE_p_pjsua_srv_pres.getCPtr(srv_pres), SWIGTYPE_p_pjsip_evsub_state.getCPtr(state), pj_str_t.getCPtr(state_str), state_str, pj_str_t.getCPtr(reason), reason, with_body, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static void pres_dump(int verbose) {
    pjsuaJNI.pres_dump(verbose);
  }

  public static SWIGTYPE_p_pjsip_method getPjsip_message_method() {
    return new SWIGTYPE_p_pjsip_method(pjsuaJNI.pjsip_message_method_get(), true);
  }

  public static SWIGTYPE_p_pjsip_method getPjsip_info_method() {
    return new SWIGTYPE_p_pjsip_method(pjsuaJNI.pjsip_info_method_get(), true);
  }

  public synchronized static int im_send(int acc_id, pj_str_t to, pj_str_t mime_type, pj_str_t content, pjsua_msg_data msg_data, byte[] user_data) {
    return pjsuaJNI.im_send(acc_id, pj_str_t.getCPtr(to), to, pj_str_t.getCPtr(mime_type), mime_type, pj_str_t.getCPtr(content), content, pjsua_msg_data.getCPtr(msg_data), msg_data, user_data);
  }

  public synchronized static int im_typing(int acc_id, pj_str_t to, int is_typing, pjsua_msg_data msg_data) {
    return pjsuaJNI.im_typing(acc_id, pj_str_t.getCPtr(to), to, is_typing, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public synchronized static void media_config_default(pjsua_media_config cfg) {
    pjsuaJNI.media_config_default(pjsua_media_config.getCPtr(cfg), cfg);
  }

  public synchronized static long conf_get_max_ports() {
    return pjsuaJNI.conf_get_max_ports();
  }

  public synchronized static long conf_get_active_ports() {
    return pjsuaJNI.conf_get_active_ports();
  }

  public synchronized static int enum_conf_ports(int[] id, long[] count) {
    return pjsuaJNI.enum_conf_ports(id, count);
  }

  public synchronized static int conf_get_port_info(int port_id, pjsua_conf_port_info info) {
    return pjsuaJNI.conf_get_port_info(port_id, pjsua_conf_port_info.getCPtr(info), info);
  }

  public synchronized static int conf_add_port(pj_pool_t pool, pjmedia_port port, int[] p_id) {
    return pjsuaJNI.conf_add_port(pj_pool_t.getCPtr(pool), pool, pjmedia_port.getCPtr(port), port, p_id);
  }

  public synchronized static int conf_remove_port(int port_id) {
    return pjsuaJNI.conf_remove_port(port_id);
  }

  public synchronized static int conf_connect(int source, int sink) {
    return pjsuaJNI.conf_connect(source, sink);
  }

  public synchronized static int conf_disconnect(int source, int sink) {
    return pjsuaJNI.conf_disconnect(source, sink);
  }

  public synchronized static int conf_adjust_tx_level(int slot, float level) {
    return pjsuaJNI.conf_adjust_tx_level(slot, level);
  }

  public synchronized static int conf_adjust_rx_level(int slot, float level) {
    return pjsuaJNI.conf_adjust_rx_level(slot, level);
  }

  public synchronized static int conf_get_signal_level(int slot, long[] tx_level, long[] rx_level) {
    return pjsuaJNI.conf_get_signal_level(slot, tx_level, rx_level);
  }

  public synchronized static int player_create(pj_str_t filename, long options, int[] p_id) {
    return pjsuaJNI.player_create(pj_str_t.getCPtr(filename), filename, options, p_id);
  }

  public synchronized static int playlist_create(pj_str_t[] file_names, long file_count, pj_str_t label, long options, int[] p_id) {
    return pjsuaJNI.playlist_create(pj_str_t.cArrayUnwrap(file_names), file_count, pj_str_t.getCPtr(label), label, options, p_id);
  }

  public synchronized static int player_get_conf_port(int id) {
    return pjsuaJNI.player_get_conf_port(id);
  }

  public synchronized static int player_get_port(int id, SWIGTYPE_p_p_pjmedia_port p_port) {
    return pjsuaJNI.player_get_port(id, SWIGTYPE_p_p_pjmedia_port.getCPtr(p_port));
  }

  public synchronized static int player_get_info(int id, SWIGTYPE_p_pjmedia_wav_player_info info) {
    return pjsuaJNI.player_get_info(id, SWIGTYPE_p_pjmedia_wav_player_info.getCPtr(info));
  }

  public synchronized static int player_get_pos(int id) {
    return pjsuaJNI.player_get_pos(id);
  }

  public synchronized static int player_set_pos(int id, long samples) {
    return pjsuaJNI.player_set_pos(id, samples);
  }

  public synchronized static int player_destroy(int id) {
    return pjsuaJNI.player_destroy(id);
  }

  public synchronized static int recorder_create(pj_str_t filename, long enc_type, byte[] enc_param, int max_size, long options, int[] p_id) {
    return pjsuaJNI.recorder_create(pj_str_t.getCPtr(filename), filename, enc_type, enc_param, max_size, options, p_id);
  }

  public synchronized static int recorder_get_conf_port(int id) {
    return pjsuaJNI.recorder_get_conf_port(id);
  }

  public synchronized static int recorder_get_port(int id, SWIGTYPE_p_p_pjmedia_port p_port) {
    return pjsuaJNI.recorder_get_port(id, SWIGTYPE_p_p_pjmedia_port.getCPtr(p_port));
  }

  public synchronized static int recorder_destroy(int id) {
    return pjsuaJNI.recorder_destroy(id);
  }

  public synchronized static int enum_aud_devs(SWIGTYPE_p_pjmedia_aud_dev_info info, long[] count) {
    return pjsuaJNI.enum_aud_devs(SWIGTYPE_p_pjmedia_aud_dev_info.getCPtr(info), count);
  }

  public synchronized static int enum_snd_devs(pjmedia_snd_dev_info info, long[] count) {
    return pjsuaJNI.enum_snd_devs(pjmedia_snd_dev_info.getCPtr(info), info, count);
  }

  public synchronized static int get_snd_dev(int[] capture_dev, int[] playback_dev) {
    return pjsuaJNI.get_snd_dev(capture_dev, playback_dev);
  }

  public synchronized static int set_snd_dev(int capture_dev, int playback_dev) {
    return pjsuaJNI.set_snd_dev(capture_dev, playback_dev);
  }

  public synchronized static int set_null_snd_dev() {
    return pjsuaJNI.set_null_snd_dev();
  }

  public synchronized static pjmedia_port set_no_snd_dev() {
    long cPtr = pjsuaJNI.set_no_snd_dev();
    return (cPtr == 0) ? null : new pjmedia_port(cPtr, false);
  }

  public synchronized static int set_ec(long tail_ms, long options) {
    return pjsuaJNI.set_ec(tail_ms, options);
  }

  public synchronized static int get_ec_tail(SWIGTYPE_p_unsigned_int p_tail_ms) {
    return pjsuaJNI.get_ec_tail(SWIGTYPE_p_unsigned_int.getCPtr(p_tail_ms));
  }

  public synchronized static int snd_is_active() {
    return pjsuaJNI.snd_is_active();
  }

  public synchronized static int snd_set_setting(SWIGTYPE_p_pjmedia_aud_dev_cap cap, byte[] pval, int keep) {
    return pjsuaJNI.snd_set_setting(SWIGTYPE_p_pjmedia_aud_dev_cap.getCPtr(cap), pval, keep);
  }

  public synchronized static int snd_get_setting(SWIGTYPE_p_pjmedia_aud_dev_cap cap, byte[] pval) {
    return pjsuaJNI.snd_get_setting(SWIGTYPE_p_pjmedia_aud_dev_cap.getCPtr(cap), pval);
  }

  public synchronized static int enum_codecs(pjsua_codec_info id, long[] count) {
    return pjsuaJNI.enum_codecs(pjsua_codec_info.getCPtr(id), id, count);
  }

  public synchronized static int codec_set_priority(pj_str_t codec_id, short priority) {
    return pjsuaJNI.codec_set_priority(pj_str_t.getCPtr(codec_id), codec_id, priority);
  }

  public synchronized static int codec_get_param(pj_str_t codec_id, SWIGTYPE_p_pjmedia_codec_param param) {
    return pjsuaJNI.codec_get_param(pj_str_t.getCPtr(codec_id), codec_id, SWIGTYPE_p_pjmedia_codec_param.getCPtr(param));
  }

  public synchronized static int codec_set_param(pj_str_t codec_id, SWIGTYPE_p_pjmedia_codec_param param) {
    return pjsuaJNI.codec_set_param(pj_str_t.getCPtr(codec_id), codec_id, SWIGTYPE_p_pjmedia_codec_param.getCPtr(param));
  }

  public synchronized static long vid_dev_count() {
    return pjsuaJNI.vid_dev_count();
  }

  public synchronized static int vid_dev_get_info(SWIGTYPE_p_pjmedia_vid_dev_index id, SWIGTYPE_p_pjmedia_vid_dev_info vdi) {
    return pjsuaJNI.vid_dev_get_info(SWIGTYPE_p_pjmedia_vid_dev_index.getCPtr(id), SWIGTYPE_p_pjmedia_vid_dev_info.getCPtr(vdi));
  }

  public synchronized static int vid_enum_devs(SWIGTYPE_p_pjmedia_vid_dev_info info, long[] count) {
    return pjsuaJNI.vid_enum_devs(SWIGTYPE_p_pjmedia_vid_dev_info.getCPtr(info), count);
  }

  public synchronized static void vid_preview_param_default(pjsua_vid_preview_param p) {
    pjsuaJNI.vid_preview_param_default(pjsua_vid_preview_param.getCPtr(p), p);
  }

  public synchronized static int vid_preview_has_native(SWIGTYPE_p_pjmedia_vid_dev_index id) {
    return pjsuaJNI.vid_preview_has_native(SWIGTYPE_p_pjmedia_vid_dev_index.getCPtr(id));
  }

  public synchronized static int vid_preview_start(SWIGTYPE_p_pjmedia_vid_dev_index id, pjsua_vid_preview_param p) {
    return pjsuaJNI.vid_preview_start(SWIGTYPE_p_pjmedia_vid_dev_index.getCPtr(id), pjsua_vid_preview_param.getCPtr(p), p);
  }

  public synchronized static int vid_preview_get_win(SWIGTYPE_p_pjmedia_vid_dev_index id) {
    return pjsuaJNI.vid_preview_get_win(SWIGTYPE_p_pjmedia_vid_dev_index.getCPtr(id));
  }

  public synchronized static int vid_preview_stop(SWIGTYPE_p_pjmedia_vid_dev_index id) {
    return pjsuaJNI.vid_preview_stop(SWIGTYPE_p_pjmedia_vid_dev_index.getCPtr(id));
  }

  public synchronized static int vid_enum_wins(int[] wids, long[] count) {
    return pjsuaJNI.vid_enum_wins(wids, count);
  }

  public synchronized static int vid_win_get_info(int wid, pjsua_vid_win_info wi) {
    return pjsuaJNI.vid_win_get_info(wid, pjsua_vid_win_info.getCPtr(wi), wi);
  }

  public synchronized static int vid_win_set_show(int wid, int show) {
    return pjsuaJNI.vid_win_set_show(wid, show);
  }

  public synchronized static int vid_win_set_pos(int wid, SWIGTYPE_p_pjmedia_coord pos) {
    return pjsuaJNI.vid_win_set_pos(wid, SWIGTYPE_p_pjmedia_coord.getCPtr(pos));
  }

  public synchronized static int vid_win_set_size(int wid, SWIGTYPE_p_pjmedia_rect_size size) {
    return pjsuaJNI.vid_win_set_size(wid, SWIGTYPE_p_pjmedia_rect_size.getCPtr(size));
  }

  public synchronized static int vid_win_rotate(int wid, int angle) {
    return pjsuaJNI.vid_win_rotate(wid, angle);
  }

  public synchronized static int vid_enum_codecs(pjsua_codec_info id, long[] count) {
    return pjsuaJNI.vid_enum_codecs(pjsua_codec_info.getCPtr(id), id, count);
  }

  public synchronized static int vid_codec_set_priority(pj_str_t codec_id, short priority) {
    return pjsuaJNI.vid_codec_set_priority(pj_str_t.getCPtr(codec_id), codec_id, priority);
  }

  public synchronized static int vid_codec_get_param(pj_str_t codec_id, SWIGTYPE_p_pjmedia_vid_codec_param param) {
    return pjsuaJNI.vid_codec_get_param(pj_str_t.getCPtr(codec_id), codec_id, SWIGTYPE_p_pjmedia_vid_codec_param.getCPtr(param));
  }

  public synchronized static int vid_codec_set_param(pj_str_t codec_id, SWIGTYPE_p_pjmedia_vid_codec_param param) {
    return pjsuaJNI.vid_codec_set_param(pj_str_t.getCPtr(codec_id), codec_id, SWIGTYPE_p_pjmedia_vid_codec_param.getCPtr(param));
  }

  public static int send_dtmf_info(int current_call, pj_str_t digits) {
    return pjsuaJNI.send_dtmf_info(current_call, pj_str_t.getCPtr(digits), digits);
  }

  public static pj_str_t call_dump(int call_id, int with_media, String indent) {
    return new pj_str_t(pjsuaJNI.call_dump__SWIG_1(call_id, with_media, indent), true);
  }

  public static pj_str_t call_secure_media_info(int call_id) {
    return new pj_str_t(pjsuaJNI.call_secure_media_info(call_id), true);
  }

  public static int call_secure_sig_level(int call_id) {
    return pjsuaJNI.call_secure_sig_level(call_id);
  }

  public static pj_str_t get_error_message(int status) {
    return new pj_str_t(pjsuaJNI.get_error_message(status), true);
  }

  public static int get_event_status_code(pjsip_event e) {
    return pjsuaJNI.get_event_status_code(pjsip_event.getCPtr(e), e);
  }

  public static int get_event_reason_code(pjsip_event e) {
    return pjsuaJNI.get_event_reason_code(pjsip_event.getCPtr(e), e);
  }

  public static void csipsimple_config_default(csipsimple_config css_cfg) {
    pjsuaJNI.csipsimple_config_default(csipsimple_config.getCPtr(css_cfg), css_cfg);
  }

  public static void csipsimple_acc_config_default(csipsimple_acc_config css_acc_cfg) {
    pjsuaJNI.csipsimple_acc_config_default(csipsimple_acc_config.getCPtr(css_acc_cfg), css_acc_cfg);
  }

  public static int csipsimple_init(pjsua_config ua_cfg, pjsua_logging_config log_cfg, pjsua_media_config media_cfg, csipsimple_config css_cfg, Object context) {
    return pjsuaJNI.csipsimple_init(pjsua_config.getCPtr(ua_cfg), ua_cfg, pjsua_logging_config.getCPtr(log_cfg), log_cfg, pjsua_media_config.getCPtr(media_cfg), media_cfg, csipsimple_config.getCPtr(css_cfg), css_cfg, context);
  }

  public static int csipsimple_destroy(long flags) {
    return pjsuaJNI.csipsimple_destroy(flags);
  }

  public static int csipsimple_set_acc_user_data(int acc_id, csipsimple_acc_config css_acc_cfg) {
    return pjsuaJNI.csipsimple_set_acc_user_data(acc_id, csipsimple_acc_config.getCPtr(css_acc_cfg), css_acc_cfg);
  }

  public static int csipsimple_init_acc_msg_data(pj_pool_t pool, int acc_id, pjsua_msg_data msg_data) {
    return pjsuaJNI.csipsimple_init_acc_msg_data(pj_pool_t.getCPtr(pool), pool, acc_id, pjsua_msg_data.getCPtr(msg_data), msg_data);
  }

  public static int csipsimple_msg_data_add_string_hdr(pj_pool_t pool, pjsua_msg_data msg_data, pj_str_t hdr_name, pj_str_t hdr_value) {
    return pjsuaJNI.csipsimple_msg_data_add_string_hdr(pj_pool_t.getCPtr(pool), pool, pjsua_msg_data.getCPtr(msg_data), msg_data, pj_str_t.getCPtr(hdr_name), hdr_name, pj_str_t.getCPtr(hdr_value), hdr_value);
  }

  public static int pj_timer_fire(int entry_id) {
    return pjsuaJNI.pj_timer_fire(entry_id);
  }

  public static int update_transport(pj_str_t new_ip_addr) {
    return pjsuaJNI.update_transport(pj_str_t.getCPtr(new_ip_addr), new_ip_addr);
  }

  public static int vid_set_android_renderer(int call_id, Object window) {
    return pjsuaJNI.vid_set_android_renderer(call_id, window);
  }

  public static int vid_set_android_capturer(Object window) {
    return pjsuaJNI.vid_set_android_capturer(window);
  }

  public static int set_turn_credentials(pj_str_t username, pj_str_t password, pj_str_t realm, SWIGTYPE_p_pj_stun_auth_cred turn_auth_cred) {
    return pjsuaJNI.set_turn_credentials(pj_str_t.getCPtr(username), username, pj_str_t.getCPtr(password), password, pj_str_t.getCPtr(realm), realm, SWIGTYPE_p_pj_stun_auth_cred.getCPtr(turn_auth_cred));
  }

  public static long get_rx_data_is_dm365(SWIGTYPE_p_pjsip_rx_data data) {
		return pjsuaJNI.get_rx_data_is_dm365(SWIGTYPE_p_pjsip_rx_data
				.getCPtr(data));
	}
  
  public static pj_str_t get_rx_data_header(pj_str_t name, SWIGTYPE_p_pjsip_rx_data data) {
    return new pj_str_t(pjsuaJNI.get_rx_data_header(pj_str_t.getCPtr(name), name, SWIGTYPE_p_pjsip_rx_data.getCPtr(data)), true);
  }

  public static void css_on_call_state(int call_id, pjsip_event e) {
    pjsuaJNI.css_on_call_state(call_id, pjsip_event.getCPtr(e), e);
  }

  public static void css_on_call_media_state(int call_id) {
    pjsuaJNI.css_on_call_media_state(call_id);
  }

  public static void jzrtp_SASVerified(int call_id) {
    pjsuaJNI.jzrtp_SASVerified(call_id);
  }

  public static void jzrtp_SASRevoked(int call_id) {
    pjsuaJNI.jzrtp_SASRevoked(call_id);
  }

  public static zrtp_state_info jzrtp_getInfoFromCall(int call_id) {
    return new zrtp_state_info(pjsuaJNI.jzrtp_getInfoFromCall(call_id), true);
  }

  public static int codecs_get_nbr() {
    return pjsuaJNI.codecs_get_nbr();
  }

  public static pj_str_t codecs_get_id(int codec_id) {
    return new pj_str_t(pjsuaJNI.codecs_get_id(codec_id), true);
  }

  public static int codecs_vid_get_nbr() {
    return pjsuaJNI.codecs_vid_get_nbr();
  }

  public static pj_str_t codecs_vid_get_id(int codec_id) {
    return new pj_str_t(pjsuaJNI.codecs_vid_get_id(codec_id), true);
  }

  public static int codec_set_frames_per_packet(pj_str_t codec_id, int frames_per_packet) {
    return pjsuaJNI.codec_set_frames_per_packet(pj_str_t.getCPtr(codec_id), codec_id, frames_per_packet);
  }

  public static int codec_h264_set_profile(long profile_id, long level_id, long width, long height, long fps, long avg_kbps, long max_kbps) {
    return pjsuaJNI.codec_h264_set_profile(profile_id, level_id, width, height, fps, avg_kbps, max_kbps);
  }

}
