package defpackage;

import defpackage.g93;
import vigqyno.C0201;

/* renamed from: h93  reason: default package */
/* compiled from: WOTSPlus */
public final class h93 {
    private final j93 a;
    private final e93 b;
    private byte[] c;
    private byte[] d;

    public h93(j93 j93) {
        if (j93 != null) {
            this.a = j93;
            int b2 = j93.b();
            this.b = new e93(j93.a(), b2);
            this.c = new byte[b2];
            this.d = new byte[b2];
            return;
        }
        throw new NullPointerException(C0201.m82(15624));
    }

    private byte[] a(byte[] bArr, int i, int i2, g93 g93) {
        int b2 = this.a.b();
        if (bArr == null) {
            throw new NullPointerException(C0201.m82(15630));
        } else if (bArr.length != b2) {
            throw new IllegalArgumentException(C0201.m82(15628) + b2 + C0201.m82(15629));
        } else if (g93 == null) {
            throw new NullPointerException(C0201.m82(15627));
        } else if (g93.d() != null) {
            int i3 = i + i2;
            if (i3 > this.a.d() - 1) {
                throw new IllegalArgumentException(C0201.m82(15625));
            } else if (i2 == 0) {
                return bArr;
            } else {
                byte[] a2 = a(bArr, i, i2 - 1, g93);
                g93.b bVar = (g93.b) ((g93.b) new g93.b().g(g93.b())).h(g93.c());
                bVar.p(g93.g());
                bVar.n(g93.e());
                bVar.o(i3 - 1);
                g93 g932 = (g93) ((g93.b) bVar.f(0)).l();
                byte[] c2 = this.b.c(this.d, g932.d());
                g93.b bVar2 = (g93.b) ((g93.b) new g93.b().g(g932.b())).h(g932.c());
                bVar2.p(g932.g());
                bVar2.n(g932.e());
                bVar2.o(g932.f());
                byte[] c3 = this.b.c(this.d, ((g93) ((g93.b) bVar2.f(1)).l()).d());
                byte[] bArr2 = new byte[b2];
                for (int i4 = 0; i4 < b2; i4++) {
                    bArr2[i4] = (byte) (a2[i4] ^ c3[i4]);
                }
                return this.b.a(c2, bArr2);
            }
        } else {
            throw new NullPointerException(C0201.m82(15626));
        }
    }

    private byte[] b(int i) {
        if (i >= 0 && i < this.a.c()) {
            return this.b.c(this.c, v93.p((long) i, 32));
        }
        throw new IllegalArgumentException(C0201.m82(15631));
    }

    public e93 c() {
        return this.b;
    }

    public j93 d() {
        return this.a;
    }

    public k93 e(g93 g93) {
        if (g93 != null) {
            byte[][] bArr = new byte[this.a.c()][];
            for (int i = 0; i < this.a.c(); i++) {
                g93.b bVar = (g93.b) ((g93.b) new g93.b().g(g93.b())).h(g93.c());
                bVar.p(g93.g());
                bVar.n(i);
                bVar.o(g93.f());
                g93 = (g93) ((g93.b) bVar.f(g93.a())).l();
                bArr[i] = a(b(i), 0, this.a.d() - 1, g93);
            }
            return new k93(this.a, bArr);
        }
        throw new NullPointerException(C0201.m82(15632));
    }

    public byte[] f() {
        return v93.c(this.d);
    }

    public byte[] g(byte[] bArr, g93 g93) {
        g93.b bVar = (g93.b) ((g93.b) new g93.b().g(g93.b())).h(g93.c());
        bVar.p(g93.g());
        return this.b.c(bArr, ((g93) bVar.l()).d());
    }

    public void h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException(C0201.m82(15636));
        } else if (bArr.length != this.a.b()) {
            throw new IllegalArgumentException(C0201.m82(15635));
        } else if (bArr2 == null) {
            throw new NullPointerException(C0201.m82(15634));
        } else if (bArr2.length == this.a.b()) {
            this.c = bArr;
            this.d = bArr2;
        } else {
            throw new IllegalArgumentException(C0201.m82(15633));
        }
    }
}
