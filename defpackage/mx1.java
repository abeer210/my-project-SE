package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: mx1  reason: default package */
/* compiled from: AdjustedCornerSize */
public final class mx1 implements nx1 {
    private final nx1 a;
    private final float b;

    public mx1(float f, nx1 nx1) {
        while (nx1 instanceof mx1) {
            nx1 = ((mx1) nx1).a;
            f += ((mx1) nx1).b;
        }
        this.a = nx1;
        this.b = f;
    }

    @Override // defpackage.nx1
    public float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx1)) {
            return false;
        }
        mx1 mx1 = (mx1) obj;
        if (!this.a.equals(mx1.a) || this.b != mx1.b) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
