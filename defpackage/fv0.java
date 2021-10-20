package defpackage;

/* renamed from: fv0  reason: default package */
public enum fv0 {
    DOUBLE(0, hv0.SCALAR, sv0.DOUBLE),
    FLOAT(1, hv0.SCALAR, sv0.FLOAT),
    INT64(2, hv0.SCALAR, sv0.LONG),
    UINT64(3, hv0.SCALAR, sv0.LONG),
    INT32(4, hv0.SCALAR, sv0.INT),
    FIXED64(5, hv0.SCALAR, sv0.LONG),
    FIXED32(6, hv0.SCALAR, sv0.INT),
    BOOL(7, hv0.SCALAR, sv0.BOOLEAN),
    STRING(8, hv0.SCALAR, sv0.STRING),
    MESSAGE(9, hv0.SCALAR, sv0.MESSAGE),
    BYTES(10, hv0.SCALAR, sv0.BYTE_STRING),
    UINT32(11, hv0.SCALAR, sv0.INT),
    ENUM(12, hv0.SCALAR, sv0.ENUM),
    SFIXED32(13, hv0.SCALAR, sv0.INT),
    SFIXED64(14, hv0.SCALAR, sv0.LONG),
    SINT32(15, hv0.SCALAR, sv0.INT),
    SINT64(16, hv0.SCALAR, sv0.LONG),
    GROUP(17, hv0.SCALAR, sv0.MESSAGE),
    DOUBLE_LIST(18, hv0.VECTOR, sv0.DOUBLE),
    FLOAT_LIST(19, hv0.VECTOR, sv0.FLOAT),
    INT64_LIST(20, hv0.VECTOR, sv0.LONG),
    UINT64_LIST(21, hv0.VECTOR, sv0.LONG),
    INT32_LIST(22, hv0.VECTOR, sv0.INT),
    FIXED64_LIST(23, hv0.VECTOR, sv0.LONG),
    FIXED32_LIST(24, hv0.VECTOR, sv0.INT),
    BOOL_LIST(25, hv0.VECTOR, sv0.BOOLEAN),
    STRING_LIST(26, hv0.VECTOR, sv0.STRING),
    MESSAGE_LIST(27, hv0.VECTOR, sv0.MESSAGE),
    BYTES_LIST(28, hv0.VECTOR, sv0.BYTE_STRING),
    UINT32_LIST(29, hv0.VECTOR, sv0.INT),
    ENUM_LIST(30, hv0.VECTOR, sv0.ENUM),
    SFIXED32_LIST(31, hv0.VECTOR, sv0.INT),
    SFIXED64_LIST(32, hv0.VECTOR, sv0.LONG),
    SINT32_LIST(33, hv0.VECTOR, sv0.INT),
    SINT64_LIST(34, hv0.VECTOR, sv0.LONG),
    DOUBLE_LIST_PACKED(35, hv0.PACKED_VECTOR, sv0.DOUBLE),
    FLOAT_LIST_PACKED(36, hv0.PACKED_VECTOR, sv0.FLOAT),
    INT64_LIST_PACKED(37, hv0.PACKED_VECTOR, sv0.LONG),
    UINT64_LIST_PACKED(38, hv0.PACKED_VECTOR, sv0.LONG),
    INT32_LIST_PACKED(39, hv0.PACKED_VECTOR, sv0.INT),
    FIXED64_LIST_PACKED(40, hv0.PACKED_VECTOR, sv0.LONG),
    FIXED32_LIST_PACKED(41, hv0.PACKED_VECTOR, sv0.INT),
    BOOL_LIST_PACKED(42, hv0.PACKED_VECTOR, sv0.BOOLEAN),
    UINT32_LIST_PACKED(43, hv0.PACKED_VECTOR, sv0.INT),
    ENUM_LIST_PACKED(44, hv0.PACKED_VECTOR, sv0.ENUM),
    SFIXED32_LIST_PACKED(45, hv0.PACKED_VECTOR, sv0.INT),
    SFIXED64_LIST_PACKED(46, hv0.PACKED_VECTOR, sv0.LONG),
    SINT32_LIST_PACKED(47, hv0.PACKED_VECTOR, sv0.INT),
    SINT64_LIST_PACKED(48, hv0.PACKED_VECTOR, sv0.LONG),
    GROUP_LIST(49, hv0.VECTOR, sv0.MESSAGE),
    MAP(50, hv0.MAP, sv0.VOID);
    
    private static final fv0[] d0;
    private final int a;

    /* access modifiers changed from: public */
    static {
        fv0[] values = values();
        d0 = new fv0[values.length];
        for (fv0 fv0 : values) {
            d0[fv0.a] = fv0;
        }
    }

    private fv0(int i, hv0 hv0, sv0 sv0) {
        int i2;
        this.a = i;
        int i3 = gv0.a[hv0.ordinal()];
        if (i3 == 1 || i3 == 2) {
            sv0.b();
        }
        if (hv0 == hv0.SCALAR && (i2 = gv0.b[sv0.ordinal()]) != 1 && i2 != 2) {
        }
    }

    public final int b() {
        return this.a;
    }
}
