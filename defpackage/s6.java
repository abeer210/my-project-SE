package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import vigqyno.C0201;

/* renamed from: s6  reason: default package */
/* compiled from: ViewOverlayApi14 */
public class s6 implements u6 {
    public a a;

    /* access modifiers changed from: package-private */
    /* renamed from: s6$a */
    /* compiled from: ViewOverlayApi14 */
    public static class a extends ViewGroup {
        public ViewGroup a;
        public View b;
        public ArrayList<Drawable> c = null;
        public s6 d;
        private boolean e;

        static {
            try {
                ViewGroup.class.getDeclaredMethod(C0201.m82(33071), Integer.TYPE, Integer.TYPE, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        public a(Context context, ViewGroup viewGroup, View view, s6 s6Var) {
            super(context);
            this.a = viewGroup;
            this.b = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.d = s6Var;
        }

        private void c() {
            if (this.e) {
                throw new IllegalStateException(C0201.m82(33072));
            }
        }

        private void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.c;
                if (arrayList == null || arrayList.size() == 0) {
                    this.e = true;
                    this.a.removeView(this);
                }
            }
        }

        private void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.a.getLocationOnScreen(iArr2);
            this.b.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        public void a(Drawable drawable) {
            c();
            if (this.c == null) {
                this.c = new ArrayList<>();
            }
            if (!this.c.contains(drawable)) {
                this.c.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.a || viewGroup.getParent() == null || !k3.M(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.a.getLocationOnScreen(iArr2);
                    k3.T(view, iArr[0] - iArr2[0]);
                    k3.U(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.a.getLocationOnScreen(iArr);
            this.b.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.b.getWidth(), this.b.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.c;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.c.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void f(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.c;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                d();
            }
        }

        public void g(View view) {
            super.removeView(view);
            d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.a == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.a instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        public boolean verifyDrawable(Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.c) != null && arrayList.contains(drawable));
        }
    }

    public s6(Context context, ViewGroup viewGroup, View view) {
        this.a = new a(context, viewGroup, view, this);
    }

    public static s6 e(View view) {
        ViewGroup f = f(view);
        if (f == null) {
            return null;
        }
        int childCount = f.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = f.getChildAt(i);
            if (childAt instanceof a) {
                return ((a) childAt).d;
            }
        }
        return new n6(f.getContext(), f, view);
    }

    public static ViewGroup f(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    @Override // defpackage.u6
    public void a(Drawable drawable) {
        this.a.a(drawable);
    }

    @Override // defpackage.u6
    public void b(Drawable drawable) {
        this.a.f(drawable);
    }
}
