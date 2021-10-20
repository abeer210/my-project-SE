package defpackage;

import java.util.List;

/* renamed from: f72  reason: default package */
/* compiled from: DecoderResult */
public final class f72 {
    private final byte[] a;
    private int b;
    private final String c;
    private final List<byte[]> d;
    private final String e;
    private Object f;
    private final int g;
    private final int h;

    public f72(byte[] bArr, String str, List<byte[]> list, String str2) {
        this(bArr, str, list, str2, -1, -1);
    }

    public List<byte[]> a() {
        return this.d;
    }

    public String b() {
        return this.e;
    }

    public int c() {
        return this.b;
    }

    public Object d() {
        return this.f;
    }

    public byte[] e() {
        return this.a;
    }

    public int f() {
        return this.g;
    }

    public int g() {
        return this.h;
    }

    public String h() {
        return this.c;
    }

    public boolean i() {
        return this.g >= 0 && this.h >= 0;
    }

    public void j(Integer num) {
    }

    public void k(Integer num) {
    }

    public void l(int i) {
        this.b = i;
    }

    public void m(Object obj) {
        this.f = obj;
    }

    public f72(byte[] bArr, String str, List<byte[]> list, String str2, int i, int i2) {
        int i3;
        this.a = bArr;
        if (bArr == null) {
            i3 = 0;
        } else {
            i3 = bArr.length * 8;
        }
        this.b = i3;
        this.c = str;
        this.d = list;
        this.e = str2;
        this.g = i2;
        this.h = i;
    }
}
