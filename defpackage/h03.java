package defpackage;

import java.util.Vector;

/* renamed from: h03  reason: default package */
/* compiled from: ASN1EncodableVector */
public class h03 {
    private final Vector a = new Vector();

    public void a(g03 g03) {
        this.a.addElement(g03);
    }

    public g03 b(int i) {
        return (g03) this.a.elementAt(i);
    }

    public int c() {
        return this.a.size();
    }
}
