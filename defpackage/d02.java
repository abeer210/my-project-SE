package defpackage;

import android.app.PendingIntent;
import vigqyno.C0201;

/* renamed from: d02  reason: default package */
public final class d02 extends a02 {
    private final PendingIntent a;

    public d02(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            this.a = pendingIntent;
            return;
        }
        throw new NullPointerException(C0201.m82(28785));
    }

    @Override // defpackage.a02
    public final PendingIntent a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a02) {
            return this.a.equals(((a02) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append(C0201.m82(28786));
        sb.append(valueOf);
        sb.append(C0201.m82(28787));
        return sb.toString();
    }
}
