package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.f;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import vigqyno.C0188;
import vigqyno.C0201;

public final class y8 extends k5 {
    private static final String[] g = {C0201.m82(36636), C0201.m82(36637), C0201.m82(36638)};
    private SecureRandom c;
    private final AtomicLong d = new AtomicLong(0);
    private int e;
    private Integer f = null;

    static {
        Collections.unmodifiableList(Arrays.asList(C0201.m82(36639), C0201.m82(36640), C0201.m82(36641), C0201.m82(36642), C0201.m82(36643)));
    }

    public y8(o4 o4Var) {
        super(o4Var);
    }

    private static boolean J(Bundle bundle, int i) {
        String r0 = C0201.m82(36644);
        if (bundle.getLong(r0) != 0) {
            return false;
        }
        bundle.putLong(r0, (long) i);
        return true;
    }

    public static boolean K(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    private final boolean M(String str, String str2, int i, Object obj, boolean z) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                String valueOf = String.valueOf(obj);
                if (valueOf.codePointCount(0, valueOf.length()) > i) {
                    e().J().c(C0201.m82(36647), str, str2, Integer.valueOf(valueOf.length()));
                    return false;
                }
            } else if ((obj instanceof Bundle) && z) {
                return true;
            } else {
                if ((obj instanceof Parcelable[]) && z) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    for (Parcelable parcelable : parcelableArr) {
                        if (!(parcelable instanceof Bundle)) {
                            e().J().b(C0201.m82(36645), parcelable.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                } else if (!(obj instanceof ArrayList) || !z) {
                    return false;
                } else {
                    ArrayList arrayList = (ArrayList) obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj2 = arrayList.get(i2);
                        i2++;
                        if (!(obj2 instanceof Bundle)) {
                            e().J().b(C0201.m82(36646), obj2.getClass(), str2);
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
        return true;
    }

    public static boolean N(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public static byte[] P(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    private static void S(Bundle bundle, Object obj) {
        u.k(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong(C0201.m82(36648), (long) String.valueOf(obj).length());
        }
    }

    private static boolean U(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static boolean V(Context context, boolean z) {
        u.k(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return U(context, C0201.m82(36649));
        }
        return U(context, C0201.m82(36650));
    }

    public static boolean W(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    public static Bundle[] X(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static boolean Y(String str) {
        u.g(str);
        if (str.charAt(0) != '_' || str.equals(C0201.m82(36651))) {
            return true;
        }
        return false;
    }

    private static boolean b0(String str) {
        u.k(str);
        return str.matches(C0201.m82(36652));
    }

    private static int c0(String str) {
        if (C0201.m82(36653).equals(str)) {
            return 2048;
        }
        return C0201.m82(36654).equals(str) ? 256 : 36;
    }

    public static boolean e0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(C0201.m82(36655));
    }

    public static long h0(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    public static Bundle j0(List<t8> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (t8 t8Var : list) {
            String str = t8Var.e;
            if (str != null) {
                bundle.putString(t8Var.b, str);
            } else {
                Long l = t8Var.d;
                if (l != null) {
                    bundle.putLong(t8Var.b, l.longValue());
                } else {
                    Double d2 = t8Var.g;
                    if (d2 != null) {
                        bundle.putDouble(t8Var.b, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public static boolean k0(Intent intent) {
        String stringExtra = intent.getStringExtra(C0201.m82(36656));
        return C0201.m82(36657).equals(stringExtra) || C0201.m82(36658).equals(stringExtra) || C0201.m82(36659).equals(stringExtra);
    }

    public static long m0(byte[] bArr) {
        u.k(bArr);
        int i = 0;
        u.n(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    public static ArrayList<Bundle> o0(List<g9> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (g9 g9Var : list) {
            Bundle bundle = new Bundle();
            bundle.putString(C0201.m82(36660), g9Var.a);
            bundle.putString(C0201.m82(36661), g9Var.b);
            bundle.putLong(C0201.m82(36662), g9Var.d);
            bundle.putString(C0201.m82(36663), g9Var.c.b);
            m5.b(bundle, g9Var.c.o());
            bundle.putBoolean(C0201.m82(36664), g9Var.e);
            String str = g9Var.f;
            if (str != null) {
                bundle.putString(C0201.m82(36665), str);
            }
            j jVar = g9Var.g;
            if (jVar != null) {
                bundle.putString(C0201.m82(36666), jVar.a);
                i iVar = g9Var.g.b;
                if (iVar != null) {
                    bundle.putBundle(C0201.m82(36667), iVar.w());
                }
            }
            bundle.putLong(C0201.m82(36668), g9Var.h);
            j jVar2 = g9Var.i;
            if (jVar2 != null) {
                bundle.putString(C0201.m82(36669), jVar2.a);
                i iVar2 = g9Var.i.b;
                if (iVar2 != null) {
                    bundle.putBundle(C0201.m82(36670), iVar2.w());
                }
            }
            bundle.putLong(C0201.m82(36671), g9Var.c.c);
            bundle.putLong(C0201.m82(36672), g9Var.j);
            j jVar3 = g9Var.k;
            if (jVar3 != null) {
                bundle.putString(C0201.m82(36673), jVar3.a);
                i iVar3 = g9Var.k.b;
                if (iVar3 != null) {
                    bundle.putBundle(C0201.m82(36674), iVar3.w());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final boolean p0(Context context, String str) {
        X500Principal x500Principal = new X500Principal(C0201.m82(36675));
        try {
            PackageInfo d2 = hq0.a(context).d(str, 64);
            if (d2 == null || d2.signatures == null || d2.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance(C0201.m82(36676)).generateCertificate(new ByteArrayInputStream(d2.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            e().E().a(C0201.m82(36678), e2);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            e().E().a(C0201.m82(36677), e3);
            return true;
        }
    }

    public static Bundle r0(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    public static MessageDigest t() {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest instance = MessageDigest.getInstance(C0201.m82(36679));
                if (instance != null) {
                    return instance;
                }
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    private static Object x(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return y(String.valueOf(obj), i, z);
            }
            return null;
        }
    }

    public static String y(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat(C0201.m82(36680));
        }
        return null;
    }

    public static boolean z0(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public final void A(int i, String str, String str2, int i2) {
        I(null, i, str, str2, i2);
    }

    public final void B(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (str != null) {
                e().J().b(C0201.m82(36681), l().w(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void C(jh1 jh1, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(C0201.m82(36682), i);
        try {
            jh1.q2(bundle);
        } catch (RemoteException e2) {
            this.a.e().H().a(C0201.m82(36683), e2);
        }
    }

    public final void D(jh1 jh1, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong(C0201.m82(36684), j);
        try {
            jh1.q2(bundle);
        } catch (RemoteException e2) {
            this.a.e().H().a(C0201.m82(36685), e2);
        }
    }

    public final void E(jh1 jh1, Bundle bundle) {
        try {
            jh1.q2(bundle);
        } catch (RemoteException e2) {
            this.a.e().H().a(C0201.m82(36686), e2);
        }
    }

    public final void F(jh1 jh1, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(C0201.m82(36687), arrayList);
        try {
            jh1.q2(bundle);
        } catch (RemoteException e2) {
            this.a.e().H().a(C0201.m82(36688), e2);
        }
    }

    public final void G(jh1 jh1, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(C0201.m82(36689), z);
        try {
            jh1.q2(bundle);
        } catch (RemoteException e2) {
            this.a.e().H().a(C0201.m82(36690), e2);
        }
    }

    public final void H(jh1 jh1, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray(C0201.m82(36691), bArr);
        try {
            jh1.q2(bundle);
        } catch (RemoteException e2) {
            this.a.e().H().a(C0201.m82(36692), e2);
        }
    }

    public final void I(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        J(bundle, i);
        if (g().G(str, l.p0)) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                bundle.putString(str2, str3);
            }
        } else if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong(C0201.m82(36693), (long) i2);
        }
        this.a.a();
        this.a.L().I(C0201.m82(36694), C0201.m82(36695), bundle);
    }

    public final boolean L(String str, int i, String str2) {
        if (str2 == null) {
            e().G().a(C0201.m82(36696), str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            e().G().c(C0201.m82(36697), str, Integer.valueOf(i), str2);
            return false;
        }
    }

    public final boolean O(String str, String[] strArr, String str2) {
        boolean z;
        boolean z2;
        if (str2 == null) {
            e().G().a(C0201.m82(36698), str);
            return false;
        }
        u.k(str2);
        String[] strArr2 = g;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            e().G().b(C0201.m82(36699), str, str2);
            return false;
        }
        if (strArr != null) {
            u.k(strArr);
            int length2 = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    z2 = false;
                    break;
                } else if (z0(str2, strArr[i2])) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                e().G().b(C0201.m82(36700), str, str2);
                return false;
            }
        }
        return true;
    }

    public final Object Q(String str, Object obj) {
        int i = 256;
        if (C0201.m82(36701).equals(str)) {
            return x(256, obj, true);
        }
        if (!e0(str)) {
            i = 100;
        }
        return x(i, obj, false);
    }

    public final void R(Bundle bundle, long j) {
        String r0 = C0201.m82(36702);
        long j2 = bundle.getLong(r0);
        if (j2 != 0) {
            e().H().a(C0201.m82(36703), Long.valueOf(j2));
        }
        bundle.putLong(r0, j + j2);
    }

    public final void T(jh1 jh1, String str) {
        Bundle bundle = new Bundle();
        bundle.putString(C0201.m82(36704), str);
        try {
            jh1.q2(bundle);
        } catch (RemoteException e2) {
            this.a.e().H().a(C0201.m82(36705), e2);
        }
    }

    public final int Z(String str) {
        String r0 = C0201.m82(36706);
        if (!x0(r0, str)) {
            return 2;
        }
        if (!O(r0, p5.a, str)) {
            return 13;
        }
        if (!L(r0, 40, str)) {
            return 2;
        }
        return 0;
    }

    public final int a0(String str) {
        String r0 = C0201.m82(36707);
        if (!x0(r0, str)) {
            return 6;
        }
        if (!O(r0, r5.a, str)) {
            return 15;
        }
        if (!L(r0, 24, str)) {
            return 6;
        }
        return 0;
    }

    public final boolean d0(String str) {
        j();
        if (hq0.a(getContext()).a(str) == 0) {
            return true;
        }
        e().L().a(C0201.m82(36708), str);
        return false;
    }

    public final boolean f0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String A = g().A();
        a();
        return A.equals(str);
    }

    public final int g0(String str, Object obj) {
        boolean z;
        if (C0201.m82(36709).equals(str)) {
            z = M(C0201.m82(36710), str, c0(str), obj, false);
        } else {
            z = M(C0201.m82(36711), str, c0(str), obj, false);
        }
        return z ? 0 : 7;
    }

    public final long i0(Context context, String str) {
        j();
        u.k(context);
        u.g(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest t = t();
        if (t == null) {
            e().E().d(C0201.m82(36712));
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!p0(context, str)) {
                    PackageInfo d2 = hq0.a(context).d(getContext().getPackageName(), 64);
                    if (d2.signatures != null && d2.signatures.length > 0) {
                        return m0(t.digest(d2.signatures[0].toByteArray()));
                    }
                    e().H().d(C0201.m82(36713));
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                e().E().a(C0201.m82(36714), e2);
            }
        }
        return 0;
    }

    public final int l0(int i) {
        return zo0.h().j(getContext(), 12451000);
    }

    public final Object n0(String str, Object obj) {
        if (C0201.m82(36715).equals(str)) {
            return x(c0(str), obj, true);
        }
        return x(c0(str), obj, false);
    }

    public final Bundle q0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object Q = Q(str, bundle.get(str));
                if (Q == null) {
                    e().J().a(C0201.m82(36716), l().w(str));
                } else {
                    B(bundle2, str, Q);
                }
            }
        }
        return bundle2;
    }

    @Override // com.google.android.gms.measurement.internal.k5
    public final boolean r() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.k5
    public final void s() {
        j();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                e().H().d(C0201.m82(36717));
            }
        }
        this.d.set(nextLong);
    }

    public final long s0() {
        long andIncrement;
        long j;
        if (this.d.get() == 0) {
            synchronized (this.d) {
                long nextLong = new Random(System.nanoTime() ^ b().a()).nextLong();
                int i = this.e + 1;
                this.e = i;
                j = nextLong + ((long) i);
            }
            return j;
        }
        synchronized (this.d) {
            this.d.compareAndSet(-1, 1);
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }

    public final SecureRandom t0() {
        j();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final Bundle u(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            boolean isHierarchical = uri.isHierarchical();
            String r2 = C0201.m82(36718);
            if (isHierarchical) {
                str4 = uri.getQueryParameter(C0201.m82(36719));
                str3 = uri.getQueryParameter(C0201.m82(36720));
                str2 = uri.getQueryParameter(C0201.m82(36721));
                str = uri.getQueryParameter(r2);
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString(C0201.m82(36722), str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString(C0201.m82(36723), str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString(C0201.m82(36724), str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(r2, str);
            }
            String queryParameter = uri.getQueryParameter(C0201.m82(36725));
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString(C0201.m82(36726), queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter(C0201.m82(36727));
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString(C0201.m82(36728), queryParameter2);
            }
            String r1 = C0201.m82(36729);
            String queryParameter3 = uri.getQueryParameter(r1);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(r1, queryParameter3);
            }
            String r12 = C0201.m82(36730);
            String queryParameter4 = uri.getQueryParameter(r12);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(r12, queryParameter4);
            }
            String r13 = C0201.m82(36731);
            String queryParameter5 = uri.getQueryParameter(r13);
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(r13, queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            e().H().a(C0201.m82(36732), e2);
            return null;
        }
    }

    public final int u0() {
        if (this.f == null) {
            this.f = Integer.valueOf(zo0.h().b(getContext()) / C0188.f18);
        }
        return this.f.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        if (L(r2, 40, r15) == false) goto L_0x005b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ec  */
    public final Bundle v(String str, String str2, Bundle bundle, List<String> list, boolean z, boolean z2) {
        Set<String> set;
        int i;
        String str3;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        int i4;
        String[] strArr = null;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        if (g().G(str, l.v0)) {
            set = new TreeSet<>(bundle.keySet());
        } else {
            set = bundle.keySet();
        }
        Iterator<String> it = set.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            String next = it.next();
            if (list == null || !list.contains(next)) {
                int i6 = 14;
                String r2 = C0201.m82(36733);
                if (z) {
                    if (w0(r2, next)) {
                        if (!O(r2, strArr, next)) {
                            i = 14;
                            if (i == 0) {
                                if (x0(r2, next)) {
                                    if (O(r2, strArr, next)) {
                                        if (L(r2, 40, next)) {
                                            i6 = 0;
                                        }
                                    }
                                    i = i6;
                                }
                                i6 = 3;
                                i = i6;
                            }
                        }
                    }
                    i = 3;
                    if (i == 0) {
                    }
                }
                i = 0;
                if (i == 0) {
                }
            } else {
                i = 0;
            }
            String r4 = C0201.m82(36734);
            if (i != 0) {
                if (J(bundle2, i)) {
                    bundle2.putString(r4, y(next, 40, true));
                    if (i == 3) {
                        S(bundle2, next);
                    }
                }
                bundle2.remove(next);
            } else {
                Object obj = bundle.get(next);
                j();
                if (z2) {
                    if (obj instanceof Parcelable[]) {
                        i4 = ((Parcelable[]) obj).length;
                    } else {
                        if (obj instanceof ArrayList) {
                            i4 = ((ArrayList) obj).size();
                        }
                        z4 = true;
                        if (!z4) {
                            i3 = 17;
                            str3 = r4;
                            i2 = 40;
                            if (i3 == 0 && !str3.equals(next)) {
                                if (J(bundle2, i3)) {
                                    bundle2.putString(str3, y(next, i2, true));
                                    S(bundle2, bundle.get(next));
                                }
                                bundle2.remove(next);
                            } else if (!Y(next) && (i5 = i5 + 1) > 25) {
                                StringBuilder sb = new StringBuilder(48);
                                sb.append(C0201.m82(36739));
                                e().G().b(sb.toString(), l().v(str2), l().A(bundle));
                                J(bundle2, 5);
                                bundle2.remove(next);
                            }
                        }
                    }
                    if (i4 > 1000) {
                        e().J().c(C0201.m82(36735), C0201.m82(36736), next, Integer.valueOf(i4));
                        z4 = false;
                        if (!z4) {
                        }
                    }
                    z4 = true;
                    if (!z4) {
                    }
                }
                if ((!g().M(str) || !e0(str2)) && !e0(next)) {
                    str3 = r4;
                    i2 = 40;
                    z3 = M(C0201.m82(36738), next, 100, obj, z2);
                } else {
                    str3 = r4;
                    i2 = 40;
                    z3 = M(C0201.m82(36737), next, 256, obj, z2);
                }
                i3 = z3 ? 0 : 4;
                if (i3 == 0) {
                }
                if (!Y(next)) {
                }
            }
            strArr = null;
        }
        return bundle2;
    }

    public final String v0() {
        byte[] bArr = new byte[16];
        t0().nextBytes(bArr);
        return String.format(Locale.US, C0201.m82(36740), new BigInteger(1, bArr));
    }

    public final j w(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (Z(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            String r10 = C0201.m82(36741);
            bundle2.putString(r10, str3);
            return new j(str2, new i(q0(v(str, str2, bundle2, f.b(r10), false, false))), str3, j);
        }
        e().E().a(C0201.m82(36742), l().x(str2));
        throw new IllegalArgumentException();
    }

    public final boolean w0(String str, String str2) {
        if (str2 == null) {
            e().G().a(C0201.m82(36743), str);
            return false;
        } else if (str2.length() == 0) {
            e().G().a(C0201.m82(36744), str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                e().G().b(C0201.m82(36745), str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    e().G().b(C0201.m82(36746), str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean x0(String str, String str2) {
        if (str2 == null) {
            e().G().a(C0201.m82(36747), str);
            return false;
        } else if (str2.length() == 0) {
            e().G().a(C0201.m82(36748), str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        e().G().b(C0201.m82(36750), str, str2);
                        return false;
                    }
                }
                return true;
            }
            e().G().b(C0201.m82(36749), str, str2);
            return false;
        }
    }

    public final boolean y0(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (b0(str)) {
                return true;
            }
            if (this.a.z()) {
                e().G().a(C0201.m82(36751), k3.B(str));
            }
            return false;
        } else if (TextUtils.isEmpty(str2)) {
            if (this.a.z()) {
                e().G().d(C0201.m82(36753));
            }
            return false;
        } else if (b0(str2)) {
            return true;
        } else {
            e().G().a(C0201.m82(36752), k3.B(str2));
            return false;
        }
    }

    public final URL z(long j, String str, String str2) {
        try {
            u.g(str2);
            u.g(str);
            return new URL(String.format(C0201.m82(36754), String.format(C0201.m82(36755), Long.valueOf(j), Integer.valueOf(u0())), str2, str));
        } catch (IllegalArgumentException | MalformedURLException e2) {
            e().E().a(C0201.m82(36756), e2.getMessage());
            return null;
        }
    }
}
