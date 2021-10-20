package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import vigqyno.C0201;

/* compiled from: RNGestureHandlerInteractionManager */
public class d implements xp2 {
    private SparseArray<int[]> a = new SparseArray<>();
    private SparseArray<int[]> b = new SparseArray<>();

    private int[] f(ReadableMap readableMap, String str) {
        ReadableArray array = readableMap.getArray(str);
        int size = array.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = array.getInt(i);
        }
        return iArr;
    }

    @Override // defpackage.xp2
    public boolean a(wp2 wp2, wp2 wp22) {
        return false;
    }

    @Override // defpackage.xp2
    public boolean b(wp2 wp2, wp2 wp22) {
        int[] iArr = this.b.get(wp2.q());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == wp22.q()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.xp2
    public boolean c(wp2 wp2, wp2 wp22) {
        int[] iArr = this.a.get(wp2.q());
        if (iArr != null) {
            for (int i : iArr) {
                if (i == wp22.q()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.xp2
    public boolean d(wp2 wp2, wp2 wp22) {
        return false;
    }

    public void e(wp2 wp2, ReadableMap readableMap) {
        wp2.J(this);
        String r0 = C0201.m82(18391);
        if (readableMap.hasKey(r0)) {
            this.a.put(wp2.q(), f(readableMap, r0));
        }
        String r02 = C0201.m82(18392);
        if (readableMap.hasKey(r02)) {
            this.b.put(wp2.q(), f(readableMap, r02));
        }
    }

    public void g(int i) {
        this.a.remove(i);
        this.b.remove(i);
    }

    public void h() {
        this.a.clear();
        this.b.clear();
    }
}
