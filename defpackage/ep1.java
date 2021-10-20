package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ep1  reason: default package */
public final class ep1 implements Cloneable {
    private cp1<?, ?> a;
    private Object b;
    private List<jp1> c = new ArrayList();

    private final byte[] a() throws IOException {
        byte[] bArr = new byte[e()];
        b(zo1.u(bArr));
        return bArr;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final ep1 clone() {
        ep1 ep1 = new ep1();
        try {
            ep1.a = this.a;
            if (this.c == null) {
                ep1.c = null;
            } else {
                ep1.c.addAll(this.c);
            }
            if (this.b != null) {
                if (this.b instanceof hp1) {
                    ep1.b = (hp1) ((hp1) this.b).clone();
                } else if (this.b instanceof byte[]) {
                    ep1.b = ((byte[]) this.b).clone();
                } else {
                    int i = 0;
                    if (this.b instanceof byte[][]) {
                        byte[][] bArr = (byte[][]) this.b;
                        byte[][] bArr2 = new byte[bArr.length][];
                        ep1.b = bArr2;
                        while (i < bArr.length) {
                            bArr2[i] = (byte[]) bArr[i].clone();
                            i++;
                        }
                    } else if (this.b instanceof boolean[]) {
                        ep1.b = ((boolean[]) this.b).clone();
                    } else if (this.b instanceof int[]) {
                        ep1.b = ((int[]) this.b).clone();
                    } else if (this.b instanceof long[]) {
                        ep1.b = ((long[]) this.b).clone();
                    } else if (this.b instanceof float[]) {
                        ep1.b = ((float[]) this.b).clone();
                    } else if (this.b instanceof double[]) {
                        ep1.b = ((double[]) this.b).clone();
                    } else if (this.b instanceof hp1[]) {
                        hp1[] hp1Arr = (hp1[]) this.b;
                        hp1[] hp1Arr2 = new hp1[hp1Arr.length];
                        ep1.b = hp1Arr2;
                        while (i < hp1Arr.length) {
                            hp1Arr2[i] = (hp1) hp1Arr[i].clone();
                            i++;
                        }
                    }
                }
            }
            return ep1;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void b(zo1 zo1) throws IOException {
        if (this.b == null) {
            for (jp1 jp1 : this.c) {
                zo1.l(jp1.a);
                zo1.w(jp1.b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }

    public final void c(jp1 jp1) throws IOException {
        List<jp1> list = this.c;
        if (list != null) {
            list.add(jp1);
            return;
        }
        Object obj = this.b;
        if (obj instanceof hp1) {
            byte[] bArr = jp1.b;
            yo1 s = yo1.s(bArr, 0, bArr.length);
            int m = s.m();
            if (m == bArr.length - zo1.f(m)) {
                hp1 a2 = ((hp1) this.b).a(s);
                this.a = this.a;
                this.b = a2;
                this.c = null;
                return;
            }
            throw gp1.a();
        } else if (obj instanceof hp1[]) {
            Collections.singletonList(jp1);
            throw new NoSuchMethodError();
        } else {
            Collections.singletonList(jp1);
            throw new NoSuchMethodError();
        }
    }

    public final int e() {
        if (this.b == null) {
            int i = 0;
            for (jp1 jp1 : this.c) {
                i += zo1.j(jp1.a) + 0 + jp1.b.length;
            }
            return i;
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        List<jp1> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ep1)) {
            return false;
        }
        ep1 ep1 = (ep1) obj;
        if (this.b == null || ep1.b == null) {
            List<jp1> list2 = this.c;
            if (list2 != null && (list = ep1.c) != null) {
                return list2.equals(list);
            }
            try {
                return Arrays.equals(a(), ep1.a());
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } else {
            cp1<?, ?> cp1 = this.a;
            if (cp1 != ep1.a) {
                return false;
            }
            if (!cp1.a.isArray()) {
                return this.b.equals(ep1.b);
            }
            Object obj2 = this.b;
            if (obj2 instanceof byte[]) {
                return Arrays.equals((byte[]) obj2, (byte[]) ep1.b);
            }
            if (obj2 instanceof int[]) {
                return Arrays.equals((int[]) obj2, (int[]) ep1.b);
            }
            if (obj2 instanceof long[]) {
                return Arrays.equals((long[]) obj2, (long[]) ep1.b);
            }
            if (obj2 instanceof float[]) {
                return Arrays.equals((float[]) obj2, (float[]) ep1.b);
            }
            if (obj2 instanceof double[]) {
                return Arrays.equals((double[]) obj2, (double[]) ep1.b);
            }
            if (obj2 instanceof boolean[]) {
                return Arrays.equals((boolean[]) obj2, (boolean[]) ep1.b);
            }
            return Arrays.deepEquals((Object[]) obj2, (Object[]) ep1.b);
        }
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(a()) + 527;
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
