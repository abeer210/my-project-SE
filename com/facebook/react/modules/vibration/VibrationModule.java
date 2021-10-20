package com.facebook.react.modules.vibration;

import android.annotation.SuppressLint;
import android.os.Vibrator;
import com.facebook.fbreact.specs.NativeVibrationSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import vigqyno.C0201;

@pj0(name = "Vibration")
@SuppressLint({"MissingPermission"})
public class VibrationModule extends NativeVibrationSpec {
    public static final String NAME = null;

    static {
        C0201.m83(VibrationModule.class, 721);
    }

    public VibrationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void cancel() {
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService(C0201.m82(27974));
        if (vibrator != null) {
            vibrator.cancel();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(27975);
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrate(double d) {
        int i = (int) d;
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService(C0201.m82(27976));
        if (vibrator != null) {
            vibrator.vibrate((long) i);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeVibrationSpec
    public void vibrateByPattern(ReadableArray readableArray, double d) {
        int i = (int) d;
        Vibrator vibrator = (Vibrator) getReactApplicationContext().getSystemService(C0201.m82(27977));
        if (vibrator != null) {
            long[] jArr = new long[readableArray.size()];
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                jArr[i2] = (long) readableArray.getInt(i2);
            }
            vibrator.vibrate(jArr, i);
        }
    }
}
