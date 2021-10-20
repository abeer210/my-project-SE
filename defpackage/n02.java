package defpackage;

import android.content.Context;

/* renamed from: n02  reason: default package */
public final class n02 implements iz1<m02> {
    private final iz1<Context> a;

    public n02(iz1<Context> iz1) {
        this.a = iz1;
    }

    public static n02 a(iz1<Context> iz1) {
        return new n02(iz1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.iz1
    public final /* bridge */ /* synthetic */ m02 a() {
        return new m02(this.a.a());
    }
}
