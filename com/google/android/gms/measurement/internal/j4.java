package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.u;
import defpackage.l51;
import defpackage.l91;
import defpackage.m51;
import defpackage.o51;
import java.io.IOException;
import java.util.Map;
import vigqyno.C0201;

public final class j4 extends n8 implements k9 {
    public static final String c = null;
    private static int j;
    private static int k;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    private final Map<String, Map<String, String>> d = new r0();
    private final Map<String, Map<String, Boolean>> e = new r0();
    private final Map<String, Map<String, Boolean>> f = new r0();
    private final Map<String, i61> g = new r0();
    private final Map<String, Map<String, Integer>> h = new r0();
    private final Map<String, String> i = new r0();

    static {
        C0201.m83(j4.class, 76);
    }

    public j4(m8 m8Var) {
        super(m8Var);
    }

    private final i61 v(String str, byte[] bArr) {
        if (bArr == null) {
            return new i61();
        }
        bd1 h2 = bd1.h(bArr, 0, bArr.length);
        i61 i61 = new i61();
        try {
            i61.a(h2);
            e().M().b(C0201.m82(25045), i61.c, i61.d);
            return i61;
        } catch (IOException e2) {
            e().H().b(C0201.m82(25046), k3.B(str), e2);
            return new i61();
        }
    }

    private static Map<String, String> w(i61 i61) {
        t51[] t51Arr;
        r0 r0Var = new r0();
        if (!(i61 == null || (t51Arr = i61.f) == null)) {
            for (t51 t51 : t51Arr) {
                if (t51 != null) {
                    r0Var.put(t51.C(), t51.D());
                }
            }
        }
        return r0Var;
    }

    private final void x(String str, i61 i61) {
        j61[] j61Arr;
        r0 r0Var = new r0();
        r0 r0Var2 = new r0();
        r0 r0Var3 = new r0();
        if (!(i61 == null || (j61Arr = i61.g) == null)) {
            for (j61 j61 : j61Arr) {
                if (TextUtils.isEmpty(j61.c)) {
                    e().H().d(C0201.m82(25047));
                } else {
                    String a = p5.a(j61.c);
                    if (!TextUtils.isEmpty(a)) {
                        j61.c = a;
                    }
                    r0Var.put(j61.c, j61.d);
                    r0Var2.put(j61.c, j61.e);
                    Integer num = j61.f;
                    if (num != null) {
                        if (num.intValue() < k || j61.f.intValue() > j) {
                            e().H().b(C0201.m82(25048), j61.c, j61.f);
                        } else {
                            r0Var3.put(j61.c, j61.f);
                        }
                    }
                }
            }
        }
        this.e.put(str, r0Var);
        this.f.put(str, r0Var2);
        this.h.put(str, r0Var3);
    }

    private final void z(String str) {
        t();
        j();
        u.g(str);
        if (this.g.get(str) == null) {
            byte[] X = p().X(str);
            if (X == null) {
                this.d.put(str, null);
                this.e.put(str, null);
                this.f.put(str, null);
                this.g.put(str, null);
                this.i.put(str, null);
                this.h.put(str, null);
                return;
            }
            i61 v = v(str, X);
            this.d.put(str, w(v));
            x(str, v);
            this.g.put(str, v);
            this.i.put(str, null);
        }
    }

    public final i61 A(String str) {
        t();
        j();
        u.g(str);
        z(str);
        return this.g.get(str);
    }

    public final String B(String str) {
        j();
        return this.i.get(str);
    }

    public final void C(String str) {
        j();
        this.i.put(str, null);
    }

    public final void D(String str) {
        j();
        this.g.remove(str);
    }

    public final boolean E(String str) {
        Boolean bool;
        j();
        i61 A = A(str);
        if (A == null || (bool = A.j) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final long F(String str) {
        String d2 = d(str, C0201.m82(25049));
        if (TextUtils.isEmpty(d2)) {
            return 0;
        }
        try {
            return Long.parseLong(d2);
        } catch (NumberFormatException e2) {
            e().H().b(C0201.m82(25050), k3.B(str), e2);
            return 0;
        }
    }

    public final boolean G(String str) {
        return C0201.m82(25052).equals(d(str, C0201.m82(25051)));
    }

    public final boolean H(String str) {
        return C0201.m82(25054).equals(d(str, C0201.m82(25053)));
    }

    public final boolean I(String str, String str2) {
        Boolean bool;
        j();
        z(str);
        if (G(str) && y8.e0(str2)) {
            return true;
        }
        if (H(str) && y8.Y(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean J(String str, String str2) {
        Boolean bool;
        j();
        z(str);
        if (C0201.m82(25055).equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int K(String str, String str2) {
        Integer num;
        j();
        z(str);
        Map<String, Integer> map = this.h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.k9
    public final String d(String str, String str2) {
        j();
        z(str);
        Map<String, String> map = this.d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.n8
    public final boolean u() {
        return false;
    }

    public final boolean y(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        boolean z;
        t();
        j();
        u.g(str);
        i61 v = v(str, bArr);
        if (v == null) {
            return false;
        }
        x(str, v);
        this.g.put(str, v);
        this.i.put(str, str2);
        this.d.put(str, w(v));
        f9 o2 = o();
        h61[] h61Arr = v.h;
        u.k(h61Arr);
        for (h61 h61 : h61Arr) {
            if (h61.e != null) {
                int i2 = 0;
                while (true) {
                    l51[] l51Arr = h61.e;
                    if (i2 >= l51Arr.length) {
                        break;
                    }
                    l51.a aVar = (l51.a) l51Arr[i2].y();
                    l51.a aVar2 = (l51.a) ((l91.a) aVar.clone());
                    String a = p5.a(aVar.x());
                    if (a != null) {
                        aVar2.v(a);
                        z = true;
                    } else {
                        z = false;
                    }
                    for (int i3 = 0; i3 < aVar.y(); i3++) {
                        m51 w = aVar.w(i3);
                        String a2 = o5.a(w.L());
                        if (a2 != null) {
                            m51.a aVar3 = (m51.a) w.y();
                            aVar3.u(a2);
                            aVar2.u(i3, (m51) ((l91) aVar3.G0()));
                            z = true;
                        }
                    }
                    if (z) {
                        h61.e[i2] = (l51) ((l91) aVar2.G0());
                    }
                    i2++;
                }
            }
            if (h61.d != null) {
                int i4 = 0;
                while (true) {
                    o51[] o51Arr = h61.d;
                    if (i4 >= o51Arr.length) {
                        break;
                    }
                    o51 o51 = o51Arr[i4];
                    String a3 = r5.a(o51.D());
                    if (a3 != null) {
                        o51[] o51Arr2 = h61.d;
                        o51.a aVar4 = (o51.a) o51.y();
                        aVar4.u(a3);
                        o51Arr2[i4] = (o51) ((l91) aVar4.G0());
                    }
                    i4++;
                }
            }
        }
        o2.p().L(str, h61Arr);
        try {
            v.h = null;
            int d2 = v.d();
            bArr2 = new byte[d2];
            v.b(ed1.s(bArr2, 0, d2));
        } catch (IOException e2) {
            e().H().b(o, k3.B(str), e2);
            bArr2 = bArr;
        }
        n9 p2 = p();
        u.g(str);
        p2.j();
        p2.t();
        ContentValues contentValues = new ContentValues();
        contentValues.put(l, bArr2);
        try {
            if (((long) p2.x().update(p, contentValues, n, new String[]{str})) == 0) {
                p2.e().E().a(m, k3.B(str));
            }
        } catch (SQLiteException e3) {
            p2.e().E().b(c, k3.B(str), e3);
        }
        return true;
    }
}
