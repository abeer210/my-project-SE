package com.huawei.hms.maps.model;

import vigqyno.C0201;

public final class Gap extends PatternItem {
    public static final float MIN_LENGTH = 0.0f;
    public final float length;

    public Gap(float f) {
        super(2, Math.max(f, 0.0f));
        this.length = Math.max(f, 0.0f);
    }

    @Override // com.huawei.hms.maps.model.PatternItem
    public final String toString() {
        return C0201.m82(24157) + String.valueOf(this.length);
    }
}
