package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

public class ViewPager extends ViewGroup {
    public static final String X = null;
    public static final String Y = null;
    public static final int[] i0 = {16842931};
    private static final Comparator<f> j0 = new a();
    private static final Interpolator k0 = new b();
    private static final o l0 = new o();
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J = -1;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private EdgeEffect Q;
    private EdgeEffect R;
    private boolean S = true;
    private boolean T;
    private int U;
    private List<j> V;
    private j W;
    private int a;
    private j a0;
    private final ArrayList<f> b = new ArrayList<>();
    private List<i> b0;
    private final f c = new f();
    private k c0;
    private final Rect d = new Rect();
    private int d0;
    public a e;
    private int e0;
    public int f;
    private ArrayList<View> f0;
    private int g = -1;
    private final Runnable g0 = new c();
    private Parcelable h = null;
    private int h0 = 0;
    private ClassLoader i = null;
    private Scroller j;
    private boolean k;
    private l l;
    private int m;
    private Drawable n;
    private int o;
    private int p;
    private float q = -3.4028235E38f;
    private float u = Float.MAX_VALUE;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z = 1;

    static class a implements Comparator<f> {
        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            return fVar.b - fVar2.b;
        }
    }

    static class b implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    class c implements Runnable {
        public c() {
        }

        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.G();
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements g3 {
        private final Rect a = new Rect();

        public d() {
        }

        @Override // defpackage.g3
        public t3 a(View view, t3 t3Var) {
            t3 V = k3.V(view, t3Var);
            if (V.e()) {
                return V;
            }
            Rect rect = this.a;
            rect.left = V.b();
            rect.top = V.d();
            rect.right = V.c();
            rect.bottom = V.a();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                t3 f = k3.f(ViewPager.this.getChildAt(i), V);
                rect.left = Math.min(f.b(), rect.left);
                rect.top = Math.min(f.d(), rect.top);
                rect.right = Math.min(f.c(), rect.right);
                rect.bottom = Math.min(f.a(), rect.bottom);
            }
            return V.f(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    /* access modifiers changed from: package-private */
    public static class f {
        public Object a;
        public int b;
        public boolean c;
        public float d;
        public float e;
    }

    /* access modifiers changed from: package-private */
    public class h extends r2 {
        public h() {
        }

        private boolean n() {
            a aVar = ViewPager.this.e;
            return aVar != null && aVar.h() > 1;
        }

        @Override // defpackage.r2
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.e) != null) {
                accessibilityEvent.setItemCount(aVar.h());
                accessibilityEvent.setFromIndex(ViewPager.this.f);
                accessibilityEvent.setToIndex(ViewPager.this.f);
            }
        }

        @Override // defpackage.r2
        public void g(View view, w3 w3Var) {
            super.g(view, w3Var);
            w3Var.Z(ViewPager.class.getName());
            w3Var.t0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                w3Var.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                w3Var.a(8192);
            }
        }

        @Override // defpackage.r2
        public boolean j(View view, int i, Bundle bundle) {
            if (super.j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.f + 1);
                return true;
            }
        }
    }

    public interface i {
        void a(ViewPager viewPager, a aVar, a aVar2);
    }

    public interface j {
        void a(int i, float f, int i2);

        void b(int i);

        void c(int i);
    }

    public interface k {
        void a(View view, float f);
    }

    private class l extends DataSetObserver {
        public l() {
        }

        public void onChanged() {
            ViewPager.this.j();
        }

        public void onInvalidated() {
            ViewPager.this.j();
        }
    }

    public static class m extends f4 {
        public static final Parcelable.Creator<m> CREATOR = new a();
        public int c;
        public Parcelable d;
        public ClassLoader e;

        static class a implements Parcelable.ClassLoaderCreator<m> {
            /* renamed from: a */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            /* renamed from: b */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            /* renamed from: c */
            public m[] newArray(int i) {
                return new m[i];
            }
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return C0201.m82(27033) + Integer.toHexString(System.identityHashCode(this)) + C0201.m82(27034) + this.c + C0201.m82(27035);
        }

        @Override // defpackage.f4
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.c);
            parcel.writeParcelable(this.d, i);
        }

        public m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? m.class.getClassLoader() : classLoader;
            this.c = parcel.readInt();
            this.d = parcel.readParcelable(classLoader);
            this.e = classLoader;
        }
    }

    public static class n implements j {
        @Override // androidx.viewpager.widget.ViewPager.j
        public void a(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void b(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void c(int i) {
            w30.t(i);
            try {
            } finally {
                w30.u();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class o implements Comparator<View> {
        /* renamed from: a */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.a;
            if (z != gVar2.a) {
                return z ? 1 : -1;
            }
            return gVar.e - gVar2.e;
        }
    }

    static {
        C0201.m83(ViewPager.class, 97);
    }

    public ViewPager(Context context) {
        super(context);
        x();
    }

    private void B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.F = motionEvent.getX(i2);
            this.J = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.K;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean E(int i2) {
        int size = this.b.size();
        String r1 = C0201.m82(31786);
        if (size != 0) {
            f v2 = v();
            int clientWidth = getClientWidth();
            int i3 = this.m;
            int i4 = clientWidth + i3;
            float f2 = (float) clientWidth;
            int i5 = v2.b;
            float f3 = ((((float) i2) / f2) - v2.e) / (v2.d + (((float) i3) / f2));
            this.T = false;
            A(i5, f3, (int) (((float) i4) * f3));
            if (this.T) {
                return true;
            }
            throw new IllegalStateException(r1);
        } else if (this.S) {
            return false;
        } else {
            this.T = false;
            A(0, 0.0f, 0);
            if (this.T) {
                return false;
            }
            throw new IllegalStateException(r1);
        }
    }

    private boolean F(float f2) {
        boolean z2;
        boolean z3;
        float f3 = this.F - f2;
        this.F = f2;
        float scrollX = ((float) getScrollX()) + f3;
        float clientWidth = (float) getClientWidth();
        float f4 = this.q * clientWidth;
        float f5 = this.u * clientWidth;
        boolean z4 = false;
        f fVar = this.b.get(0);
        ArrayList<f> arrayList = this.b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.b != 0) {
            f4 = fVar.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (fVar2.b != this.e.h() - 1) {
            f5 = fVar2.e * clientWidth;
            z3 = false;
        } else {
            z3 = true;
        }
        if (scrollX < f4) {
            if (z2) {
                this.Q.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z4 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z3) {
                this.R.onPull(Math.abs(scrollX - f5) / clientWidth);
                z4 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.F += scrollX - ((float) i2);
        scrollTo(i2, getScrollY());
        E(i2);
        return z4;
    }

    private void I(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.b.isEmpty()) {
            f w2 = w(this.f);
            int min = (int) ((w2 != null ? Math.min(w2.e, this.u) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                i(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.j.isFinished()) {
            this.j.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))) * ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))), getScrollY());
        }
    }

    private void J() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void M(boolean z2) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z2);
        }
    }

    private boolean N() {
        this.J = -1;
        q();
        this.Q.onRelease();
        this.R.onRelease();
        return this.Q.isFinished() || this.R.isFinished();
    }

    private void O(int i2, boolean z2, int i3, boolean z3) {
        f w2 = w(i2);
        int clientWidth = w2 != null ? (int) (((float) getClientWidth()) * Math.max(this.q, Math.min(w2.e, this.u))) : 0;
        if (z2) {
            S(clientWidth, 0, i3);
            if (z3) {
                m(i2);
                return;
            }
            return;
        }
        if (z3) {
            m(i2);
        }
        i(false);
        scrollTo(clientWidth, 0);
        E(clientWidth);
    }

    private void T() {
        if (this.e0 != 0) {
            ArrayList<View> arrayList = this.f0;
            if (arrayList == null) {
                this.f0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.f0.add(getChildAt(i2));
            }
            Collections.sort(this.f0, l0);
        }
    }

    private void g(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int h2 = this.e.h();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? ((float) this.m) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.b;
            int i6 = fVar.b;
            if (i5 < i6) {
                int i7 = 0;
                float f3 = fVar2.e + fVar2.d + f2;
                while (true) {
                    i5++;
                    if (i5 > fVar.b || i7 >= this.b.size()) {
                        break;
                    }
                    f fVar5 = this.b.get(i7);
                    while (true) {
                        fVar4 = fVar5;
                        if (i5 > fVar4.b && i7 < this.b.size() - 1) {
                            i7++;
                            fVar5 = this.b.get(i7);
                        }
                    }
                    while (i5 < fVar4.b) {
                        f3 += this.e.k(i5) + f2;
                        i5++;
                    }
                    fVar4.e = f3;
                    f3 += fVar4.d + f2;
                }
            } else if (i5 > i6) {
                int size = this.b.size() - 1;
                float f4 = fVar2.e;
                while (true) {
                    i5--;
                    if (i5 < fVar.b || size < 0) {
                        break;
                    }
                    f fVar6 = this.b.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i5 < fVar3.b && size > 0) {
                            size--;
                            fVar6 = this.b.get(size);
                        }
                    }
                    while (i5 > fVar3.b) {
                        f4 -= this.e.k(i5) + f2;
                        i5--;
                    }
                    f4 -= fVar3.d + f2;
                    fVar3.e = f4;
                }
            }
        }
        int size2 = this.b.size();
        float f5 = fVar.e;
        int i8 = fVar.b;
        int i9 = i8 - 1;
        this.q = i8 == 0 ? f5 : -3.4028235E38f;
        int i10 = h2 - 1;
        this.u = fVar.b == i10 ? (fVar.e + fVar.d) - 1.0f : Float.MAX_VALUE;
        int i11 = i2 - 1;
        while (i11 >= 0) {
            f fVar7 = this.b.get(i11);
            while (true) {
                i4 = fVar7.b;
                if (i9 <= i4) {
                    break;
                }
                f5 -= this.e.k(i9) + f2;
                i9--;
            }
            f5 -= fVar7.d + f2;
            fVar7.e = f5;
            if (i4 == 0) {
                this.q = f5;
            }
            i11--;
            i9--;
        }
        float f6 = fVar.e + fVar.d + f2;
        int i12 = fVar.b + 1;
        int i13 = i2 + 1;
        while (i13 < size2) {
            f fVar8 = this.b.get(i13);
            while (true) {
                i3 = fVar8.b;
                if (i12 >= i3) {
                    break;
                }
                f6 += this.e.k(i12) + f2;
                i12++;
            }
            if (i3 == i10) {
                this.u = (fVar8.d + f6) - 1.0f;
            }
            fVar8.e = f6;
            f6 += fVar8.d + f2;
            i13++;
            i12++;
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void i(boolean z2) {
        boolean z3 = this.h0 == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            if (!this.j.isFinished()) {
                this.j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.j.getCurrX();
                int currY = this.j.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        E(currX);
                    }
                }
            }
        }
        this.y = false;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            f fVar = this.b.get(i2);
            if (fVar.c) {
                fVar.c = false;
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (z2) {
            k3.a0(this, this.g0);
        } else {
            this.g0.run();
        }
    }

    private int k(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.N || Math.abs(i3) <= this.L) {
            i2 += (int) (f2 + (i2 >= this.f ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.b.size() <= 0) {
            return i2;
        }
        ArrayList<f> arrayList = this.b;
        return Math.max(this.b.get(0).b, Math.min(i2, arrayList.get(arrayList.size() - 1).b));
    }

    private void l(int i2, float f2, int i3) {
        j jVar = this.W;
        if (jVar != null) {
            jVar.a(i2, f2, i3);
        }
        List<j> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.V.get(i4);
                if (jVar2 != null) {
                    jVar2.a(i2, f2, i3);
                }
            }
        }
        j jVar3 = this.a0;
        if (jVar3 != null) {
            jVar3.a(i2, f2, i3);
        }
    }

    private void m(int i2) {
        j jVar = this.W;
        if (jVar != null) {
            jVar.c(i2);
        }
        List<j> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.V.get(i3);
                if (jVar2 != null) {
                    jVar2.c(i2);
                }
            }
        }
        j jVar3 = this.a0;
        if (jVar3 != null) {
            jVar3.c(i2);
        }
    }

    private void n(int i2) {
        j jVar = this.W;
        if (jVar != null) {
            jVar.b(i2);
        }
        List<j> list = this.V;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.V.get(i3);
                if (jVar2 != null) {
                    jVar2.b(i2);
                }
            }
        }
        j jVar3 = this.a0;
        if (jVar3 != null) {
            jVar3.b(i2);
        }
    }

    private void p(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z2 ? this.d0 : 0, null);
        }
    }

    private void q() {
        this.A = false;
        this.B = false;
        VelocityTracker velocityTracker = this.K;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.K = null;
        }
    }

    private Rect s(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.x != z2) {
            this.x = z2;
        }
    }

    private f v() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f3 = clientWidth > 0 ? ((float) this.m) / ((float) clientWidth) : 0.0f;
        f fVar = null;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        while (i4 < this.b.size()) {
            f fVar2 = this.b.get(i4);
            if (!z2 && fVar2.b != (i2 = i3 + 1)) {
                fVar2 = this.c;
                fVar2.e = f2 + f4 + f3;
                fVar2.b = i2;
                fVar2.d = this.e.k(i2);
                i4--;
            }
            f2 = fVar2.e;
            float f5 = fVar2.d + f2 + f3;
            if (!z2 && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i4 == this.b.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.b;
            f4 = fVar2.d;
            i4++;
            fVar = fVar2;
            z2 = false;
        }
        return fVar;
    }

    private static boolean y(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean z(float f2, float f3) {
        return (f2 < ((float) this.D) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.D)) && f3 < 0.0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    public void A(int i2, float f2, int i3) {
        int i4;
        int left;
        int i5;
        if (this.U > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a) {
                    int i7 = gVar.b & 7;
                    if (i7 != 1) {
                        if (i7 == 3) {
                            i4 = childAt.getWidth() + paddingLeft;
                        } else if (i7 != 5) {
                            i4 = paddingLeft;
                        } else {
                            i5 = (width - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = i4;
                    } else {
                        i5 = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    i4 = paddingLeft;
                    paddingLeft = i5;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                    }
                    paddingLeft = i4;
                }
            }
        }
        l(i2, f2, i3);
        if (this.c0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt2 = getChildAt(i8);
                if (!((g) childAt2.getLayoutParams()).a) {
                    this.c0.a(childAt2, ((float) (childAt2.getLeft() - scrollX2)) / ((float) getClientWidth()));
                }
            }
        }
        this.T = true;
    }

    public boolean C() {
        int i2 = this.f;
        if (i2 <= 0) {
            return false;
        }
        P(i2 - 1, true);
        return true;
    }

    public boolean D() {
        a aVar = this.e;
        if (aVar == null || this.f >= aVar.h() - 1) {
            return false;
        }
        P(this.f + 1, true);
        return true;
    }

    public void G() {
        H(this.f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    public void H(int i2) {
        f fVar;
        String str;
        f fVar2;
        f u2;
        float f2;
        float f3;
        f fVar3;
        int i3 = this.f;
        if (i3 != i2) {
            fVar = w(i3);
            this.f = i2;
        } else {
            fVar = null;
        }
        if (this.e == null) {
            T();
        } else if (this.y) {
            T();
        } else if (getWindowToken() != null) {
            this.e.v(this);
            int i4 = this.z;
            int max = Math.max(0, this.f - i4);
            int h2 = this.e.h();
            int min = Math.min(h2 - 1, this.f + i4);
            if (h2 == this.a) {
                int i5 = 0;
                while (true) {
                    if (i5 >= this.b.size()) {
                        break;
                    }
                    fVar2 = this.b.get(i5);
                    int i6 = fVar2.b;
                    int i7 = this.f;
                    if (i6 < i7) {
                        i5++;
                    }
                }
                if (fVar2 == null && h2 > 0) {
                    fVar2 = a(this.f, i5);
                }
                if (fVar2 != null) {
                    int i8 = i5 - 1;
                    f fVar4 = i8 >= 0 ? this.b.get(i8) : null;
                    int clientWidth = getClientWidth();
                    if (clientWidth <= 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = (2.0f - fVar2.d) + (((float) getPaddingLeft()) / ((float) clientWidth));
                    }
                    float f4 = 0.0f;
                    for (int i9 = this.f - 1; i9 >= 0; i9--) {
                        if (f4 < f2 || i9 >= max) {
                            if (fVar4 == null || i9 != fVar4.b) {
                                f4 += a(i9, i8 + 1).d;
                                i5++;
                                if (i8 >= 0) {
                                    fVar3 = this.b.get(i8);
                                    fVar4 = fVar3;
                                }
                            } else {
                                f4 += fVar4.d;
                                i8--;
                                if (i8 >= 0) {
                                    fVar3 = this.b.get(i8);
                                    fVar4 = fVar3;
                                }
                            }
                        } else if (fVar4 == null) {
                            break;
                        } else {
                            if (i9 == fVar4.b && !fVar4.c) {
                                this.b.remove(i8);
                                this.e.e(this, i9, fVar4.a);
                                i8--;
                                i5--;
                                if (i8 >= 0) {
                                    fVar3 = this.b.get(i8);
                                    fVar4 = fVar3;
                                }
                            }
                        }
                        fVar3 = null;
                        fVar4 = fVar3;
                    }
                    float f5 = fVar2.d;
                    int i10 = i5 + 1;
                    if (f5 < 2.0f) {
                        f fVar5 = i10 < this.b.size() ? this.b.get(i10) : null;
                        if (clientWidth <= 0) {
                            f3 = 0.0f;
                        } else {
                            f3 = (((float) getPaddingRight()) / ((float) clientWidth)) + 2.0f;
                        }
                        int i11 = this.f;
                        while (true) {
                            i11++;
                            if (i11 >= h2) {
                                break;
                            }
                            if (f5 < f3 || i11 <= min) {
                                if (fVar5 == null || i11 != fVar5.b) {
                                    f a2 = a(i11, i10);
                                    i10++;
                                    f5 += a2.d;
                                    if (i10 < this.b.size()) {
                                        fVar5 = this.b.get(i10);
                                    }
                                } else {
                                    f5 += fVar5.d;
                                    i10++;
                                    if (i10 < this.b.size()) {
                                        fVar5 = this.b.get(i10);
                                    }
                                }
                            } else if (fVar5 == null) {
                                break;
                            } else if (i11 == fVar5.b && !fVar5.c) {
                                this.b.remove(i10);
                                this.e.e(this, i11, fVar5.a);
                                if (i10 < this.b.size()) {
                                    fVar5 = this.b.get(i10);
                                }
                            }
                            fVar5 = null;
                        }
                    }
                    g(fVar2, i5, fVar);
                    this.e.s(this, this.f, fVar2.a);
                }
                this.e.g(this);
                int childCount = getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    g gVar = (g) childAt.getLayoutParams();
                    gVar.f = i12;
                    if (!gVar.a && gVar.c == 0.0f && (u2 = u(childAt)) != null) {
                        gVar.c = u2.d;
                        gVar.e = u2.b;
                    }
                }
                T();
                if (hasFocus()) {
                    View findFocus = findFocus();
                    f t2 = findFocus != null ? t(findFocus) : null;
                    if (t2 == null || t2.b != this.f) {
                        for (int i13 = 0; i13 < getChildCount(); i13++) {
                            View childAt2 = getChildAt(i13);
                            f u3 = u(childAt2);
                            if (u3 != null && u3.b == this.f && childAt2.requestFocus(2)) {
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                str = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                str = Integer.toHexString(getId());
            }
            throw new IllegalStateException(r + this.a + X + h2 + t + str + s + getClass() + Y + this.e.getClass());
        }
    }

    public void K(i iVar) {
        List<i> list = this.b0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void L(j jVar) {
        List<j> list = this.V;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void P(int i2, boolean z2) {
        this.y = false;
        Q(i2, z2, false);
    }

    public void Q(int i2, boolean z2, boolean z3) {
        R(i2, z2, z3, 0);
    }

    public void R(int i2, boolean z2, boolean z3, int i3) {
        a aVar = this.e;
        boolean z4 = false;
        if (aVar == null || aVar.h() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.f != i2 || this.b.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.e.h()) {
                i2 = this.e.h() - 1;
            }
            int i4 = this.z;
            int i5 = this.f;
            if (i2 > i5 + i4 || i2 < i5 - i4) {
                for (int i6 = 0; i6 < this.b.size(); i6++) {
                    this.b.get(i6).c = true;
                }
            }
            if (this.f != i2) {
                z4 = true;
            }
            if (this.S) {
                this.f = i2;
                if (z4) {
                    m(i2);
                }
                requestLayout();
                return;
            }
            H(i2);
            O(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public void S(int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            i5 = this.k ? this.j.getCurrX() : this.j.getStartX();
            this.j.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i5 = getScrollX();
        }
        int scrollY = getScrollY();
        int i7 = i2 - i5;
        int i8 = i3 - scrollY;
        if (i7 == 0 && i8 == 0) {
            i(false);
            G();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f2 = (float) clientWidth;
        float f3 = (float) i9;
        float o2 = f3 + (o(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f2)) * f3);
        int abs = Math.abs(i4);
        if (abs > 0) {
            i6 = Math.round(Math.abs(o2 / ((float) abs)) * 1000.0f) * 4;
        } else {
            i6 = (int) (((((float) Math.abs(i7)) / ((f2 * this.e.k(this.f)) + ((float) this.m))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i6, 600);
        this.k = false;
        this.j.startScroll(i5, scrollY, i7, i8, min);
        k3.Z(this);
    }

    public f a(int i2, int i3) {
        f fVar = new f();
        fVar.b = i2;
        fVar.a = this.e.l(this, i2);
        fVar.d = this.e.k(i2);
        if (i3 < 0 || i3 >= this.b.size()) {
            this.b.add(fVar);
        } else {
            this.b.add(i3, fVar);
        }
        return fVar;
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f u2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (u2 = u(childAt)) != null && u2.b == this.f) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addTouchables(ArrayList<View> arrayList) {
        f u2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (u2 = u(childAt)) != null && u2.b == this.f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean y2 = gVar.a | y(view);
        gVar.a = y2;
        if (!this.w) {
            super.addView(view, i2, layoutParams);
        } else if (gVar == null || !y2) {
            gVar.d = true;
            addViewInLayout(view, i2, layoutParams);
        } else {
            throw new IllegalStateException(C0201.m82(31787));
        }
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.q))) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.u))) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.k = true;
        if (this.j.isFinished() || !this.j.computeScrollOffset()) {
            i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.j.getCurrX();
        int currY = this.j.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!E(currX)) {
                this.j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        k3.Z(this);
    }

    public void d(i iVar) {
        if (this.b0 == null) {
            this.b0 = new ArrayList();
        }
        this.b0.add(iVar);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || r(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f u2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (u2 = u(childAt)) != null && u2.b == this.f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z2 = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.e) != null && aVar.h() > 1)) {
            if (!this.Q.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.q * ((float) width));
                this.Q.setSize(height, width);
                z2 = false | this.Q.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.R.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.u + 1.0f)) * ((float) width2));
                this.R.setSize(height2, width2);
                z2 |= this.R.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.Q.finish();
            this.R.finish();
        }
        if (z2) {
            k3.Z(this);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.n;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void e(j jVar) {
        if (this.V == null) {
            this.V = new ArrayList();
        }
        this.V.add(jVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00de  */
    public boolean f(int i2) {
        View findNextFocus;
        boolean requestFocus;
        boolean z2;
        View findFocus = findFocus();
        boolean z3 = false;
        if (findFocus != this) {
            if (findFocus != null) {
                ViewParent parent = findFocus.getParent();
                while (true) {
                    if (!(parent instanceof ViewGroup)) {
                        z2 = false;
                        break;
                    } else if (parent == this) {
                        z2 = true;
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
                if (!z2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(findFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = findFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb.append(C0201.m82(31788));
                        sb.append(parent2.getClass().getSimpleName());
                    }
                    Log.e(C0201.m82(31790), C0201.m82(31789) + sb.toString());
                }
            }
            findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
            if (findNextFocus == null && findNextFocus != findFocus) {
                if (i2 == 17) {
                    int i3 = s(this.d, findNextFocus).left;
                    int i4 = s(this.d, findFocus).left;
                    if (findFocus == null || i3 < i4) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        requestFocus = C();
                    }
                } else if (i2 == 66) {
                    int i5 = s(this.d, findNextFocus).left;
                    int i6 = s(this.d, findFocus).left;
                    if (findFocus == null || i5 > i6) {
                        requestFocus = findNextFocus.requestFocus();
                    } else {
                        requestFocus = D();
                    }
                }
                z3 = requestFocus;
            } else if (i2 != 17 || i2 == 1) {
                z3 = C();
            } else if (i2 == 66 || i2 == 2) {
                z3 = D();
            }
            if (z3) {
                playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
            }
            return z3;
        }
        findFocus = null;
        findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i2);
        if (findNextFocus == null) {
        }
        if (i2 != 17) {
        }
        z3 = C();
        if (z3) {
        }
        return z3;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public a getAdapter() {
        return this.e;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        if (this.e0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) this.f0.get(i3).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.f;
    }

    public int getOffscreenPageLimit() {
        return this.z;
    }

    public int getPageMargin() {
        return this.m;
    }

    public boolean h(View view, boolean z2, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && h(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z2 || !view.canScrollHorizontally(-i2)) {
            return false;
        }
        return true;
    }

    public void j() {
        int h2 = this.e.h();
        this.a = h2;
        boolean z2 = this.b.size() < (this.z * 2) + 1 && this.b.size() < h2;
        int i2 = this.f;
        int i3 = 0;
        boolean z3 = false;
        while (i3 < this.b.size()) {
            f fVar = this.b.get(i3);
            int i4 = this.e.i(fVar.a);
            if (i4 != -1) {
                if (i4 == -2) {
                    this.b.remove(i3);
                    i3--;
                    if (!z3) {
                        this.e.v(this);
                        z3 = true;
                    }
                    this.e.e(this, fVar.b, fVar.a);
                    int i5 = this.f;
                    if (i5 == fVar.b) {
                        i2 = Math.max(0, Math.min(i5, h2 - 1));
                    }
                } else {
                    int i6 = fVar.b;
                    if (i6 != i4) {
                        if (i6 == this.f) {
                            i2 = i4;
                        }
                        fVar.b = i4;
                    }
                }
                z2 = true;
            }
            i3++;
        }
        if (z3) {
            this.e.g(this);
        }
        Collections.sort(this.b, j0);
        if (z2) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                g gVar = (g) getChildAt(i7).getLayoutParams();
                if (!gVar.a) {
                    gVar.c = 0.0f;
                }
            }
            Q(i2, false, true);
            requestLayout();
        }
    }

    public float o(float f2) {
        return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.g0);
        Scroller scroller = this.j;
        if (scroller != null && !scroller.isFinished()) {
            this.j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        float f2;
        float f3;
        super.onDraw(canvas);
        if (this.m > 0 && this.n != null && this.b.size() > 0 && this.e != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f4 = (float) width;
            float f5 = ((float) this.m) / f4;
            int i2 = 0;
            f fVar = this.b.get(0);
            float f6 = fVar.e;
            int size = this.b.size();
            int i3 = fVar.b;
            int i4 = this.b.get(size - 1).b;
            while (i3 < i4) {
                while (i3 > fVar.b && i2 < size) {
                    i2++;
                    fVar = this.b.get(i2);
                }
                if (i3 == fVar.b) {
                    float f7 = fVar.e;
                    float f8 = fVar.d;
                    f2 = (f7 + f8) * f4;
                    f6 = f7 + f8 + f5;
                } else {
                    float k2 = this.e.k(i3);
                    f2 = (f6 + k2) * f4;
                    f6 += k2 + f5;
                }
                if (((float) this.m) + f2 > ((float) scrollX)) {
                    f3 = f5;
                    this.n.setBounds(Math.round(f2), this.o, Math.round(((float) this.m) + f2), this.p);
                    this.n.draw(canvas);
                } else {
                    f3 = f5;
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i3++;
                    f5 = f3;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            N();
            return false;
        }
        if (action != 0) {
            if (this.A) {
                return true;
            }
            if (this.B) {
                return false;
            }
        }
        if (action == 0) {
            float x2 = motionEvent.getX();
            this.H = x2;
            this.F = x2;
            float y2 = motionEvent.getY();
            this.I = y2;
            this.G = y2;
            this.J = motionEvent.getPointerId(0);
            this.B = false;
            this.k = true;
            this.j.computeScrollOffset();
            if (this.h0 != 2 || Math.abs(this.j.getFinalX() - this.j.getCurrX()) <= this.O) {
                i(false);
                this.A = false;
            } else {
                this.j.abortAnimation();
                this.y = false;
                G();
                this.A = true;
                M(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.J;
            if (i2 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i2);
                float x3 = motionEvent.getX(findPointerIndex);
                float f2 = x3 - this.F;
                float abs = Math.abs(f2);
                float y3 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y3 - this.I);
                if (f2 == 0.0f || z(this.F, f2) || !h(this, false, (int) f2, (int) x3, (int) y3)) {
                    if (abs > ((float) this.E) && abs * 0.5f > abs2) {
                        this.A = true;
                        M(true);
                        setScrollState(1);
                        this.F = f2 > 0.0f ? this.H + ((float) this.E) : this.H - ((float) this.E);
                        this.G = y3;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) this.E)) {
                        this.B = true;
                    }
                    if (this.A && F(x3)) {
                        k3.Z(this);
                    }
                } else {
                    this.F = x3;
                    this.G = y3;
                    this.B = true;
                    return false;
                }
            }
        } else if (action == 6) {
            B(motionEvent);
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        return this.A;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        f u2;
        int i6;
        int i7;
        int i8;
        int i9;
        int childCount = getChildCount();
        int i10 = i4 - i2;
        int i11 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.a) {
                    int i14 = gVar.b;
                    int i15 = i14 & 7;
                    int i16 = i14 & 112;
                    if (i15 != 1) {
                        if (i15 == 3) {
                            i6 = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i15 != 5) {
                            i6 = paddingLeft;
                        } else {
                            i9 = (i10 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i16 == 16) {
                            if (i16 == 48) {
                                i7 = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i16 != 80) {
                                i7 = paddingTop;
                            } else {
                                i8 = (i11 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i17 = paddingLeft + scrollX;
                            childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, paddingTop + childAt.getMeasuredHeight());
                            i12++;
                            paddingTop = i7;
                            paddingLeft = i6;
                        } else {
                            i8 = Math.max((i11 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        i7 = paddingTop;
                        paddingTop = i8;
                        int i172 = paddingLeft + scrollX;
                        childAt.layout(i172, paddingTop, childAt.getMeasuredWidth() + i172, paddingTop + childAt.getMeasuredHeight());
                        i12++;
                        paddingTop = i7;
                        paddingLeft = i6;
                    } else {
                        i9 = Math.max((i10 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    i6 = paddingLeft;
                    paddingLeft = i9;
                    if (i16 == 16) {
                    }
                    i7 = paddingTop;
                    paddingTop = i8;
                    int i1722 = paddingLeft + scrollX;
                    childAt.layout(i1722, paddingTop, childAt.getMeasuredWidth() + i1722, paddingTop + childAt.getMeasuredHeight());
                    i12++;
                    paddingTop = i7;
                    paddingLeft = i6;
                }
            }
        }
        int i18 = (i10 - paddingLeft) - paddingRight;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.a && (u2 = u(childAt2)) != null) {
                    float f2 = (float) i18;
                    int i20 = ((int) (u2.e * f2)) + paddingLeft;
                    if (gVar2.d) {
                        gVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * gVar2.c), 1073741824), View.MeasureSpec.makeMeasureSpec((i11 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i20, paddingTop, childAt2.getMeasuredWidth() + i20, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.o = paddingTop;
        this.p = i11 - paddingBottom;
        this.U = i12;
        if (this.S) {
            z3 = false;
            O(this.f, false, 0, false);
        } else {
            z3 = false;
        }
        this.S = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    public void onMeasure(int i2, int i3) {
        g gVar;
        g gVar2;
        int i4;
        int i5;
        int i6;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i2), ViewGroup.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.D = Math.min(measuredWidth / 10, this.C);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i7 = 0;
        while (true) {
            boolean z2 = true;
            int i8 = 1073741824;
            if (i7 >= childCount) {
                break;
            }
            View childAt = getChildAt(i7);
            if (!(childAt.getVisibility() == 8 || (gVar2 = (g) childAt.getLayoutParams()) == null || !gVar2.a)) {
                int i9 = gVar2.b;
                int i10 = i9 & 7;
                int i11 = i9 & 112;
                boolean z3 = i11 == 48 || i11 == 80;
                if (!(i10 == 3 || i10 == 5)) {
                    z2 = false;
                }
                int i12 = C0188.f23;
                if (z3) {
                    i12 = 1073741824;
                } else if (z2) {
                    i4 = 1073741824;
                    i5 = ((ViewGroup.LayoutParams) gVar2).width;
                    if (i5 == -2) {
                        if (i5 == -1) {
                            i5 = paddingLeft;
                        }
                        i12 = 1073741824;
                    } else {
                        i5 = paddingLeft;
                    }
                    i6 = ((ViewGroup.LayoutParams) gVar2).height;
                    if (i6 != -2) {
                        i6 = measuredHeight;
                        i8 = i4;
                    } else if (i6 == -1) {
                        i6 = measuredHeight;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, i12), View.MeasureSpec.makeMeasureSpec(i6, i8));
                    if (!z3) {
                        measuredHeight -= childAt.getMeasuredHeight();
                    } else if (z2) {
                        paddingLeft -= childAt.getMeasuredWidth();
                    }
                }
                i4 = C0188.f23;
                i5 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i5 == -2) {
                }
                i6 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i6 != -2) {
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, i12), View.MeasureSpec.makeMeasureSpec(i6, i8));
                if (!z3) {
                }
            }
            i7++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.v = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.w = true;
        G();
        this.w = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * gVar.c), 1073741824), this.v);
            }
        }
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f u2;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i4 = 0;
            i3 = 1;
        } else {
            i4 = childCount - 1;
            i3 = -1;
        }
        while (i4 != i5) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() == 0 && (u2 = u(childAt)) != null && u2.b == this.f && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i4 += i3;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.a());
        a aVar = this.e;
        if (aVar != null) {
            aVar.p(mVar.d, mVar.e);
            Q(mVar.c, false, true);
            return;
        }
        this.g = mVar.c;
        this.h = mVar.d;
        this.i = mVar.e;
    }

    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.c = this.f;
        a aVar = this.e;
        if (aVar != null) {
            mVar.d = aVar.q();
        }
        return mVar;
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.m;
            I(i2, i4, i6, i6);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.P) {
            return true;
        }
        boolean z2 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.e) == null || aVar.h() == 0) {
            return false;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.j.abortAnimation();
            this.y = false;
            G();
            float x2 = motionEvent.getX();
            this.H = x2;
            this.F = x2;
            float y2 = motionEvent.getY();
            this.I = y2;
            this.G = y2;
            this.J = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.A) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.J);
                    if (findPointerIndex == -1) {
                        z2 = N();
                    } else {
                        float x3 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x3 - this.F);
                        float y3 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y3 - this.G);
                        if (abs > ((float) this.E) && abs > abs2) {
                            this.A = true;
                            M(true);
                            float f2 = this.H;
                            this.F = x3 - f2 > 0.0f ? f2 + ((float) this.E) : f2 - ((float) this.E);
                            this.G = y3;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.A) {
                    z2 = false | F(motionEvent.getX(motionEvent.findPointerIndex(this.J)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.F = motionEvent.getX(actionIndex);
                    this.J = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    B(motionEvent);
                    this.F = motionEvent.getX(motionEvent.findPointerIndex(this.J));
                }
            } else if (this.A) {
                O(this.f, true, 0, false);
                z2 = N();
            }
        } else if (this.A) {
            VelocityTracker velocityTracker = this.K;
            velocityTracker.computeCurrentVelocity(C0188.f18, (float) this.M);
            int xVelocity = (int) velocityTracker.getXVelocity(this.J);
            this.y = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f v2 = v();
            float f3 = (float) clientWidth;
            R(k(v2.b, ((((float) scrollX) / f3) - v2.e) / (v2.d + (((float) this.m) / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.J)) - this.H)), true, true, xVelocity);
            z2 = N();
        }
        if (z2) {
            k3.Z(this);
        }
        return true;
    }

    public boolean r(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return f(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return f(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return D();
                } else {
                    return f(66);
                }
            } else if (keyEvent.hasModifiers(2)) {
                return C();
            } else {
                return f(17);
            }
        }
        return false;
    }

    public void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(a aVar) {
        a aVar2 = this.e;
        if (aVar2 != null) {
            aVar2.t(null);
            this.e.v(this);
            for (int i2 = 0; i2 < this.b.size(); i2++) {
                f fVar = this.b.get(i2);
                this.e.e(this, fVar.b, fVar.a);
            }
            this.e.g(this);
            this.b.clear();
            J();
            this.f = 0;
            scrollTo(0, 0);
        }
        a aVar3 = this.e;
        this.e = aVar;
        this.a = 0;
        if (aVar != null) {
            if (this.l == null) {
                this.l = new l();
            }
            this.e.t(this.l);
            this.y = false;
            boolean z2 = this.S;
            this.S = true;
            this.a = this.e.h();
            if (this.g >= 0) {
                this.e.p(this.h, this.i);
                Q(this.g, false, true);
                this.g = -1;
                this.h = null;
                this.i = null;
            } else if (!z2) {
                G();
            } else {
                requestLayout();
            }
        }
        List<i> list = this.b0;
        if (!(list == null || list.isEmpty())) {
            int size = this.b0.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.b0.get(i3).a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i2) {
        this.y = false;
        Q(i2, !this.S, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w(C0201.m82(31793), C0201.m82(31791) + i2 + C0201.m82(31792) + 1);
            i2 = 1;
        }
        if (i2 != this.z) {
            this.z = i2;
            G();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.W = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.m;
        this.m = i2;
        int width = getWidth();
        I(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i2) {
        if (this.h0 != i2) {
            this.h0 = i2;
            if (this.c0 != null) {
                p(i2 != 0);
            }
            n(i2);
        }
    }

    public f t(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return u(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public f u(View view) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            f fVar = this.b.get(i2);
            if (this.e.m(view, fVar.a)) {
                return fVar;
            }
        }
        return null;
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.n;
    }

    public f w(int i2) {
        for (int i3 = 0; i3 < this.b.size(); i3++) {
            f fVar = this.b.get(i3);
            if (fVar.b == i2) {
                return fVar;
            }
        }
        return null;
    }

    public void x() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.j = new Scroller(context, k0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.E = viewConfiguration.getScaledPagingTouchSlop();
        this.L = (int) (400.0f * f2);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new EdgeEffect(context);
        this.R = new EdgeEffect(context);
        this.N = (int) (25.0f * f2);
        this.O = (int) (2.0f * f2);
        this.C = (int) (f2 * 16.0f);
        k3.h0(this, new h());
        if (k3.u(this) == 0) {
            k3.q0(this, 1);
        }
        k3.t0(this, new d());
    }

    public static class g extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        public float c = 0.0f;
        public boolean d;
        public int e;
        public int f;

        public g() {
            super(-1, -1);
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.i0);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(androidx.core.content.b.f(getContext(), i2));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        x();
    }
}
