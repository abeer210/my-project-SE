package defpackage;

import android.util.Log;
import com.bumptech.glide.load.g;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: ci  reason: default package */
/* compiled from: GlideException */
public final class ci extends Exception {
    private static final StackTraceElement[] f = new StackTraceElement[0];
    private final List<Throwable> a;
    private g b;
    private com.bumptech.glide.load.a c;
    private Class<?> d;
    private String e;

    public ci(String str) {
        this(str, Collections.emptyList());
    }

    private void a(Throwable th, List<Throwable> list) {
        if (th instanceof ci) {
            for (Throwable th2 : ((ci) th).e()) {
                a(th2, list);
            }
            return;
        }
        list.add(th);
    }

    private static void b(List<Throwable> list, Appendable appendable) {
        try {
            c(list, appendable);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void c(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append(C0201.m82(8104)).append(String.valueOf(i2)).append(C0201.m82(8105)).append(String.valueOf(size)).append(C0201.m82(8106));
            Throwable th = list.get(i);
            if (th instanceof ci) {
                ((ci) th).h(appendable);
            } else {
                d(th, appendable);
            }
            i = i2;
        }
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(C0201.m82(8107)).append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private void h(Appendable appendable) {
        d(this, appendable);
        b(e(), new a(appendable));
    }

    public List<Throwable> e() {
        return this.a;
    }

    public List<Throwable> f() {
        ArrayList arrayList = new ArrayList();
        a(this, arrayList);
        return arrayList;
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public void g(String str) {
        List<Throwable> f2 = f();
        int size = f2.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(8108));
            int i2 = i + 1;
            sb.append(i2);
            sb.append(C0201.m82(8109));
            sb.append(size);
            sb.append(C0201.m82(8110));
            Log.i(str, sb.toString(), f2.get(i));
            i = i2;
        }
    }

    public String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        Class<?> cls = this.d;
        String r2 = C0201.m82(8111);
        String r3 = C0201.m82(8112);
        sb.append(cls != null ? r2 + this.d : r3);
        sb.append(this.c != null ? r2 + this.c : r3);
        if (this.b != null) {
            r3 = r2 + this.b;
        }
        sb.append(r3);
        List<Throwable> f2 = f();
        if (f2.isEmpty()) {
            return sb.toString();
        }
        if (f2.size() == 1) {
            sb.append(C0201.m82(8113));
        } else {
            sb.append(C0201.m82(8114));
            sb.append(f2.size());
            sb.append(C0201.m82(8115));
        }
        for (Throwable th : f2) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append(C0201.m82(8116));
        return sb.toString();
    }

    public void i(g gVar, com.bumptech.glide.load.a aVar) {
        j(gVar, aVar, null);
    }

    public void j(g gVar, com.bumptech.glide.load.a aVar, Class<?> cls) {
        this.b = gVar;
        this.c = aVar;
        this.d = cls;
    }

    public void k(Exception exc) {
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public ci(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        h(printStream);
    }

    public ci(String str, List<Throwable> list) {
        this.e = str;
        setStackTrace(f);
        this.a = list;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        h(printWriter);
    }

    /* access modifiers changed from: private */
    /* renamed from: ci$a */
    /* compiled from: GlideException */
    public static final class a implements Appendable {
        private final Appendable a;
        private boolean b = true;

        public a(Appendable appendable) {
            this.a = appendable;
        }

        private CharSequence a(CharSequence charSequence) {
            return charSequence == null ? C0201.m82(31844) : charSequence;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.b) {
                this.b = false;
                this.a.append(C0201.m82(31845));
            }
            if (c == '\n') {
                z = true;
            }
            this.b = z;
            this.a.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence) throws IOException {
            CharSequence a2 = a(charSequence);
            append(a2, 0, a2.length());
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            CharSequence a2 = a(charSequence);
            boolean z = false;
            if (this.b) {
                this.b = false;
                this.a.append(C0201.m82(31846));
            }
            if (a2.length() > 0 && a2.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.b = z;
            this.a.append(a2, i, i2);
            return this;
        }
    }
}
