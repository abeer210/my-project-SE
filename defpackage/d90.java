package defpackage;

import android.graphics.drawable.Animatable;

/* renamed from: d90  reason: default package */
/* compiled from: ImageLoadingTimeControllerListener */
public class d90 extends y80 {
    private long b = -1;
    private long c = -1;
    private e90 d;

    public d90(e90 e90) {
        this.d = e90;
    }

    @Override // defpackage.y80, defpackage.z80
    public void b(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.c = currentTimeMillis;
        e90 e90 = this.d;
        if (e90 != null) {
            e90.a(currentTimeMillis - this.b);
        }
    }

    @Override // defpackage.y80, defpackage.z80
    public void e(String str, Object obj) {
        this.b = System.currentTimeMillis();
    }
}
