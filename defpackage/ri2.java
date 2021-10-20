package defpackage;

import android.view.View;

/* renamed from: ri2  reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class ri2 implements Runnable {
    public final /* synthetic */ fj2 a;
    public final /* synthetic */ View b;

    public /* synthetic */ ri2(fj2 fj2, View view) {
        this.a = fj2;
        this.b = view;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
