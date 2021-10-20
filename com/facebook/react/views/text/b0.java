package com.facebook.react.views.text;

import android.content.Context;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.LruCache;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.q;
import com.facebook.yoga.g;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: TextLayoutManager */
public class b0 {
    private static final TextPaint a = new TextPaint(1);
    private static final Object b = new Object();
    private static LruCache<String, Spannable> c = new LruCache<>(100);

    /* compiled from: TextLayoutManager */
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

    private static void a(Context context, ReadableArray readableArray, SpannableStringBuilder spannableStringBuilder, List<a> list) {
        int i;
        int i2 = 0;
        for (int size = readableArray.size(); i2 < size; size = i) {
            ReadableMap map = readableArray.getMap(i2);
            int length = spannableStringBuilder.length();
            x xVar = new x(new c0(map.getMap(C0201.m82(2400))));
            spannableStringBuilder.append((CharSequence) c0.b(map.getString(C0201.m82(2401)), xVar.k));
            int length2 = spannableStringBuilder.length();
            int i3 = map.getInt(C0201.m82(2402));
            String r10 = C0201.m82(2403);
            if (map.hasKey(r10) && map.getBoolean(r10)) {
                list.add(new a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new a0(i3, (int) q.d(map.getDouble(C0201.m82(2404))), (int) q.d(map.getDouble(C0201.m82(2405))))));
            } else if (length2 >= length) {
                if (xVar.b) {
                    list.add(new a(length, length2, new j(xVar.d)));
                }
                if (xVar.e) {
                    list.add(new a(length, length2, new g(xVar.f)));
                }
                if (Build.VERSION.SDK_INT >= 21 && !Float.isNaN(xVar.g())) {
                    list.add(new a(length, length2, new a(xVar.g())));
                }
                list.add(new a(length, length2, new f(xVar.g)));
                if (xVar.r == -1 && xVar.s == -1 && xVar.t == null) {
                    i = size;
                } else {
                    i = size;
                    list.add(new a(length, length2, new c(xVar.r, xVar.s, xVar.u, xVar.t, context.getAssets())));
                }
                if (xVar.p) {
                    list.add(new a(length, length2, new u()));
                }
                if (xVar.q) {
                    list.add(new a(length, length2, new m()));
                }
                if (!(xVar.l == 0.0f && xVar.m == 0.0f)) {
                    list.add(new a(length, length2, new w(xVar.l, xVar.m, xVar.n, xVar.o)));
                }
                if (!Float.isNaN(xVar.c())) {
                    list.add(new a(length, length2, new b(xVar.c())));
                }
                list.add(new a(length, length2, new n(i3)));
                i2++;
            }
            i = size;
            i2++;
        }
    }

    private static Spannable b(Context context, ReadableMap readableMap, s sVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList<a> arrayList = new ArrayList();
        a(context, readableMap.getArray(C0201.m82(2406)), spannableStringBuilder, arrayList);
        int i = 0;
        for (a aVar : arrayList) {
            aVar.a(spannableStringBuilder, i);
            i++;
        }
        if (sVar != null) {
            sVar.a(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static Spannable c(Context context, ReadableMap readableMap, s sVar) {
        String obj = readableMap.toString();
        synchronized (b) {
            Spannable spannable = c.get(obj);
            if (spannable != null) {
                return spannable;
            }
            Spannable b2 = b(context, readableMap, sVar);
            synchronized (b) {
                c.put(obj, b2);
            }
            return b2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0196, code lost:
        if (r11 != false) goto L_0x0198;
     */
    public static long d(Context context, ReadableMap readableMap, ReadableMap readableMap2, float f, n nVar, float f2, n nVar2, s sVar, int[] iArr) {
        Layout layout;
        int i;
        a0[] a0VarArr;
        int i2;
        float f3;
        TextPaint textPaint = a;
        Spannable c2 = c(context, readableMap, sVar);
        int j = x.j(readableMap2.getString(C0201.m82(2407)));
        if (c2 != null) {
            BoringLayout.Metrics isBoring = BoringLayout.isBoring(c2, textPaint);
            float desiredWidth = isBoring == null ? Layout.getDesiredWidth(c2, textPaint) : Float.NaN;
            boolean z = nVar == n.UNDEFINED || f < 0.0f;
            int length = c2.length();
            if (isBoring == null && (z || (!g.a(desiredWidth) && desiredWidth <= f))) {
                int ceil = (int) Math.ceil((double) desiredWidth);
                if (Build.VERSION.SDK_INT < 23) {
                    layout = new StaticLayout(c2, textPaint, ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
                } else {
                    layout = StaticLayout.Builder.obtain(c2, 0, length, textPaint, ceil).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(j).setHyphenationFrequency(1).build();
                }
            } else if (isBoring != null && (z || ((float) isBoring.width) <= f)) {
                layout = BoringLayout.make(c2, textPaint, isBoring.width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, isBoring, true);
            } else if (Build.VERSION.SDK_INT < 23) {
                layout = new StaticLayout(c2, textPaint, (int) f, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            } else {
                layout = StaticLayout.Builder.obtain(c2, 0, length, textPaint, (int) f).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).setBreakStrategy(j).setHyphenationFrequency(1).build();
            }
            String r1 = C0201.m82(2408);
            int i3 = -1;
            int i4 = readableMap2.hasKey(r1) ? readableMap2.getInt(r1) : -1;
            int width = layout.getWidth();
            if (i4 == -1 || i4 == 0 || i4 >= layout.getLineCount()) {
                i = layout.getHeight();
            } else {
                i = layout.getLineBottom(i4 - 1);
            }
            int i5 = 0;
            int i6 = 0;
            while (i5 < length) {
                int nextSpanTransition = c2.nextSpanTransition(i5, length, a0.class);
                a0[] a0VarArr2 = (a0[]) c2.getSpans(i5, nextSpanTransition, a0.class);
                int length2 = a0VarArr2.length;
                int i7 = 0;
                while (i7 < length2) {
                    a0 a0Var = a0VarArr2[i7];
                    int spanStart = c2.getSpanStart(a0Var);
                    int lineForOffset = layout.getLineForOffset(spanStart);
                    if (!(layout.getEllipsisCount(lineForOffset) > 0) || spanStart < layout.getLineStart(lineForOffset) + layout.getEllipsisStart(lineForOffset) || spanStart >= layout.getLineEnd(lineForOffset)) {
                        int c3 = a0Var.c();
                        int a2 = a0Var.a();
                        boolean isRtlCharAt = layout.isRtlCharAt(spanStart);
                        a0VarArr = a0VarArr2;
                        boolean z2 = layout.getParagraphDirection(lineForOffset) == i3;
                        if (spanStart != length - 1) {
                            if (z2 == isRtlCharAt) {
                                f3 = layout.getPrimaryHorizontal(spanStart);
                            } else {
                                f3 = layout.getSecondaryHorizontal(spanStart);
                            }
                            int i8 = (int) f3;
                            i2 = z2 ? width - (((int) layout.getLineRight(lineForOffset)) - i8) : i8;
                        } else if (z2) {
                            i2 = width - ((int) layout.getLineWidth(lineForOffset));
                            int lineBaseline = layout.getLineBaseline(lineForOffset) - a2;
                            int i9 = i6 * 2;
                            iArr[i9] = (int) q.g((float) lineBaseline);
                            iArr[i9 + 1] = (int) q.g((float) i2);
                            i6++;
                        } else {
                            i2 = (int) layout.getLineRight(lineForOffset);
                        }
                        i2 -= c3;
                        int lineBaseline2 = layout.getLineBaseline(lineForOffset) - a2;
                        int i92 = i6 * 2;
                        iArr[i92] = (int) q.g((float) lineBaseline2);
                        iArr[i92 + 1] = (int) q.g((float) i2);
                        i6++;
                    } else {
                        a0VarArr = a0VarArr2;
                    }
                    i7++;
                    a0VarArr2 = a0VarArr;
                    i3 = -1;
                }
                i5 = nextSpanTransition;
            }
            return o.a(q.g((float) width), q.g((float) i));
        }
        throw new IllegalStateException(C0201.m82(2409));
    }
}
