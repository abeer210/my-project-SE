package defpackage;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.util.Log;
import vigqyno.C0201;

/* renamed from: jm2  reason: default package */
/* compiled from: IconResolver */
public class jm2 {
    private Activity a;
    private kj2 b;

    /* access modifiers changed from: package-private */
    /* renamed from: jm2$a */
    /* compiled from: IconResolver */
    public class a extends lj2 {
        public final /* synthetic */ fj2 a;

        public a(jm2 jm2, fj2 fj2) {
            this.a = fj2;
        }

        @Override // defpackage.lj2, defpackage.kj2.b
        public void a(Throwable th) {
            throw new RuntimeException(th);
        }

        @Override // defpackage.lj2, defpackage.kj2.b
        public void c(Drawable drawable) {
            this.a.a(drawable);
        }
    }

    public jm2(Activity activity, kj2 kj2) {
        this.a = activity;
        this.b = kj2;
    }

    public void a(tf2 tf2, fj2<Drawable> fj2) {
        if (tf2.e()) {
            this.b.g(this.a, (String) tf2.m.d(), new a(this, fj2));
            return;
        }
        if (C0201.m82(8261).equals(tf2.b)) {
            fj2.a(this.b.b(this.a));
        } else {
            Log.w(C0201.m82(8262), C0201.m82(8263));
        }
    }
}
