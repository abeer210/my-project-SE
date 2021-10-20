package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class a extends n.a {
    public static Account V3(n nVar) {
        if (nVar != null) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return nVar.B();
            } catch (RemoteException unused) {
                Log.w(C0201.m82(8184), C0201.m82(8185));
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
        return null;
    }
}
