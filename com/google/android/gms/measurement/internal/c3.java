package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.internal.y;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

public final class c3 extends f5 {
    private String c;
    private String d;
    private int e;
    private String f;
    private long g;
    private long h;
    private long i;
    private List<String> j;
    private int k;
    private String l;
    private String m;

    public c3(o4 o4Var, long j2) {
        super(o4Var);
        this.i = j2;
    }

    private final String G() {
        try {
            Class<?> loadClass = getContext().getClassLoader().loadClass(C0201.m82(5921));
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod(C0201.m82(5922), Context.class).invoke(null, getContext());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod(C0201.m82(5923), new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    e().J().d(C0201.m82(5924));
                    return null;
                }
            } catch (Exception unused2) {
                e().I().d(C0201.m82(5925));
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01e4 A[Catch:{ IllegalStateException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e5 A[Catch:{ IllegalStateException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ee A[Catch:{ IllegalStateException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0206 A[Catch:{ IllegalStateException -> 0x021d }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x029f  */
    @Override // com.google.android.gms.measurement.internal.f5
    public final void A() {
        boolean z;
        boolean z2;
        String b;
        String str;
        String packageName = getContext().getPackageName();
        PackageManager packageManager = getContext().getPackageManager();
        String r2 = C0201.m82(5926);
        String r3 = C0201.m82(5927);
        String r5 = C0201.m82(5928);
        int i2 = C0188.f23;
        if (packageManager == null) {
            e().E().a(C0201.m82(5929), k3.B(packageName));
        } else {
            try {
                r5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                e().E().a(C0201.m82(5930), k3.B(packageName));
            }
            if (r5 == null) {
                r5 = C0201.m82(5931);
            } else if (C0201.m82(5932).equals(r5)) {
                r5 = r3;
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(getContext().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    String charSequence = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : r2;
                    try {
                        r2 = packageInfo.versionName;
                        i2 = packageInfo.versionCode;
                    } catch (PackageManager.NameNotFoundException unused2) {
                        str = r2;
                        r2 = charSequence;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused3) {
                str = r2;
                e().E().b(C0201.m82(5933), k3.B(packageName), r2);
                r2 = str;
                this.c = packageName;
                this.f = r5;
                this.d = r2;
                this.e = i2;
                this.g = 0;
                a();
                Status c2 = h.c(getContext());
                boolean z3 = true;
                if (c2 == null) {
                }
                boolean isEmpty = TextUtils.isEmpty(this.a.A());
                String r10 = C0201.m82(5934);
                z = r8 | (isEmpty && r10.equals(this.a.B()));
                if (!z) {
                }
                if (z) {
                }
                z2 = false;
                this.l = r3;
                this.m = r3;
                this.h = 0;
                a();
                this.m = this.a.A();
                b = h.b();
                if (!TextUtils.isEmpty(b)) {
                }
                this.l = r3;
                if (!TextUtils.isEmpty(b)) {
                }
                if (z2) {
                }
                this.j = null;
                if (g().G(this.c, l.w0)) {
                }
                if (Build.VERSION.SDK_INT < 16) {
                }
            }
        }
        this.c = packageName;
        this.f = r5;
        this.d = r2;
        this.e = i2;
        this.g = 0;
        a();
        Status c22 = h.c(getContext());
        boolean z32 = true;
        boolean z4 = c22 == null && c22.s();
        boolean isEmpty2 = TextUtils.isEmpty(this.a.A());
        String r102 = C0201.m82(5934);
        z = z4 | (isEmpty2 && r102.equals(this.a.B()));
        if (!z) {
            if (c22 == null) {
                e().E().d(C0201.m82(5935));
            } else {
                e().E().b(C0201.m82(5936), Integer.valueOf(c22.o()), c22.p());
            }
        }
        if (z) {
            Boolean w = g().w();
            if (g().v()) {
                if (this.a.z()) {
                    e().K().d(C0201.m82(5937));
                }
            } else if (w == null || w.booleanValue()) {
                if (w != null || !h.d()) {
                    e().M().d(C0201.m82(5940));
                    z2 = true;
                    this.l = r3;
                    this.m = r3;
                    this.h = 0;
                    a();
                    if (!TextUtils.isEmpty(this.a.A()) && r102.equals(this.a.B())) {
                        this.m = this.a.A();
                    }
                    b = h.b();
                    if (!TextUtils.isEmpty(b)) {
                        r3 = b;
                    }
                    this.l = r3;
                    if (!TextUtils.isEmpty(b)) {
                        this.m = new y(getContext()).a(C0201.m82(5941));
                    }
                    if (z2) {
                        e().M().b(C0201.m82(5942), this.c, this.l);
                    }
                    this.j = null;
                    if (g().G(this.c, l.w0)) {
                        a();
                        List<String> J = g().J(C0201.m82(5944));
                        if (J != null) {
                            if (J.size() != 0) {
                                Iterator<String> it = J.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    if (!m().x0(C0201.m82(5946), it.next())) {
                                        break;
                                    }
                                }
                            } else {
                                e().H().d(C0201.m82(5945));
                            }
                            z32 = false;
                        }
                        if (z32) {
                            this.j = J;
                        }
                    }
                    if (Build.VERSION.SDK_INT < 16) {
                        this.k = 0;
                        return;
                    } else if (packageManager != null) {
                        this.k = fq0.a(getContext()) ? 1 : 0;
                        return;
                    } else {
                        this.k = 0;
                        return;
                    }
                } else {
                    e().K().d(C0201.m82(5939));
                }
            } else if (this.a.z()) {
                e().K().d(C0201.m82(5938));
            }
        }
        z2 = false;
        this.l = r3;
        this.m = r3;
        this.h = 0;
        a();
        this.m = this.a.A();
        try {
            b = h.b();
            if (!TextUtils.isEmpty(b)) {
            }
            this.l = r3;
            if (!TextUtils.isEmpty(b)) {
            }
            if (z2) {
            }
        } catch (IllegalStateException e2) {
            e().E().b(C0201.m82(5943), k3.B(packageName), e2);
        }
        this.j = null;
        if (g().G(this.c, l.w0)) {
        }
        if (Build.VERSION.SDK_INT < 16) {
        }
    }

    public final String B() {
        x();
        return this.l;
    }

    public final String C() {
        x();
        return this.c;
    }

    public final String D() {
        x();
        return this.m;
    }

    public final d9 E(String str) {
        String str2;
        Boolean I;
        j();
        h();
        String C = C();
        String B = B();
        x();
        String str3 = this.d;
        long H = (long) H();
        x();
        String str4 = this.f;
        long q = g().q();
        x();
        j();
        if (this.g == 0) {
            this.g = this.a.T().i0(getContext(), getContext().getPackageName());
        }
        long j2 = this.g;
        boolean d2 = this.a.d();
        boolean z = !f().x;
        j();
        h();
        if (!this.a.d()) {
            str2 = null;
        } else {
            str2 = G();
        }
        x();
        long j3 = this.h;
        long F = this.a.F();
        int I2 = I();
        boolean booleanValue = g().x().booleanValue();
        i9 g2 = g();
        g2.h();
        Boolean I3 = g2.I(C0201.m82(5947));
        return new d9(C, B, str3, H, str4, q, j2, str, d2, z, str2, j3, F, I2, booleanValue, Boolean.valueOf(I3 == null || I3.booleanValue()).booleanValue(), f().J(), D(), (!g().G(C(), l.j0) || (I = g().I(C0201.m82(5948))) == null) ? null : Boolean.valueOf(!I.booleanValue()), this.i, g().G(C(), l.w0) ? this.j : null);
    }

    public final List<String> F() {
        return this.j;
    }

    public final int H() {
        x();
        return this.e;
    }

    public final int I() {
        x();
        return this.k;
    }

    @Override // com.google.android.gms.measurement.internal.f5
    public final boolean z() {
        return true;
    }
}
