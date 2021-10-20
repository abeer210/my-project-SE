package defpackage;

/* renamed from: s43  reason: default package */
/* compiled from: SubjectKeyIdentifier */
public class s43 extends o03 {
    private byte[] a;

    public s43(byte[] bArr) {
        this.a = hb3.d(bArr);
    }

    public static s43 g(Object obj) {
        if (obj instanceof s43) {
            return (s43) obj;
        }
        if (obj != null) {
            return new s43(q03.q(obj));
        }
        return null;
    }

    public static s43 i(b13 b13, boolean z) {
        return g(q03.r(b13, z));
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        return new a23(j());
    }

    public byte[] j() {
        return hb3.d(this.a);
    }

    public s43(q03 q03) {
        this(q03.s());
    }
}
