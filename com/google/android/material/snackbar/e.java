package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager */
public class e {
    private static e e;
    private final Object a = new Object();
    private final Handler b = new Handler(Looper.getMainLooper(), new a());
    private c c;
    private c d;

    /* compiled from: SnackbarManager */
    class a implements Handler.Callback {
        public a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            e.this.c((c) message.obj);
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: SnackbarManager */
    public interface b {
        void a(int i);
    }

    /* access modifiers changed from: private */
    /* compiled from: SnackbarManager */
    public static class c {
        public final WeakReference<b> a;
        public int b;
        public boolean c;

        public boolean a(b bVar) {
            return bVar != null && this.a.get() == bVar;
        }
    }

    private e() {
    }

    private boolean a(c cVar, int i) {
        b bVar = cVar.a.get();
        if (bVar == null) {
            return false;
        }
        this.b.removeCallbacksAndMessages(cVar);
        bVar.a(i);
        return true;
    }

    public static e b() {
        if (e == null) {
            e = new e();
        }
        return e;
    }

    private boolean d(b bVar) {
        c cVar = this.c;
        return cVar != null && cVar.a(bVar);
    }

    private void g(c cVar) {
        int i = cVar.b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.b.removeCallbacksAndMessages(cVar);
            Handler handler = this.b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    public void c(c cVar) {
        synchronized (this.a) {
            if (this.c == cVar || this.d == cVar) {
                a(cVar, 2);
            }
        }
    }

    public void e(b bVar) {
        synchronized (this.a) {
            if (d(bVar) && !this.c.c) {
                this.c.c = true;
                this.b.removeCallbacksAndMessages(this.c);
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.a) {
            if (d(bVar) && this.c.c) {
                this.c.c = false;
                g(this.c);
            }
        }
    }
}
