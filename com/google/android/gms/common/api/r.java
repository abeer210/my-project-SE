package com.google.android.gms.common.api;

import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class r extends UnsupportedOperationException {
    private final xo0 a;

    public r(xo0 xo0) {
        this.a = xo0;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append(C0201.m82(35708));
        sb.append(valueOf);
        return sb.toString();
    }
}
