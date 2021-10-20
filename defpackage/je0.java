package defpackage;

import android.graphics.Bitmap;

/* renamed from: je0  reason: default package */
/* compiled from: BaseBitmapDataSubscriber */
public abstract class je0 extends m70<v60<ye0>> {
    @Override // defpackage.m70
    public void f(n70<v60<ye0>> n70) {
        if (n70.b()) {
            v60<ye0> f = n70.f();
            Bitmap bitmap = null;
            if (f != null && (f.w() instanceof xe0)) {
                bitmap = ((xe0) f.w()).n();
            }
            try {
                g(bitmap);
            } finally {
                v60.s(f);
            }
        }
    }

    public abstract void g(Bitmap bitmap);
}
