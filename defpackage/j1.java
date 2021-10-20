package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* renamed from: j1  reason: default package */
/* compiled from: GradientColorInflaterCompat */
public final class j1 {
    private static a a(a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        if (z) {
            return new a(i, i3, i2);
        }
        return new a(i, i2);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals(C0201.m82(20500))) {
            TypedArray k = m1.k(resources, theme, attributeSet, f1.GradientColor);
            float f = m1.f(k, xmlPullParser, C0201.m82(20501), f1.GradientColor_android_startX, 0.0f);
            float f2 = m1.f(k, xmlPullParser, C0201.m82(20502), f1.GradientColor_android_startY, 0.0f);
            float f3 = m1.f(k, xmlPullParser, C0201.m82(20503), f1.GradientColor_android_endX, 0.0f);
            float f4 = m1.f(k, xmlPullParser, C0201.m82(20504), f1.GradientColor_android_endY, 0.0f);
            float f5 = m1.f(k, xmlPullParser, C0201.m82(20505), f1.GradientColor_android_centerX, 0.0f);
            float f6 = m1.f(k, xmlPullParser, C0201.m82(20506), f1.GradientColor_android_centerY, 0.0f);
            int g = m1.g(k, xmlPullParser, C0201.m82(20507), f1.GradientColor_android_type, 0);
            int b = m1.b(k, xmlPullParser, C0201.m82(20508), f1.GradientColor_android_startColor, 0);
            String r13 = C0201.m82(20509);
            boolean j = m1.j(xmlPullParser, r13);
            int b2 = m1.b(k, xmlPullParser, r13, f1.GradientColor_android_centerColor, 0);
            int b3 = m1.b(k, xmlPullParser, C0201.m82(20510), f1.GradientColor_android_endColor, 0);
            int g2 = m1.g(k, xmlPullParser, C0201.m82(20511), f1.GradientColor_android_tileMode, 0);
            float f7 = m1.f(k, xmlPullParser, C0201.m82(20512), f1.GradientColor_android_gradientRadius, 0.0f);
            k.recycle();
            a a2 = a(c(resources, xmlPullParser, attributeSet, theme), b, b3, j, b2);
            if (g != 1) {
                if (g != 2) {
                    return new LinearGradient(f, f2, f3, f4, a2.a, a2.b, d(g2));
                }
                return new SweepGradient(f5, f6, a2.a, a2.b);
            } else if (f7 > 0.0f) {
                return new RadialGradient(f5, f6, f7, a2.a, a2.b, d(g2));
            } else {
                throw new XmlPullParserException(C0201.m82(20513));
            }
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + C0201.m82(20514) + name);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008e, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r9.getPositionDescription() + vigqyno.C0201.m82(20516));
     */
    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1 && ((depth = xmlPullParser.getDepth()) >= depth2 || next != 3)) {
                if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals(C0201.m82(20515))) {
                    TypedArray k = m1.k(resources, theme, attributeSet, f1.GradientColorItem);
                    boolean hasValue = k.hasValue(f1.GradientColorItem_android_color);
                    boolean hasValue2 = k.hasValue(f1.GradientColorItem_android_offset);
                    if (!hasValue || !hasValue2) {
                    } else {
                        int color = k.getColor(f1.GradientColorItem_android_color, 0);
                        float f = k.getFloat(f1.GradientColorItem_android_offset, 0.0f);
                        k.recycle();
                        arrayList2.add(Integer.valueOf(color));
                        arrayList.add(Float.valueOf(f));
                    }
                }
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int i) {
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.MIRROR;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j1$a */
    /* compiled from: GradientColorInflaterCompat */
    public static final class a {
        public final int[] a;
        public final float[] b;

        public a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.a = new int[size];
            this.b = new float[size];
            for (int i = 0; i < size; i++) {
                this.a[i] = list.get(i).intValue();
                this.b[i] = list2.get(i).floatValue();
            }
        }

        public a(int i, int i2) {
            this.a = new int[]{i, i2};
            this.b = new float[]{0.0f, 1.0f};
        }

        public a(int i, int i2, int i3) {
            this.a = new int[]{i, i2, i3};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
