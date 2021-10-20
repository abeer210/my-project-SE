package defpackage;

import android.view.View;
import android.view.ViewGroup;
import vigqyno.C0201;

/* renamed from: n3  reason: default package */
/* compiled from: ViewGroup.kt */
public final class n3 {
    public static final View a(ViewGroup viewGroup, int i) {
        ow2.c(viewGroup, C0201.m82(29492));
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException(C0201.m82(29493) + i + C0201.m82(29494) + viewGroup.getChildCount());
    }
}
