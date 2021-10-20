package defpackage;

/* renamed from: t92  reason: default package */
/* compiled from: DecodedInformation */
public final class t92 extends v92 {
    private final String b;
    private final int c;
    private final boolean d;

    public t92(int i, String str) {
        super(i);
        this.b = str;
        this.d = false;
        this.c = 0;
    }

    public String b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }

    public t92(int i, String str, int i2) {
        super(i);
        this.d = true;
        this.c = i2;
        this.b = str;
    }
}
