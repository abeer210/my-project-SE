package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import defpackage.v2;

/* compiled from: ComponentActivity */
public class e extends Activity implements g, v2.a {
    private h a = new h(this);

    public e() {
        new x0();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !v2.d(decorView, keyEvent)) {
            return v2.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !v2.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // defpackage.v2.a
    public boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        w30.i(this);
        super.onCreate(bundle);
        o.e(this);
    }

    public /* synthetic */ void onDestroy() {
        w30.k(this);
        super.onDestroy();
    }

    public /* synthetic */ void onPause() {
        w30.v(this);
        super.onPause();
    }

    public /* synthetic */ void onPostCreate(Bundle bundle) {
        w30.w(this);
        super.onPostCreate(bundle);
    }

    public /* synthetic */ void onPostResume() {
        w30.x(this);
        super.onPostResume();
    }

    public /* synthetic */ void onRestart() {
        w30.A(this);
        super.onRestart();
    }

    public /* synthetic */ void onResume() {
        w30.B(this);
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.a.k(d.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public /* synthetic */ void onStart() {
        w30.C(this);
        super.onStart();
    }

    public /* synthetic */ void onStop() {
        w30.D(this);
        super.onStop();
    }
}
