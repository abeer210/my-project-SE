package defpackage;

/* renamed from: q63  reason: default package */
/* compiled from: LongDigest */
public abstract class q63 implements m63 {
    public static final long[] o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    private byte[] a = new byte[8];
    private int b = 0;
    private long c;
    private long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    private long[] m = new long[80];
    private int n;

    public q63() {
        q();
    }

    private long f(long j2, long j3, long j4) {
        return ((j2 ^ -1) & j4) ^ (j3 & j2);
    }

    private long g(long j2, long j3, long j4) {
        return ((j2 & j4) ^ (j2 & j3)) ^ (j3 & j4);
    }

    private long h(long j2) {
        return (j2 >>> 7) ^ (((j2 << 63) | (j2 >>> 1)) ^ ((j2 << 56) | (j2 >>> 8)));
    }

    private long i(long j2) {
        return (j2 >>> 6) ^ (((j2 << 45) | (j2 >>> 19)) ^ ((j2 << 3) | (j2 >>> 61)));
    }

    private long j(long j2) {
        return ((j2 >>> 39) | (j2 << 25)) ^ (((j2 << 36) | (j2 >>> 28)) ^ ((j2 << 30) | (j2 >>> 34)));
    }

    private long k(long j2) {
        return ((j2 >>> 41) | (j2 << 23)) ^ (((j2 << 50) | (j2 >>> 14)) ^ ((j2 << 46) | (j2 >>> 18)));
    }

    private void l() {
        long j2 = this.c;
        if (j2 > 2305843009213693951L) {
            this.d += j2 >>> 61;
            this.c = j2 & 2305843009213693951L;
        }
    }

    @Override // defpackage.m63
    public void b(byte[] bArr, int i2, int i3) {
        while (this.b != 0 && i3 > 0) {
            r(bArr[i2]);
            i2++;
            i3--;
        }
        while (i3 > this.a.length) {
            p(bArr, i2);
            byte[] bArr2 = this.a;
            i2 += bArr2.length;
            i3 -= bArr2.length;
            this.c += (long) bArr2.length;
        }
        while (i3 > 0) {
            r(bArr[i2]);
            i2++;
            i3--;
        }
    }

    public void m() {
        l();
        long j2 = this.c << 3;
        long j3 = this.d;
        r(Byte.MIN_VALUE);
        while (this.b != 0) {
            r((byte) 0);
        }
        o(j2, j3);
        n();
    }

    public void n() {
        l();
        for (int i2 = 16; i2 <= 79; i2++) {
            long[] jArr = this.m;
            long i3 = i(jArr[i2 - 2]);
            long[] jArr2 = this.m;
            jArr[i2] = i3 + jArr2[i2 - 7] + h(jArr2[i2 - 15]) + this.m[i2 - 16];
        }
        long j2 = this.e;
        long j3 = this.f;
        long j4 = this.g;
        long j5 = this.h;
        long j6 = this.i;
        long j7 = this.j;
        long j8 = this.k;
        long j9 = j7;
        long j10 = j5;
        int i4 = 0;
        long j11 = j3;
        long j12 = j4;
        long j13 = j6;
        int i5 = 0;
        long j14 = this.l;
        long j15 = j2;
        long j16 = j8;
        while (i5 < 10) {
            int i6 = i4 + 1;
            long k2 = j14 + k(j13) + f(j13, j9, j16) + o[i4] + this.m[i4];
            long j17 = j10 + k2;
            long j18 = k2 + j(j15) + g(j15, j11, j12);
            int i7 = i6 + 1;
            long k3 = j16 + k(j17) + f(j17, j13, j9) + o[i6] + this.m[i6];
            long j19 = j12 + k3;
            long j20 = k3 + j(j18) + g(j18, j15, j11);
            int i8 = i7 + 1;
            long k4 = j9 + k(j19) + f(j19, j17, j13) + o[i7] + this.m[i7];
            long j21 = j11 + k4;
            long j22 = k4 + j(j20) + g(j20, j18, j15);
            int i9 = i8 + 1;
            long k5 = j13 + k(j21) + f(j21, j19, j17) + o[i8] + this.m[i8];
            long j23 = j15 + k5;
            long j24 = k5 + j(j22) + g(j22, j20, j18);
            int i10 = i9 + 1;
            long k6 = j17 + k(j23) + f(j23, j21, j19) + o[i9] + this.m[i9];
            long j25 = j18 + k6;
            long j26 = k6 + j(j24) + g(j24, j22, j20);
            int i11 = i10 + 1;
            long k7 = j19 + k(j25) + f(j25, j23, j21) + o[i10] + this.m[i10];
            long j27 = j20 + k7;
            long j28 = k7 + j(j26) + g(j26, j24, j22);
            j16 = j27;
            int i12 = i11 + 1;
            long k8 = j21 + k(j27) + f(j27, j25, j23) + o[i11] + this.m[i11];
            long j29 = j22 + k8;
            j9 = j29;
            j11 = k8 + j(j28) + g(j28, j26, j24);
            long k9 = j23 + k(j29) + f(j29, j16, j25) + o[i12] + this.m[i12];
            long j30 = k9 + j(j11) + g(j11, j28, j26);
            i5++;
            j13 = j24 + k9;
            j12 = j28;
            j14 = j25;
            j10 = j26;
            i4 = i12 + 1;
            j15 = j30;
        }
        this.e += j15;
        this.f += j11;
        this.g += j12;
        this.h += j10;
        this.i += j13;
        this.j += j9;
        this.k += j16;
        this.l += j14;
        this.n = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            this.m[i13] = 0;
        }
    }

    public void o(long j2, long j3) {
        if (this.n > 14) {
            n();
        }
        long[] jArr = this.m;
        jArr[14] = j3;
        jArr[15] = j2;
    }

    public void p(byte[] bArr, int i2) {
        this.m[this.n] = jb3.b(bArr, i2);
        int i3 = this.n + 1;
        this.n = i3;
        if (i3 == 16) {
            n();
        }
    }

    public void q() {
        this.c = 0;
        this.d = 0;
        int i2 = 0;
        this.b = 0;
        int i3 = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i3 >= bArr.length) {
                break;
            }
            bArr[i3] = 0;
            i3++;
        }
        this.n = 0;
        while (true) {
            long[] jArr = this.m;
            if (i2 != jArr.length) {
                jArr[i2] = 0;
                i2++;
            } else {
                return;
            }
        }
    }

    public void r(byte b2) {
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = i2 + 1;
        this.b = i3;
        bArr[i2] = b2;
        if (i3 == bArr.length) {
            p(bArr, 0);
            this.b = 0;
        }
        this.c++;
    }
}
