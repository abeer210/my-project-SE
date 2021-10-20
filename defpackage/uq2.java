package defpackage;

/* renamed from: uq2  reason: default package */
/* compiled from: COSBoolean */
public final class uq2 extends tq2 {
    public static final uq2 b = new uq2(true);
    public static final uq2 c = new uq2(false);
    private final boolean a;

    private uq2(boolean z) {
        this.a = z;
    }

    public boolean r() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(this.a);
    }
}
