package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.a;
import androidx.core.util.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import vigqyno.C0201;

/* compiled from: FragmentHostCallback */
public abstract class h<E> extends e {
    private final Activity a;
    private final Context b;
    private final Handler c;
    private final int d;
    public final j e;

    public h(d dVar) {
        this(dVar, dVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.e
    public View c(int i) {
        return null;
    }

    @Override // androidx.fragment.app.e
    public boolean d() {
        return true;
    }

    public Activity e() {
        return this.a;
    }

    public Context f() {
        return this.b;
    }

    public Handler g() {
        return this.c;
    }

    public void h(Fragment fragment) {
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E j();

    public LayoutInflater k() {
        return LayoutInflater.from(this.b);
    }

    public int l() {
        return this.d;
    }

    public boolean m() {
        return true;
    }

    public void n(Fragment fragment, String[] strArr, int i) {
    }

    public boolean o(Fragment fragment) {
        return true;
    }

    public boolean p(String str) {
        return false;
    }

    public void q(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            this.b.startActivity(intent);
            return;
        }
        throw new IllegalStateException(C0201.m82(18249));
    }

    public void r(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            a.r(this.a, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException(C0201.m82(18250));
    }

    public void s() {
    }

    public h(Activity activity, Context context, Handler handler, int i) {
        this.e = new j();
        this.a = activity;
        g.d(context, C0201.m82(18247));
        this.b = context;
        g.d(handler, C0201.m82(18248));
        this.c = handler;
        this.d = i;
    }
}
