package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.fingerprints.service.FingerprintManager;
import defpackage.zt2;
import vigqyno.C0201;

/* renamed from: bu2  reason: default package */
/* compiled from: MeiZuFingerprint */
public class bu2 extends zt2 {
    private FingerprintManager k;

    /* renamed from: bu2$a */
    /* compiled from: MeiZuFingerprint */
    class a implements FingerprintManager.IdentifyCallback {
        public a() {
        }

        @Override // com.fingerprints.service.FingerprintManager.IdentifyCallback
        public void onIdentified(int i, boolean z) {
            bu2.this.l();
        }

        @Override // com.fingerprints.service.FingerprintManager.IdentifyCallback
        public void onNoMatch() {
            bu2.this.k();
        }
    }

    public bu2(Context context, zt2.d dVar) {
        super(context, dVar);
        try {
            FingerprintManager open = FingerprintManager.open();
            this.k = open;
            if (open != null) {
                o(t(Build.MANUFACTURER));
                int[] ids = this.k.getIds();
                p(ids != null && ids.length > 0);
            }
        } catch (Throwable th) {
            i(th);
        }
        u();
    }

    private boolean t(String str) {
        return !TextUtils.isEmpty(str) && str.toUpperCase().contains(C0201.m82(145));
    }

    private void u() {
        try {
            if (this.k != null) {
                this.k.release();
            }
        } catch (Throwable th) {
            i(th);
        }
    }

    @Override // defpackage.zt2
    public void c() {
        u();
    }

    @Override // defpackage.zt2
    public void d() {
        try {
            FingerprintManager open = FingerprintManager.open();
            this.k = open;
            open.startIdentify(new a(), this.k.getIds());
        } catch (Throwable th) {
            i(th);
            j(false);
        }
    }
}
