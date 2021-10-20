package defpackage;

import android.content.Context;
import com.samsung.android.sdk.pass.Spass;
import com.samsung.android.sdk.pass.SpassFingerprint;
import com.samsung.android.sdk.pass.SpassInvalidStateException;
import defpackage.zt2;

/* renamed from: cu2  reason: default package */
/* compiled from: SamsungFingerprint */
public class cu2 extends zt2 {
    private int k = -1;
    private SpassFingerprint l;

    /* renamed from: cu2$a */
    /* compiled from: SamsungFingerprint */
    class a implements Runnable {

        /* renamed from: cu2$a$a  reason: collision with other inner class name */
        /* compiled from: SamsungFingerprint */
        class C0135a implements SpassFingerprint.IdentifyListener {
            public C0135a() {
            }

            @Override // com.samsung.android.sdk.pass.SpassFingerprint.IdentifyListener
            public void onCompleted() {
                int i = cu2.this.k;
                if (i != 0) {
                    if (!(i == 4 || i == 16 || i == 51)) {
                        if (i != 100) {
                            if (i != 7) {
                                if (i == 8) {
                                    return;
                                }
                                if (!(i == 9 || i == 12 || i == 13)) {
                                    cu2.this.j(false);
                                    return;
                                }
                            }
                        }
                    }
                    cu2.this.k();
                    return;
                }
                cu2.this.l();
            }

            @Override // com.samsung.android.sdk.pass.SpassFingerprint.IdentifyListener
            public void onFinished(int i) {
                cu2.this.k = i;
            }

            @Override // com.samsung.android.sdk.pass.SpassFingerprint.IdentifyListener
            public void onReady() {
            }

            @Override // com.samsung.android.sdk.pass.SpassFingerprint.IdentifyListener
            public void onStarted() {
            }
        }

        public a() {
        }

        public void run() {
            try {
                cu2.this.l.startIdentify(new C0135a());
            } catch (Throwable th) {
                if (!(th instanceof SpassInvalidStateException)) {
                    cu2.this.i(th);
                    cu2.this.j(false);
                } else if (th.getType() == 1) {
                    cu2.this.j(true);
                } else {
                    cu2.this.i(th);
                    cu2.this.j(false);
                }
            }
        }
    }

    /* renamed from: cu2$b */
    /* compiled from: SamsungFingerprint */
    class b implements Runnable {
        public b() {
        }

        public void run() {
            try {
                if (cu2.this.l != null) {
                    cu2.this.l.cancelIdentify();
                }
            } catch (Throwable th) {
                cu2.this.i(th);
            }
        }
    }

    public cu2(Context context, zt2.d dVar) {
        super(context, dVar);
        try {
            Spass spass = new Spass();
            spass.initialize(this.a);
            this.l = new SpassFingerprint(this.a);
            o(spass.isFeatureEnabled(0));
            p(this.l.hasRegisteredFinger());
        } catch (Throwable th) {
            i(th);
        }
    }

    @Override // defpackage.zt2
    public void c() {
        n(new b());
    }

    @Override // defpackage.zt2
    public void d() {
        n(new a());
    }
}
