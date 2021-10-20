package io.invertase.firebase.database;

import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import vigqyno.C0201;

/* compiled from: RNFirebaseTransactionHandler */
public class c {
    private final ReentrantLock a;
    private final Condition b;
    public Object c;
    private boolean d;

    public void a(ReadableMap readableMap) {
        Map<String, Object> j = io.invertase.firebase.c.j(readableMap);
        this.a.lock();
        this.c = j.get(C0201.m82(21086));
        ((Boolean) j.get(C0201.m82(21087))).booleanValue();
        try {
            if (!this.d) {
                this.d = true;
                this.b.signalAll();
                return;
            }
            throw new IllegalStateException(C0201.m82(21088));
        } finally {
            this.a.unlock();
        }
    }
}
