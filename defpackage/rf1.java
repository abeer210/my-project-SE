package defpackage;

import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import vigqyno.C0201;

/* renamed from: rf1  reason: default package */
public final class rf1 extends ih1 {
    private final AtomicReference<Bundle> a = new AtomicReference<>();
    private boolean b;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r5 = r5.get(vigqyno.C0201.m82(13653));
     */
    public static <T> T U3(Bundle bundle, Class<T> cls) {
        Object obj;
        if (bundle == null || obj == null) {
            return null;
        }
        try {
            return cls.cast(obj);
        } catch (ClassCastException e) {
            Log.w(C0201.m82(13656), String.format(C0201.m82(13654).concat(C0201.m82(13655)), cls.getCanonicalName(), obj.getClass().getCanonicalName()), e);
            throw e;
        }
    }

    public final String V3(long j) {
        return (String) U3(W3(j), String.class);
    }

    public final Bundle W3(long j) {
        Bundle bundle;
        synchronized (this.a) {
            if (!this.b) {
                try {
                    this.a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.a.get();
        }
        return bundle;
    }

    @Override // defpackage.jh1
    public final void q2(Bundle bundle) {
        synchronized (this.a) {
            try {
                this.a.set(bundle);
                this.b = true;
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
