package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.m0;
import defpackage.p;
import defpackage.r;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

@SuppressLint({"RestrictedAPI"})
/* renamed from: o  reason: default package */
/* compiled from: AnimatedStateListDrawableCompat */
public class o extends r implements androidx.core.graphics.drawable.b {
    private c o;
    private g p;
    private int q;
    private int u;
    private boolean v;

    /* access modifiers changed from: private */
    /* renamed from: o$b */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static class b extends g {
        private final Animatable a;

        public b(Animatable animatable) {
            super();
            this.a = animatable;
        }

        @Override // defpackage.o.g
        public void c() {
            this.a.start();
        }

        @Override // defpackage.o.g
        public void d() {
            this.a.stop();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o$c */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static class c extends r.a {
        public u0<Long> K;
        public y0<Integer> L;

        public c(c cVar, o oVar, Resources resources) {
            super(cVar, oVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new u0<>();
            this.L = new y0<>();
        }

        private static long D(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        public int B(int[] iArr, Drawable drawable, int i) {
            int z = super.z(iArr, drawable);
            this.L.l(z, Integer.valueOf(i));
            return z;
        }

        public int C(int i, int i2, Drawable drawable, boolean z) {
            int a = super.a(drawable);
            long D = D(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.K.a(D, Long.valueOf(j2 | j));
            if (z) {
                this.K.a(D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        public int E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.L.f(i, 0).intValue();
        }

        public int F(int[] iArr) {
            int A = super.A(iArr);
            if (A >= 0) {
                return A;
            }
            return super.A(StateSet.WILD_CARD);
        }

        public int G(int i, int i2) {
            return (int) this.K.i(D(i, i2), -1L).longValue();
        }

        public boolean H(int i, int i2) {
            return (this.K.i(D(i, i2), -1L).longValue() & 4294967296L) != 0;
        }

        public boolean I(int i, int i2) {
            return (this.K.i(D(i, i2), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // defpackage.r.a
        public Drawable newDrawable() {
            return new o(this, null);
        }

        @Override // defpackage.r.a, defpackage.p.c
        public void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // defpackage.r.a
        public Drawable newDrawable(Resources resources) {
            return new o(this, resources);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o$d */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static class d extends g {
        private final j7 a;

        public d(j7 j7Var) {
            super();
            this.a = j7Var;
        }

        @Override // defpackage.o.g
        public void c() {
            this.a.start();
        }

        @Override // defpackage.o.g
        public void d() {
            this.a.stop();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o$e */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static class e extends g {
        private final ObjectAnimator a;
        private final boolean b;

        public e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, C0201.m82(4668), i, i2);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.a());
            ofInt.setInterpolator(fVar);
            this.b = z2;
            this.a = ofInt;
        }

        @Override // defpackage.o.g
        public boolean a() {
            return this.b;
        }

        @Override // defpackage.o.g
        public void b() {
            this.a.reverse();
        }

        @Override // defpackage.o.g
        public void c() {
            this.a.start();
        }

        @Override // defpackage.o.g
        public void d() {
            this.a.cancel();
        }
    }

    /* renamed from: o$f */
    /* compiled from: AnimatedStateListDrawableCompat */
    private static class f implements TimeInterpolator {
        private int[] a;
        private int b;
        private int c;

        public f(AnimationDrawable animationDrawable, boolean z) {
            b(animationDrawable, z);
        }

        public int a() {
            return this.c;
        }

        public int b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.b = numberOfFrames;
            int[] iArr = this.a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.a = new int[numberOfFrames];
            }
            int[] iArr2 = this.a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.c)) + 0.5f);
            int i2 = this.b;
            int[] iArr = this.a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.c) : 0.0f);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o$g */
    /* compiled from: AnimatedStateListDrawableCompat */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public o() {
        this(null, null);
    }

    public static o m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals(C0201.m82(27428))) {
            o oVar = new o();
            oVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return oVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C0201.m82(27429) + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals(C0201.m82(27430))) {
                        q(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals(C0201.m82(27431))) {
                        r(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k = m1.k(resources, theme, attributeSet, t.AnimatedStateListDrawableItem);
        int resourceId = k.getResourceId(t.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = k.getResourceId(t.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable j = resourceId2 > 0 ? m0.h().j(context, resourceId2) : null;
        k.recycle();
        int[] k2 = k(attributeSet);
        String r2 = C0201.m82(27432);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + r2);
            } else if (xmlPullParser.getName().equals(C0201.m82(27433))) {
                j = p7.c(resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j != null) {
            return this.o.B(k2, j, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + r2);
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray k = m1.k(resources, theme, attributeSet, t.AnimatedStateListDrawableTransition);
        int resourceId = k.getResourceId(t.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = k.getResourceId(t.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = k.getResourceId(t.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable j = resourceId3 > 0 ? m0.h().j(context, resourceId3) : null;
        boolean z = k.getBoolean(t.AnimatedStateListDrawableTransition_android_reversible, false);
        k.recycle();
        String r0 = C0201.m82(27434);
        if (j == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + r0);
            } else if (xmlPullParser.getName().equals(C0201.m82(27435))) {
                j = j7.a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (Build.VERSION.SDK_INT >= 21) {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                j = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (j == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + r0);
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.o.C(resourceId, resourceId2, j, z);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C0201.m82(27436));
        }
    }

    private boolean s(int i) {
        int i2;
        int G;
        g gVar;
        g gVar2 = this.p;
        if (gVar2 == null) {
            i2 = c();
        } else if (i == this.q) {
            return true;
        } else {
            if (i != this.u || !gVar2.a()) {
                i2 = this.q;
                gVar2.d();
            } else {
                gVar2.b();
                this.q = this.u;
                this.u = i;
                return true;
            }
        }
        this.p = null;
        this.u = -1;
        this.q = -1;
        c cVar = this.o;
        int E = cVar.E(i2);
        int E2 = cVar.E(i);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            gVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof j7) {
            gVar = new d((j7) current);
        } else {
            if (current instanceof Animatable) {
                gVar = new b((Animatable) current);
            }
            return false;
        }
        gVar.c();
        this.p = gVar;
        this.u = i2;
        this.q = i;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.o;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.d |= typedArray.getChangingConfigurations();
        }
        cVar.x(typedArray.getBoolean(t.AnimatedStateListDrawableCompat_android_variablePadding, cVar.i));
        cVar.t(typedArray.getBoolean(t.AnimatedStateListDrawableCompat_android_constantSize, cVar.l));
        cVar.u(typedArray.getInt(t.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.A));
        cVar.v(typedArray.getInt(t.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.B));
        setDither(typedArray.getBoolean(t.AnimatedStateListDrawableCompat_android_dither, cVar.x));
    }

    @Override // defpackage.p, defpackage.r
    public void h(p.c cVar) {
        super.h(cVar);
        if (cVar instanceof c) {
            this.o = (c) cVar;
        }
    }

    @Override // defpackage.r
    public boolean isStateful() {
        return true;
    }

    @Override // defpackage.p
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.p;
        if (gVar != null) {
            gVar.d();
            this.p = null;
            g(this.q);
            this.q = -1;
            this.u = -1;
        }
    }

    /* renamed from: l */
    public c j() {
        return new c(this.o, this, null);
    }

    @Override // defpackage.p, defpackage.r
    public Drawable mutate() {
        if (!this.v) {
            super.mutate();
            if (this == this) {
                this.o.r();
                this.v = true;
            }
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray k = m1.k(resources, theme, attributeSet, t.AnimatedStateListDrawableCompat);
        setVisible(k.getBoolean(t.AnimatedStateListDrawableCompat_android_visible, true), true);
        t(k);
        i(resources);
        k.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    @Override // defpackage.p, defpackage.r
    public boolean onStateChange(int[] iArr) {
        int F = this.o.F(iArr);
        boolean z = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    @Override // defpackage.p
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.p != null && (visible || z2)) {
            if (z) {
                this.p.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public o(c cVar, Resources resources) {
        super(null);
        this.q = -1;
        this.u = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
