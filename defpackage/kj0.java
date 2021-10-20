package defpackage;

import com.facebook.react.bridge.WritableMap;

/* renamed from: kj0  reason: default package */
/* compiled from: HeadlessJsTaskConfig */
public class kj0 {
    private final String a;
    private final WritableMap b;
    private final long c;
    private final boolean d;
    private final nj0 e;

    public kj0(String str, WritableMap writableMap, long j, boolean z) {
        this(str, writableMap, j, z, oj0.a);
    }

    public WritableMap a() {
        return this.b;
    }

    public nj0 b() {
        return this.e;
    }

    public String c() {
        return this.a;
    }

    public long d() {
        return this.c;
    }

    public boolean e() {
        return this.d;
    }

    public kj0(String str, WritableMap writableMap, long j, boolean z, nj0 nj0) {
        this.a = str;
        this.b = writableMap;
        this.c = j;
        this.d = z;
        this.e = nj0;
    }

    public kj0(kj0 kj0) {
        this.a = kj0.a;
        this.b = kj0.b.copy();
        this.c = kj0.c;
        this.d = kj0.d;
        nj0 nj0 = kj0.e;
        if (nj0 != null) {
            nj0.copy();
            this.e = nj0;
            return;
        }
        this.e = null;
    }
}
