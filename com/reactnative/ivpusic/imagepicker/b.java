package com.reactnative.ivpusic.imagepicker;

import android.media.ExifInterface;
import android.os.Build;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

/* compiled from: ExifExtractor */
public class b {
    public static WritableMap a(String str) throws IOException {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        List<String> b = b();
        if (Build.VERSION.SDK_INT >= 23) {
            b.addAll(c());
        }
        ExifInterface exifInterface = new ExifInterface(str);
        for (String str2 : b) {
            writableNativeMap.putString(str2, exifInterface.getAttribute(str2));
        }
        return writableNativeMap;
    }

    private static List<String> b() {
        return new ArrayList(Arrays.asList(C0201.m82(2529), C0201.m82(2530), C0201.m82(2531), C0201.m82(2532), C0201.m82(2533), C0201.m82(2534), C0201.m82(2535), C0201.m82(2536), C0201.m82(2537), C0201.m82(2538), C0201.m82(2539), C0201.m82(2540), C0201.m82(2541), C0201.m82(2542), C0201.m82(2543), C0201.m82(2544), C0201.m82(2545), C0201.m82(2546), C0201.m82(2547), C0201.m82(2548), C0201.m82(2549)));
    }

    private static List<String> c() {
        return new ArrayList(Arrays.asList(C0201.m82(2550), C0201.m82(2551), C0201.m82(2552), C0201.m82(2553)));
    }
}
