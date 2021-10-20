package defpackage;

import java.io.PrintStream;
import vigqyno.C0201;

/* renamed from: x01  reason: default package */
public final class x01 {
    private static final w01 a;

    /* renamed from: x01$a */
    static final class a extends w01 {
        @Override // defpackage.w01
        public final void a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    static {
        w01 w01;
        Integer num;
        Throwable th;
        try {
            num = b();
            if (num != null) {
                try {
                    if (num.intValue() >= 19) {
                        w01 = new b11();
                        a = w01;
                        if (num == null) {
                            num.intValue();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    PrintStream printStream = System.err;
                    String name = a.class.getName();
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 133);
                    sb.append(C0201.m82(3286));
                    sb.append(name);
                    sb.append(C0201.m82(3287));
                    printStream.println(sb.toString());
                    th.printStackTrace(System.err);
                    w01 = new a();
                    a = w01;
                    if (num == null) {
                    }
                }
            }
            if (!Boolean.getBoolean(C0201.m82(3285))) {
                w01 = new a11();
            } else {
                w01 = new a();
            }
        } catch (Throwable th3) {
            th = th3;
            num = null;
            PrintStream printStream2 = System.err;
            String name2 = a.class.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 133);
            sb2.append(C0201.m82(3286));
            sb2.append(name2);
            sb2.append(C0201.m82(3287));
            printStream2.println(sb2.toString());
            th.printStackTrace(System.err);
            w01 = new a();
            a = w01;
            if (num == null) {
            }
        }
        a = w01;
        if (num == null) {
        }
    }

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }

    private static Integer b() {
        try {
            return (Integer) Class.forName(C0201.m82(3288)).getField(C0201.m82(3289)).get(null);
        } catch (Exception e) {
            System.err.println(C0201.m82(3290));
            e.printStackTrace(System.err);
            return null;
        }
    }
}
