package defpackage;

import android.text.TextUtils;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: xc2  reason: default package */
/* compiled from: ReadableMapUtils */
public class xc2 {
    public static boolean a(Class cls, ReadableMap readableMap, String str) {
        if (!readableMap.hasKey(str) || readableMap.isNull(str)) {
            return false;
        }
        if (String.class.equals(cls)) {
            return !TextUtils.isEmpty(readableMap.getString(str));
        }
        return true;
    }

    public static boolean b(ReadableMap readableMap, String str) {
        return a(String.class, readableMap, str);
    }

    public static boolean c(ReadableMap readableMap, String str) {
        return a(ReadableMap.class, readableMap, str);
    }
}
