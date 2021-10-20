package com.aurelhubert.ahbottomnavigation;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/* compiled from: AHHelper */
public class s {

    /* compiled from: AHHelper */
    public interface a<T> {
        T map(T t);
    }

    public static boolean a(Object obj, Object obj2) {
        return (obj == null && obj2 == null) || (obj != null && obj.equals(obj2));
    }

    public static <T> void b(ArrayList<T> arrayList, int i, T t) {
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(t);
        }
    }

    public static Drawable c(Drawable drawable, Integer num, boolean z) {
        if (num == null) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (Build.VERSION.SDK_INT >= 21) {
                mutate.setTintList(null);
            }
            return mutate;
        } else if (z) {
            drawable.clearColorFilter();
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            drawable.invalidateSelf();
            return drawable;
        } else {
            Drawable mutate2 = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.n(mutate2, num.intValue());
            return mutate2;
        }
    }

    public static boolean d(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NullPointerException | NumberFormatException unused) {
            return false;
        }
    }

    public static /* synthetic */ void f(ImageView imageView, Drawable drawable, boolean z, ValueAnimator valueAnimator) {
        imageView.setImageDrawable(c(drawable, (Integer) valueAnimator.getAnimatedValue(), z));
        imageView.requestLayout();
    }

    public static /* synthetic */ void g(View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins((int) floatValue, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.requestLayout();
        }
    }

    public static /* synthetic */ void j(View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMargins(marginLayoutParams.leftMargin, (int) floatValue, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            view.requestLayout();
        }
    }

    public static /* synthetic */ void l(View view, ValueAnimator valueAnimator) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = Math.round(((Float) valueAnimator.getAnimatedValue()).floatValue());
        view.setLayoutParams(layoutParams);
    }

    public static <T> void m(ArrayList<T> arrayList, a<T> aVar) {
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.set(i, aVar.map(arrayList.get(i)));
            }
        }
    }

    public static void n(View view, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new k(view));
        ofFloat.start();
    }

    public static void o(Drawable drawable, ImageView imageView, Integer num, Integer num2, boolean z) {
        if (num == null || num2 == null) {
            imageView.setImageDrawable(c(drawable, num2, z));
            imageView.requestLayout();
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), num, num2);
        ofObject.setDuration(150L);
        ofObject.addUpdateListener(new i(imageView, drawable, z));
        ofObject.start();
    }

    public static void p(View view, int i, int i2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat((float) i, (float) i2);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new m(view));
        ofFloat.start();
    }

    public static void q(AHTextView aHTextView, Integer num, Integer num2) {
        if (num == null || num2 == null) {
            aHTextView.setTextColor(num2);
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), num, num2);
        ofObject.setDuration(150L);
        ofObject.addUpdateListener(new o(aHTextView));
        ofObject.start();
    }

    public static void r(TextView textView, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new l(textView));
        ofFloat.start();
    }

    public static void s(View view, int i, int i2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat((float) i, (float) i2);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new j(view));
        ofFloat.start();
    }

    public static void t(View view, int i, int i2) {
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(150L);
        ofObject.addUpdateListener(new h(view));
        ofObject.start();
    }

    public static void u(View view, float f, float f2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new n(view));
        ofFloat.start();
    }
}
