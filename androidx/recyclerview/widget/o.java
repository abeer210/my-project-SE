package androidx.recyclerview.widget;

import android.view.View;

/* compiled from: ViewBoundsCheck */
public class o {
    public final b a;
    public a b = new a();

    /* access modifiers changed from: package-private */
    /* compiled from: ViewBoundsCheck */
    public static class a {
        public int a = 0;
        public int b;
        public int c;
        public int d;
        public int e;

        public void a(int i) {
            this.a = i | this.a;
        }

        public boolean b() {
            int i = this.a;
            if ((i & 7) != 0 && (i & (c(this.d, this.b) << 0)) == 0) {
                return false;
            }
            int i2 = this.a;
            if ((i2 & 112) != 0 && (i2 & (c(this.d, this.c) << 4)) == 0) {
                return false;
            }
            int i3 = this.a;
            if ((i3 & 1792) != 0 && (i3 & (c(this.e, this.b) << 8)) == 0) {
                return false;
            }
            int i4 = this.a;
            if ((i4 & 28672) == 0 || (i4 & (c(this.e, this.c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        public int c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        public void d() {
            this.a = 0;
        }

        public void e(int i, int i2, int i3, int i4) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ViewBoundsCheck */
    public interface b {
        int a(View view);

        int b();

        int c();

        int d(View view);

        View getChildAt(int i);
    }

    public o(b bVar) {
        this.a = bVar;
    }

    public View a(int i, int i2, int i3, int i4) {
        int b2 = this.a.b();
        int c = this.a.c();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View childAt = this.a.getChildAt(i);
            this.b.e(b2, c, this.a.a(childAt), this.a.d(childAt));
            if (i3 != 0) {
                this.b.d();
                this.b.a(i3);
                if (this.b.b()) {
                    return childAt;
                }
            }
            if (i4 != 0) {
                this.b.d();
                this.b.a(i4);
                if (this.b.b()) {
                    view = childAt;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean b(View view, int i) {
        this.b.e(this.a.b(), this.a.c(), this.a.a(view), this.a.d(view));
        if (i == 0) {
            return false;
        }
        this.b.d();
        this.b.a(i);
        return this.b.b();
    }
}
