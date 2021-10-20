package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* compiled from: TransformNode */
public class t extends m {
    private List<d> a;

    /* access modifiers changed from: private */
    /* compiled from: TransformNode */
    public static class b extends d {
        public int b;

        private b() {
            super();
        }

        @Override // com.swmansion.reanimated.nodes.t.d
        public Object a(com.swmansion.reanimated.b bVar) {
            return bVar.p(this.b);
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: TransformNode */
    public static class c extends d {
        public Object b;

        private c() {
            super();
        }

        @Override // com.swmansion.reanimated.nodes.t.d
        public Object a(com.swmansion.reanimated.b bVar) {
            return this.b;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: TransformNode */
    public static abstract class d {
        public String a;

        private d() {
        }

        public abstract Object a(com.swmansion.reanimated.b bVar);
    }

    public t(int i, ReadableMap readableMap, com.swmansion.reanimated.b bVar) {
        super(i, readableMap, bVar);
        this.a = d(readableMap.getArray(C0201.m82(20922)));
    }

    private static List<d> d(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            ReadableMap map = readableArray.getMap(i);
            String string = map.getString(C0201.m82(20923));
            String r4 = C0201.m82(20924);
            if (map.hasKey(r4)) {
                b bVar = new b();
                bVar.a = string;
                bVar.b = map.getInt(r4);
                arrayList.add(bVar);
            } else {
                c cVar = new c();
                cVar.a = string;
                String r3 = C0201.m82(20925);
                ReadableType type = map.getType(r3);
                if (type == ReadableType.String) {
                    cVar.b = map.getString(r3);
                } else if (type == ReadableType.Array) {
                    cVar.b = map.getArray(r3);
                } else {
                    cVar.b = Double.valueOf(map.getDouble(r3));
                }
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public WritableArray evaluate() {
        ArrayList arrayList = new ArrayList(this.a.size());
        for (d dVar : this.a) {
            arrayList.add(JavaOnlyMap.of(dVar.a, dVar.a(this.mNodesManager)));
        }
        return JavaOnlyArray.from(arrayList);
    }
}
