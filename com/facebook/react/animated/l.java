package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.c;
import com.facebook.react.uimanager.events.e;
import com.facebook.react.uimanager.g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: NativeAnimatedNodesManager */
public class l implements e {
    private final SparseArray<b> a = new SparseArray<>();
    private final SparseArray<d> b = new SparseArray<>();
    private final SparseArray<b> c = new SparseArray<>();
    private final Map<String, List<EventAnimationDriver>> d = new HashMap();
    private final UIManagerModule.e e;
    private final UIManagerModule f;
    private int g = 0;
    private final List<b> h = new LinkedList();

    /* compiled from: NativeAnimatedNodesManager */
    class a implements Runnable {
        public final /* synthetic */ c a;

        public a(c cVar) {
            this.a = cVar;
        }

        public void run() {
            l.this.m(this.a);
        }
    }

    public l(UIManagerModule uIManagerModule) {
        this.f = uIManagerModule;
        uIManagerModule.getEventDispatcher().s(this);
        this.e = uIManagerModule.getDirectEventNamesResolver();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void m(c cVar) {
        if (!this.d.isEmpty()) {
            String a2 = this.e.a(cVar.f());
            Map<String, List<EventAnimationDriver>> map = this.d;
            List<EventAnimationDriver> list = map.get(cVar.i() + a2);
            if (list != null) {
                for (EventAnimationDriver eventAnimationDriver : list) {
                    w(eventAnimationDriver.mValueNode);
                    cVar.c(eventAnimationDriver);
                    this.h.add(eventAnimationDriver.mValueNode);
                }
                y(this.h);
                this.h.clear();
            }
        }
    }

    private void w(b bVar) {
        int i = 0;
        while (i < this.b.size()) {
            d valueAt = this.b.valueAt(i);
            if (bVar.equals(valueAt.b)) {
                if (valueAt.c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean(C0201.m82(28626), false);
                    valueAt.c.invoke(createMap);
                }
                this.b.removeAt(i);
                i--;
            }
            i++;
        }
    }

    private void y(List<b> list) {
        int i;
        int i2 = this.g + 1;
        this.g = i2;
        if (i2 == 0) {
            this.g = i2 + 1;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i3 = 0;
        for (b bVar : list) {
            int i4 = bVar.c;
            int i5 = this.g;
            if (i4 != i5) {
                bVar.c = i5;
                i3++;
                arrayDeque.add(bVar);
            }
        }
        while (!arrayDeque.isEmpty()) {
            b bVar2 = (b) arrayDeque.poll();
            if (bVar2.a != null) {
                for (int i6 = 0; i6 < bVar2.a.size(); i6++) {
                    b bVar3 = bVar2.a.get(i6);
                    bVar3.b++;
                    int i7 = bVar3.c;
                    int i8 = this.g;
                    if (i7 != i8) {
                        bVar3.c = i8;
                        i3++;
                        arrayDeque.add(bVar3);
                    }
                }
            }
        }
        int i9 = this.g + 1;
        this.g = i9;
        if (i9 == 0) {
            this.g = i9 + 1;
        }
        int i10 = 0;
        for (b bVar4 : list) {
            if (bVar4.b == 0 && bVar4.c != (i = this.g)) {
                bVar4.c = i;
                i10++;
                arrayDeque.add(bVar4);
            }
        }
        while (!arrayDeque.isEmpty()) {
            b bVar5 = (b) arrayDeque.poll();
            bVar5.e();
            if (bVar5 instanceof m) {
                try {
                    ((m) bVar5).i();
                } catch (g e2) {
                    f60.j(C0201.m82(28627), C0201.m82(28628), e2);
                }
            }
            if (bVar5 instanceof s) {
                ((s) bVar5).j();
            }
            if (bVar5.a != null) {
                for (int i11 = 0; i11 < bVar5.a.size(); i11++) {
                    b bVar6 = bVar5.a.get(i11);
                    int i12 = bVar6.b - 1;
                    bVar6.b = i12;
                    int i13 = bVar6.c;
                    int i14 = this.g;
                    if (i13 != i14 && i12 == 0) {
                        bVar6.c = i14;
                        i10++;
                        arrayDeque.add(bVar6);
                    }
                }
            }
        }
        if (i3 != i10) {
            throw new IllegalStateException(C0201.m82(28629) + i3 + C0201.m82(28630) + i10);
        }
    }

    @Override // com.facebook.react.uimanager.events.e
    public void a(c cVar) {
        if (UiThreadUtil.isOnUiThread()) {
            m(cVar);
        } else {
            UiThreadUtil.runOnUiThread(new a(cVar));
        }
    }

    public void c(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt(C0201.m82(28631));
        b bVar = this.a.get(i2);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28634) + i2 + C0201.m82(28635));
        } else if (bVar instanceof s) {
            ReadableArray array = readableMap.getArray(C0201.m82(28632));
            ArrayList arrayList = new ArrayList(array.size());
            for (int i3 = 0; i3 < array.size(); i3++) {
                arrayList.add(array.getString(i3));
            }
            EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList, (s) bVar);
            String str2 = i + str;
            if (this.d.containsKey(str2)) {
                this.d.get(str2).add(eventAnimationDriver);
                return;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(eventAnimationDriver);
            this.d.put(str2, arrayList2);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28633) + s.class.getName());
        }
    }

    public void d(int i, int i2) {
        b bVar = this.a.get(i);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28637) + i + C0201.m82(28638));
        } else if (bVar instanceof m) {
            ((m) bVar).f(i2);
            this.c.put(i, bVar);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28636) + m.class.getName());
        }
    }

    public void e(int i, int i2) {
        b bVar = this.a.get(i);
        String r1 = C0201.m82(28639);
        String r2 = C0201.m82(28640);
        if (bVar != null) {
            b bVar2 = this.a.get(i2);
            if (bVar2 != null) {
                bVar.a(bVar2);
                this.c.put(i2, bVar2);
                return;
            }
            throw new JSApplicationIllegalArgumentException(r2 + i2 + r1);
        }
        throw new JSApplicationIllegalArgumentException(r2 + i + r1);
    }

    public void f(int i, ReadableMap readableMap) {
        b bVar;
        if (this.a.get(i) == null) {
            String string = readableMap.getString(C0201.m82(28641));
            if (C0201.m82(28642).equals(string)) {
                bVar = new o(readableMap, this);
            } else if (C0201.m82(28643).equals(string)) {
                bVar = new s(readableMap);
            } else if (C0201.m82(28644).equals(string)) {
                bVar = new m(readableMap, this, this.f);
            } else if (C0201.m82(28645).equals(string)) {
                bVar = new i(readableMap);
            } else if (C0201.m82(28646).equals(string)) {
                bVar = new a(readableMap, this);
            } else if (C0201.m82(28647).equals(string)) {
                bVar = new p(readableMap, this);
            } else if (C0201.m82(28648).equals(string)) {
                bVar = new g(readableMap, this);
            } else if (C0201.m82(28649).equals(string)) {
                bVar = new k(readableMap, this);
            } else if (C0201.m82(28650).equals(string)) {
                bVar = new j(readableMap, this);
            } else if (C0201.m82(28651).equals(string)) {
                bVar = new f(readableMap, this);
            } else if (C0201.m82(28652).equals(string)) {
                bVar = new r(readableMap, this);
            } else if (C0201.m82(28653).equals(string)) {
                bVar = new q(readableMap, this);
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(28654) + string);
            }
            bVar.d = i;
            this.a.put(i, bVar);
            this.c.put(i, bVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(28655) + i + C0201.m82(28656));
    }

    public void g(int i, int i2) {
        b bVar = this.a.get(i);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28658) + i + C0201.m82(28659));
        } else if (bVar instanceof m) {
            ((m) bVar).g(i2);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28657) + m.class.getName());
        }
    }

    public void h(int i, int i2) {
        b bVar = this.a.get(i);
        String r1 = C0201.m82(28660);
        String r2 = C0201.m82(28661);
        if (bVar != null) {
            b bVar2 = this.a.get(i2);
            if (bVar2 != null) {
                bVar.d(bVar2);
                this.c.put(i2, bVar2);
                return;
            }
            throw new JSApplicationIllegalArgumentException(r2 + i2 + r1);
        }
        throw new JSApplicationIllegalArgumentException(r2 + i + r1);
    }

    public void i(int i) {
        this.a.remove(i);
        this.c.remove(i);
    }

    public void j(int i) {
        b bVar = this.a.get(i);
        if (bVar == null || !(bVar instanceof s)) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28662) + i + C0201.m82(28663));
        }
        ((s) bVar).f();
    }

    public void k(int i) {
        b bVar = this.a.get(i);
        if (bVar == null || !(bVar instanceof s)) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28664) + i + C0201.m82(28665));
        }
        ((s) bVar).g();
    }

    public b l(int i) {
        return this.a.get(i);
    }

    public boolean n() {
        return this.b.size() > 0 || this.c.size() > 0;
    }

    public void o(int i, String str, int i2) {
        String str2 = i + str;
        if (this.d.containsKey(str2)) {
            List<EventAnimationDriver> list = this.d.get(str2);
            if (list.size() == 1) {
                this.d.remove(i + str);
                return;
            }
            ListIterator<EventAnimationDriver> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next().mValueNode.d == i2) {
                    listIterator.remove();
                    return;
                }
            }
        }
    }

    public void p(int i) {
        b bVar = this.a.get(i);
        if (bVar != null) {
            if (bVar instanceof m) {
                ((m) bVar).h();
                return;
            }
            throw new JSApplicationIllegalArgumentException(C0201.m82(28666) + m.class.getName());
        }
    }

    public void q(long j) {
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < this.c.size(); i++) {
            this.h.add(this.c.valueAt(i));
        }
        this.c.clear();
        boolean z = false;
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            d valueAt = this.b.valueAt(i2);
            valueAt.b(j);
            this.h.add(valueAt.b);
            if (valueAt.a) {
                z = true;
            }
        }
        y(this.h);
        this.h.clear();
        if (z) {
            for (int size = this.b.size() - 1; size >= 0; size--) {
                d valueAt2 = this.b.valueAt(size);
                if (valueAt2.a) {
                    if (valueAt2.c != null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putBoolean(C0201.m82(28667), true);
                        valueAt2.c.invoke(createMap);
                    }
                    this.b.removeAt(size);
                }
            }
        }
    }

    public void r(int i, double d2) {
        b bVar = this.a.get(i);
        if (bVar == null || !(bVar instanceof s)) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28668) + i + C0201.m82(28669));
        }
        ((s) bVar).g = d2;
        this.c.put(i, bVar);
    }

    public void s(int i, double d2) {
        b bVar = this.a.get(i);
        if (bVar == null || !(bVar instanceof s)) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28670) + i + C0201.m82(28671));
        }
        w(bVar);
        ((s) bVar).f = d2;
        this.c.put(i, bVar);
    }

    public void t(int i, int i2, ReadableMap readableMap, Callback callback) {
        d dVar;
        b bVar = this.a.get(i2);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28678) + i2 + C0201.m82(28679));
        } else if (bVar instanceof s) {
            d dVar2 = this.b.get(i);
            if (dVar2 != null) {
                dVar2.a(readableMap);
                return;
            }
            String string = readableMap.getString(C0201.m82(28672));
            if (C0201.m82(28673).equals(string)) {
                dVar = new h(readableMap);
            } else if (C0201.m82(28674).equals(string)) {
                dVar = new n(readableMap);
            } else if (C0201.m82(28675).equals(string)) {
                dVar = new e(readableMap);
            } else {
                throw new JSApplicationIllegalArgumentException(C0201.m82(28676) + string);
            }
            dVar.d = i;
            dVar.c = callback;
            dVar.b = (s) bVar;
            this.b.put(i, dVar);
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28677) + s.class.getName());
        }
    }

    public void u(int i, c cVar) {
        b bVar = this.a.get(i);
        if (bVar == null || !(bVar instanceof s)) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28680) + i + C0201.m82(28681));
        }
        ((s) bVar).k(cVar);
    }

    public void v(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            d valueAt = this.b.valueAt(i2);
            if (valueAt.d == i) {
                if (valueAt.c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean(C0201.m82(28682), false);
                    valueAt.c.invoke(createMap);
                }
                this.b.removeAt(i2);
                return;
            }
        }
    }

    public void x(int i) {
        b bVar = this.a.get(i);
        if (bVar == null || !(bVar instanceof s)) {
            throw new JSApplicationIllegalArgumentException(C0201.m82(28683) + i + C0201.m82(28684));
        }
        ((s) bVar).k(null);
    }
}
