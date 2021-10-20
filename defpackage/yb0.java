package defpackage;

import vigqyno.C0201;

/* renamed from: yb0  reason: default package */
/* compiled from: AnimatedFactoryProvider */
public class yb0 {
    private static boolean a;
    private static xb0 b;

    public static xb0 a(oc0 oc0, zd0 zd0, yc0<m40, ye0> yc0, boolean z) {
        if (!a) {
            try {
                b = (xb0) Class.forName(C0201.m82(33063)).getConstructor(oc0.class, zd0.class, yc0.class, Boolean.TYPE).newInstance(oc0, zd0, yc0, Boolean.valueOf(z));
            } catch (Throwable unused) {
            }
            if (b != null) {
                a = true;
            }
        }
        return b;
    }
}
