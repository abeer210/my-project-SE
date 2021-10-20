package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import defpackage.sh1;
import java.util.ArrayList;
import vigqyno.C0201;

/* renamed from: rh1  reason: default package */
public final class rh1 extends sh1.a {
    public static final String c = null;
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ Context g;
    private final /* synthetic */ Bundle h;
    private final /* synthetic */ sh1 i;

    static {
        C0201.m83(rh1.class, 55);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rh1(sh1 sh1, String str, String str2, Context context, Bundle bundle) {
        super(sh1);
        this.i = sh1;
        this.e = str;
        this.f = str2;
        this.g = context;
        this.h = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0054 A[Catch:{ RemoteException -> 0x00a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[Catch:{ RemoteException -> 0x00a0 }] */
    @Override // defpackage.sh1.a
    public final void a() {
        String str;
        String str2;
        String str3;
        boolean z;
        boolean z2;
        int i2;
        try {
            this.i.d = new ArrayList();
            sh1 sh1 = this.i;
            if (sh1.K(this.e, this.f)) {
                String str4 = this.f;
                str2 = this.e;
                str = str4;
                str3 = this.i.a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            sh1.Q(this.g);
            if (!sh1.j.booleanValue()) {
                if (str2 == null) {
                    z = false;
                    this.i.g = this.i.v(this.g, z);
                    if (this.i.g != null) {
                        Log.w(this.i.a, c);
                        return;
                    }
                    int i3 = sh1.P(this.g);
                    int i4 = sh1.N(this.g);
                    if (z) {
                        i2 = Math.max(i3, i4);
                        z2 = i4 < i3;
                    } else {
                        if (i3 > 0) {
                            i4 = i3;
                        }
                        z2 = i3 > 0;
                        i2 = i4;
                    }
                    this.i.g.initialize(ar0.W3(this.g), new qh1(16250, (long) i2, z2, str3, str2, str, this.h), this.a);
                    return;
                }
            }
            z = true;
            this.i.g = this.i.v(this.g, z);
            if (this.i.g != null) {
            }
        } catch (RemoteException e2) {
            this.i.E(e2, true, false);
        }
    }
}
