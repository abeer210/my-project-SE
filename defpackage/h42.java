package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import vigqyno.C0201;

/* renamed from: h42  reason: default package */
/* compiled from: JsonWriter */
public class h42 implements Closeable, Flushable {
    private static final String[] j = new String[128];
    private static final String[] k;
    private final Writer a;
    private int[] b = new int[32];
    private int c = 0;
    private String d;
    private String e;
    private boolean f;
    private boolean g;
    private String h;
    private boolean i;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            j[i2] = String.format(C0201.m82(8795), Integer.valueOf(i2));
        }
        String[] strArr = j;
        strArr[34] = C0201.m82(8796);
        strArr[92] = C0201.m82(8797);
        strArr[9] = C0201.m82(8798);
        strArr[8] = C0201.m82(8799);
        strArr[10] = C0201.m82(8800);
        strArr[13] = C0201.m82(8801);
        strArr[12] = C0201.m82(8802);
        String[] strArr2 = (String[]) strArr.clone();
        k = strArr2;
        strArr2[60] = C0201.m82(8803);
        strArr2[62] = C0201.m82(8804);
        strArr2[38] = C0201.m82(8805);
        strArr2[61] = C0201.m82(8806);
        strArr2[39] = C0201.m82(8807);
    }

    public h42(Writer writer) {
        z(6);
        this.e = C0201.m82(8808);
        this.i = true;
        if (writer != null) {
            this.a = writer;
            return;
        }
        throw new NullPointerException(C0201.m82(8809));
    }

    private void A(int i2) {
        this.b[this.c - 1] = i2;
    }

    private void G(String str) throws IOException {
        String str2;
        String[] strArr = this.g ? k : j;
        Writer writer = this.a;
        String r2 = C0201.m82(8810);
        writer.write(r2);
        int length = str.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = C0201.m82(8811);
            } else if (charAt == 8233) {
                str2 = C0201.m82(8812);
            }
            if (i2 < i3) {
                this.a.write(str, i2, i3 - i2);
            }
            this.a.write(str2);
            i2 = i3 + 1;
        }
        if (i2 < length) {
            this.a.write(str, i2, length - i2);
        }
        this.a.write(r2);
    }

    private void R() throws IOException {
        if (this.h != null) {
            a();
            G(this.h);
            this.h = null;
        }
    }

    private void a() throws IOException {
        int peek = peek();
        if (peek == 5) {
            this.a.write(44);
        } else if (peek != 3) {
            throw new IllegalStateException(C0201.m82(8813));
        }
        w();
        A(4);
    }

    private void c() throws IOException {
        int peek = peek();
        if (peek == 1) {
            A(2);
            w();
        } else if (peek == 2) {
            this.a.append(',');
            w();
        } else if (peek != 4) {
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException(C0201.m82(8815));
                } else if (!this.f) {
                    throw new IllegalStateException(C0201.m82(8814));
                }
            }
            A(7);
        } else {
            this.a.append((CharSequence) this.e);
            A(5);
        }
    }

    private h42 m(int i2, int i3, String str) throws IOException {
        int peek = peek();
        if (peek != i3 && peek != i2) {
            throw new IllegalStateException(C0201.m82(8816));
        } else if (this.h == null) {
            this.c--;
            if (peek == i3) {
                w();
            }
            this.a.write(str);
            return this;
        } else {
            throw new IllegalStateException(C0201.m82(8817) + this.h);
        }
    }

    private int peek() {
        int i2 = this.c;
        if (i2 != 0) {
            return this.b[i2 - 1];
        }
        throw new IllegalStateException(C0201.m82(8818));
    }

    private void w() throws IOException {
        if (this.d != null) {
            this.a.write(C0201.m82(8819));
            int i2 = this.c;
            for (int i3 = 1; i3 < i2; i3++) {
                this.a.write(this.d);
            }
        }
    }

    private h42 y(int i2, String str) throws IOException {
        c();
        z(i2);
        this.a.write(str);
        return this;
    }

    private void z(int i2) {
        int i3 = this.c;
        int[] iArr = this.b;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[(i3 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.b = iArr2;
        }
        int[] iArr3 = this.b;
        int i4 = this.c;
        this.c = i4 + 1;
        iArr3[i4] = i2;
    }

    public final void B(boolean z) {
        this.g = z;
    }

    public final void D(String str) {
        if (str.length() == 0) {
            this.d = null;
            this.e = C0201.m82(8820);
            return;
        }
        this.d = str;
        this.e = C0201.m82(8821);
    }

    public final void E(boolean z) {
        this.f = z;
    }

    public final void F(boolean z) {
        this.i = z;
    }

    public h42 H(long j2) throws IOException {
        R();
        c();
        this.a.write(Long.toString(j2));
        return this;
    }

    public h42 K(Boolean bool) throws IOException {
        if (bool == null) {
            return x();
        }
        R();
        c();
        this.a.write(bool.booleanValue() ? C0201.m82(8822) : C0201.m82(8823));
        return this;
    }

    public h42 N(Number number) throws IOException {
        if (number == null) {
            return x();
        }
        R();
        String obj = number.toString();
        if (this.f || (!obj.equals(C0201.m82(8824)) && !obj.equals(C0201.m82(8825)) && !obj.equals(C0201.m82(8826)))) {
            c();
            this.a.append((CharSequence) obj);
            return this;
        }
        throw new IllegalArgumentException(C0201.m82(8827) + number);
    }

    public h42 P(String str) throws IOException {
        if (str == null) {
            return x();
        }
        R();
        c();
        G(str);
        return this;
    }

    public h42 Q(boolean z) throws IOException {
        R();
        c();
        this.a.write(z ? C0201.m82(8828) : C0201.m82(8829));
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.a.close();
        int i2 = this.c;
        if (i2 > 1 || (i2 == 1 && this.b[i2 - 1] != 7)) {
            throw new IOException(C0201.m82(8830));
        }
        this.c = 0;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.c != 0) {
            this.a.flush();
            return;
        }
        throw new IllegalStateException(C0201.m82(8831));
    }

    public h42 h() throws IOException {
        R();
        y(1, C0201.m82(8832));
        return this;
    }

    public h42 k() throws IOException {
        R();
        y(3, C0201.m82(8833));
        return this;
    }

    public h42 n() throws IOException {
        m(1, 2, C0201.m82(8834));
        return this;
    }

    public h42 o() throws IOException {
        m(3, 5, C0201.m82(8835));
        return this;
    }

    public final boolean p() {
        return this.i;
    }

    public final boolean r() {
        return this.g;
    }

    public boolean s() {
        return this.f;
    }

    public h42 u(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException(C0201.m82(8837));
        } else if (this.h != null) {
            throw new IllegalStateException();
        } else if (this.c != 0) {
            this.h = str;
            return this;
        } else {
            throw new IllegalStateException(C0201.m82(8836));
        }
    }

    public h42 x() throws IOException {
        if (this.h != null) {
            if (this.i) {
                R();
            } else {
                this.h = null;
                return this;
            }
        }
        c();
        this.a.write(C0201.m82(8838));
        return this;
    }
}
