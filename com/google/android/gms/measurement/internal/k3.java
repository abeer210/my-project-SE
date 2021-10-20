package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public final class k3 extends k5 {
    private char c = 0;
    private long d = -1;
    private String e;
    private final m3 f = new m3(this, 6, false, false);
    private final m3 g = new m3(this, 6, true, false);
    private final m3 h = new m3(this, 6, false, true);
    private final m3 i = new m3(this, 5, false, false);
    private final m3 j = new m3(this, 5, true, false);
    private final m3 k = new m3(this, 5, false, true);
    private final m3 l = new m3(this, 4, false, false);
    private final m3 m = new m3(this, 3, false, false);
    private final m3 n = new m3(this, 2, false, false);

    public k3(o4 o4Var) {
        super(o4Var);
    }

    public static Object B(String str) {
        if (str == null) {
            return null;
        }
        return new l3(str);
    }

    private static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return C0201.m82(27786);
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    private final String N() {
        String str;
        synchronized (this) {
            if (this.e == null) {
                if (this.a.C() != null) {
                    this.e = this.a.C();
                } else {
                    this.e = i9.s();
                }
            }
            str = this.e;
        }
        return str;
    }

    private static String x(boolean z, Object obj) {
        String className;
        String r0 = C0201.m82(27787);
        if (obj == null) {
            return r0;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        boolean z2 = obj instanceof Long;
        String r2 = C0201.m82(27788);
        int i2 = 0;
        if (z2) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                r0 = r2;
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(r0.length() + 43 + r0.length());
            sb.append(r0);
            sb.append(round);
            sb.append(C0201.m82(27789));
            sb.append(r0);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String C = C(o4.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && C(className).equals(C)) {
                        sb2.append(C0201.m82(27790));
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i2++;
                }
                return sb2.toString();
            } else if (obj instanceof l3) {
                return l3.a((l3) obj);
            } else {
                if (z) {
                    return r2;
                }
                return String.valueOf(obj);
            }
        }
    }

    public static String y(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String r0 = C0201.m82(27791);
        if (str == null) {
            str = r0;
        }
        String x = x(z, obj);
        String x2 = x(z, obj2);
        String x3 = x(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            r0 = C0201.m82(27792);
        }
        boolean isEmpty = TextUtils.isEmpty(x);
        String r1 = C0201.m82(27793);
        if (!isEmpty) {
            sb.append(r0);
            sb.append(x);
            r0 = r1;
        }
        if (!TextUtils.isEmpty(x2)) {
            sb.append(r0);
            sb.append(x2);
        } else {
            r1 = r0;
        }
        if (!TextUtils.isEmpty(x3)) {
            sb.append(r1);
            sb.append(x3);
        }
        return sb.toString();
    }

    public final void A(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && t(i2)) {
            z(i2, y(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            u.k(str);
            i4 x = this.a.x();
            if (x == null) {
                z(6, C0201.m82(27794));
            } else if (!x.o()) {
                z(6, C0201.m82(27795));
            } else {
                if (i2 < 0) {
                    i2 = 0;
                }
                x.y(new j3(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3));
            }
        }
    }

    public final m3 E() {
        return this.f;
    }

    public final m3 F() {
        return this.g;
    }

    public final m3 G() {
        return this.h;
    }

    public final m3 H() {
        return this.i;
    }

    public final m3 I() {
        return this.j;
    }

    public final m3 J() {
        return this.k;
    }

    public final m3 K() {
        return this.l;
    }

    public final m3 L() {
        return this.m;
    }

    public final m3 M() {
        return this.n;
    }

    public final String O() {
        Pair<String, Long> c2 = f().d.c();
        if (c2 == null || c2 == t3.A) {
            return null;
        }
        String valueOf = String.valueOf(c2.second);
        String str = (String) c2.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(C0201.m82(27796));
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.k5
    public final boolean r() {
        return false;
    }

    public final boolean t(int i2) {
        return Log.isLoggable(N(), i2);
    }

    public final void z(int i2, String str) {
        Log.println(i2, N(), str);
    }
}
