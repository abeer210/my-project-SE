package defpackage;

import android.content.Context;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: kb2  reason: default package */
public class kb2 extends ib2 {
    private final Context c;
    private final String d;
    private jb2 e;
    private volatile lb2 f;
    private final Object g = new Object();

    /* access modifiers changed from: package-private */
    /* renamed from: kb2$a */
    public static class a extends jb2 {
        public final /* synthetic */ InputStream c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, InputStream inputStream) {
            super(context);
            this.c = inputStream;
        }

        @Override // defpackage.jb2
        public InputStream b(Context context) {
            return this.c;
        }
    }

    public kb2(Context context, String str) {
        this.c = context;
        this.d = str;
    }

    private static jb2 e(Context context, InputStream inputStream) {
        return new a(context, inputStream);
    }

    private static String f(String str) {
        int i = 0;
        if (str.length() > 0) {
            while (str.charAt(i) == '/') {
                i++;
            }
        }
        return '/' + str.substring(i);
    }

    @Override // defpackage.ib2
    public String c(String str) {
        return g(str, null);
    }

    @Override // defpackage.ib2
    public void d(InputStream inputStream) {
        h(e(this.c, inputStream));
    }

    public String g(String str, String str2) {
        if (str != null) {
            if (this.f == null) {
                synchronized (this.g) {
                    if (this.f == null) {
                        if (this.e != null) {
                            this.f = new nb2(this.e.c());
                            this.e.a();
                            this.e = null;
                        } else {
                            this.f = new qb2(this.c, this.d);
                        }
                    }
                }
            }
            return this.f.a(f(str), str2);
        }
        throw new NullPointerException(C0201.m82(10216));
    }

    public void h(jb2 jb2) {
        this.e = jb2;
    }
}
