package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import defpackage.ng;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: rg  reason: default package */
/* compiled from: StandardGifDecoder */
public class rg implements ng {
    private static final String u = null;
    private int[] a;
    private final int[] b;
    private final ng.a c;
    private ByteBuffer d;
    private byte[] e;
    private short[] f;
    private byte[] g;
    private byte[] h;
    private byte[] i;
    private int[] j;
    private int k;
    private pg l;
    private Bitmap m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private Boolean s;
    private Bitmap.Config t;

    static {
        C0201.m83(rg.class, 727);
    }

    public rg(ng.a aVar, pg pgVar, ByteBuffer byteBuffer, int i2) {
        this(aVar);
        r(pgVar, byteBuffer, i2);
    }

    private int a(int i2, int i3, int i4) {
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = i2; i10 < this.p + i2; i10++) {
            byte[] bArr = this.i;
            if (i10 >= bArr.length || i10 >= i3) {
                break;
            }
            int i11 = this.a[bArr[i10] & 255];
            if (i11 != 0) {
                i5 += (i11 >> 24) & 255;
                i6 += (i11 >> 16) & 255;
                i7 += (i11 >> 8) & 255;
                i8 += i11 & 255;
                i9++;
            }
        }
        int i12 = i2 + i4;
        for (int i13 = i12; i13 < this.p + i12; i13++) {
            byte[] bArr2 = this.i;
            if (i13 >= bArr2.length || i13 >= i3) {
                break;
            }
            int i14 = this.a[bArr2[i13] & 255];
            if (i14 != 0) {
                i5 += (i14 >> 24) & 255;
                i6 += (i14 >> 16) & 255;
                i7 += (i14 >> 8) & 255;
                i8 += i14 & 255;
                i9++;
            }
        }
        if (i9 == 0) {
            return 0;
        }
        return ((i5 / i9) << 24) | ((i6 / i9) << 16) | ((i7 / i9) << 8) | (i8 / i9);
    }

    private void k(og ogVar) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = this.j;
        int i7 = ogVar.d;
        int i8 = this.p;
        int i9 = i7 / i8;
        int i10 = ogVar.b / i8;
        int i11 = ogVar.c / i8;
        int i12 = ogVar.a / i8;
        boolean z2 = this.k == 0;
        int i13 = this.p;
        int i14 = this.r;
        int i15 = this.q;
        byte[] bArr = this.i;
        int[] iArr2 = this.a;
        Boolean bool = this.s;
        int i16 = 8;
        int i17 = 0;
        int i18 = 0;
        int i19 = 1;
        while (i17 < i9) {
            Boolean bool2 = bool;
            if (ogVar.e) {
                if (i18 >= i9) {
                    i2 = i9;
                    int i20 = i19 + 1;
                    if (i20 == 2) {
                        i19 = i20;
                        i18 = 4;
                    } else if (i20 == 3) {
                        i19 = i20;
                        i18 = 2;
                        i16 = 4;
                    } else if (i20 != 4) {
                        i19 = i20;
                    } else {
                        i19 = i20;
                        i18 = 1;
                        i16 = 2;
                    }
                } else {
                    i2 = i9;
                }
                i3 = i18 + i16;
            } else {
                i2 = i9;
                i3 = i18;
                i18 = i17;
            }
            int i21 = i18 + i10;
            boolean z3 = i13 == 1;
            if (i21 < i15) {
                int i22 = i21 * i14;
                int i23 = i22 + i12;
                int i24 = i23 + i11;
                int i25 = i22 + i14;
                if (i25 < i24) {
                    i24 = i25;
                }
                i4 = i3;
                int i26 = i17 * i13 * ogVar.c;
                if (z3) {
                    int i27 = i23;
                    while (i27 < i24) {
                        int i28 = iArr2[bArr[i26] & 255];
                        if (i28 != 0) {
                            iArr[i27] = i28;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i26 += i13;
                        i27++;
                        i10 = i10;
                    }
                } else {
                    i6 = i10;
                    int i29 = ((i24 - i23) * i13) + i26;
                    int i30 = i23;
                    while (true) {
                        i5 = i11;
                        if (i30 >= i24) {
                            break;
                        }
                        int a2 = a(i26, i29, ogVar.c);
                        if (a2 != 0) {
                            iArr[i30] = a2;
                        } else if (z2 && bool2 == null) {
                            bool2 = Boolean.TRUE;
                        }
                        i26 += i13;
                        i30++;
                        i11 = i5;
                    }
                    bool = bool2;
                    i17++;
                    i10 = i6;
                    i11 = i5;
                    i9 = i2;
                    i18 = i4;
                }
            } else {
                i4 = i3;
            }
            i6 = i10;
            i5 = i11;
            bool = bool2;
            i17++;
            i10 = i6;
            i11 = i5;
            i9 = i2;
            i18 = i4;
        }
        if (this.s == null) {
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            this.s = Boolean.valueOf(z);
        }
    }

    private void l(og ogVar) {
        og ogVar2 = ogVar;
        int[] iArr = this.j;
        int i2 = ogVar2.d;
        int i3 = ogVar2.b;
        int i4 = ogVar2.c;
        int i5 = ogVar2.a;
        boolean z = this.k == 0;
        int i6 = this.r;
        byte[] bArr = this.i;
        int[] iArr2 = this.a;
        int i7 = 0;
        byte b2 = -1;
        while (i7 < i2) {
            int i8 = (i7 + i3) * i6;
            int i9 = i8 + i5;
            int i10 = i9 + i4;
            int i11 = i8 + i6;
            if (i11 < i10) {
                i10 = i11;
            }
            int i12 = ogVar2.c * i7;
            int i13 = i9;
            while (i13 < i10) {
                byte b3 = bArr[i12];
                int i14 = b3 & 255;
                if (i14 != b2) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i13] = i15;
                    } else {
                        b2 = b3;
                    }
                }
                i12++;
                i13++;
                i2 = i2;
            }
            i7++;
            ogVar2 = ogVar;
        }
        Boolean bool = this.s;
        this.s = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.s == null && z && b2 != -1));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x00f7 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: short[] */
    /* JADX DEBUG: Multi-variable search result rejected for r7v13, resolved type: short */
    /* JADX WARN: Multi-variable type inference failed */
    private void m(og ogVar) {
        int i2;
        int i3;
        short s2;
        rg rgVar = this;
        if (ogVar != null) {
            rgVar.d.position(ogVar.j);
        }
        if (ogVar == null) {
            pg pgVar = rgVar.l;
            i2 = pgVar.f;
            i3 = pgVar.g;
        } else {
            i2 = ogVar.c;
            i3 = ogVar.d;
        }
        int i4 = i2 * i3;
        byte[] bArr = rgVar.i;
        if (bArr == null || bArr.length < i4) {
            rgVar.i = rgVar.c.e(i4);
        }
        byte[] bArr2 = rgVar.i;
        if (rgVar.f == null) {
            rgVar.f = new short[4096];
        }
        short[] sArr = rgVar.f;
        if (rgVar.g == null) {
            rgVar.g = new byte[4096];
        }
        byte[] bArr3 = rgVar.g;
        if (rgVar.h == null) {
            rgVar.h = new byte[4097];
        }
        byte[] bArr4 = rgVar.h;
        int q2 = q();
        int i5 = 1 << q2;
        int i6 = i5 + 1;
        int i7 = i5 + 2;
        int i8 = q2 + 1;
        int i9 = (1 << i8) - 1;
        int i10 = 0;
        for (int i11 = 0; i11 < i5; i11++) {
            sArr[i11] = 0;
            bArr3[i11] = (byte) i11;
        }
        byte[] bArr5 = rgVar.e;
        int i12 = i8;
        int i13 = i7;
        int i14 = i9;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        while (true) {
            if (i10 >= i4) {
                break;
            }
            if (i15 == 0) {
                i15 = p();
                if (i15 <= 0) {
                    rgVar.o = 3;
                    break;
                }
                i16 = 0;
            }
            i18 += (bArr5[i16] & 255) << i17;
            i16++;
            i15--;
            int i23 = i17 + 8;
            int i24 = i13;
            int i25 = i12;
            int i26 = i20;
            int i27 = i21;
            while (true) {
                if (i23 < i25) {
                    i20 = i26;
                    i13 = i24;
                    i17 = i23;
                    rgVar = this;
                    i21 = i27;
                    i8 = i8;
                    i12 = i25;
                    break;
                }
                int i28 = i18 & i14;
                i18 >>= i25;
                i23 -= i25;
                if (i28 == i5) {
                    i14 = i9;
                    i25 = i8;
                    i24 = i7;
                    i7 = i24;
                    i26 = -1;
                } else if (i28 == i6) {
                    i17 = i23;
                    i21 = i27;
                    i13 = i24;
                    i8 = i8;
                    i7 = i7;
                    i20 = i26;
                    i12 = i25;
                    rgVar = this;
                    break;
                } else if (i26 == -1) {
                    bArr2[i19] = bArr3[i28];
                    i19++;
                    i10++;
                    i26 = i28;
                    i27 = i26;
                    i7 = i7;
                    i23 = i23;
                } else {
                    if (i28 >= i24) {
                        bArr4[i22] = (byte) i27;
                        i22++;
                        s2 = i26;
                    } else {
                        s2 = i28;
                    }
                    while (s2 >= i5) {
                        bArr4[i22] = bArr3[s2];
                        i22++;
                        s2 = sArr[s2];
                    }
                    i27 = bArr3[s2] & 255;
                    byte b2 = (byte) i27;
                    bArr2[i19] = b2;
                    while (true) {
                        i19++;
                        i10++;
                        if (i22 <= 0) {
                            break;
                        }
                        i22--;
                        bArr2[i19] = bArr4[i22];
                    }
                    if (i24 < 4096) {
                        sArr[i24] = (short) i26;
                        bArr3[i24] = b2;
                        i24++;
                        if ((i24 & i14) == 0 && i24 < 4096) {
                            i25++;
                            i14 += i24;
                        }
                    }
                    i26 = i28;
                    i7 = i7;
                    i23 = i23;
                    bArr4 = bArr4;
                }
            }
        }
        Arrays.fill(bArr2, i19, i4, (byte) 0);
    }

    private Bitmap o() {
        Boolean bool = this.s;
        Bitmap a2 = this.c.a(this.r, this.q, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.t);
        a2.setHasAlpha(true);
        return a2;
    }

    private int p() {
        int q2 = q();
        if (q2 <= 0) {
            return q2;
        }
        ByteBuffer byteBuffer = this.d;
        byteBuffer.get(this.e, 0, Math.min(q2, byteBuffer.remaining()));
        return q2;
    }

    private int q() {
        return this.d.get() & 255;
    }

    private Bitmap s(og ogVar, og ogVar2) {
        int i2;
        int i3;
        Bitmap bitmap;
        int[] iArr = this.j;
        int i4 = 0;
        if (ogVar2 == null) {
            Bitmap bitmap2 = this.m;
            if (bitmap2 != null) {
                this.c.c(bitmap2);
            }
            this.m = null;
            Arrays.fill(iArr, 0);
        }
        if (ogVar2 != null && ogVar2.g == 3 && this.m == null) {
            Arrays.fill(iArr, 0);
        }
        if (ogVar2 != null && (i3 = ogVar2.g) > 0) {
            if (i3 == 2) {
                if (!ogVar.f) {
                    pg pgVar = this.l;
                    int i5 = pgVar.l;
                    if (ogVar.k == null || pgVar.j != ogVar.h) {
                        i4 = i5;
                    }
                }
                int i6 = ogVar2.d;
                int i7 = this.p;
                int i8 = i6 / i7;
                int i9 = ogVar2.b / i7;
                int i10 = ogVar2.c / i7;
                int i11 = ogVar2.a / i7;
                int i12 = this.r;
                int i13 = (i9 * i12) + i11;
                int i14 = (i8 * i12) + i13;
                while (i13 < i14) {
                    int i15 = i13 + i10;
                    for (int i16 = i13; i16 < i15; i16++) {
                        iArr[i16] = i4;
                    }
                    i13 += this.r;
                }
            } else if (i3 == 3 && (bitmap = this.m) != null) {
                int i17 = this.r;
                bitmap.getPixels(iArr, 0, i17, 0, 0, i17, this.q);
            }
        }
        m(ogVar);
        if (ogVar.e || this.p != 1) {
            k(ogVar);
        } else {
            l(ogVar);
        }
        if (this.n && ((i2 = ogVar.g) == 0 || i2 == 1)) {
            if (this.m == null) {
                this.m = o();
            }
            Bitmap bitmap3 = this.m;
            int i18 = this.r;
            bitmap3.setPixels(iArr, 0, i18, 0, 0, i18, this.q);
        }
        Bitmap o2 = o();
        int i19 = this.r;
        o2.setPixels(iArr, 0, i19, 0, 0, i19, this.q);
        return o2;
    }

    @Override // defpackage.ng
    public int b() {
        return this.l.c;
    }

    @Override // defpackage.ng
    public synchronized Bitmap c() {
        if (this.l.c <= 0 || this.k < 0) {
            if (Log.isLoggable(u, 3)) {
                String str = u;
                Log.d(str, C0201.m82(3124) + this.l.c + C0201.m82(3125) + this.k);
            }
            this.o = 1;
        }
        if (this.o != 1) {
            if (this.o != 2) {
                this.o = 0;
                if (this.e == null) {
                    this.e = this.c.e(255);
                }
                og ogVar = this.l.e.get(this.k);
                int i2 = this.k - 1;
                og ogVar2 = i2 >= 0 ? this.l.e.get(i2) : null;
                int[] iArr = ogVar.k != null ? ogVar.k : this.l.a;
                this.a = iArr;
                if (iArr == null) {
                    if (Log.isLoggable(u, 3)) {
                        String str2 = u;
                        Log.d(str2, C0201.m82(3126) + this.k);
                    }
                    this.o = 1;
                    return null;
                }
                if (ogVar.f) {
                    System.arraycopy(iArr, 0, this.b, 0, iArr.length);
                    int[] iArr2 = this.b;
                    this.a = iArr2;
                    iArr2[ogVar.h] = 0;
                    if (ogVar.g == 2 && this.k == 0) {
                        this.s = Boolean.TRUE;
                    }
                }
                return s(ogVar, ogVar2);
            }
        }
        if (Log.isLoggable(u, 3)) {
            String str3 = u;
            Log.d(str3, C0201.m82(3127) + this.o);
        }
        return null;
    }

    @Override // defpackage.ng
    public void clear() {
        this.l = null;
        byte[] bArr = this.i;
        if (bArr != null) {
            this.c.d(bArr);
        }
        int[] iArr = this.j;
        if (iArr != null) {
            this.c.f(iArr);
        }
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.c.c(bitmap);
        }
        this.m = null;
        this.d = null;
        this.s = null;
        byte[] bArr2 = this.e;
        if (bArr2 != null) {
            this.c.d(bArr2);
        }
    }

    @Override // defpackage.ng
    public void d() {
        this.k = (this.k + 1) % this.l.c;
    }

    @Override // defpackage.ng
    public int e() {
        int i2;
        if (this.l.c <= 0 || (i2 = this.k) < 0) {
            return 0;
        }
        return n(i2);
    }

    @Override // defpackage.ng
    public void f(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.t = config;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(3128) + config + C0201.m82(3129) + Bitmap.Config.ARGB_8888 + C0201.m82(3130) + Bitmap.Config.RGB_565);
    }

    @Override // defpackage.ng
    public ByteBuffer g() {
        return this.d;
    }

    @Override // defpackage.ng
    public void h() {
        this.k = -1;
    }

    @Override // defpackage.ng
    public int i() {
        return this.k;
    }

    @Override // defpackage.ng
    public int j() {
        return this.d.limit() + this.i.length + (this.j.length * 4);
    }

    public int n(int i2) {
        if (i2 >= 0) {
            pg pgVar = this.l;
            if (i2 < pgVar.c) {
                return pgVar.e.get(i2).i;
            }
        }
        return -1;
    }

    public synchronized void r(pg pgVar, ByteBuffer byteBuffer, int i2) {
        if (i2 > 0) {
            int highestOneBit = Integer.highestOneBit(i2);
            this.o = 0;
            this.l = pgVar;
            this.k = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.d = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.d.order(ByteOrder.LITTLE_ENDIAN);
            this.n = false;
            Iterator<og> it = pgVar.e.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().g == 3) {
                        this.n = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            this.p = highestOneBit;
            this.r = pgVar.f / highestOneBit;
            this.q = pgVar.g / highestOneBit;
            this.i = this.c.e(pgVar.f * pgVar.g);
            this.j = this.c.b(this.r * this.q);
        } else {
            throw new IllegalArgumentException(C0201.m82(3131) + i2);
        }
    }

    public rg(ng.a aVar) {
        this.b = new int[256];
        this.t = Bitmap.Config.ARGB_8888;
        this.c = aVar;
        this.l = new pg();
    }
}
