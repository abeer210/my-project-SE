package defpackage;

/* renamed from: j92  reason: default package */
/* compiled from: AI013x0x1xDecoder */
public final class j92 extends n92 {
    private final String c;
    private final String d;

    public j92(b72 b72, String str, String str2) {
        super(b72);
        this.c = str2;
        this.d = str;
    }

    private void k(StringBuilder sb, int i) {
        int f = b().f(i, 16);
        if (f != 38400) {
            sb.append('(');
            sb.append(this.c);
            sb.append(')');
            int i2 = f % 32;
            int i3 = f / 32;
            int i4 = (i3 % 12) + 1;
            int i5 = i3 / 12;
            if (i5 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i5);
            if (i4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i4);
            if (i2 / 10 == 0) {
                sb.append('0');
            }
            sb.append(i2);
        }
    }

    @Override // defpackage.o92
    public String d() throws o62 {
        if (c().g() == 84) {
            StringBuilder sb = new StringBuilder();
            f(sb, 8);
            j(sb, 48, 20);
            k(sb, 68);
            return sb.toString();
        }
        throw o62.a();
    }

    @Override // defpackage.n92
    public void h(StringBuilder sb, int i) {
        sb.append('(');
        sb.append(this.d);
        sb.append(i / 100000);
        sb.append(')');
    }

    @Override // defpackage.n92
    public int i(int i) {
        return i % 100000;
    }
}
