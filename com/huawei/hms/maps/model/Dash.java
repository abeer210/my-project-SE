package com.huawei.hms.maps.model;

import vigqyno.C0201;

public final class Dash extends PatternItem {
    public static final float MIN_LENGTH = 0.0f;
    public float length;

    public Dash(float f) {
        super(0, Math.max(f, 0.0f));
        this.length = Math.max(f, 0.0f);
    }

    @Override // com.huawei.hms.maps.model.PatternItem
    public final String toString() {
        return C0201.m82(13526) + String.valueOf(this.length);
    }
}
