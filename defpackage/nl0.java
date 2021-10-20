package defpackage;

import android.content.Context;
import android.net.Uri;

/* renamed from: nl0  reason: default package */
/* compiled from: ImageSource */
public class nl0 {
    private Uri a;
    private String b;
    private double c;
    private boolean d;

    public nl0(Context context, String str, double d2, double d3) {
        this.b = str;
        this.c = d2 * d3;
        this.a = b(context);
    }

    private Uri a(Context context) {
        this.d = true;
        return pl0.a().d(context, this.b);
    }

    private Uri b(Context context) {
        try {
            Uri parse = Uri.parse(this.b);
            return parse.getScheme() == null ? a(context) : parse;
        } catch (Exception unused) {
            return a(context);
        }
    }

    public double c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public Uri e() {
        Uri uri = this.a;
        yh0.c(uri);
        return uri;
    }

    public boolean f() {
        return this.d;
    }

    public nl0(Context context, String str) {
        this(context, str, 0.0d, 0.0d);
    }
}
