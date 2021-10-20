package defpackage;

import android.view.View;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;
import defpackage.dl0;
import vigqyno.C0201;

/* renamed from: cl0  reason: default package */
/* compiled from: AndroidViewPagerManagerDelegate */
public class cl0<T extends View, U extends b<T> & dl0<T>> extends a<T, U> {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: U extends com.facebook.react.uimanager.b<T> & dl0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public cl0(U u) {
        super(u);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        switch (str.hashCode()) {
            case -1151046732:
                if (str.equals(C0201.m82(11630))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -764307226:
                if (str.equals(C0201.m82(11629))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1097821469:
                if (str.equals(C0201.m82(11628))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1233251315:
                if (str.equals(C0201.m82(11627))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1919780198:
                if (str.equals(C0201.m82(11626))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            dl0 dl0 = (dl0) this.a;
            if (obj != null) {
                i = ((Double) obj).intValue();
            }
            dl0.setInitialPage(t, i);
        } else if (c == 1) {
            dl0 dl02 = (dl0) this.a;
            if (obj != null) {
                i2 = ((Double) obj).intValue();
            }
            dl02.setPageMargin(t, i2);
        } else if (c == 2) {
            dl0 dl03 = (dl0) this.a;
            if (obj != null) {
                z2 = ((Boolean) obj).booleanValue();
            }
            dl03.setPeekEnabled(t, z2);
        } else if (c == 3) {
            ((dl0) this.a).setKeyboardDismissMode(t, (String) obj);
        } else if (c != 4) {
            super.a(t, str, obj);
        } else {
            dl0 dl04 = (dl0) this.a;
            if (obj != null) {
                z = ((Boolean) obj).booleanValue();
            }
            dl04.setScrollEnabled(t, z);
        }
    }
}
