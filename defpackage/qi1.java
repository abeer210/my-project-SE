package defpackage;

import java.io.PrintStream;
import vigqyno.C0201;

/* renamed from: qi1  reason: default package */
public final class qi1 {
    private static final ri1 a;

    /* renamed from: qi1$a */
    static final class a extends ri1 {
        @Override // defpackage.ri1
        public final void a(Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    static {
        ri1 ri1;
        Integer num;
        Throwable th;
        try {
            num = b();
            if (num != null) {
                try {
                    if (num.intValue() >= 19) {
                        ri1 = new vi1();
                        a = ri1;
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
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 132);
                    sb.append(C0201.m82(28294));
                    sb.append(name);
                    sb.append(C0201.m82(28295));
                    printStream.println(sb.toString());
                    th.printStackTrace(System.err);
                    ri1 = new a();
                    a = ri1;
                    if (num == null) {
                    }
                }
            }
            if (!Boolean.getBoolean(C0201.m82(28293))) {
                ri1 = new ui1();
            } else {
                ri1 = new a();
            }
        } catch (Throwable th3) {
            th = th3;
            num = null;
            PrintStream printStream2 = System.err;
            String name2 = a.class.getName();
            StringBuilder sb2 = new StringBuilder(String.valueOf(name2).length() + 132);
            sb2.append(C0201.m82(28294));
            sb2.append(name2);
            sb2.append(C0201.m82(28295));
            printStream2.println(sb2.toString());
            th.printStackTrace(System.err);
            ri1 = new a();
            a = ri1;
            if (num == null) {
            }
        }
        a = ri1;
        if (num == null) {
        }
    }

    public static void a(Throwable th) {
        a.a(th);
    }

    private static Integer b() {
        try {
            return (Integer) Class.forName(C0201.m82(28296)).getField(C0201.m82(28297)).get(null);
        } catch (Exception e) {
            System.err.println(C0201.m82(28298));
            e.printStackTrace(System.err);
            return null;
        }
    }
}
