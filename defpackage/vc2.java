package defpackage;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.LinkedList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: vc2  reason: default package */
/* compiled from: ButtonsHelper */
public class vc2 {
    public final a a;
    public final a b;
    public final a c;
    public final List<a> d;

    /* renamed from: vc2$a */
    /* compiled from: ButtonsHelper */
    public static class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    public vc2(a aVar, a aVar2, a aVar3, LinkedList<a> linkedList) {
        this.a = aVar;
        this.b = aVar2;
        this.c = aVar3;
        this.d = linkedList;
    }

    private static LinkedList<a> b(ReadableMap readableMap) {
        LinkedList<a> linkedList = new LinkedList<>();
        String r1 = C0201.m82(17903);
        if (!readableMap.hasKey(r1)) {
            return linkedList;
        }
        ReadableArray array = readableMap.getArray(r1);
        for (int i = 0; i < array.size(); i++) {
            ReadableMap map = array.getMap(i);
            linkedList.add(new a(map.getString(C0201.m82(17904)), map.getString(C0201.m82(17905))));
        }
        return linkedList;
    }

    private static a c(ReadableMap readableMap, String str, String str2) {
        if (!xc2.b(readableMap, str)) {
            return null;
        }
        return new a(readableMap.getString(str), str2);
    }

    public static vc2 e(ReadableMap readableMap) {
        return new vc2(c(readableMap, C0201.m82(17906), C0201.m82(17907)), c(readableMap, C0201.m82(17908), C0201.m82(17909)), c(readableMap, C0201.m82(17910), C0201.m82(17911)), b(readableMap));
    }

    public List<String> a() {
        LinkedList linkedList = new LinkedList();
        a aVar = this.a;
        if (aVar != null) {
            linkedList.add(aVar.b);
        }
        a aVar2 = this.b;
        if (aVar2 != null) {
            linkedList.add(aVar2.b);
        }
        for (int i = 0; i < this.d.size(); i++) {
            linkedList.add(this.d.get(i).b);
        }
        return linkedList;
    }

    public List<String> d() {
        LinkedList linkedList = new LinkedList();
        a aVar = this.a;
        if (aVar != null) {
            linkedList.add(aVar.a);
        }
        a aVar2 = this.b;
        if (aVar2 != null) {
            linkedList.add(aVar2.a);
        }
        for (int i = 0; i < this.d.size(); i++) {
            linkedList.add(this.d.get(i).a);
        }
        return linkedList;
    }
}
