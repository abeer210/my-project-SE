package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.yalantis.ucrop.d;
import com.yalantis.ucrop.e;
import com.yalantis.ucrop.h;

public class UCropView extends FrameLayout {
    private GestureCropImageView a;
    private final OverlayView b;

    /* access modifiers changed from: package-private */
    public class a implements fu2 {
        public a() {
        }

        @Override // defpackage.fu2
        public void a(float f) {
            UCropView.this.b.setTargetAspectRatio(f);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements gu2 {
        public b() {
        }

        @Override // defpackage.gu2
        public void a(RectF rectF) {
            UCropView.this.a.setCropRect(rectF);
        }
    }

    public UCropView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c() {
        this.a.setCropBoundsChangeListener(new a());
        this.b.setOverlayViewChangeListener(new b());
    }

    public GestureCropImageView getCropImageView() {
        return this.a;
    }

    public OverlayView getOverlayView() {
        return this.b;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public UCropView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(e.ucrop_view, (ViewGroup) this, true);
        this.a = (GestureCropImageView) findViewById(d.image_view_crop);
        this.b = (OverlayView) findViewById(d.view_overlay);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.ucrop_UCropView);
        this.b.g(obtainStyledAttributes);
        this.a.y(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        c();
    }
}
