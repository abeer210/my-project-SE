package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* renamed from: j3  reason: default package */
/* compiled from: TintableBackgroundView */
public interface j3 {
    ColorStateList getSupportBackgroundTintList();

    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(ColorStateList colorStateList);

    void setSupportBackgroundTintMode(PorterDuff.Mode mode);
}
