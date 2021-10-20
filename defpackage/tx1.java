package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: tx1  reason: default package */
/* compiled from: RelativeCornerSize */
public final class tx1 implements nx1 {
    private final float a;

    public tx1(float f) {
        this.a = f;
    }

    @Override // defpackage.nx1
    public float a(RectF rectF) {
        return this.a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tx1) && this.a == ((tx1) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
