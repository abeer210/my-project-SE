package defpackage;

import android.content.ActivityNotFoundException;
import android.os.Build;
import android.provider.Telephony;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* renamed from: j8  reason: default package */
/* compiled from: SMSShare */
public class j8 extends l8 {
    private ReactApplicationContext h = null;

    public j8(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.h = reactApplicationContext;
    }

    @Override // defpackage.k8
    public String c() {
        return null;
    }

    @Override // defpackage.k8
    public String i() {
        return Build.VERSION.SDK_INT >= 19 ? Telephony.Sms.getDefaultSmsPackage(this.h) : C0201.m82(20927);
    }

    @Override // defpackage.k8
    public String j() {
        return C0201.m82(20928);
    }

    @Override // defpackage.l8, defpackage.k8
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        super.m(readableMap);
        n();
    }
}
