package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReadableMap;
import defpackage.qn0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;
import vigqyno.C0201;

/* renamed from: pn0  reason: default package */
/* compiled from: CameraView */
public class pn0 extends FrameLayout {
    public qn0 a;
    private final c b;
    private boolean c;
    private Context d;
    private final sn0 e;
    public HandlerThread f;
    public Handler g;

    /* renamed from: pn0$a */
    /* compiled from: CameraView */
    class a extends sn0 {
        public a(Context context) {
            super(context);
        }

        @Override // defpackage.sn0
        public void g(int i, int i2) {
            pn0.this.a.E(i);
            pn0.this.a.D(i2);
        }
    }

    /* renamed from: pn0$b */
    /* compiled from: CameraView */
    public static abstract class b {
        public void a(pn0 pn0) {
        }

        public void b(pn0 pn0) {
        }

        public void c(pn0 pn0, byte[] bArr, int i, int i2, int i3) {
        }

        public void d(pn0 pn0) {
        }

        public void e(pn0 pn0, byte[] bArr, int i) {
        }

        public void f(pn0 pn0) {
        }

        public void g(pn0 pn0, String str, int i, int i2) {
        }

        public void h(pn0 pn0, String str, int i, int i2) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: pn0$c */
    /* compiled from: CameraView */
    public class c implements qn0.a {
        private final ArrayList<b> a = new ArrayList<>();
        private boolean b;

        public c() {
        }

        @Override // defpackage.qn0.a
        public void a() {
            Iterator<b> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().a(pn0.this);
            }
        }

        @Override // defpackage.qn0.a
        public void b() {
            Iterator<b> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().f(pn0.this);
            }
        }

        @Override // defpackage.qn0.a
        public void c(byte[] bArr, int i, int i2, int i3) {
            Iterator<b> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().c(pn0.this, bArr, i, i2, i3);
            }
        }

        @Override // defpackage.qn0.a
        public void d() {
            if (this.b) {
                this.b = false;
                pn0.this.requestLayout();
            }
            Iterator<b> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().b(pn0.this);
            }
        }

        @Override // defpackage.qn0.a
        public void e() {
            Iterator<b> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().d(pn0.this);
            }
        }

        @Override // defpackage.qn0.a
        public void f(String str, int i, int i2) {
            Iterator<b> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().g(pn0.this, str, i, i2);
            }
        }

        @Override // defpackage.qn0.a
        public void g(byte[] bArr, int i) {
            Iterator<b> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().e(pn0.this, bArr, i);
            }
        }

        @Override // defpackage.qn0.a
        public void h(String str, int i, int i2) {
            Iterator<b> it = this.a.iterator();
            while (it.hasNext()) {
                it.next().h(pn0.this, str, i, i2);
            }
        }

        public void i(b bVar) {
            this.a.add(bVar);
        }

        public void j() {
            this.b = true;
        }
    }

    public pn0(Context context, boolean z) {
        this(context, null, z);
    }

    private tn0 n(Context context) {
        if (Build.VERSION.SDK_INT < 14) {
            return new wn0(context, this);
        }
        return new xn0(context, this);
    }

    public boolean getAdjustViewBounds() {
        return this.c;
    }

    public ln0 getAspectRatio() {
        return this.a.a();
    }

    public boolean getAutoFocus() {
        return this.a.b();
    }

    public String getCameraId() {
        return this.a.d();
    }

    public List<Properties> getCameraIds() {
        return this.a.e();
    }

    public int getCameraOrientation() {
        return this.a.f();
    }

    public float getExposureCompensation() {
        return this.a.g();
    }

    public int getFacing() {
        return this.a.h();
    }

    public int getFlash() {
        return this.a.i();
    }

    public float getFocusDepth() {
        return this.a.j();
    }

    public un0 getPictureSize() {
        return this.a.k();
    }

    public boolean getPlaySoundOnCapture() {
        return this.a.l();
    }

    public boolean getPlaySoundOnRecord() {
        return this.a.m();
    }

    public un0 getPreviewSize() {
        return this.a.n();
    }

    public boolean getScanning() {
        return this.a.o();
    }

    public Set<ln0> getSupportedAspectRatios() {
        return this.a.p();
    }

    public ArrayList<int[]> getSupportedPreviewFpsRange() {
        return this.a.q();
    }

    public View getView() {
        qn0 qn0 = this.a;
        if (qn0 != null) {
            return qn0.r();
        }
        return null;
    }

    public int getWhiteBalance() {
        return this.a.s();
    }

    public float getZoom() {
        return this.a.t();
    }

    public void l(b bVar) {
        this.b.i(bVar);
    }

    public void m() {
        HandlerThread handlerThread = this.f;
        if (handlerThread != null) {
            if (Build.VERSION.SDK_INT < 18) {
                handlerThread.quit();
            } else {
                handlerThread.quitSafely();
            }
            this.f = null;
        }
    }

    public SortedSet<un0> o(ln0 ln0) {
        return this.a.c(ln0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            this.e.e(k3.q(this));
        }
    }

    public void onDetachedFromWindow() {
        if (!isInEditMode()) {
            this.e.c();
        }
        super.onDetachedFromWindow();
    }

    public void onMeasure(int i, int i2) {
        if (isInEditMode()) {
            super.onMeasure(i, i2);
            return;
        }
        if (!this.c) {
            super.onMeasure(i, i2);
        } else if (!p()) {
            this.b.j();
            super.onMeasure(i, i2);
            return;
        } else {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode == 1073741824 && mode2 != 1073741824) {
                int size = (int) (((float) View.MeasureSpec.getSize(i)) * getAspectRatio().k());
                if (mode2 == Integer.MIN_VALUE) {
                    size = Math.min(size, View.MeasureSpec.getSize(i2));
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            } else if (mode == 1073741824 || mode2 != 1073741824) {
                super.onMeasure(i, i2);
            } else {
                int size2 = (int) (((float) View.MeasureSpec.getSize(i2)) * getAspectRatio().k());
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(size2, View.MeasureSpec.getSize(i));
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 1073741824), i2);
            }
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        ln0 aspectRatio = getAspectRatio();
        if (this.e.f() % 180 == 0) {
            aspectRatio = aspectRatio.g();
        }
        if (measuredHeight < (aspectRatio.f() * measuredWidth) / aspectRatio.e()) {
            this.a.r().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec((measuredWidth * aspectRatio.f()) / aspectRatio.e(), 1073741824));
        } else {
            this.a.r().measure(View.MeasureSpec.makeMeasureSpec((aspectRatio.e() * measuredHeight) / aspectRatio.f(), 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        setFacing(dVar.a);
        setCameraId(dVar.b);
        setAspectRatio(dVar.c);
        setAutoFocus(dVar.d);
        setFlash(dVar.e);
        setExposureCompensation(dVar.f);
        setFocusDepth(dVar.g);
        setZoom(dVar.h);
        setWhiteBalance(dVar.i);
        setPlaySoundOnCapture(dVar.j);
        setPlaySoundOnRecord(dVar.k);
        setScanning(dVar.l);
        setPictureSize(dVar.m);
    }

    public Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.a = getFacing();
        dVar.b = getCameraId();
        dVar.c = getAspectRatio();
        dVar.d = getAutoFocus();
        dVar.e = getFlash();
        dVar.f = getExposureCompensation();
        dVar.g = getFocusDepth();
        dVar.h = getZoom();
        dVar.i = getWhiteBalance();
        dVar.j = getPlaySoundOnCapture();
        dVar.k = getPlaySoundOnRecord();
        dVar.l = getScanning();
        dVar.m = getPictureSize();
        return dVar;
    }

    public boolean p() {
        return this.a.u();
    }

    public void q() {
        this.a.v();
    }

    public void r() {
        this.a.w();
    }

    public boolean s(String str, int i, int i2, boolean z, CamcorderProfile camcorderProfile, int i3, int i4) {
        return this.a.x(str, i, i2, z, camcorderProfile, i3, i4);
    }

    public void setAdjustViewBounds(boolean z) {
        if (this.c != z) {
            this.c = z;
            requestLayout();
        }
    }

    public void setAspectRatio(ln0 ln0) {
        if (this.a.A(ln0)) {
            requestLayout();
        }
    }

    public void setAutoFocus(boolean z) {
        this.a.B(z);
    }

    public void setCameraId(String str) {
        this.a.C(str);
    }

    public void setExposureCompensation(float f2) {
        this.a.F(f2);
    }

    public void setFacing(int i) {
        this.a.G(i);
    }

    public void setFlash(int i) {
        this.a.H(i);
    }

    public void setFocusDepth(float f2) {
        this.a.J(f2);
    }

    public void setPictureSize(un0 un0) {
        this.a.K(un0);
    }

    public void setPlaySoundOnCapture(boolean z) {
        this.a.L(z);
    }

    public void setPlaySoundOnRecord(boolean z) {
        this.a.M(z);
    }

    public void setPreviewTexture(SurfaceTexture surfaceTexture) {
        this.a.N(surfaceTexture);
    }

    public void setScanning(boolean z) {
        this.a.O(z);
    }

    public void setUsingCamera2Api(boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            boolean p = p();
            Parcelable onSaveInstanceState = onSaveInstanceState();
            if (z && !nn0.h0(this.d)) {
                if (p) {
                    x();
                }
                if (Build.VERSION.SDK_INT < 23) {
                    this.a = new nn0(this.b, this.a.b, this.d, this.g);
                } else {
                    this.a = new on0(this.b, this.a.b, this.d, this.g);
                }
                onRestoreInstanceState(onSaveInstanceState);
            } else if (!(this.a instanceof mn0)) {
                if (p) {
                    x();
                }
                this.a = new mn0(this.b, this.a.b, this.g);
            } else {
                return;
            }
            if (p) {
                w();
            }
        }
    }

    public void setWhiteBalance(int i) {
        this.a.P(i);
    }

    public void setZoom(float f2) {
        this.a.Q(f2);
    }

    public void t() {
        this.a.y();
    }

    public void u() {
        this.a.z();
    }

    public void v(float f2, float f3) {
        this.a.I(f2, f3);
    }

    public void w() {
        this.a.R();
    }

    public void x() {
        this.a.S();
    }

    public void y() {
        this.a.T();
    }

    public void z(ReadableMap readableMap) {
        this.a.U(readableMap);
    }

    public pn0(Context context, AttributeSet attributeSet, boolean z) {
        this(context, attributeSet, 0, z);
    }

    public pn0(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        HandlerThread handlerThread = new HandlerThread(C0201.m82(1964));
        this.f = handlerThread;
        handlerThread.start();
        this.g = new Handler(this.f.getLooper());
        if (isInEditMode()) {
            this.b = null;
            this.e = null;
            return;
        }
        this.c = true;
        this.d = context;
        tn0 n = n(context);
        this.b = new c();
        if (z || Build.VERSION.SDK_INT < 21 || nn0.h0(context)) {
            this.a = new mn0(this.b, n, this.g);
        } else if (Build.VERSION.SDK_INT < 23) {
            this.a = new nn0(this.b, n, context, this.g);
        } else {
            this.a = new on0(this.b, n, context, this.g);
        }
        this.e = new a(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: pn0$d */
    /* compiled from: CameraView */
    public static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = e2.a(new a());
        public int a;
        public String b;
        public ln0 c;
        public boolean d;
        public int e;
        public float f;
        public float g;
        public float h;
        public int i;
        public boolean j;
        public boolean k;
        public boolean l;
        public un0 m;

        /* renamed from: pn0$d$a */
        /* compiled from: CameraView */
        static class a implements f2<d> {
            /* renamed from: a */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            /* renamed from: b */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readString();
            this.c = (ln0) parcel.readParcelable(classLoader);
            boolean z = true;
            this.d = parcel.readByte() != 0;
            this.e = parcel.readInt();
            this.f = parcel.readFloat();
            this.g = parcel.readFloat();
            this.h = parcel.readFloat();
            this.i = parcel.readInt();
            this.j = parcel.readByte() != 0;
            this.k = parcel.readByte() != 0;
            this.l = parcel.readByte() == 0 ? false : z;
            this.m = (un0) parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.a);
            parcel.writeString(this.b);
            parcel.writeParcelable(this.c, 0);
            parcel.writeByte(this.d ? (byte) 1 : 0);
            parcel.writeInt(this.e);
            parcel.writeFloat(this.f);
            parcel.writeFloat(this.g);
            parcel.writeFloat(this.h);
            parcel.writeInt(this.i);
            parcel.writeByte(this.j ? (byte) 1 : 0);
            parcel.writeByte(this.k ? (byte) 1 : 0);
            parcel.writeByte(this.l ? (byte) 1 : 0);
            parcel.writeParcelable(this.m, i2);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
