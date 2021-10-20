package com.dynatrace.android.agent;

import java.net.URLConnection;
import vigqyno.C0201;

/* compiled from: WebReqTag */
public class b0 {
    private int a;
    private g30 b;
    private String c;
    private long d;
    private long e;
    private int f;

    public b0(long j, int i, g30 g30) {
        this(i, g30, b.k, j, Thread.currentThread().getId(), s30.c());
    }

    public static String a(URLConnection uRLConnection) {
        if (uRLConnection == null) {
            return null;
        }
        try {
            return uRLConnection.getRequestProperty(q.h());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String f() {
        return C0201.m82(3561);
    }

    public static b0 g(String str, g30 g30) {
        long j;
        int i;
        if (str != null) {
            boolean z = true;
            if (str.length() >= 1) {
                String[] split = str.split(C0201.m82(3562));
                if (split.length != 9) {
                    return null;
                }
                try {
                    long longValue = Long.valueOf(split[3]).longValue();
                    int indexOf = split[4].indexOf(45);
                    if (indexOf >= 0) {
                        if (g30.e != i30.V2_AGENT_SPLITTING) {
                            return null;
                        }
                        j = Long.valueOf(split[4].substring(0, indexOf)).longValue();
                        i = Integer.parseInt(split[4].substring(indexOf + 1));
                    } else if (g30.e != i30.V1_SERVER_SPLITTING) {
                        return null;
                    } else {
                        j = Long.valueOf(split[4]).longValue();
                        i = -1;
                    }
                    if (g30.b != longValue || g30.c != j || g30.d != i) {
                        z = false;
                    }
                    if (!z) {
                        return null;
                    }
                    return new b0(Integer.valueOf(split[2]).intValue(), g30, split[5], Long.valueOf(split[6]).longValue(), Long.valueOf(split[7]).longValue(), Integer.valueOf(split[8]).intValue());
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public static String i(b0 b0Var) {
        return b0Var == null ? C0201.m82(3563) : b0Var.toString();
    }

    public long b() {
        return this.d;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.a;
    }

    public g30 e() {
        return this.b;
    }

    public boolean h(String str) {
        if (str == null) {
            return false;
        }
        return toString().equals(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(3564));
        sb.append(this.a);
        String r1 = C0201.m82(3565);
        sb.append(r1);
        sb.append(this.b.b);
        sb.append(r1);
        sb.append(this.b.c);
        if (this.b.e == i30.V2_AGENT_SPLITTING) {
            sb.append(C0201.m82(3566));
            sb.append(this.b.d);
        }
        sb.append(r1);
        sb.append(this.c);
        sb.append(r1);
        sb.append(this.d);
        sb.append(r1);
        sb.append(this.e);
        sb.append(r1);
        sb.append(this.f);
        return sb.toString();
    }

    public b0(int i, g30 g30, String str, long j, long j2, int i2) {
        this.a = i;
        this.b = g30;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.f = i2;
    }
}
