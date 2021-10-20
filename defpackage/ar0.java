package defpackage;

import android.os.IBinder;
import defpackage.yq0;
import java.lang.reflect.Field;
import vigqyno.C0201;

/* renamed from: ar0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class ar0<T> extends yq0.a {
    private final T a;

    private ar0(T t) {
        this.a = t;
    }

    public static <T> T V3(yq0 yq0) {
        if (yq0 instanceof ar0) {
            return ((ar0) yq0).a;
        }
        IBinder asBinder = yq0.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append(C0201.m82(36));
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return (T) field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException(C0201.m82(34), e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException(C0201.m82(33), e2);
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(35));
        }
    }

    public static <T> yq0 W3(T t) {
        return new ar0(t);
    }
}
