package defpackage;

import android.view.View;

/* renamed from: yj2  reason: default package */
/* compiled from: ViewTags */
public class yj2 {
    public static <T> T a(View view, int i) {
        return (T) b(view, i, null);
    }

    public static <T> T b(View view, int i, T t) {
        return view.getTag(i) == null ? t : (T) view.getTag(i);
    }
}
