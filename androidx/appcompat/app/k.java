package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.c;
import java.util.Calendar;
import vigqyno.C0201;

/* compiled from: TwilightManager */
public class k {
    private static k d;
    private final Context a;
    private final LocationManager b;
    private final a c = new a();

    /* access modifiers changed from: private */
    /* compiled from: TwilightManager */
    public static class a {
        public boolean a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
    }

    public k(Context context, LocationManager locationManager) {
        this.a = context;
        this.b = locationManager;
    }

    public static k a(Context context) {
        if (d == null) {
            Context applicationContext = context.getApplicationContext();
            d = new k(applicationContext, (LocationManager) applicationContext.getSystemService(C0201.m82(4376)));
        }
        return d;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location location = null;
        Location c2 = c.c(this.a, C0201.m82(4377)) == 0 ? c(C0201.m82(4378)) : null;
        if (c.c(this.a, C0201.m82(4379)) == 0) {
            location = c(C0201.m82(4380));
        }
        return (location == null || c2 == null) ? location != null ? location : c2 : location.getTime() > c2.getTime() ? location : c2;
    }

    private Location c(String str) {
        try {
            if (this.b.isProviderEnabled(str)) {
                return this.b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d(C0201.m82(4381), C0201.m82(4382), e);
            return null;
        }
    }

    private boolean e() {
        return this.c.f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j;
        a aVar = this.c;
        long currentTimeMillis = System.currentTimeMillis();
        j b2 = j.b();
        b2.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = b2.a;
        b2.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = b2.c == 1;
        long j3 = b2.b;
        long j4 = b2.a;
        b2.a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j5 = b2.b;
        if (j3 == -1 || j4 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j4 ? 0 + j5 : currentTimeMillis > j3 ? 0 + j4 : 0 + j3) + 60000;
        }
        aVar.a = z;
        aVar.b = j2;
        aVar.c = j3;
        aVar.d = j4;
        aVar.e = j5;
        aVar.f = j;
    }

    public boolean d() {
        a aVar = this.c;
        if (e()) {
            return aVar.a;
        }
        Location b2 = b();
        if (b2 != null) {
            f(b2);
            return aVar.a;
        }
        Log.i(C0201.m82(4383), C0201.m82(4384));
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
