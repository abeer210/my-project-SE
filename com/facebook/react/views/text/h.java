package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.b0;
import com.facebook.react.uimanager.g;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.n;
import com.facebook.react.uimanager.q;
import com.facebook.yoga.u;
import com.facebook.yoga.v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

@TargetApi(23)
/* compiled from: ReactBaseTextShadowNode */
public abstract class h extends i {
    public String A;
    public boolean B;
    public Map<Integer, a0> C;
    public s a;
    public y b;
    public boolean c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean u;
    public boolean v;
    public float w;
    public int x;
    public int y;
    public String z;

    /* access modifiers changed from: private */
    /* compiled from: ReactBaseTextShadowNode */
    public static class a {
        public int a;
        public int b;
        public l c;

        public a(int i, int i2, l lVar) {
            this.a = i;
            this.b = i2;
            this.c = lVar;
        }

        public void a(SpannableStringBuilder spannableStringBuilder, int i) {
            spannableStringBuilder.setSpan(this.c, this.a, this.b, ((i << 16) & 16711680) | ((this.a == 0 ? 18 : 34) & -16711681));
        }
    }

    public h() {
        this(null);
    }

    private static void b(h hVar, SpannableStringBuilder spannableStringBuilder, List<a> list, y yVar, boolean z2, Map<Integer, a0> map, int i2) {
        y yVar2;
        float f2;
        float f3;
        if (yVar != null) {
            yVar2 = yVar.a(hVar.b);
        } else {
            yVar2 = hVar.b;
        }
        int childCount = hVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            b0 childAt = hVar.getChildAt(i3);
            if (childAt instanceof k) {
                spannableStringBuilder.append((CharSequence) c0.b(((k) childAt).b(), yVar2.l()));
            } else if (childAt instanceof h) {
                b((h) childAt, spannableStringBuilder, list, yVar2, z2, map, spannableStringBuilder.length());
            } else {
                boolean z3 = childAt instanceof o;
                String r2 = C0201.m82(1097);
                if (z3) {
                    spannableStringBuilder.append((CharSequence) r2);
                    list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((o) childAt).b()));
                } else if (z2) {
                    int reactTag = childAt.getReactTag();
                    v styleWidth = childAt.getStyleWidth();
                    v styleHeight = childAt.getStyleHeight();
                    u uVar = styleWidth.b;
                    u uVar2 = u.POINT;
                    if (uVar == uVar2 && styleHeight.b == uVar2) {
                        f3 = styleWidth.a;
                        f2 = styleHeight.a;
                    } else {
                        childAt.calculateLayout();
                        f3 = childAt.getLayoutWidth();
                        f2 = childAt.getLayoutHeight();
                    }
                    spannableStringBuilder.append((CharSequence) r2);
                    list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new a0(reactTag, (int) f3, (int) f2)));
                    map.put(Integer.valueOf(reactTag), childAt);
                    childAt.markUpdateSeen();
                } else {
                    throw new g(C0201.m82(1098) + childAt.getClass());
                }
            }
            childAt.markUpdateSeen();
        }
        int length = spannableStringBuilder.length();
        if (length >= i2) {
            if (hVar.c) {
                list.add(new a(i2, length, new j(hVar.d)));
            }
            if (hVar.e) {
                list.add(new a(i2, length, new g(hVar.f)));
            }
            if (Build.VERSION.SDK_INT >= 21) {
                float d2 = yVar2.d();
                if (!Float.isNaN(d2) && (yVar == null || yVar.d() != d2)) {
                    list.add(new a(i2, length, new a(d2)));
                }
            }
            int c2 = yVar2.c();
            if (yVar == null || yVar.c() != c2) {
                list.add(new a(i2, length, new f(c2)));
            }
            if (!(hVar.x == -1 && hVar.y == -1 && hVar.z == null)) {
                list.add(new a(i2, length, new c(hVar.x, hVar.y, hVar.A, hVar.z, hVar.getThemedContext().getAssets())));
            }
            if (hVar.p) {
                list.add(new a(i2, length, new u()));
            }
            if (hVar.q) {
                list.add(new a(i2, length, new m()));
            }
            if (!((hVar.l == 0.0f && hVar.m == 0.0f && hVar.n == 0.0f) || Color.alpha(hVar.o) == 0)) {
                list.add(new a(i2, length, new w(hVar.l, hVar.m, hVar.n, hVar.o)));
            }
            float e2 = yVar2.e();
            if (!Float.isNaN(e2) && (yVar == null || yVar.e() != e2)) {
                list.add(new a(i2, length, new b(e2)));
            }
            list.add(new a(i2, length, new n(hVar.getReactTag())));
        }
    }

    public Spannable c(h hVar, String str, boolean z2, n nVar) {
        int i2;
        int i3 = 0;
        yh0.b(!z2 || nVar != null, C0201.m82(1099));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        HashMap hashMap = z2 ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) c0.b(str, hVar.b.l()));
        }
        b(hVar, spannableStringBuilder, arrayList, null, z2, hashMap, 0);
        hVar.B = false;
        hVar.C = hashMap;
        float f2 = Float.NaN;
        for (a aVar : arrayList) {
            l lVar = aVar.c;
            boolean z3 = lVar instanceof z;
            if (z3 || (lVar instanceof a0)) {
                if (z3) {
                    i2 = ((z) aVar.c).b();
                    hVar.B = true;
                } else {
                    a0 a0Var = (a0) aVar.c;
                    int a2 = a0Var.a();
                    a0 a0Var2 = hashMap.get(Integer.valueOf(a0Var.b()));
                    nVar.h(a0Var2);
                    a0Var2.setLayoutParent(hVar);
                    i2 = a2;
                }
                if (Float.isNaN(f2) || ((float) i2) > f2) {
                    f2 = (float) i2;
                }
            }
            aVar.a(spannableStringBuilder, i3);
            i3++;
        }
        hVar.b.o(f2);
        s sVar = this.a;
        if (sVar != null) {
            sVar.a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    @xj0(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z2) {
        if (z2 != this.v) {
            this.v = z2;
            markUpdated();
        }
    }

    @xj0(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z2) {
        if (z2 != this.b.b()) {
            this.b.m(z2);
            markUpdated();
        }
    }

    @xj0(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (isVirtual()) {
            boolean z2 = num != null;
            this.e = z2;
            if (z2) {
                this.f = num.intValue();
            }
            markUpdated();
        }
    }

    @xj0(customType = "Color", name = "color")
    public void setColor(Integer num) {
        boolean z2 = num != null;
        this.c = z2;
        if (z2) {
            this.d = num.intValue();
        }
        markUpdated();
    }

    @xj0(name = "fontFamily")
    public void setFontFamily(String str) {
        this.z = str;
        markUpdated();
    }

    @xj0(defaultFloat = Float.NaN, name = "fontSize")
    public void setFontSize(float f2) {
        this.b.n(f2);
        markUpdated();
    }

    @xj0(name = "fontStyle")
    public void setFontStyle(String str) {
        int b2 = t.b(str);
        if (b2 != this.x) {
            this.x = b2;
            markUpdated();
        }
    }

    @xj0(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String c2 = t.c(readableArray);
        if (!TextUtils.equals(c2, this.A)) {
            this.A = c2;
            markUpdated();
        }
    }

    @xj0(name = "fontWeight")
    public void setFontWeight(String str) {
        int d2 = t.d(str);
        if (d2 != this.y) {
            this.y = d2;
            markUpdated();
        }
    }

    @xj0(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z2) {
        this.u = z2;
    }

    @xj0(defaultFloat = Float.NaN, name = "letterSpacing")
    public void setLetterSpacing(float f2) {
        this.b.p(f2);
        markUpdated();
    }

    @xj0(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f2) {
        this.b.q(f2);
        markUpdated();
    }

    @xj0(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f2) {
        if (f2 != this.b.k()) {
            this.b.r(f2);
            markUpdated();
        }
    }

    @xj0(name = "minimumFontScale")
    public void setMinimumFontScale(float f2) {
        if (f2 != this.w) {
            this.w = f2;
            markUpdated();
        }
    }

    @xj0(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i2) {
        if (i2 == 0) {
            i2 = -1;
        }
        this.g = i2;
        markUpdated();
    }

    @xj0(name = "textAlign")
    public void setTextAlign(String str) {
        if (C0201.m82(1100).equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.k = 1;
            }
            this.h = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.k = 0;
            }
            if (str == null || C0201.m82(1101).equals(str)) {
                this.h = 0;
            } else if (C0201.m82(1102).equals(str)) {
                this.h = 3;
            } else if (C0201.m82(1103).equals(str)) {
                this.h = 5;
            } else if (C0201.m82(1104).equals(str)) {
                this.h = 1;
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(1105) + str);
            }
        }
        markUpdated();
    }

    @xj0(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (str == null || C0201.m82(1106).equals(str)) {
                this.i = 1;
            } else if (C0201.m82(1107).equals(str)) {
                this.i = 0;
            } else if (C0201.m82(1108).equals(str)) {
                this.i = 2;
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(1109) + str);
            }
            markUpdated();
        }
    }

    @xj0(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.p = false;
        this.q = false;
        if (str != null) {
            String[] split = str.split(C0201.m82(1110));
            for (String str2 : split) {
                if (C0201.m82(1111).equals(str2)) {
                    this.p = true;
                } else if (C0201.m82(1112).equals(str2)) {
                    this.q = true;
                }
            }
        }
        markUpdated();
    }

    @xj0(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i2) {
        if (i2 != this.o) {
            this.o = i2;
            markUpdated();
        }
    }

    @xj0(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.l = 0.0f;
        this.m = 0.0f;
        if (readableMap != null) {
            String r0 = C0201.m82(1113);
            if (readableMap.hasKey(r0) && !readableMap.isNull(r0)) {
                this.l = q.b(readableMap.getDouble(r0));
            }
            String r02 = C0201.m82(1114);
            if (readableMap.hasKey(r02) && !readableMap.isNull(r02)) {
                this.m = q.b(readableMap.getDouble(r02));
            }
        }
        markUpdated();
    }

    @xj0(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f2) {
        if (f2 != this.n) {
            this.n = f2;
            markUpdated();
        }
    }

    @xj0(name = "textTransform")
    public void setTextTransform(String str) {
        if (str == null) {
            this.b.s(c0.UNSET);
        } else if (C0201.m82(1115).equals(str)) {
            this.b.s(c0.NONE);
        } else if (C0201.m82(1116).equals(str)) {
            this.b.s(c0.UPPERCASE);
        } else if (C0201.m82(1117).equals(str)) {
            this.b.s(c0.LOWERCASE);
        } else if (C0201.m82(1118).equals(str)) {
            this.b.s(c0.CAPITALIZE);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(1119) + str);
        }
        markUpdated();
    }

    public h(s sVar) {
        this.c = false;
        this.e = false;
        this.g = -1;
        this.h = 0;
        this.i = Build.VERSION.SDK_INT < 23 ? 0 : 1;
        int i2 = Build.VERSION.SDK_INT;
        this.j = 0;
        int i3 = Build.VERSION.SDK_INT;
        this.k = 0;
        this.l = 0.0f;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 1426063360;
        this.p = false;
        this.q = false;
        this.u = true;
        this.v = false;
        this.w = 0.0f;
        this.x = -1;
        this.y = -1;
        this.z = null;
        this.A = null;
        this.B = false;
        this.b = new y();
        this.a = sVar;
    }
}
