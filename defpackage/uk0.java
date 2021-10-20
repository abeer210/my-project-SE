package defpackage;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;
import defpackage.vk0;
import vigqyno.C0201;

/* renamed from: uk0  reason: default package */
/* compiled from: AndroidDropdownPickerManagerDelegate */
public class uk0<T extends View, U extends b<T> & vk0<T>> extends a<T, U> {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: U extends com.facebook.react.uimanager.b<T> & vk0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public uk0(U u) {
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
                if (str.equals(C0201.m82(3136))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -979805852:
                if (str.equals(C0201.m82(3135))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 94842723:
                if (str.equals(C0201.m82(3134))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 100526016:
                if (str.equals(C0201.m82(3133))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1191572123:
                if (str.equals(C0201.m82(3132))) {
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
            ((vk0) this.a).setColor(t, obj == null ? null : Integer.valueOf(((Double) obj).intValue()));
        } else if (c == 1) {
            vk0 vk0 = (vk0) this.a;
            if (obj != null) {
                z = ((Boolean) obj).booleanValue();
            }
            vk0.setEnabled(t, z);
        } else if (c == 2) {
            ((vk0) this.a).setItems(t, (ReadableArray) obj);
        } else if (c == 3) {
            ((vk0) this.a).setPrompt(t, obj == null ? C0201.m82(3137) : (String) obj);
        } else if (c != 4) {
            super.a(t, str, obj);
        } else {
            vk0 vk02 = (vk0) this.a;
            if (obj != null) {
                i = ((Double) obj).intValue();
            }
            vk02.setSelected(t, i);
        }
    }
}
