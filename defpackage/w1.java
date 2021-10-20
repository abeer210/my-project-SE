package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import vigqyno.C0201;

@Deprecated
/* renamed from: w1  reason: default package */
/* compiled from: FingerprintManagerCompat */
public final class w1 {
    private final Context a;

    private w1(Context context) {
        this.a = context;
    }

    public static w1 a(Context context) {
        return new w1(context);
    }

    private static FingerprintManager b(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i <= 23 || !context.getPackageManager().hasSystemFeature(C0201.m82(10534))) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    public boolean c() {
        FingerprintManager b;
        if (Build.VERSION.SDK_INT < 23 || (b = b(this.a)) == null || !b.isHardwareDetected()) {
            return false;
        }
        return true;
    }
}
