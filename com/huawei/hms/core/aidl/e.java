package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import com.huawei.hms.core.aidl.annotation.Packed;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: MessageCodec */
public class e {
    private void b(IMessageEntity iMessageEntity, Field field, Bundle bundle) throws IllegalAccessException {
        boolean isAccessible = field.isAccessible();
        field.setAccessible(true);
        a(field.getName(), field.get(iMessageEntity), bundle);
        field.setAccessible(isAccessible);
    }

    public IMessageEntity a(Bundle bundle, IMessageEntity iMessageEntity) {
        if (bundle == null) {
            return iMessageEntity;
        }
        bundle.setClassLoader(getClass().getClassLoader());
        for (Class<?> cls = iMessageEntity.getClass(); cls != null; cls = cls.getSuperclass()) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(Packed.class)) {
                    try {
                        a(iMessageEntity, field, bundle);
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                        Log.e(C0201.m82(21459), C0201.m82(21458) + field.getName());
                    }
                }
            }
        }
        return iMessageEntity;
    }

    private boolean b(String str, Object obj, Bundle bundle) {
        if (obj instanceof String) {
            bundle.putString(str, (String) obj);
            return true;
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof Short) {
            bundle.putShort(str, ((Short) obj).shortValue());
            return true;
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return true;
        } else if (obj instanceof Float) {
            bundle.putFloat(str, ((Float) obj).floatValue());
            return true;
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return true;
        } else if (!(obj instanceof Boolean)) {
            return false;
        } else {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            return true;
        }
    }

    private void a(IMessageEntity iMessageEntity, Field field, Bundle bundle) throws IllegalAccessException {
        Object a = a(field, bundle);
        if (a != null) {
            boolean isAccessible = field.isAccessible();
            field.setAccessible(true);
            field.set(iMessageEntity, a);
            field.setAccessible(isAccessible);
        }
    }

    private Object a(Field field, Bundle bundle) {
        String name = field.getName();
        Object obj = bundle.get(name);
        if (obj instanceof Bundle) {
            try {
                Bundle bundle2 = (Bundle) obj;
                int i = bundle2.getInt(C0201.m82(21453), -1);
                if (i == 1) {
                    return a(field.getGenericType(), bundle2);
                }
                if (i == 0) {
                    return a((Bundle) obj, (IMessageEntity) field.getType().newInstance());
                }
            } catch (Exception unused) {
                Log.e(C0201.m82(21455), C0201.m82(21454) + name);
                return null;
            }
        }
        return obj;
    }

    public List<Object> a(Type type, Bundle bundle) throws InstantiationException, IllegalAccessException {
        ArrayList arrayList = new ArrayList();
        String r1 = C0201.m82(21460);
        for (Bundle bundle2 = bundle.getBundle(r1); bundle2 != null; bundle2 = bundle2.getBundle(r1)) {
            Object obj = bundle2.get(C0201.m82(21461));
            if (obj.getClass().isPrimitive() || (obj instanceof String) || (obj instanceof Serializable)) {
                arrayList.add(obj);
            } else if (!(obj instanceof Bundle)) {
                continue;
            } else {
                Bundle bundle3 = (Bundle) obj;
                int i = bundle3.getInt(C0201.m82(21462), -1);
                if (i == 1) {
                    throw new InstantiationException(C0201.m82(21464));
                } else if (i == 0) {
                    arrayList.add(a(bundle3, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
                } else {
                    throw new InstantiationException(C0201.m82(21463));
                }
            }
        }
        return arrayList;
    }

    public Bundle a(IMessageEntity iMessageEntity, Bundle bundle) {
        for (Class<?> cls = iMessageEntity.getClass(); cls != null; cls = cls.getSuperclass()) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (field.isAnnotationPresent(Packed.class)) {
                    try {
                        b(iMessageEntity, field, bundle);
                    } catch (IllegalAccessException | IllegalArgumentException unused) {
                        Log.e(C0201.m82(21457), C0201.m82(21456) + field.getName());
                    }
                }
            }
        }
        return bundle;
    }

    public void a(String str, Object obj, Bundle bundle) {
        if (obj == null || b(str, obj, bundle)) {
            return;
        }
        if (obj instanceof CharSequence) {
            bundle.putCharSequence(str, (CharSequence) obj);
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof byte[]) {
            bundle.putByteArray(str, (byte[]) obj);
        } else if (obj instanceof List) {
            a(str, (List) obj, bundle);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        } else if (obj instanceof IMessageEntity) {
            Bundle a = a((IMessageEntity) obj, new Bundle());
            a.putInt(C0201.m82(21465), 0);
            bundle.putBundle(str, a);
        } else {
            Log.e(C0201.m82(21467), C0201.m82(21466) + str);
        }
    }

    public void a(String str, List list, Bundle bundle) {
        Bundle bundle2 = null;
        for (Object obj : list) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(str, bundle2);
                bundle2.putInt(C0201.m82(21468), 1);
            }
            bundle2 = a(C0201.m82(21469), bundle2, obj);
        }
    }

    private Bundle a(String str, Bundle bundle, Object obj) {
        Bundle bundle2 = new Bundle();
        a(str, obj, bundle2);
        bundle.putBundle(C0201.m82(21452), bundle2);
        return bundle2;
    }
}
