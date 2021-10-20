package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: g13  reason: default package */
/* compiled from: BEROctetString */
public class g13 extends q03 {
    private q03[] b;

    /* access modifiers changed from: package-private */
    /* renamed from: g13$a */
    /* compiled from: BEROctetString */
    public class a implements Enumeration {
        public int a = 0;

        public a() {
        }

        public boolean hasMoreElements() {
            return this.a < g13.this.b.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            q03[] q03Arr = g13.this.b;
            int i = this.a;
            this.a = i + 1;
            return q03Arr[i];
        }
    }

    public g13(byte[] bArr) {
        super(bArr);
    }

    public static g13 u(v03 v03) {
        q03[] q03Arr = new q03[v03.size()];
        Enumeration u = v03.u();
        int i = 0;
        while (u.hasMoreElements()) {
            q03Arr[i] = (q03) u.nextElement();
            i++;
        }
        return new g13(q03Arr);
    }

    private Vector v() {
        Vector vector = new Vector();
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i >= bArr.length) {
                return vector;
            }
            int i2 = i + C0188.f18;
            int length = (i2 > bArr.length ? bArr.length : i2) - i;
            byte[] bArr2 = new byte[length];
            System.arraycopy(this.a, i, bArr2, 0, length);
            vector.addElement(new a23(bArr2));
            i = i2;
        }
    }

    private static byte[] x(q03[] q03Arr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != q03Arr.length; i++) {
            try {
                byteArrayOutputStream.write(((a23) q03Arr[i]).s());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(q03Arr[i].getClass().getName() + C0201.m82(9040));
            } catch (IOException e) {
                throw new IllegalArgumentException(C0201.m82(9039) + e.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.c(36);
        s03.c(128);
        Enumeration w = w();
        while (w.hasMoreElements()) {
            s03.j((g03) w.nextElement());
        }
        s03.c(0);
        s03.c(0);
    }

    @Override // defpackage.u03
    public int j() throws IOException {
        Enumeration w = w();
        int i = 0;
        while (w.hasMoreElements()) {
            i += ((g03) w.nextElement()).b().j();
        }
        return i + 2 + 2;
    }

    @Override // defpackage.u03
    public boolean l() {
        return true;
    }

    @Override // defpackage.q03
    public byte[] s() {
        return this.a;
    }

    public Enumeration w() {
        if (this.b == null) {
            return v().elements();
        }
        return new a();
    }

    public g13(q03[] q03Arr) {
        super(x(q03Arr));
        this.b = q03Arr;
    }
}
