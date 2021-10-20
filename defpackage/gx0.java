package defpackage;

import java.lang.reflect.Field;
import java.util.Arrays;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: gx0  reason: default package */
public final class gx0 {
    private int A;
    private int B;
    private Field C;
    private Object D;
    private Object E;
    private Object F;
    private final hx0 a;
    private final Object[] b;
    private Class<?> c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int[] n;
    private int o;
    private int p;
    private int q = C0188.f24;
    private int r = C0188.f23;
    private int s = 0;
    private int t = 0;
    private int u = 0;
    private int v = 0;
    private int w = 0;
    private int x;
    private int y;
    private int z;

    public gx0(Class<?> cls, String str, Object[] objArr) {
        this.c = cls;
        hx0 hx0 = new hx0(str);
        this.a = hx0;
        this.b = objArr;
        this.d = hx0.b();
        int b2 = this.a.b();
        this.e = b2;
        int[] iArr = null;
        if (b2 == 0) {
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.l = 0;
            this.k = 0;
            this.m = 0;
            this.n = null;
            return;
        }
        this.f = this.a.b();
        this.g = this.a.b();
        this.h = this.a.b();
        this.i = this.a.b();
        this.l = this.a.b();
        this.k = this.a.b();
        this.j = this.a.b();
        this.m = this.a.b();
        int b3 = this.a.b();
        this.n = b3 != 0 ? new int[b3] : iArr;
        this.o = (this.f << 1) + this.g;
    }

    private static Field c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append(C0201.m82(10584));
            sb.append(str);
            sb.append(C0201.m82(10585));
            sb.append(name);
            sb.append(C0201.m82(10586));
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    private final Object f() {
        Object[] objArr = this.b;
        int i2 = this.o;
        this.o = i2 + 1;
        return objArr[i2];
    }

    private final boolean i() {
        return (this.d & 1) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ca, code lost:
        if (i() != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0158, code lost:
        if (r1 != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015f, code lost:
        if (i() != false) goto L_0x00cc;
     */
    public final boolean a() {
        int i2;
        Object type;
        boolean z2 = false;
        if (!this.a.a()) {
            return false;
        }
        this.x = this.a.b();
        int b2 = this.a.b();
        this.y = b2;
        this.z = b2 & 255;
        int i3 = this.x;
        if (i3 < this.q) {
            this.q = i3;
        }
        int i4 = this.x;
        if (i4 > this.r) {
            this.r = i4;
        }
        if (this.z == fv0.MAP.b()) {
            this.s++;
        } else if (this.z >= fv0.DOUBLE_LIST.b() && this.z <= fv0.GROUP_LIST.b()) {
            this.t++;
        }
        int i5 = this.w + 1;
        this.w = i5;
        if (kx0.s(this.q, this.x, i5)) {
            int i6 = this.x + 1;
            this.v = i6;
            i2 = i6 - this.q;
        } else {
            i2 = this.u + 1;
        }
        this.u = i2;
        if ((this.y & 1024) != 0) {
            int[] iArr = this.n;
            int i7 = this.p;
            this.p = i7 + 1;
            iArr[i7] = this.x;
        }
        this.D = null;
        this.E = null;
        this.F = null;
        if (k()) {
            this.A = this.a.b();
            if (!(this.z == fv0.MESSAGE.b() + 51 || this.z == fv0.GROUP.b() + 51)) {
                if (this.z == fv0.ENUM.b() + 51) {
                }
                return true;
            }
            type = f();
            this.D = type;
            return true;
        }
        this.C = c(this.c, (String) f());
        if (o()) {
            this.B = this.a.b();
        }
        if (this.z == fv0.MESSAGE.b() || this.z == fv0.GROUP.b()) {
            type = this.C.getType();
            this.D = type;
            return true;
        }
        if (!(this.z == fv0.MESSAGE_LIST.b() || this.z == fv0.GROUP_LIST.b())) {
            if (this.z != fv0.ENUM.b() && this.z != fv0.ENUM_LIST.b() && this.z != fv0.ENUM_LIST_PACKED.b()) {
                if (this.z == fv0.MAP.b()) {
                    this.F = f();
                    if ((this.y & 2048) != 0) {
                        z2 = true;
                    }
                }
                return true;
            }
        }
        type = f();
        this.D = type;
        return true;
        this.E = f();
        return true;
    }

    public final int g() {
        return this.x;
    }

    public final int h() {
        return this.z;
    }

    public final boolean k() {
        return this.z > fv0.MAP.b();
    }

    public final Field l() {
        int i2 = this.A << 1;
        Object obj = this.b[i2];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c2 = c(this.c, (String) obj);
        this.b[i2] = c2;
        return c2;
    }

    public final Field m() {
        int i2 = (this.A << 1) + 1;
        Object obj = this.b[i2];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c2 = c(this.c, (String) obj);
        this.b[i2] = c2;
        return c2;
    }

    public final Field n() {
        return this.C;
    }

    public final boolean o() {
        return i() && this.z <= fv0.GROUP.b();
    }

    public final Field p() {
        int i2 = (this.f << 1) + (this.B / 32);
        Object obj = this.b[i2];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c2 = c(this.c, (String) obj);
        this.b[i2] = c2;
        return c2;
    }

    public final int q() {
        return this.B % 32;
    }

    public final boolean r() {
        return (this.y & 256) != 0;
    }

    public final boolean s() {
        return (this.y & 512) != 0;
    }

    public final Object t() {
        return this.D;
    }

    public final Object u() {
        return this.E;
    }

    public final Object v() {
        return this.F;
    }
}
