package com.aurelhubert.ahbottomnavigation;

import android.view.View;

/* compiled from: lambda */
public final /* synthetic */ class c implements View.OnClickListener {
    public final /* synthetic */ q a;
    public final /* synthetic */ int b;

    public /* synthetic */ c(q qVar, int i) {
        this.a = qVar;
        this.b = i;
    }

    public final void onClick(View view) {
        q.u(this.a, this.b, view);
    }
}
