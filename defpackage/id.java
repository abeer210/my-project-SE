package defpackage;

/* renamed from: id  reason: default package */
/* compiled from: Mask */
public class id {
    private final a a;
    private final vc b;
    private final rc c;
    private final boolean d;

    /* renamed from: id$a */
    /* compiled from: Mask */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public id(a aVar, vc vcVar, rc rcVar, boolean z) {
        this.a = aVar;
        this.b = vcVar;
        this.c = rcVar;
        this.d = z;
    }

    public a a() {
        return this.a;
    }

    public vc b() {
        return this.b;
    }

    public rc c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}
