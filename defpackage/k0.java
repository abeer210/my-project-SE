package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import defpackage.q0;

/* renamed from: k0  reason: default package */
/* compiled from: CardViewApi17Impl */
public class k0 extends m0 {

    /* renamed from: k0$a */
    /* compiled from: CardViewApi17Impl */
    class a implements q0.a {
        public a(k0 k0Var) {
        }

        @Override // defpackage.q0.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // defpackage.o0, defpackage.m0
    public void h() {
        q0.r = new a(this);
    }
}
