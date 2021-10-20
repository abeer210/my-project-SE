package com.huawei.hms.maps.model;

import com.huawei.hms.common.Preconditions;
import vigqyno.C0201;

public final class CustomCap extends Cap {
    public final BitmapDescriptor bitmapDescriptor;
    public final float refWidth;

    public CustomCap(BitmapDescriptor bitmapDescriptor2) {
        this(bitmapDescriptor2, 10.0f);
    }

    public CustomCap(BitmapDescriptor bitmapDescriptor2, float f) {
        super((BitmapDescriptor) Preconditions.checkNotNull(bitmapDescriptor2, C0201.m82(35424)), f);
        if (Math.abs(f) >= 1.0E-6f) {
            this.bitmapDescriptor = bitmapDescriptor2;
            this.refWidth = f;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(35425));
    }

    @Override // com.huawei.hms.maps.model.Cap
    public final String toString() {
        return C0201.m82(35426) + String.valueOf(this.bitmapDescriptor) + C0201.m82(35427) + this.refWidth;
    }
}
