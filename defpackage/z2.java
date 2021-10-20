package defpackage;

import android.view.MotionEvent;

/* renamed from: z2  reason: default package */
/* compiled from: MotionEventCompat */
public final class z2 {
    @Deprecated
    public static int a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    public static int b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    public static int c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    public static int d(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    public static float e(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    public static float f(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    public static boolean g(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
