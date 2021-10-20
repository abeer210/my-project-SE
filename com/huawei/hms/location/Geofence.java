package com.huawei.hms.location;

import android.text.TextUtils;
import com.huawei.hms.support.api.entity.location.fence.GeofenceEntity;
import vigqyno.C0201;

public interface Geofence {
    public static final int DWELL_GEOFENCE_CONVERSION = 0;
    public static final int ENTER_GEOFENCE_CONVERSION = 0;
    public static final int EXIT_GEOFENCE_CONVERSION = 0;
    public static final long GEOFENCE_NEVER_EXPIRE = 0;

    public static final class Builder {
        private String a = null;
        private int b = 0;
        private long c = -2;
        private double d;
        private double e;
        private float f;
        private int g = 0;
        private int h = -1;

        public Geofence build() {
            if (!TextUtils.isEmpty(this.a)) {
                int i = this.b;
                if (i <= 0) {
                    throw new IllegalArgumentException(C0201.m82(9942));
                } else if ((i & 4) != 0 && this.h < 0) {
                    throw new IllegalArgumentException(C0201.m82(9939));
                } else if (this.c == -2) {
                    throw new IllegalArgumentException(C0201.m82(9941));
                } else if (this.g >= 0) {
                    return new GeofenceEntity(this.a, this.b, this.d, this.e, this.f, this.c, this.g, this.h);
                } else {
                    throw new IllegalArgumentException(C0201.m82(9940));
                }
            } else {
                throw new IllegalArgumentException(C0201.m82(9943));
            }
        }

        public Builder setConversions(int i) {
            this.b = i;
            return this;
        }

        public Builder setDwellDelayTime(int i) {
            this.h = i;
            return this;
        }

        public Builder setNotificationInterval(int i) {
            this.g = i;
            return this;
        }

        public Builder setRoundArea(double d2, double d3, float f2) {
            this.d = d2;
            this.e = d3;
            this.f = f2;
            return this;
        }

        public Builder setUniqueId(String str) {
            this.a = str;
            return this;
        }

        public Builder setValidContinueTime(long j) {
            if (j < 0) {
                j = -1;
            }
            this.c = j;
            return this;
        }
    }

    static {
        C0201.m83(Geofence.class, 559);
    }

    String getUniqueId();
}
