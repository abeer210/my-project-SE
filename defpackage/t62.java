package defpackage;

import java.util.EnumMap;
import java.util.Map;

/* renamed from: t62  reason: default package */
/* compiled from: Result */
public final class t62 {
    private final String a;
    private final byte[] b;
    private v62[] c;
    private final f62 d;
    private Map<u62, Object> e;

    public t62(String str, byte[] bArr, v62[] v62Arr, f62 f62) {
        this(str, bArr, v62Arr, f62, System.currentTimeMillis());
    }

    public void a(v62[] v62Arr) {
        v62[] v62Arr2 = this.c;
        if (v62Arr2 == null) {
            this.c = v62Arr;
        } else if (v62Arr != null && v62Arr.length > 0) {
            v62[] v62Arr3 = new v62[(v62Arr2.length + v62Arr.length)];
            System.arraycopy(v62Arr2, 0, v62Arr3, 0, v62Arr2.length);
            System.arraycopy(v62Arr, 0, v62Arr3, v62Arr2.length, v62Arr.length);
            this.c = v62Arr3;
        }
    }

    public f62 b() {
        return this.d;
    }

    public byte[] c() {
        return this.b;
    }

    public Map<u62, Object> d() {
        return this.e;
    }

    public v62[] e() {
        return this.c;
    }

    public String f() {
        return this.a;
    }

    public void g(Map<u62, Object> map) {
        if (map != null) {
            Map<u62, Object> map2 = this.e;
            if (map2 == null) {
                this.e = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(u62 u62, Object obj) {
        if (this.e == null) {
            this.e = new EnumMap(u62.class);
        }
        this.e.put(u62, obj);
    }

    public String toString() {
        return this.a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public t62(String str, byte[] bArr, v62[] v62Arr, f62 f62, long j) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, v62Arr, f62, j);
    }

    public t62(String str, byte[] bArr, int i, v62[] v62Arr, f62 f62, long j) {
        this.a = str;
        this.b = bArr;
        this.c = v62Arr;
        this.d = f62;
        this.e = null;
    }
}
