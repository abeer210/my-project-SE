package defpackage;

import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: g40  reason: default package */
/* compiled from: GeofenceErrorMessages */
public class g40 {
    public static String a(int i) {
        switch (i) {
            case C0188.f18 /*{ENCODED_INT: 1000}*/:
                return C0201.m82(10809);
            case 1001:
                return C0201.m82(10808);
            case 1002:
                return C0201.m82(10807);
            default:
                return C0201.m82(10806) + Integer.toString(i);
        }
    }
}
