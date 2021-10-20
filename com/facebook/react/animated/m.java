package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.UIManager;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: PropsAnimatedNode */
public class m extends b {
    private int e = -1;
    private final l f;
    private final UIManager g;
    private final Map<String, Integer> h;
    private final JavaOnlyMap i;

    public m(ReadableMap readableMap, l lVar, UIManager uIManager) {
        ReadableMap map = readableMap.getMap(C0201.m82(28314));
        ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
        this.h = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            this.h.put(nextKey, Integer.valueOf(map.getInt(nextKey)));
        }
        this.i = new JavaOnlyMap();
        this.f = lVar;
        this.g = uIManager;
    }

    public void f(int i2) {
        if (this.e == -1) {
            this.e = i2;
            return;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(28315) + this.d + C0201.m82(28316));
    }

    public void g(int i2) {
        if (this.e == i2) {
            this.e = -1;
            return;
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(28317));
    }

    public void h() {
        ReadableMapKeySetIterator keySetIterator = this.i.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            this.i.putNull(keySetIterator.nextKey());
        }
        this.g.synchronouslyUpdateViewOnUIThread(this.e, this.i);
    }

    public final void i() {
        if (this.e != -1) {
            for (Map.Entry<String, Integer> entry : this.h.entrySet()) {
                b l = this.f.l(entry.getValue().intValue());
                if (l == null) {
                    throw new IllegalArgumentException(C0201.m82(28319));
                } else if (l instanceof o) {
                    ((o) l).f(this.i);
                } else if (l instanceof s) {
                    s sVar = (s) l;
                    Object h2 = sVar.h();
                    if (h2 instanceof String) {
                        this.i.putString(entry.getKey(), (String) h2);
                    } else {
                        this.i.putDouble(entry.getKey(), sVar.i());
                    }
                } else {
                    throw new IllegalArgumentException(C0201.m82(28318) + l.getClass());
                }
            }
            this.g.synchronouslyUpdateViewOnUIThread(this.e, this.i);
        }
    }
}
