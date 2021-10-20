package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.lang.reflect.Field;
import vigqyno.C0201;

public final class ImmLeaksCleaner implements e {
    private static int b;
    private static Field c;
    private static Field d;
    private static Field e;
    private Activity a;

    public ImmLeaksCleaner(Activity activity) {
        this.a = activity;
    }

    private static void h() {
        try {
            b = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField(C0201.m82(1001));
            d = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField(C0201.m82(1002));
            e = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField(C0201.m82(1003));
            c = declaredField3;
            declaredField3.setAccessible(true);
            b = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.e
    public void c(g gVar, d.a aVar) {
        if (aVar == d.a.ON_DESTROY) {
            if (b == 0) {
                h();
            }
            if (b == 1) {
                InputMethodManager inputMethodManager = (InputMethodManager) this.a.getSystemService(C0201.m82(1004));
                try {
                    Object obj = c.get(inputMethodManager);
                    if (obj != null) {
                        synchronized (obj) {
                            try {
                                View view = (View) d.get(inputMethodManager);
                                if (view != null) {
                                    if (!view.isAttachedToWindow()) {
                                        try {
                                            e.set(inputMethodManager, null);
                                            inputMethodManager.isActive();
                                        } catch (IllegalAccessException unused) {
                                        }
                                    }
                                }
                            } catch (IllegalAccessException unused2) {
                            } catch (ClassCastException unused3) {
                            }
                        }
                    }
                } catch (IllegalAccessException unused4) {
                }
            }
        }
    }
}
