package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: ip2  reason: default package */
/* compiled from: lambda */
public final /* synthetic */ class ip2 implements fj2 {
    public final /* synthetic */ Typeface a;

    public /* synthetic */ ip2(Typeface typeface) {
        this.a = typeface;
    }

    @Override // defpackage.fj2
    public final void a(Object obj) {
        ((TextView) obj).setTypeface(this.a);
    }
}
