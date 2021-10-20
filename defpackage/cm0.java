package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import vigqyno.C0201;

/* renamed from: cm0  reason: default package */
/* compiled from: DefaultLinkHandler */
public class cm0 implements dm0 {
    private static final String b = null;
    private xl0 a;

    static {
        C0201.m83(cm0.class, 533);
    }

    public cm0(xl0 xl0) {
        this.a = xl0;
    }

    private void b(int i) {
        this.a.J(i);
    }

    private void c(String str) {
        Intent intent = new Intent(C0201.m82(19182), Uri.parse(str));
        Context context = this.a.getContext();
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intent);
            return;
        }
        String str2 = b;
        Log.w(str2, C0201.m82(19183) + str);
    }

    @Override // defpackage.dm0
    public void a(om0 om0) {
        String c = om0.a().c();
        Integer b2 = om0.a().b();
        if (c != null && !c.isEmpty()) {
            c(c);
        } else if (b2 != null) {
            b(b2.intValue());
        }
    }
}
