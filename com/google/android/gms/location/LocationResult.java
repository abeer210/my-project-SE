package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

public final class LocationResult extends ip0 implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationResult> CREATOR = new s();
    public static final List<Location> b = Collections.emptyList();
    private final List<Location> a;

    public LocationResult(List<Location> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.a.size() != this.a.size()) {
            return false;
        }
        Iterator<Location> it = this.a.iterator();
        for (Location location : locationResult.a) {
            if (it.next().getTime() != location.getTime()) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 17;
        for (Location location : this.a) {
            long time = location.getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    public final Location o() {
        int size = this.a.size();
        if (size == 0) {
            return null;
        }
        return this.a.get(size - 1);
    }

    public final List<Location> p() {
        return this.a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append(C0201.m82(1703));
        sb.append(valueOf);
        sb.append(C0201.m82(1704));
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.y(parcel, 1, p(), false);
        kp0.b(parcel, a2);
    }
}
