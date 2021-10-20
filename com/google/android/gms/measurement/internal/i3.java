package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.u;
import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

public final class i3 extends k5 {
    private static final AtomicReference<String[]> c = new AtomicReference<>();
    private static final AtomicReference<String[]> d = new AtomicReference<>();
    private static final AtomicReference<String[]> e = new AtomicReference<>();

    public i3(o4 o4Var) {
        super(o4Var);
    }

    private final boolean B() {
        a();
        return this.a.z() && this.a.e().t(3);
    }

    private static String u(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        u.k(strArr);
        u.k(strArr2);
        u.k(atomicReference);
        u.a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (y8.z0(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        strArr3[i] = strArr2[i] + C0201.m82(21896) + strArr[i] + C0201.m82(21897);
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    private final String y(i iVar) {
        if (iVar == null) {
            return null;
        }
        if (!B()) {
            return iVar.toString();
        }
        return A(iVar.w());
    }

    public final String A(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!B()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(C0201.m82(21898));
            } else {
                sb.append(C0201.m82(21899));
            }
            sb.append(w(str));
            sb.append(C0201.m82(21900));
            sb.append(bundle.get(str));
        }
        sb.append(C0201.m82(21901));
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.k5
    public final boolean r() {
        return false;
    }

    public final String t(g gVar) {
        if (gVar == null) {
            return null;
        }
        if (!B()) {
            return gVar.toString();
        }
        return C0201.m82(21902) + gVar.a + C0201.m82(21903) + v(gVar.b) + C0201.m82(21904) + y(gVar.f) + C0201.m82(21905);
    }

    public final String v(String str) {
        if (str == null) {
            return null;
        }
        if (!B()) {
            return str;
        }
        return u(str, p5.b, p5.a, c);
    }

    public final String w(String str) {
        if (str == null) {
            return null;
        }
        if (!B()) {
            return str;
        }
        return u(str, o5.b, o5.a, d);
    }

    public final String x(String str) {
        if (str == null) {
            return null;
        }
        if (!B()) {
            return str;
        }
        if (!str.startsWith(C0201.m82(21906))) {
            return u(str, r5.b, r5.a, e);
        }
        return C0201.m82(21907) + C0201.m82(21908) + str + C0201.m82(21909);
    }

    public final String z(j jVar) {
        if (jVar == null) {
            return null;
        }
        if (!B()) {
            return jVar.toString();
        }
        return C0201.m82(21910) + jVar.c + C0201.m82(21911) + v(jVar.a) + C0201.m82(21912) + y(jVar.b);
    }
}
