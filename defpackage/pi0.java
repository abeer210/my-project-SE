package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.e;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: pi0  reason: default package */
/* compiled from: ReactAndroidHWInputDeviceHelper */
public class pi0 {
    private static final Map<Integer, String> c;
    private int a = -1;
    private final zi0 b;

    static {
        e.b a2 = e.a();
        String r2 = C0201.m82(30376);
        a2.b(23, r2);
        a2.b(66, r2);
        a2.b(62, r2);
        a2.b(85, C0201.m82(30377));
        a2.b(89, C0201.m82(30378));
        a2.b(90, C0201.m82(30379));
        a2.b(19, C0201.m82(30380));
        a2.b(22, C0201.m82(30381));
        a2.b(20, C0201.m82(30382));
        a2.b(21, C0201.m82(30383));
        c = a2.a();
    }

    public pi0(zi0 zi0) {
        this.b = zi0;
    }

    private void b(String str, int i) {
        c(str, i, -1);
    }

    private void c(String str, int i, int i2) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(C0201.m82(30384), str);
        writableNativeMap.putInt(C0201.m82(30385), i2);
        if (i != -1) {
            writableNativeMap.putInt(C0201.m82(30386), i);
        }
        this.b.q(C0201.m82(30387), writableNativeMap);
    }

    public void a() {
        int i = this.a;
        if (i != -1) {
            b(C0201.m82(30388), i);
        }
        this.a = -1;
    }

    public void d(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        int action = keyEvent.getAction();
        if ((action == 1 || action == 0) && c.containsKey(Integer.valueOf(keyCode))) {
            c(c.get(Integer.valueOf(keyCode)), this.a, action);
        }
    }

    public void e(View view) {
        if (this.a != view.getId()) {
            int i = this.a;
            if (i != -1) {
                b(C0201.m82(30389), i);
            }
            this.a = view.getId();
            b(C0201.m82(30390), view.getId());
        }
    }
}
