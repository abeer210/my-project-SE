package com.facebook.react.views.art;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.v0;
import vigqyno.C0201;

/* compiled from: ARTSurfaceViewShadowNode */
public class d extends i implements TextureView.SurfaceTextureListener, LifecycleEventListener {
    private Surface a;
    private Integer b;

    private void b(boolean z) {
        Surface surface = this.a;
        if (surface == null || !surface.isValid()) {
            c(this);
            return;
        }
        try {
            Canvas lockCanvas = this.a.lockCanvas(null);
            lockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (this.b != null) {
                lockCanvas.drawColor(this.b.intValue());
            }
            Paint paint = new Paint();
            for (int i = 0; i < getChildCount(); i++) {
                f fVar = (f) getChildAt(i);
                fVar.b(lockCanvas, paint, 1.0f);
                if (z) {
                    fVar.markUpdated();
                } else {
                    fVar.markUpdateSeen();
                }
            }
            if (this.a != null) {
                this.a.unlockCanvasAndPost(lockCanvas);
            }
        } catch (IllegalArgumentException | IllegalStateException e) {
            f60.i(C0201.m82(8741), e.getClass().getSimpleName() + C0201.m82(8740));
        }
    }

    private void c(a0 a0Var) {
        for (int i = 0; i < a0Var.getChildCount(); i++) {
            a0 childAt = a0Var.getChildAt(i);
            childAt.markUpdateSeen();
            c(childAt);
        }
    }

    public void d(c cVar) {
        SurfaceTexture surfaceTexture = cVar.getSurfaceTexture();
        cVar.setSurfaceTextureListener(this);
        if (surfaceTexture != null && this.a == null) {
            this.a = new Surface(surfaceTexture);
            b(true);
        }
    }

    @Override // com.facebook.react.uimanager.a0, com.facebook.react.uimanager.b0
    public void dispose() {
        super.dispose();
        if (Build.VERSION.SDK_INT > 24) {
            getThemedContext().removeLifecycleEventListener(this);
        }
    }

    @Override // com.facebook.react.uimanager.a0, com.facebook.react.uimanager.b0
    public boolean isVirtual() {
        return false;
    }

    @Override // com.facebook.react.uimanager.b0
    public boolean isVirtualAnchor() {
        return true;
    }

    @Override // com.facebook.react.uimanager.b0
    public void onCollectExtraUpdates(v0 v0Var) {
        super.onCollectExtraUpdates(v0Var);
        b(false);
        v0Var.R(getReactTag(), this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        b(false);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a = new Surface(surfaceTexture);
        b(false);
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.release();
        this.a = null;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @xj0(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        this.b = num;
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.a0, com.facebook.react.uimanager.b0
    public void setThemedContext(k0 k0Var) {
        super.setThemedContext(k0Var);
        if (Build.VERSION.SDK_INT > 24) {
            k0Var.addLifecycleEventListener(this);
        }
    }
}
