package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableType;
import com.facebook.yoga.k;
import com.facebook.yoga.l;
import com.facebook.yoga.s;
import com.facebook.yoga.t;
import com.facebook.yoga.u;
import com.facebook.yoga.w;
import vigqyno.C0201;

/* compiled from: LayoutShadowNode */
public class i extends b0 {
    public boolean mCollapsable;
    private final b mTempYogaValue = new b(null);

    /* compiled from: LayoutShadowNode */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[u.values().length];
            a = iArr;
            iArr[u.POINT.ordinal()] = 1;
            a[u.UNDEFINED.ordinal()] = 2;
            a[u.AUTO.ordinal()] = 3;
            try {
                a[u.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: LayoutShadowNode */
    private static class b {
        public float a;
        public u b;

        public /* synthetic */ b(a aVar) {
            this();
        }

        public void a(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.b = u.UNDEFINED;
                this.a = Float.NaN;
            } else if (dynamic.getType() == ReadableType.String) {
                String asString = dynamic.asString();
                if (asString.equals(C0201.m82(20819))) {
                    this.b = u.AUTO;
                    this.a = Float.NaN;
                } else if (asString.endsWith(C0201.m82(20820))) {
                    this.b = u.PERCENT;
                    this.a = Float.parseFloat(asString.substring(0, asString.length() - 1));
                } else {
                    throw new IllegalArgumentException(C0201.m82(20821) + asString);
                }
            } else {
                this.b = u.POINT;
                this.a = q.b(dynamic.asDouble());
            }
        }

        private b() {
        }
    }

    private int maybeTransformLeftRightToStartEnd(int i) {
        if (!com.facebook.react.modules.i18nmanager.a.d().b(getThemedContext())) {
            return i;
        }
        if (i == 0) {
            return 4;
        }
        if (i != 2) {
            return i;
        }
        return 5;
    }

    @xj0(name = "alignContent")
    public void setAlignContent(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setAlignContent(com.facebook.yoga.a.FLEX_START);
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals(C0201.m82(23041))) {
                        c = 4;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals(C0201.m82(23040))) {
                        c = 5;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals(C0201.m82(23039))) {
                        c = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals(C0201.m82(23038))) {
                        c = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals(C0201.m82(23037))) {
                        c = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals(C0201.m82(23036))) {
                        c = 6;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals(C0201.m82(23035))) {
                        c = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals(C0201.m82(23034))) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    setAlignContent(com.facebook.yoga.a.AUTO);
                    return;
                case 1:
                    setAlignContent(com.facebook.yoga.a.FLEX_START);
                    return;
                case 2:
                    setAlignContent(com.facebook.yoga.a.CENTER);
                    return;
                case 3:
                    setAlignContent(com.facebook.yoga.a.FLEX_END);
                    return;
                case 4:
                    setAlignContent(com.facebook.yoga.a.STRETCH);
                    return;
                case 5:
                    setAlignContent(com.facebook.yoga.a.BASELINE);
                    return;
                case 6:
                    setAlignContent(com.facebook.yoga.a.SPACE_BETWEEN);
                    return;
                case 7:
                    setAlignContent(com.facebook.yoga.a.SPACE_AROUND);
                    return;
                default:
                    throw new JSApplicationIllegalArgumentException(C0201.m82(23042) + str);
            }
        }
    }

    @xj0(name = "alignItems")
    public void setAlignItems(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setAlignItems(com.facebook.yoga.a.STRETCH);
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals(C0201.m82(23050))) {
                        c = 4;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals(C0201.m82(23049))) {
                        c = 5;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals(C0201.m82(23048))) {
                        c = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals(C0201.m82(23047))) {
                        c = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals(C0201.m82(23046))) {
                        c = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals(C0201.m82(23045))) {
                        c = 6;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals(C0201.m82(23044))) {
                        c = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals(C0201.m82(23043))) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    setAlignItems(com.facebook.yoga.a.AUTO);
                    return;
                case 1:
                    setAlignItems(com.facebook.yoga.a.FLEX_START);
                    return;
                case 2:
                    setAlignItems(com.facebook.yoga.a.CENTER);
                    return;
                case 3:
                    setAlignItems(com.facebook.yoga.a.FLEX_END);
                    return;
                case 4:
                    setAlignItems(com.facebook.yoga.a.STRETCH);
                    return;
                case 5:
                    setAlignItems(com.facebook.yoga.a.BASELINE);
                    return;
                case 6:
                    setAlignItems(com.facebook.yoga.a.SPACE_BETWEEN);
                    return;
                case 7:
                    setAlignItems(com.facebook.yoga.a.SPACE_AROUND);
                    return;
                default:
                    throw new JSApplicationIllegalArgumentException(C0201.m82(23051) + str);
            }
        }
    }

    @xj0(name = "alignSelf")
    public void setAlignSelf(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setAlignSelf(com.facebook.yoga.a.AUTO);
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals(C0201.m82(23059))) {
                        c = 4;
                        break;
                    }
                    break;
                case -1720785339:
                    if (str.equals(C0201.m82(23058))) {
                        c = 5;
                        break;
                    }
                    break;
                case -1364013995:
                    if (str.equals(C0201.m82(23057))) {
                        c = 2;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals(C0201.m82(23056))) {
                        c = 1;
                        break;
                    }
                    break;
                case 3005871:
                    if (str.equals(C0201.m82(23055))) {
                        c = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals(C0201.m82(23054))) {
                        c = 6;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals(C0201.m82(23053))) {
                        c = 3;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals(C0201.m82(23052))) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    setAlignSelf(com.facebook.yoga.a.AUTO);
                    return;
                case 1:
                    setAlignSelf(com.facebook.yoga.a.FLEX_START);
                    return;
                case 2:
                    setAlignSelf(com.facebook.yoga.a.CENTER);
                    return;
                case 3:
                    setAlignSelf(com.facebook.yoga.a.FLEX_END);
                    return;
                case 4:
                    setAlignSelf(com.facebook.yoga.a.STRETCH);
                    return;
                case 5:
                    setAlignSelf(com.facebook.yoga.a.BASELINE);
                    return;
                case 6:
                    setAlignSelf(com.facebook.yoga.a.SPACE_BETWEEN);
                    return;
                case 7:
                    setAlignSelf(com.facebook.yoga.a.SPACE_AROUND);
                    return;
                default:
                    throw new JSApplicationIllegalArgumentException(C0201.m82(23060) + str);
            }
        }
    }

    @xj0(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f) {
        setStyleAspectRatio(f);
    }

    @yj0(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i, float f) {
        if (!isVirtual()) {
            setBorder(maybeTransformLeftRightToStartEnd(c1.a[i]), q.c(f));
        }
    }

    @xj0(name = "collapsable")
    public void setCollapsable(boolean z) {
        this.mCollapsable = z;
    }

    @xj0(name = "display")
    public void setDisplay(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setDisplay(com.facebook.yoga.i.FLEX);
                return;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3145721) {
                if (hashCode == 3387192 && str.equals(C0201.m82(23061))) {
                    c = 1;
                }
            } else if (str.equals(C0201.m82(23062))) {
                c = 0;
            }
            if (c == 0) {
                setDisplay(com.facebook.yoga.i.FLEX);
            } else if (c == 1) {
                setDisplay(com.facebook.yoga.i.NONE);
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(23063) + str);
            }
        }
    }

    @Override // com.facebook.react.uimanager.b0
    @xj0(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f) {
        if (!isVirtual()) {
            super.setFlex(f);
        }
    }

    @xj0(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i = a.a[this.mTempYogaValue.b.ordinal()];
            if (i == 1 || i == 2) {
                setFlexBasis(this.mTempYogaValue.a);
            } else if (i == 3) {
                setFlexBasisAuto();
            } else if (i == 4) {
                setFlexBasisPercent(this.mTempYogaValue.a);
            }
            dynamic.recycle();
        }
    }

    @xj0(name = "flexDirection")
    public void setFlexDirection(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setFlexDirection(k.COLUMN);
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1448970769:
                    if (str.equals(C0201.m82(23067))) {
                        c = 3;
                        break;
                    }
                    break;
                case -1354837162:
                    if (str.equals(C0201.m82(23066))) {
                        c = 0;
                        break;
                    }
                    break;
                case 113114:
                    if (str.equals(C0201.m82(23065))) {
                        c = 2;
                        break;
                    }
                    break;
                case 1272730475:
                    if (str.equals(C0201.m82(23064))) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                setFlexDirection(k.COLUMN);
            } else if (c == 1) {
                setFlexDirection(k.COLUMN_REVERSE);
            } else if (c == 2) {
                setFlexDirection(k.ROW);
            } else if (c == 3) {
                setFlexDirection(k.ROW_REVERSE);
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(23068) + str);
            }
        }
    }

    @Override // com.facebook.react.uimanager.b0
    @xj0(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f) {
        if (!isVirtual()) {
            super.setFlexGrow(f);
        }
    }

    @Override // com.facebook.react.uimanager.b0
    @xj0(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f) {
        if (!isVirtual()) {
            super.setFlexShrink(f);
        }
    }

    @xj0(name = "flexWrap")
    public void setFlexWrap(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setFlexWrap(w.NO_WRAP);
                return;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1039592053) {
                if (hashCode != -749527969) {
                    if (hashCode == 3657802 && str.equals(C0201.m82(23069))) {
                        c = 1;
                    }
                } else if (str.equals(C0201.m82(23070))) {
                    c = 2;
                }
            } else if (str.equals(C0201.m82(23071))) {
                c = 0;
            }
            if (c == 0) {
                setFlexWrap(w.NO_WRAP);
            } else if (c == 1) {
                setFlexWrap(w.WRAP);
            } else if (c == 2) {
                setFlexWrap(w.WRAP_REVERSE);
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(23072) + str);
            }
        }
    }

    @xj0(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i = a.a[this.mTempYogaValue.b.ordinal()];
            if (i == 1 || i == 2) {
                setStyleHeight(this.mTempYogaValue.a);
            } else if (i == 3) {
                setStyleHeightAuto();
            } else if (i == 4) {
                setStyleHeightPercent(this.mTempYogaValue.a);
            }
            dynamic.recycle();
        }
    }

    @xj0(name = "justifyContent")
    public void setJustifyContent(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setJustifyContent(l.FLEX_START);
                return;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals(C0201.m82(23078))) {
                        c = 1;
                        break;
                    }
                    break;
                case -46581362:
                    if (str.equals(C0201.m82(23077))) {
                        c = 0;
                        break;
                    }
                    break;
                case 441309761:
                    if (str.equals(C0201.m82(23076))) {
                        c = 3;
                        break;
                    }
                    break;
                case 1742952711:
                    if (str.equals(C0201.m82(23075))) {
                        c = 2;
                        break;
                    }
                    break;
                case 1937124468:
                    if (str.equals(C0201.m82(23074))) {
                        c = 4;
                        break;
                    }
                    break;
                case 2055030478:
                    if (str.equals(C0201.m82(23073))) {
                        c = 5;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                setJustifyContent(l.FLEX_START);
            } else if (c == 1) {
                setJustifyContent(l.CENTER);
            } else if (c == 2) {
                setJustifyContent(l.FLEX_END);
            } else if (c == 3) {
                setJustifyContent(l.SPACE_BETWEEN);
            } else if (c == 4) {
                setJustifyContent(l.SPACE_AROUND);
            } else if (c == 5) {
                setJustifyContent(l.SPACE_EVENLY);
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(23079) + str);
            }
        }
    }

    @yj0(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i, Dynamic dynamic) {
        if (!isVirtual()) {
            int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(c1.b[i]);
            this.mTempYogaValue.a(dynamic);
            int i2 = a.a[this.mTempYogaValue.b.ordinal()];
            if (i2 == 1 || i2 == 2) {
                setMargin(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.a);
            } else if (i2 == 3) {
                setMarginAuto(maybeTransformLeftRightToStartEnd);
            } else if (i2 == 4) {
                setMarginPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.a);
            }
            dynamic.recycle();
        }
    }

    @xj0(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i = a.a[this.mTempYogaValue.b.ordinal()];
            if (i == 1 || i == 2) {
                setStyleMaxHeight(this.mTempYogaValue.a);
            } else if (i == 4) {
                setStyleMaxHeightPercent(this.mTempYogaValue.a);
            }
            dynamic.recycle();
        }
    }

    @xj0(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i = a.a[this.mTempYogaValue.b.ordinal()];
            if (i == 1 || i == 2) {
                setStyleMaxWidth(this.mTempYogaValue.a);
            } else if (i == 4) {
                setStyleMaxWidthPercent(this.mTempYogaValue.a);
            }
            dynamic.recycle();
        }
    }

    @xj0(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i = a.a[this.mTempYogaValue.b.ordinal()];
            if (i == 1 || i == 2) {
                setStyleMinHeight(this.mTempYogaValue.a);
            } else if (i == 4) {
                setStyleMinHeightPercent(this.mTempYogaValue.a);
            }
            dynamic.recycle();
        }
    }

    @xj0(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i = a.a[this.mTempYogaValue.b.ordinal()];
            if (i == 1 || i == 2) {
                setStyleMinWidth(this.mTempYogaValue.a);
            } else if (i == 4) {
                setStyleMinWidthPercent(this.mTempYogaValue.a);
            }
            dynamic.recycle();
        }
    }

    @xj0(name = "overflow")
    public void setOverflow(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setOverflow(s.VISIBLE);
                return;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1217487446) {
                if (hashCode != -907680051) {
                    if (hashCode == 466743410 && str.equals(C0201.m82(23080))) {
                        c = 0;
                    }
                } else if (str.equals(C0201.m82(23081))) {
                    c = 2;
                }
            } else if (str.equals(C0201.m82(23082))) {
                c = 1;
            }
            if (c == 0) {
                setOverflow(s.VISIBLE);
            } else if (c == 1) {
                setOverflow(s.HIDDEN);
            } else if (c == 2) {
                setOverflow(s.SCROLL);
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(23083) + str);
            }
        }
    }

    @yj0(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i, Dynamic dynamic) {
        if (!isVirtual()) {
            int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(c1.b[i]);
            this.mTempYogaValue.a(dynamic);
            int i2 = a.a[this.mTempYogaValue.b.ordinal()];
            if (i2 == 1 || i2 == 2) {
                setPadding(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.a);
            } else if (i2 == 4) {
                setPaddingPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.a);
            }
            dynamic.recycle();
        }
    }

    @xj0(name = "position")
    public void setPosition(String str) {
        if (!isVirtual()) {
            if (str == null) {
                setPositionType(t.RELATIVE);
                return;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -554435892) {
                if (hashCode == 1728122231 && str.equals(C0201.m82(23084))) {
                    c = 1;
                }
            } else if (str.equals(C0201.m82(23085))) {
                c = 0;
            }
            if (c == 0) {
                setPositionType(t.RELATIVE);
            } else if (c == 1) {
                setPositionType(t.ABSOLUTE);
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(23086) + str);
            }
        }
    }

    @yj0(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i, Dynamic dynamic) {
        if (!isVirtual()) {
            int maybeTransformLeftRightToStartEnd = maybeTransformLeftRightToStartEnd(new int[]{4, 5, 0, 2, 1, 3}[i]);
            this.mTempYogaValue.a(dynamic);
            int i2 = a.a[this.mTempYogaValue.b.ordinal()];
            if (i2 == 1 || i2 == 2) {
                setPosition(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.a);
            } else if (i2 == 4) {
                setPositionPercent(maybeTransformLeftRightToStartEnd, this.mTempYogaValue.a);
            }
            dynamic.recycle();
        }
    }

    @Override // com.facebook.react.uimanager.b0
    @xj0(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z) {
        super.setShouldNotifyOnLayout(z);
    }

    @xj0(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (!isVirtual()) {
            this.mTempYogaValue.a(dynamic);
            int i = a.a[this.mTempYogaValue.b.ordinal()];
            if (i == 1 || i == 2) {
                setStyleWidth(this.mTempYogaValue.a);
            } else if (i == 3) {
                setStyleWidthAuto();
            } else if (i == 4) {
                setStyleWidthPercent(this.mTempYogaValue.a);
            }
            dynamic.recycle();
        }
    }
}
