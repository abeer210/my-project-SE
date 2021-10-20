package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: ViewManagersPropertyCache */
public class b1 {
    private static final Map<Class, Map<String, l>> a = new HashMap();
    private static final Map<String, l> b = new HashMap();

    /* access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache */
    public static class b extends l {
        public b(xj0 xj0, Method method) {
            super(xj0, C0201.m82(33609), method);
        }

        @Override // com.facebook.react.uimanager.b1.l
        public Object c(Object obj, Context context) {
            return (ReadableArray) obj;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache */
    public static class c extends l {
        private final boolean i;

        public c(xj0 xj0, Method method, boolean z) {
            super(xj0, C0201.m82(33538), method);
            this.i = z;
        }

        @Override // com.facebook.react.uimanager.b1.l
        public Object c(Object obj, Context context) {
            return obj == null ? this.i : ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache */
    public static class d extends l {
        public d(xj0 xj0, Method method) {
            super(xj0, C0201.m82(33631), method);
        }

        @Override // com.facebook.react.uimanager.b1.l
        public Object c(Object obj, Context context) {
            if (obj != null) {
                return ((Boolean) obj).booleanValue() ? Boolean.TRUE : Boolean.FALSE;
            }
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache */
    public static class e extends l {
        public e(xj0 xj0, Method method) {
            super(xj0, C0201.m82(33624), method);
        }

        @Override // com.facebook.react.uimanager.b1.l
        public Object c(Object obj, Context context) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof Double) {
                return Integer.valueOf(((Double) obj).intValue());
            }
            return (Integer) obj;
        }

        public e(yj0 yj0, Method method, int i) {
            super(yj0, C0201.m82(33625), method, i);
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache */
    public static class f extends l {
        private final int i;

        public f(xj0 xj0, Method method) {
            this(xj0, method, 0);
        }

        @Override // com.facebook.react.uimanager.b1.l
        public Object c(Object obj, Context context) {
            if (obj == null) {
                return Integer.valueOf(this.i);
            }
            return ColorPropConverter.getColor(obj, context);
        }

        public f(xj0 xj0, Method method, int i2) {
            super(xj0, C0201.m82(33717), method);
            this.i = i2;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache */
    public static class h extends l {
        public h(xj0 xj0, Method method) {
            super(xj0, C0201.m82(33788), method);
        }

        @Override // com.facebook.react.uimanager.b1.l
        public Object c(Object obj, Context context) {
            if (obj instanceof Dynamic) {
                return obj;
            }
            return new DynamicFromObject(obj);
        }

        public h(yj0 yj0, Method method, int i) {
            super(yj0, C0201.m82(33789), method, i);
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache */
    public static class k extends l {
        public k(xj0 xj0, Method method) {
            super(xj0, C0201.m82(33798), method);
        }

        @Override // com.facebook.react.uimanager.b1.l
        public Object c(Object obj, Context context) {
            return (ReadableMap) obj;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache */
    public static class m extends l {
        public m(xj0 xj0, Method method) {
            super(xj0, C0201.m82(34144), method);
        }

        @Override // com.facebook.react.uimanager.b1.l
        public Object c(Object obj, Context context) {
            return (String) obj;
        }
    }

    public static void a() {
        a.clear();
        b.clear();
    }

    private static l b(xj0 xj0, Method method, Class<?> cls) {
        if (cls == Dynamic.class) {
            return new h(xj0, method);
        }
        if (cls == Boolean.TYPE) {
            return new c(xj0, method, xj0.defaultBoolean());
        }
        Class<?> cls2 = Integer.TYPE;
        String r1 = C0201.m82(14495);
        if (cls == cls2) {
            if (r1.equals(xj0.customType())) {
                return new f(xj0, method, xj0.defaultInt());
            }
            return new j(xj0, method, xj0.defaultInt());
        } else if (cls == Float.TYPE) {
            return new i(xj0, method, xj0.defaultFloat());
        } else {
            if (cls == Double.TYPE) {
                return new g(xj0, method, xj0.defaultDouble());
            }
            if (cls == String.class) {
                return new m(xj0, method);
            }
            if (cls == Boolean.class) {
                return new d(xj0, method);
            }
            if (cls == Integer.class) {
                if (r1.equals(xj0.customType())) {
                    return new f(xj0, method);
                }
                return new e(xj0, method);
            } else if (cls == ReadableArray.class) {
                return new b(xj0, method);
            } else {
                if (cls == ReadableMap.class) {
                    return new k(xj0, method);
                }
                throw new RuntimeException(C0201.m82(14496) + cls + C0201.m82(14497) + method.getDeclaringClass().getName() + C0201.m82(14498) + method.getName());
            }
        }
    }

    private static void c(yj0 yj0, Method method, Class<?> cls, Map<String, l> map) {
        String[] names = yj0.names();
        int i2 = 0;
        if (cls == Dynamic.class) {
            while (i2 < names.length) {
                map.put(names[i2], new h(yj0, method, i2));
                i2++;
            }
        } else if (cls == Integer.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new j(yj0, method, i2, yj0.defaultInt()));
                i2++;
            }
        } else if (cls == Float.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new i(yj0, method, i2, yj0.defaultFloat()));
                i2++;
            }
        } else if (cls == Double.TYPE) {
            while (i2 < names.length) {
                map.put(names[i2], new g(yj0, method, i2, yj0.defaultDouble()));
                i2++;
            }
        } else if (cls == Integer.class) {
            while (i2 < names.length) {
                map.put(names[i2], new e(yj0, method, i2));
                i2++;
            }
        } else {
            throw new RuntimeException(C0201.m82(14499) + cls + C0201.m82(14500) + method.getDeclaringClass().getName() + C0201.m82(14501) + method.getName());
        }
    }

    private static void d(Class<? extends a0> cls, Map<String, l> map) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            xj0 xj0 = (xj0) method.getAnnotation(xj0.class);
            String r6 = C0201.m82(14502);
            if (xj0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    map.put(xj0.name(), b(xj0, method, parameterTypes[0]));
                } else {
                    throw new RuntimeException(C0201.m82(14503) + cls.getName() + r6 + method.getName());
                }
            }
            yj0 yj0 = (yj0) method.getAnnotation(yj0.class);
            if (yj0 != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 2) {
                    throw new RuntimeException(C0201.m82(14505) + cls.getName() + r6 + method.getName());
                } else if (parameterTypes2[0] == Integer.TYPE) {
                    c(yj0, method, parameterTypes2[1], map);
                } else {
                    throw new RuntimeException(C0201.m82(14504) + cls.getName() + r6 + method.getName());
                }
            }
        }
    }

    private static void e(Class<? extends ViewManager> cls, Map<String, l> map) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            xj0 xj0 = (xj0) method.getAnnotation(xj0.class);
            String r5 = C0201.m82(14506);
            String r8 = C0201.m82(14507);
            if (xj0 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length != 2) {
                    throw new RuntimeException(C0201.m82(14508) + cls.getName() + r8 + method.getName());
                } else if (View.class.isAssignableFrom(parameterTypes[0])) {
                    map.put(xj0.name(), b(xj0, method, parameterTypes[1]));
                } else {
                    throw new RuntimeException(r5 + cls.getName() + r8 + method.getName());
                }
            }
            yj0 yj0 = (yj0) method.getAnnotation(yj0.class);
            if (yj0 != null) {
                Class<?>[] parameterTypes2 = method.getParameterTypes();
                if (parameterTypes2.length != 3) {
                    throw new RuntimeException(C0201.m82(14510) + cls.getName() + r8 + method.getName());
                } else if (!View.class.isAssignableFrom(parameterTypes2[0])) {
                    throw new RuntimeException(r5 + cls.getName() + r8 + method.getName());
                } else if (parameterTypes2[1] == Integer.TYPE) {
                    c(yj0, method, parameterTypes2[2], map);
                } else {
                    throw new RuntimeException(C0201.m82(14509) + cls.getName() + r8 + method.getName());
                }
            }
        }
    }

    public static Map<String, l> f(Class<? extends a0> cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (cls2 == a0.class) {
                return b;
            }
        }
        Map<String, l> map = a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(f(cls.getSuperclass()));
        d(cls, hashMap);
        a.put(cls, hashMap);
        return hashMap;
    }

    public static Map<String, l> g(Class<? extends ViewManager> cls) {
        if (cls == ViewManager.class) {
            return b;
        }
        Map<String, l> map = a.get(cls);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap(g(cls.getSuperclass()));
        e(cls, hashMap);
        a.put(cls, hashMap);
        return hashMap;
    }

    /* access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache */
    public static class g extends l {
        private final double i;

        public g(xj0 xj0, Method method, double d) {
            super(xj0, C0201.m82(33647), method);
            this.i = d;
        }

        @Override // com.facebook.react.uimanager.b1.l
        public Object c(Object obj, Context context) {
            return Double.valueOf(obj == null ? this.i : ((Double) obj).doubleValue());
        }

        public g(yj0 yj0, Method method, int i2, double d) {
            super(yj0, C0201.m82(33648), method, i2);
            this.i = d;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache */
    public static class i extends l {
        private final float i;

        public i(xj0 xj0, Method method, float f) {
            super(xj0, C0201.m82(33757), method);
            this.i = f;
        }

        @Override // com.facebook.react.uimanager.b1.l
        public Object c(Object obj, Context context) {
            return Float.valueOf(obj == null ? this.i : Float.valueOf(((Double) obj).floatValue()).floatValue());
        }

        public i(yj0 yj0, Method method, int i2, float f) {
            super(yj0, C0201.m82(33758), method, i2);
            this.i = f;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ViewManagersPropertyCache */
    public static class j extends l {
        private final int i;

        public j(xj0 xj0, Method method, int i2) {
            super(xj0, C0201.m82(34077), method);
            this.i = i2;
        }

        @Override // com.facebook.react.uimanager.b1.l
        public Object c(Object obj, Context context) {
            return Integer.valueOf(obj == null ? this.i : Integer.valueOf(((Double) obj).intValue()).intValue());
        }

        public j(yj0 yj0, Method method, int i2, int i3) {
            super(yj0, C0201.m82(34078), method, i2);
            this.i = i3;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ViewManagersPropertyCache */
    public static abstract class l {
        private static final Object[] e = new Object[2];
        private static final Object[] f = new Object[3];
        private static final Object[] g = new Object[1];
        private static final Object[] h = new Object[2];
        public final String a;
        public final String b;
        public final Method c;
        public final Integer d;

        public String a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }

        public abstract Object c(Object obj, Context context);

        public void d(a0 a0Var, Object obj) {
            try {
                if (this.d == null) {
                    g[0] = c(obj, a0Var.getThemedContext());
                    this.c.invoke(a0Var, g);
                    Arrays.fill(g, (Object) null);
                    return;
                }
                h[0] = this.d;
                h[1] = c(obj, a0Var.getThemedContext());
                this.c.invoke(a0Var, h);
                Arrays.fill(h, (Object) null);
            } catch (Throwable th) {
                f60.f(ViewManager.class, C0201.m82(34151) + this.a, th);
                throw new JSApplicationIllegalArgumentException(C0201.m82(34152) + this.a + C0201.m82(34153) + a0Var.getViewClass(), th);
            }
        }

        public void e(ViewManager viewManager, View view, Object obj) {
            try {
                if (this.d == null) {
                    e[0] = view;
                    e[1] = c(obj, view.getContext());
                    this.c.invoke(viewManager, e);
                    Arrays.fill(e, (Object) null);
                    return;
                }
                f[0] = view;
                f[1] = this.d;
                f[2] = c(obj, view.getContext());
                this.c.invoke(viewManager, f);
                Arrays.fill(f, (Object) null);
            } catch (Throwable th) {
                f60.f(ViewManager.class, C0201.m82(34154) + this.a, th);
                throw new JSApplicationIllegalArgumentException(C0201.m82(34155) + this.a + C0201.m82(34156) + viewManager.getName(), th);
            }
        }

        private l(xj0 xj0, String str, Method method) {
            this.a = xj0.name();
            this.b = !C0201.m82(34149).equals(xj0.customType()) ? xj0.customType() : str;
            this.c = method;
            this.d = null;
        }

        private l(yj0 yj0, String str, Method method, int i) {
            this.a = yj0.names()[i];
            this.b = !C0201.m82(34150).equals(yj0.customType()) ? yj0.customType() : str;
            this.c = method;
            this.d = Integer.valueOf(i);
        }
    }
}
