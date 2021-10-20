package defpackage;

import java.util.concurrent.Callable;

/* renamed from: vq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class vq0 extends tq0 {
    private final Callable<String> e;

    private vq0(Callable<String> callable) {
        super(false, null, null);
        this.e = callable;
    }

    @Override // defpackage.tq0
    public final String a() {
        try {
            return this.e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
