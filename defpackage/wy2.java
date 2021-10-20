package defpackage;

import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: wy2  reason: default package */
/* compiled from: BarcodeFormatUtils */
public class wy2 {
    public static final SparseArray<String> a;
    public static final Map<String, Integer> b;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        sparseArray.put(1, C0201.m82(16807));
        sparseArray.put(2, C0201.m82(16808));
        sparseArray.put(4, C0201.m82(16809));
        sparseArray.put(8, C0201.m82(16810));
        sparseArray.put(16, C0201.m82(16811));
        sparseArray.put(32, C0201.m82(16812));
        sparseArray.put(64, C0201.m82(16813));
        sparseArray.put(128, C0201.m82(16814));
        sparseArray.put(256, C0201.m82(16815));
        String r6 = C0201.m82(16816);
        sparseArray.put(512, r6);
        sparseArray.put(1024, C0201.m82(16817));
        sparseArray.put(2048, C0201.m82(16818));
        sparseArray.put(4096, C0201.m82(16819));
        sparseArray.put(0, C0201.m82(16820));
        sparseArray.put(11, C0201.m82(16821));
        sparseArray.put(1, C0201.m82(16822));
        sparseArray.put(12, C0201.m82(16823));
        sparseArray.put(2, C0201.m82(16824));
        sparseArray.put(10, C0201.m82(16825));
        sparseArray.put(3, C0201.m82(16826));
        sparseArray.put(4, C0201.m82(16827));
        sparseArray.put(5, C0201.m82(16828));
        sparseArray.put(6, C0201.m82(16829));
        sparseArray.put(7, C0201.m82(16830));
        sparseArray.put(512, r6);
        sparseArray.put(8, C0201.m82(16831));
        sparseArray.put(9, C0201.m82(16832));
        sparseArray.put(-1, C0201.m82(16833));
        a = sparseArray;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < sparseArray.size(); i++) {
            hashMap.put(sparseArray.valueAt(i), Integer.valueOf(sparseArray.keyAt(i)));
        }
        b = Collections.unmodifiableMap(hashMap);
    }

    public static String a(int i) {
        return a.get(i, C0201.m82(16834));
    }
}
