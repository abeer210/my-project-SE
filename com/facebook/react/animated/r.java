package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: TransformAnimatedNode */
public class r extends b {
    private final l e;
    private final List<d> f;

    /* access modifiers changed from: private */
    /* compiled from: TransformAnimatedNode */
    public class b extends d {
        public int b;

        private b(r rVar) {
            super();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: TransformAnimatedNode */
    public class c extends d {
        public double b;

        private c(r rVar) {
            super();
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: TransformAnimatedNode */
    public class d {
        public String a;

        private d(r rVar) {
        }
    }

    public r(ReadableMap readableMap, l lVar) {
        ReadableArray array = readableMap.getArray(C0201.m82(28729));
        this.f = new ArrayList(array.size());
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            String string = map.getString(C0201.m82(28730));
            if (map.getString(C0201.m82(28731)).equals(C0201.m82(28732))) {
                b bVar = new b();
                bVar.a = string;
                bVar.b = map.getInt(C0201.m82(28733));
                this.f.add(bVar);
            } else {
                c cVar = new c();
                cVar.a = string;
                cVar.b = map.getDouble(C0201.m82(28734));
                this.f.add(cVar);
            }
        }
        this.e = lVar;
    }

    public void f(JavaOnlyMap javaOnlyMap) {
        double d2;
        ArrayList arrayList = new ArrayList(this.f.size());
        for (d dVar : this.f) {
            if (dVar instanceof b) {
                b l = this.e.l(((b) dVar).b);
                if (l == null) {
                    throw new IllegalArgumentException(C0201.m82(28736));
                } else if (l instanceof s) {
                    d2 = ((s) l).i();
                } else {
                    throw new IllegalArgumentException(C0201.m82(28735) + l.getClass());
                }
            } else {
                d2 = ((c) dVar).b;
            }
            arrayList.add(JavaOnlyMap.of(dVar.a, Double.valueOf(d2)));
        }
        javaOnlyMap.putArray(C0201.m82(28737), JavaOnlyArray.from(arrayList));
    }
}
