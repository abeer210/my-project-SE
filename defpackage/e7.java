package defpackage;

import android.os.IBinder;

/* renamed from: e7  reason: default package */
/* compiled from: WindowIdApi14 */
public class e7 implements g7 {
    private final IBinder a;

    public e7(IBinder iBinder) {
        this.a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e7) && ((e7) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
