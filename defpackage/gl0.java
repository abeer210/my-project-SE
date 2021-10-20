package defpackage;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.a;
import com.facebook.react.uimanager.b;
import defpackage.hl0;
import vigqyno.C0201;

/* renamed from: gl0  reason: default package */
/* compiled from: SliderManagerDelegate */
public class gl0<T extends View, U extends b<T> & hl0<T>> extends a<T, U> {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: U extends com.facebook.react.uimanager.b<T> & hl0<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public gl0(U u) {
        super(u);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.a, com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c;
        boolean z = false;
        boolean z2 = true;
        switch (str.hashCode()) {
            case -1900655011:
                if (str.equals(C0201.m82(22248))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1736983259:
                if (str.equals(C0201.m82(22247))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1609594047:
                if (str.equals(C0201.m82(22246))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1021497397:
                if (str.equals(C0201.m82(22245))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -981448432:
                if (str.equals(C0201.m82(22244))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -877170387:
                if (str.equals(C0201.m82(22243))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 3540684:
                if (str.equals(C0201.m82(22242))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 111972721:
                if (str.equals(C0201.m82(22241))) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 270940796:
                if (str.equals(C0201.m82(22240))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 718061361:
                if (str.equals(C0201.m82(22239))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1139400400:
                if (str.equals(C0201.m82(22238))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 1192487427:
                if (str.equals(C0201.m82(22237))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1333596542:
                if (str.equals(C0201.m82(22236))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1912319986:
                if (str.equals(C0201.m82(22235))) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        double d = 0.0d;
        switch (c) {
            case 0:
                hl0 hl0 = (hl0) this.a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                hl0.setDisabled(t, z);
                return;
            case 1:
                hl0 hl02 = (hl0) this.a;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                hl02.setEnabled(t, z2);
                return;
            case 2:
                ((hl0) this.a).setMaximumTrackImage(t, (ReadableMap) obj);
                return;
            case 3:
                ((hl0) this.a).setMaximumTrackTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 4:
                ((hl0) this.a).setMaximumValue(t, obj == null ? 1.0d : ((Double) obj).doubleValue());
                return;
            case 5:
                ((hl0) this.a).setMinimumTrackImage(t, (ReadableMap) obj);
                return;
            case 6:
                ((hl0) this.a).setMinimumTrackTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 7:
                hl0 hl03 = (hl0) this.a;
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                hl03.setMinimumValue(t, d);
                return;
            case '\b':
                hl0 hl04 = (hl0) this.a;
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                hl04.setStep(t, d);
                return;
            case '\t':
                ((hl0) this.a).setTestID(t, obj == null ? C0201.m82(22249) : (String) obj);
                return;
            case '\n':
                ((hl0) this.a).setThumbImage(t, (ReadableMap) obj);
                return;
            case 11:
                ((hl0) this.a).setThumbTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '\f':
                ((hl0) this.a).setTrackImage(t, (ReadableMap) obj);
                return;
            case '\r':
                hl0 hl05 = (hl0) this.a;
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                hl05.setValue(t, d);
                return;
            default:
                super.a(t, str, obj);
                return;
        }
    }
}
