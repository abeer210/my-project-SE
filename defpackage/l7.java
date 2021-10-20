package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import defpackage.o1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: l7  reason: default package */
/* compiled from: AnimatorInflaterCompat */
public class l7 {

    /* access modifiers changed from: private */
    /* renamed from: l7$a */
    /* compiled from: AnimatorInflaterCompat */
    public static class a implements TypeEvaluator<o1.b[]> {
        private o1.b[] a;

        /* renamed from: a */
        public o1.b[] evaluate(float f, o1.b[] bVarArr, o1.b[] bVarArr2) {
            if (o1.b(bVarArr, bVarArr2)) {
                if (!o1.b(this.a, bVarArr)) {
                    this.a = o1.f(bVarArr);
                }
                for (int i = 0; i < bVarArr.length; i++) {
                    this.a[i].d(bVarArr[i], bVarArr2[i], f);
                }
                return this.a;
            }
            throw new IllegalArgumentException(C0201.m82(7264));
        }
    }

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d1  */
    private static Animator b(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) throws XmlPullParserException, IOException {
        int i2;
        int depth = xmlPullParser.getDepth();
        ValueAnimator valueAnimator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            i2 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    if (name.equals(C0201.m82(25548))) {
                        valueAnimator = n(context, resources, theme, attributeSet, f, xmlPullParser);
                    } else if (name.equals(C0201.m82(25549))) {
                        valueAnimator = l(context, resources, theme, attributeSet, null, f, xmlPullParser);
                    } else {
                        if (name.equals(C0201.m82(25550))) {
                            AnimatorSet animatorSet2 = new AnimatorSet();
                            TypedArray k = m1.k(resources, theme, attributeSet, h7.h);
                            b(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, m1.g(k, xmlPullParser, C0201.m82(25551), 0, 0), f);
                            k.recycle();
                            valueAnimator = animatorSet2;
                        } else if (name.equals(C0201.m82(25552))) {
                            PropertyValuesHolder[] p = p(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                            if (p != null && (valueAnimator instanceof ValueAnimator)) {
                                valueAnimator.setValues(p);
                            }
                            i2 = 1;
                        } else {
                            throw new RuntimeException(C0201.m82(25553) + xmlPullParser.getName());
                        }
                        if (animatorSet != null && i2 == 0) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(valueAnimator);
                        }
                    }
                    if (arrayList == null) {
                    }
                    arrayList.add(valueAnimator);
                }
            }
        }
        if (!(animatorSet == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                animatorArr[i2] = (Animator) it.next();
                i2++;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return valueAnimator;
    }

    private static Keyframe c(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static void d(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    private static PropertyValuesHolder e(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        int i6;
        PropertyValuesHolder propertyValuesHolder;
        float f;
        float f2;
        float f3;
        PropertyValuesHolder propertyValuesHolder2;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((!z || !h(i7)) && (!z2 || !h(i8))) ? 0 : 3;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder3 = null;
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            o1.b[] d = o1.d(string);
            o1.b[] d2 = o1.d(string2);
            if (d == null && d2 == null) {
                return null;
            }
            if (d != null) {
                a aVar = new a();
                if (d2 == null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, d);
                } else if (o1.b(d, d2)) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofObject(str, aVar, d, d2);
                } else {
                    throw new InflateException(C0201.m82(25554) + string + C0201.m82(25555) + string2);
                }
                return propertyValuesHolder2;
            } else if (d2 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new a(), d2);
            }
        } else {
            m7 a2 = i == 3 ? m7.a() : null;
            if (z3) {
                if (z) {
                    if (i7 == 5) {
                        f2 = typedArray.getDimension(i2, 0.0f);
                    } else {
                        f2 = typedArray.getFloat(i2, 0.0f);
                    }
                    if (z2) {
                        if (i8 == 5) {
                            f3 = typedArray.getDimension(i3, 0.0f);
                        } else {
                            f3 = typedArray.getFloat(i3, 0.0f);
                        }
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2, f3);
                    } else {
                        propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f2);
                    }
                } else {
                    if (i8 == 5) {
                        f = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f = typedArray.getFloat(i3, 0.0f);
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(str, f);
                }
                propertyValuesHolder3 = propertyValuesHolder;
            } else if (z) {
                if (i7 == 5) {
                    i5 = (int) typedArray.getDimension(i2, 0.0f);
                } else if (h(i7)) {
                    i5 = typedArray.getColor(i2, 0);
                } else {
                    i5 = typedArray.getInt(i2, 0);
                }
                if (z2) {
                    if (i8 == 5) {
                        i6 = (int) typedArray.getDimension(i3, 0.0f);
                    } else if (h(i8)) {
                        i6 = typedArray.getColor(i3, 0);
                    } else {
                        i6 = typedArray.getInt(i3, 0);
                    }
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i5, i6);
                } else {
                    propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i5);
                }
            } else if (z2) {
                if (i8 == 5) {
                    i4 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (h(i8)) {
                    i4 = typedArray.getColor(i3, 0);
                } else {
                    i4 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder3 = PropertyValuesHolder.ofInt(str, i4);
            }
            if (propertyValuesHolder3 == null || a2 == null) {
                return propertyValuesHolder3;
            }
            propertyValuesHolder3.setEvaluator(a2);
            return propertyValuesHolder3;
        }
    }

    private static int f(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = true;
        boolean z2 = peekValue != null;
        int i3 = z2 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        if (peekValue2 == null) {
            z = false;
        }
        int i4 = z ? peekValue2.type : 0;
        if ((!z2 || !h(i3)) && (!z || !h(i4))) {
            return 0;
        }
        return 3;
    }

    private static int g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray k = m1.k(resources, theme, attributeSet, h7.j);
        int i = 0;
        TypedValue l = m1.l(k, xmlPullParser, C0201.m82(25556), 0);
        if ((l != null) && h(l.type)) {
            i = 3;
        }
        k.recycle();
        return i;
    }

    private static boolean h(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator i(Context context, int i) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return j(context, context.getResources(), context.getTheme(), i);
    }

    public static Animator j(Context context, Resources resources, Resources.Theme theme, int i) throws Resources.NotFoundException {
        return k(context, resources, theme, i, 1.0f);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, int i, float f) throws Resources.NotFoundException {
        String r0 = C0201.m82(25557);
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = resources.getAnimation(i);
            Animator a2 = a(context, resources, theme, xmlResourceParser, f);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            return a2;
        } catch (XmlPullParserException e) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(r0 + Integer.toHexString(i));
            notFoundException.initCause(e);
            throw notFoundException;
        } catch (IOException e2) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(r0 + Integer.toHexString(i));
            notFoundException2.initCause(e2);
            throw notFoundException2;
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    private static ValueAnimator l(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray k = m1.k(resources, theme, attributeSet, h7.g);
        TypedArray k2 = m1.k(resources, theme, attributeSet, h7.k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        q(valueAnimator, k, k2, f, xmlPullParser);
        int h = m1.h(k, xmlPullParser, C0201.m82(25558), 0, 0);
        if (h > 0) {
            valueAnimator.setInterpolator(k7.b(context, h));
        }
        k.recycle();
        if (k2 != null) {
            k2.recycle();
        }
        return valueAnimator;
    }

    private static Keyframe m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Keyframe keyframe;
        TypedArray k = m1.k(resources, theme, attributeSet, h7.j);
        float f = m1.f(k, xmlPullParser, C0201.m82(25559), 3, -1.0f);
        String r0 = C0201.m82(25560);
        TypedValue l = m1.l(k, xmlPullParser, r0, 0);
        boolean z = l != null;
        if (i == 4) {
            i = (!z || !h(l.type)) ? 0 : 3;
        }
        if (z) {
            if (i == 0) {
                keyframe = Keyframe.ofFloat(f, m1.f(k, xmlPullParser, r0, 0, 0.0f));
            } else if (i == 1 || i == 3) {
                keyframe = Keyframe.ofInt(f, m1.g(k, xmlPullParser, r0, 0, 0));
            } else {
                keyframe = null;
            }
        } else if (i == 0) {
            keyframe = Keyframe.ofFloat(f);
        } else {
            keyframe = Keyframe.ofInt(f);
        }
        int h = m1.h(k, xmlPullParser, C0201.m82(25561), 1, 0);
        if (h > 0) {
            keyframe.setInterpolator(k7.b(context, h));
        }
        k.recycle();
        return keyframe;
    }

    private static ObjectAnimator n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        l(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e7  */
    private static PropertyValuesHolder o(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        int size;
        int i2;
        float fraction;
        float fraction2;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                if (arrayList != null && (size = arrayList.size()) > 0) {
                    Keyframe keyframe = (Keyframe) arrayList.get(0);
                    Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
                    fraction = keyframe2.getFraction();
                    if (fraction < 1.0f) {
                        if (fraction < 0.0f) {
                            keyframe2.setFraction(1.0f);
                        } else {
                            arrayList.add(arrayList.size(), c(keyframe2, 1.0f));
                            size++;
                        }
                    }
                    fraction2 = keyframe.getFraction();
                    if (fraction2 != 0.0f) {
                        if (fraction2 < 0.0f) {
                            keyframe.setFraction(0.0f);
                        } else {
                            arrayList.add(0, c(keyframe, 0.0f));
                            size++;
                        }
                    }
                    Keyframe[] keyframeArr = new Keyframe[size];
                    arrayList.toArray(keyframeArr);
                    for (i2 = 0; i2 < size; i2++) {
                        Keyframe keyframe3 = keyframeArr[i2];
                        if (keyframe3.getFraction() < 0.0f) {
                            if (i2 == 0) {
                                keyframe3.setFraction(0.0f);
                            } else {
                                int i3 = size - 1;
                                if (i2 == i3) {
                                    keyframe3.setFraction(1.0f);
                                } else {
                                    int i4 = i2 + 1;
                                    int i5 = i2;
                                    while (i4 < i3 && keyframeArr[i4].getFraction() < 0.0f) {
                                        i5 = i4;
                                        i4++;
                                    }
                                    d(keyframeArr, keyframeArr[i5 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i5);
                                }
                            }
                        }
                    }
                    propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
                    if (i == 3) {
                        propertyValuesHolder.setEvaluator(m7.a());
                    }
                }
            } else if (xmlPullParser.getName().equals(C0201.m82(25562))) {
                if (i == 4) {
                    i = g(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe m = m(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (m != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m);
                }
                xmlPullParser.next();
            }
        }
        Keyframe keyframe4 = (Keyframe) arrayList.get(0);
        Keyframe keyframe22 = (Keyframe) arrayList.get(size - 1);
        fraction = keyframe22.getFraction();
        if (fraction < 1.0f) {
        }
        fraction2 = keyframe4.getFraction();
        if (fraction2 != 0.0f) {
        }
        Keyframe[] keyframeArr2 = new Keyframe[size];
        arrayList.toArray(keyframeArr2);
        while (i2 < size) {
        }
        propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr2);
        if (i == 3) {
        }
        return propertyValuesHolder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007e  */
    private static PropertyValuesHolder[] p(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                if (arrayList != null) {
                    int size = arrayList.size();
                    propertyValuesHolderArr = new PropertyValuesHolder[size];
                    for (int i = 0; i < size; i++) {
                        propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
                    }
                }
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals(C0201.m82(25563))) {
                    TypedArray k = m1.k(resources, theme, attributeSet, h7.i);
                    String i2 = m1.i(k, xmlPullParser, C0201.m82(25564), 3);
                    int g = m1.g(k, xmlPullParser, C0201.m82(25565), 2, 4);
                    PropertyValuesHolder o = o(context, resources, theme, xmlPullParser, i2, g);
                    if (o == null) {
                        o = e(k, g, 0, 1, i2);
                    }
                    if (o != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(o);
                    }
                    k.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
        }
        return propertyValuesHolderArr;
    }

    private static void q(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long g = (long) m1.g(typedArray, xmlPullParser, C0201.m82(25566), 1, C0188.f19);
        long g2 = (long) m1.g(typedArray, xmlPullParser, C0201.m82(25567), 2, 0);
        int g3 = m1.g(typedArray, xmlPullParser, C0201.m82(25568), 7, 4);
        if (m1.j(xmlPullParser, C0201.m82(25569)) && m1.j(xmlPullParser, C0201.m82(25570))) {
            if (g3 == 4) {
                g3 = f(typedArray, 5, 6);
            }
            PropertyValuesHolder e = e(typedArray, g3, 5, 6, C0201.m82(25571));
            if (e != null) {
                valueAnimator.setValues(e);
            }
        }
        valueAnimator.setDuration(g);
        valueAnimator.setStartDelay(g2);
        valueAnimator.setRepeatCount(m1.g(typedArray, xmlPullParser, C0201.m82(25572), 3, 0));
        valueAnimator.setRepeatMode(m1.g(typedArray, xmlPullParser, C0201.m82(25573), 4, 1));
        if (typedArray2 != null) {
            r(valueAnimator, typedArray2, g3, f, xmlPullParser);
        }
    }

    private static void r(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String i2 = m1.i(typedArray, xmlPullParser, C0201.m82(25574), 1);
        if (i2 != null) {
            String i3 = m1.i(typedArray, xmlPullParser, C0201.m82(25575), 2);
            String i4 = m1.i(typedArray, xmlPullParser, C0201.m82(25576), 3);
            if (i != 2) {
            }
            if (i3 == null && i4 == null) {
                throw new InflateException(typedArray.getPositionDescription() + C0201.m82(25577));
            }
            s(o1.e(i2), objectAnimator, f * 0.5f, i3, i4);
            return;
        }
        objectAnimator.setPropertyName(m1.i(typedArray, xmlPullParser, C0201.m82(25578), 0));
    }

    private static void s(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / ((float) (min - 1));
        int i = 0;
        int i2 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        if (str2 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str2, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator.setValues(propertyValuesHolder);
        } else if (propertyValuesHolder == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, propertyValuesHolder);
        }
    }
}
