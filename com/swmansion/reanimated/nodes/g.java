package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.e;
import java.text.NumberFormat;
import java.util.Locale;
import vigqyno.C0201;

/* compiled from: ConcatNode */
public class g extends m {
    private static final NumberFormat b;
    private final int[] a;

    static {
        NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
        b = instance;
        instance.setMinimumFractionDigits(0);
        b.setGroupingUsed(false);
    }

    public g(int i, ReadableMap readableMap, b bVar) {
        super(i, readableMap, bVar);
        this.a = e.a(readableMap.getArray(C0201.m82(24701)));
    }

    /* renamed from: c */
    public String evaluate() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                return sb.toString();
            }
            Object value = this.mNodesManager.o(iArr[i], m.class).value();
            if (value instanceof Double) {
                value = b.format((Double) value);
            }
            sb.append(value);
            i++;
        }
    }
}
