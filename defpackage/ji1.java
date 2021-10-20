package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import vigqyno.C0201;

/* renamed from: ji1  reason: default package */
public final class ji1 extends mp1<zh1> {
    private final ki1 i;

    public ji1(Context context, ki1 ki1) {
        super(context, C0201.m82(37166), C0201.m82(37167));
        this.i = ki1;
        e();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.mp1
    public final /* synthetic */ zh1 b(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.a {
        bi1 bi1;
        IBinder d = dynamiteModule.d(C0201.m82(37168));
        if (d == null) {
            bi1 = null;
        } else {
            IInterface queryLocalInterface = d.queryLocalInterface(C0201.m82(37169));
            if (queryLocalInterface instanceof bi1) {
                bi1 = (bi1) queryLocalInterface;
            } else {
                bi1 = new ci1(d);
            }
        }
        if (bi1 == null) {
            return null;
        }
        return bi1.f2(ar0.W3(context), this.i);
    }

    @Override // defpackage.mp1
    public final void c() throws RemoteException {
        ((zh1) e()).D();
    }

    public final di1[] f(Bitmap bitmap, np1 np1, fi1 fi1) {
        if (!a()) {
            return new di1[0];
        }
        try {
            return ((zh1) e()).E0(ar0.W3(bitmap), np1, fi1);
        } catch (RemoteException e) {
            Log.e(C0201.m82(37170), C0201.m82(37171), e);
            return new di1[0];
        }
    }
}
