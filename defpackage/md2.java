package defpackage;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.c;
import com.facebook.react.modules.core.b;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import com.reactnativenavigation.react.a0;
import com.reactnativenavigation.react.s;

/* renamed from: md2  reason: default package */
/* compiled from: NavigationActivity */
public class md2 extends c implements b, e, s.b {
    private f v;
    public an2 w;

    private nd2 M() {
        return (nd2) getApplication();
    }

    public void L() {
        View view = new View(this);
        view.setBackgroundColor(-1);
        setContentView(view);
    }

    public an2 N() {
        return this.w;
    }

    public a0 O() {
        return M().e();
    }

    public /* synthetic */ void P() {
        this.w.K0();
    }

    public void Q() {
        runOnUiThread(new ld2(this));
    }

    @Override // com.facebook.react.modules.core.b
    public void c() {
        if (!this.w.C(new bj2())) {
            super.onBackPressed();
        }
    }

    @Override // com.reactnativenavigation.react.s.b
    public void d() {
        this.w.K0();
    }

    @Override // com.facebook.react.modules.core.e
    @TargetApi(23)
    public void i(String[] strArr, int i, f fVar) {
        this.v = fVar;
        requestPermissions(strArr, i);
    }

    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        O().d(this, i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        O().f();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        w30.i(this);
        super.onCreate(bundle);
        L();
        an2 an2 = new an2(this, new dl2(), new tm2(this), new hi2(), new ki2(this));
        this.w = an2;
        an2.H0();
        O().a(this);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onDestroy() {
        w30.k(this);
        super.onDestroy();
        this.w.q();
        O().b(this);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return O().g(i) || super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.fragment.app.d
    public void onNewIntent(Intent intent) {
        if (!O().h(intent)) {
            super.onNewIntent(intent);
        }
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onPause() {
        w30.v(this);
        super.onPause();
        O().c(this);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onPostCreate(Bundle bundle) {
        w30.w(this);
        super.onPostCreate(bundle);
        this.w.a1((ViewGroup) findViewById(16908290));
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public /* synthetic */ void onPostResume() {
        w30.x(this);
        super.onPostResume();
    }

    @Override // androidx.fragment.app.d, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        nd2.c.f(i, strArr, iArr);
        f fVar = this.v;
        if (fVar != null && fVar.onRequestPermissionsResult(i, strArr, iArr)) {
            this.v = null;
        }
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public /* synthetic */ void onRestart() {
        w30.A(this);
        super.onRestart();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onResume() {
        w30.B(this);
        super.onResume();
        O().e(this);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public /* synthetic */ void onStart() {
        w30.C(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public /* synthetic */ void onStop() {
        w30.D(this);
        super.onStop();
    }
}
