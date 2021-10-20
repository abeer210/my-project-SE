package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.nio.ByteBuffer;
import vigqyno.C0201;

/* renamed from: ml1  reason: default package */
public final class ml1 extends mp1<nm1> {
    private final pj1 i;

    public ml1(Context context, pj1 pj1) {
        super(context, C0201.m82(24219), C0201.m82(24220));
        this.i = pj1;
        e();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.mp1
    public final /* synthetic */ nm1 b(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.a {
        no1 no1;
        IBinder d = dynamiteModule.d(C0201.m82(24221));
        if (d == null) {
            no1 = null;
        } else {
            IInterface queryLocalInterface = d.queryLocalInterface(C0201.m82(24222));
            if (queryLocalInterface instanceof no1) {
                no1 = (no1) queryLocalInterface;
            } else {
                no1 = new lp1(d);
            }
        }
        if (no1 == null) {
            return null;
        }
        return no1.X1(ar0.W3(context), this.i);
    }

    @Override // defpackage.mp1
    public final void c() throws RemoteException {
        if (a()) {
            ((nm1) e()).x();
        }
    }

    public final wt1[] f(Bitmap bitmap, np1 np1) {
        if (!a()) {
            return new wt1[0];
        }
        try {
            return ((nm1) e()).i3(ar0.W3(bitmap), np1);
        } catch (RemoteException e) {
            Log.e(C0201.m82(24223), C0201.m82(24224), e);
            return new wt1[0];
        }
    }

    public final wt1[] g(ByteBuffer byteBuffer, np1 np1) {
        if (!a()) {
            return new wt1[0];
        }
        try {
            return ((nm1) e()).K2(ar0.W3(byteBuffer), np1);
        } catch (RemoteException e) {
            Log.e(C0201.m82(24225), C0201.m82(24226), e);
            return new wt1[0];
        }
    }
}
