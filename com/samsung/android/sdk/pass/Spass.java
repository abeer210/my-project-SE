package com.samsung.android.sdk.pass;

import android.content.Context;
import android.util.Log;
import com.samsung.android.sdk.SsdkInterface;
import com.samsung.android.sdk.SsdkUnsupportedException;
import com.samsung.android.sdk.SsdkVendorCheck;
import vigqyno.C0201;

public class Spass implements SsdkInterface {
    public static final int DEVICE_FINGERPRINT = 0;
    public static final int DEVICE_FINGERPRINT_AVAILABLE_PASSWORD = 0;
    public static final int DEVICE_FINGERPRINT_CUSTOMIZED_DIALOG = 0;
    public static final int DEVICE_FINGERPRINT_FINGER_INDEX = 0;
    public static final int DEVICE_FINGERPRINT_UNIQUE_ID = 0;
    private static boolean a;
    private static boolean b;
    private static boolean c;
    private static boolean d;
    private Context e;

    static {
        C0201.m83(Spass.class, 341);
    }

    @Override // com.samsung.android.sdk.SsdkInterface
    public int getVersionCode() {
        return 12;
    }

    @Override // com.samsung.android.sdk.SsdkInterface
    public String getVersionName() {
        return C0201.m82(18496);
    }

    @Override // com.samsung.android.sdk.SsdkInterface
    public void initialize(Context context) throws SsdkUnsupportedException {
        if (this.e == null) {
            if (context == null) {
                throw new IllegalArgumentException(C0201.m82(18506));
            } else if (SsdkVendorCheck.isSamsungDevice()) {
                try {
                    boolean hasSystemFeature = context.getPackageManager().hasSystemFeature(C0201.m82(18497));
                    a = hasSystemFeature;
                    if (hasSystemFeature) {
                        SpassFingerprint spassFingerprint = new SpassFingerprint(context);
                        c = SpassFingerprint.a();
                        b = spassFingerprint.b();
                        d = spassFingerprint.c();
                        this.e = context;
                        Log.i(C0201.m82(18502), C0201.m82(18498) + d + C0201.m82(18499) + c + C0201.m82(18500) + b + C0201.m82(18501));
                        SpassFingerprint.a(context, null);
                        return;
                    }
                    throw new SsdkUnsupportedException(C0201.m82(18503), 1);
                } catch (NullPointerException unused) {
                    throw new IllegalArgumentException(C0201.m82(18504));
                }
            } else {
                throw new SsdkUnsupportedException(C0201.m82(18505), 0);
            }
        }
    }

    @Override // com.samsung.android.sdk.SsdkInterface
    public boolean isFeatureEnabled(int i) {
        if (this.e == null) {
            throw new IllegalStateException(C0201.m82(18508));
        } else if (i == 0) {
            return a;
        } else {
            if (i == 1 || i == 2) {
                return c;
            }
            if (i == 3) {
                return b;
            }
            if (i == 4) {
                return d;
            }
            throw new IllegalArgumentException(C0201.m82(18507));
        }
    }
}
