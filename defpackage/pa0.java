package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import vigqyno.C0201;

/* renamed from: pa0  reason: default package */
/* compiled from: GenericDraweeView */
public class pa0 extends oa0<ba0> {
    public pa0(Context context, ba0 ba0) {
        super(context);
        setHierarchy(ba0);
    }

    public void g(Context context, AttributeSet attributeSet) {
        if (oh0.d()) {
            oh0.a(C0201.m82(11140));
        }
        ca0 d = da0.d(context, attributeSet);
        setAspectRatio(d.f());
        setHierarchy(d.a());
        if (oh0.d()) {
            oh0.b();
        }
    }

    public pa0(Context context) {
        super(context);
        g(context, null);
    }
}
