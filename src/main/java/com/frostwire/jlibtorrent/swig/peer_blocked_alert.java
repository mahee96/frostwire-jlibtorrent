/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.7
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class peer_blocked_alert extends torrent_alert {
  private transient long swigCPtr;

  protected peer_blocked_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.peer_blocked_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(peer_blocked_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_peer_blocked_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public peer_blocked_alert(stack_allocator alloc, torrent_handle h, address i, int r) {
    this(libtorrent_jni.new_peer_blocked_alert(stack_allocator.getCPtr(alloc), alloc, torrent_handle.getCPtr(h), h, address.getCPtr(i), i, r), true);
  }

  public int type() {
    return libtorrent_jni.peer_blocked_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.peer_blocked_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.peer_blocked_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.peer_blocked_alert_message(swigCPtr, this);
  }

  public void setIp(address value) {
    libtorrent_jni.peer_blocked_alert_ip_set(swigCPtr, this, address.getCPtr(value), value);
  }

  public address getIp() {
    long cPtr = libtorrent_jni.peer_blocked_alert_ip_get(swigCPtr, this);
    return (cPtr == 0) ? null : new address(cPtr, false);
  }

  public void setReason(int value) {
    libtorrent_jni.peer_blocked_alert_reason_set(swigCPtr, this, value);
  }

  public int getReason() {
    return libtorrent_jni.peer_blocked_alert_reason_get(swigCPtr, this);
  }

  public final static int priority = libtorrent_jni.peer_blocked_alert_priority_get();
  public final static int alert_type = libtorrent_jni.peer_blocked_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.peer_blocked_alert_static_category_get();
  public final static class reason_t {
    public final static peer_blocked_alert.reason_t ip_filter = new peer_blocked_alert.reason_t("ip_filter");
    public final static peer_blocked_alert.reason_t port_filter = new peer_blocked_alert.reason_t("port_filter");
    public final static peer_blocked_alert.reason_t i2p_mixed = new peer_blocked_alert.reason_t("i2p_mixed");
    public final static peer_blocked_alert.reason_t privileged_ports = new peer_blocked_alert.reason_t("privileged_ports");
    public final static peer_blocked_alert.reason_t utp_disabled = new peer_blocked_alert.reason_t("utp_disabled");
    public final static peer_blocked_alert.reason_t tcp_disabled = new peer_blocked_alert.reason_t("tcp_disabled");
    public final static peer_blocked_alert.reason_t invalid_local_interface = new peer_blocked_alert.reason_t("invalid_local_interface");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static reason_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + reason_t.class + " with value " + swigValue);
    }

    private reason_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private reason_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private reason_t(String swigName, reason_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static reason_t[] swigValues = { ip_filter, port_filter, i2p_mixed, privileged_ports, utp_disabled, tcp_disabled, invalid_local_interface };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
