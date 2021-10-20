package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: k61  reason: default package */
public final class k61 extends ContentObserver {
    public k61(Handler handler) {
        super(null);
    }

    public final void onChange(boolean z) {
        l61.e.set(true);
    }
}
