package io.invertase.firebase.notifications;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.i;
import androidx.core.app.m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import io.invertase.firebase.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* compiled from: DisplayNotificationTask */
public class a extends AsyncTask<Void, Void, Void> {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final String F = null;
    public static final String G = null;
    public static final String H = null;
    public static final String I = null;
    public static final String J = null;
    public static final String K = null;
    public static final String L = null;
    public static final String M = null;
    public static final String N = null;
    public static final String O = null;
    public static final String P = null;
    public static final String Q = null;
    public static final String R = null;
    public static final String S = null;
    public static final String T = null;
    public static final String U = null;
    public static final String V = null;
    public static final String W = null;
    public static final String X = null;
    public static final String Y = null;
    public static final String Z = null;
    public static final String aA = null;
    public static final String aB = null;
    public static final String aC = null;
    public static final String aD = null;
    public static final String aE = null;
    public static final String aF = null;
    public static final String aG = null;
    public static final String aH = null;
    public static final String aI = null;
    public static final String aJ = null;
    public static final String aa = null;
    public static final String ab = null;
    public static final String ac = null;
    public static final String ad = null;
    public static final String ae = null;
    public static final String af = null;
    public static final String ag = null;
    public static final String ah = null;
    public static final String ai = null;
    public static final String aj = null;
    public static final String ak = null;
    public static final String al = null;
    public static final String am = null;
    public static final String an = null;
    public static final String ao = null;
    public static final String ap = null;
    public static final String aq = null;
    public static final String ar = null;
    public static final String as = null;
    public static final String at = null;
    public static final String au = null;
    public static final String av = null;
    public static final String aw = null;
    public static final String ax = null;
    public static final String ay = null;
    public static final String az = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    private final WeakReference<Context> a;
    private final WeakReference<ReactApplicationContext> b;
    private final Promise c;
    private final Bundle d;
    private final NotificationManager e;

    static {
        C0201.m83(a.class, 89);
    }

    public a(Context context, ReactApplicationContext reactApplicationContext, NotificationManager notificationManager, Bundle bundle, Promise promise) {
        this.a = new WeakReference<>(context);
        this.b = new WeakReference<>(reactApplicationContext);
        this.c = promise;
        this.d = bundle;
        this.e = notificationManager;
    }

    private i.a a(Context context, Bundle bundle, Class cls, Bundle bundle2) {
        PendingIntent pendingIntent;
        String string = bundle.getString(C0201.m82(28538));
        String r1 = C0201.m82(28539);
        if (bundle.containsKey(r1) && bundle.getBoolean(r1)) {
            pendingIntent = c(context, cls, bundle2, string);
        } else {
            pendingIntent = b(context, bundle2, string);
        }
        i.a.C0015a aVar = new i.a.C0015a(h(bundle.getString(C0201.m82(28540))), bundle.getString(C0201.m82(28541)), pendingIntent);
        String r4 = C0201.m82(28542);
        if (bundle.containsKey(r4)) {
            aVar.c(bundle.getBoolean(r4));
        }
        String r42 = C0201.m82(28543);
        if (bundle.containsKey(r42)) {
            for (Bundle bundle3 : (List) bundle.getSerializable(r42)) {
                aVar.a(d(bundle3));
            }
        }
        return aVar.b();
    }

    private PendingIntent b(Context context, Bundle bundle, String str) {
        String str2 = bundle.getString(C0201.m82(28544)) + str;
        Intent intent = new Intent(context, b.class);
        intent.putExtra(C0201.m82(28545), str);
        intent.addFlags(536870912);
        intent.putExtra(C0201.m82(28546), bundle);
        intent.setAction(C0201.m82(28547));
        return PendingIntent.getBroadcast(context, str2.hashCode(), intent, 134217728);
    }

    private PendingIntent c(Context context, Class cls, Bundle bundle, String str) {
        Intent intent = new Intent(context, cls);
        intent.addFlags(536870912);
        intent.putExtras(bundle);
        if (str != null) {
            intent.setAction(str);
        }
        return PendingIntent.getActivity(context, bundle.getString(C0201.m82(28548)).hashCode(), intent, 134217728);
    }

    private m d(Bundle bundle) {
        m.a aVar = new m.a(bundle.getString(C0201.m82(28549)));
        String r0 = C0201.m82(28550);
        if (bundle.containsKey(r0)) {
            for (Bundle bundle2 : (List) bundle.getSerializable(r0)) {
                aVar.b(bundle2.getString(C0201.m82(28551)), bundle2.getBoolean(C0201.m82(28552)));
            }
        }
        String r02 = C0201.m82(28553);
        if (bundle.containsKey(r02)) {
            aVar.c(bundle.getBoolean(r02));
        }
        String r03 = C0201.m82(28554);
        if (bundle.containsKey(r03)) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList(r03);
            aVar.d((CharSequence[]) stringArrayList.toArray(new String[stringArrayList.size()]));
        }
        String r04 = C0201.m82(28555);
        if (bundle.containsKey(r04)) {
            aVar.e(bundle.getString(r04));
        }
        return aVar.a();
    }

    private Bitmap f(String str) {
        if (str.startsWith(C0201.m82(28556)) || str.startsWith(C0201.m82(28557))) {
            return g(str);
        }
        String r0 = C0201.m82(28558);
        if (str.startsWith(r0)) {
            return BitmapFactory.decodeFile(str.replace(r0, C0201.m82(28559)));
        }
        return BitmapFactory.decodeResource(this.a.get().getResources(), h(str));
    }

    private Bitmap g(String str) {
        try {
            URLConnection openConnection = new URL(str).openConnection();
            w30.E(openConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(w30.a(httpURLConnection));
        } catch (IOException e2) {
            Log.e(C0201.m82(28561), C0201.m82(28560) + str, e2);
            return null;
        }
    }

    private int h(String str) {
        int v2 = d.v(this.a.get(), C0201.m82(28562), str);
        return v2 == 0 ? d.v(this.a.get(), C0201.m82(28563), str) : v2;
    }

    private Class i(Context context) {
        try {
            return Class.forName(context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent().getClassName());
        } catch (ClassNotFoundException e2) {
            Log.e(C0201.m82(28564), C0201.m82(28565), e2);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0230  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02a0  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x02b9  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x02ed A[LOOP:1: B:142:0x02e7->B:144:0x02ed, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x037e  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x03b5  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0416 A[LOOP:2: B:189:0x0410->B:191:0x0416, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0430  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0462  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x0499  */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01cf  */
    /* renamed from: e */
    public Void doInBackground(Void... voidArr) {
        String str;
        Exception e2;
        Promise promise;
        String str2;
        i.d dVar;
        boolean containsKey;
        ArrayList<Integer> integerArrayList;
        int i2;
        ArrayList<String> stringArrayList;
        Bitmap f2;
        ArrayList<Integer> integerArrayList2;
        String str3 = D;
        String str4 = U;
        String str5 = I;
        String str6 = az;
        String str7 = aq;
        String str8 = K;
        String str9 = L;
        String str10 = aA;
        String str11 = N;
        String str12 = B;
        String str13 = aj;
        String str14 = w;
        String str15 = Z;
        String str16 = Y;
        String str17 = q;
        String str18 = J;
        String str19 = h;
        Context context = this.a.get();
        if (context == null) {
            return null;
        }
        try {
            Class i3 = i(context);
            if (i3 != null) {
                str = str17;
                try {
                    Class cls = i3;
                    Bundle bundle = this.d.getBundle(aD);
                    String string = this.d.getString(aI);
                    try {
                        str2 = string;
                        try {
                            dVar = new i.d(context, bundle.getString(V));
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        str2 = string;
                        dVar = new i.d(context);
                        if (this.d.containsKey(str16)) {
                        }
                        if (this.d.containsKey(str15)) {
                        }
                        if (this.d.containsKey(str14)) {
                        }
                        if (this.d.containsKey(str13)) {
                        }
                        if (this.d.containsKey(str12)) {
                        }
                        if (bundle.containsKey(str11)) {
                        }
                        try {
                            dVar.i(Double.valueOf(bundle.getDouble(str10)).intValue());
                        } catch (Throwable unused3) {
                        }
                        containsKey = bundle.containsKey(str9);
                        String str20 = av;
                        String str21 = f;
                        String str22 = k;
                        if (containsKey) {
                        }
                        if (bundle.containsKey(str8)) {
                        }
                        if (bundle.containsKey(str7)) {
                        }
                        if (bundle.containsKey(str6)) {
                        }
                        try {
                            dVar.m(bundle.getBoolean(str5));
                        } catch (Throwable unused4) {
                        }
                        if (bundle.containsKey(str4)) {
                        }
                        if (bundle.containsKey(str19)) {
                        }
                        if (bundle.containsKey(str3)) {
                        }
                        try {
                            dVar.w(Double.valueOf(bundle.getDouble(aF)).intValue());
                        } catch (Throwable unused5) {
                        }
                        if (bundle.containsKey(u)) {
                        }
                        dVar.y(f2);
                        if (bundle.containsKey(as)) {
                        }
                        if (bundle.containsKey(Q)) {
                        }
                        if (bundle.containsKey(aC)) {
                        }
                        if (bundle.containsKey(r)) {
                        }
                        if (bundle.containsKey(ai)) {
                        }
                        while (r4.hasNext()) {
                        }
                        if (bundle.containsKey(at)) {
                        }
                        if (bundle.containsKey(str18)) {
                        }
                        if (bundle.containsKey(an)) {
                        }
                        try {
                            dVar.H(bundle.getString(A));
                        } catch (Throwable unused6) {
                        }
                        if (bundle.containsKey(O)) {
                        }
                        if (bundle.containsKey(T)) {
                        }
                        if (bundle.containsKey(ax)) {
                        }
                        if (bundle.containsKey(aJ)) {
                        }
                        if (bundle.containsKey(ay)) {
                        }
                        if (bundle.containsKey(y)) {
                        }
                        long[] jArr = new long[integerArrayList.size()];
                        while (i2 < integerArrayList.size()) {
                        }
                        dVar.S(jArr);
                        if (bundle.containsKey(am)) {
                        }
                        if (bundle.containsKey(ab)) {
                        }
                        if (bundle.containsKey(ac)) {
                        }
                        if (!bundle.containsKey(ah)) {
                        }
                        dVar.o(c(context, cls, this.d, bundle.getString(t)));
                        this.e.notify(r4, str2.hashCode(), dVar.d());
                        if (this.b.get() != null) {
                        }
                        if (this.c != null) {
                        }
                    }
                    if (this.d.containsKey(str16)) {
                        dVar.p(this.d.getString(str16));
                    }
                    if (this.d.containsKey(str15)) {
                        dVar.t(this.d.getBundle(str15));
                    }
                    if (this.d.containsKey(str14)) {
                        dVar.M(d.x(context, this.d.getString(str14)));
                    }
                    if (this.d.containsKey(str13)) {
                        dVar.O(this.d.getString(str13));
                    }
                    if (this.d.containsKey(str12)) {
                        dVar.q(this.d.getString(str12));
                    }
                    if (bundle.containsKey(str11)) {
                        dVar.h(bundle.getBoolean(str11));
                    }
                    if (bundle.containsKey(str10) && Build.VERSION.SDK_INT >= 26) {
                        dVar.i(Double.valueOf(bundle.getDouble(str10)).intValue());
                    }
                    containsKey = bundle.containsKey(str9);
                    String str202 = av;
                    String str212 = f;
                    String str222 = k;
                    if (containsKey) {
                        Bundle bundle2 = bundle.getBundle(str9);
                        i.b bVar = new i.b();
                        Bitmap f3 = f(bundle2.getString(C));
                        if (f3 != null) {
                            bVar.h(f3);
                        }
                        if (bundle2.containsKey(str222)) {
                            String string2 = bundle2.getString(str222);
                            if (string2 == null) {
                                bVar.g(null);
                            } else {
                                Bitmap f4 = f(string2);
                                if (f4 != null) {
                                    bVar.g(f4);
                                }
                            }
                        }
                        if (bundle2.containsKey(str212)) {
                            bVar.i(bundle2.getString(str212));
                        }
                        if (bundle2.containsKey(str202)) {
                            bVar.j(bundle2.getString(str202));
                        }
                        dVar.N(bVar);
                    }
                    if (bundle.containsKey(str8)) {
                        Bundle bundle3 = bundle.getBundle(str8);
                        i.c cVar = new i.c();
                        cVar.g(bundle3.getString(s));
                        if (bundle3.containsKey(str212)) {
                            cVar.h(bundle3.getString(str212));
                        }
                        if (bundle3.containsKey(str202)) {
                            cVar.i(bundle3.getString(str202));
                        }
                        dVar.N(cVar);
                    }
                    if (bundle.containsKey(str7)) {
                        dVar.j(bundle.getString(str7));
                    }
                    if (bundle.containsKey(str6)) {
                        dVar.l(Color.parseColor(bundle.getString(str6)));
                    }
                    if (bundle.containsKey(str5) && Build.VERSION.SDK_INT >= 26) {
                        dVar.m(bundle.getBoolean(str5));
                    }
                    if (bundle.containsKey(str4)) {
                        dVar.n(bundle.getString(str4));
                    }
                    if (bundle.containsKey(str19)) {
                        int intValue = Double.valueOf(bundle.getDouble(str19)).intValue();
                        if (intValue == 0 && (integerArrayList2 = bundle.getIntegerArrayList(str19)) != null) {
                            Iterator<Integer> it = integerArrayList2.iterator();
                            while (it.hasNext()) {
                                intValue |= it.next().intValue();
                            }
                        }
                        dVar.r(intValue);
                    }
                    if (bundle.containsKey(str3)) {
                        dVar.v(bundle.getString(str3));
                    }
                    if (bundle.containsKey(g) && Build.VERSION.SDK_INT >= 26) {
                        dVar.w(Double.valueOf(bundle.getDouble(aF)).intValue());
                    }
                    if (bundle.containsKey(u)) {
                        dVar.x(bundle.getBoolean(R));
                    }
                    if (bundle.containsKey(str222) && (f2 = f(bundle.getString(str222))) != null) {
                        dVar.y(f2);
                    }
                    if (bundle.containsKey(as)) {
                        Bundle bundle4 = bundle.getBundle(z);
                        dVar.z(Double.valueOf(bundle4.getDouble(F)).intValue(), Double.valueOf(bundle4.getDouble(aE)).intValue(), Double.valueOf(bundle4.getDouble(ak)).intValue());
                    }
                    if (bundle.containsKey(Q)) {
                        dVar.A(bundle.getBoolean(M));
                    }
                    if (bundle.containsKey(aC)) {
                        dVar.B(Double.valueOf(bundle.getDouble(H)).intValue());
                    }
                    if (bundle.containsKey(r)) {
                        dVar.C(bundle.getBoolean(j));
                    }
                    if (bundle.containsKey(ai)) {
                        dVar.D(bundle.getBoolean(i));
                    }
                    if (bundle.containsKey(ao) && (stringArrayList = bundle.getStringArrayList(ap)) != null) {
                        for (String str23 : stringArrayList) {
                            dVar.c(str23);
                        }
                    }
                    if (bundle.containsKey(at)) {
                        dVar.E(Double.valueOf(bundle.getDouble(al)).intValue());
                    }
                    if (bundle.containsKey(str18)) {
                        Bundle bundle5 = bundle.getBundle(str18);
                        dVar.F(Double.valueOf(bundle5.getDouble(P)).intValue(), Double.valueOf(bundle5.getDouble(str18)).intValue(), bundle5.getBoolean(o));
                    }
                    if (bundle.containsKey(an)) {
                        dVar.G(bundle.getStringArray(af));
                    }
                    if (bundle.containsKey(n) && Build.VERSION.SDK_INT >= 26) {
                        dVar.H(bundle.getString(A));
                    }
                    if (bundle.containsKey(O)) {
                        dVar.I(bundle.getBoolean(ar));
                    }
                    if (bundle.containsKey(T)) {
                        Bundle bundle6 = bundle.getBundle(W);
                        int h2 = h(bundle6.getString(au));
                        if (h2 != 0) {
                            if (bundle6.containsKey(S)) {
                                dVar.K(h2, Double.valueOf(bundle6.getDouble(aH)).intValue());
                            } else {
                                dVar.J(h2);
                            }
                        }
                    }
                    if (bundle.containsKey(ax)) {
                        dVar.L(bundle.getString(aB));
                    }
                    if (bundle.containsKey(aJ)) {
                        dVar.P(bundle.getString(X));
                    }
                    if (bundle.containsKey(ay)) {
                        dVar.Q(Double.valueOf(bundle.getDouble(aa)).longValue());
                    }
                    if (bundle.containsKey(y)) {
                        dVar.R(bundle.getBoolean(x));
                    }
                    if (bundle.containsKey(ad) && (integerArrayList = bundle.getIntegerArrayList(ag)) != null) {
                        long[] jArr2 = new long[integerArrayList.size()];
                        for (i2 = 0; i2 < integerArrayList.size(); i2++) {
                            jArr2[i2] = integerArrayList.get(i2).longValue();
                        }
                        dVar.S(jArr2);
                    }
                    if (bundle.containsKey(am)) {
                        dVar.T(Double.valueOf(bundle.getDouble(v)).intValue());
                    }
                    if (bundle.containsKey(ab)) {
                        dVar.U(Double.valueOf(bundle.getDouble(ae)).longValue());
                    }
                    if (bundle.containsKey(ac)) {
                        for (Bundle bundle7 : (List) bundle.getSerializable(E)) {
                            dVar.b(a(context, bundle7, cls, this.d));
                            cls = cls;
                        }
                    }
                    String string3 = !bundle.containsKey(ah) ? bundle.getString(G) : null;
                    dVar.o(c(context, cls, this.d, bundle.getString(t)));
                    this.e.notify(string3, str2.hashCode(), dVar.d());
                    if (this.b.get() != null) {
                        c.k(this.b.get(), aG, Arguments.fromBundle(this.d));
                    }
                    if (this.c != null) {
                        return null;
                    }
                    this.c.resolve(null);
                    return null;
                } catch (Exception e3) {
                    e2 = e3;
                    Log.e(p, l, e2);
                    promise = this.c;
                    if (promise != null) {
                    }
                }
            } else if (this.c == null) {
                return null;
            } else {
                this.c.reject(str17, aw);
                return null;
            }
        } catch (Exception e4) {
            e2 = e4;
            str = str17;
            Log.e(p, l, e2);
            promise = this.c;
            if (promise != null) {
                return null;
            }
            promise.reject(str, m, e2);
            return null;
        }
    }

    /* renamed from: j */
    public void onPostExecute(Void r1) {
        this.a.clear();
        this.b.clear();
    }
}
