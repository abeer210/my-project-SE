package defpackage;

import java.io.InputStream;

/* renamed from: e63  reason: default package */
/* compiled from: RecipientOperator */
public class e63 {
    private final Object a;

    public e63(q73 q73) {
        q73.b();
        this.a = q73;
    }

    public InputStream a(InputStream inputStream) {
        Object obj = this.a;
        if (obj instanceof q73) {
            return ((q73) obj).a(inputStream);
        }
        return new tb3(inputStream, ((r73) this.a).a());
    }
}
