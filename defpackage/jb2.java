package defpackage;

import android.content.Context;
import java.io.InputStream;

/* renamed from: jb2  reason: default package */
public abstract class jb2 {
    private final Context a;
    private InputStream b;

    public jb2(Context context) {
        this.a = context;
    }

    public final void a() {
        rb2.b(this.b);
    }

    public abstract InputStream b(Context context);

    public InputStream c() {
        if (this.b == null) {
            this.b = b(this.a);
        }
        return this.b;
    }
}
