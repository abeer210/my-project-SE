package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.s;
import vigqyno.C0201;

/* renamed from: vo0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class vo0 extends ip0 {
    public static final Parcelable.Creator<vo0> CREATOR = new iq0();
    public static final vo0 e = new vo0(0);
    private final int a;
    private final int b;
    private final PendingIntent c;
    private final String d;

    public vo0(int i, int i2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = i2;
        this.c = pendingIntent;
        this.d = str;
    }

    public static String y(int i) {
        if (i == 99) {
            return C0201.m82(329);
        }
        if (i == 1500) {
            return C0201.m82(328);
        }
        switch (i) {
            case -1:
                return C0201.m82(327);
            case 0:
                return C0201.m82(326);
            case 1:
                return C0201.m82(325);
            case 2:
                return C0201.m82(324);
            case 3:
                return C0201.m82(323);
            case 4:
                return C0201.m82(322);
            case 5:
                return C0201.m82(321);
            case 6:
                return C0201.m82(320);
            case 7:
                return C0201.m82(319);
            case 8:
                return C0201.m82(318);
            case 9:
                return C0201.m82(317);
            case 10:
                return C0201.m82(316);
            case 11:
                return C0201.m82(315);
            default:
                switch (i) {
                    case 13:
                        return C0201.m82(314);
                    case 14:
                        return C0201.m82(313);
                    case 15:
                        return C0201.m82(312);
                    case 16:
                        return C0201.m82(311);
                    case 17:
                        return C0201.m82(310);
                    case 18:
                        return C0201.m82(309);
                    case 19:
                        return C0201.m82(308);
                    case 20:
                        return C0201.m82(307);
                    case 21:
                        return C0201.m82(306);
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append(C0201.m82(304));
                        sb.append(i);
                        sb.append(C0201.m82(305));
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vo0)) {
            return false;
        }
        vo0 vo0 = (vo0) obj;
        return this.b == vo0.b && s.a(this.c, vo0.c) && s.a(this.d, vo0.d);
    }

    public final int hashCode() {
        return s.b(Integer.valueOf(this.b), this.c, this.d);
    }

    public final int o() {
        return this.b;
    }

    public final String p() {
        return this.d;
    }

    public final PendingIntent r() {
        return this.c;
    }

    public final boolean s() {
        return (this.b == 0 || this.c == null) ? false : true;
    }

    public final String toString() {
        s.a c2 = s.c(this);
        c2.a(C0201.m82(330), y(this.b));
        c2.a(C0201.m82(331), this.c);
        c2.a(C0201.m82(332), this.d);
        return c2.toString();
    }

    public final boolean u() {
        return this.b == 0;
    }

    public final void w(Activity activity, int i) throws IntentSender.SendIntentException {
        if (s()) {
            activity.startIntentSenderForResult(this.c.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.n(parcel, 2, o());
        kp0.s(parcel, 3, r(), i, false);
        kp0.u(parcel, 4, p(), false);
        kp0.b(parcel, a2);
    }

    public vo0(int i) {
        this(i, null, null);
    }

    public vo0(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public vo0(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
