package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import org.reactnative.camera.b;

@TargetApi(14)
/* renamed from: xn0  reason: default package */
/* compiled from: TextureViewPreview */
public class xn0 extends tn0 {
    private final TextureView d;
    private int e;

    /* renamed from: xn0$a */
    /* compiled from: TextureViewPreview */
    class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            xn0.this.n(i, i2);
            xn0.this.o();
            xn0.this.a();
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            xn0.this.n(0, 0);
            xn0.this.b();
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            xn0.this.n(i, i2);
            xn0.this.o();
            xn0.this.a();
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public xn0(Context context, ViewGroup viewGroup) {
        TextureView textureView = (TextureView) View.inflate(context, b.texture_view, viewGroup).findViewById(org.reactnative.camera.a.texture_view);
        this.d = textureView;
        textureView.setSurfaceTextureListener(new a());
    }

    @Override // defpackage.tn0
    public Class d() {
        return SurfaceTexture.class;
    }

    @Override // defpackage.tn0
    public Surface e() {
        return new Surface(this.d.getSurfaceTexture());
    }

    @Override // defpackage.tn0
    public View h() {
        return this.d;
    }

    @Override // defpackage.tn0
    public boolean j() {
        return this.d.getSurfaceTexture() != null;
    }

    @Override // defpackage.tn0
    @TargetApi(15)
    public void k(int i, int i2) {
        this.d.getSurfaceTexture().setDefaultBufferSize(i, i2);
    }

    @Override // defpackage.tn0
    public void m(int i) {
        this.e = i;
        o();
    }

    public void o() {
        Matrix matrix = new Matrix();
        int i = this.e;
        if (i % 180 == 90) {
            float i2 = (float) i();
            float c = (float) c();
            matrix.setPolyToPoly(new float[]{0.0f, 0.0f, i2, 0.0f, 0.0f, c, i2, c}, 0, this.e == 90 ? new float[]{0.0f, c, 0.0f, 0.0f, i2, c, i2, 0.0f} : new float[]{i2, 0.0f, i2, c, 0.0f, 0.0f, 0.0f, c}, 0, 4);
        } else if (i == 180) {
            matrix.postRotate(180.0f, (float) (i() / 2), (float) (c() / 2));
        }
        this.d.setTransform(matrix);
    }

    /* renamed from: p */
    public SurfaceTexture g() {
        return this.d.getSurfaceTexture();
    }
}
