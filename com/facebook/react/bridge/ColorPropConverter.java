package com.facebook.react.bridge;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import vigqyno.C0201;

public class ColorPropConverter {
    private static final String ATTR = null;
    private static final String ATTR_SEGMENT = null;
    private static final String JSON_KEY = null;
    private static final String PACKAGE_DELIMITER = null;
    private static final String PATH_DELIMITER = null;
    private static final String PREFIX_ATTR = null;
    private static final String PREFIX_RESOURCE = null;

    static {
        C0201.m83(ColorPropConverter.class, 324);
    }

    public static Integer getColor(Object obj, Context context) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return Integer.valueOf(((Double) obj).intValue());
        }
        if (context == null) {
            throw new RuntimeException(C0201.m82(20326));
        } else if (obj instanceof ReadableMap) {
            ReadableArray array = ((ReadableMap) obj).getArray(C0201.m82(20320));
            if (array != null) {
                for (int i = 0; i < array.size(); i++) {
                    String string = array.getString(i);
                    if (string != null && !string.isEmpty()) {
                        boolean startsWith = string.startsWith(C0201.m82(20321));
                        boolean startsWith2 = string.startsWith(C0201.m82(20322));
                        String substring = string.substring(1);
                        if (startsWith) {
                            try {
                                return Integer.valueOf(resolveResource(context, substring));
                            } catch (Resources.NotFoundException unused) {
                            }
                        } else if (startsWith2) {
                            return Integer.valueOf(resolveThemeAttribute(context, substring));
                        }
                    }
                }
                throw new JSApplicationCausedNativeException(C0201.m82(20323));
            }
            throw new JSApplicationCausedNativeException(C0201.m82(20324));
        } else {
            throw new JSApplicationCausedNativeException(C0201.m82(20325));
        }
    }

    private static int resolveResource(Context context, String str) {
        String[] split = str.split(C0201.m82(20327));
        String packageName = context.getPackageName();
        if (split.length > 1) {
            packageName = split[0];
            str = split[1];
        }
        String[] split2 = str.split(C0201.m82(20328));
        String str2 = split2[0];
        return l1.a(context.getResources(), context.getResources().getIdentifier(split2[1], str2, packageName), context.getTheme());
    }

    private static int resolveThemeAttribute(Context context, String str) {
        String replaceAll = str.replaceAll(C0201.m82(20329), C0201.m82(20330));
        String[] split = replaceAll.split(C0201.m82(20331));
        String packageName = context.getPackageName();
        if (split.length > 1) {
            packageName = split[0];
            replaceAll = split[1];
        }
        int identifier = context.getResources().getIdentifier(replaceAll, C0201.m82(20332), packageName);
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(identifier, typedValue, true)) {
            return typedValue.data;
        }
        throw new Resources.NotFoundException();
    }
}
