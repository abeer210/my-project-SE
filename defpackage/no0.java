package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.TimeZone;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: no0  reason: default package */
public final class no0 {
    private static final a.g<vz0> m = new a.g<>();
    private static final a.AbstractC0054a<vz0, a.d.C0056d> n;
    @Deprecated
    public static final com.google.android.gms.common.api.a<a.d.C0056d> o;
    private static final wr1[] p = new wr1[0];
    private final Context a;
    private final String b;
    private final int c;
    private String d;
    private int e;
    private String f;
    private final boolean g;
    private jz0 h;
    private final po0 i;
    private final e j;
    private d k;
    private final b l;

    /* renamed from: no0$a */
    public class a {
        private int a;
        private String b;
        private String c;
        private String d;
        private jz0 e;
        private boolean f;
        private final sz0 g;
        private boolean h;

        private a(no0 no0, byte[] bArr) {
            this(bArr, (c) null);
        }

        private a(byte[] bArr, c cVar) {
            this.a = no0.this.e;
            this.b = no0.this.d;
            this.c = no0.this.f;
            no0 no0 = no0.this;
            this.d = null;
            this.e = no0.h;
            this.f = true;
            this.g = new sz0();
            this.h = false;
            this.c = no0.this.f;
            this.d = null;
            this.g.y = gt0.a(no0.this.a);
            this.g.c = no0.this.j.a();
            this.g.d = no0.this.j.b();
            sz0 sz0 = this.g;
            d unused = no0.this.k;
            sz0.p = (long) (TimeZone.getDefault().getOffset(this.g.c) / C0188.f18);
            if (bArr != null) {
                this.g.k = bArr;
            }
        }

        public /* synthetic */ a(no0 no0, byte[] bArr, oo0 oo0) {
            this(no0, bArr);
        }

        public void a() {
            if (!this.h) {
                this.h = true;
                so0 so0 = new so0(new d01(no0.this.b, no0.this.c, this.a, this.b, this.c, this.d, no0.this.g, this.e), this.g, null, null, no0.d(null), null, no0.d(null), null, null, this.f);
                if (no0.this.l.a(so0)) {
                    no0.this.i.a(so0);
                } else {
                    i.b(Status.e, null);
                }
            } else {
                throw new IllegalStateException(C0201.m82(33793));
            }
        }

        public a b(int i2) {
            this.g.f = i2;
            return this;
        }
    }

    /* renamed from: no0$b */
    public interface b {
        boolean a(so0 so0);
    }

    /* renamed from: no0$c */
    public interface c {
        byte[] a();
    }

    /* renamed from: no0$d */
    public static class d {
    }

    static {
        oo0 oo0 = new oo0();
        n = oo0;
        o = new com.google.android.gms.common.api.a<>(C0201.m82(24048), oo0, m);
    }

    private no0(Context context, int i2, String str, String str2, String str3, boolean z, po0 po0, e eVar, d dVar, b bVar) {
        this.e = -1;
        this.h = jz0.DEFAULT;
        this.a = context;
        this.b = context.getPackageName();
        this.c = b(context);
        this.e = -1;
        this.d = str;
        this.f = str2;
        this.g = z;
        this.i = po0;
        this.j = eVar;
        this.k = new d();
        this.h = jz0.DEFAULT;
        this.l = bVar;
        if (z) {
            u.b(str2 == null, C0201.m82(24049));
        }
    }

    public no0(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, cx0.t(context), h.d(), null, new b01(context));
    }

    private static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            Log.wtf(C0201.m82(24050), C0201.m82(24051), e2);
            return 0;
        }
    }

    /* access modifiers changed from: private */
    public static int[] d(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Integer num = arrayList.get(i2);
            i2++;
            iArr[i3] = num.intValue();
            i3++;
        }
        return iArr;
    }

    public final a a(byte[] bArr) {
        return new a(this, bArr, (oo0) null);
    }
}
