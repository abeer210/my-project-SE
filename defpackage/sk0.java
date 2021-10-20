package defpackage;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;
import defpackage.tk0;
import vigqyno.C0201;

/* renamed from: sk0  reason: default package */
/* compiled from: AndroidDrawerLayoutManagerDelegate */
public class sk0<T extends View, U extends b<T> & tk0<T>> extends a<T, U> {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: U extends com.facebook.react.uimanager.b<T> & tk0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public sk0(U u) {
        super(u);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c;
        switch (str.hashCode()) {
            case -2082382380:
                if (str.equals(C0201.m82(18068))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1233873500:
                if (str.equals(C0201.m82(18067))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -764307226:
                if (str.equals(C0201.m82(18066))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 268251989:
                if (str.equals(C0201.m82(18065))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 695891258:
                if (str.equals(C0201.m82(18064))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1857208703:
                if (str.equals(C0201.m82(18063))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            ((tk0) this.a).setKeyboardDismissMode(t, (String) obj);
        } else if (c == 1) {
            ((tk0) this.a).setDrawerBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
        } else if (c == 2) {
            ((tk0) this.a).setDrawerPosition(t, (String) obj);
        } else if (c == 3) {
            ((tk0) this.a).setDrawerWidth(t, obj == null ? null : Float.valueOf(((Double) obj).floatValue()));
        } else if (c == 4) {
            ((tk0) this.a).setDrawerLockMode(t, (String) obj);
        } else if (c != 5) {
            super.a(t, str, obj);
        } else {
            ((tk0) this.a).setStatusBarBackgroundColor(t, ColorPropConverter.getColor(obj, t.getContext()));
        }
    }
}
