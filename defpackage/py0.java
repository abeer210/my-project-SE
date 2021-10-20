package defpackage;

/* renamed from: py0  reason: default package */
public enum py0 {
    DOUBLE(uy0.DOUBLE, 1),
    FLOAT(uy0.FLOAT, 5),
    INT64(uy0.LONG, 0),
    UINT64(uy0.LONG, 0),
    INT32(uy0.INT, 0),
    FIXED64(uy0.LONG, 1),
    FIXED32(uy0.INT, 5),
    BOOL(uy0.BOOLEAN, 0),
    STRING(uy0.STRING, 2) {
    },
    GROUP(uy0.MESSAGE, 3) {
    },
    MESSAGE(uy0.MESSAGE, 2) {
    },
    BYTES(uy0.BYTE_STRING, 2) {
    },
    UINT32(uy0.INT, 0),
    ENUM(uy0.ENUM, 0),
    SFIXED32(uy0.INT, 5),
    SFIXED64(uy0.LONG, 1),
    SINT32(uy0.INT, 0),
    SINT64(uy0.LONG, 0);
    
    private final uy0 a;
    private final int b;

    private py0(uy0 uy0, int i) {
        this.a = uy0;
        this.b = i;
    }

    public final uy0 b() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }
}
