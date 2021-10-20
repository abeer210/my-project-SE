package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: ma0  reason: default package */
/* compiled from: AspectRatioMeasure */
public class ma0 {

    /* renamed from: ma0$a */
    /* compiled from: AspectRatioMeasure */
    public static class a {
        public int a;
        public int b;
    }

    private static boolean a(int i) {
        return i == 0 || i == -2;
    }

    public static void b(a aVar, float f, ViewGroup.LayoutParams layoutParams, int i, int i2) {
        if (f > 0.0f && layoutParams != null) {
            if (a(layoutParams.height)) {
                aVar.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.a) - i)) / f) + ((float) i2)), aVar.b), 1073741824);
            } else if (a(layoutParams.width)) {
                aVar.a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (View.MeasureSpec.getSize(aVar.b) - i2)) * f) + ((float) i)), aVar.a), 1073741824);
            }
        }
    }
}
