package defpackage;

/* renamed from: d83  reason: default package */
/* compiled from: RainbowPrivateKey */
public class d83 extends o03 {
    private m03 a;
    private p03 b;
    private byte[][] c;
    private byte[] d;
    private byte[][] e;
    private byte[] f;
    private byte[] g;
    private u83[] h;

    private d83(v03 v03) {
        int i = 0;
        if (v03.t(0) instanceof m03) {
            this.a = m03.q(v03.t(0));
        } else {
            this.b = p03.v(v03.t(0));
        }
        v03 v032 = (v03) v03.t(1);
        this.c = new byte[v032.size()][];
        for (int i2 = 0; i2 < v032.size(); i2++) {
            this.c[i2] = ((q03) v032.t(i2)).s();
        }
        this.d = ((q03) ((v03) v03.t(2)).t(0)).s();
        v03 v033 = (v03) v03.t(3);
        this.e = new byte[v033.size()][];
        for (int i3 = 0; i3 < v033.size(); i3++) {
            this.e[i3] = ((q03) v033.t(i3)).s();
        }
        this.f = ((q03) ((v03) v03.t(4)).t(0)).s();
        this.g = ((q03) ((v03) v03.t(5)).t(0)).s();
        v03 v034 = (v03) v03.t(6);
        byte[][][][] bArr = new byte[v034.size()][][][];
        byte[][][][] bArr2 = new byte[v034.size()][][][];
        byte[][][] bArr3 = new byte[v034.size()][][];
        byte[][] bArr4 = new byte[v034.size()][];
        int i4 = 0;
        while (i4 < v034.size()) {
            v03 v035 = (v03) v034.t(i4);
            v03 v036 = (v03) v035.t(i);
            bArr[i4] = new byte[v036.size()][][];
            for (int i5 = 0; i5 < v036.size(); i5++) {
                v03 v037 = (v03) v036.t(i5);
                bArr[i4][i5] = new byte[v037.size()][];
                for (int i6 = 0; i6 < v037.size(); i6++) {
                    bArr[i4][i5][i6] = ((q03) v037.t(i6)).s();
                }
            }
            v03 v038 = (v03) v035.t(1);
            bArr2[i4] = new byte[v038.size()][][];
            for (int i7 = 0; i7 < v038.size(); i7++) {
                v03 v039 = (v03) v038.t(i7);
                bArr2[i4][i7] = new byte[v039.size()][];
                for (int i8 = 0; i8 < v039.size(); i8++) {
                    bArr2[i4][i7][i8] = ((q03) v039.t(i8)).s();
                }
            }
            v03 v0310 = (v03) v035.t(2);
            bArr3[i4] = new byte[v0310.size()][];
            for (int i9 = 0; i9 < v0310.size(); i9++) {
                bArr3[i4][i9] = ((q03) v0310.t(i9)).s();
            }
            bArr4[i4] = ((q03) v035.t(3)).s();
            i4++;
            i = 0;
        }
        int length = this.g.length - 1;
        this.h = new u83[length];
        int i10 = 0;
        while (i10 < length) {
            byte[] bArr5 = this.g;
            int i11 = i10 + 1;
            this.h[i10] = new u83(bArr5[i10], bArr5[i11], v83.f(bArr[i10]), v83.f(bArr2[i10]), v83.d(bArr3[i10]), v83.b(bArr4[i10]));
            i10 = i11;
        }
    }

    public static d83 j(Object obj) {
        if (obj instanceof d83) {
            return (d83) obj;
        }
        if (obj != null) {
            return new d83(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        m03 m03 = this.a;
        if (m03 != null) {
            h03.a(m03);
        } else {
            h03.a(this.b);
        }
        h03 h032 = new h03();
        int i = 0;
        while (true) {
            byte[][] bArr = this.c;
            if (i >= bArr.length) {
                break;
            }
            h032.a(new a23(bArr[i]));
            i++;
        }
        h03.a(new e23(h032));
        h03 h033 = new h03();
        h033.a(new a23(this.d));
        h03.a(new e23(h033));
        h03 h034 = new h03();
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.e;
            if (i2 >= bArr2.length) {
                break;
            }
            h034.a(new a23(bArr2[i2]));
            i2++;
        }
        h03.a(new e23(h034));
        h03 h035 = new h03();
        h035.a(new a23(this.f));
        h03.a(new e23(h035));
        h03 h036 = new h03();
        h036.a(new a23(this.g));
        h03.a(new e23(h036));
        h03 h037 = new h03();
        for (int i3 = 0; i3 < this.h.length; i3++) {
            h03 h038 = new h03();
            byte[][][] e2 = v83.e(this.h[i3].a());
            h03 h039 = new h03();
            for (int i4 = 0; i4 < e2.length; i4++) {
                h03 h0310 = new h03();
                for (int i5 = 0; i5 < e2[i4].length; i5++) {
                    h0310.a(new a23(e2[i4][i5]));
                }
                h039.a(new e23(h0310));
            }
            h038.a(new e23(h039));
            byte[][][] e3 = v83.e(this.h[i3].b());
            h03 h0311 = new h03();
            for (int i6 = 0; i6 < e3.length; i6++) {
                h03 h0312 = new h03();
                for (int i7 = 0; i7 < e3[i6].length; i7++) {
                    h0312.a(new a23(e3[i6][i7]));
                }
                h0311.a(new e23(h0312));
            }
            h038.a(new e23(h0311));
            byte[][] c2 = v83.c(this.h[i3].d());
            h03 h0313 = new h03();
            for (byte[] bArr3 : c2) {
                h0313.a(new a23(bArr3));
            }
            h038.a(new e23(h0313));
            h038.a(new a23(v83.a(this.h[i3].c())));
            h037.a(new e23(h038));
        }
        h03.a(new e23(h037));
        return new e23(h03);
    }

    public short[] g() {
        return v83.b(this.d);
    }

    public short[] i() {
        return v83.b(this.f);
    }

    public short[][] k() {
        return v83.d(this.c);
    }

    public short[][] l() {
        return v83.d(this.e);
    }

    public u83[] o() {
        return this.h;
    }

    public int[] p() {
        return v83.g(this.g);
    }

    public d83(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, u83[] u83Arr) {
        this.a = new m03(1);
        this.c = v83.c(sArr);
        this.d = v83.a(sArr2);
        this.e = v83.c(sArr3);
        this.f = v83.a(sArr4);
        this.g = v83.h(iArr);
        this.h = u83Arr;
    }
}
