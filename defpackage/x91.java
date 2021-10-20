package defpackage;

/* renamed from: x91  reason: default package */
public enum x91 {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(c81.class, c81.class, c81.b),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    private final Class<?> a;
    private final Object b;

    private x91(Class cls, Class cls2, Object obj) {
        this.a = cls2;
        this.b = obj;
    }

    public final Class<?> b() {
        return this.a;
    }
}
