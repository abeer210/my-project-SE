package com.reactcommunity.rndatetimepicker;

import androidx.fragment.app.c;
import androidx.fragment.app.d;
import com.facebook.react.bridge.Promise;
import vigqyno.C0201;

/* compiled from: Common */
public class a {
    public static void a(d dVar, String str, Promise promise) {
        if (dVar == null) {
            promise.reject(C0201.m82(36225), C0201.m82(36223) + str + C0201.m82(36224));
            return;
        }
        c cVar = (c) dVar.p().c(str);
        boolean z = cVar != null;
        if (z) {
            cVar.t();
        }
        promise.resolve(Boolean.valueOf(z));
    }
}
