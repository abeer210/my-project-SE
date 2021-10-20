package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;
import defpackage.rk0;
import vigqyno.C0201;

/* renamed from: qk0  reason: default package */
/* compiled from: AndroidDialogPickerManagerDelegate */
public class qk0<T extends View, U extends b<T> & rk0<T>> extends a<T, U> {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: U extends com.facebook.react.uimanager.b<T> & rk0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public qk0(U u) {
        super(u);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c;
        int i = 0;
        boolean z = true;
        switch (str.hashCode()) {
            case -1609594047:
                if (str.equals(C0201.m82(27733))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -979805852:
                if (str.equals(C0201.m82(27732))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 94842723:
                if (str.equals(C0201.m82(27731))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 100526016:
                if (str.equals(C0201.m82(27730))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1191572123:
                if (str.equals(C0201.m82(27729))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1287124693:
                if (str.equals(C0201.m82(27728))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        Integer num = null;
        if (c == 0) {
            rk0 rk0 = (rk0) this.a;
            if (obj != null) {
                num = Integer.valueOf(((Double) obj).intValue());
            }
            rk0.setColor(t, num);
        } else if (c == 1) {
            rk0 rk02 = (rk0) this.a;
            if (obj != null) {
                num = Integer.valueOf(((Double) obj).intValue());
            }
            rk02.setBackgroundColor(t, num);
        } else if (c == 2) {
            rk0 rk03 = (rk0) this.a;
            if (obj != null) {
                z = ((Boolean) obj).booleanValue();
            }
            rk03.setEnabled(t, z);
        } else if (c == 3) {
            ((rk0) this.a).setItems(t, (ReadableArray) obj);
        } else if (c == 4) {
            ((rk0) this.a).setPrompt(t, obj == null ? C0201.m82(27734) : (String) obj);
        } else if (c != 5) {
            super.a(t, str, obj);
        } else {
            rk0 rk04 = (rk0) this.a;
            if (obj != null) {
                i = ((Double) obj).intValue();
            }
            rk04.setSelected(t, i);
        }
    }
}
