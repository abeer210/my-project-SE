package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.e;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "ToastAndroid")
public class ToastModule extends NativeToastAndroidSpec {
    private static final String DURATION_LONG_KEY = null;
    private static final String DURATION_SHORT_KEY = null;
    private static final String GRAVITY_BOTTOM_KEY = null;
    private static final String GRAVITY_CENTER = null;
    private static final String GRAVITY_TOP_KEY = null;
    public static final String NAME = null;

    class a implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;

        public a(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public void run() {
            Toast.makeText(ToastModule.this.getReactApplicationContext(), this.a, this.b).show();
        }
    }

    class b implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public b(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public void run() {
            Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), this.a, this.b);
            makeText.setGravity(this.c, 0, 0);
            makeText.show();
        }
    }

    class c implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public c(String str, int i, int i2, int i3, int i4) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        public void run() {
            Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), this.a, this.b);
            makeText.setGravity(this.c, this.d, this.e);
            makeText.show();
        }
    }

    static {
        C0201.m83(ToastModule.class, 295);
    }

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(21418);
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap b2 = e.b();
        b2.put(C0201.m82(21419), 0);
        b2.put(C0201.m82(21420), 1);
        b2.put(C0201.m82(21421), 49);
        b2.put(C0201.m82(21422), 81);
        b2.put(C0201.m82(21423), 17);
        return b2;
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void show(String str, double d) {
        UiThreadUtil.runOnUiThread(new a(str, (int) d));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravity(String str, double d, double d2) {
        UiThreadUtil.runOnUiThread(new b(str, (int) d, (int) d2));
    }

    @Override // com.facebook.fbreact.specs.NativeToastAndroidSpec
    public void showWithGravityAndOffset(String str, double d, double d2, double d3, double d4) {
        UiThreadUtil.runOnUiThread(new c(str, (int) d, (int) d2, (int) d3, (int) d4));
    }
}
