package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: qf  reason: default package */
/* compiled from: JsonReader */
public abstract class qf implements Closeable {
    private static final String[] g = new String[128];
    public int a;
    public int[] b = new int[32];
    public String[] c = new String[32];
    public int[] d = new int[32];
    public boolean e;
    public boolean f;

    /* renamed from: qf$a */
    /* compiled from: JsonReader */
    public static final class a {
        public final String[] a;
        public final ky2 b;

        private a(String[] strArr, ky2 ky2) {
            this.a = strArr;
            this.b = ky2;
        }

        public static a a(String... strArr) {
            try {
                dy2[] dy2Arr = new dy2[strArr.length];
                ay2 ay2 = new ay2();
                for (int i = 0; i < strArr.length; i++) {
                    qf.E(ay2, strArr[i]);
                    ay2.readByte();
                    dy2Arr[i] = ay2.D();
                }
                return new a((String[]) strArr.clone(), ky2.d(dy2Arr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: qf$b */
    /* compiled from: JsonReader */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            g[i] = String.format(C0201.m82(973), Integer.valueOf(i));
        }
        String[] strArr = g;
        strArr[34] = C0201.m82(974);
        strArr[92] = C0201.m82(975);
        strArr[9] = C0201.m82(976);
        strArr[8] = C0201.m82(977);
        strArr[10] = C0201.m82(978);
        strArr[13] = C0201.m82(979);
        strArr[12] = C0201.m82(980);
    }

    /* access modifiers changed from: private */
    public static void E(by2 by2, String str) throws IOException {
        String str2;
        String[] strArr = g;
        by2.O(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = C0201.m82(981);
            } else if (charAt == 8233) {
                str2 = C0201.m82(982);
            }
            if (i < i2) {
                by2.v0(str, i, i2);
            }
            by2.l0(str2);
            i = i2 + 1;
        }
        if (i < length) {
            by2.v0(str, i, length);
        }
        by2.O(34);
    }

    public static qf x(cy2 cy2) {
        return new sf(cy2);
    }

    public abstract int A(a aVar) throws IOException;

    public abstract void B() throws IOException;

    public abstract void D() throws IOException;

    public final pf F(String str) throws pf {
        throw new pf(str + C0201.m82(983) + n());
    }

    public abstract void c() throws IOException;

    public abstract void h() throws IOException;

    public abstract void k() throws IOException;

    public abstract void m() throws IOException;

    public final String n() {
        return rf.a(this.a, this.b, this.c, this.d);
    }

    public abstract boolean o() throws IOException;

    public abstract boolean p() throws IOException;

    public abstract double r() throws IOException;

    public abstract int s() throws IOException;

    public abstract String u() throws IOException;

    public abstract String w() throws IOException;

    public abstract b y() throws IOException;

    public final void z(int i) {
        int i2 = this.a;
        int[] iArr = this.b;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.b = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.c;
                this.c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.d;
                this.d = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new of(C0201.m82(984) + n());
            }
        }
        int[] iArr3 = this.b;
        int i3 = this.a;
        this.a = i3 + 1;
        iArr3[i3] = i;
    }
}
