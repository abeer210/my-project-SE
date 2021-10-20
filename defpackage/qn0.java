package defpackage;

import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: qn0  reason: default package */
/* compiled from: CameraViewImpl */
public abstract class qn0 {
    public final a a;
    public final tn0 b;
    public final Handler c;

    /* access modifiers changed from: package-private */
    /* renamed from: qn0$a */
    /* compiled from: CameraViewImpl */
    public interface a {
        void a();

        void b();

        void c(byte[] bArr, int i, int i2, int i3);

        void d();

        void e();

        void f(String str, int i, int i2);

        void g(byte[] bArr, int i);

        void h(String str, int i, int i2);
    }

    public qn0(a aVar, tn0 tn0, Handler handler) {
        this.a = aVar;
        this.b = tn0;
        this.c = handler;
    }

    public abstract boolean A(ln0 ln0);

    public abstract void B(boolean z);

    public abstract void C(String str);

    public abstract void D(int i);

    public abstract void E(int i);

    public abstract void F(float f);

    public abstract void G(int i);

    public abstract void H(int i);

    public abstract void I(float f, float f2);

    public abstract void J(float f);

    public abstract void K(un0 un0);

    public abstract void L(boolean z);

    public abstract void M(boolean z);

    public abstract void N(SurfaceTexture surfaceTexture);

    public abstract void O(boolean z);

    public abstract void P(int i);

    public abstract void Q(float f);

    public abstract boolean R();

    public abstract void S();

    public abstract void T();

    public abstract void U(ReadableMap readableMap);

    public abstract ln0 a();

    public abstract boolean b();

    public abstract SortedSet<un0> c(ln0 ln0);

    public abstract String d();

    public abstract List<Properties> e();

    public abstract int f();

    public abstract float g();

    public abstract int h();

    public abstract int i();

    public abstract float j();

    public abstract un0 k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract un0 n();

    public abstract boolean o();

    public abstract Set<ln0> p();

    public abstract ArrayList<int[]> q();

    public View r() {
        return this.b.h();
    }

    public abstract int s();

    public abstract float t();

    public abstract boolean u();

    public abstract void v();

    public abstract void w();

    public abstract boolean x(String str, int i, int i2, boolean z, CamcorderProfile camcorderProfile, int i3, int i4);

    public abstract void y();

    public abstract void z();
}
