package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: ki  reason: default package */
/* compiled from: ResourceRecycler */
public class ki {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: ki$a */
    /* compiled from: ResourceRecycler */
    private static final class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((hi) message.obj).recycle();
            return true;
        }
    }

    public synchronized void a(hi<?> hiVar, boolean z) {
        if (!this.a) {
            if (!z) {
                this.a = true;
                hiVar.recycle();
                this.a = false;
            }
        }
        this.b.obtainMessage(1, hiVar).sendToTarget();
    }
}
