package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.u0;
import androidx.appcompat.widget.z;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.v;
import com.facebook.react.views.view.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: ReactTextView */
public class r extends z implements v {
    private static final ViewGroup.LayoutParams p = new ViewGroup.LayoutParams(0, 0);
    private boolean e;
    private int f = (getGravity() & 8388615);
    private int g = (getGravity() & 112);
    private int h = 0;
    private int i = C0188.f24;
    private TextUtils.TruncateAt j = TextUtils.TruncateAt.END;
    private boolean k = false;
    private int l = 0;
    private boolean m;
    private e n = new e(this);
    private Spannable o;

    /* compiled from: ReactTextView */
    class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            String r0 = C0201.m82(33475);
            return ((WritableMap) obj).getInt(r0) - ((WritableMap) obj2).getInt(r0);
        }
    }

    public r(Context context) {
        super(context);
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (context instanceof u0) {
            context = ((u0) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    private static WritableMap h(int i2, int i3, int i4, int i5, int i6, int i7) {
        WritableMap createMap = Arguments.createMap();
        String r1 = C0201.m82(37669);
        String r2 = C0201.m82(37670);
        if (i2 == 8) {
            createMap.putString(r2, C0201.m82(37671));
            createMap.putInt(r1, i3);
        } else if (i2 == 0) {
            createMap.putString(r2, C0201.m82(37672));
            createMap.putInt(r1, i3);
            createMap.putDouble(C0201.m82(37673), (double) q.a((float) i4));
            createMap.putDouble(C0201.m82(37674), (double) q.a((float) i5));
            createMap.putDouble(C0201.m82(37675), (double) q.a((float) i6));
            createMap.putDouble(C0201.m82(37676), (double) q.a((float) i7));
        } else {
            createMap.putString(r2, C0201.m82(37677));
            createMap.putInt(r1, i3);
        }
        return createMap;
    }

    @Override // com.facebook.react.uimanager.v
    public int b(float f2, float f3) {
        int i2;
        CharSequence text = getText();
        int id = getId();
        int i3 = (int) f2;
        int i4 = (int) f3;
        Layout layout = getLayout();
        if (layout == null) {
            return id;
        }
        int lineForVertical = layout.getLineForVertical(i4);
        int lineLeft = (int) layout.getLineLeft(lineForVertical);
        int lineRight = (int) layout.getLineRight(lineForVertical);
        if ((text instanceof Spanned) && i3 >= lineLeft && i3 <= lineRight) {
            Spanned spanned = (Spanned) text;
            try {
                int offsetForHorizontal = layout.getOffsetForHorizontal(lineForVertical, (float) i3);
                n[] nVarArr = (n[]) spanned.getSpans(offsetForHorizontal, offsetForHorizontal, n.class);
                if (nVarArr != null) {
                    int length = text.length();
                    for (int i5 = 0; i5 < nVarArr.length; i5++) {
                        int spanStart = spanned.getSpanStart(nVarArr[i5]);
                        int spanEnd = spanned.getSpanEnd(nVarArr[i5]);
                        if (spanEnd > offsetForHorizontal && (i2 = spanEnd - spanStart) <= length) {
                            id = nVarArr[i5].a();
                            length = i2;
                        }
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e2) {
                f60.i(C0201.m82(37679), C0201.m82(37678) + e2.getMessage());
            }
        }
        return id;
    }

    public Spannable getSpanned() {
        return this.o;
    }

    public boolean hasOverlappingRendering() {
        return false;
    }

    public void i(int i2, float f2, float f3) {
        this.n.c(i2, f2, f3);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (z zVar : (z[]) spanned.getSpans(0, spanned.length(), z.class)) {
                if (zVar.a() == drawable) {
                    invalidate();
                }
            }
        }
        super.invalidateDrawable(drawable);
    }

    public void j(float f2, int i2) {
        this.n.e(f2, i2);
    }

    public void k(int i2, float f2) {
        this.n.g(i2, f2);
    }

    public void l() {
        setEllipsize((this.i == Integer.MAX_VALUE || this.k) ? null : this.j);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (z zVar : (z[]) spanned.getSpans(0, spanned.length(), z.class)) {
                zVar.c();
            }
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (z zVar : (z[]) spanned.getSpans(0, spanned.length(), z.class)) {
                zVar.d();
            }
        }
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        if (this.e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (z zVar : (z[]) spanned.getSpans(0, spanned.length(), z.class)) {
                zVar.e();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
        if (r2 != false) goto L_0x00da;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0141 A[SYNTHETIC] */
    @Override // androidx.appcompat.widget.z
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        a0[] a0VarArr;
        UIManagerModule uIManagerModule;
        int i7;
        int i8;
        float f2;
        if ((getText() instanceof Spanned) && zj0.a(getId()) != 2) {
            ReactContext reactContext = getReactContext();
            UIManagerModule uIManagerModule2 = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
            Spanned spanned = (Spanned) getText();
            Layout layout = getLayout();
            a0[] a0VarArr2 = (a0[]) spanned.getSpans(0, spanned.length(), a0.class);
            ArrayList arrayList = this.m ? new ArrayList(a0VarArr2.length) : null;
            int i9 = i4 - i2;
            int i10 = i5 - i3;
            int length = a0VarArr2.length;
            int i11 = 0;
            while (i11 < length) {
                a0 a0Var = a0VarArr2[i11];
                View resolveView = uIManagerModule2.resolveView(a0Var.b());
                int spanStart = spanned.getSpanStart(a0Var);
                int lineForOffset = layout.getLineForOffset(spanStart);
                boolean z2 = true;
                if ((!(layout.getEllipsisCount(lineForOffset) > 0) || spanStart < layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset)) && lineForOffset < this.i && spanStart < layout.getLineEnd(lineForOffset)) {
                    int c = a0Var.c();
                    int a2 = a0Var.a();
                    uIManagerModule = uIManagerModule2;
                    boolean isRtlCharAt = layout.isRtlCharAt(spanStart);
                    a0VarArr = a0VarArr2;
                    i6 = length;
                    boolean z3 = layout.getParagraphDirection(lineForOffset) == -1;
                    if (spanStart != spanned.length() - 1) {
                        if (z3 == isRtlCharAt) {
                            f2 = layout.getPrimaryHorizontal(spanStart);
                        } else {
                            f2 = layout.getSecondaryHorizontal(spanStart);
                        }
                        int i12 = (int) f2;
                        i7 = z3 ? i9 - (((int) layout.getLineRight(lineForOffset)) - i12) : i12;
                    } else if (z3) {
                        i7 = i9 - ((int) layout.getLineWidth(lineForOffset));
                        if (!isRtlCharAt) {
                            i8 = getTotalPaddingRight();
                        } else {
                            i8 = getTotalPaddingLeft();
                        }
                        int i13 = i7 + i8;
                        int i14 = i2 + i13;
                        int totalPaddingTop = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - a2;
                        int i15 = i3 + totalPaddingTop;
                        if (i9 > i13 && i10 > totalPaddingTop) {
                            z2 = false;
                        }
                        int i16 = !z2 ? 8 : 0;
                        int i17 = c + i14;
                        int i18 = i15 + a2;
                        resolveView.setVisibility(i16);
                        resolveView.layout(i14, i15, i17, i18);
                        if (!this.m) {
                            arrayList.add(h(i16, spanStart, i14, i15, i17, i18));
                        }
                    } else {
                        i7 = (int) layout.getLineRight(lineForOffset);
                    }
                    i7 -= c;
                    if (!isRtlCharAt) {
                    }
                    int i132 = i7 + i8;
                    int i142 = i2 + i132;
                    int totalPaddingTop2 = (getTotalPaddingTop() + layout.getLineBaseline(lineForOffset)) - a2;
                    int i152 = i3 + totalPaddingTop2;
                    z2 = false;
                    if (!z2) {
                    }
                    int i172 = c + i142;
                    int i182 = i152 + a2;
                    resolveView.setVisibility(i16);
                    resolveView.layout(i142, i152, i172, i182);
                    if (!this.m) {
                    }
                } else {
                    uIManagerModule = uIManagerModule2;
                    a0VarArr = a0VarArr2;
                    i6 = length;
                    resolveView.setVisibility(8);
                    if (this.m) {
                        arrayList.add(h(8, spanStart, -1, -1, -1, -1));
                    }
                }
                i11++;
                length = i6;
                uIManagerModule2 = uIManagerModule;
                a0VarArr2 = a0VarArr;
            }
            if (this.m) {
                Collections.sort(arrayList, new a());
                WritableArray createArray = Arguments.createArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    createArray.pushMap((WritableMap) it.next());
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putArray(C0201.m82(37680), createArray);
                ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), C0201.m82(37681), createMap);
            }
        }
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        if (this.e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (z zVar : (z[]) spanned.getSpans(0, spanned.length(), z.class)) {
                zVar.f();
            }
        }
    }

    public void setAdjustFontSizeToFit(boolean z) {
        this.k = z;
    }

    public void setBackgroundColor(int i2) {
        this.n.b(i2);
    }

    public void setBorderRadius(float f2) {
        this.n.d(f2);
    }

    public void setBorderStyle(String str) {
        this.n.f(str);
    }

    public void setEllipsizeLocation(TextUtils.TruncateAt truncateAt) {
        this.j = truncateAt;
    }

    public void setGravityHorizontal(int i2) {
        if (i2 == 0) {
            i2 = this.f;
        }
        setGravity(i2 | (getGravity() & -8 & -8388616));
    }

    public void setGravityVertical(int i2) {
        if (i2 == 0) {
            i2 = this.g;
        }
        setGravity(i2 | (getGravity() & -113));
    }

    public void setLinkifyMask(int i2) {
        this.l = i2;
    }

    public void setNotifyOnInlineViewLayout(boolean z) {
        this.m = z;
    }

    public void setNumberOfLines(int i2) {
        if (i2 == 0) {
            i2 = C0188.f24;
        }
        this.i = i2;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        setSingleLine(z);
        setMaxLines(this.i);
    }

    public void setSpanned(Spannable spannable) {
        this.o = spannable;
    }

    public void setText(q qVar) {
        this.e = qVar.b();
        if (getLayoutParams() == null) {
            setLayoutParams(p);
        }
        Spannable k2 = qVar.k();
        int i2 = this.l;
        if (i2 > 0) {
            Linkify.addLinks(k2, i2);
            setMovementMethod(LinkMovementMethod.getInstance());
        }
        setText(k2);
        float f2 = qVar.f();
        float h2 = qVar.h();
        float g2 = qVar.g();
        float e2 = qVar.e();
        if (!(f2 == -1.0f || e2 == -1.0f || g2 == -1.0f || e2 == -1.0f)) {
            setPadding((int) Math.floor((double) f2), (int) Math.floor((double) h2), (int) Math.floor((double) g2), (int) Math.floor((double) e2));
        }
        int l2 = qVar.l();
        if (this.h != l2) {
            this.h = l2;
        }
        setGravityHorizontal(this.h);
        if (Build.VERSION.SDK_INT >= 23 && getBreakStrategy() != qVar.m()) {
            setBreakStrategy(qVar.m());
        }
        if (Build.VERSION.SDK_INT >= 26 && getJustificationMode() != qVar.d()) {
            setJustificationMode(qVar.d());
        }
        requestLayout();
    }

    public boolean verifyDrawable(Drawable drawable) {
        if (this.e && (getText() instanceof Spanned)) {
            Spanned spanned = (Spanned) getText();
            for (z zVar : (z[]) spanned.getSpans(0, spanned.length(), z.class)) {
                if (zVar.a() == drawable) {
                    return true;
                }
            }
        }
        return super.verifyDrawable(drawable);
    }
}
