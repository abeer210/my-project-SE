package com.google.firebase.iid;

import android.os.Bundle;

public final class o extends m<Bundle> {
    public o(int i, int i2, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // com.google.firebase.iid.m
    public final boolean c() {
        return false;
    }

    @Override // com.google.firebase.iid.m
    public final void d(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        a(bundle2);
    }
}
