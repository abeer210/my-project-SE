package defpackage;

import android.animation.LayoutTransition;
import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* renamed from: r6  reason: default package */
/* compiled from: ViewGroupUtilsApi14 */
public class r6 {
    private static LayoutTransition a;
    private static Field b;
    private static boolean c;
    private static Method d;
    private static boolean e;

    /* access modifiers changed from: package-private */
    /* renamed from: r6$a */
    /* compiled from: ViewGroupUtilsApi14 */
    public static class a extends LayoutTransition {
        public boolean isChangingLayout() {
            return true;
        }
    }

    private static void a(LayoutTransition layoutTransition) {
        boolean z = e;
        String r1 = C0201.m82(37933);
        String r3 = C0201.m82(37934);
        if (!z) {
            try {
                Method declaredMethod = LayoutTransition.class.getDeclaredMethod(C0201.m82(37935), new Class[0]);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.i(r3, r1);
            }
            e = true;
        }
        Method method = d;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new Object[0]);
            } catch (IllegalAccessException unused2) {
                Log.i(r3, r1);
            } catch (InvocationTargetException unused3) {
                Log.i(r3, C0201.m82(37936));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    public static void b(ViewGroup viewGroup, boolean z) {
        LayoutTransition layoutTransition;
        boolean z2 = false;
        if (a == null) {
            a aVar = new a();
            a = aVar;
            aVar.setAnimator(2, null);
            a.setAnimator(0, null);
            a.setAnimator(1, null);
            a.setAnimator(3, null);
            a.setAnimator(4, null);
        }
        if (z) {
            LayoutTransition layoutTransition2 = viewGroup.getLayoutTransition();
            if (layoutTransition2 != null) {
                if (layoutTransition2.isRunning()) {
                    a(layoutTransition2);
                }
                if (layoutTransition2 != a) {
                    viewGroup.setTag(z5.transition_layout_save, layoutTransition2);
                }
            }
            viewGroup.setLayoutTransition(a);
            return;
        }
        viewGroup.setLayoutTransition(null);
        boolean z3 = c;
        String r0 = C0201.m82(37937);
        if (!z3) {
            try {
                Field declaredField = ViewGroup.class.getDeclaredField(C0201.m82(37938));
                b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i(r0, C0201.m82(37939));
            }
            c = true;
        }
        Field field = b;
        if (field != null) {
            try {
                boolean z4 = field.getBoolean(viewGroup);
                if (z4) {
                    try {
                        b.setBoolean(viewGroup, false);
                    } catch (IllegalAccessException unused2) {
                        z2 = z4;
                    }
                }
                z2 = z4;
            } catch (IllegalAccessException unused3) {
                Log.i(r0, C0201.m82(37940));
                if (z2) {
                }
                layoutTransition = (LayoutTransition) viewGroup.getTag(z5.transition_layout_save);
                if (layoutTransition == null) {
                }
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        layoutTransition = (LayoutTransition) viewGroup.getTag(z5.transition_layout_save);
        if (layoutTransition == null) {
            viewGroup.setTag(z5.transition_layout_save, null);
            viewGroup.setLayoutTransition(layoutTransition);
        }
    }
}
