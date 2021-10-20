package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: m3  reason: default package */
/* compiled from: ViewGroupCompat */
public final class m3 {
    public static boolean a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(e1.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && k3.D(viewGroup) == null) ? false : true;
    }
}
