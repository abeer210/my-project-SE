package defpackage;

import android.os.DeadObjectException;
import android.os.IInterface;

/* renamed from: o21  reason: default package */
public interface o21<T extends IInterface> {
    void a();

    T getService() throws DeadObjectException;
}
