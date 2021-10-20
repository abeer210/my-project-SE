package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.u;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import vigqyno.C0201;

/* renamed from: uo0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class uo0 implements ServiceConnection {
    private boolean a = false;
    private final BlockingQueue<IBinder> b = new LinkedBlockingQueue();

    public IBinder a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        u.j(C0201.m82(12666));
        if (!this.a) {
            this.a = true;
            IBinder poll = this.b.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException(C0201.m82(12667));
        }
        throw new IllegalStateException(C0201.m82(12668));
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
