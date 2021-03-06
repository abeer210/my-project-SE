package defpackage;

import android.util.Property;
import android.view.ViewGroup;
import vigqyno.C0201;

/* renamed from: bw1  reason: default package */
/* compiled from: ChildrenAlphaProperty */
public class bw1 extends Property<ViewGroup, Float> {
    public static final Property<ViewGroup, Float> a = new bw1(C0201.m82(9938));

    private bw1(String str) {
        super(Float.class, str);
    }

    /* renamed from: a */
    public Float get(ViewGroup viewGroup) {
        Float f = (Float) viewGroup.getTag(rv1.mtrl_internal_children_alpha_tag);
        if (f != null) {
            return f;
        }
        return Float.valueOf(1.0f);
    }

    /* renamed from: b */
    public void set(ViewGroup viewGroup, Float f) {
        float floatValue = f.floatValue();
        viewGroup.setTag(rv1.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(floatValue);
        }
    }
}
