package fr.greweb.reactnativeviewshot;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.util.d;
import java.util.Locale;
import java.util.Stack;
import vigqyno.C0201;

/* compiled from: DebugViews */
public final class a {
    public static final Matrix a = new Matrix();

    @TargetApi(21)
    private static String a(Resources resources, View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(34429));
        sb.append(C0201.m82(34430));
        sb.append(view.getId());
        sb.append(e(resources, view));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            sb.append(C0201.m82(34434));
        } else if (visibility == 4) {
            sb.append(C0201.m82(34433));
        } else if (visibility != 8) {
            sb.append(C0201.m82(34431));
        } else {
            sb.append(C0201.m82(34432));
        }
        boolean equals = view.getMatrix().equals(a);
        String r1 = C0201.m82(34435);
        String r2 = C0201.m82(34436);
        String r3 = C0201.m82(34437);
        if (!equals) {
            sb.append(r1);
            sb.append(C0201.m82(34438));
            sb.append(view.getMatrix().toShortString());
            if (!(0.0f == view.getRotation() && 0.0f == view.getRotationX() && 0.0f == view.getRotationY())) {
                sb.append(C0201.m82(34439));
                sb.append(view.getRotation());
                sb.append(r3);
                sb.append(view.getRotationX());
                sb.append(r3);
                sb.append(view.getRotationY());
                sb.append(r2);
                if (!(((float) (view.getWidth() / 2)) == view.getPivotX() && ((float) (view.getHeight() / 2)) == view.getPivotY())) {
                    sb.append(C0201.m82(34440));
                    sb.append(view.getPivotX());
                    sb.append(r3);
                    sb.append(view.getPivotY());
                    sb.append(r2);
                }
            }
            if (Build.VERSION.SDK_INT >= 21 && !(0.0f == view.getTranslationX() && 0.0f == view.getTranslationY() && 0.0f == view.getTranslationZ())) {
                sb.append(C0201.m82(34441));
                sb.append(view.getTranslationX());
                sb.append(r3);
                sb.append(view.getTranslationY());
                sb.append(r3);
                sb.append(view.getTranslationZ());
                sb.append(r2);
            }
            if (!(1.0f == view.getScaleX() && 1.0f == view.getScaleY())) {
                sb.append(C0201.m82(34442));
                sb.append(view.getScaleX());
                sb.append(r3);
                sb.append(view.getScaleY());
                sb.append(r2);
            }
        }
        if (!(view.getPaddingStart() == 0 && view.getPaddingTop() == 0 && view.getPaddingEnd() == 0 && view.getPaddingBottom() == 0)) {
            sb.append(r1);
            sb.append(C0201.m82(34443));
            sb.append(view.getPaddingStart());
            sb.append(r3);
            sb.append(view.getPaddingTop());
            sb.append(r3);
            sb.append(view.getPaddingEnd());
            sb.append(r3);
            sb.append(view.getPaddingBottom());
            sb.append(r2);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (!(marginLayoutParams.leftMargin == 0 && marginLayoutParams.topMargin == 0 && marginLayoutParams.rightMargin == 0 && marginLayoutParams.bottomMargin == 0)) {
                sb.append(r1);
                sb.append(C0201.m82(34444));
                sb.append(marginLayoutParams.leftMargin);
                sb.append(r3);
                sb.append(marginLayoutParams.topMargin);
                sb.append(r3);
                sb.append(marginLayoutParams.rightMargin);
                sb.append(r3);
                sb.append(marginLayoutParams.bottomMargin);
                sb.append(r2);
            }
        }
        sb.append(C0201.m82(34445));
        sb.append(view.getLeft());
        sb.append(r3);
        sb.append(view.getTop());
        sb.append(r2);
        sb.append(C0201.m82(34446));
        sb.append(view.getWidth());
        sb.append(r3);
        sb.append(view.getHeight());
        sb.append(r2);
        if (view instanceof TextView) {
            sb.append(C0201.m82(34447));
            sb.append(((TextView) view).getText());
            sb.append(C0201.m82(34448));
        }
        return sb.toString();
    }

    public static String b(Activity activity) {
        View findViewById = activity.findViewById(16908290);
        if (findViewById != null) {
            return c(findViewById);
        }
        return C0201.m82(34449) + activity.getClass().getSimpleName() + C0201.m82(34450);
    }

    private static String c(View view) {
        StringBuilder sb = new StringBuilder(8192);
        String r1 = C0201.m82(34451);
        sb.append(r1);
        Resources resources = view.getResources();
        Stack stack = new Stack();
        String r4 = C0201.m82(34452);
        stack.push(d.a(r4, view));
        while (!stack.empty()) {
            d dVar = (d) stack.pop();
            S s = dVar.b;
            F f = dVar.a;
            boolean z = stack.empty() || !f.equals(((d) stack.peek()).a);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(r4);
            sb2.append((String) f);
            sb2.append(z ? C0201.m82(34453) : C0201.m82(34454));
            sb.append(sb2.toString() + s.getClass().getSimpleName() + a(resources, s));
            sb.append(r1);
            if (s instanceof ViewGroup) {
                S s2 = s;
                for (int childCount = s2.getChildCount() - 1; childCount >= 0; childCount--) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append((String) f);
                    sb3.append(z ? C0201.m82(34455) : C0201.m82(34456));
                    stack.push(d.a(sb3.toString(), s2.getChildAt(childCount)));
                }
            }
        }
        return sb.toString();
    }

    public static int d(String str, String str2) {
        int i = 0;
        while (str2.length() > 0) {
            int indexOf = str2.indexOf(C0201.m82(34457));
            int min = Math.min(str2.length(), Math.min(indexOf < 0 ? 200 : indexOf + 1, 200));
            Log.d(str, String.format(Locale.US, C0201.m82(34458), Integer.valueOf(i), str2.substring(0, min)));
            str2 = str2.substring(min);
            i++;
        }
        return i;
    }

    private static String e(Resources resources, View view) {
        String r0 = C0201.m82(34459);
        if (resources == null) {
            return r0;
        }
        try {
            return C0201.m82(34460) + resources.getResourceEntryName(view.getId());
        } catch (Throwable unused) {
            return r0;
        }
    }
}
