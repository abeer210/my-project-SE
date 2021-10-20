package defpackage;

import java.util.concurrent.Callable;

/* renamed from: mq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final /* synthetic */ class mq0 implements Callable {
    private final boolean a;
    private final String b;
    private final lq0 c;

    public mq0(boolean z, String str, lq0 lq0) {
        this.a = z;
        this.b = str;
        this.c = lq0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return kq0.b(this.a, this.b, this.c);
    }
}
