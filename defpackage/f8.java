package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* renamed from: f8  reason: default package */
/* compiled from: InstagramStoriesShare */
public class f8 extends l8 {
    public f8(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        o(new Intent(C0201.m82(10995)));
    }

    @Override // defpackage.k8
    public String c() {
        return null;
    }

    @Override // defpackage.k8
    public String i() {
        return C0201.m82(10996);
    }

    @Override // defpackage.k8
    public String j() {
        return C0201.m82(10997);
    }

    @Override // defpackage.l8, defpackage.k8
    public void m(ReadableMap readableMap) throws ActivityNotFoundException {
        super.m(readableMap);
        q(readableMap);
    }
}
