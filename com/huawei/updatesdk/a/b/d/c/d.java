package com.huawei.updatesdk.a.b.d.c;

import vigqyno.C0201;

public class d extends b {
    public static final int ERROR = 0;
    public static final int NETWORK_ERROR = 0;
    public static final int OK = 0;
    public static final int PROGUARD_ERROR = 0;
    public static final int REQ_PARAM_ERROR = 0;
    public static final int RTN_CODE_OK = 0;
    public static final int TIMEOUT = 0;
    private a errCause = a.NORMAL;
    private int httpRespondeCode = 0;
    private String reason;
    private int responseCode = 1;
    private int rtnCode_ = 0;

    public enum a {
        NORMAL,
        NO_NETWORK,
        JSON_ERROR,
        PARAM_ERROR,
        IO_EXCEPTION,
        CONNECT_EXCEPTION,
        UNKNOWN_EXCEPTION,
        NO_PROGUARD
    }

    static {
        C0201.m83(d.class, 552);
    }

    public a a() {
        return this.errCause;
    }

    public void a(int i) {
        this.httpRespondeCode = i;
    }

    public void a(a aVar) {
        this.errCause = aVar;
    }

    public void a(String str) {
        this.reason = str;
    }

    public int b() {
        return this.httpRespondeCode;
    }

    public void b(int i) {
        this.responseCode = i;
    }

    public String c() {
        return this.reason;
    }

    public int d() {
        return this.responseCode;
    }

    public int e() {
        return this.rtnCode_;
    }

    public String toString() {
        return getClass().getName() + C0201.m82(28685) + d() + C0201.m82(28686) + e() + C0201.m82(28687) + a() + C0201.m82(28688);
    }
}
