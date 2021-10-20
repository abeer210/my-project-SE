package defpackage;

/* renamed from: zc1  reason: default package */
public enum zc1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(c81.b),
    ENUM(null),
    MESSAGE(null);
    
    private final Object a;

    private zc1(Object obj) {
        this.a = obj;
    }
}
