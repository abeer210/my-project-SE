package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.events.EventEmitterWrapper;
import vigqyno.C0201;

/* compiled from: UpdateEventEmitterMountItem */
public class l implements g {
    private final EventEmitterWrapper a;
    private final int b;

    public l(int i, EventEmitterWrapper eventEmitterWrapper) {
        this.b = i;
        this.a = eventEmitterWrapper;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.g
    public void a(jj0 jj0) {
        jj0.n(this.b, this.a);
        throw null;
    }

    public String toString() {
        return C0201.m82(34907) + this.b + C0201.m82(34908);
    }
}
