package com.facebook.react.views.text;

import android.os.Build;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.q;
import vigqyno.C0201;

/* compiled from: TextAttributeProps */
public class x {
    private static final int x = 0;
    private static final int y;
    public float a = Float.NaN;
    public boolean b = false;
    public boolean c = true;
    public int d;
    public boolean e = false;
    public int f;
    public int g = -1;
    public float h = -1.0f;
    public float i = -1.0f;
    public float j = Float.NaN;
    public c0 k = c0.UNSET;
    public float l = 0.0f;
    public float m = 0.0f;
    public float n = 1.0f;
    public int o = 1426063360;
    public boolean p = false;
    public boolean q = false;
    public int r = -1;
    public int s = -1;
    public String t;
    public String u;
    public float v;
    private final c0 w;

    static {
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 23) {
            i3 = 1;
        }
        y = i3;
    }

    public x(c0 c0Var) {
        ReadableMap readableMap = null;
        this.t = null;
        this.u = null;
        this.v = Float.NaN;
        this.w = c0Var;
        w(e(C0201.m82(38779), -1));
        v(d(C0201.m82(38780), -1.0f));
        u(d(C0201.m82(38781), Float.NaN));
        l(b(C0201.m82(38782), true));
        p(d(C0201.m82(38783), -1.0f));
        String r0 = C0201.m82(38784);
        n(c0Var.g(r0) ? Integer.valueOf(c0Var.d(r0, 0)) : null);
        String r02 = C0201.m82(38785);
        n(c0Var.g(r02) ? Integer.valueOf(c0Var.d(r02, 0)) : null);
        String r03 = C0201.m82(38786);
        m(c0Var.g(r03) ? Integer.valueOf(c0Var.d(r03, 0)) : null);
        o(h(C0201.m82(38787)));
        s(h(C0201.m82(38788)));
        q(h(C0201.m82(38789)));
        r(a(C0201.m82(38790)));
        t(b(C0201.m82(38791), true));
        x(h(C0201.m82(38792)));
        String r04 = C0201.m82(38793);
        z(c0Var.g(r04) ? c0Var.e(r04) : readableMap);
        A((float) e(C0201.m82(38794), 1));
        y(e(C0201.m82(38795), 1426063360));
        B(h(C0201.m82(38796)));
    }

    private ReadableArray a(String str) {
        if (this.w.g(str)) {
            return this.w.a(str);
        }
        return null;
    }

    private boolean b(String str, boolean z) {
        return this.w.g(str) ? this.w.b(str, z) : z;
    }

    private float d(String str, float f2) {
        return this.w.g(str) ? this.w.c(str, f2) : f2;
    }

    private int e(String str, int i2) {
        return this.w.g(str) ? this.w.d(str, i2) : i2;
    }

    public static int f(c0 c0Var) {
        String r0 = C0201.m82(38797);
        if (!C0201.m82(38798).equals(c0Var.g(r0) ? c0Var.f(r0) : null) || Build.VERSION.SDK_INT < 26) {
            return x;
        }
        return 1;
    }

    private String h(String str) {
        if (this.w.g(str)) {
            return this.w.f(str);
        }
        return null;
    }

    public static int i(c0 c0Var) {
        String r0 = C0201.m82(38799);
        String f2 = c0Var.g(r0) ? c0Var.f(r0) : null;
        if (C0201.m82(38800).equals(f2)) {
            return 3;
        }
        if (f2 == null || C0201.m82(38801).equals(f2)) {
            return 0;
        }
        if (C0201.m82(38802).equals(f2)) {
            return 3;
        }
        if (C0201.m82(38803).equals(f2)) {
            return 5;
        }
        if (C0201.m82(38804).equals(f2)) {
            return 1;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(38805) + f2);
    }

    public static int j(String str) {
        int i2 = y;
        if (str == null) {
            return i2;
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1924829944) {
            if (hashCode == -902286926 && str.equals(C0201.m82(38806))) {
                c2 = 0;
            }
        } else if (str.equals(C0201.m82(38807))) {
            c2 = 1;
        }
        if (c2 != 0) {
            return c2 != 1 ? 1 : 2;
        }
        return 0;
    }

    private static int k(String str) {
        if (str.length() != 3 || !str.endsWith(C0201.m82(38808)) || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }

    public void A(float f2) {
        if (f2 != this.n) {
            this.n = f2;
        }
    }

    public void B(String str) {
        if (str == null || C0201.m82(38809).equals(str)) {
            this.k = c0.NONE;
        } else if (C0201.m82(38810).equals(str)) {
            this.k = c0.UPPERCASE;
        } else if (C0201.m82(38811).equals(str)) {
            this.k = c0.LOWERCASE;
        } else if (C0201.m82(38812).equals(str)) {
            this.k = c0.CAPITALIZE;
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(38813) + str);
        }
    }

    public float c() {
        return !Float.isNaN(this.a) && !Float.isNaN(this.v) && (this.v > this.a ? 1 : (this.v == this.a ? 0 : -1)) > 0 ? this.v : this.a;
    }

    public float g() {
        float f2;
        if (this.c) {
            f2 = q.e(this.j);
        } else {
            f2 = q.c(this.j);
        }
        int i2 = this.g;
        if (i2 > 0) {
            return f2 / ((float) i2);
        }
        throw new IllegalArgumentException(C0201.m82(38814) + this.g);
    }

    public void l(boolean z) {
        if (z != this.c) {
            this.c = z;
            p(this.h);
            v(this.i);
            u(this.j);
        }
    }

    public void m(Integer num) {
        boolean z = num != null;
        this.e = z;
        if (z) {
            this.f = num.intValue();
        }
    }

    public void n(Integer num) {
        boolean z = num != null;
        this.b = z;
        if (z) {
            this.d = num.intValue();
        }
    }

    public void o(String str) {
        this.t = str;
    }

    public void p(float f2) {
        double d2;
        this.h = f2;
        if (f2 != -1.0f) {
            if (this.c) {
                d2 = Math.ceil((double) q.e(f2));
            } else {
                d2 = Math.ceil((double) q.c(f2));
            }
            f2 = (float) d2;
        }
        this.g = (int) f2;
    }

    public void q(String str) {
        int i2;
        if (C0201.m82(38815).equals(str)) {
            i2 = 2;
        } else {
            i2 = C0201.m82(38816).equals(str) ? 0 : -1;
        }
        if (i2 != this.r) {
            this.r = i2;
        }
    }

    public void r(ReadableArray readableArray) {
        this.u = t.c(readableArray);
    }

    public void s(String str) {
        int i2 = -1;
        int k2 = str != null ? k(str) : -1;
        if (k2 >= 500 || C0201.m82(38817).equals(str)) {
            i2 = 1;
        } else if (C0201.m82(38818).equals(str) || (k2 != -1 && k2 < 500)) {
            i2 = 0;
        }
        if (i2 != this.s) {
            this.s = i2;
        }
    }

    public void t(boolean z) {
    }

    public void u(float f2) {
        this.j = f2;
    }

    public void v(float f2) {
        float f3;
        this.i = f2;
        if (f2 == -1.0f) {
            this.a = Float.NaN;
            return;
        }
        if (this.c) {
            f3 = q.e(f2);
        } else {
            f3 = q.c(f2);
        }
        this.a = f3;
    }

    public void w(int i2) {
    }

    public void x(String str) {
        this.p = false;
        this.q = false;
        if (str != null) {
            String[] split = str.split(C0201.m82(38819));
            for (String str2 : split) {
                if (C0201.m82(38820).equals(str2)) {
                    this.p = true;
                } else if (C0201.m82(38821).equals(str2)) {
                    this.q = true;
                }
            }
        }
    }

    public void y(int i2) {
        if (i2 != this.o) {
            this.o = i2;
        }
    }

    public void z(ReadableMap readableMap) {
        this.l = 0.0f;
        this.m = 0.0f;
        if (readableMap != null) {
            String r0 = C0201.m82(38822);
            if (readableMap.hasKey(r0) && !readableMap.isNull(r0)) {
                this.l = q.b(readableMap.getDouble(r0));
            }
            String r02 = C0201.m82(38823);
            if (readableMap.hasKey(r02) && !readableMap.isNull(r02)) {
                this.m = q.b(readableMap.getDouble(r02));
            }
        }
    }
}
