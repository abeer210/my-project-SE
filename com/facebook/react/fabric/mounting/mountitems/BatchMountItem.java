package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.systrace.a;
import vigqyno.C0201;

@zh0
public class BatchMountItem implements g {
    private final g[] a;
    private final int b;
    private final int c;

    public BatchMountItem(g[] gVarArr, int i, int i2) {
        if (gVarArr == null) {
            throw null;
        } else if (i < 0 || i > gVarArr.length) {
            throw new IllegalArgumentException(C0201.m82(2564) + i + C0201.m82(2565) + gVarArr.length);
        } else {
            this.a = gVarArr;
            this.b = i;
            this.c = i2;
        }
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.g
    public void a(jj0 jj0) {
        a.c(0, C0201.m82(2566) + this.b + C0201.m82(2567));
        int i = this.c;
        if (i > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_START, null, i);
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            this.a[i2].a(jj0);
        }
        int i3 = this.c;
        if (i3 > 0) {
            ReactMarker.logFabricMarker(ReactMarkerConstants.FABRIC_BATCH_EXECUTION_END, null, i3);
        }
        a.g(0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < this.b) {
            if (sb.length() > 0) {
                sb.append(C0201.m82(2568));
            }
            sb.append(C0201.m82(2569));
            int i2 = i + 1;
            sb.append(i2);
            sb.append(C0201.m82(2570));
            sb.append(this.b);
            sb.append(C0201.m82(2571));
            sb.append(this.a[i]);
            i = i2;
        }
        return sb.toString();
    }
}
