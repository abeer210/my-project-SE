package defpackage;

/* renamed from: el1  reason: default package */
public enum el1 {
    DOUBLE(0, gl1.SCALAR, ul1.DOUBLE),
    FLOAT(1, gl1.SCALAR, ul1.FLOAT),
    INT64(2, gl1.SCALAR, ul1.LONG),
    UINT64(3, gl1.SCALAR, ul1.LONG),
    INT32(4, gl1.SCALAR, ul1.INT),
    FIXED64(5, gl1.SCALAR, ul1.LONG),
    FIXED32(6, gl1.SCALAR, ul1.INT),
    BOOL(7, gl1.SCALAR, ul1.BOOLEAN),
    STRING(8, gl1.SCALAR, ul1.STRING),
    MESSAGE(9, gl1.SCALAR, ul1.MESSAGE),
    BYTES(10, gl1.SCALAR, ul1.BYTE_STRING),
    UINT32(11, gl1.SCALAR, ul1.INT),
    ENUM(12, gl1.SCALAR, ul1.ENUM),
    SFIXED32(13, gl1.SCALAR, ul1.INT),
    SFIXED64(14, gl1.SCALAR, ul1.LONG),
    SINT32(15, gl1.SCALAR, ul1.INT),
    SINT64(16, gl1.SCALAR, ul1.LONG),
    GROUP(17, gl1.SCALAR, ul1.MESSAGE),
    DOUBLE_LIST(18, gl1.VECTOR, ul1.DOUBLE),
    FLOAT_LIST(19, gl1.VECTOR, ul1.FLOAT),
    INT64_LIST(20, gl1.VECTOR, ul1.LONG),
    UINT64_LIST(21, gl1.VECTOR, ul1.LONG),
    INT32_LIST(22, gl1.VECTOR, ul1.INT),
    FIXED64_LIST(23, gl1.VECTOR, ul1.LONG),
    FIXED32_LIST(24, gl1.VECTOR, ul1.INT),
    BOOL_LIST(25, gl1.VECTOR, ul1.BOOLEAN),
    STRING_LIST(26, gl1.VECTOR, ul1.STRING),
    MESSAGE_LIST(27, gl1.VECTOR, ul1.MESSAGE),
    BYTES_LIST(28, gl1.VECTOR, ul1.BYTE_STRING),
    UINT32_LIST(29, gl1.VECTOR, ul1.INT),
    ENUM_LIST(30, gl1.VECTOR, ul1.ENUM),
    SFIXED32_LIST(31, gl1.VECTOR, ul1.INT),
    SFIXED64_LIST(32, gl1.VECTOR, ul1.LONG),
    SINT32_LIST(33, gl1.VECTOR, ul1.INT),
    SINT64_LIST(34, gl1.VECTOR, ul1.LONG),
    DOUBLE_LIST_PACKED(35, gl1.PACKED_VECTOR, ul1.DOUBLE),
    FLOAT_LIST_PACKED(36, gl1.PACKED_VECTOR, ul1.FLOAT),
    INT64_LIST_PACKED(37, gl1.PACKED_VECTOR, ul1.LONG),
    UINT64_LIST_PACKED(38, gl1.PACKED_VECTOR, ul1.LONG),
    INT32_LIST_PACKED(39, gl1.PACKED_VECTOR, ul1.INT),
    FIXED64_LIST_PACKED(40, gl1.PACKED_VECTOR, ul1.LONG),
    FIXED32_LIST_PACKED(41, gl1.PACKED_VECTOR, ul1.INT),
    BOOL_LIST_PACKED(42, gl1.PACKED_VECTOR, ul1.BOOLEAN),
    UINT32_LIST_PACKED(43, gl1.PACKED_VECTOR, ul1.INT),
    ENUM_LIST_PACKED(44, gl1.PACKED_VECTOR, ul1.ENUM),
    SFIXED32_LIST_PACKED(45, gl1.PACKED_VECTOR, ul1.INT),
    SFIXED64_LIST_PACKED(46, gl1.PACKED_VECTOR, ul1.LONG),
    SINT32_LIST_PACKED(47, gl1.PACKED_VECTOR, ul1.INT),
    SINT64_LIST_PACKED(48, gl1.PACKED_VECTOR, ul1.LONG),
    GROUP_LIST(49, gl1.VECTOR, ul1.MESSAGE),
    MAP(50, gl1.MAP, ul1.VOID);
    
    private static final el1[] d0;
    private final int a;

    /* access modifiers changed from: public */
    static {
        el1[] values = values();
        d0 = new el1[values.length];
        for (el1 el1 : values) {
            d0[el1.a] = el1;
        }
    }

    private el1(int i, gl1 gl1, ul1 ul1) {
        int i2;
        this.a = i;
        int i3 = fl1.a[gl1.ordinal()];
        if (i3 == 1) {
            ul1.b();
        } else if (i3 == 2) {
            ul1.b();
        }
        if (gl1 == gl1.SCALAR && (i2 = fl1.b[ul1.ordinal()]) != 1 && i2 != 2) {
        }
    }

    public final int b() {
        return this.a;
    }
}
