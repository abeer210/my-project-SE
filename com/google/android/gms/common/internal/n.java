package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public interface n extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static abstract class a extends h01 implements n {

        /* renamed from: com.google.android.gms.common.internal.n$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
        public static class C0059a extends i01 implements n {
            public C0059a(IBinder iBinder) {
                super(iBinder, C0201.m82(20520));
            }

            @Override // com.google.android.gms.common.internal.n
            public final Account B() throws RemoteException {
                Parcel V3 = V3(2, U3());
                Account account = (Account) j01.b(V3, Account.CREATOR);
                V3.recycle();
                return account;
            }
        }

        public static n U3(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(12620));
            if (queryLocalInterface instanceof n) {
                return (n) queryLocalInterface;
            }
            return new C0059a(iBinder);
        }
    }

    Account B() throws RemoteException;
}
