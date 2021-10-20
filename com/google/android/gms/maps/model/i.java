package com.google.android.gms.maps.model;

import vigqyno.C0201;

public final class i extends q {
    public final float c;

    public i(float f) {
        super(2, Float.valueOf(Math.max(f, 0.0f)));
        this.c = Math.max(f, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.q
    public final String toString() {
        float f = this.c;
        StringBuilder sb = new StringBuilder(29);
        sb.append(C0201.m82(21641));
        sb.append(f);
        sb.append(C0201.m82(21642));
        return sb.toString();
    }
}
