package com.huawei.hms.feature.dynamic;

import android.os.IBinder;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import java.lang.reflect.Field;
import vigqyno.C0201;

public class ObjectWrapper<T> extends IObjectWrapper.Stub {
    private final T a;

    private ObjectWrapper(T t) {
        this.a = t;
    }

    public static <T> T unwrap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return ((ObjectWrapper) iObjectWrapper).a;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        int i = 0;
        for (Field field : declaredFields) {
            if (!field.isSynthetic()) {
                i++;
            }
        }
        if (i != 1) {
            throw new IllegalArgumentException(C0201.m82(28339) + declaredFields.length + C0201.m82(28340));
        } else if (!declaredFields[0].isAccessible()) {
            declaredFields[0].setAccessible(true);
            try {
                return (T) declaredFields[0].get(asBinder);
            } catch (Exception unused) {
                throw new IllegalArgumentException(C0201.m82(28337));
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(28338));
        }
    }

    public static <T> IObjectWrapper wrap(T t) {
        return new ObjectWrapper(t);
    }
}
