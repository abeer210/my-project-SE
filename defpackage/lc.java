package defpackage;

/* renamed from: lc  reason: default package */
/* compiled from: LottieCompositionCache */
public class lc {
    private static final lc b = new lc();
    private final v0<String, ea> a = new v0<>(20);

    public static lc b() {
        return b;
    }

    public ea a(String str) {
        if (str == null) {
            return null;
        }
        return this.a.c(str);
    }

    public void c(String str, ea eaVar) {
        if (str != null) {
            this.a.d(str, eaVar);
        }
    }
}
