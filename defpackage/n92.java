package defpackage;

/* renamed from: n92  reason: default package */
/* compiled from: AI01weightDecoder */
public abstract class n92 extends m92 {
    public n92(b72 b72) {
        super(b72);
    }

    public abstract void h(StringBuilder sb, int i);

    public abstract int i(int i);

    public final void j(StringBuilder sb, int i, int i2) {
        int f = b().f(i, i2);
        h(sb, f);
        int i3 = i(f);
        int i4 = 100000;
        for (int i5 = 0; i5 < 5; i5++) {
            if (i3 / i4 == 0) {
                sb.append('0');
            }
            i4 /= 10;
        }
        sb.append(i3);
    }
}
