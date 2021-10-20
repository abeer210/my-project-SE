package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import vigqyno.C0201;

/* renamed from: qa0  reason: default package */
/* compiled from: SimpleDraweeView */
public class qa0 extends pa0 {
    private static c60<? extends x80> h;
    private x80 g;

    public qa0(Context context) {
        super(context);
        h(context, null);
    }

    private void h(Context context, AttributeSet attributeSet) {
        int resourceId;
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(8609));
            }
            if (isInEditMode()) {
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                z50.h(h, C0201.m82(8610));
                this.g = (x80) h.get();
            }
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z70.SimpleDraweeView);
                try {
                    if (obtainStyledAttributes.hasValue(z70.SimpleDraweeView_actualImageUri)) {
                        k(Uri.parse(obtainStyledAttributes.getString(z70.SimpleDraweeView_actualImageUri)), null);
                    } else if (obtainStyledAttributes.hasValue(z70.SimpleDraweeView_actualImageResource) && (resourceId = obtainStyledAttributes.getResourceId(z70.SimpleDraweeView_actualImageResource, -1)) != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    public static void i(c60<? extends x80> c60) {
        h = c60;
    }

    public x80 getControllerBuilder() {
        return this.g;
    }

    public void j(int i, Object obj) {
        k(h70.c(i), obj);
    }

    public void k(Uri uri, Object obj) {
        x80 x80 = this.g;
        x80.z(obj);
        la0 b = x80.b(uri);
        b.c(getController());
        setController(b.a());
    }

    public void l(String str, Object obj) {
        k(str != null ? Uri.parse(str) : null, obj);
    }

    public void setActualImageResource(int i) {
        j(i, null);
    }

    public void setImageRequest(ih0 ih0) {
        x80 x80 = this.g;
        x80.B(ih0);
        x80.D(getController());
        setController(x80.a());
    }

    @Override // defpackage.oa0
    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    @Override // defpackage.oa0
    public void setImageURI(Uri uri) {
        k(uri, null);
    }

    public void setImageURI(String str) {
        l(str, null);
    }
}
