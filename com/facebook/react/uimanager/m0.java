package com.facebook.react.uimanager;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import vigqyno.C0201;

/* compiled from: TransformHelper */
public class m0 {
    private static ThreadLocal<double[]> a = new a();

    /* compiled from: TransformHelper */
    static class a extends ThreadLocal<double[]> {
        /* renamed from: a */
        public double[] initialValue() {
            return new double[16];
        }
    }

    private static double a(ReadableMap readableMap, String str) {
        double d;
        boolean z = true;
        if (readableMap.getType(str) == ReadableType.String) {
            String string = readableMap.getString(str);
            if (string.endsWith(C0201.m82(9041))) {
                string = string.substring(0, string.length() - 3);
            } else if (string.endsWith(C0201.m82(9042))) {
                string = string.substring(0, string.length() - 3);
                z = false;
            }
            d = (double) Float.parseFloat(string);
        } else {
            d = readableMap.getDouble(str);
        }
        return z ? d : j.l(d);
    }

    public static void b(ReadableArray readableArray, double[] dArr) {
        double[] dArr2 = a.get();
        j.r(dArr);
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            ReadableMap map = readableArray.getMap(i);
            String nextKey = map.keySetIterator().nextKey();
            j.r(dArr2);
            if (C0201.m82(9043).equals(nextKey)) {
                ReadableArray array = map.getArray(nextKey);
                for (int i2 = 0; i2 < 16; i2++) {
                    dArr2[i2] = array.getDouble(i2);
                }
            } else if (C0201.m82(9044).equals(nextKey)) {
                j.a(dArr2, map.getDouble(nextKey));
            } else if (C0201.m82(9045).equals(nextKey)) {
                j.b(dArr2, a(map, nextKey));
            } else if (C0201.m82(9046).equals(nextKey)) {
                j.c(dArr2, a(map, nextKey));
            } else if (C0201.m82(9047).equals(nextKey) || C0201.m82(9048).equals(nextKey)) {
                j.d(dArr2, a(map, nextKey));
            } else if (C0201.m82(9049).equals(nextKey)) {
                double d = map.getDouble(nextKey);
                j.e(dArr2, d);
                j.f(dArr2, d);
            } else if (C0201.m82(9050).equals(nextKey)) {
                j.e(dArr2, map.getDouble(nextKey));
            } else if (C0201.m82(9051).equals(nextKey)) {
                j.f(dArr2, map.getDouble(nextKey));
            } else {
                double d2 = 0.0d;
                if (C0201.m82(9052).equals(nextKey)) {
                    ReadableArray array2 = map.getArray(nextKey);
                    double d3 = array2.getDouble(0);
                    double d4 = array2.getDouble(1);
                    if (array2.size() > 2) {
                        d2 = array2.getDouble(2);
                    }
                    j.j(dArr2, d3, d4, d2);
                } else if (C0201.m82(9053).equals(nextKey)) {
                    j.i(dArr2, map.getDouble(nextKey), 0.0d);
                } else if (C0201.m82(9054).equals(nextKey)) {
                    j.i(dArr2, 0.0d, map.getDouble(nextKey));
                } else if (C0201.m82(9055).equals(nextKey)) {
                    j.g(dArr2, a(map, nextKey));
                } else if (C0201.m82(9056).equals(nextKey)) {
                    j.h(dArr2, a(map, nextKey));
                } else {
                    throw new JSApplicationIllegalArgumentException(C0201.m82(9057) + nextKey);
                }
            }
            j.p(dArr, dArr, dArr2);
        }
    }
}
