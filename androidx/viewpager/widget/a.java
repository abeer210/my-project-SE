package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import vigqyno.C0201;

/* compiled from: PagerAdapter */
public abstract class a {
    private final DataSetObservable a = new DataSetObservable();
    private DataSetObserver b;

    @Deprecated
    public void d(View view, int i, Object obj) {
        throw new UnsupportedOperationException(C0201.m82(19760));
    }

    public void e(ViewGroup viewGroup, int i, Object obj) {
        d(viewGroup, i, obj);
        throw null;
    }

    @Deprecated
    public void f(View view) {
    }

    public void g(ViewGroup viewGroup) {
        f(viewGroup);
    }

    public abstract int h();

    public int i(Object obj) {
        return -1;
    }

    public CharSequence j(int i) {
        return null;
    }

    public float k(int i) {
        return 1.0f;
    }

    public abstract Object l(ViewGroup viewGroup, int i);

    public abstract boolean m(View view, Object obj);

    public void n() {
        synchronized (this) {
            if (this.b != null) {
                this.b.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public void o(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public void p(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable q() {
        return null;
    }

    @Deprecated
    public void r(View view, int i, Object obj) {
    }

    public void s(ViewGroup viewGroup, int i, Object obj) {
        r(viewGroup, i, obj);
    }

    public void t(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.b = dataSetObserver;
        }
    }

    @Deprecated
    public void u(View view) {
    }

    public void v(ViewGroup viewGroup) {
        u(viewGroup);
    }

    public void w(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }
}
