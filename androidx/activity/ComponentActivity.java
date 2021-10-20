package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.app.e;
import androidx.lifecycle.d;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.savedstate.SavedStateRegistry;
import vigqyno.C0201;

public class ComponentActivity extends e implements g, s, androidx.savedstate.b, c {
    private final h b = new h(this);
    private final androidx.savedstate.a c = androidx.savedstate.a.a(this);
    private r d;
    private final OnBackPressedDispatcher e = new OnBackPressedDispatcher(new a());
    private int f;

    class a implements Runnable {
        public a() {
        }

        public void run() {
            ComponentActivity.super.onBackPressed();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b {
        public Object a;
        public r b;
    }

    public ComponentActivity() {
        if (getLifecycle() != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                getLifecycle().a(new androidx.lifecycle.e() {
                    /* class androidx.activity.ComponentActivity.AnonymousClass2 */

                    @Override // androidx.lifecycle.e
                    public void c(g gVar, d.a aVar) {
                        if (aVar == d.a.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                peekDecorView.cancelPendingInputEvents();
                            }
                        }
                    }
                });
            }
            getLifecycle().a(new androidx.lifecycle.e() {
                /* class androidx.activity.ComponentActivity.AnonymousClass3 */

                @Override // androidx.lifecycle.e
                public void c(g gVar, d.a aVar) {
                    if (aVar == d.a.ON_DESTROY && !ComponentActivity.this.isChangingConfigurations()) {
                        ComponentActivity.this.getViewModelStore().a();
                    }
                }
            });
            int i = Build.VERSION.SDK_INT;
            if (19 <= i && i <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
                return;
            }
            return;
        }
        throw new IllegalStateException(C0201.m82(36863));
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher b() {
        return this.e;
    }

    @Override // androidx.lifecycle.g
    public d getLifecycle() {
        return this.b;
    }

    @Override // androidx.savedstate.b
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.c.b();
    }

    @Override // androidx.lifecycle.s
    public r getViewModelStore() {
        if (getApplication() != null) {
            if (this.d == null) {
                b bVar = (b) getLastNonConfigurationInstance();
                if (bVar != null) {
                    this.d = bVar.b;
                }
                if (this.d == null) {
                    this.d = new r();
                }
            }
            return this.d;
        }
        throw new IllegalStateException(C0201.m82(36864));
    }

    @Deprecated
    public Object l() {
        return null;
    }

    public void onBackPressed() {
        this.e.c();
    }

    @Override // androidx.core.app.e
    public void onCreate(Bundle bundle) {
        w30.i(this);
        super.onCreate(bundle);
        this.c.c(bundle);
        o.e(this);
        int i = this.f;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // androidx.core.app.e
    public /* synthetic */ void onDestroy() {
        w30.k(this);
        super.onDestroy();
    }

    @Override // androidx.core.app.e
    public /* synthetic */ void onPause() {
        w30.v(this);
        super.onPause();
    }

    @Override // androidx.core.app.e
    public /* synthetic */ void onPostCreate(Bundle bundle) {
        w30.w(this);
        super.onPostCreate(bundle);
    }

    @Override // androidx.core.app.e
    public /* synthetic */ void onPostResume() {
        w30.x(this);
        super.onPostResume();
    }

    @Override // androidx.core.app.e
    public /* synthetic */ void onRestart() {
        w30.A(this);
        super.onRestart();
    }

    @Override // androidx.core.app.e
    public /* synthetic */ void onResume() {
        w30.B(this);
        super.onResume();
    }

    public final Object onRetainNonConfigurationInstance() {
        b bVar;
        Object l = l();
        r rVar = this.d;
        if (rVar == null && (bVar = (b) getLastNonConfigurationInstance()) != null) {
            rVar = bVar.b;
        }
        if (rVar == null && l == null) {
            return null;
        }
        b bVar2 = new b();
        bVar2.a = l;
        bVar2.b = rVar;
        return bVar2;
    }

    @Override // androidx.core.app.e
    public void onSaveInstanceState(Bundle bundle) {
        d lifecycle = getLifecycle();
        if (lifecycle instanceof h) {
            ((h) lifecycle).p(d.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.c.d(bundle);
    }

    @Override // androidx.core.app.e
    public /* synthetic */ void onStart() {
        w30.C(this);
        super.onStart();
    }

    @Override // androidx.core.app.e
    public /* synthetic */ void onStop() {
        w30.D(this);
        super.onStop();
    }
}
