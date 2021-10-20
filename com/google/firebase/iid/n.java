package com.google.firebase.iid;

import android.os.Bundle;

public final class n extends m<Void> {
    public n(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // com.google.firebase.iid.m
    public final boolean c() {
        return true;
    }

    @Override // com.google.firebase.iid.m
    public final void d(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            a(null);
        } else {
            b(new p(4, "Invalid response to one way request"));
        }
    }
}
