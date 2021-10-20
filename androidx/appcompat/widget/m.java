package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* compiled from: AppCompatImageButton */
public class m extends ImageButton implements j3, androidx.core.widget.m {
    private final e a;
    private final n b;

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.imageButtonStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.a;
        if (eVar != null) {
            eVar.b();
        }
        n nVar = this.b;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // defpackage.j3
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // defpackage.j3
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.m
    public ColorStateList getSupportImageTintList() {
        n nVar = this.b;
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.m
    public PorterDuff.Mode getSupportImageTintMode() {
        n nVar = this.b;
        if (nVar != null) {
            return nVar.d();
        }
        return null;
    }

    public boolean hasOverlappingRendering() {
        return this.b.e() && super.hasOverlappingRendering();
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.a;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        n nVar = this.b;
        if (nVar != null) {
            nVar.b();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        n nVar = this.b;
        if (nVar != null) {
            nVar.b();
        }
    }

    public void setImageResource(int i) {
        this.b.g(i);
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        n nVar = this.b;
        if (nVar != null) {
            nVar.b();
        }
    }

    @Override // defpackage.j3
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // defpackage.j3
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportImageTintList(ColorStateList colorStateList) {
        n nVar = this.b;
        if (nVar != null) {
            nVar.h(colorStateList);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        n nVar = this.b;
        if (nVar != null) {
            nVar.i(mode);
        }
    }

    public m(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        e eVar = new e(this);
        this.a = eVar;
        eVar.e(attributeSet, i);
        n nVar = new n(this);
        this.b = nVar;
        nVar.f(attributeSet, i);
    }
}
