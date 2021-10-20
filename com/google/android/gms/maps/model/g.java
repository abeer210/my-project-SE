package com.google.android.gms.maps.model;

import vigqyno.C0201;

public final class g extends q {
    public final float c;

    public g(float f) {
        super(0, Float.valueOf(Math.max(f, 0.0f)));
        this.c = Math.max(f, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.q
    public final String toString() {
        float f = this.c;
        StringBuilder sb = new StringBuilder(30);
        sb.append(C0201.m82(21766));
        sb.append(f);
        sb.append(C0201.m82(21767));
        return sb.toString();
    }
}
