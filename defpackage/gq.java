package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: gq  reason: default package */
/* compiled from: PngChunkType */
public class gq {
    private static final Set<String> c;
    public static final gq d;
    public static final gq e;
    public static final gq f;
    public static final gq g;
    public static final gq h;
    public static final gq i;
    public static final gq j;
    public static final gq k;
    public static final gq l;
    public static final gq m;
    public static final gq n;
    public static final gq o;
    public static final gq p;
    public static final gq q;
    public static final gq r;
    private final byte[] a;
    private final boolean b;

    static {
        String r1 = C0201.m82(18159);
        String r2 = C0201.m82(18160);
        String r3 = C0201.m82(18161);
        String r4 = C0201.m82(18162);
        String r5 = C0201.m82(18163);
        c = new HashSet(Arrays.asList(r1, r2, r3, r4, r5));
        try {
            d = new gq(C0201.m82(18164));
            e = new gq(C0201.m82(18165));
            new gq(r1, true);
            f = new gq(C0201.m82(18166));
            g = new gq(C0201.m82(18167));
            h = new gq(C0201.m82(18168));
            i = new gq(C0201.m82(18169));
            j = new gq(C0201.m82(18170));
            k = new gq(C0201.m82(18171));
            l = new gq(C0201.m82(18172));
            new gq(C0201.m82(18173));
            m = new gq(C0201.m82(18174));
            n = new gq(C0201.m82(18175));
            new gq(r2, true);
            o = new gq(C0201.m82(18176));
            p = new gq(r3, true);
            q = new gq(r4, true);
            r = new gq(r5, true);
        } catch (kq e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public gq(String str) throws kq {
        this(str, false);
    }

    private static boolean c(byte b2) {
        return (b2 >= 65 && b2 <= 90) || (b2 >= 97 && b2 <= 122);
    }

    private static void d(byte[] bArr) throws kq {
        if (bArr.length == 4) {
            for (byte b2 : bArr) {
                if (!c(b2)) {
                    throw new kq(C0201.m82(18179));
                }
            }
            return;
        }
        throw new kq(C0201.m82(18180));
    }

    public boolean a() {
        return this.b;
    }

    public String b() {
        try {
            return new String(this.a, C0201.m82(18181));
        } catch (UnsupportedEncodingException unused) {
            return C0201.m82(18182);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gq.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((gq) obj).a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public String toString() {
        return b();
    }

    public gq(String str, boolean z) throws kq {
        this.b = z;
        try {
            byte[] bytes = str.getBytes(C0201.m82(18177));
            d(bytes);
            this.a = bytes;
        } catch (UnsupportedEncodingException unused) {
            throw new IllegalArgumentException(C0201.m82(18178));
        }
    }

    public gq(byte[] bArr) throws kq {
        d(bArr);
        this.a = bArr;
        this.b = c.contains(b());
    }
}
