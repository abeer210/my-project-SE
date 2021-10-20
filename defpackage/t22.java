package defpackage;

import java.math.BigInteger;

/* renamed from: t22  reason: default package */
/* compiled from: JsonPrimitive */
public final class t22 extends o22 {
    private static final Class<?>[] b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};
    private Object a;

    public t22(Boolean bool) {
        t(bool);
    }

    private static boolean p(t22 t22) {
        Object obj = t22.a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    private static boolean r(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : b) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t22.class != obj.getClass()) {
            return false;
        }
        t22 t22 = (t22) obj;
        if (this.a == null) {
            if (t22.a == null) {
                return true;
            }
            return false;
        } else if (!p(this) || !p(t22)) {
            if (!(this.a instanceof Number) || !(t22.a instanceof Number)) {
                return this.a.equals(t22.a);
            }
            double doubleValue = k().doubleValue();
            double doubleValue2 = t22.k().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (k().longValue() == t22.k().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.a == null) {
            return 31;
        }
        if (p(this)) {
            doubleToLongBits = k().longValue();
        } else {
            Object obj = this.a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(k().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean i() {
        if (o()) {
            return j().booleanValue();
        }
        return Boolean.parseBoolean(l());
    }

    public Boolean j() {
        return (Boolean) this.a;
    }

    public Number k() {
        Object obj = this.a;
        return obj instanceof String ? new j32((String) this.a) : (Number) obj;
    }

    public String l() {
        if (q()) {
            return k().toString();
        }
        if (o()) {
            return j().toString();
        }
        return (String) this.a;
    }

    public boolean o() {
        return this.a instanceof Boolean;
    }

    public boolean q() {
        return this.a instanceof Number;
    }

    public boolean s() {
        return this.a instanceof String;
    }

    public void t(Object obj) {
        if (obj instanceof Character) {
            this.a = String.valueOf(((Character) obj).charValue());
            return;
        }
        e32.a((obj instanceof Number) || r(obj));
        this.a = obj;
    }

    public t22(Number number) {
        t(number);
    }

    public t22(String str) {
        t(str);
    }
}
