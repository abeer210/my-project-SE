package com.facebook.react.views.image;

import android.graphics.Bitmap;
import java.util.LinkedList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: MultiPostprocessor */
public class e implements kh0 {
    private final List<kh0> a;

    private e(List<kh0> list) {
        this.a = new LinkedList(list);
    }

    public static kh0 d(List<kh0> list) {
        int size = list.size();
        if (size == 0) {
            return null;
        }
        if (size != 1) {
            return new e(list);
        }
        return list.get(0);
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.kh0
    public v60<Bitmap> b(Bitmap bitmap, oc0 oc0) {
        v60<Bitmap> v60 = null;
        try {
            v60<Bitmap> v602 = null;
            for (kh0 kh0 : this.a) {
                v60 = kh0.b(v602 != null ? v602.w() : bitmap, oc0);
                v60.s(v602);
                v602 = v60.clone();
            }
            v60<Bitmap> c = v60.clone();
            v60.s(v60);
            return c;
        } catch (Throwable th) {
            v60.s(null);
            throw th;
        }
    }

    @Override // defpackage.kh0
    public m40 c() {
        LinkedList linkedList = new LinkedList();
        for (kh0 kh0 : this.a) {
            linkedList.push(kh0.c());
        }
        return new o40(linkedList);
    }

    @Override // defpackage.kh0
    public String getName() {
        StringBuilder sb = new StringBuilder();
        for (kh0 kh0 : this.a) {
            if (sb.length() > 0) {
                sb.append(C0201.m82(31749));
            }
            sb.append(kh0.getName());
        }
        sb.insert(0, C0201.m82(31750));
        sb.append(C0201.m82(31751));
        return sb.toString();
    }
}
