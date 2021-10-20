package defpackage;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.location.n;
import vigqyno.C0201;

/* renamed from: f21  reason: default package */
public final class f21 extends r11 {
    private e<Status> a;

    public f21(e<Status> eVar) {
        this.a = eVar;
    }

    @Override // defpackage.q11
    public final void S3(int i, String[] strArr) {
        Log.wtf(C0201.m82(19331), C0201.m82(19332));
    }

    @Override // defpackage.q11
    public final void c3(int i, String[] strArr) {
        if (this.a == null) {
            Log.wtf(C0201.m82(19333), C0201.m82(19334));
            return;
        }
        this.a.a(n.b(n.a(i)));
        this.a = null;
    }

    @Override // defpackage.q11
    public final void w1(int i, PendingIntent pendingIntent) {
        Log.wtf(C0201.m82(19335), C0201.m82(19336));
    }
}
