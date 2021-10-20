package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.b;
import vigqyno.C0201;

/* compiled from: BaseViewManagerDelegate */
public abstract class a<T extends View, U extends b<T>> implements y0<T> {
    public final U a;

    public a(U u) {
        this.a = u;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.facebook.react.uimanager.y0
    public void a(T t, String str, Object obj) {
        char c;
        int i = 0;
        boolean z = false;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals(C0201.m82(23838))) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case -1721943861:
                if (str.equals(C0201.m82(23837))) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case -1267206133:
                if (str.equals(C0201.m82(23836))) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -1228066334:
                if (str.equals(C0201.m82(23835))) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals(C0201.m82(23834))) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals(C0201.m82(23833))) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case -877170387:
                if (str.equals(C0201.m82(23832))) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case -731417480:
                if (str.equals(C0201.m82(23831))) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case -101663499:
                if (str.equals(C0201.m82(23830))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -101359900:
                if (str.equals(C0201.m82(23829))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -80891667:
                if (str.equals(C0201.m82(23828))) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case -40300674:
                if (str.equals(C0201.m82(23827))) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case -4379043:
                if (str.equals(C0201.m82(23826))) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 36255470:
                if (str.equals(C0201.m82(23825))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 333432965:
                if (str.equals(C0201.m82(23824))) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 581268560:
                if (str.equals(C0201.m82(23823))) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 588239831:
                if (str.equals(C0201.m82(23822))) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 746986311:
                if (str.equals(C0201.m82(23821))) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 1052666732:
                if (str.equals(C0201.m82(23820))) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1146842694:
                if (str.equals(C0201.m82(23819))) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1153872867:
                if (str.equals(C0201.m82(23818))) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1287124693:
                if (str.equals(C0201.m82(23817))) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1349188574:
                if (str.equals(C0201.m82(23816))) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1505602511:
                if (str.equals(C0201.m82(23815))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2045685618:
                if (str.equals(C0201.m82(23814))) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        float f = 1.0f;
        float f2 = 0.0f;
        float f3 = Float.NaN;
        switch (c) {
            case 0:
                this.a.setAccessibilityActions(t, (ReadableArray) obj);
                return;
            case 1:
                this.a.setAccessibilityHint(t, (String) obj);
                return;
            case 2:
                this.a.setAccessibilityLabel(t, (String) obj);
                return;
            case 3:
                this.a.setAccessibilityLiveRegion(t, (String) obj);
                return;
            case 4:
                this.a.setAccessibilityRole(t, (String) obj);
                return;
            case 5:
                this.a.setViewState(t, (ReadableMap) obj);
                return;
            case 6:
                U u = this.a;
                if (obj != null) {
                    i = ColorPropConverter.getColor(obj, t.getContext()).intValue();
                }
                u.setBackgroundColor(t, i);
                return;
            case 7:
                U u2 = this.a;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u2.setBorderRadius(t, f3);
                return;
            case '\b':
                U u3 = this.a;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u3.setBorderBottomLeftRadius(t, f3);
                return;
            case '\t':
                U u4 = this.a;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u4.setBorderBottomRightRadius(t, f3);
                return;
            case '\n':
                U u5 = this.a;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u5.setBorderTopLeftRadius(t, f3);
                return;
            case 11:
                U u6 = this.a;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u6.setBorderTopRightRadius(t, f3);
                return;
            case '\f':
                U u7 = this.a;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u7.setElevation(t, f2);
                return;
            case '\r':
                this.a.setImportantForAccessibility(t, (String) obj);
                return;
            case 14:
                this.a.setNativeId(t, (String) obj);
                return;
            case 15:
                U u8 = this.a;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                u8.setOpacity(t, f);
                return;
            case 16:
                U u9 = this.a;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                u9.setRenderToHardwareTexture(t, z);
                return;
            case 17:
                U u10 = this.a;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u10.setRotation(t, f2);
                return;
            case 18:
                U u11 = this.a;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                u11.setScaleX(t, f);
                return;
            case 19:
                U u12 = this.a;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                u12.setScaleY(t, f);
                return;
            case 20:
                this.a.setTestId(t, (String) obj);
                return;
            case 21:
                this.a.setTransform(t, (ReadableArray) obj);
                return;
            case 22:
                U u13 = this.a;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u13.setTranslateX(t, f2);
                return;
            case 23:
                U u14 = this.a;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u14.setTranslateY(t, f2);
                return;
            case 24:
                U u15 = this.a;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u15.setZIndex(t, f2);
                return;
            default:
                return;
        }
    }
}
