package vigqyno;

import java.lang.Thread;

/* access modifiers changed from: package-private */
/* renamed from: vigqyno.■  reason: contains not printable characters */
public class C0209 extends Thread {
    static {
        C0179.m19();
    }

    public void run() {
        String str = null;
        for (int i = 0; i < 10; i++) {
            if (C0208.f31 == null) {
                Thread.UncaughtExceptionHandler unused = C0208.f31 = Thread.getDefaultUncaughtExceptionHandler();
            }
            if (C0208.f33 >= 0 && (str = C0208.m91()) != null) {
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
        C0208.m93(str);
    }
}
