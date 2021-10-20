package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: lx1  reason: default package */
/* compiled from: AbsoluteCornerSize */
public final class lx1 implements nx1 {
    private final float a;

    public lx1(float f) {
        this.a = f;
    }

    @Override // defpackage.nx1
    public float a(RectF rectF) {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lx1) && this.a == ((lx1) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
