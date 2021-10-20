package defpackage;

import android.util.Log;
import com.google.android.gms.common.util.a;
import com.google.android.gms.common.util.j;
import java.util.concurrent.Callable;
import vigqyno.C0201;

/* renamed from: tq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class tq0 {
    private static final tq0 d = new tq0(true, null, null);
    public final boolean a;
    private final String b;
    private final Throwable c;

    public tq0(boolean z, String str, Throwable th) {
        this.a = z;
        this.b = str;
        this.c = th;
    }

    public static tq0 b(String str, Throwable th) {
        return new tq0(false, str, th);
    }

    public static tq0 c(Callable<String> callable) {
        return new vq0(callable);
    }

    public static tq0 d(String str) {
        return new tq0(false, str, null);
    }

    public static String e(String str, lq0 lq0, boolean z, boolean z2) {
        return String.format(C0201.m82(25130), z2 ? C0201.m82(25126) : C0201.m82(25127), str, j.a(a.a(C0201.m82(25128)).digest(lq0.V3())), Boolean.valueOf(z), C0201.m82(25129));
    }

    public static tq0 f() {
        return d;
    }

    public String a() {
        return this.b;
    }

    public final void g() {
        if (!this.a) {
            String r1 = C0201.m82(25131);
            if (!Log.isLoggable(r1, 3)) {
                return;
            }
            if (this.c != null) {
                Log.d(r1, a(), this.c);
            } else {
                Log.d(r1, a());
            }
        }
    }
}
