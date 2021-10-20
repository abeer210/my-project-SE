package com.facebook.react.uimanager;

import com.facebook.react.common.a;
import com.facebook.yoga.p;

/* compiled from: YogaNodePool */
public class d1 {
    private static final Object a = new Object();
    private static a<p> b;

    public static a<p> a() {
        a<p> aVar;
        a<p> aVar2 = b;
        if (aVar2 != null) {
            return aVar2;
        }
        synchronized (a) {
            if (b == null) {
                b = new a<>(1024);
            }
            aVar = b;
        }
        return aVar;
    }
}
