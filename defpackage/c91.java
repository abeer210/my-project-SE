package defpackage;

import vigqyno.C0201;

/* renamed from: c91  reason: default package */
public final class c91 {
    private static final a91<?> a = new z81();
    private static final a91<?> b = a();

    private static a91<?> a() {
        try {
            return (a91) Class.forName(C0201.m82(12096)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static a91<?> b() {
        return a;
    }

    public static a91<?> c() {
        a91<?> a91 = b;
        if (a91 != null) {
            return a91;
        }
        throw new IllegalStateException(C0201.m82(12097));
    }
}
