package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: vf  reason: default package */
/* compiled from: LogcatLogger */
public class vf implements ja {
    private static final Set<String> a = new HashSet();

    @Override // defpackage.ja
    public void a(String str, Throwable th) {
        if (ca.a) {
            Log.d(C0201.m82(12250), str, th);
        }
    }

    @Override // defpackage.ja
    public void b(String str) {
        e(str, null);
    }

    @Override // defpackage.ja
    public void c(String str, Throwable th) {
        if (!a.contains(str)) {
            Log.w(C0201.m82(12251), str, th);
            a.add(str);
        }
    }

    @Override // defpackage.ja
    public void d(String str) {
        c(str, null);
    }

    public void e(String str, Throwable th) {
        if (ca.a) {
            Log.d(C0201.m82(12252), str, th);
        }
    }
}
