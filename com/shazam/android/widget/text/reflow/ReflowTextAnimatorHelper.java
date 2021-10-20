package com.shazam.android.widget.text.reflow;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.animation.TypeEvaluator;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.transition.PathMotion;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public final class ReflowTextAnimatorHelper {
    private static final boolean q = (Build.VERSION.SDK_INT >= 21);
    private final TextView a;
    private final TextView b;
    private final boolean c;
    private final long d;
    private final long e;
    private final long f;
    private final TextSizeGetter g;
    private final TextColorGetter h;
    private final BoundsCalculator i;
    private long j;
    private long k;
    private boolean l;
    private final boolean m;
    private final AnimatorSet n;
    private Bitmap o;
    private Bitmap p;

    public static class Builder {
        private static final TextSizeGetter m = c.a;
        private static final TextColorGetter n = a.a;
        private TextView a;
        private TextView b;
        private boolean c = false;
        private long d = 200;
        private long e = 400;
        private long f = 40;
        private long g = 700;
        private boolean h = false;
        private boolean i = true;
        private TextSizeGetter j = m;
        private TextColorGetter k = n;
        private BoundsCalculator l = b.a;

        public Builder(TextView textView, TextView textView2) {
            this.a = textView;
            this.b = textView2;
            if (textView != null) {
                k3.O(textView);
                TextView textView3 = this.b;
                if (textView3 != null) {
                    k3.O(textView3);
                    return;
                }
                throw new IllegalArgumentException(C0201.m82(10504));
            }
            throw new IllegalArgumentException(C0201.m82(10505));
        }

        public static /* synthetic */ Rect p(View view) {
            int[] iArr = new int[2];
            view.getLocationInWindow(iArr);
            return new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        }

        public ReflowTextAnimatorHelper m() {
            return new ReflowTextAnimatorHelper(this);
        }

        public Animator n() {
            if (!this.h) {
                return m().c();
            }
            throw new IllegalStateException(C0201.m82(10506));
        }

        public Builder o(boolean z) {
            this.i = z;
            return this;
        }

        public Builder q(BoundsCalculator boundsCalculator) {
            this.l = boundsCalculator;
            return this;
        }

        public Builder r(TextColorGetter textColorGetter) {
            this.k = textColorGetter;
            return this;
        }
    }

    private long b(Rect rect, Rect rect2) {
        return Math.max(this.e, Math.min(this.f, (long) ((((float) Math.hypot((double) (rect.exactCenterX() - rect2.exactCenterX()), (double) (rect.exactCenterY() - rect2.exactCenterY()))) / ((float) this.d)) * 1000.0f)));
    }

    private Bitmap d(View view) {
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight() * (this.c ? 3 : 1), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    private List<Animator> e(View view, Bitmap bitmap, Bitmap bitmap2, List<Run> list) {
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        char c2;
        char c3;
        Rect a2 = this.i.a(this.a);
        Rect a3 = this.i.a(this.b);
        ArrayList arrayList = new ArrayList(list.size());
        int i6 = a3.left - a2.left;
        int i7 = a3.top - a2.top;
        boolean z3 = a2.centerY() > a3.centerY();
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        if (this.c) {
            Paint paint = new Paint();
            paint.setTextSize(20.0f);
            paint.setColor(-16777216);
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(1.0f);
            paint2.setColor(-2130771968);
            Paint paint3 = new Paint();
            paint3.setStyle(Paint.Style.STROKE);
            paint3.setStrokeWidth(1.0f);
            paint3.setColor(-2130771968);
            int[] intArray = this.a.getResources().getIntArray(R.array.debug_colors);
            Canvas canvas = new Canvas(bitmap);
            Canvas canvas2 = new Canvas(bitmap2);
            Paint paint4 = new Paint();
            int i8 = 0;
            int i9 = 1;
            for (Run run : list) {
                paint4.setColor(intArray[i8 % intArray.length]);
                paint4.setAlpha(128);
                g(canvas, run.b(), i9, paint4, paint2, paint);
                g(canvas2, run.a(), i9, paint4, paint2, paint);
                i9++;
                canvas2 = canvas2;
                paint4 = paint4;
                i8++;
                canvas = canvas;
                intArray = intArray;
            }
        }
        if (z3) {
            i2 = 0;
        } else {
            i2 = list.size() - 1;
        }
        long j2 = 0;
        boolean z4 = true;
        boolean z5 = true;
        while (true) {
            if ((!z3 || i2 >= list.size()) && (z3 || i2 < 0)) {
                return arrayList;
            }
            Run run2 = list.get(i2);
            if (run2.d() || run2.c()) {
                SwitchDrawable switchDrawable = new SwitchDrawable(bitmap, run2.b(), this.g.a(this.a), bitmap2, run2.a(), this.g.a(this.b), this.h.a(this.a), this.h.a(this.b));
                i4 = i2;
                switchDrawable.setBounds(run2.b().left, run2.b().top, run2.b().right, run2.b().bottom);
                view.getOverlay().add(switchDrawable);
                i3 = i7;
                z = z3;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(switchDrawable, i(run2, i7, i6), PropertyValuesHolder.ofInt(SwitchDrawable.o, run2.b().width(), run2.a().width()), PropertyValuesHolder.ofInt(SwitchDrawable.p, run2.b().height(), run2.a().height()), PropertyValuesHolder.ofFloat(SwitchDrawable.r, 0.0f, 1.0f));
                boolean z6 = run2.b().centerX() + i6 < run2.a().centerX();
                if (run2.d() && run2.c() && !z4 && z6 != z5) {
                    long j3 = this.j;
                    j2 += j3;
                    this.j = (long) (((float) j3) * 0.8f);
                }
                ofPropertyValuesHolder.setStartDelay(j2);
                long max = Math.max(this.e, this.k - (j2 / 2));
                if (this.l) {
                    ofPropertyValuesHolder.setDuration(max);
                }
                arrayList.add(ofPropertyValuesHolder);
                if (run2.d() != run2.c()) {
                    Property<SwitchDrawable, Integer> property = SwitchDrawable.q;
                    int[] iArr = new int[2];
                    int i10 = 255;
                    if (run2.d()) {
                        c2 = 0;
                        i5 = 255;
                    } else {
                        c2 = 0;
                        i5 = 0;
                    }
                    iArr[c2] = i5;
                    if (run2.c()) {
                        c3 = 1;
                    } else {
                        c3 = 1;
                        i10 = 0;
                    }
                    iArr[c3] = i10;
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(switchDrawable, property, iArr);
                    if (this.l) {
                        ofInt.setDuration((this.k + j2) / 2);
                    }
                    if (!run2.d()) {
                        switchDrawable.setAlpha(0);
                        ofInt.setStartDelay((this.k + j2) / 2);
                    } else {
                        ofInt.setStartDelay(j2);
                    }
                    arrayList.add(ofInt);
                } else {
                    ObjectAnimator ofInt2 = ObjectAnimator.ofInt(switchDrawable, SwitchDrawable.q, 255, 204, 255);
                    ofInt2.setStartDelay(j2);
                    if (this.l) {
                        ofInt2.setDuration(this.k + j2);
                    }
                    ofInt2.setInterpolator(linearInterpolator);
                    arrayList.add(ofInt2);
                }
                z5 = z6;
                z2 = false;
            } else {
                z = z3;
                i3 = i7;
                i4 = i2;
                z2 = z4;
            }
            z4 = z2;
            i2 = i4 + (z ? 1 : -1);
            i7 = i3;
            z3 = z;
        }
        return arrayList;
    }

    private static Layout f(TextView textView) {
        CharSequence text = textView.getText();
        Layout layout = textView.getLayout();
        TextPaint paint = layout.getPaint();
        if (Build.VERSION.SDK_INT >= 23) {
            return StaticLayout.Builder.obtain(text, 0, text.length(), layout.getPaint(), layout.getWidth()).setAlignment(layout.getAlignment()).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).build();
        }
        return new StaticLayout(text, paint, text.length(), layout.getAlignment(), textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    private static void g(Canvas canvas, Rect rect, int i2, Paint paint, Paint paint2, Paint paint3) {
        Rect rect2 = new Rect(rect.left + 1, rect.top + 1, rect.right - 1, rect.bottom - 1);
        canvas.drawRect(rect2, paint);
        canvas.drawRect(rect2, paint2);
        canvas.drawText(C0201.m82(14375) + i2, (float) (rect.left + 6), (float) (rect.top + 21), paint3);
    }

    /* access modifiers changed from: private */
    public static Path h(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    @TargetApi(21)
    private PropertyValuesHolder i(Run run, int i2, int i3) {
        if (q) {
            return PropertyValuesHolder.ofObject(SwitchDrawable.n, (TypeConverter) null, new PathMotion(this) {
                /* class com.shazam.android.widget.text.reflow.ReflowTextAnimatorHelper.AnonymousClass2 */

                public Path getPath(float f, float f2, float f3, float f4) {
                    return ReflowTextAnimatorHelper.h(f, f2, f3, f4);
                }
            }.getPath((float) (run.a().left - i3), (float) (run.a().top - i2), (float) run.b().left, (float) run.b().top));
        }
        PointF pointF = new PointF((float) run.b().left, (float) run.b().top);
        PointF pointF2 = new PointF((float) (run.a().left - i3), (float) (run.a().top - i2));
        return PropertyValuesHolder.ofObject(SwitchDrawable.n, new TypeEvaluator<PointF>(this) {
            /* class com.shazam.android.widget.text.reflow.ReflowTextAnimatorHelper.AnonymousClass3 */
            private final PointF a = new PointF();

            /* renamed from: a */
            public PointF evaluate(float f, PointF pointF, PointF pointF2) {
                float f2 = pointF.x;
                float f3 = pointF.y;
                this.a.set(f2 + ((pointF2.x - f2) * f), f3 + ((pointF2.y - f3) * f));
                return this.a;
            }
        }, pointF, pointF2);
    }

    private List<Run> j() {
        int i2;
        ArrayList arrayList = new ArrayList();
        Layout layout = this.a.getLayout();
        Layout layout2 = this.b.getLayout();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int max = Math.max(this.a.getLayout().getLineVisibleEnd(this.a.getLayout().getLineCount() - 1), this.b.getLayout().getLineVisibleEnd(this.b.getLayout().getLineCount() - 1)); i4 < max; max = max) {
            boolean z = i4 == max + -1;
            int lineForOffset = layout.getLineForOffset(i4);
            Layout f2 = (z || layout.getText().charAt(i4) != 8230) ? layout : f(this.a);
            int lineForOffset2 = layout2.getLineForOffset(i4);
            layout2 = (z || layout2.getText().charAt(i4) != 8230) ? layout2 : f(this.b);
            if (lineForOffset == i5 && lineForOffset2 == i6 && !z) {
                arrayList = arrayList;
                i2 = 1;
            } else {
                if (z) {
                    i4++;
                }
                int min = Math.min(i5, f2.getLineCount() - 1);
                int min2 = Math.min(i6, layout2.getLineCount() - 1);
                int lineBottom = f2.getLineBottom(min);
                int lineBottom2 = layout2.getLineBottom(min2);
                if (min == 0 && i7 == -1) {
                    i7 = l(f2, min);
                }
                if (min2 == 0 && i8 == -1) {
                    i8 = l(layout2, min2);
                }
                Rect rect = new Rect(i9, i10, i9 + k(f2, i12, i4), lineBottom);
                rect.offset(this.a.getCompoundPaddingLeft() + i7, this.a.getCompoundPaddingTop());
                Rect rect2 = new Rect(i11, i3, k(layout2, i12, i4) + i11, lineBottom2);
                rect2.offset(this.b.getCompoundPaddingLeft() + i8, this.b.getCompoundPaddingTop());
                boolean z2 = lineBottom <= this.a.getMeasuredHeight();
                boolean z3 = lineBottom2 <= this.b.getMeasuredHeight();
                if (!(z2 || z3)) {
                    return arrayList;
                }
                Run run = new Run(rect, z2, rect2, z3);
                arrayList = arrayList;
                arrayList.add(run);
                i9 = (int) f2.getPrimaryHorizontal(i4);
                i10 = f2.getLineTop(lineForOffset);
                i11 = (int) layout2.getPrimaryHorizontal(i4);
                i3 = layout2.getLineTop(lineForOffset2);
                i5 = lineForOffset;
                i6 = lineForOffset2;
                i12 = i4;
                i2 = 1;
                i7 = 0;
                i8 = 0;
            }
            i4 += i2;
            layout = f2;
        }
        return arrayList;
    }

    private static int k(Layout layout, int i2, int i3) {
        return (int) Layout.getDesiredWidth(layout.getText(), i2, i3, layout.getPaint());
    }

    private int l(Layout layout, int i2) {
        return (int) layout.getLineLeft(i2);
    }

    public Animator c() {
        this.k = this.l ? b(this.i.a(this.a), this.i.a(this.b)) : -1;
        this.o = d(this.a);
        this.p = d(this.b);
        this.b.setWillNotDraw(true);
        ((ViewGroup) this.b.getParent()).setClipChildren(false);
        this.n.playTogether(e(this.b, this.o, this.p, j()));
        if (!this.m) {
            this.n.addListener(new AnimatorListenerAdapter() {
                /* class com.shazam.android.widget.text.reflow.ReflowTextAnimatorHelper.AnonymousClass1 */

                public void onAnimationEnd(Animator animator) {
                    ReflowTextAnimatorHelper.this.m();
                }
            });
        }
        return this.n;
    }

    public void m() {
        this.b.setWillNotDraw(false);
        this.b.getOverlay().clear();
        ((ViewGroup) this.b.getParent()).setClipChildren(true);
        Bitmap bitmap = this.o;
        if (bitmap != null) {
            bitmap.recycle();
            this.o = null;
        }
        Bitmap bitmap2 = this.p;
        if (bitmap2 != null) {
            bitmap2.recycle();
            this.p = null;
        }
    }

    private ReflowTextAnimatorHelper(Builder builder) {
        this.n = new AnimatorSet();
        this.c = builder.c;
        this.a = builder.a;
        this.b = builder.b;
        this.e = builder.d;
        this.f = builder.e;
        this.l = builder.i;
        this.j = builder.f;
        this.d = builder.g;
        this.m = builder.h;
        this.g = builder.j;
        this.h = builder.k;
        this.i = builder.l;
    }
}
