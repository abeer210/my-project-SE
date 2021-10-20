package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.r0;
import com.google.android.gms.common.internal.t0;
import com.google.android.gms.common.internal.u;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: lq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public abstract class lq0 extends t0 {
    private int a;

    public lq0(byte[] bArr) {
        u.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static byte[] W3(String str) {
        try {
            return str.getBytes(C0201.m82(3121));
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public abstract byte[] V3();

    public boolean equals(Object obj) {
        yq0 k3;
        if (obj != null && (obj instanceof r0)) {
            try {
                r0 r0Var = (r0) obj;
                if (r0Var.u() == hashCode() && (k3 = r0Var.k3()) != null) {
                    return Arrays.equals(V3(), (byte[]) ar0.V3(k3));
                }
                return false;
            } catch (RemoteException e) {
                Log.e(C0201.m82(3122), C0201.m82(3123), e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }

    @Override // com.google.android.gms.common.internal.r0
    public final yq0 k3() {
        return ar0.W3(V3());
    }

    @Override // com.google.android.gms.common.internal.r0
    public final int u() {
        return hashCode();
    }
}
