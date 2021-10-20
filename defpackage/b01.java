package defpackage;

import android.content.Context;
import android.util.Log;
import defpackage.no0;
import defpackage.nz0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import vigqyno.C0201;

/* renamed from: b01  reason: default package */
public final class b01 implements no0.b {
    private static final Charset b = Charset.forName(C0201.m82(3331));
    private static final ut0 c;
    private static final ut0 d;
    private static final ConcurrentHashMap<String, kt0<nz0>> e = new ConcurrentHashMap<>();
    private static final HashMap<String, kt0<String>> f = new HashMap<>();
    private static Boolean g = null;
    private static Long h = null;
    private static final kt0<Boolean> i = c.e(C0201.m82(3337), false);
    private final Context a;

    static {
        String r1 = C0201.m82(3332);
        c = new ut0(xr1.a(r1)).f(C0201.m82(3333)).h(C0201.m82(3334));
        d = new ut0(xr1.a(r1)).f(C0201.m82(3335)).h(C0201.m82(3336));
    }

    public b01(Context context) {
        this.a = context;
        if (context != null) {
            kt0.b(context);
        }
    }

    private static long b(String str, long j) {
        if (str == null || str.isEmpty()) {
            return wz0.c(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return wz0.c(allocate.array());
    }

    private static nz0.b c(String str) {
        String str2;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        int i2 = 0;
        if (indexOf >= 0) {
            i2 = indexOf + 1;
            str2 = str.substring(0, indexOf);
        } else {
            str2 = C0201.m82(3338);
        }
        int indexOf2 = str.indexOf(47, i2);
        String r4 = C0201.m82(3339);
        if (indexOf2 <= 0) {
            String r1 = C0201.m82(3340);
            String valueOf = String.valueOf(str);
            Log.e(r4, valueOf.length() != 0 ? r1.concat(valueOf) : new String(r1));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i2, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong < 0 || parseLong2 < 0) {
                StringBuilder sb = new StringBuilder(72);
                sb.append(C0201.m82(3341));
                sb.append(parseLong);
                sb.append(C0201.m82(3342));
                sb.append(parseLong2);
                Log.e(r4, sb.toString());
                return null;
            }
            nz0.b.a C = nz0.b.C();
            C.q(str2);
            C.s(parseLong);
            C.t(parseLong2);
            return (nz0.b) C.o();
        } catch (NumberFormatException e2) {
            String r2 = C0201.m82(3343);
            String valueOf2 = String.valueOf(str);
            Log.e(r4, valueOf2.length() != 0 ? r2.concat(valueOf2) : new String(r2), e2);
            return null;
        }
    }

    private static boolean d(long j, long j2, long j3) {
        if (j2 < 0 || j3 <= 0) {
            return true;
        }
        return ((j > 0 ? 1 : (j == 0 ? 0 : -1)) >= 0 ? j % j3 : (((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3)) % j3) < j2;
    }

    private static boolean e(Context context) {
        if (g == null) {
            g = Boolean.valueOf(hq0.a(context).a(C0201.m82(3344)) == 0);
        }
        return g.booleanValue();
    }

    private static long f(Context context) {
        if (h == null) {
            long j = 0;
            if (context == null) {
                return 0;
            }
            if (e(context)) {
                j = f01.a(context.getContentResolver(), C0201.m82(3345), 0);
            }
            h = Long.valueOf(j);
        }
        return h.longValue();
    }

    @Override // defpackage.no0.b
    public final boolean a(so0 so0) {
        List<nz0.b> list;
        kt0<nz0> putIfAbsent;
        d01 d01 = so0.a;
        String str = d01.g;
        int i2 = d01.c;
        sz0 sz0 = so0.i;
        int i3 = sz0 != null ? sz0.f : 0;
        String str2 = null;
        if (!i.a().booleanValue()) {
            if (str == null || str.isEmpty()) {
                str = i2 >= 0 ? String.valueOf(i2) : null;
            }
            if (str == null) {
                return true;
            }
            Context context = this.a;
            if (context != null && e(context)) {
                kt0<String> kt0 = f.get(str);
                if (kt0 == null) {
                    kt0 = d.b(str, null);
                    f.put(str, kt0);
                }
                str2 = kt0.a();
            }
            nz0.b c2 = c(str2);
            if (c2 != null) {
                return d(b(c2.y(), f(this.a)), c2.z(), c2.B());
            }
            return true;
        }
        if (str == null || str.isEmpty()) {
            str = i2 >= 0 ? String.valueOf(i2) : null;
        }
        if (str == null) {
            return true;
        }
        if (this.a == null) {
            list = Collections.emptyList();
        } else {
            kt0<nz0> kt02 = e.get(str);
            if (kt02 == null && (putIfAbsent = e.putIfAbsent(str, (kt02 = c.a(str, nz0.u(), c01.a)))) != null) {
                kt02 = putIfAbsent;
            }
            list = kt02.a().t();
        }
        for (nz0.b bVar : list) {
            if ((!bVar.x() || bVar.t() == 0 || bVar.t() == i3) && !d(b(bVar.y(), f(this.a)), bVar.z(), bVar.B())) {
                return false;
            }
        }
        return true;
    }
}
