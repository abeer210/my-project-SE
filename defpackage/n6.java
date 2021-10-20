package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: n6  reason: default package */
/* compiled from: ViewGroupOverlayApi14 */
public class n6 extends s6 implements p6 {
    public n6(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    public static n6 g(ViewGroup viewGroup) {
        return (n6) s6.e(viewGroup);
    }

    @Override // defpackage.p6
    public void c(View view) {
        this.a.b(view);
    }

    @Override // defpackage.p6
    public void d(View view) {
        this.a.g(view);
    }
}
