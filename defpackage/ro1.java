package defpackage;

/* renamed from: ro1  reason: default package */
public enum ro1 {
    DOUBLE(wo1.DOUBLE, 1),
    FLOAT(wo1.FLOAT, 5),
    INT64(wo1.LONG, 0),
    UINT64(wo1.LONG, 0),
    INT32(wo1.INT, 0),
    FIXED64(wo1.LONG, 1),
    FIXED32(wo1.INT, 5),
    BOOL(wo1.BOOLEAN, 0),
    STRING(wo1.STRING, 2) {
    },
    GROUP(wo1.MESSAGE, 3) {
    },
    MESSAGE(wo1.MESSAGE, 2) {
    },
    BYTES(wo1.BYTE_STRING, 2) {
    },
    UINT32(wo1.INT, 0),
    ENUM(wo1.ENUM, 0),
    SFIXED32(wo1.INT, 5),
    SFIXED64(wo1.LONG, 1),
    SINT32(wo1.INT, 0),
    SINT64(wo1.LONG, 0);
    
    private final wo1 a;
    private final int b;

    private ro1(wo1 wo1, int i) {
        this.a = wo1;
        this.b = i;
    }

    public final wo1 b() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }
}
