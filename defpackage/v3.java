package defpackage;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: v3  reason: default package */
/* compiled from: AccessibilityEventCompat */
public final class v3 {
    public static int a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    public static void b(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
