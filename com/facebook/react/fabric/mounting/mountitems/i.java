package com.facebook.react.fabric.mounting.mountitems;

import vigqyno.C0201;

/* compiled from: RemoveDeleteMultiMountItem */
public class i implements g {
    private int[] a;

    public i(int[] iArr) {
        this.a = iArr;
    }

    @Override // com.facebook.react.fabric.mounting.mountitems.g
    public void a(jj0 jj0) {
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = this.a;
                    if (i2 >= iArr2.length) {
                        return;
                    }
                    if ((iArr2[i2 + 3] & 2) == 0) {
                        i2 += 4;
                    } else {
                        jj0.e(iArr2[i2 + 0]);
                        throw null;
                    }
                }
            } else if ((iArr[i + 3] & 1) == 0) {
                i += 4;
            } else {
                jj0.k(iArr[i + 1], iArr[i + 2]);
                throw null;
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.a.length; i += 4) {
            if (sb.length() > 0) {
                sb.append(C0201.m82(36271));
            }
            sb.append(C0201.m82(36272));
            sb.append((i / 4) + 1);
            sb.append(C0201.m82(36273));
            sb.append(this.a.length / 4);
            sb.append(C0201.m82(36274));
            sb.append(this.a[i + 0]);
            sb.append(C0201.m82(36275));
            sb.append(this.a[i + 1]);
            sb.append(C0201.m82(36276));
            sb.append(this.a[i + 2]);
            sb.append(C0201.m82(36277));
            sb.append(this.a[i + 3]);
        }
        return sb.toString();
    }
}
