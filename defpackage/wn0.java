package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import org.reactnative.camera.b;

/* renamed from: wn0  reason: default package */
/* compiled from: SurfaceViewPreview */
public class wn0 extends tn0 {
    public final SurfaceView d;

    /* renamed from: wn0$a */
    /* compiled from: SurfaceViewPreview */
    class a implements SurfaceHolder.Callback {
        public a() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            wn0.this.n(i2, i3);
            if (!k3.N(wn0.this.d)) {
                wn0.this.a();
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            wn0.this.n(0, 0);
        }
    }

    public wn0(Context context, ViewGroup viewGroup) {
        SurfaceView surfaceView = (SurfaceView) View.inflate(context, b.surface_view, viewGroup).findViewById(org.reactnative.camera.a.surface_view);
        this.d = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        holder.setType(3);
        holder.addCallback(new a());
    }

    @Override // defpackage.tn0
    public Class d() {
        return SurfaceHolder.class;
    }

    @Override // defpackage.tn0
    public Surface e() {
        return f().getSurface();
    }

    @Override // defpackage.tn0
    public SurfaceHolder f() {
        return this.d.getHolder();
    }

    @Override // defpackage.tn0
    public View h() {
        return this.d;
    }

    @Override // defpackage.tn0
    public boolean j() {
        return (i() == 0 || c() == 0) ? false : true;
    }

    @Override // defpackage.tn0
    public void m(int i) {
    }
}
