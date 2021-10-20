package defpackage;

import java.security.spec.KeySpec;

/* renamed from: va3  reason: default package */
/* compiled from: RainbowPublicKeySpec */
public class va3 implements KeySpec {
    private short[][] a;
    private short[][] b;
    private short[] c;
    private int d;

    public va3(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.d = i;
        this.a = sArr;
        this.b = sArr2;
        this.c = sArr3;
    }

    public short[][] a() {
        return this.a;
    }

    public short[] b() {
        return this.c;
    }

    public short[][] c() {
        return this.b;
    }

    public int d() {
        return this.d;
    }
}
