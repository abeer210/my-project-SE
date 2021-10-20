package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: g01  reason: default package */
public final class g01 extends ContentObserver {
    public g01(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        f01.e.set(true);
    }
}
