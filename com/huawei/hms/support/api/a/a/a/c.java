package com.huawei.hms.support.api.a.a.a;

import android.app.PendingIntent;
import com.huawei.hms.support.api.a.a.b.b;
import java.util.Objects;

/* compiled from: RequestActivityUpdatesCache */
public class c extends b {
    private PendingIntent a;

    public void a(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // com.huawei.hms.support.api.a.a.b.b
    public boolean equals(Object obj) {
        PendingIntent pendingIntent;
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass() || (pendingIntent = this.a) == null) {
            return false;
        }
        return pendingIntent.equals(((c) obj).a);
    }

    public int hashCode() {
        return Objects.hash(this.a);
    }
}
