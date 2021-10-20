package defpackage;

/* renamed from: oe0  reason: default package */
/* compiled from: DecodeException */
public class oe0 extends RuntimeException {
    private final af0 a;

    public oe0(String str, af0 af0) {
        super(str);
        this.a = af0;
    }

    public af0 a() {
        return this.a;
    }
}
