package defpackage;

/* renamed from: o53  reason: default package */
/* compiled from: KEKRecipientId */
public class o53 extends b63 {
    private byte[] a;

    public o53(byte[] bArr) {
        super(1);
        this.a = bArr;
    }

    @Override // java.lang.Object
    public Object clone() {
        return new o53(this.a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof o53)) {
            return false;
        }
        return hb3.a(this.a, ((o53) obj).a);
    }

    public int hashCode() {
        return hb3.h(this.a);
    }

    @Override // defpackage.lb3
    public boolean k(Object obj) {
        if (obj instanceof byte[]) {
            return hb3.a(this.a, (byte[]) obj);
        }
        if (obj instanceof p53) {
            return ((p53) obj).c().equals(this);
        }
        return false;
    }
}
