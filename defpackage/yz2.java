package defpackage;

import android.content.Context;
import java.io.File;
import vigqyno.C0201;

/* renamed from: yz2  reason: default package */
/* compiled from: ScopedContext */
public class yz2 {
    private File a = null;

    public yz2(Context context) {
        a(context);
    }

    public void a(Context context) {
        this.a = new File(context.getCacheDir() + C0201.m82(9693));
    }

    public File b() {
        return this.a;
    }
}
