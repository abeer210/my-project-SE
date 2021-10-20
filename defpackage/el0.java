package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;
import defpackage.fl0;
import vigqyno.C0201;

/* renamed from: el0  reason: default package */
/* compiled from: ModalHostViewManagerDelegate */
public class el0<T extends View, U extends b<T> & fl0<T>> extends a<T, U> {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: U extends com.facebook.react.uimanager.b<T> & fl0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public el0(U u) {
        super(u);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c;
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        switch (str.hashCode()) {
            case -1851617609:
                if (str.equals(C0201.m82(36057))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1850124175:
                if (str.equals(C0201.m82(36056))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1726194350:
                if (str.equals(C0201.m82(36055))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1618432855:
                if (str.equals(C0201.m82(36054))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1156137512:
                if (str.equals(C0201.m82(36053))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -795203165:
                if (str.equals(C0201.m82(36052))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1195991583:
                if (str.equals(C0201.m82(36051))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2031205598:
                if (str.equals(C0201.m82(36050))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                ((fl0) this.a).setAnimationType(t, (String) obj);
                return;
            case 1:
                ((fl0) this.a).setPresentationStyle(t, (String) obj);
                return;
            case 2:
                fl0 fl0 = (fl0) this.a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                fl0.setTransparent(t, z);
                return;
            case 3:
                fl0 fl02 = (fl0) this.a;
                if (obj != null) {
                    z4 = ((Boolean) obj).booleanValue();
                }
                fl02.setStatusBarTranslucent(t, z4);
                return;
            case 4:
                fl0 fl03 = (fl0) this.a;
                if (obj != null) {
                    z3 = ((Boolean) obj).booleanValue();
                }
                fl03.setHardwareAccelerated(t, z3);
                return;
            case 5:
                fl0 fl04 = (fl0) this.a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                fl04.setAnimated(t, z2);
                return;
            case 6:
                ((fl0) this.a).setSupportedOrientations(t, (ReadableArray) obj);
                return;
            case 7:
                fl0 fl05 = (fl0) this.a;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                fl05.setIdentifier(t, i);
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
