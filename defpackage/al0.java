package defpackage;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;
import defpackage.bl0;
import vigqyno.C0201;

/* renamed from: al0  reason: default package */
/* compiled from: AndroidSwitchManagerDelegate */
public class al0<T extends View, U extends b<T> & bl0<T>> extends a<T, U> {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: U extends com.facebook.react.uimanager.b<T> & bl0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public al0(U u) {
        super(u);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c;
        boolean z = true;
        boolean z2 = false;
        switch (str.hashCode()) {
            case -1742453971:
                if (str.equals(C0201.m82(26790))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1609594047:
                if (str.equals(C0201.m82(26789))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -287374307:
                if (str.equals(C0201.m82(26788))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 3551:
                if (str.equals(C0201.m82(26787))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 111972721:
                if (str.equals(C0201.m82(26786))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 270940796:
                if (str.equals(C0201.m82(26785))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1084662482:
                if (str.equals(C0201.m82(26784))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1912319986:
                if (str.equals(C0201.m82(26783))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2113632767:
                if (str.equals(C0201.m82(26782))) {
                    c = 4;
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
                bl0 bl0 = (bl0) this.a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                bl0.setDisabled(t, z2);
                return;
            case 1:
                bl0 bl02 = (bl0) this.a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                bl02.setEnabled(t, z);
                return;
            case 2:
                ((bl0) this.a).setThumbColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 3:
                ((bl0) this.a).setTrackColorForFalse(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 4:
                ((bl0) this.a).setTrackColorForTrue(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 5:
                bl0 bl03 = (bl0) this.a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                bl03.setValue(t, z2);
                return;
            case 6:
                bl0 bl04 = (bl0) this.a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                bl04.setOn(t, z2);
                return;
            case 7:
                ((bl0) this.a).setThumbTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '\b':
                ((bl0) this.a).setTrackTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
