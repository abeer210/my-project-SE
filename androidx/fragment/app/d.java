package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.c;
import androidx.core.app.a;
import androidx.lifecycle.d;
import androidx.lifecycle.h;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import vigqyno.C0201;

/* compiled from: FragmentActivity */
public class d extends ComponentActivity implements a.b, a.d {
    public final f g = f.b(new a());
    public final h h = new h(this);
    public boolean i;
    public boolean j;
    public boolean k = true;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public y0<String> p;

    /* compiled from: FragmentActivity */
    class a extends h<d> implements s, c {
        public a() {
            super(d.this);
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher b() {
            return d.this.b();
        }

        @Override // androidx.fragment.app.e, androidx.fragment.app.h
        public View c(int i) {
            return d.this.findViewById(i);
        }

        @Override // androidx.fragment.app.e, androidx.fragment.app.h
        public boolean d() {
            Window window = d.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.lifecycle.g
        public androidx.lifecycle.d getLifecycle() {
            return d.this.h;
        }

        @Override // androidx.lifecycle.s
        public r getViewModelStore() {
            return d.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.h
        public void h(Fragment fragment) {
            d.this.t(fragment);
        }

        @Override // androidx.fragment.app.h
        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            d.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.h
        public LayoutInflater k() {
            return d.this.getLayoutInflater().cloneInContext(d.this);
        }

        @Override // androidx.fragment.app.h
        public int l() {
            Window window = d.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.h
        public boolean m() {
            return d.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.h
        public void n(Fragment fragment, String[] strArr, int i) {
            d.this.w(fragment, strArr, i);
        }

        @Override // androidx.fragment.app.h
        public boolean o(Fragment fragment) {
            return !d.this.isFinishing();
        }

        @Override // androidx.fragment.app.h
        public boolean p(String str) {
            return androidx.core.app.a.p(d.this, str);
        }

        @Override // androidx.fragment.app.h
        public void q(Fragment fragment, Intent intent, int i, Bundle bundle) {
            d.this.x(fragment, intent, i, bundle);
        }

        @Override // androidx.fragment.app.h
        public void r(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
            d.this.y(fragment, intentSender, i, intent, i2, i3, i4, bundle);
        }

        @Override // androidx.fragment.app.h
        public void s() {
            d.this.z();
        }

        /* renamed from: t */
        public d j() {
            return d.this;
        }
    }

    private int m(Fragment fragment) {
        if (this.p.n() < 65534) {
            while (this.p.g(this.o) >= 0) {
                this.o = (this.o + 1) % 65534;
            }
            int i2 = this.o;
            this.p.l(i2, fragment.mWho);
            this.o = (this.o + 1) % 65534;
            return i2;
        }
        throw new IllegalStateException(C0201.m82(19430));
    }

    public static void n(int i2) {
        if ((i2 & -65536) != 0) {
            throw new IllegalArgumentException(C0201.m82(19431));
        }
    }

    private void r() {
        do {
        } while (s(p(), d.b.CREATED));
    }

    private static boolean s(i iVar, d.b bVar) {
        boolean z = false;
        for (Fragment fragment : iVar.e()) {
            if (fragment != null) {
                if (fragment.getLifecycle().b().b(d.b.STARTED)) {
                    fragment.mLifecycleRegistry.p(bVar);
                    z = true;
                }
                if (fragment.getHost() != null) {
                    z |= s(fragment.getChildFragmentManager(), bVar);
                }
            }
        }
        return z;
    }

    @Override // androidx.core.app.a.d
    public final void a(int i2) {
        if (!this.l && i2 != -1) {
            n(i2);
        }
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print(C0201.m82(19432));
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(C0201.m82(19433));
        String str2 = str + C0201.m82(19434);
        printWriter.print(str2);
        printWriter.print(C0201.m82(19435));
        printWriter.print(this.i);
        printWriter.print(C0201.m82(19436));
        printWriter.print(this.j);
        printWriter.print(C0201.m82(19437));
        printWriter.print(this.k);
        if (getApplication() != null) {
            q4.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.g.u().b(str, fileDescriptor, printWriter, strArr);
    }

    public final View o(View view, String str, Context context, AttributeSet attributeSet) {
        return this.g.w(view, str, context, attributeSet);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        this.g.v();
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            String e = this.p.e(i5);
            this.p.m(i5);
            String r0 = C0201.m82(19438);
            if (e == null) {
                Log.w(r0, C0201.m82(19439));
                return;
            }
            Fragment t = this.g.t(e);
            if (t == null) {
                Log.w(r0, C0201.m82(19440) + e);
                return;
            }
            t.onActivityResult(i2 & 65535, i3, intent);
            return;
        }
        a.c m2 = androidx.core.app.a.m();
        if (m2 == null || !m2.onActivityResult(this, i2, i3, intent)) {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g.v();
        this.g.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.e
    public void onCreate(Bundle bundle) {
        w30.i(this);
        this.g.a(null);
        if (bundle != null) {
            this.g.x(bundle.getParcelable(C0201.m82(19441)));
            String r1 = C0201.m82(19442);
            if (bundle.containsKey(r1)) {
                this.o = bundle.getInt(r1);
                int[] intArray = bundle.getIntArray(C0201.m82(19443));
                String[] stringArray = bundle.getStringArray(C0201.m82(19444));
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w(C0201.m82(19445), C0201.m82(19446));
                } else {
                    this.p = new y0<>(intArray.length);
                    for (int i2 = 0; i2 < intArray.length; i2++) {
                        this.p.l(intArray[i2], stringArray[i2]);
                    }
                }
            }
        }
        if (this.p == null) {
            this.p = new y0<>();
            this.o = 0;
        }
        super.onCreate(bundle);
        this.h.i(d.a.ON_CREATE);
        this.g.f();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 == 0) {
            return super.onCreatePanelMenu(i2, menu) | this.g.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i2, menu);
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View o2 = o(view, str, context, attributeSet);
        return o2 == null ? super.onCreateView(view, str, context, attributeSet) : o2;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.e
    public void onDestroy() {
        w30.k(this);
        super.onDestroy();
        this.g.h();
        this.h.i(d.a.ON_DESTROY);
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.g.i();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.g.k(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.g.e(menuItem);
    }

    public void onMultiWindowModeChanged(boolean z) {
        this.g.j(z);
    }

    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        super.onNewIntent(intent);
        this.g.v();
    }

    public void onPanelClosed(int i2, Menu menu) {
        if (i2 == 0) {
            this.g.l(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.e
    public void onPause() {
        w30.v(this);
        super.onPause();
        this.j = false;
        this.g.m();
        this.h.i(d.a.ON_PAUSE);
    }

    public void onPictureInPictureModeChanged(boolean z) {
        this.g.n(z);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onPostCreate(Bundle bundle) {
        w30.w(this);
        super.onPostCreate(bundle);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.e
    public void onPostResume() {
        w30.x(this);
        super.onPostResume();
        v();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 == 0) {
            return u(view, menu) | this.g.o(menu);
        }
        return super.onPreparePanel(i2, view, menu);
    }

    @Override // androidx.core.app.a.b
    public void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        this.g.v();
        int i3 = (i2 >> 16) & 65535;
        if (i3 != 0) {
            int i4 = i3 - 1;
            String e = this.p.e(i4);
            this.p.m(i4);
            String r0 = C0201.m82(19447);
            if (e == null) {
                Log.w(r0, C0201.m82(19448));
                return;
            }
            Fragment t = this.g.t(e);
            if (t == null) {
                Log.w(r0, C0201.m82(19449) + e);
                return;
            }
            t.onRequestPermissionsResult(i2 & 65535, strArr, iArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.e
    public /* synthetic */ void onRestart() {
        w30.A(this);
        super.onRestart();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.e
    public void onResume() {
        w30.B(this);
        super.onResume();
        this.j = true;
        this.g.v();
        this.g.s();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.e
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        r();
        this.h.i(d.a.ON_STOP);
        Parcelable y = this.g.y();
        if (y != null) {
            bundle.putParcelable(C0201.m82(19450), y);
        }
        if (this.p.n() > 0) {
            bundle.putInt(C0201.m82(19451), this.o);
            int[] iArr = new int[this.p.n()];
            String[] strArr = new String[this.p.n()];
            for (int i2 = 0; i2 < this.p.n(); i2++) {
                iArr[i2] = this.p.j(i2);
                strArr[i2] = this.p.o(i2);
            }
            bundle.putIntArray(C0201.m82(19452), iArr);
            bundle.putStringArray(C0201.m82(19453), strArr);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.e
    public void onStart() {
        w30.C(this);
        super.onStart();
        this.k = false;
        if (!this.i) {
            this.i = true;
            this.g.c();
        }
        this.g.v();
        this.g.s();
        this.h.i(d.a.ON_START);
        this.g.q();
    }

    public void onStateNotSaved() {
        this.g.v();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.e
    public void onStop() {
        w30.D(this);
        super.onStop();
        this.k = true;
        r();
        this.g.r();
        this.h.i(d.a.ON_STOP);
    }

    public i p() {
        return this.g.u();
    }

    @Deprecated
    public q4 q() {
        return q4.b(this);
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        if (!this.n && i2 != -1) {
            n(i2);
        }
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        if (!this.m && i2 != -1) {
            n(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    public void t(Fragment fragment) {
    }

    @Deprecated
    public boolean u(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    public void v() {
        this.h.i(d.a.ON_RESUME);
        this.g.p();
    }

    /* JADX INFO: finally extract failed */
    public void w(Fragment fragment, String[] strArr, int i2) {
        if (i2 == -1) {
            androidx.core.app.a.o(this, strArr, i2);
            return;
        }
        n(i2);
        try {
            this.l = true;
            androidx.core.app.a.o(this, strArr, ((m(fragment) + 1) << 16) + (i2 & 65535));
            this.l = false;
        } catch (Throwable th) {
            this.l = false;
            throw th;
        }
    }

    public void x(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        this.n = true;
        if (i2 == -1) {
            try {
                androidx.core.app.a.q(this, intent, -1, bundle);
            } finally {
                this.n = false;
            }
        } else {
            n(i2);
            androidx.core.app.a.q(this, intent, ((m(fragment) + 1) << 16) + (i2 & 65535), bundle);
            this.n = false;
        }
    }

    public void y(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        this.m = true;
        if (i2 == -1) {
            try {
                androidx.core.app.a.r(this, intentSender, i2, intent, i3, i4, i5, bundle);
            } finally {
                this.m = false;
            }
        } else {
            n(i2);
            androidx.core.app.a.r(this, intentSender, ((m(fragment) + 1) << 16) + (i2 & 65535), intent, i3, i4, i5, bundle);
            this.m = false;
        }
    }

    @Deprecated
    public void z() {
        invalidateOptionsMenu();
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View o2 = o(null, str, context, attributeSet);
        return o2 == null ? super.onCreateView(str, context, attributeSet) : o2;
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, Bundle bundle) {
        if (!this.n && i2 != -1) {
            n(i2);
        }
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        if (!this.m && i2 != -1) {
            n(i2);
        }
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }
}
