package com.huawei.hms.support.api.a.a.c;

import android.app.PendingIntent;
import android.os.Looper;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import java.util.Objects;

/* compiled from: RequestLocationUpdatesCache */
public class b extends com.huawei.hms.support.api.a.a.b.b {
    private LocationRequest a;
    private PendingIntent b;
    private LocationCallback c;
    private int d = 0;
    private String e;
    private Looper f;

    public b(LocationRequest locationRequest, PendingIntent pendingIntent, LocationCallback locationCallback, Looper looper, String str) {
        this.a = locationRequest;
        this.b = pendingIntent;
        if (locationRequest != null) {
            this.d = locationRequest.getNumUpdates();
        }
        this.c = locationCallback;
        this.f = looper;
        if (locationCallback != null) {
            this.e = str;
        } else {
            this.e = null;
        }
        a(str);
    }

    public void a(int i) {
        this.d = i;
    }

    public LocationRequest b() {
        return this.a;
    }

    public PendingIntent c() {
        return this.b;
    }

    public LocationCallback d() {
        return this.c;
    }

    public Looper e() {
        return this.f;
    }

    @Override // com.huawei.hms.support.api.a.a.b.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            if (d() != null) {
                return a(obj);
            }
            if (c() != null) {
                return b(obj);
            }
        }
        return false;
    }

    public String f() {
        return this.e;
    }

    public int g() {
        return this.d;
    }

    public int hashCode() {
        return 0;
    }

    public boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.c, ((b) obj).c);
    }

    public void b(String str) {
        this.e = str;
    }

    public boolean b(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.b, ((b) obj).b);
    }
}
