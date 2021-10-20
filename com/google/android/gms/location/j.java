package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class j extends ip0 {
    public static final Parcelable.Creator<j> CREATOR = new w();
    private final List<LocationRequest> a;
    private final boolean b;
    private final boolean c;
    private u d;

    public static final class a {
        private final ArrayList<LocationRequest> a = new ArrayList<>();
        private boolean b = false;
        private boolean c = false;

        public final a a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.a.add(locationRequest);
            }
            return this;
        }

        public final j b() {
            return new j(this.a, this.b, this.c, null);
        }
    }

    public j(List<LocationRequest> list, boolean z, boolean z2, u uVar) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = uVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.y(parcel, 1, Collections.unmodifiableList(this.a), false);
        kp0.c(parcel, 2, this.b);
        kp0.c(parcel, 3, this.c);
        kp0.s(parcel, 5, this.d, i, false);
        kp0.b(parcel, a2);
    }
}
