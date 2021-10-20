package net.alhazmy13.hijridatepicker;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import androidx.core.content.b;
import vigqyno.C0201;

/* compiled from: Utils */
public class j {
    public static int a(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.8f;
        return Color.HSVToColor(fArr);
    }

    public static int b(Context context) {
        TypedValue typedValue = new TypedValue();
        if (Build.VERSION.SDK_INT >= 21) {
            context.getTheme().resolveAttribute(16843829, typedValue, true);
            return typedValue.data;
        }
        int identifier = context.getResources().getIdentifier(C0201.m82(27799), C0201.m82(27800), context.getPackageName());
        if (identifier == 0 || !context.getTheme().resolveAttribute(identifier, typedValue, true)) {
            return b.d(context, c.mdtp_accent_color);
        }
        return typedValue.data;
    }

    public static ObjectAnimator c(View view, float f, float f2) {
        Keyframe ofFloat = Keyframe.ofFloat(0.0f, 1.0f);
        Keyframe ofFloat2 = Keyframe.ofFloat(0.275f, f);
        Keyframe ofFloat3 = Keyframe.ofFloat(0.69f, f2);
        Keyframe ofFloat4 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofKeyframe(C0201.m82(27801), ofFloat, ofFloat2, ofFloat3, ofFloat4), PropertyValuesHolder.ofKeyframe(C0201.m82(27802), ofFloat, ofFloat2, ofFloat3, ofFloat4));
        ofPropertyValuesHolder.setDuration(544L);
        return ofPropertyValuesHolder;
    }

    public static boolean d(Context context, boolean z) {
        return f(context, b.mdtp_theme_dark, z);
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 16;
    }

    private static boolean f(Context context, int i, boolean z) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getBoolean(0, z);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @SuppressLint({"NewApi"})
    public static void g(View view, CharSequence charSequence) {
        if (e() && view != null && charSequence != null) {
            view.announceForAccessibility(charSequence);
        }
    }
}
