package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import androidx.lifecycle.d;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import vigqyno.C0201;

/* compiled from: FragmentManagerImpl */
public final class j extends i implements LayoutInflater.Factory2 {
    public static boolean K;
    public static final Interpolator L = new DecelerateInterpolator(2.5f);
    public static final Interpolator M = new DecelerateInterpolator(1.5f);
    public static final String N = null;
    public static final String O = null;
    public static final String P = null;
    public static final String Q = null;
    public static final String R = null;
    public static final String S = null;
    public static final String T = null;
    public static final String U = null;
    public static final String V = null;
    public static final String W = null;
    public static final String X = null;
    public static final String Y = null;
    public static final String Z = null;
    public static final String a = null;
    public static final String aa = null;
    public static final String ab = null;
    public static final String ac = null;
    public static final String ad = null;
    public static final String ae = null;
    public static final String af = null;
    public static final String ag = null;
    public static final String ah = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public boolean A;
    public boolean B;
    public ArrayList<a> C;
    public ArrayList<Boolean> D;
    public ArrayList<Fragment> E;
    public Bundle F = null;
    public SparseArray<Parcelable> G = null;
    public ArrayList<m> H;
    private l I;
    public Runnable J = new b();
    public ArrayList<k> c;
    public boolean d;
    public int e = 0;
    public final ArrayList<Fragment> f = new ArrayList<>();
    public final HashMap<String, Fragment> g = new HashMap<>();
    public ArrayList<a> h;
    public ArrayList<Fragment> i;
    private OnBackPressedDispatcher j;
    private final androidx.activity.b k = new a(false);
    public ArrayList<a> l;
    public ArrayList<Integer> m;
    public ArrayList<i.b> n;
    private final CopyOnWriteArrayList<i> o = new CopyOnWriteArrayList<>();
    public int p = 0;
    public h q;
    public e u;
    public Fragment v;
    public Fragment w;
    public boolean x;
    public boolean y;
    public boolean z;

    /* compiled from: FragmentManagerImpl */
    class a extends androidx.activity.b {
        public a(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            j.this.B0();
        }
    }

    /* compiled from: FragmentManagerImpl */
    class b implements Runnable {
        public b() {
        }

        public void run() {
            j.this.l0();
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl */
    public class c implements Animation.AnimationListener {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ Fragment b;

        /* compiled from: FragmentManagerImpl */
        class a implements Runnable {
            public a() {
            }

            public void run() {
                if (c.this.b.getAnimatingAway() != null) {
                    c.this.b.setAnimatingAway(null);
                    c cVar = c.this;
                    j jVar = j.this;
                    Fragment fragment = cVar.b;
                    jVar.Q0(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
                }
            }
        }

        public c(ViewGroup viewGroup, Fragment fragment) {
            this.a = viewGroup;
            this.b = fragment;
        }

        public void onAnimationEnd(Animation animation) {
            this.a.post(new a());
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl */
    public class d extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Fragment c;

        public d(ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            Animator animator2 = this.c.getAnimator();
            this.c.setAnimator(null);
            if (animator2 != null && this.a.indexOfChild(this.b) < 0) {
                j jVar = j.this;
                Fragment fragment = this.c;
                jVar.Q0(fragment, fragment.getStateAfterAnimating(), 0, 0, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl */
    public class e extends AnimatorListenerAdapter {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Fragment c;

        public e(j jVar, ViewGroup viewGroup, View view, Fragment fragment) {
            this.a = viewGroup;
            this.b = view;
            this.c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.endViewTransition(this.b);
            animator.removeListener(this);
            Fragment fragment = this.c;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                view.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl */
    public class f extends g {
        public f() {
        }

        @Override // androidx.fragment.app.g
        public Fragment a(ClassLoader classLoader, String str) {
            h hVar = j.this.q;
            return hVar.a(hVar.f(), str, null);
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: FragmentManagerImpl */
    public static final class i {
        public final i.a a;
        public final boolean b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.j$j  reason: collision with other inner class name */
    /* compiled from: FragmentManagerImpl */
    public static class C0017j {
        public static final int[] a = {16842755, 16842960, 16842961};
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl */
    public interface k {
        boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* compiled from: FragmentManagerImpl */
    private class l implements k {
        public final String a;
        public final int b;
        public final int c;

        public l(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        @Override // androidx.fragment.app.j.k
        public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = j.this.w;
            if (fragment == null || this.b >= 0 || this.a != null || !fragment.getChildFragmentManager().h()) {
                return j.this.U0(arrayList, arrayList2, this.a, this.b, this.c);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: FragmentManagerImpl */
    public static class m implements Fragment.f {
        public final boolean a;
        public final a b;
        private int c;

        public m(a aVar, boolean z) {
            this.a = z;
            this.b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void a() {
            this.c++;
        }

        @Override // androidx.fragment.app.Fragment.f
        public void b() {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                this.b.r.g1();
            }
        }

        public void c() {
            a aVar = this.b;
            aVar.r.v(aVar, this.a, false, false);
        }

        public void d() {
            boolean z = this.c > 0;
            j jVar = this.b.r;
            int size = jVar.f.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = jVar.f.get(i);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            a aVar = this.b;
            aVar.r.v(aVar, this.a, !z, true);
        }

        public boolean e() {
            return this.c == 0;
        }
    }

    static {
        C0201.m83(j.class, 57);
    }

    private boolean E0(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.s();
    }

    public static g J0(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(M);
        alphaAnimation.setDuration(220);
        return new g(alphaAnimation);
    }

    public static g L0(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(L);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(M);
        alphaAnimation.setDuration(220);
        animationSet.addAnimation(alphaAnimation);
        return new g(animationSet);
    }

    private void M0(s0<Fragment> s0Var) {
        int size = s0Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment i3 = s0Var.i(i2);
            if (!i3.mAdded) {
                View requireView = i3.requireView();
                i3.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    private boolean T0(String str, int i2, int i3) {
        l0();
        j0(true);
        Fragment fragment = this.w;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().h()) {
            return true;
        }
        boolean U0 = U0(this.C, this.D, str, i2, i3);
        if (U0) {
            this.d = true;
            try {
                Y0(this.C, this.D);
            } finally {
                u();
            }
        }
        o1();
        g0();
        r();
        return U0;
    }

    private int V0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, s0<Fragment> s0Var) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            a aVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.s() && !aVar.q(arrayList, i5 + 1, i3)) {
                if (this.H == null) {
                    this.H = new ArrayList<>();
                }
                m mVar = new m(aVar, booleanValue);
                this.H.add(mVar);
                aVar.u(mVar);
                if (booleanValue) {
                    aVar.l();
                } else {
                    aVar.m(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                j(s0Var);
            }
        }
        return i4;
    }

    private void X(Fragment fragment) {
        if (fragment != null && this.g.get(fragment.mWho) == fragment) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    private void Y0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null && !arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
                throw new IllegalStateException(C0201.m82(18709));
            }
            o0(arrayList, arrayList2);
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                if (!arrayList.get(i2).p) {
                    if (i3 != i2) {
                        n0(arrayList, arrayList2, i3, i2);
                    }
                    i3 = i2 + 1;
                    if (arrayList2.get(i2).booleanValue()) {
                        while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).p) {
                            i3++;
                        }
                    }
                    n0(arrayList, arrayList2, i2, i3);
                    i2 = i3 - 1;
                }
                i2++;
            }
            if (i3 != size) {
                n0(arrayList, arrayList2, i3, size);
            }
        }
    }

    public static int c1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* JADX INFO: finally extract failed */
    private void e0(int i2) {
        try {
            this.d = true;
            O0(i2, false);
            this.d = false;
            l0();
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    private void h0() {
        for (Fragment fragment : this.g.values()) {
            if (fragment != null) {
                if (fragment.getAnimatingAway() != null) {
                    int stateAfterAnimating = fragment.getStateAfterAnimating();
                    View animatingAway = fragment.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    fragment.setAnimatingAway(null);
                    Q0(fragment, stateAfterAnimating, 0, 0, false);
                } else if (fragment.getAnimator() != null) {
                    fragment.getAnimator().end();
                }
            }
        }
    }

    private void j(s0<Fragment> s0Var) {
        int i2 = this.p;
        if (i2 >= 1) {
            int min = Math.min(i2, 3);
            int size = this.f.size();
            for (int i3 = 0; i3 < size; i3++) {
                Fragment fragment = this.f.get(i3);
                if (fragment.mState < min) {
                    Q0(fragment, min, fragment.getNextAnim(), fragment.getNextTransition(), false);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        s0Var.add(fragment);
                    }
                }
            }
        }
    }

    private void j0(boolean z2) {
        if (this.d) {
            throw new IllegalStateException(C0201.m82(18712));
        } else if (this.q == null) {
            throw new IllegalStateException(C0201.m82(18711));
        } else if (Looper.myLooper() == this.q.g().getLooper()) {
            if (!z2) {
                t();
            }
            if (this.C == null) {
                this.C = new ArrayList<>();
                this.D = new ArrayList<>();
            }
            this.d = true;
            try {
                o0(null, null);
            } finally {
                this.d = false;
            }
        } else {
            throw new IllegalStateException(C0201.m82(18710));
        }
    }

    private static void m0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            a aVar = arrayList.get(i2);
            boolean z2 = true;
            if (arrayList2.get(i2).booleanValue()) {
                aVar.h(-1);
                if (i2 != i3 - 1) {
                    z2 = false;
                }
                aVar.m(z2);
            } else {
                aVar.h(1);
                aVar.l();
            }
            i2++;
        }
    }

    private void m1(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        String r1 = C0201.m82(18713);
        Log.e(r1, message);
        Log.e(r1, C0201.m82(18714));
        PrintWriter printWriter = new PrintWriter(new androidx.core.util.b(r1));
        h hVar = this.q;
        String r3 = C0201.m82(18715);
        String r6 = C0201.m82(18716);
        if (hVar != null) {
            try {
                hVar.i(r6, null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e(r1, r3, e2);
            }
        } else {
            try {
                b(r6, null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e(r1, r3, e3);
            }
        }
        throw runtimeException;
    }

    private void n0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        boolean z2 = arrayList.get(i6).p;
        ArrayList<Fragment> arrayList3 = this.E;
        if (arrayList3 == null) {
            this.E = new ArrayList<>();
        } else {
            arrayList3.clear();
        }
        this.E.addAll(this.f);
        Fragment z0 = z0();
        boolean z3 = false;
        for (int i7 = i6; i7 < i3; i7++) {
            a aVar = arrayList.get(i7);
            if (!arrayList2.get(i7).booleanValue()) {
                z0 = aVar.n(this.E, z0);
            } else {
                z0 = aVar.v(this.E, z0);
            }
            z3 = z3 || aVar.h;
        }
        this.E.clear();
        if (!z2) {
            o.C(this, arrayList, arrayList2, i2, i3, false);
        }
        m0(arrayList, arrayList2, i2, i3);
        if (z2) {
            s0<Fragment> s0Var = new s0<>();
            j(s0Var);
            int V0 = V0(arrayList, arrayList2, i2, i3, s0Var);
            M0(s0Var);
            i4 = V0;
        } else {
            i4 = i3;
        }
        if (i4 != i6 && z2) {
            o.C(this, arrayList, arrayList2, i2, i4, true);
            O0(this.p, true);
        }
        while (i6 < i3) {
            a aVar2 = arrayList.get(i6);
            if (arrayList2.get(i6).booleanValue() && (i5 = aVar2.t) >= 0) {
                t0(i5);
                aVar2.t = -1;
            }
            aVar2.t();
            i6++;
        }
        if (z3) {
            a1();
        }
    }

    public static int n1(int i2, boolean z2) {
        if (i2 == 4097) {
            return z2 ? 1 : 2;
        }
        if (i2 == 4099) {
            return z2 ? 5 : 6;
        }
        if (i2 != 8194) {
            return -1;
        }
        return z2 ? 3 : 4;
    }

    private void o(Fragment fragment, g gVar, int i2) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        fragment.setStateAfterAnimating(i2);
        if (gVar.a != null) {
            h hVar = new h(gVar.a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            hVar.setAnimationListener(new c(viewGroup, fragment));
            fragment.mView.startAnimation(hVar);
            return;
        }
        Animator animator = gVar.b;
        fragment.setAnimator(animator);
        animator.addListener(new d(viewGroup, view, fragment));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    private void o0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList<m> arrayList3 = this.H;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            m mVar = this.H.get(i2);
            if (arrayList != null && !mVar.a && (indexOf2 = arrayList.indexOf(mVar.b)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                this.H.remove(i2);
                i2--;
                size--;
                mVar.c();
            } else if (mVar.e() || (arrayList != null && mVar.b.q(arrayList, 0, arrayList.size()))) {
                this.H.remove(i2);
                i2--;
                size--;
                if (arrayList == null || mVar.a || (indexOf = arrayList.indexOf(mVar.b)) == -1 || !arrayList2.get(indexOf).booleanValue()) {
                    mVar.d();
                } else {
                    mVar.c();
                }
            }
            i2++;
        }
    }

    private void o1() {
        ArrayList<k> arrayList = this.c;
        boolean z2 = true;
        if (arrayList == null || arrayList.isEmpty()) {
            androidx.activity.b bVar = this.k;
            if (v0() <= 0 || !F0(this.v)) {
                z2 = false;
            }
            bVar.f(z2);
            return;
        }
        this.k.f(true);
    }

    private void r() {
        this.g.values().removeAll(Collections.singleton(null));
    }

    private Fragment r0(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = this.f.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    private void s0() {
        if (this.H != null) {
            while (!this.H.isEmpty()) {
                this.H.remove(0).d();
            }
        }
    }

    private void t() {
        if (f()) {
            throw new IllegalStateException(C0201.m82(18717));
        }
    }

    private void u() {
        this.d = false;
        this.D.clear();
        this.C.clear();
    }

    private boolean u0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.c != null) {
                if (this.c.size() != 0) {
                    int size = this.c.size();
                    boolean z2 = false;
                    for (int i2 = 0; i2 < size; i2++) {
                        z2 |= this.c.get(i2).a(arrayList, arrayList2);
                    }
                    this.c.clear();
                    this.q.g().removeCallbacks(this.J);
                    return z2;
                }
            }
            return false;
        }
    }

    public boolean A(MenuItem menuItem) {
        if (this.p < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public r A0(Fragment fragment) {
        return this.I.i(fragment);
    }

    public void B() {
        this.y = false;
        this.z = false;
        e0(1);
    }

    public void B0() {
        l0();
        if (this.k.c()) {
            h();
        } else {
            this.j.c();
        }
    }

    public boolean C(Menu menu, MenuInflater menuInflater) {
        if (this.p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.i != null) {
            for (int i3 = 0; i3 < this.i.size(); i3++) {
                Fragment fragment2 = this.i.get(i3);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.i = arrayList;
        return z2;
    }

    public void C0(Fragment fragment) {
        if (K) {
            Log.v(C0201.m82(18719), C0201.m82(18718) + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        }
    }

    public void D() {
        this.A = true;
        l0();
        e0(0);
        this.q = null;
        this.u = null;
        this.v = null;
        if (this.j != null) {
            this.k.d();
            this.j = null;
        }
    }

    public boolean D0() {
        return this.A;
    }

    public void E() {
        e0(1);
    }

    public void F() {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    public boolean F0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        j jVar = fragment.mFragmentManager;
        if (fragment != jVar.z0() || !F0(jVar.v)) {
            return false;
        }
        return true;
    }

    public void G(boolean z2) {
        for (int size = this.f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z2);
            }
        }
    }

    public boolean G0(int i2) {
        return this.p >= i2;
    }

    public void H(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).H(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.a(this, fragment, bundle);
            }
        }
    }

    public g H0(Fragment fragment, int i2, boolean z2, int i3) {
        int n1;
        int nextAnim = fragment.getNextAnim();
        boolean z3 = false;
        fragment.setNextAnim(0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(i2, z2, nextAnim);
        if (onCreateAnimation != null) {
            return new g(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(i2, z2, nextAnim);
        if (onCreateAnimator != null) {
            return new g(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = C0201.m82(18720).equals(this.q.f().getResources().getResourceTypeName(nextAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.q.f(), nextAnim);
                    if (loadAnimation != null) {
                        return new g(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.q.f(), nextAnim);
                    if (loadAnimator != null) {
                        return new g(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(this.q.f(), nextAnim);
                        if (loadAnimation2 != null) {
                            return new g(loadAnimation2);
                        }
                    } else {
                        throw e3;
                    }
                }
            }
        }
        if (i2 == 0 || (n1 = n1(i2, z2)) < 0) {
            return null;
        }
        switch (n1) {
            case 1:
                return L0(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return L0(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return L0(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return L0(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                return J0(0.0f, 1.0f);
            case 6:
                return J0(1.0f, 0.0f);
            default:
                if (i3 == 0 && this.q.m()) {
                    i3 = this.q.l();
                }
                if (i3 == 0) {
                }
                return null;
        }
    }

    public void I(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).I(fragment, context, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.b(this, fragment, context);
            }
        }
    }

    public void I0(Fragment fragment) {
        if (this.g.get(fragment.mWho) == null) {
            this.g.put(fragment.mWho, fragment);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    m(fragment);
                } else {
                    Z0(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (K) {
                Log.v(C0201.m82(18722), C0201.m82(18721) + fragment);
            }
        }
    }

    public void J(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).J(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.c(this, fragment, bundle);
            }
        }
    }

    public void K(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).K(fragment, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.d(this, fragment);
            }
        }
    }

    public void K0(Fragment fragment) {
        if (this.g.get(fragment.mWho) != null) {
            if (K) {
                Log.v(C0201.m82(18724), C0201.m82(18723) + fragment);
            }
            for (Fragment fragment2 : this.g.values()) {
                if (fragment2 != null && fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
            this.g.put(fragment.mWho, null);
            Z0(fragment);
            String str = fragment.mTargetWho;
            if (str != null) {
                fragment.mTarget = this.g.get(str);
            }
            fragment.initState();
        }
    }

    public void L(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).L(fragment, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.e(this, fragment);
            }
        }
    }

    public void M(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).M(fragment, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.f(this, fragment);
            }
        }
    }

    public void N(Fragment fragment, Context context, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).N(fragment, context, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.g(this, fragment, context);
            }
        }
    }

    public void N0(Fragment fragment) {
        ViewGroup viewGroup;
        int indexOfChild;
        int indexOfChild2;
        if (fragment != null) {
            if (this.g.containsKey(fragment.mWho)) {
                int i2 = this.p;
                if (fragment.mRemoving) {
                    if (fragment.isInBackStack()) {
                        i2 = Math.min(i2, 1);
                    } else {
                        i2 = Math.min(i2, 0);
                    }
                }
                Q0(fragment, i2, fragment.getNextTransition(), fragment.getNextTransitionStyle(), false);
                if (fragment.mView != null) {
                    Fragment r0 = r0(fragment);
                    if (r0 != null && (indexOfChild2 = viewGroup.indexOfChild(fragment.mView)) < (indexOfChild = (viewGroup = fragment.mContainer).indexOfChild(r0.mView))) {
                        viewGroup.removeViewAt(indexOfChild2);
                        viewGroup.addView(fragment.mView, indexOfChild);
                    }
                    if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                        float f2 = fragment.mPostponedAlpha;
                        if (f2 > 0.0f) {
                            fragment.mView.setAlpha(f2);
                        }
                        fragment.mPostponedAlpha = 0.0f;
                        fragment.mIsNewlyAdded = false;
                        g H0 = H0(fragment, fragment.getNextTransition(), true, fragment.getNextTransitionStyle());
                        if (H0 != null) {
                            Animation animation = H0.a;
                            if (animation != null) {
                                fragment.mView.startAnimation(animation);
                            } else {
                                H0.b.setTarget(fragment.mView);
                                H0.b.start();
                            }
                        }
                    }
                }
                if (fragment.mHiddenChanged) {
                    w(fragment);
                }
            } else if (K) {
                Log.v(C0201.m82(18728), C0201.m82(18725) + fragment + C0201.m82(18726) + this.p + C0201.m82(18727) + this);
            }
        }
    }

    public void O(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).O(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.h(this, fragment, bundle);
            }
        }
    }

    public void O0(int i2, boolean z2) {
        h hVar;
        if (this.q == null && i2 != 0) {
            throw new IllegalStateException(C0201.m82(18729));
        } else if (z2 || i2 != this.p) {
            this.p = i2;
            int size = this.f.size();
            for (int i3 = 0; i3 < size; i3++) {
                N0(this.f.get(i3));
            }
            for (Fragment fragment : this.g.values()) {
                if (fragment != null && ((fragment.mRemoving || fragment.mDetached) && !fragment.mIsNewlyAdded)) {
                    N0(fragment);
                }
            }
            l1();
            if (this.x && (hVar = this.q) != null && this.p == 4) {
                hVar.s();
                this.x = false;
            }
        }
    }

    public void P(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).P(fragment, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.i(this, fragment);
            }
        }
    }

    public void P0(Fragment fragment) {
        Q0(fragment, this.p, 0, 0, false);
    }

    public void Q(Fragment fragment, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).Q(fragment, bundle, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.j(this, fragment, bundle);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
        if (r0 != 3) goto L_0x04d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:264:? A[RETURN, SYNTHETIC] */
    public void Q0(Fragment fragment, int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        Fragment fragment2;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        String str;
        String str2;
        String str3;
        int i7;
        int i8 = 1;
        boolean z3 = true;
        boolean z4 = true;
        if (!fragment.mAdded || fragment.mDetached) {
            i5 = i2;
            if (i5 > 1) {
                i5 = 1;
            }
        } else {
            i5 = i2;
        }
        if (fragment.mRemoving && i5 > (i7 = fragment.mState)) {
            if (i7 != 0 || !fragment.isInBackStack()) {
                i5 = fragment.mState;
            } else {
                i5 = 1;
            }
        }
        if (fragment.mDeferStart && fragment.mState < 3 && i5 > 2) {
            i5 = 2;
        }
        d.b bVar = fragment.mMaxState;
        if (bVar == d.b.CREATED) {
            i6 = Math.min(i5, 1);
        } else {
            i6 = Math.min(i5, bVar.ordinal());
        }
        int i9 = i6;
        int i10 = fragment.mState;
        String str4 = aa;
        if (i10 <= i9) {
            if (!fragment.mFromLayout || fragment.mInLayout) {
                if (!(fragment.getAnimatingAway() == null && fragment.getAnimator() == null)) {
                    fragment.setAnimatingAway(null);
                    fragment.setAnimator(null);
                    Q0(fragment, fragment.getStateAfterAnimating(), 0, 0, true);
                }
                int i11 = fragment.mState;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                        }
                        if (i9 > 2) {
                            if (K) {
                                Log.v(str4, X + fragment);
                            }
                            fragment.performStart();
                            R(fragment, false);
                        }
                    }
                    if (i9 > 0) {
                        k0(fragment);
                    }
                    if (i9 > 1) {
                        if (K) {
                            Log.v(str4, N + fragment);
                        }
                        if (!fragment.mFromLayout) {
                            int i12 = fragment.mContainerId;
                            if (i12 == 0) {
                                viewGroup2 = null;
                            } else if (i12 != -1) {
                                viewGroup2 = (ViewGroup) this.u.c(i12);
                                if (viewGroup2 == null && !fragment.mRestored) {
                                    try {
                                        str = fragment.getResources().getResourceName(fragment.mContainerId);
                                    } catch (Resources.NotFoundException unused) {
                                        str = ag;
                                    }
                                    m1(new IllegalArgumentException(ab + Integer.toHexString(fragment.mContainerId) + Z + str + ac + fragment));
                                    throw null;
                                }
                            } else {
                                m1(new IllegalArgumentException(P + fragment + R));
                                throw null;
                            }
                            fragment.mContainer = viewGroup2;
                            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), viewGroup2, fragment.mSavedFragmentState);
                            View view = fragment.mView;
                            if (view != null) {
                                fragment.mInnerView = view;
                                view.setSaveFromParentEnabled(false);
                                if (viewGroup2 != null) {
                                    viewGroup2.addView(fragment.mView);
                                }
                                if (fragment.mHidden) {
                                    fragment.mView.setVisibility(8);
                                }
                                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                                T(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                                if (fragment.mView.getVisibility() != 0 || fragment.mContainer == null) {
                                    z3 = false;
                                }
                                fragment.mIsNewlyAdded = z3;
                            } else {
                                fragment.mInnerView = null;
                            }
                        }
                        fragment.performActivityCreated(fragment.mSavedFragmentState);
                        H(fragment, fragment.mSavedFragmentState, false);
                        if (fragment.mView != null) {
                            fragment.restoreViewState(fragment.mSavedFragmentState);
                        }
                        fragment.mSavedFragmentState = null;
                    }
                    if (i9 > 2) {
                    }
                } else {
                    if (i9 > 0) {
                        if (K) {
                            Log.v(str4, V + fragment);
                        }
                        Bundle bundle = fragment.mSavedFragmentState;
                        if (bundle != null) {
                            bundle.setClassLoader(this.q.f().getClassLoader());
                            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(t);
                            Fragment x0 = x0(fragment.mSavedFragmentState, ad);
                            String str5 = x0 != null ? x0.mWho : null;
                            fragment.mTargetWho = str5;
                            if (str5 != null) {
                                fragment.mTargetRequestCode = fragment.mSavedFragmentState.getInt(S, 0);
                            }
                            Boolean bool = fragment.mSavedUserVisibleHint;
                            if (bool != null) {
                                fragment.mUserVisibleHint = bool.booleanValue();
                                fragment.mSavedUserVisibleHint = null;
                            } else {
                                fragment.mUserVisibleHint = fragment.mSavedFragmentState.getBoolean(r, true);
                            }
                            if (!fragment.mUserVisibleHint) {
                                fragment.mDeferStart = true;
                                if (i9 > 2) {
                                    i9 = 2;
                                }
                            }
                        }
                        h hVar = this.q;
                        fragment.mHost = hVar;
                        Fragment fragment3 = this.v;
                        fragment.mParentFragment = fragment3;
                        fragment.mFragmentManager = fragment3 != null ? fragment3.mChildFragmentManager : hVar.e;
                        Fragment fragment4 = fragment.mTarget;
                        String str6 = ae;
                        String str7 = Y;
                        String str8 = a;
                        if (fragment4 != null) {
                            Fragment fragment5 = this.g.get(fragment4.mWho);
                            Fragment fragment6 = fragment.mTarget;
                            if (fragment5 == fragment6) {
                                if (fragment6.mState < 1) {
                                    str3 = str8;
                                    str2 = str7;
                                    Q0(fragment6, 1, 0, 0, true);
                                } else {
                                    str3 = str8;
                                    str2 = str7;
                                }
                                fragment.mTargetWho = fragment.mTarget.mWho;
                                fragment.mTarget = null;
                            } else {
                                throw new IllegalStateException(str8 + fragment + str7 + fragment.mTarget + str6);
                            }
                        } else {
                            str3 = str8;
                            str2 = str7;
                        }
                        String str9 = fragment.mTargetWho;
                        if (str9 != null) {
                            Fragment fragment7 = this.g.get(str9);
                            if (fragment7 == null) {
                                throw new IllegalStateException(str3 + fragment + str2 + fragment.mTargetWho + str6);
                            } else if (fragment7.mState < 1) {
                                Q0(fragment7, 1, 0, 0, true);
                            }
                        }
                        N(fragment, this.q.f(), false);
                        fragment.performAttach();
                        Fragment fragment8 = fragment.mParentFragment;
                        if (fragment8 == null) {
                            this.q.h(fragment);
                        } else {
                            fragment8.onAttachFragment(fragment);
                        }
                        I(fragment, this.q.f(), false);
                        if (!fragment.mIsCreated) {
                            O(fragment, fragment.mSavedFragmentState, false);
                            fragment.performCreate(fragment.mSavedFragmentState);
                            J(fragment, fragment.mSavedFragmentState, false);
                        } else {
                            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
                            fragment.mState = 1;
                        }
                    }
                    if (i9 > 0) {
                    }
                    if (i9 > 1) {
                    }
                    if (i9 > 2) {
                    }
                }
                if (i9 > 3) {
                    if (K) {
                        Log.v(str4, O + fragment);
                    }
                    fragment.performResume();
                    P(fragment, false);
                    fragment.mSavedFragmentState = null;
                    fragment.mSavedViewState = null;
                }
            } else {
                return;
            }
        } else if (i10 > i9) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            if (i9 < 4) {
                                if (K) {
                                    Log.v(str4, ah + fragment);
                                }
                                fragment.performPause();
                                M(fragment, false);
                            }
                        }
                    }
                    if (i9 < 3) {
                        if (K) {
                            Log.v(str4, T + fragment);
                        }
                        fragment.performStop();
                        S(fragment, false);
                    }
                }
                if (i9 < 2) {
                    if (K) {
                        Log.v(str4, U + fragment);
                    }
                    if (fragment.mView != null && this.q.o(fragment) && fragment.mSavedViewState == null) {
                        f1(fragment);
                    }
                    fragment.performDestroyView();
                    U(fragment, false);
                    View view2 = fragment.mView;
                    if (!(view2 == null || (viewGroup = fragment.mContainer) == null)) {
                        viewGroup.endViewTransition(view2);
                        fragment.mView.clearAnimation();
                        if (fragment.getParentFragment() == null || !fragment.getParentFragment().mRemoving) {
                            g H0 = (this.p <= 0 || this.A || fragment.mView.getVisibility() != 0 || fragment.mPostponedAlpha < 0.0f) ? null : H0(fragment, i3, false, i4);
                            fragment.mPostponedAlpha = 0.0f;
                            if (H0 != null) {
                                o(fragment, H0, i9);
                            }
                            fragment.mContainer.removeView(fragment.mView);
                        }
                    }
                    fragment.mContainer = null;
                    fragment.mView = null;
                    fragment.mViewLifecycleOwner = null;
                    fragment.mViewLifecycleOwnerLiveData.l(null);
                    fragment.mInnerView = null;
                    fragment.mInLayout = false;
                }
            }
            if (i9 < 1) {
                if (this.A) {
                    if (fragment.getAnimatingAway() != null) {
                        View animatingAway = fragment.getAnimatingAway();
                        fragment.setAnimatingAway(null);
                        animatingAway.clearAnimation();
                    } else if (fragment.getAnimator() != null) {
                        Animator animator = fragment.getAnimator();
                        fragment.setAnimator(null);
                        animator.cancel();
                    }
                }
                if (fragment.getAnimatingAway() == null && fragment.getAnimator() == null) {
                    if (K) {
                        Log.v(str4, W + fragment);
                    }
                    boolean z5 = fragment.mRemoving && !fragment.isInBackStack();
                    if (z5 || this.I.l(fragment)) {
                        h hVar2 = this.q;
                        if (hVar2 instanceof s) {
                            z4 = this.I.j();
                        } else if (hVar2.f() instanceof Activity) {
                            z4 = true ^ ((Activity) this.q.f()).isChangingConfigurations();
                        }
                        if (z5 || z4) {
                            this.I.e(fragment);
                        }
                        fragment.performDestroy();
                        K(fragment, false);
                    } else {
                        fragment.mState = 0;
                    }
                    fragment.performDetach();
                    L(fragment, false);
                    if (!z2) {
                        if (z5 || this.I.l(fragment)) {
                            K0(fragment);
                        } else {
                            fragment.mHost = null;
                            fragment.mParentFragment = null;
                            fragment.mFragmentManager = null;
                            String str10 = fragment.mTargetWho;
                            if (!(str10 == null || (fragment2 = this.g.get(str10)) == null || !fragment2.getRetainInstance())) {
                                fragment.mTarget = fragment2;
                            }
                        }
                    }
                } else {
                    fragment.setStateAfterAnimating(i9);
                    if (fragment.mState == i8) {
                        Log.w(str4, Q + fragment + af + i8 + s + fragment.mState);
                        fragment.mState = i8;
                        return;
                    }
                    return;
                }
            }
        }
        i8 = i9;
        if (fragment.mState == i8) {
        }
    }

    public void R(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).R(fragment, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.k(this, fragment);
            }
        }
    }

    public void R0() {
        this.y = false;
        this.z = false;
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public void S(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).S(fragment, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.l(this, fragment);
            }
        }
    }

    public void S0(Fragment fragment) {
        if (!fragment.mDeferStart) {
            return;
        }
        if (this.d) {
            this.B = true;
            return;
        }
        fragment.mDeferStart = false;
        Q0(fragment, this.p, 0, 0, false);
    }

    public void T(Fragment fragment, View view, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).T(fragment, view, bundle, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.m(this, fragment, view, bundle);
            }
        }
    }

    public void U(Fragment fragment, boolean z2) {
        Fragment fragment2 = this.v;
        if (fragment2 != null) {
            i fragmentManager = fragment2.getFragmentManager();
            if (fragmentManager instanceof j) {
                ((j) fragmentManager).U(fragment, true);
            }
        }
        Iterator<i> it = this.o.iterator();
        while (it.hasNext()) {
            i next = it.next();
            if (!z2 || next.b) {
                next.a.n(this, fragment);
            }
        }
    }

    public boolean U0(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<a> arrayList3 = this.h;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.h.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = this.h.size() - 1;
                while (size2 >= 0) {
                    a aVar = this.h.get(size2);
                    if ((str != null && str.equals(aVar.o())) || (i2 >= 0 && i2 == aVar.t)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        a aVar2 = this.h.get(size2);
                        if ((str == null || !str.equals(aVar2.o())) && (i2 < 0 || i2 != aVar2.t)) {
                            break;
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.h.size() - 1) {
                return false;
            }
            for (int size3 = this.h.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.h.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public boolean V(MenuItem menuItem) {
        if (this.p < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void W(Menu menu) {
        if (this.p >= 1) {
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                Fragment fragment = this.f.get(i2);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public void W0(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
            return;
        }
        m1(new IllegalStateException(C0201.m82(18730) + fragment + C0201.m82(18731)));
        throw null;
    }

    public void X0(Fragment fragment) {
        if (K) {
            Log.v(C0201.m82(18732), C0201.m82(18733) + fragment + C0201.m82(18734) + fragment.mBackStackNesting);
        }
        boolean z2 = !fragment.isInBackStack();
        if (!fragment.mDetached || z2) {
            synchronized (this.f) {
                this.f.remove(fragment);
            }
            if (E0(fragment)) {
                this.x = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
        }
    }

    public void Y() {
        e0(3);
    }

    public void Z(boolean z2) {
        for (int size = this.f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z2);
            }
        }
    }

    public void Z0(Fragment fragment) {
        boolean f2 = f();
        String r1 = C0201.m82(18735);
        if (f2) {
            if (K) {
                Log.v(r1, C0201.m82(18736));
            }
        } else if (this.I.k(fragment) && K) {
            Log.v(r1, C0201.m82(18737) + fragment);
        }
    }

    @Override // androidx.fragment.app.i
    public n a() {
        return new a(this);
    }

    public boolean a0(Menu menu) {
        if (this.p < 1) {
            return false;
        }
        boolean z2 = false;
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    public void a1() {
        if (this.n != null) {
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                this.n.get(i2).a();
            }
        }
    }

    @Override // androidx.fragment.app.i
    public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        String str2 = str + C0201.m82(18738);
        if (!this.g.isEmpty()) {
            printWriter.print(str);
            printWriter.print(C0201.m82(18739));
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(C0201.m82(18740));
            for (Fragment fragment : this.g.values()) {
                printWriter.print(str);
                printWriter.println(fragment);
                if (fragment != null) {
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println(C0201.m82(18741));
            for (int i2 = 0; i2 < size5; i2++) {
                printWriter.print(str);
                printWriter.print(C0201.m82(18742));
                printWriter.print(i2);
                printWriter.print(C0201.m82(18743));
                printWriter.println(this.f.get(i2).toString());
            }
        }
        ArrayList<Fragment> arrayList = this.i;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println(C0201.m82(18744));
            for (int i3 = 0; i3 < size4; i3++) {
                printWriter.print(str);
                printWriter.print(C0201.m82(18745));
                printWriter.print(i3);
                printWriter.print(C0201.m82(18746));
                printWriter.println(this.i.get(i3).toString());
            }
        }
        ArrayList<a> arrayList2 = this.h;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println(C0201.m82(18747));
            for (int i4 = 0; i4 < size3; i4++) {
                a aVar = this.h.get(i4);
                printWriter.print(str);
                printWriter.print(C0201.m82(18748));
                printWriter.print(i4);
                printWriter.print(C0201.m82(18749));
                printWriter.println(aVar.toString());
                aVar.j(str2, printWriter);
            }
        }
        synchronized (this) {
            if (this.l != null && (size2 = this.l.size()) > 0) {
                printWriter.print(str);
                printWriter.println(C0201.m82(18750));
                for (int i5 = 0; i5 < size2; i5++) {
                    printWriter.print(str);
                    printWriter.print(C0201.m82(18751));
                    printWriter.print(i5);
                    printWriter.print(C0201.m82(18752));
                    printWriter.println((a) this.l.get(i5));
                }
            }
            if (this.m != null && this.m.size() > 0) {
                printWriter.print(str);
                printWriter.print(C0201.m82(18753));
                printWriter.println(Arrays.toString(this.m.toArray()));
            }
        }
        ArrayList<k> arrayList3 = this.c;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println(C0201.m82(18754));
            for (int i6 = 0; i6 < size; i6++) {
                printWriter.print(str);
                printWriter.print(C0201.m82(18755));
                printWriter.print(i6);
                printWriter.print(C0201.m82(18756));
                printWriter.println((k) this.c.get(i6));
            }
        }
        printWriter.print(str);
        printWriter.println(C0201.m82(18757));
        printWriter.print(str);
        printWriter.print(C0201.m82(18758));
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print(C0201.m82(18759));
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(18760));
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print(C0201.m82(18761));
        printWriter.print(this.p);
        printWriter.print(C0201.m82(18762));
        printWriter.print(this.y);
        printWriter.print(C0201.m82(18763));
        printWriter.print(this.z);
        printWriter.print(C0201.m82(18764));
        printWriter.println(this.A);
        if (this.x) {
            printWriter.print(str);
            printWriter.print(C0201.m82(18765));
            printWriter.println(this.x);
        }
    }

    public void b0() {
        o1();
        X(this.w);
    }

    public void b1(Parcelable parcelable) {
        m mVar;
        if (parcelable != null) {
            k kVar = (k) parcelable;
            if (kVar.a != null) {
                for (Fragment fragment : this.I.h()) {
                    if (K) {
                        Log.v(C0201.m82(18766), C0201.m82(18767) + fragment);
                    }
                    Iterator<m> it = kVar.a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            mVar = null;
                            break;
                        }
                        mVar = it.next();
                        if (mVar.b.equals(fragment.mWho)) {
                            break;
                        }
                    }
                    if (mVar == null) {
                        if (K) {
                            Log.v(C0201.m82(18768), C0201.m82(18769) + fragment + C0201.m82(18770) + kVar.a);
                        }
                        Q0(fragment, 1, 0, 0, false);
                        fragment.mRemoving = true;
                        Q0(fragment, 0, 0, 0, false);
                    } else {
                        mVar.n = fragment;
                        fragment.mSavedViewState = null;
                        fragment.mBackStackNesting = 0;
                        fragment.mInLayout = false;
                        fragment.mAdded = false;
                        Fragment fragment2 = fragment.mTarget;
                        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
                        fragment.mTarget = null;
                        Bundle bundle = mVar.m;
                        if (bundle != null) {
                            bundle.setClassLoader(this.q.f().getClassLoader());
                            fragment.mSavedViewState = mVar.m.getSparseParcelableArray(C0201.m82(18771));
                            fragment.mSavedFragmentState = mVar.m;
                        }
                    }
                }
                this.g.clear();
                Iterator<m> it2 = kVar.a.iterator();
                while (it2.hasNext()) {
                    m next = it2.next();
                    if (next != null) {
                        Fragment a2 = next.a(this.q.f().getClassLoader(), d());
                        a2.mFragmentManager = this;
                        if (K) {
                            Log.v(C0201.m82(18772), C0201.m82(18773) + a2.mWho + C0201.m82(18774) + a2);
                        }
                        this.g.put(a2.mWho, a2);
                        next.n = null;
                    }
                }
                this.f.clear();
                ArrayList<String> arrayList = kVar.b;
                if (arrayList != null) {
                    Iterator<String> it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        String next2 = it3.next();
                        Fragment fragment3 = this.g.get(next2);
                        if (fragment3 != null) {
                            fragment3.mAdded = true;
                            if (K) {
                                Log.v(C0201.m82(18775), C0201.m82(18776) + next2 + C0201.m82(18777) + fragment3);
                            }
                            if (!this.f.contains(fragment3)) {
                                synchronized (this.f) {
                                    this.f.add(fragment3);
                                }
                            } else {
                                throw new IllegalStateException(C0201.m82(18778) + fragment3);
                            }
                        } else {
                            m1(new IllegalStateException(C0201.m82(18779) + next2 + C0201.m82(18780)));
                            throw null;
                        }
                    }
                }
                if (kVar.c != null) {
                    this.h = new ArrayList<>(kVar.c.length);
                    int i2 = 0;
                    while (true) {
                        b[] bVarArr = kVar.c;
                        if (i2 >= bVarArr.length) {
                            break;
                        }
                        a a3 = bVarArr[i2].a(this);
                        if (K) {
                            Log.v(C0201.m82(18781), C0201.m82(18782) + i2 + C0201.m82(18783) + a3.t + C0201.m82(18784) + a3);
                            PrintWriter printWriter = new PrintWriter(new androidx.core.util.b(C0201.m82(18785)));
                            a3.k(C0201.m82(18786), printWriter, false);
                            printWriter.close();
                        }
                        this.h.add(a3);
                        int i3 = a3.t;
                        if (i3 >= 0) {
                            h1(i3, a3);
                        }
                        i2++;
                    }
                } else {
                    this.h = null;
                }
                String str = kVar.d;
                if (str != null) {
                    Fragment fragment4 = this.g.get(str);
                    this.w = fragment4;
                    X(fragment4);
                }
                this.e = kVar.e;
            }
        }
    }

    @Override // androidx.fragment.app.i
    public Fragment c(String str) {
        if (str != null) {
            for (int size = this.f.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (Fragment fragment2 : this.g.values()) {
            if (fragment2 != null && str.equals(fragment2.mTag)) {
                return fragment2;
            }
        }
        return null;
    }

    public void c0() {
        this.y = false;
        this.z = false;
        e0(4);
    }

    @Override // androidx.fragment.app.i
    public g d() {
        if (super.d() == i.b) {
            Fragment fragment = this.v;
            if (fragment != null) {
                return fragment.mFragmentManager.d();
            }
            i(new f());
        }
        return super.d();
    }

    public void d0() {
        this.y = false;
        this.z = false;
        e0(3);
    }

    public Parcelable d1() {
        ArrayList<String> arrayList;
        int size;
        s0();
        h0();
        l0();
        this.y = true;
        b[] bVarArr = null;
        if (this.g.isEmpty()) {
            return null;
        }
        ArrayList<m> arrayList2 = new ArrayList<>(this.g.size());
        Iterator<Fragment> it = this.g.values().iterator();
        boolean z2 = false;
        while (true) {
            boolean hasNext = it.hasNext();
            String r7 = C0201.m82(18787);
            String r8 = C0201.m82(18788);
            String r9 = C0201.m82(18789);
            String r10 = C0201.m82(18790);
            if (hasNext) {
                Fragment next = it.next();
                if (next != null) {
                    if (next.mFragmentManager == this) {
                        m mVar = new m(next);
                        arrayList2.add(mVar);
                        if (next.mState <= 0 || mVar.m != null) {
                            mVar.m = next.mSavedFragmentState;
                        } else {
                            mVar.m = e1(next);
                            String str = next.mTargetWho;
                            if (str != null) {
                                Fragment fragment = this.g.get(str);
                                if (fragment != null) {
                                    if (mVar.m == null) {
                                        mVar.m = new Bundle();
                                    }
                                    W0(mVar.m, C0201.m82(18791), fragment);
                                    int i2 = next.mTargetRequestCode;
                                    if (i2 != 0) {
                                        mVar.m.putInt(C0201.m82(18792), i2);
                                    }
                                } else {
                                    m1(new IllegalStateException(C0201.m82(18793) + next + C0201.m82(18794) + next.mTargetWho));
                                    throw null;
                                }
                            }
                        }
                        if (K) {
                            Log.v(r10, C0201.m82(18795) + next + r7 + mVar.m);
                        }
                        z2 = true;
                    } else {
                        m1(new IllegalStateException(r9 + next + r8));
                        throw null;
                    }
                }
            } else if (!z2) {
                if (K) {
                    Log.v(r10, C0201.m82(18796));
                }
                return null;
            } else {
                int size2 = this.f.size();
                if (size2 > 0) {
                    arrayList = new ArrayList<>(size2);
                    Iterator<Fragment> it2 = this.f.iterator();
                    while (it2.hasNext()) {
                        Fragment next2 = it2.next();
                        arrayList.add(next2.mWho);
                        if (next2.mFragmentManager != this) {
                            m1(new IllegalStateException(r9 + next2 + r8));
                            throw null;
                        } else if (K) {
                            Log.v(r10, C0201.m82(18797) + next2.mWho + C0201.m82(18798) + next2);
                        }
                    }
                } else {
                    arrayList = null;
                }
                ArrayList<a> arrayList3 = this.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 0) {
                    bVarArr = new b[size];
                    for (int i3 = 0; i3 < size; i3++) {
                        bVarArr[i3] = new b(this.h.get(i3));
                        if (K) {
                            Log.v(r10, C0201.m82(18799) + i3 + r7 + this.h.get(i3));
                        }
                    }
                }
                k kVar = new k();
                kVar.a = arrayList2;
                kVar.b = arrayList;
                kVar.c = bVarArr;
                Fragment fragment2 = this.w;
                if (fragment2 != null) {
                    kVar.d = fragment2.mWho;
                }
                kVar.e = this.e;
                return kVar;
            }
        }
    }

    @Override // androidx.fragment.app.i
    public List<Fragment> e() {
        List<Fragment> list;
        if (this.f.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f) {
            list = (List) this.f.clone();
        }
        return list;
    }

    public Bundle e1(Fragment fragment) {
        if (this.F == null) {
            this.F = new Bundle();
        }
        fragment.performSaveInstanceState(this.F);
        Q(fragment, this.F, false);
        Bundle bundle = null;
        if (!this.F.isEmpty()) {
            Bundle bundle2 = this.F;
            this.F = null;
            bundle = bundle2;
        }
        if (fragment.mView != null) {
            f1(fragment);
        }
        if (fragment.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(C0201.m82(18800), fragment.mSavedViewState);
        }
        if (!fragment.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(C0201.m82(18801), fragment.mUserVisibleHint);
        }
        return bundle;
    }

    @Override // androidx.fragment.app.i
    public boolean f() {
        return this.y || this.z;
    }

    public void f0() {
        this.z = true;
        e0(2);
    }

    public void f1(Fragment fragment) {
        if (fragment.mInnerView != null) {
            SparseArray<Parcelable> sparseArray = this.G;
            if (sparseArray == null) {
                this.G = new SparseArray<>();
            } else {
                sparseArray.clear();
            }
            fragment.mInnerView.saveHierarchyState(this.G);
            if (this.G.size() > 0) {
                fragment.mSavedViewState = this.G;
                this.G = null;
            }
        }
    }

    @Override // androidx.fragment.app.i
    public void g(int i2, int i3) {
        if (i2 >= 0) {
            i0(new l(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(18802) + i2);
    }

    public void g0() {
        if (this.B) {
            this.B = false;
            l1();
        }
    }

    public void g1() {
        synchronized (this) {
            boolean z2 = false;
            boolean z3 = this.H != null && !this.H.isEmpty();
            if (this.c != null && this.c.size() == 1) {
                z2 = true;
            }
            if (z3 || z2) {
                this.q.g().removeCallbacks(this.J);
                this.q.g().post(this.J);
                o1();
            }
        }
    }

    @Override // androidx.fragment.app.i
    public boolean h() {
        t();
        return T0(null, -1, 0);
    }

    public void h1(int i2, a aVar) {
        synchronized (this) {
            if (this.l == null) {
                this.l = new ArrayList<>();
            }
            int size = this.l.size();
            if (i2 < size) {
                if (K) {
                    String r0 = C0201.m82(18803);
                    Log.v(r0, C0201.m82(18804) + i2 + C0201.m82(18805) + aVar);
                }
                this.l.set(i2, aVar);
            } else {
                while (size < i2) {
                    this.l.add(null);
                    if (this.m == null) {
                        this.m = new ArrayList<>();
                    }
                    if (K) {
                        String r1 = C0201.m82(18806);
                        Log.v(r1, C0201.m82(18807) + size);
                    }
                    this.m.add(Integer.valueOf(size));
                    size++;
                }
                if (K) {
                    String r02 = C0201.m82(18808);
                    Log.v(r02, C0201.m82(18809) + i2 + C0201.m82(18810) + aVar);
                }
                this.l.add(aVar);
            }
        }
    }

    public void i0(k kVar, boolean z2) {
        if (!z2) {
            t();
        }
        synchronized (this) {
            if (!this.A) {
                if (this.q != null) {
                    if (this.c == null) {
                        this.c = new ArrayList<>();
                    }
                    this.c.add(kVar);
                    g1();
                    return;
                }
            }
            if (!z2) {
                throw new IllegalStateException(C0201.m82(18811));
            }
        }
    }

    public void i1(Fragment fragment, d.b bVar) {
        if (this.g.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this)) {
            fragment.mMaxState = bVar;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(18812) + fragment + C0201.m82(18813) + this);
    }

    public void j1(Fragment fragment) {
        if (fragment == null || (this.g.get(fragment.mWho) == fragment && (fragment.mHost == null || fragment.getFragmentManager() == this))) {
            Fragment fragment2 = this.w;
            this.w = fragment;
            X(fragment2);
            X(this.w);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(18814) + fragment + C0201.m82(18815) + this);
    }

    public void k(a aVar) {
        if (this.h == null) {
            this.h = new ArrayList<>();
        }
        this.h.add(aVar);
    }

    public void k0(Fragment fragment) {
        if (fragment.mFromLayout && !fragment.mPerformedCreateView) {
            fragment.performCreateView(fragment.performGetLayoutInflater(fragment.mSavedFragmentState), null, fragment.mSavedFragmentState);
            View view = fragment.mView;
            if (view != null) {
                fragment.mInnerView = view;
                view.setSaveFromParentEnabled(false);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.onViewCreated(fragment.mView, fragment.mSavedFragmentState);
                T(fragment, fragment.mView, fragment.mSavedFragmentState, false);
                return;
            }
            fragment.mInnerView = null;
        }
    }

    public void k1(Fragment fragment) {
        if (K) {
            Log.v(C0201.m82(18817), C0201.m82(18816) + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    public void l(Fragment fragment, boolean z2) {
        if (K) {
            String r0 = C0201.m82(18818);
            Log.v(r0, C0201.m82(18819) + fragment);
        }
        I0(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.f.contains(fragment)) {
            synchronized (this.f) {
                this.f.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (E0(fragment)) {
                this.x = true;
            }
            if (z2) {
                P0(fragment);
                return;
            }
            return;
        }
        throw new IllegalStateException(C0201.m82(18820) + fragment);
    }

    /* JADX INFO: finally extract failed */
    public boolean l0() {
        j0(true);
        boolean z2 = false;
        while (u0(this.C, this.D)) {
            this.d = true;
            try {
                Y0(this.C, this.D);
                u();
                z2 = true;
            } catch (Throwable th) {
                u();
                throw th;
            }
        }
        o1();
        g0();
        r();
        return z2;
    }

    public void l1() {
        for (Fragment fragment : this.g.values()) {
            if (fragment != null) {
                S0(fragment);
            }
        }
    }

    public void m(Fragment fragment) {
        boolean f2 = f();
        String r1 = C0201.m82(18821);
        if (f2) {
            if (K) {
                Log.v(r1, C0201.m82(18822));
            }
        } else if (this.I.d(fragment) && K) {
            Log.v(r1, C0201.m82(18823) + fragment);
        }
    }

    public int n(a aVar) {
        synchronized (this) {
            if (this.m != null) {
                if (this.m.size() > 0) {
                    int intValue = this.m.remove(this.m.size() - 1).intValue();
                    if (K) {
                        String r1 = C0201.m82(18824);
                        Log.v(r1, C0201.m82(18825) + intValue + C0201.m82(18826) + aVar);
                    }
                    this.l.set(intValue, aVar);
                    return intValue;
                }
            }
            if (this.l == null) {
                this.l = new ArrayList<>();
            }
            int size = this.l.size();
            if (K) {
                String r12 = C0201.m82(18827);
                Log.v(r12, C0201.m82(18828) + size + C0201.m82(18829) + aVar);
            }
            this.l.add(aVar);
            return size;
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        Fragment fragment = null;
        if (!C0201.m82(18830).equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, C0201.m82(18831));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0017j.a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue == null || !g.b(context.getClassLoader(), attributeValue)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + C0201.m82(18832) + attributeValue);
        }
        if (resourceId != -1) {
            fragment = p0(resourceId);
        }
        if (fragment == null && string != null) {
            fragment = c(string);
        }
        if (fragment == null && i2 != -1) {
            fragment = p0(i2);
        }
        if (K) {
            Log.v(C0201.m82(18836), C0201.m82(18833) + Integer.toHexString(resourceId) + C0201.m82(18834) + attributeValue + C0201.m82(18835) + fragment);
        }
        if (fragment == null) {
            fragment = d().a(context.getClassLoader(), attributeValue);
            fragment.mFromLayout = true;
            fragment.mFragmentId = resourceId != 0 ? resourceId : i2;
            fragment.mContainerId = i2;
            fragment.mTag = string;
            fragment.mInLayout = true;
            fragment.mFragmentManager = this;
            h hVar = this.q;
            fragment.mHost = hVar;
            fragment.onInflate(hVar.f(), attributeSet, fragment.mSavedFragmentState);
            l(fragment, true);
        } else if (!fragment.mInLayout) {
            fragment.mInLayout = true;
            h hVar2 = this.q;
            fragment.mHost = hVar2;
            fragment.onInflate(hVar2.f(), attributeSet, fragment.mSavedFragmentState);
        } else {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + C0201.m82(18839) + Integer.toHexString(resourceId) + C0201.m82(18840) + string + C0201.m82(18841) + Integer.toHexString(i2) + C0201.m82(18842) + attributeValue);
        }
        if (this.p >= 1 || !fragment.mFromLayout) {
            P0(fragment);
        } else {
            Q0(fragment, 1, 0, 0, false);
        }
        View view2 = fragment.mView;
        if (view2 != null) {
            if (resourceId != 0) {
                view2.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag(string);
            }
            return fragment.mView;
        }
        throw new IllegalStateException(C0201.m82(18837) + attributeValue + C0201.m82(18838));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: androidx.activity.c */
    /* JADX WARN: Multi-variable type inference failed */
    public void p(h hVar, e eVar, Fragment fragment) {
        if (this.q == null) {
            this.q = hVar;
            this.u = eVar;
            this.v = fragment;
            if (fragment != null) {
                o1();
            }
            if (hVar instanceof androidx.activity.c) {
                androidx.activity.c cVar = (androidx.activity.c) hVar;
                this.j = cVar.b();
                Fragment fragment2 = cVar;
                if (fragment != null) {
                    fragment2 = fragment;
                }
                this.j.a(fragment2, this.k);
            }
            if (fragment != null) {
                this.I = fragment.mFragmentManager.w0(fragment);
            } else if (hVar instanceof s) {
                this.I = l.g(((s) hVar).getViewModelStore());
            } else {
                this.I = new l(false);
            }
        } else {
            throw new IllegalStateException(C0201.m82(18843));
        }
    }

    public Fragment p0(int i2) {
        for (int size = this.f.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f.get(size);
            if (fragment != null && fragment.mFragmentId == i2) {
                return fragment;
            }
        }
        for (Fragment fragment2 : this.g.values()) {
            if (fragment2 != null && fragment2.mFragmentId == i2) {
                return fragment2;
            }
        }
        return null;
    }

    public void q(Fragment fragment) {
        if (K) {
            String r0 = C0201.m82(18844);
            Log.v(r0, C0201.m82(18845) + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.f.contains(fragment)) {
                if (K) {
                    String r02 = C0201.m82(18846);
                    Log.v(r02, C0201.m82(18847) + fragment);
                }
                synchronized (this.f) {
                    this.f.add(fragment);
                }
                fragment.mAdded = true;
                if (E0(fragment)) {
                    this.x = true;
                    return;
                }
                return;
            }
            throw new IllegalStateException(C0201.m82(18848) + fragment);
        }
    }

    public Fragment q0(String str) {
        Fragment findFragmentByWho;
        for (Fragment fragment : this.g.values()) {
            if (!(fragment == null || (findFragmentByWho = fragment.findFragmentByWho(str)) == null)) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    public boolean s() {
        boolean z2 = false;
        for (Fragment fragment : this.g.values()) {
            if (fragment != null) {
                z2 = E0(fragment);
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public void t0(int i2) {
        synchronized (this) {
            this.l.set(i2, null);
            if (this.m == null) {
                this.m = new ArrayList<>();
            }
            if (K) {
                String r0 = C0201.m82(18849);
                Log.v(r0, C0201.m82(18850) + i2);
            }
            this.m.add(Integer.valueOf(i2));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(C0201.m82(18851));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(C0201.m82(18852));
        Fragment fragment = this.v;
        if (fragment != null) {
            androidx.core.util.a.a(fragment, sb);
        } else {
            androidx.core.util.a.a(this.q, sb);
        }
        sb.append(C0201.m82(18853));
        return sb.toString();
    }

    public void v(a aVar, boolean z2, boolean z3, boolean z4) {
        if (z2) {
            aVar.m(z4);
        } else {
            aVar.l();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3) {
            o.C(this, arrayList, arrayList2, 0, 1, true);
        }
        if (z4) {
            O0(this.p, true);
        }
        for (Fragment fragment : this.g.values()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && aVar.p(fragment.mContainerId)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                if (z4) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    public int v0() {
        ArrayList<a> arrayList = this.h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void w(Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            g H0 = H0(fragment, fragment.getNextTransition(), !fragment.mHidden, fragment.getNextTransitionStyle());
            if (H0 == null || (animator = H0.b) == null) {
                if (H0 != null) {
                    fragment.mView.startAnimation(H0.a);
                    H0.a.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    H0.b.addListener(new e(this, viewGroup, view, fragment));
                }
                H0.b.start();
            }
        }
        if (fragment.mAdded && E0(fragment)) {
            this.x = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    public l w0(Fragment fragment) {
        return this.I.f(fragment);
    }

    public void x(Fragment fragment) {
        if (K) {
            String r0 = C0201.m82(18854);
            Log.v(r0, C0201.m82(18855) + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (K) {
                    String r1 = C0201.m82(18856);
                    Log.v(r1, C0201.m82(18857) + fragment);
                }
                synchronized (this.f) {
                    this.f.remove(fragment);
                }
                if (E0(fragment)) {
                    this.x = true;
                }
                fragment.mAdded = false;
            }
        }
    }

    public Fragment x0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragment = this.g.get(string);
        if (fragment != null) {
            return fragment;
        }
        m1(new IllegalStateException(C0201.m82(18858) + str + C0201.m82(18859) + string));
        throw null;
    }

    public void y() {
        this.y = false;
        this.z = false;
        e0(2);
    }

    public LayoutInflater.Factory2 y0() {
        return this;
    }

    public void z(Configuration configuration) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            Fragment fragment = this.f.get(i2);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    public Fragment z0() {
        return this.w;
    }

    /* access modifiers changed from: private */
    /* compiled from: FragmentManagerImpl */
    public static class g {
        public final Animation a;
        public final Animator b;

        public g(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation == null) {
                throw new IllegalStateException(C0201.m82(12201));
            }
        }

        public g(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator == null) {
                throw new IllegalStateException(C0201.m82(12200));
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: FragmentManagerImpl */
    public static class h extends AnimationSet implements Runnable {
        private final ViewGroup a;
        private final View b;
        private boolean c;
        private boolean d;
        private boolean e = true;

        public h(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.a = viewGroup;
            this.b = view;
            addAnimation(animation);
            this.a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.c = true;
                h3.a(this.a, this);
            }
            return true;
        }

        public void run() {
            if (this.c || !this.e) {
                this.a.endViewTransition(this.b);
                this.d = true;
                return;
            }
            this.e = false;
            this.a.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.e = true;
            if (this.c) {
                return !this.d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.c = true;
                h3.a(this.a, this);
            }
            return true;
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
