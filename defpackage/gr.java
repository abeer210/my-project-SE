package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;
import vigqyno.C0201;

/* renamed from: gr  reason: default package */
/* compiled from: CompoundException */
public class gr extends Exception {
    private final Throwable a;

    public gr(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.a != null) {
            printStream.println(C0201.m82(18024));
            this.a.printStackTrace(printStream);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        if (this.a != null) {
            String r1 = C0201.m82(18026);
            sb.append(r1);
            sb.append(C0201.m82(18027));
            sb.append(r1);
            sb.append(this.a.toString());
        }
        return sb.toString();
    }

    public gr(Throwable th) {
        this(null, th);
    }

    public gr(String str, Throwable th) {
        super(str);
        this.a = th;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.a != null) {
            printWriter.println(C0201.m82(18025));
            this.a.printStackTrace(printWriter);
        }
    }

    public void printStackTrace() {
        super.printStackTrace();
        if (this.a != null) {
            System.err.println(C0201.m82(18023));
            this.a.printStackTrace();
        }
    }
}
