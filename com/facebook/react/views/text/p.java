package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.v0;
import com.facebook.yoga.g;
import com.facebook.yoga.h;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import java.util.ArrayList;
import java.util.Map;
import vigqyno.C0201;

@TargetApi(23)
/* compiled from: ReactTextShadowNode */
public class p extends h {
    private static final TextPaint G = new TextPaint(1);
    private Spannable D;
    private boolean E;
    private final m F;

    /* compiled from: ReactTextShadowNode */
    class a implements m {
        public a() {
        }

        @Override // com.facebook.yoga.m
        public long a(com.facebook.yoga.p pVar, float f, n nVar, float f2, n nVar2) {
            Spannable spannable = p.this.D;
            yh0.d(spannable, C0201.m82(19851));
            Spannable spannable2 = spannable;
            Layout j = p.this.j(spannable2, f, nVar);
            p pVar2 = p.this;
            int i = -1;
            if (pVar2.v) {
                int c = pVar2.b.c();
                int c2 = p.this.b.c();
                float f3 = (float) c;
                int max = (int) Math.max(p.this.w * f3, q.c(4.0f));
                while (c2 > max) {
                    if (p.this.g == i || j.getLineCount() <= p.this.g) {
                        if (nVar2 != n.UNDEFINED) {
                            if (((float) j.getHeight()) <= f2) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    c2 -= (int) q.c(1.0f);
                    float f4 = ((float) c2) / f3;
                    int i2 = 0;
                    f[] fVarArr = (f[]) spannable2.getSpans(0, spannable2.length(), f.class);
                    int length = fVarArr.length;
                    while (i2 < length) {
                        f fVar = fVarArr[i2];
                        spannable2.setSpan(new f((int) Math.max(((float) fVar.getSize()) * f4, (float) max)), spannable2.getSpanStart(fVar), spannable2.getSpanEnd(fVar), spannable2.getSpanFlags(fVar));
                        spannable2.removeSpan(fVar);
                        i2++;
                        f4 = f4;
                    }
                    j = p.this.j(spannable2, f, nVar);
                    i = -1;
                }
            }
            if (p.this.E) {
                k0 themedContext = p.this.getThemedContext();
                WritableArray a2 = e.a(spannable2, j, p.G, themedContext);
                WritableMap createMap = Arguments.createMap();
                createMap.putArray(C0201.m82(19852), a2);
                if (themedContext.hasActiveCatalystInstance()) {
                    ((RCTEventEmitter) themedContext.getJSModule(RCTEventEmitter.class)).receiveEvent(p.this.getReactTag(), C0201.m82(19853), createMap);
                } else {
                    ReactSoftException.logSoftException(C0201.m82(19855), new ReactNoCrashSoftException(C0201.m82(19854)));
                }
            }
            int i3 = p.this.g;
            if (i3 == -1 || i3 >= j.getLineCount()) {
                return o.b(j.getWidth(), j.getHeight());
            }
            return o.b(j.getWidth(), j.getLineBottom(p.this.g - 1));
        }
    }

    public p() {
        this(null);
    }

    private int h() {
        int i = this.h;
        if (getLayoutDirection() != h.RTL) {
            return i;
        }
        if (i == 5) {
            return 3;
        }
        if (i == 3) {
            return 5;
        }
        return i;
    }

    private void i() {
        if (!isVirtual()) {
            setMeasureFunction(this.F);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Layout j(Spannable spannable, float f, n nVar) {
        TextPaint textPaint = G;
        textPaint.setTextSize((float) this.b.c());
        BoringLayout.Metrics isBoring = BoringLayout.isBoring(spannable, textPaint);
        float desiredWidth = isBoring == null ? Layout.getDesiredWidth(spannable, textPaint) : Float.NaN;
        boolean z = nVar == n.UNDEFINED || f < 0.0f;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        int h = h();
        if (h == 1) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (h == 3) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (h == 5) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (isBoring == null && (z || (!g.a(desiredWidth) && desiredWidth <= f))) {
            int ceil = (int) Math.ceil((double) desiredWidth);
            if (Build.VERSION.SDK_INT < 23) {
                return new StaticLayout(spannable, textPaint, ceil, alignment, 1.0f, 0.0f, this.u);
            }
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, ceil).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(this.u).setBreakStrategy(this.i).setHyphenationFrequency(this.j);
            if (Build.VERSION.SDK_INT >= 26) {
                hyphenationFrequency.setJustificationMode(this.k);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency.build();
        } else if (isBoring != null && (z || ((float) isBoring.width) <= f)) {
            return BoringLayout.make(spannable, textPaint, isBoring.width, alignment, 1.0f, 0.0f, isBoring, this.u);
        } else {
            if (Build.VERSION.SDK_INT < 23) {
                return new StaticLayout(spannable, textPaint, (int) f, alignment, 1.0f, 0.0f, this.u);
            }
            StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(spannable, 0, spannable.length(), textPaint, (int) f).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(this.u).setBreakStrategy(this.i).setHyphenationFrequency(this.j);
            if (Build.VERSION.SDK_INT >= 28) {
                hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
            }
            return hyphenationFrequency2.build();
        }
    }

    @Override // com.facebook.react.uimanager.a0, com.facebook.react.uimanager.b0
    public Iterable<? extends a0> calculateLayoutOnChildren() {
        Map<Integer, a0> map = this.C;
        if (map == null || map.isEmpty()) {
            return null;
        }
        Spannable spannable = this.D;
        yh0.d(spannable, C0201.m82(37594));
        Spannable spannable2 = spannable;
        a0[] a0VarArr = (a0[]) spannable2.getSpans(0, spannable2.length(), a0.class);
        ArrayList arrayList = new ArrayList(a0VarArr.length);
        for (a0 a0Var : a0VarArr) {
            a0 a0Var2 = this.C.get(Integer.valueOf(a0Var.b()));
            a0Var2.calculateLayout();
            arrayList.add(a0Var2);
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.b0
    public boolean hoistNativeChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.b0
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.b0
    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    @Override // com.facebook.react.uimanager.a0, com.facebook.react.uimanager.b0
    public void onBeforeLayout(com.facebook.react.uimanager.n nVar) {
        this.D = c(this, null, true, nVar);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.b0
    public void onCollectExtraUpdates(v0 v0Var) {
        super.onCollectExtraUpdates(v0Var);
        Spannable spannable = this.D;
        if (spannable != null) {
            v0Var.R(getReactTag(), new q(spannable, -1, this.B, getPadding(4), getPadding(1), getPadding(5), getPadding(3), h(), this.i, this.k));
        }
    }

    @xj0(name = "onTextLayout")
    public void setShouldNotifyOnTextLayout(boolean z) {
        this.E = z;
    }

    public p(s sVar) {
        super(sVar);
        this.F = new a();
        i();
    }
}
