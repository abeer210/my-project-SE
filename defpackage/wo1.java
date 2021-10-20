package defpackage;

/* renamed from: wo1  reason: default package */
public enum wo1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(bk1.b),
    ENUM(null),
    MESSAGE(null);
    
    private final Object a;

    private wo1(Object obj) {
        this.a = obj;
    }
}
