package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: nq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public abstract class nq0 extends lq0 {
    private static final WeakReference<byte[]> c = new WeakReference<>(null);
    private WeakReference<byte[]> b = c;

    public nq0(byte[] bArr) {
        super(bArr);
    }

    @Override // defpackage.lq0
    public final byte[] V3() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.b.get();
            if (bArr == null) {
                bArr = X3();
                this.b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] X3();
}
