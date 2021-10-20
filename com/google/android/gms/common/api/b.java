package com.google.android.gms.common.api;

import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class b extends Exception {
    public final Status a;

    /* JADX WARNING: Illegal instructions before constructor call */
    public b(Status status) {
        super(r3.toString());
        int o = status.o();
        String p = status.p() != null ? status.p() : C0201.m82(2867);
        StringBuilder sb = new StringBuilder(String.valueOf(p).length() + 13);
        sb.append(o);
        sb.append(C0201.m82(2868));
        sb.append(p);
        this.a = status;
    }

    public int a() {
        return this.a.o();
    }
}
