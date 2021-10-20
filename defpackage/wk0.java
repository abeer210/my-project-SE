package defpackage;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;
import defpackage.xk0;
import vigqyno.C0201;

/* renamed from: wk0  reason: default package */
/* compiled from: AndroidProgressBarManagerDelegate */
public class wk0<T extends View, U extends b<T> & xk0<T>> extends a<T, U> {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: U extends com.facebook.react.uimanager.b<T> & xk0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public wk0(U u) {
        super(u);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c;
        boolean z = false;
        boolean z2 = true;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals(C0201.m82(29060))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -877170387:
                if (str.equals(C0201.m82(29059))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -676876213:
                if (str.equals(C0201.m82(29058))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 94842723:
                if (str.equals(C0201.m82(29057))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 633138363:
                if (str.equals(C0201.m82(29056))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1118509918:
                if (str.equals(C0201.m82(29055))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1804741442:
                if (str.equals(C0201.m82(29054))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str2 = null;
        switch (c) {
            case 0:
                xk0 xk0 = (xk0) this.a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                xk0.setStyleAttr(t, str2);
                return;
            case 1:
                xk0 xk02 = (xk0) this.a;
                if (obj != null) {
                    str2 = (String) obj;
                }
                xk02.setTypeAttr(t, str2);
                return;
            case 2:
                xk0 xk03 = (xk0) this.a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                xk03.setIndeterminate(t, z);
                return;
            case 3:
                ((xk0) this.a).setProgress(t, obj == null ? 0.0d : ((Double) obj).doubleValue());
                return;
            case 4:
                xk0 xk04 = (xk0) this.a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                xk04.setAnimating(t, z2);
                return;
            case 5:
                ((xk0) this.a).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 6:
                ((xk0) this.a).setTestID(t, obj == null ? C0201.m82(29061) : (String) obj);
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
