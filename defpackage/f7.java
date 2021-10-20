package defpackage;

import android.view.View;
import android.view.WindowId;

/* renamed from: f7  reason: default package */
/* compiled from: WindowIdApi18 */
public class f7 implements g7 {
    private final WindowId a;

    public f7(View view) {
        this.a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof f7) && ((f7) obj).a.equals(this.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
