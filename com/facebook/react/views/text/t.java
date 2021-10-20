package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: ReactTypefaceUtils */
public class t {
    public static Typeface a(Typeface typeface, int i, int i2, String str, AssetManager assetManager) {
        int i3 = 0;
        int style = typeface == null ? 0 : typeface.getStyle();
        if (i2 == 1 || ((style & 1) != 0 && i2 == -1)) {
            i3 = 1;
        }
        if (i == 2 || ((style & 2) != 0 && i == -1)) {
            i3 |= 2;
        }
        if (str != null) {
            typeface = i.b().c(str, i3, i2, assetManager);
        } else if (typeface != null) {
            typeface = Typeface.create(typeface, i3);
        }
        if (typeface != null) {
            return typeface;
        }
        return Typeface.defaultFromStyle(i3);
    }

    public static int b(String str) {
        if (C0201.m82(37903).equals(str)) {
            return 2;
        }
        return C0201.m82(37904).equals(str) ? 0 : -1;
    }

    public static String c(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readableArray.size(); i++) {
            String string = readableArray.getString(i);
            if (string != null) {
                char c = 65535;
                switch (string.hashCode()) {
                    case -1195362251:
                        if (string.equals(C0201.m82(37909))) {
                            c = 4;
                            break;
                        }
                        break;
                    case -1061392823:
                        if (string.equals(C0201.m82(37908))) {
                            c = 2;
                            break;
                        }
                        break;
                    case -771984547:
                        if (string.equals(C0201.m82(37907))) {
                            c = 3;
                            break;
                        }
                        break;
                    case -659678800:
                        if (string.equals(C0201.m82(37906))) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1183323111:
                        if (string.equals(C0201.m82(37905))) {
                            c = 0;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    arrayList.add(C0201.m82(37914));
                } else if (c == 1) {
                    arrayList.add(C0201.m82(37913));
                } else if (c == 2) {
                    arrayList.add(C0201.m82(37912));
                } else if (c == 3) {
                    arrayList.add(C0201.m82(37911));
                } else if (c == 4) {
                    arrayList.add(C0201.m82(37910));
                }
            }
        }
        return TextUtils.join(C0201.m82(37915), arrayList);
    }

    public static int d(String str) {
        int e = str != null ? e(str) : -1;
        if (e == -1) {
            e = 0;
        }
        if (e == 700 || C0201.m82(37916).equals(str)) {
            return 1;
        }
        if (e == 400 || C0201.m82(37917).equals(str)) {
            return 0;
        }
        return e;
    }

    private static int e(String str) {
        if (str.length() != 3 || !str.endsWith(C0201.m82(37918)) || str.charAt(0) > '9' || str.charAt(0) < '1') {
            return -1;
        }
        return (str.charAt(0) - '0') * 100;
    }
}
