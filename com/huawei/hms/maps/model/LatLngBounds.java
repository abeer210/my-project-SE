package com.huawei.hms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.common.util.Objects;
import com.huawei.hms.maps.HuaweiMapOptions;
import java.math.BigDecimal;
import vigqyno.C0201;

public class LatLngBounds implements Parcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new Parcelable.Creator<LatLngBounds>() {
        /* class com.huawei.hms.maps.model.LatLngBounds.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public final LatLngBounds createFromParcel(Parcel parcel) {
            return new LatLngBounds(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final LatLngBounds[] newArray(int i) {
            return new LatLngBounds[i];
        }
    };
    public final LatLng northeast;
    public final LatLng southwest;

    public static final class Builder {
        private double a = Double.MAX_VALUE;
        private double b = -1.7976931348623157E308d;
        private double c = Double.NaN;
        private double d = Double.NaN;

        public final LatLngBounds build() {
            Preconditions.checkState(!Double.isNaN(this.c), C0201.m82(2410));
            return new LatLngBounds(new LatLng(this.a, this.c), new LatLng(this.b, this.d));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x004c, code lost:
            if (java.lang.Math.abs(r0 - r2) >= 1.0E-6d) goto L_0x006f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
            if (java.lang.Math.abs(r0 - r2) >= 1.0E-6d) goto L_0x006f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x008e  */
        public final Builder include(LatLng latLng) {
            boolean z;
            this.a = Math.min(this.a, latLng.latitude);
            this.b = Math.max(this.b, latLng.latitude);
            double d2 = latLng.longitude;
            double d3 = this.c;
            double d4 = this.d;
            boolean z2 = false;
            if (d3 < d4 || Math.abs(d3 - d4) < 1.0E-6d) {
                double d5 = this.c;
                if (d5 < d2 || Math.abs(d5 - d2) < 1.0E-6d) {
                    double d6 = this.d;
                    if (d2 >= d6) {
                    }
                    z = true;
                    if (LatLngBounds.c(this.c, d2) < LatLngBounds.d(this.d, d2)) {
                        z2 = true;
                    }
                    if (Double.isNaN(this.c)) {
                        this.c = d2;
                    } else if (z) {
                        return this;
                    } else {
                        if (z2) {
                            this.c = d2;
                            return this;
                        }
                    }
                    this.d = d2;
                    return this;
                }
            } else {
                double d7 = this.c;
                if (d7 >= d2 && Math.abs(d7 - d2) >= 1.0E-6d) {
                    double d8 = this.d;
                    if (d2 >= d8) {
                    }
                }
                z = true;
                if (LatLngBounds.c(this.c, d2) < LatLngBounds.d(this.d, d2)) {
                }
                if (Double.isNaN(this.c)) {
                }
                this.d = d2;
                return this;
            }
            z = false;
            if (LatLngBounds.c(this.c, d2) < LatLngBounds.d(this.d, d2)) {
            }
            if (Double.isNaN(this.c)) {
            }
            this.d = d2;
            return this;
        }
    }

    public LatLngBounds(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.southwest = (LatLng) parcelReader.readParcelable(2, LatLng.CREATOR, null);
        this.northeast = (LatLng) parcelReader.readParcelable(3, LatLng.CREATOR, null);
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        Preconditions.checkNotNull(latLng, C0201.m82(16701));
        Preconditions.checkNotNull(latLng2, C0201.m82(16702));
        Preconditions.checkArgument(latLng2.latitude >= latLng.latitude, C0201.m82(16703), Double.valueOf(latLng.latitude), Double.valueOf(latLng2.latitude));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    private boolean a(double d) {
        double d2 = this.southwest.longitude;
        int i = (d2 > d ? 1 : (d2 == d ? 0 : -1));
        if (d2 <= this.northeast.longitude) {
            if (i < 0 || Math.abs(d2 - d) < 1.0E-6d) {
                double d3 = this.northeast.longitude;
                if (d < d3 || Math.abs(d - d3) < 1.0E-6d) {
                    return true;
                }
            }
            return false;
        }
        if (i >= 0 && Math.abs(d2 - d) >= 1.0E-6d) {
            double d4 = this.northeast.longitude;
            return d < d4 || Math.abs(d - d4) < 1.0E-6d;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* access modifiers changed from: private */
    public static double c(double d, double d2) {
        return ((d - d2) + 360.0d) % 360.0d;
    }

    public static LatLngBounds createFromAttributes(Context context, AttributeSet attributeSet) {
        return HuaweiMapOptions.buildLatLngBounds(context, attributeSet);
    }

    /* access modifiers changed from: private */
    public static double d(double d, double d2) {
        return ((d2 - d) + 360.0d) % 360.0d;
    }

    public final boolean contains(LatLng latLng) {
        double d = latLng.latitude;
        return this.southwest.latitude <= d && d <= this.northeast.latitude && a(latLng.longitude);
    }

    public int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
    }

    public final LatLng getCenter() {
        double doubleValue = new BigDecimal(String.valueOf(this.southwest.latitude)).add(new BigDecimal(String.valueOf(this.northeast.latitude))).divide(new BigDecimal(C0201.m82(16704))).doubleValue();
        double d = this.northeast.longitude;
        double d2 = this.southwest.longitude;
        if (d2 > d) {
            d += 360.0d;
        }
        return new LatLng(doubleValue, (d + d2) / 2.0d);
    }

    public final int hashCode() {
        return Objects.hashCode(this.southwest, this.northeast);
    }

    public final LatLngBounds including(LatLng latLng) {
        LatLng latLng2 = new LatLng(Math.min(this.southwest.latitude, latLng.latitude), this.southwest.longitude);
        LatLng latLng3 = new LatLng(Math.max(this.northeast.latitude, latLng.latitude), this.northeast.longitude);
        if (a(latLng.longitude)) {
            return new LatLngBounds(latLng2, latLng3);
        }
        double d = c(latLng2.longitude, latLng.longitude) < d(latLng3.longitude, latLng.longitude) ? latLng.longitude : latLng2.longitude;
        latLng2.longitude = d;
        latLng3.longitude = c(d, latLng.longitude) < d(latLng3.longitude, latLng.longitude) ? latLng3.longitude : latLng.longitude;
        return new LatLngBounds(latLng2, latLng3);
    }

    public final String toString() {
        return C0201.m82(16705) + this.southwest + C0201.m82(16706) + this.northeast;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeParcelable(2, this.southwest, i, false);
        parcelWrite.writeParcelable(3, this.northeast, i, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
