package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import androidx.appcompat.app.c;
import com.facebook.react.modules.core.b;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;

/* renamed from: ni0  reason: default package */
/* compiled from: ReactActivity */
public abstract class ni0 extends c implements b, e {
    private final oi0 v = L();

    public oi0 L() {
        return new oi0(this, M());
    }

    public String M() {
        return null;
    }

    @Override // com.facebook.react.modules.core.b
    public void c() {
        super.onBackPressed();
    }

    @Override // com.facebook.react.modules.core.e
    public void i(String[] strArr, int i, f fVar) {
        this.v.v(strArr, i, fVar);
    }

    @Override // androidx.fragment.app.d
    public void onActivityResult(int i, int i2, Intent intent) {
        this.v.j(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity
    public void onBackPressed() {
        if (!this.v.k()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.v.l(bundle);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onDestroy() {
        super.onDestroy();
        this.v.m();
    }

    @Override // androidx.appcompat.app.c
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.v.n(i, keyEvent) || super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return this.v.o(i, keyEvent) || super.onKeyLongPress(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.v.p(i, keyEvent) || super.onKeyUp(i, keyEvent);
    }

    @Override // androidx.fragment.app.d
    public void onNewIntent(Intent intent) {
        if (!this.v.q(intent)) {
            super.onNewIntent(intent);
        }
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onPause() {
        super.onPause();
        this.v.r();
    }

    @Override // androidx.fragment.app.d, androidx.core.app.a.b
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.v.s(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, androidx.core.app.e, androidx.appcompat.app.c
    public void onResume() {
        super.onResume();
        this.v.t();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        this.v.u(z);
    }
}
