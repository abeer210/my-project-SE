package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.v;
import vigqyno.C0201;

/* renamed from: cs1  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class cs1 extends i<hs1> implements qs1 {
    private final boolean E;
    private final e F;
    private final Bundle G;
    private Integer H;

    private cs1(Context context, Looper looper, boolean z, e eVar, Bundle bundle, f.b bVar, f.c cVar) {
        super(context, looper, 44, eVar, bVar, cVar);
        this.E = true;
        this.F = eVar;
        this.G = bundle;
        this.H = eVar.f();
    }

    public static Bundle p0(e eVar) {
        bs1 k = eVar.k();
        Integer f = eVar.f();
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0201.m82(32768), eVar.a());
        if (f != null) {
            bundle.putInt(C0201.m82(32769), f.intValue());
        }
        if (k != null) {
            bundle.putBoolean(C0201.m82(32770), k.i());
            bundle.putBoolean(C0201.m82(32771), k.h());
            bundle.putString(C0201.m82(32772), k.f());
            bundle.putBoolean(C0201.m82(32773), true);
            bundle.putBoolean(C0201.m82(32774), k.g());
            bundle.putString(C0201.m82(32775), k.b());
            bundle.putString(C0201.m82(32776), k.d());
            bundle.putBoolean(C0201.m82(32777), k.j());
            if (k.a() != null) {
                bundle.putLong(C0201.m82(32778), k.a().longValue());
            }
            if (k.e() != null) {
                bundle.putLong(C0201.m82(32779), k.e().longValue());
            }
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.c
    public Bundle B() {
        if (!A().getPackageName().equals(this.F.i())) {
            this.G.putString(C0201.m82(32780), this.F.i());
        }
        return this.G;
    }

    @Override // defpackage.qs1
    public final void a() {
        i(new c.d());
    }

    @Override // defpackage.qs1
    public final void c(n nVar, boolean z) {
        try {
            ((hs1) E()).Y0(nVar, this.H.intValue(), z);
        } catch (RemoteException unused) {
            Log.w(C0201.m82(32781), C0201.m82(32782));
        }
    }

    @Override // defpackage.qs1
    public final void g(fs1 fs1) {
        u.l(fs1, C0201.m82(32783));
        try {
            Account c = this.F.c();
            GoogleSignInAccount googleSignInAccount = null;
            if (C0201.m82(32784).equals(c.name)) {
                googleSignInAccount = com.google.android.gms.auth.api.signin.internal.c.b(A()).c();
            }
            ((hs1) E()).y3(new ls1(new v(c, this.H.intValue(), googleSignInAccount)), fs1);
        } catch (RemoteException e) {
            String r1 = C0201.m82(32785);
            Log.w(r1, C0201.m82(32786));
            try {
                fs1.t0(new ns1(8));
            } catch (RemoteException unused) {
                Log.wtf(r1, C0201.m82(32787), e);
            }
        }
    }

    @Override // defpackage.qs1
    public final void l() {
        try {
            ((hs1) E()).a0(this.H.intValue());
        } catch (RemoteException unused) {
            Log.w(C0201.m82(32788), C0201.m82(32789));
        }
    }

    @Override // com.google.android.gms.common.internal.c
    public String m() {
        return C0201.m82(32790);
    }

    @Override // com.google.android.gms.common.internal.c
    public /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(32791));
        if (queryLocalInterface instanceof hs1) {
            return (hs1) queryLocalInterface;
        }
        return new js1(iBinder);
    }

    @Override // com.google.android.gms.common.internal.i, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public int p() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public boolean r() {
        return this.E;
    }

    @Override // com.google.android.gms.common.internal.c
    public String t() {
        return C0201.m82(32792);
    }

    public cs1(Context context, Looper looper, boolean z, e eVar, bs1 bs1, f.b bVar, f.c cVar) {
        this(context, looper, true, eVar, p0(eVar), bVar, cVar);
    }
}
