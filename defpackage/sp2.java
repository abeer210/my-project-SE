package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import vigqyno.C0201;

/* renamed from: sp2  reason: default package */
/* compiled from: ViewHolder */
public abstract class sp2 {
    private static final String d = null;
    public final View a;
    public boolean b;
    public int c;

    static {
        C0201.m83(sp2.class, 452);
    }

    public sp2(View view) {
        if (view != null) {
            this.a = view;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(29551));
    }

    public void b(ViewGroup viewGroup, int i) {
        this.b = true;
        this.c = i;
        viewGroup.addView(this.a);
    }

    public void c(ViewGroup viewGroup) {
        viewGroup.removeView(this.a);
        this.b = false;
    }

    public void d(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.containsKey(d) ? bundle.getSparseParcelableArray(d) : null;
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
        }
    }

    public Parcelable e() {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.a.saveHierarchyState(sparseArray);
        Bundle bundle = new Bundle();
        bundle.putSparseParcelableArray(d, sparseArray);
        return bundle;
    }
}
