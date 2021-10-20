package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.k;

/* renamed from: lo  reason: default package */
/* compiled from: PreloadTarget */
public final class lo<Z> extends go<Z> {
    private static final Handler e = new Handler(Looper.getMainLooper(), new a());
    private final k d;

    /* renamed from: lo$a */
    /* compiled from: PreloadTarget */
    class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((lo) message.obj).i();
            return true;
        }
    }

    private lo(k kVar, int i, int i2) {
        super(i, i2);
        this.d = kVar;
    }

    public static <Z> lo<Z> j(k kVar, int i, int i2) {
        return new lo<>(kVar, i, i2);
    }

    @Override // defpackage.no
    public void b(Z z, qo<? super Z> qoVar) {
        e.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.no
    public void g(Drawable drawable) {
    }

    public void i() {
        this.d.m(this);
    }
}
