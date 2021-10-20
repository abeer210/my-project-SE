package defpackage;

/* renamed from: g91  reason: default package */
public enum g91 {
    DOUBLE(0, i91.SCALAR, x91.DOUBLE),
    FLOAT(1, i91.SCALAR, x91.FLOAT),
    INT64(2, i91.SCALAR, x91.LONG),
    UINT64(3, i91.SCALAR, x91.LONG),
    INT32(4, i91.SCALAR, x91.INT),
    FIXED64(5, i91.SCALAR, x91.LONG),
    FIXED32(6, i91.SCALAR, x91.INT),
    BOOL(7, i91.SCALAR, x91.BOOLEAN),
    STRING(8, i91.SCALAR, x91.STRING),
    MESSAGE(9, i91.SCALAR, x91.MESSAGE),
    BYTES(10, i91.SCALAR, x91.BYTE_STRING),
    UINT32(11, i91.SCALAR, x91.INT),
    ENUM(12, i91.SCALAR, x91.ENUM),
    SFIXED32(13, i91.SCALAR, x91.INT),
    SFIXED64(14, i91.SCALAR, x91.LONG),
    SINT32(15, i91.SCALAR, x91.INT),
    SINT64(16, i91.SCALAR, x91.LONG),
    GROUP(17, i91.SCALAR, x91.MESSAGE),
    DOUBLE_LIST(18, i91.VECTOR, x91.DOUBLE),
    FLOAT_LIST(19, i91.VECTOR, x91.FLOAT),
    INT64_LIST(20, i91.VECTOR, x91.LONG),
    UINT64_LIST(21, i91.VECTOR, x91.LONG),
    INT32_LIST(22, i91.VECTOR, x91.INT),
    FIXED64_LIST(23, i91.VECTOR, x91.LONG),
    FIXED32_LIST(24, i91.VECTOR, x91.INT),
    BOOL_LIST(25, i91.VECTOR, x91.BOOLEAN),
    STRING_LIST(26, i91.VECTOR, x91.STRING),
    MESSAGE_LIST(27, i91.VECTOR, x91.MESSAGE),
    BYTES_LIST(28, i91.VECTOR, x91.BYTE_STRING),
    UINT32_LIST(29, i91.VECTOR, x91.INT),
    ENUM_LIST(30, i91.VECTOR, x91.ENUM),
    SFIXED32_LIST(31, i91.VECTOR, x91.INT),
    SFIXED64_LIST(32, i91.VECTOR, x91.LONG),
    SINT32_LIST(33, i91.VECTOR, x91.INT),
    SINT64_LIST(34, i91.VECTOR, x91.LONG),
    DOUBLE_LIST_PACKED(35, i91.PACKED_VECTOR, x91.DOUBLE),
    FLOAT_LIST_PACKED(36, i91.PACKED_VECTOR, x91.FLOAT),
    INT64_LIST_PACKED(37, i91.PACKED_VECTOR, x91.LONG),
    UINT64_LIST_PACKED(38, i91.PACKED_VECTOR, x91.LONG),
    INT32_LIST_PACKED(39, i91.PACKED_VECTOR, x91.INT),
    FIXED64_LIST_PACKED(40, i91.PACKED_VECTOR, x91.LONG),
    FIXED32_LIST_PACKED(41, i91.PACKED_VECTOR, x91.INT),
    BOOL_LIST_PACKED(42, i91.PACKED_VECTOR, x91.BOOLEAN),
    UINT32_LIST_PACKED(43, i91.PACKED_VECTOR, x91.INT),
    ENUM_LIST_PACKED(44, i91.PACKED_VECTOR, x91.ENUM),
    SFIXED32_LIST_PACKED(45, i91.PACKED_VECTOR, x91.INT),
    SFIXED64_LIST_PACKED(46, i91.PACKED_VECTOR, x91.LONG),
    SINT32_LIST_PACKED(47, i91.PACKED_VECTOR, x91.INT),
    SINT64_LIST_PACKED(48, i91.PACKED_VECTOR, x91.LONG),
    GROUP_LIST(49, i91.VECTOR, x91.MESSAGE),
    MAP(50, i91.MAP, x91.VOID);
    
    private static final g91[] d0;
    private final int a;

    /* access modifiers changed from: public */
    static {
        g91[] values = values();
        d0 = new g91[values.length];
        for (g91 g91 : values) {
            d0[g91.a] = g91;
        }
    }

    private g91(int i, i91 i91, x91 x91) {
        int i2;
        this.a = i;
        int i3 = f91.a[i91.ordinal()];
        if (i3 == 1) {
            x91.b();
        } else if (i3 == 2) {
            x91.b();
        }
        if (i91 == i91.SCALAR && (i2 = f91.b[x91.ordinal()]) != 1 && i2 != 2) {
        }
    }

    public final int b() {
        return this.a;
    }
}
