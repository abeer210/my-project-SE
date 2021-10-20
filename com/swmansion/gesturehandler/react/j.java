package com.swmansion.gesturehandler.react;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.x;
import com.facebook.react.views.view.f;
import vigqyno.C0201;

/* compiled from: RNViewConfigurationHelper */
public class j implements kq2 {

    /* compiled from: RNViewConfigurationHelper */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[r.values().length];
            a = iArr;
            iArr[r.BOX_ONLY.ordinal()] = 1;
            a[r.BOX_NONE.ordinal()] = 2;
            try {
                a[r.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    @Override // defpackage.kq2
    public gq2 a(View view) {
        r pointerEvents = view instanceof x ? ((x) view).getPointerEvents() : r.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == r.AUTO) {
                return gq2.BOX_NONE;
            }
            if (pointerEvents == r.BOX_ONLY) {
                return gq2.NONE;
            }
        }
        int i = a.a[pointerEvents.ordinal()];
        if (i == 1) {
            return gq2.BOX_ONLY;
        }
        if (i == 2) {
            return gq2.BOX_NONE;
        }
        if (i != 3) {
            return gq2.AUTO;
        }
        return gq2.NONE;
    }

    @Override // defpackage.kq2
    public boolean b(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT < 18 || viewGroup.getClipChildren()) {
            return true;
        }
        if (!(viewGroup instanceof f)) {
            return false;
        }
        return C0201.m82(16935).equals(((f) viewGroup).getOverflow());
    }

    @Override // defpackage.kq2
    public View c(ViewGroup viewGroup, int i) {
        if (viewGroup instanceof f) {
            return viewGroup.getChildAt(((f) viewGroup).getZIndexMappedChildIndex(i));
        }
        return viewGroup.getChildAt(i);
    }
}
