package defpackage;

import java.io.PrintStream;
import vigqyno.C0201;

/* renamed from: ez1  reason: default package */
public final class ez1 {
    public static final yy1 a;

    /* JADX WARNING: Removed duplicated region for block: B:19:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009f  */
    static {
        yy1 yy1;
        Integer num = null;
        try {
            num = (Integer) Class.forName(C0201.m82(34233)).getField(C0201.m82(34234)).get(null);
        } catch (Exception e) {
            System.err.println(C0201.m82(34235));
            e.printStackTrace(System.err);
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            String name = cz1.class.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 133);
            sb.append(C0201.m82(34237));
            sb.append(name);
            sb.append(C0201.m82(34238));
            printStream.println(sb.toString());
            th.printStackTrace(System.err);
            yy1 = new cz1();
        }
        if (num == null || num.intValue() < 19) {
            yy1 = !Boolean.getBoolean(C0201.m82(34236)) ? new bz1() : new cz1();
            a = yy1;
            if (num == null) {
                num.intValue();
                return;
            }
            return;
        }
        yy1 = new dz1();
        a = yy1;
        if (num == null) {
        }
    }

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }
}
