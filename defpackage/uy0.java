package defpackage;

/* renamed from: uy0  reason: default package */
public enum uy0 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(fu0.b),
    ENUM(null),
    MESSAGE(null);
    
    private final Object a;

    private uy0(Object obj) {
        this.a = obj;
    }
}
