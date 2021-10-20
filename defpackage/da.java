package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.o;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: da  reason: default package */
/* compiled from: LottieAnimationView */
public class da extends o {
    private static final String x = da.class.getSimpleName();
    private static final ia<Throwable> y = new a();
    private final ia<ea> c = new b();
    private final ia<Throwable> d = new c();
    private ia<Throwable> e;
    private int f = 0;
    private final ga g = new ga();
    private boolean h;
    private String i;
    private int j;
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;
    private boolean n = false;
    private boolean o = true;
    private qa p = qa.AUTOMATIC;
    private Set<ka> q = new HashSet();
    private int u = 0;
    private na<ea> v;
    private ea w;

    /* access modifiers changed from: package-private */
    /* renamed from: da$a */
    /* compiled from: LottieAnimationView */
    public class a implements ia<Throwable> {
        /* renamed from: a */
        public void onResult(Throwable th) {
            if (ag.k(th)) {
                wf.d(C0201.m82(29596), th);
                return;
            }
            throw new IllegalStateException(C0201.m82(29597), th);
        }
    }

    /* renamed from: da$b */
    /* compiled from: LottieAnimationView */
    class b implements ia<ea> {
        public b() {
        }

        /* renamed from: a */
        public void onResult(ea eaVar) {
            da.this.setComposition(eaVar);
        }
    }

    /* renamed from: da$c */
    /* compiled from: LottieAnimationView */
    class c implements ia<Throwable> {
        public c() {
        }

        /* renamed from: a */
        public void onResult(Throwable th) {
            if (da.this.f != 0) {
                da daVar = da.this;
                daVar.setImageResource(daVar.f);
            }
            (da.this.e == null ? da.y : da.this.e).onResult(th);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: da$d */
    /* compiled from: LottieAnimationView */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[qa.values().length];
            a = iArr;
            iArr[qa.HARDWARE.ordinal()] = 1;
            a[qa.SOFTWARE.ordinal()] = 2;
            try {
                a[qa.AUTOMATIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: da$e */
    /* compiled from: LottieAnimationView */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public String a;
        public int b;
        public float c;
        public boolean d;
        public String e;
        public int f;
        public int g;

        /* renamed from: da$e$a */
        /* compiled from: LottieAnimationView */
        class a implements Parcelable.Creator<e> {
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            /* renamed from: b */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public /* synthetic */ e(Parcel parcel, a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeFloat(this.c);
            parcel.writeInt(this.d ? 1 : 0);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        private e(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.c = parcel.readFloat();
            this.d = parcel.readInt() != 1 ? false : true;
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }
    }

    public da(Context context) {
        super(context);
        m(null);
    }

    private void i() {
        na<ea> naVar = this.v;
        if (naVar != null) {
            naVar.k(this.c);
            this.v.j(this.d);
        }
    }

    private void j() {
        this.w = null;
        this.g.g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        if (r3 != false) goto L_0x003d;
     */
    private void l() {
        ea eaVar;
        int i2 = d.a[this.p.ordinal()];
        int i3 = 2;
        if (i2 != 1) {
            if (i2 != 2 && i2 == 3) {
                ea eaVar2 = this.w;
                boolean z = false;
                if ((eaVar2 == null || !eaVar2.p() || Build.VERSION.SDK_INT >= 28) && (((eaVar = this.w) == null || eaVar.l() <= 4) && Build.VERSION.SDK_INT >= 21)) {
                    z = true;
                }
            }
            i3 = 1;
        }
        if (i3 != getLayerType()) {
            setLayerType(i3, null);
        }
    }

    private void m(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pa.LottieAnimationView);
        boolean z = false;
        if (!isInEditMode()) {
            this.o = obtainStyledAttributes.getBoolean(pa.LottieAnimationView_lottie_cacheComposition, true);
            boolean hasValue = obtainStyledAttributes.hasValue(pa.LottieAnimationView_lottie_rawRes);
            boolean hasValue2 = obtainStyledAttributes.hasValue(pa.LottieAnimationView_lottie_fileName);
            boolean hasValue3 = obtainStyledAttributes.hasValue(pa.LottieAnimationView_lottie_url);
            if (!hasValue || !hasValue2) {
                if (hasValue) {
                    int resourceId = obtainStyledAttributes.getResourceId(pa.LottieAnimationView_lottie_rawRes, 0);
                    if (resourceId != 0) {
                        setAnimation(resourceId);
                    }
                } else if (hasValue2) {
                    String string2 = obtainStyledAttributes.getString(pa.LottieAnimationView_lottie_fileName);
                    if (string2 != null) {
                        setAnimation(string2);
                    }
                } else if (hasValue3 && (string = obtainStyledAttributes.getString(pa.LottieAnimationView_lottie_url)) != null) {
                    setAnimationFromUrl(string);
                }
                setFallbackResource(obtainStyledAttributes.getResourceId(pa.LottieAnimationView_lottie_fallbackRes, 0));
            } else {
                throw new IllegalArgumentException(C0201.m82(9903));
            }
        }
        if (obtainStyledAttributes.getBoolean(pa.LottieAnimationView_lottie_autoPlay, false)) {
            this.m = true;
            this.n = true;
        }
        if (obtainStyledAttributes.getBoolean(pa.LottieAnimationView_lottie_loop, false)) {
            this.g.c0(-1);
        }
        if (obtainStyledAttributes.hasValue(pa.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(obtainStyledAttributes.getInt(pa.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (obtainStyledAttributes.hasValue(pa.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(obtainStyledAttributes.getInt(pa.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (obtainStyledAttributes.hasValue(pa.LottieAnimationView_lottie_speed)) {
            setSpeed(obtainStyledAttributes.getFloat(pa.LottieAnimationView_lottie_speed, 1.0f));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(pa.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(obtainStyledAttributes.getFloat(pa.LottieAnimationView_lottie_progress, 0.0f));
        k(obtainStyledAttributes.getBoolean(pa.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (obtainStyledAttributes.hasValue(pa.LottieAnimationView_lottie_colorFilter)) {
            g(new jc(C0201.m82(9904)), la.C, new dg(new ra(obtainStyledAttributes.getColor(pa.LottieAnimationView_lottie_colorFilter, 0))));
        }
        if (obtainStyledAttributes.hasValue(pa.LottieAnimationView_lottie_scale)) {
            this.g.f0(obtainStyledAttributes.getFloat(pa.LottieAnimationView_lottie_scale, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(pa.LottieAnimationView_lottie_renderMode)) {
            int i2 = obtainStyledAttributes.getInt(pa.LottieAnimationView_lottie_renderMode, qa.AUTOMATIC.ordinal());
            if (i2 >= qa.values().length) {
                i2 = qa.AUTOMATIC.ordinal();
            }
            setRenderMode(qa.values()[i2]);
        }
        if (getScaleType() != null) {
            this.g.g0(getScaleType());
        }
        obtainStyledAttributes.recycle();
        ga gaVar = this.g;
        if (ag.f(getContext()) != 0.0f) {
            z = true;
        }
        gaVar.i0(Boolean.valueOf(z));
        l();
        this.h = true;
    }

    private void setCompositionTask(na<ea> naVar) {
        j();
        i();
        naVar.f(this.c);
        naVar.e(this.d);
        this.v = naVar;
    }

    public void buildDrawingCache(boolean z) {
        String r0 = C0201.m82(9905);
        ca.a(r0);
        this.u++;
        super.buildDrawingCache(z);
        if (this.u == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            setRenderMode(qa.HARDWARE);
        }
        this.u--;
        ca.b(r0);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        this.g.c(animatorListener);
    }

    public <T> void g(jc jcVar, T t, dg<T> dgVar) {
        this.g.d(jcVar, t, dgVar);
    }

    public ea getComposition() {
        return this.w;
    }

    public long getDuration() {
        ea eaVar = this.w;
        if (eaVar != null) {
            return (long) eaVar.d();
        }
        return 0;
    }

    public int getFrame() {
        return this.g.q();
    }

    public String getImageAssetsFolder() {
        return this.g.t();
    }

    public float getMaxFrame() {
        return this.g.u();
    }

    public float getMinFrame() {
        return this.g.w();
    }

    public oa getPerformanceTracker() {
        return this.g.x();
    }

    public float getProgress() {
        return this.g.y();
    }

    public int getRepeatCount() {
        return this.g.z();
    }

    public int getRepeatMode() {
        return this.g.A();
    }

    public float getScale() {
        return this.g.B();
    }

    public float getSpeed() {
        return this.g.C();
    }

    public void h() {
        this.m = false;
        this.l = false;
        this.k = false;
        this.g.f();
        l();
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        ga gaVar = this.g;
        if (drawable2 == gaVar) {
            super.invalidateDrawable(gaVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void k(boolean z) {
        this.g.k(z);
    }

    public boolean n() {
        return this.g.F();
    }

    public void o() {
        this.n = false;
        this.m = false;
        this.l = false;
        this.k = false;
        this.g.H();
        l();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.n || this.m) {
            p();
            this.n = false;
            this.m = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            onVisibilityChanged(this, getVisibility());
        }
    }

    public void onDetachedFromWindow() {
        if (n()) {
            h();
            this.m = true;
        }
        super.onDetachedFromWindow();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        String str = eVar.a;
        this.i = str;
        if (!TextUtils.isEmpty(str)) {
            setAnimation(this.i);
        }
        int i2 = eVar.b;
        this.j = i2;
        if (i2 != 0) {
            setAnimation(i2);
        }
        setProgress(eVar.c);
        if (eVar.d) {
            p();
        }
        this.g.R(eVar.e);
        setRepeatMode(eVar.f);
        setRepeatCount(eVar.g);
    }

    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.a = this.i;
        eVar.b = this.j;
        eVar.c = this.g.y();
        eVar.d = this.g.F() || (!k3.M(this) && this.m);
        eVar.e = this.g.t();
        eVar.f = this.g.A();
        eVar.g = this.g.z();
        return eVar;
    }

    public void onVisibilityChanged(View view, int i2) {
        if (this.h) {
            if (isShown()) {
                if (this.l) {
                    q();
                } else if (this.k) {
                    p();
                }
                this.l = false;
                this.k = false;
            } else if (n()) {
                o();
                this.l = true;
            }
        }
    }

    public void p() {
        if (isShown()) {
            this.g.I();
            l();
            return;
        }
        this.k = true;
    }

    public void q() {
        if (isShown()) {
            this.g.K();
            l();
            return;
        }
        this.k = false;
        this.l = true;
    }

    public void r() {
        this.g.L();
    }

    public void s(InputStream inputStream, String str) {
        setCompositionTask(fa.g(inputStream, str));
    }

    public void setAnimation(int i2) {
        this.j = i2;
        this.i = null;
        setCompositionTask(this.o ? fa.l(getContext(), i2) : fa.m(getContext(), i2, null));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        t(str, null);
    }

    public void setAnimationFromUrl(String str) {
        setCompositionTask(this.o ? fa.p(getContext(), str) : fa.q(getContext(), str, null));
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.g.M(z);
    }

    public void setCacheComposition(boolean z) {
        this.o = z;
    }

    public void setComposition(ea eaVar) {
        if (ca.a) {
            String str = x;
            Log.v(str, C0201.m82(9906) + eaVar);
        }
        this.g.setCallback(this);
        this.w = eaVar;
        boolean N = this.g.N(eaVar);
        l();
        if (getDrawable() != this.g || N) {
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (ka kaVar : this.q) {
                kaVar.a(eaVar);
            }
        }
    }

    public void setFailureListener(ia<Throwable> iaVar) {
        this.e = iaVar;
    }

    public void setFallbackResource(int i2) {
        this.f = i2;
    }

    public void setFontAssetDelegate(aa aaVar) {
        this.g.O(aaVar);
    }

    public void setFrame(int i2) {
        this.g.P(i2);
    }

    public void setImageAssetDelegate(ba baVar) {
        this.g.Q(baVar);
    }

    public void setImageAssetsFolder(String str) {
        this.g.R(str);
    }

    @Override // androidx.appcompat.widget.o
    public void setImageBitmap(Bitmap bitmap) {
        i();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.o
    public void setImageDrawable(Drawable drawable) {
        i();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.o
    public void setImageResource(int i2) {
        i();
        super.setImageResource(i2);
    }

    public void setMaxFrame(int i2) {
        this.g.S(i2);
    }

    public void setMaxProgress(float f2) {
        this.g.U(f2);
    }

    public void setMinAndMaxFrame(String str) {
        this.g.W(str);
    }

    public void setMinFrame(int i2) {
        this.g.X(i2);
    }

    public void setMinProgress(float f2) {
        this.g.Z(f2);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.g.a0(z);
    }

    public void setProgress(float f2) {
        this.g.b0(f2);
    }

    public void setRenderMode(qa qaVar) {
        this.p = qaVar;
        l();
    }

    public void setRepeatCount(int i2) {
        this.g.c0(i2);
    }

    public void setRepeatMode(int i2) {
        this.g.d0(i2);
    }

    public void setSafeMode(boolean z) {
        this.g.e0(z);
    }

    public void setScale(float f2) {
        this.g.f0(f2);
        if (getDrawable() == this.g) {
            setImageDrawable(null);
            setImageDrawable(this.g);
        }
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        ga gaVar = this.g;
        if (gaVar != null) {
            gaVar.g0(scaleType);
        }
    }

    public void setSpeed(float f2) {
        this.g.h0(f2);
    }

    public void setTextDelegate(sa saVar) {
        this.g.j0(saVar);
    }

    public void t(String str, String str2) {
        s(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void u(int i2, int i3) {
        this.g.V(i2, i3);
    }

    public void setMaxFrame(String str) {
        this.g.T(str);
    }

    public void setMinFrame(String str) {
        this.g.Y(str);
    }

    public void setAnimation(String str) {
        this.i = str;
        this.j = 0;
        setCompositionTask(this.o ? fa.d(getContext(), str) : fa.e(getContext(), str, null));
    }
}
