package defpackage;

import java.util.Arrays;

/* renamed from: oq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class oq0 extends lq0 {
    private final byte[] b;

    public oq0(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    @Override // defpackage.lq0
    public final byte[] V3() {
        return this.b;
    }
}
