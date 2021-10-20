package defpackage;

/* renamed from: oh0  reason: default package */
/* compiled from: FrescoSystrace */
public class oh0 {
    private static volatile a a;

    /* renamed from: oh0$a */
    /* compiled from: FrescoSystrace */
    public interface a {
        void a(String str);

        void b();

        boolean c();
    }

    private oh0() {
    }

    public static void a(String str) {
        c().a(str);
    }

    public static void b() {
        c().b();
    }

    private static a c() {
        if (a == null) {
            synchronized (oh0.class) {
                if (a == null) {
                    a = new nh0();
                }
            }
        }
        return a;
    }

    public static boolean d() {
        return c().c();
    }
}
