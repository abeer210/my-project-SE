package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;
import vigqyno.C0201;

/* compiled from: CompoundButtonCompat */
public final class c {
    private static Field a;
    private static boolean b;

    public static Drawable a(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 23) {
            return compoundButton.getButtonDrawable();
        }
        boolean z = b;
        String r1 = C0201.m82(28258);
        if (!z) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField(C0201.m82(28259));
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.i(r1, C0201.m82(28260), e);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                return (Drawable) field.get(compoundButton);
            } catch (IllegalAccessException e2) {
                Log.i(r1, C0201.m82(28261), e2);
                a = null;
            }
        }
        return null;
    }

    public static ColorStateList b(CompoundButton compoundButton) {
        if (Build.VERSION.SDK_INT >= 21) {
            return compoundButton.getButtonTintList();
        }
        if (compoundButton instanceof k) {
            return ((k) compoundButton).getSupportButtonTintList();
        }
        return null;
    }

    public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintList(colorStateList);
        } else if (compoundButton instanceof k) {
            ((k) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            compoundButton.setButtonTintMode(mode);
        } else if (compoundButton instanceof k) {
            ((k) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
