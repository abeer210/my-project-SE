package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.nio.ByteBuffer;
import vigqyno.C0201;

/* renamed from: uu1  reason: default package */
public final class uu1 extends mp1<yu1> {
    public static final String a = null;
    public static final String b = null;
    private final wu1 i;

    static {
        C0201.m83(uu1.class, 67);
    }

    public uu1(Context context, wu1 wu1) {
        super(context, C0201.m82(22181), C0201.m82(22182));
        this.i = wu1;
        e();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // defpackage.mp1
    public final /* synthetic */ yu1 b(DynamiteModule dynamiteModule, Context context) throws RemoteException, DynamiteModule.a {
        av1 av1;
        if (pp1.a(context, C0201.m82(22183))) {
            av1 = bv1.i(dynamiteModule.d(C0201.m82(22184)));
        } else {
            av1 = bv1.i(dynamiteModule.d(C0201.m82(22185)));
        }
        if (av1 == null) {
            return null;
        }
        return av1.Q2(ar0.W3(context), this.i);
    }

    @Override // defpackage.mp1
    public final void c() throws RemoteException {
        ((yu1) e()).x();
    }

    public final nu1[] f(ByteBuffer byteBuffer, np1 np1) {
        nu1[] nu1Arr;
        qu1[] qu1Arr;
        pu1[] pu1Arr;
        mu1[] mu1Arr;
        int i2 = 0;
        if (!a()) {
            return new nu1[0];
        }
        try {
            qu1[] L3 = ((yu1) e()).L3(ar0.W3(byteBuffer), np1);
            nu1[] nu1Arr2 = new nu1[L3.length];
            int i3 = 0;
            while (i3 < L3.length) {
                qu1 qu1 = L3[i3];
                int i4 = qu1.b;
                PointF pointF = new PointF(qu1.c, qu1.d);
                float f = qu1.e;
                float f2 = qu1.f;
                float f3 = qu1.g;
                float f4 = qu1.h;
                float f5 = qu1.i;
                ru1[] ru1Arr = qu1.j;
                if (ru1Arr == null) {
                    qu1Arr = L3;
                    nu1Arr = nu1Arr2;
                    pu1Arr = new pu1[i2];
                } else {
                    pu1Arr = new pu1[ru1Arr.length];
                    int i5 = 0;
                    while (i5 < ru1Arr.length) {
                        ru1 ru1 = ru1Arr[i5];
                        pu1Arr[i5] = new pu1(new PointF(ru1.b, ru1.c), ru1.d);
                        i5++;
                        L3 = L3;
                        nu1Arr2 = nu1Arr2;
                        ru1Arr = ru1Arr;
                    }
                    qu1Arr = L3;
                    nu1Arr = nu1Arr2;
                }
                su1[] su1Arr = qu1.n;
                if (su1Arr == null) {
                    mu1Arr = new mu1[0];
                } else {
                    mu1[] mu1Arr2 = new mu1[su1Arr.length];
                    for (int i6 = 0; i6 < su1Arr.length; i6++) {
                        su1 su1 = su1Arr[i6];
                        mu1Arr2[i6] = new mu1(su1.a, su1.b);
                    }
                    mu1Arr = mu1Arr2;
                }
                nu1Arr[i3] = new nu1(i4, pointF, f, f2, f3, f4, f5, pu1Arr, mu1Arr, qu1.k, qu1.l, qu1.m);
                i3++;
                L3 = qu1Arr;
                nu1Arr2 = nu1Arr;
                i2 = 0;
            }
            return nu1Arr2;
        } catch (RemoteException e) {
            Log.e(a, b, e);
            return new nu1[0];
        }
    }
}
