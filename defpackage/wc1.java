package defpackage;

/* renamed from: wc1  reason: default package */
public enum wc1 {
    DOUBLE(zc1.DOUBLE, 1),
    FLOAT(zc1.FLOAT, 5),
    INT64(zc1.LONG, 0),
    UINT64(zc1.LONG, 0),
    INT32(zc1.INT, 0),
    FIXED64(zc1.LONG, 1),
    FIXED32(zc1.INT, 5),
    BOOL(zc1.BOOLEAN, 0),
    STRING(zc1.STRING, 2) {
    },
    GROUP(zc1.MESSAGE, 3) {
    },
    MESSAGE(zc1.MESSAGE, 2) {
    },
    BYTES(zc1.BYTE_STRING, 2) {
    },
    UINT32(zc1.INT, 0),
    ENUM(zc1.ENUM, 0),
    SFIXED32(zc1.INT, 5),
    SFIXED64(zc1.LONG, 1),
    SINT32(zc1.INT, 0),
    SINT64(zc1.LONG, 0);
    
    private final zc1 a;
    private final int b;

    private wc1(zc1 zc1, int i) {
        this.a = zc1;
        this.b = i;
    }

    public final zc1 b() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }
}
