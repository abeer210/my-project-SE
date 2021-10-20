package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: x32  reason: default package */
/* compiled from: ReflectiveTypeAdapterFactory */
public final class x32 implements y22 {
    private final g32 a;
    private final j22 b;
    private final h32 c;
    private final t32 d;
    private final e42 e = e42.a();

    /* access modifiers changed from: package-private */
    /* renamed from: x32$a */
    /* compiled from: ReflectiveTypeAdapterFactory */
    public class a extends c {
        public final /* synthetic */ Field c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ x22 e;
        public final /* synthetic */ k22 f;
        public final /* synthetic */ g42 g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(x32 x32, String str, boolean z, boolean z2, Field field, boolean z3, x22 x22, k22 k22, g42 g42, boolean z4) {
            super(str, z, z2);
            this.c = field;
            this.d = z3;
            this.e = x22;
            this.f = k22;
            this.g = g42;
        }

        @Override // defpackage.x32.c
        public void a(h42 h42, Object obj) throws IOException, IllegalAccessException {
            x22 x22;
            Object obj2 = this.c.get(obj);
            if (this.d) {
                x22 = this.e;
            } else {
                x22 = new b42(this.f, this.e, this.g.e());
            }
            x22.c(h42, obj2);
        }

        @Override // defpackage.x32.c
        public boolean b(Object obj) throws IOException, IllegalAccessException {
            if (this.b && this.c.get(obj) != obj) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: x32$b */
    /* compiled from: ReflectiveTypeAdapterFactory */
    public static final class b<T> extends x22<T> {
        private final Map<String, c> a;

        public b(l32<T> l32, Map<String, c> map) {
            this.a = map;
        }

        @Override // defpackage.x22
        public void c(h42 h42, T t) throws IOException {
            if (t == null) {
                h42.x();
                return;
            }
            h42.k();
            try {
                for (c cVar : this.a.values()) {
                    if (cVar.b(t)) {
                        h42.u(cVar.a);
                        cVar.a(h42, t);
                    }
                }
                h42.o();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x32$c */
    /* compiled from: ReflectiveTypeAdapterFactory */
    public static abstract class c {
        public final String a;
        public final boolean b;

        public c(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
        }

        public abstract void a(h42 h42, Object obj) throws IOException, IllegalAccessException;

        public abstract boolean b(Object obj) throws IOException, IllegalAccessException;
    }

    public x32(g32 g32, j22 j22, h32 h32, t32 t32) {
        this.a = g32;
        this.b = j22;
        this.c = h32;
        this.d = t32;
    }

    private c b(k22 k22, Field field, String str, g42<?> g42, boolean z, boolean z2) {
        boolean b2 = n32.b(g42.c());
        a32 a32 = (a32) field.getAnnotation(a32.class);
        x22<?> b3 = a32 != null ? this.d.b(this.a, k22, g42, a32) : null;
        boolean z3 = b3 != null;
        if (b3 == null) {
            b3 = k22.f(g42);
        }
        return new a(this, str, z, z2, field, z3, b3, k22, g42, b2);
    }

    public static boolean d(Field field, boolean z, h32 h32) {
        return !h32.c(field.getType(), z) && !h32.f(field, z);
    }

    private Map<String, c> e(k22 k22, g42<?> g42, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type e2 = g42.e();
        g42<?> g422 = g42;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean c2 = c(field, true);
                boolean c3 = c(field, z);
                if (c2 || c3) {
                    this.e.b(field);
                    Type p = f32.p(g422.e(), cls2, field.getGenericType());
                    List<String> f = f(field);
                    int size = f.size();
                    c cVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = f.get(i2);
                        boolean z2 = i2 != 0 ? false : c2;
                        cVar = cVar == null ? (c) linkedHashMap.put(str, b(k22, field, str, g42.b(p), z2, c3)) : cVar;
                        i2++;
                        c2 = z2;
                        f = f;
                        size = size;
                        field = field;
                    }
                    if (cVar != null) {
                        throw new IllegalArgumentException(e2 + C0201.m82(5522) + cVar.a);
                    }
                }
                i++;
                z = false;
            }
            g422 = g42.b(f32.p(g422.e(), cls2, cls2.getGenericSuperclass()));
            cls2 = g422.c();
        }
        return linkedHashMap;
    }

    private List<String> f(Field field) {
        b32 b32 = (b32) field.getAnnotation(b32.class);
        if (b32 == null) {
            return Collections.singletonList(this.b.b(field));
        }
        String value = b32.value();
        String[] alternate = b32.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // defpackage.y22
    public <T> x22<T> a(k22 k22, g42<T> g42) {
        Class<? super T> c2 = g42.c();
        if (!Object.class.isAssignableFrom(c2)) {
            return null;
        }
        return new b(this.a.a(g42), e(k22, g42, c2));
    }

    public boolean c(Field field, boolean z) {
        return d(field, z, this.c);
    }
}
