package defpackage;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: c80  reason: default package */
/* compiled from: Fresco */
public class c80 {
    private static final Class<?> a = c80.class;
    private static f80 b;
    private static volatile boolean c;

    static {
        C0201.m83(c80.class, 613);
    }

    private c80() {
    }

    public static be0 a() {
        return b().i();
    }

    public static ee0 b() {
        return ee0.k();
    }

    public static void c(Context context, ce0 ce0) {
        d(context, ce0, null);
    }

    public static void d(Context context, ce0 ce0, b80 b80) {
        if (oh0.d()) {
            oh0.a(C0201.m82(14213));
        }
        if (c) {
            f60.w(a, C0201.m82(14214));
        } else {
            c = true;
        }
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(14215));
            }
            SoLoader.e(context, 0);
            if (oh0.d()) {
                oh0.b();
            }
            Context applicationContext = context.getApplicationContext();
            if (ce0 == null) {
                ee0.t(applicationContext);
            } else {
                ee0.u(ce0);
            }
            e(applicationContext, b80);
            if (oh0.d()) {
                oh0.b();
            }
        } catch (IOException e) {
            if (oh0.d()) {
                oh0.b();
            }
            throw new RuntimeException(C0201.m82(14216), e);
        }
    }

    private static void e(Context context, b80 b80) {
        if (oh0.d()) {
            oh0.a(C0201.m82(14217));
        }
        f80 f80 = new f80(context, b80);
        b = f80;
        qa0.i(f80);
        if (oh0.d()) {
            oh0.b();
        }
    }

    public static e80 f() {
        return b.get();
    }
}
