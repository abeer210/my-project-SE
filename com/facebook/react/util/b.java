package com.facebook.react.util;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import vigqyno.C0201;

/* compiled from: JSStackTrace */
public class b {
    private static final Pattern a = Pattern.compile(C0201.m82(15420));

    public static String a(String str, ReadableArray readableArray) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(C0201.m82(15421));
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            sb.append(map.getString(C0201.m82(15422)));
            sb.append(C0201.m82(15423));
            sb.append(b(map));
            String r2 = C0201.m82(15424);
            if (!map.hasKey(r2) || map.isNull(r2) || map.getType(r2) != ReadableType.Number) {
                sb.append(-1);
            } else {
                sb.append(map.getInt(r2));
            }
            String r22 = C0201.m82(15425);
            if (map.hasKey(r22) && !map.isNull(r22) && map.getType(r22) == ReadableType.Number) {
                sb.append(C0201.m82(15426));
                sb.append(map.getInt(r22));
            }
            sb.append(C0201.m82(15427));
        }
        return sb.toString();
    }

    private static String b(ReadableMap readableMap) {
        String string;
        String r0 = C0201.m82(15428);
        if (readableMap.hasKey(r0) && !readableMap.isNull(r0) && readableMap.getType(r0) == ReadableType.String && (string = readableMap.getString(r0)) != null) {
            Matcher matcher = a.matcher(string);
            if (matcher.find()) {
                return matcher.group(1) + C0201.m82(15429);
            }
        }
        return C0201.m82(15430);
    }
}
