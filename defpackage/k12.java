package defpackage;

import android.content.Context;

/* renamed from: k12  reason: default package */
/* compiled from: com.google.firebase:firebase-common@@17.1.0 */
public final /* synthetic */ class k12 implements x12 {
    private final l12 a;
    private final Context b;

    private k12(l12 l12, Context context) {
        this.a = l12;
        this.b = context;
    }

    public static x12 a(l12 l12, Context context) {
        return new k12(l12, context);
    }

    @Override // defpackage.x12
    public Object get() {
        return l12.v(this.a, this.b);
    }
}
