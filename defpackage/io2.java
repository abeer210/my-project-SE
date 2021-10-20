package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import vigqyno.C0201;

/* renamed from: io2  reason: default package */
/* compiled from: ViewControllerOverlay.kt */
public final class io2 {
    private final FrameLayout a;

    public io2(Context context) {
        ow2.c(context, C0201.m82(15237));
        this.a = new FrameLayout(context);
    }

    private final void b(ViewGroup viewGroup) {
        if (this.a.getParent() == null) {
            viewGroup.addView(this.a, -1, -1);
        }
    }

    public final void a(ViewGroup viewGroup, View view) {
        ow2.c(viewGroup, C0201.m82(15238));
        ow2.c(view, C0201.m82(15239));
        b(viewGroup);
        this.a.addView(view);
    }

    public final void c(View view) {
        ow2.c(view, C0201.m82(15240));
        this.a.removeView(view);
        if (this.a.getChildCount() == 0) {
            zj2.m(this.a);
        }
    }
}
