package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.core.f;

/* renamed from: oi0  reason: default package */
/* compiled from: ReactActivityDelegate */
public class oi0 {
    private final Activity a;
    private final String b;
    private f c;
    private Callback d;
    private ri0 e;

    /* access modifiers changed from: package-private */
    /* renamed from: oi0$a */
    /* compiled from: ReactActivityDelegate */
    public class a extends ri0 {
        public a(Activity activity, vi0 vi0, String str, Bundle bundle) {
            super(activity, vi0, str, bundle);
        }

        @Override // defpackage.ri0
        public zi0 a() {
            return oi0.this.c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: oi0$b */
    /* compiled from: ReactActivityDelegate */
    public class b implements Callback {
        public final /* synthetic */ int a;
        public final /* synthetic */ String[] b;
        public final /* synthetic */ int[] c;

        public b(int i, String[] strArr, int[] iArr) {
            this.a = i;
            this.b = strArr;
            this.c = iArr;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            if (oi0.this.c != null && oi0.this.c.onRequestPermissionsResult(this.a, this.b, this.c)) {
                oi0.this.c = null;
            }
        }
    }

    public oi0(ni0 ni0, String str) {
        this.a = ni0;
        this.b = str;
    }

    public zi0 c() {
        return new zi0(d());
    }

    public Context d() {
        Activity activity = this.a;
        yh0.c(activity);
        return activity;
    }

    public Bundle e() {
        return null;
    }

    public String f() {
        return this.b;
    }

    public Activity g() {
        return (Activity) d();
    }

    public vi0 h() {
        return ((qi0) g().getApplication()).a();
    }

    public void i(String str) {
        this.e.d(str);
        g().setContentView(this.e.c());
    }

    public void j(int i, int i2, Intent intent) {
        this.e.e(i, i2, intent, true);
    }

    public boolean k() {
        return this.e.f();
    }

    public void l(Bundle bundle) {
        String f = f();
        this.e = new a(g(), h(), f, e());
        if (this.b != null) {
            i(f);
        }
    }

    public void m() {
        this.e.g();
    }

    public boolean n(int i, KeyEvent keyEvent) {
        if (!h().n() || !h().m() || i != 90) {
            return false;
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean o(int i, KeyEvent keyEvent) {
        if (!h().n() || !h().m() || i != 90) {
            return false;
        }
        h().j().Z();
        return true;
    }

    public boolean p(int i, KeyEvent keyEvent) {
        return this.e.j(i, keyEvent);
    }

    public boolean q(Intent intent) {
        if (!h().n()) {
            return false;
        }
        h().j().O(intent);
        return true;
    }

    public void r() {
        this.e.h();
    }

    public void s(int i, String[] strArr, int[] iArr) {
        this.d = new b(i, strArr, iArr);
    }

    public void t() {
        this.e.i();
        Callback callback = this.d;
        if (callback != null) {
            callback.invoke(new Object[0]);
            this.d = null;
        }
    }

    public void u(boolean z) {
        if (h().n()) {
            h().j().P(z);
        }
    }

    @TargetApi(23)
    public void v(String[] strArr, int i, f fVar) {
        this.c = fVar;
        g().requestPermissions(strArr, i);
    }
}
