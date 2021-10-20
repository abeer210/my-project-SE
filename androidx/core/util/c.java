package androidx.core.util;

import android.os.Build;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: ObjectsCompat */
public class c {
    public static boolean a(Object obj, Object obj2) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.equals(obj, obj2);
        }
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Objects.hash(objArr);
        }
        return Arrays.hashCode(objArr);
    }
}
