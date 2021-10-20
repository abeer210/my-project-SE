package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: ResourcesFlusher */
public class h {
    private static Field a;
    private static boolean b;
    private static Class<?> c;
    private static boolean d;
    private static Field e;
    private static boolean f;
    private static Field g;
    private static boolean h;

    public static void a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                d(resources);
            } else if (i >= 23) {
                c(resources);
            } else if (i >= 21) {
                b(resources);
            }
        }
    }

    private static void b(Resources resources) {
        boolean z = b;
        String r1 = C0201.m82(4558);
        if (!z) {
            try {
                Field declaredField = Resources.class.getDeclaredField(C0201.m82(4559));
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(r1, C0201.m82(4560), e2);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e(r1, C0201.m82(4561), e3);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    private static void c(Resources resources) {
        boolean z = b;
        String r1 = C0201.m82(4562);
        if (!z) {
            try {
                Field declaredField = Resources.class.getDeclaredField(C0201.m82(4563));
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(r1, C0201.m82(4564), e2);
            }
            b = true;
        }
        Object obj = null;
        Field field = a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e(r1, C0201.m82(4565), e3);
            }
        }
        if (obj != null) {
            e(obj);
        }
    }

    private static void d(Resources resources) {
        Object obj;
        boolean z = h;
        String r2 = C0201.m82(4566);
        if (!z) {
            try {
                Field declaredField = Resources.class.getDeclaredField(C0201.m82(4567));
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e(r2, C0201.m82(4568), e2);
            }
            h = true;
        }
        Field field = g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e3) {
                Log.e(r2, C0201.m82(4569), e3);
                obj = null;
            }
            if (obj != null) {
                if (!b) {
                    try {
                        Field declaredField2 = obj.getClass().getDeclaredField(C0201.m82(4570));
                        a = declaredField2;
                        declaredField2.setAccessible(true);
                    } catch (NoSuchFieldException e4) {
                        Log.e(r2, C0201.m82(4571), e4);
                    }
                    b = true;
                }
                Field field2 = a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e5) {
                        Log.e(r2, C0201.m82(4572), e5);
                    }
                }
                if (obj2 != null) {
                    e(obj2);
                }
            }
        }
    }

    private static void e(Object obj) {
        boolean z = d;
        String r2 = C0201.m82(4573);
        if (!z) {
            try {
                c = Class.forName(C0201.m82(4574));
            } catch (ClassNotFoundException e2) {
                Log.e(r2, C0201.m82(4575), e2);
            }
            d = true;
        }
        Class<?> cls = c;
        if (cls != null) {
            if (!f) {
                try {
                    Field declaredField = cls.getDeclaredField(C0201.m82(4576));
                    e = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e3) {
                    Log.e(r2, C0201.m82(4577), e3);
                }
                f = true;
            }
            Field field = e;
            if (field != null) {
                LongSparseArray longSparseArray = null;
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e4) {
                    Log.e(r2, C0201.m82(4578), e4);
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
