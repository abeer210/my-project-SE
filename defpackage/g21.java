package defpackage;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.location.n;
import vigqyno.C0201;

/* renamed from: g21  reason: default package */
public final class g21 extends r11 {
    private e<Status> a;

    public g21(e<Status> eVar) {
        this.a = eVar;
    }

    private final void U3(int i) {
        if (this.a == null) {
            Log.wtf(C0201.m82(6308), C0201.m82(6309));
            return;
        }
        this.a.a(n.b(n.a(i)));
        this.a = null;
    }

    @Override // defpackage.q11
    public final void S3(int i, String[] strArr) {
        U3(i);
    }

    @Override // defpackage.q11
    public final void c3(int i, String[] strArr) {
        Log.wtf(C0201.m82(6310), C0201.m82(6311));
    }

    @Override // defpackage.q11
    public final void w1(int i, PendingIntent pendingIntent) {
        U3(i);
    }
}
