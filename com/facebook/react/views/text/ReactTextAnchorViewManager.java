package com.facebook.react.views.text;

import android.text.TextUtils;
import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.text.h;
import com.facebook.yoga.g;
import vigqyno.C0188;
import vigqyno.C0201;

public abstract class ReactTextAnchorViewManager<T extends View, C extends h> extends BaseViewManager<T, C> {
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3};

    @xj0(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(r rVar, boolean z) {
        rVar.setAdjustFontSizeToFit(z);
    }

    @yj0(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor"})
    public void setBorderColor(r rVar, int i, Integer num) {
        float f = Float.NaN;
        float intValue = num == null ? Float.NaN : (float) (num.intValue() & 16777215);
        if (num != null) {
            f = (float) (num.intValue() >>> 24);
        }
        rVar.i(SPACING_TYPES[i], intValue, f);
    }

    @yj0(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(r rVar, int i, float f) {
        if (!g.a(f)) {
            f = q.c(f);
        }
        if (i == 0) {
            rVar.setBorderRadius(f);
        } else {
            rVar.j(f, i - 1);
        }
    }

    @xj0(name = "borderStyle")
    public void setBorderStyle(r rVar, String str) {
        rVar.setBorderStyle(str);
    }

    @yj0(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth"})
    public void setBorderWidth(r rVar, int i, float f) {
        if (!g.a(f)) {
            f = q.c(f);
        }
        rVar.k(SPACING_TYPES[i], f);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @xj0(name = "dataDetectorType")
    public void setDataDetectorType(r rVar, String str) {
        char c;
        switch (str.hashCode()) {
            case -1192969641:
                if (str.equals(C0201.m82(19939))) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 96673:
                if (str.equals(C0201.m82(19938))) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3321850:
                if (str.equals(C0201.m82(19937))) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3387192:
                if (str.equals(C0201.m82(19936))) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 96619420:
                if (str.equals(C0201.m82(19935))) {
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
            rVar.setLinkifyMask(4);
        } else if (c == 1) {
            rVar.setLinkifyMask(1);
        } else if (c == 2) {
            rVar.setLinkifyMask(2);
        } else if (c != 3) {
            rVar.setLinkifyMask(0);
        } else {
            rVar.setLinkifyMask(15);
        }
    }

    @xj0(defaultBoolean = false, name = "disabled")
    public void setDisabled(r rVar, boolean z) {
        rVar.setEnabled(!z);
    }

    @xj0(name = "ellipsizeMode")
    public void setEllipsizeMode(r rVar, String str) {
        if (str == null || str.equals(C0201.m82(19940))) {
            rVar.setEllipsizeLocation(TextUtils.TruncateAt.END);
        } else if (str.equals(C0201.m82(19941))) {
            rVar.setEllipsizeLocation(TextUtils.TruncateAt.START);
        } else if (str.equals(C0201.m82(19942))) {
            rVar.setEllipsizeLocation(TextUtils.TruncateAt.MIDDLE);
        } else if (str.equals(C0201.m82(19943))) {
            rVar.setEllipsizeLocation(null);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(19944) + str);
        }
    }

    @xj0(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(r rVar, boolean z) {
        rVar.setIncludeFontPadding(z);
    }

    @xj0(name = "onInlineViewLayout")
    public void setNotifyOnInlineViewLayout(r rVar, boolean z) {
        rVar.setNotifyOnInlineViewLayout(z);
    }

    @xj0(defaultInt = C0188.f24, name = "numberOfLines")
    public void setNumberOfLines(r rVar, int i) {
        rVar.setNumberOfLines(i);
    }

    @xj0(name = "selectable")
    public void setSelectable(r rVar, boolean z) {
        rVar.setTextIsSelectable(z);
    }

    @xj0(customType = "Color", name = "selectionColor")
    public void setSelectionColor(r rVar, Integer num) {
        if (num == null) {
            rVar.setHighlightColor(d.c(rVar.getContext()));
        } else {
            rVar.setHighlightColor(num.intValue());
        }
    }

    @xj0(name = "textAlignVertical")
    public void setTextAlignVertical(r rVar, String str) {
        if (str == null || C0201.m82(19945).equals(str)) {
            rVar.setGravityVertical(0);
        } else if (C0201.m82(19946).equals(str)) {
            rVar.setGravityVertical(48);
        } else if (C0201.m82(19947).equals(str)) {
            rVar.setGravityVertical(80);
        } else if (C0201.m82(19948).equals(str)) {
            rVar.setGravityVertical(16);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(19949) + str);
        }
    }
}
