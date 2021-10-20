package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* renamed from: oq2  reason: default package */
/* compiled from: TransitionUtils */
public class oq2 {
    private static void a(e6 e6Var, ReadableMap readableMap) {
        String r0 = C0201.m82(15827);
        if (readableMap.hasKey(r0)) {
            e6Var.b0((long) readableMap.getInt(r0));
        }
        String r02 = C0201.m82(15828);
        if (readableMap.hasKey(r02)) {
            String string = readableMap.getString(r02);
            if (string.equals(C0201.m82(15829))) {
                e6Var.d0(new AccelerateInterpolator());
            } else if (string.equals(C0201.m82(15830))) {
                e6Var.d0(new DecelerateInterpolator());
            } else if (string.equals(C0201.m82(15831))) {
                e6Var.d0(new AccelerateDecelerateInterpolator());
            } else if (string.equals(C0201.m82(15832))) {
                e6Var.d0(new LinearInterpolator());
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(15833) + string);
            }
        }
        String r03 = C0201.m82(15834);
        if (readableMap.hasKey(r03)) {
            String string2 = readableMap.getString(r03);
            lq2 lq2 = new lq2();
            if (C0201.m82(15835).equals(string2)) {
                lq2.j(80);
            } else if (C0201.m82(15836).equals(string2)) {
                lq2.j(48);
            } else if (C0201.m82(15837).equals(string2)) {
                lq2.j(5);
            } else if (C0201.m82(15838).equals(string2)) {
                lq2.j(3);
            }
            e6Var.f0(lq2);
        } else {
            e6Var.f0(null);
        }
        String r04 = C0201.m82(15839);
        if (readableMap.hasKey(r04)) {
            e6Var.h0((long) readableMap.getInt(r04));
        }
    }

    private static c7 b(String str) {
        if (str == null || C0201.m82(15840).equals(str)) {
            return null;
        }
        if (C0201.m82(15841).equals(str)) {
            return new m5(3);
        }
        if (C0201.m82(15842).equals(str)) {
            return new mq2();
        }
        if (C0201.m82(15843).equals(str)) {
            return new d6(48);
        }
        if (C0201.m82(15844).equals(str)) {
            return new d6(80);
        }
        if (C0201.m82(15845).equals(str)) {
            return new d6(5);
        }
        if (C0201.m82(15846).equals(str)) {
            return new d6(3);
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(15847) + str);
    }

    public static e6 c(ReadableMap readableMap) {
        String string = readableMap.getString(C0201.m82(15848));
        if (C0201.m82(15849).equals(string)) {
            return e(readableMap);
        }
        if (C0201.m82(15850).equals(string)) {
            return f(readableMap);
        }
        if (C0201.m82(15851).equals(string)) {
            return g(readableMap);
        }
        if (C0201.m82(15852).equals(string)) {
            return d(readableMap);
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(15853) + string);
    }

    private static e6 d(ReadableMap readableMap) {
        k5 k5Var = new k5();
        l5 l5Var = new l5();
        a(k5Var, readableMap);
        a(l5Var, readableMap);
        i6 i6Var = new i6();
        i6Var.n0(k5Var);
        i6Var.n0(l5Var);
        return i6Var;
    }

    private static e6 e(ReadableMap readableMap) {
        i6 i6Var = new i6();
        String r1 = C0201.m82(15854);
        if (!readableMap.hasKey(r1) || !readableMap.getBoolean(r1)) {
            i6Var.z0(0);
        } else {
            i6Var.z0(1);
        }
        ReadableArray array = readableMap.getArray(C0201.m82(15855));
        int size = array.size();
        for (int i = 0; i < size; i++) {
            e6 c = c(array.getMap(i));
            if (c != null) {
                i6Var.n0(c);
            }
        }
        return i6Var;
    }

    private static e6 f(ReadableMap readableMap) {
        c7 b = b(readableMap.getString(C0201.m82(15856)));
        if (b == null) {
            return null;
        }
        b.v0(1);
        a(b, readableMap);
        return b;
    }

    private static e6 g(ReadableMap readableMap) {
        c7 b = b(readableMap.getString(C0201.m82(15857)));
        if (b == null) {
            return null;
        }
        b.v0(2);
        a(b, readableMap);
        return b;
    }
}
