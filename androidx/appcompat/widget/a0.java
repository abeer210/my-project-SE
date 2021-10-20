package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: AppCompatTextViewAutoSizeHelper */
public class a0 {
    private static final RectF k = new RectF();
    private static ConcurrentHashMap<String, Method> l = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Field> m = new ConcurrentHashMap<>();
    private int a = 0;
    private boolean b = false;
    private float c = -1.0f;
    private float d = -1.0f;
    private float e = -1.0f;
    private int[] f = new int[0];
    private boolean g = false;
    private TextPaint h;
    private final TextView i;
    private final Context j;

    public a0(TextView textView) {
        this.i = textView;
        this.j = textView.getContext();
    }

    private void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = typedArray.getDimensionPixelSize(i2, -1);
            }
            this.f = c(iArr);
            B();
        }
    }

    private boolean B() {
        int length = this.f.length;
        boolean z = length > 0;
        this.g = z;
        if (z) {
            this.a = 1;
            int[] iArr = this.f;
            this.d = (float) iArr[0];
            this.e = (float) iArr[length - 1];
            this.c = -1.0f;
        }
        return this.g;
    }

    private boolean C(int i2, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.i.getText();
        TransformationMethod transformationMethod = this.i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.i)) == null)) {
            text = transformation;
        }
        int maxLines = Build.VERSION.SDK_INT >= 16 ? this.i.getMaxLines() : -1;
        q(i2);
        StaticLayout e2 = e(text, (Layout.Alignment) r(this.i, C0201.m82(31217), Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e2.getLineCount() <= maxLines && e2.getLineEnd(e2.getLineCount() - 1) == text.length())) && ((float) e2.getHeight()) <= rectF.bottom;
    }

    private boolean D() {
        return !(this.i instanceof k);
    }

    private void E(float f2, float f3, float f4) throws IllegalArgumentException {
        String r0 = C0201.m82(31218);
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException(C0201.m82(31223) + f2 + r0);
        } else if (f3 <= f2) {
            throw new IllegalArgumentException(C0201.m82(31220) + f3 + C0201.m82(31221) + f2 + C0201.m82(31222));
        } else if (f4 > 0.0f) {
            this.a = 1;
            this.d = f2;
            this.e = f3;
            this.c = f4;
            this.g = false;
        } else {
            throw new IllegalArgumentException(C0201.m82(31219) + f4 + r0);
        }
    }

    private static <T> T a(Object obj, String str, T t) {
        try {
            Field o = o(str);
            return o == null ? t : (T) o.get(obj);
        } catch (IllegalAccessException e2) {
            Log.w(C0201.m82(31226), C0201.m82(31224) + str + C0201.m82(31225), e2);
            return t;
        }
    }

    private int[] c(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    private void d() {
        this.a = 0;
        this.d = -1.0f;
        this.e = -1.0f;
        this.c = -1.0f;
        this.f = new int[0];
        this.b = false;
    }

    private StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.h, i2);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.i.getLineSpacingExtra(), this.i.getLineSpacingMultiplier()).setIncludePad(this.i.getIncludeFontPadding()).setBreakStrategy(this.i.getBreakStrategy()).setHyphenationFrequency(this.i.getHyphenationFrequency());
        if (i3 == -1) {
            i3 = C0188.f24;
        }
        hyphenationFrequency.setMaxLines(i3);
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                textDirectionHeuristic = this.i.getTextDirectionHeuristic();
            } else {
                textDirectionHeuristic = (TextDirectionHeuristic) r(this.i, C0201.m82(31227), TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            obtain.setTextDirection(textDirectionHeuristic);
        } catch (ClassCastException unused) {
            Log.w(C0201.m82(31228), C0201.m82(31229));
        }
        return obtain.build();
    }

    private StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.h, i2, alignment, ((Float) a(this.i, C0201.m82(31230), Float.valueOf(1.0f))).floatValue(), ((Float) a(this.i, C0201.m82(31231), Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.i, C0201.m82(31232), Boolean.TRUE)).booleanValue());
    }

    private StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i2) {
        return new StaticLayout(charSequence, this.h, i2, alignment, this.i.getLineSpacingMultiplier(), this.i.getLineSpacingExtra(), this.i.getIncludeFontPadding());
    }

    private int i(RectF rectF) {
        int length = this.f.length;
        if (length != 0) {
            int i2 = length - 1;
            int i3 = 1;
            int i4 = 0;
            while (i3 <= i2) {
                int i5 = (i3 + i2) / 2;
                if (C(this.f[i5], rectF)) {
                    int i6 = i5 + 1;
                    i4 = i3;
                    i3 = i6;
                } else {
                    i4 = i5 - 1;
                    i2 = i4;
                }
            }
            return this.f[i4];
        }
        throw new IllegalStateException(C0201.m82(31233));
    }

    private static Field o(String str) {
        try {
            Field field = m.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                m.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e2) {
            Log.w(C0201.m82(31236), C0201.m82(31234) + str + C0201.m82(31235), e2);
            return null;
        }
    }

    private static Method p(String str) {
        try {
            Method method = l.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                l.put(str, method);
            }
            return method;
        } catch (Exception e2) {
            Log.w(C0201.m82(31239), C0201.m82(31237) + str + C0201.m82(31238), e2);
            return null;
        }
    }

    private static <T> T r(Object obj, String str, T t) {
        try {
            return (T) p(str).invoke(obj, new Object[0]);
        } catch (Exception e2) {
            String r1 = C0201.m82(31240);
            Log.w(r1, C0201.m82(31241) + str + C0201.m82(31242), e2);
            return t;
        }
    }

    private void x(float f2) {
        if (f2 != this.i.getPaint().getTextSize()) {
            this.i.getPaint().setTextSize(f2);
            boolean isInLayout = Build.VERSION.SDK_INT >= 18 ? this.i.isInLayout() : false;
            if (this.i.getLayout() != null) {
                this.b = false;
                try {
                    Method p = p(C0201.m82(31243));
                    if (p != null) {
                        p.invoke(this.i, new Object[0]);
                    }
                } catch (Exception e2) {
                    Log.w(C0201.m82(31244), C0201.m82(31245), e2);
                }
                if (!isInLayout) {
                    this.i.requestLayout();
                } else {
                    this.i.forceLayout();
                }
                this.i.invalidate();
            }
        }
    }

    private boolean z() {
        if (!D() || this.a != 1) {
            this.b = false;
        } else {
            if (!this.g || this.f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.e - this.d) / this.c))) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = Math.round(this.d + (((float) i2) * this.c));
                }
                this.f = c(iArr);
            }
            this.b = true;
        }
        return this.b;
    }

    public void b() {
        boolean z;
        int i2;
        if (s()) {
            if (this.b) {
                if (this.i.getMeasuredHeight() > 0 && this.i.getMeasuredWidth() > 0) {
                    if (Build.VERSION.SDK_INT >= 29) {
                        z = this.i.isHorizontallyScrollable();
                    } else {
                        z = ((Boolean) r(this.i, C0201.m82(31246), Boolean.FALSE)).booleanValue();
                    }
                    if (z) {
                        i2 = 1048576;
                    } else {
                        i2 = (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                    }
                    int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                    if (i2 > 0 && height > 0) {
                        synchronized (k) {
                            k.setEmpty();
                            k.right = (float) i2;
                            k.bottom = (float) height;
                            float i3 = (float) i(k);
                            if (i3 != this.i.getTextSize()) {
                                y(0, i3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.b = true;
        }
    }

    public StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i2, int i3) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 23) {
            return f(charSequence, alignment, i2, i3);
        }
        if (i4 >= 16) {
            return h(charSequence, alignment, i2);
        }
        return g(charSequence, alignment, i2);
    }

    public int j() {
        return Math.round(this.e);
    }

    public int k() {
        return Math.round(this.d);
    }

    public int l() {
        return Math.round(this.c);
    }

    public int[] m() {
        return this.f;
    }

    public int n() {
        return this.a;
    }

    public void q(int i2) {
        TextPaint textPaint = this.h;
        if (textPaint == null) {
            this.h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.h.set(this.i.getPaint());
        this.h.setTextSize((float) i2);
    }

    public boolean s() {
        return D() && this.a != 0;
    }

    public void t(AttributeSet attributeSet, int i2) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.j.obtainStyledAttributes(attributeSet, m.AppCompatTextView, i2, 0);
        if (obtainStyledAttributes.hasValue(m.AppCompatTextView_autoSizeTextType)) {
            this.a = obtainStyledAttributes.getInt(m.AppCompatTextView_autoSizeTextType, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(m.AppCompatTextView_autoSizeStepGranularity) ? obtainStyledAttributes.getDimension(m.AppCompatTextView_autoSizeStepGranularity, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(m.AppCompatTextView_autoSizeMinTextSize) ? obtainStyledAttributes.getDimension(m.AppCompatTextView_autoSizeMinTextSize, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(m.AppCompatTextView_autoSizeMaxTextSize) ? obtainStyledAttributes.getDimension(m.AppCompatTextView_autoSizeMaxTextSize, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(m.AppCompatTextView_autoSizePresetSizes) && (resourceId = obtainStyledAttributes.getResourceId(m.AppCompatTextView_autoSizePresetSizes, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!D()) {
            this.a = 0;
        } else if (this.a == 1) {
            if (!this.g) {
                DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                E(dimension2, dimension3, dimension);
            }
            z();
        }
    }

    public void u(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        if (D()) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i5, (float) i2, displayMetrics), TypedValue.applyDimension(i5, (float) i3, displayMetrics), TypedValue.applyDimension(i5, (float) i4, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    public void v(int[] iArr, int i2) throws IllegalArgumentException {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, (float) iArr[i3], displayMetrics));
                    }
                }
                this.f = c(iArr2);
                if (!B()) {
                    throw new IllegalArgumentException(C0201.m82(31247) + Arrays.toString(iArr));
                }
            } else {
                this.g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    public void w(int i2) {
        if (!D()) {
            return;
        }
        if (i2 == 0) {
            d();
        } else if (i2 == 1) {
            DisplayMetrics displayMetrics = this.j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z()) {
                b();
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(31248) + i2);
        }
    }

    public void y(int i2, float f2) {
        Resources resources;
        Context context = this.j;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        x(TypedValue.applyDimension(i2, f2, resources.getDisplayMetrics()));
    }
}
