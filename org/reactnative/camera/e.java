package org.reactnative.camera;

import android.media.CamcorderProfile;
import android.os.Build;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import vigqyno.C0201;

/* compiled from: RNCameraViewHelper */
public class e {
    public static final String[][] a;

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraViewHelper */
    public static class a implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ WritableArray b;
        public final /* synthetic */ byte[] c;
        public final /* synthetic */ ReactContext d;

        public a(ViewGroup viewGroup, WritableArray writableArray, byte[] bArr, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = writableArray;
            this.c = bArr;
            this.d = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.d.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(az2.n(this.a.getId(), this.b, this.c));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraViewHelper */
    public static class b implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ xy2 b;
        public final /* synthetic */ ReactContext c;

        public b(ViewGroup viewGroup, xy2 xy2, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = xy2;
            this.c = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.c.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(zy2.n(this.a.getId(), this.b));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraViewHelper */
    public static class c implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ t62 b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ byte[] e;
        public final /* synthetic */ ReactContext f;

        public c(ViewGroup viewGroup, t62 t62, int i, int i2, byte[] bArr, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = t62;
            this.c = i;
            this.d = i2;
            this.e = bArr;
            this.f = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.f.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(yy2.n(this.a.getId(), this.b, this.c, this.d, this.e));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraViewHelper */
    public static class d implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ WritableArray b;
        public final /* synthetic */ ReactContext c;

        public d(ViewGroup viewGroup, WritableArray writableArray, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = writableArray;
            this.c = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.c.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(jz2.o(this.a.getId(), this.b));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: org.reactnative.camera.e$e  reason: collision with other inner class name */
    /* compiled from: RNCameraViewHelper */
    public static class RunnableC0165e implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ String b;
        public final /* synthetic */ ReactContext c;

        public RunnableC0165e(ViewGroup viewGroup, String str, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = str;
            this.c = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.c.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(bz2.n(this.a.getId(), this.b));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraViewHelper */
    public static class f implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ ReactContext b;

        public f(ViewGroup viewGroup, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.b.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(cz2.m(this.a.getId()));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraViewHelper */
    public static class g implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ WritableMap b;
        public final /* synthetic */ ReactContext c;

        public g(ViewGroup viewGroup, WritableMap writableMap, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = writableMap;
            this.c = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.c.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(fz2.n(this.a.getId(), this.b));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraViewHelper */
    public static class h implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ ReactContext b;

        public h(ViewGroup viewGroup, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.b.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(gz2.m(this.a.getId()));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraViewHelper */
    public static class i implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ WritableMap b;
        public final /* synthetic */ ReactContext c;

        public i(ViewGroup viewGroup, WritableMap writableMap, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = writableMap;
            this.c = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.c.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(iz2.n(this.a.getId(), this.b));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraViewHelper */
    public static class j implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ ReactContext b;

        public j(ViewGroup viewGroup, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.b.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(hz2.m(this.a.getId()));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraViewHelper */
    public static class k implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ ReactContext e;

        public k(ViewGroup viewGroup, boolean z, int i, int i2, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = z;
            this.c = i;
            this.d = i2;
            this.e = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.e.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(kz2.n(this.a.getId(), this.b, this.c, this.d));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraViewHelper */
    public static class l implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ WritableArray b;
        public final /* synthetic */ ReactContext c;

        public l(ViewGroup viewGroup, WritableArray writableArray, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = writableArray;
            this.c = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.c.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(ez2.n(this.a.getId(), this.b));
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: RNCameraViewHelper */
    public static class m implements Runnable {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ org.reactnative.facedetector.b b;
        public final /* synthetic */ ReactContext c;

        public m(ViewGroup viewGroup, org.reactnative.facedetector.b bVar, ReactContext reactContext) {
            this.a = viewGroup;
            this.b = bVar;
            this.c = reactContext;
        }

        public void run() {
            ((UIManagerModule) this.c.getNativeModule(UIManagerModule.class)).getEventDispatcher().v(dz2.n(this.a.getId(), this.b));
        }
    }

    static {
        String r1 = C0201.m82(31868);
        String r2 = C0201.m82(31870);
        String r3 = C0201.m82(31885);
        a = new String[][]{new String[]{r1, C0201.m82(31869)}, new String[]{r2, C0201.m82(31871)}, new String[]{r2, C0201.m82(31872)}, new String[]{r1, C0201.m82(31873)}, new String[]{r1, C0201.m82(31874)}, new String[]{r1, C0201.m82(31875)}, new String[]{r2, C0201.m82(31876)}, new String[]{r2, C0201.m82(31877)}, new String[]{r2, C0201.m82(31878)}, new String[]{r2, C0201.m82(31879)}, new String[]{r1, C0201.m82(31880)}, new String[]{r1, C0201.m82(31881)}, new String[]{r2, C0201.m82(31882)}, new String[]{r2, C0201.m82(31883)}, new String[]{r2, C0201.m82(31884)}, new String[]{r3, C0201.m82(31886)}, new String[]{r3, C0201.m82(31887)}, new String[]{r2, C0201.m82(31888)}, new String[]{r2, C0201.m82(31889)}, new String[]{r2, C0201.m82(31890)}, new String[]{r1, C0201.m82(31891)}, new String[]{r2, C0201.m82(31892)}, new String[]{r2, C0201.m82(31893)}, new String[]{r2, C0201.m82(31894)}, new String[]{r3, C0201.m82(31895)}, new String[]{r3, C0201.m82(31896)}, new String[]{r3, C0201.m82(31897)}, new String[]{r2, C0201.m82(31898)}, new String[]{r2, C0201.m82(31899)}, new String[]{r3, C0201.m82(31900)}, new String[]{r3, C0201.m82(31901)}, new String[]{r3, C0201.m82(31902)}, new String[]{r1, C0201.m82(31903)}, new String[]{r2, C0201.m82(31904)}, new String[]{r1, C0201.m82(31905)}, new String[]{r3, C0201.m82(31906)}, new String[]{r2, C0201.m82(31907)}, new String[]{r2, C0201.m82(31908)}, new String[]{r1, C0201.m82(31909)}, new String[]{r1, C0201.m82(31910)}, new String[]{r1, C0201.m82(31911)}, new String[]{r3, C0201.m82(31912)}, new String[]{r1, C0201.m82(31913)}, new String[]{r3, C0201.m82(31914)}, new String[]{r3, C0201.m82(31915)}, new String[]{r2, C0201.m82(31916)}, new String[]{r2, C0201.m82(31917)}, new String[]{r3, C0201.m82(31918)}, new String[]{r3, C0201.m82(31919)}, new String[]{r1, C0201.m82(31920)}, new String[]{r2, C0201.m82(31921)}, new String[]{r3, C0201.m82(31922)}, new String[]{r1, C0201.m82(31923)}, new String[]{r3, C0201.m82(31924)}, new String[]{r2, C0201.m82(31925)}, new String[]{r2, C0201.m82(31926)}, new String[]{r3, C0201.m82(31927)}, new String[]{r3, C0201.m82(31928)}, new String[]{r2, C0201.m82(31929)}, new String[]{r2, C0201.m82(31930)}, new String[]{r1, C0201.m82(31931)}, new String[]{r2, C0201.m82(31932)}, new String[]{r1, C0201.m82(31933)}, new String[]{r3, C0201.m82(31934)}, new String[]{r2, C0201.m82(31935)}, new String[]{r2, C0201.m82(31936)}, new String[]{r1, C0201.m82(31937)}, new String[]{r2, C0201.m82(31938)}, new String[]{r2, C0201.m82(31939)}, new String[]{r1, C0201.m82(31940)}, new String[]{r2, C0201.m82(31941)}, new String[]{r2, C0201.m82(31942)}, new String[]{r1, C0201.m82(31943)}, new String[]{r2, C0201.m82(31944)}, new String[]{r2, C0201.m82(31945)}, new String[]{r3, C0201.m82(31946)}, new String[]{r1, C0201.m82(31947)}, new String[]{r1, C0201.m82(31948)}, new String[]{r2, C0201.m82(31949)}, new String[]{r1, C0201.m82(31950)}, new String[]{r1, C0201.m82(31951)}, new String[]{r1, C0201.m82(31952)}, new String[]{r2, C0201.m82(31953)}, new String[]{r3, C0201.m82(31954)}, new String[]{r2, C0201.m82(31955)}, new String[]{r2, C0201.m82(31956)}, new String[]{r1, C0201.m82(31957)}, new String[]{r2, C0201.m82(31958)}, new String[]{r2, C0201.m82(31959)}, new String[]{r1, C0201.m82(31960)}, new String[]{r3, C0201.m82(31961)}, new String[]{r1, C0201.m82(31962)}, new String[]{r3, C0201.m82(31963)}, new String[]{r1, C0201.m82(31964)}, new String[]{r3, C0201.m82(31965)}, new String[]{r1, C0201.m82(31966)}, new String[]{r3, C0201.m82(31967)}, new String[]{r1, C0201.m82(31968)}, new String[]{r3, C0201.m82(31969)}, new String[]{r1, C0201.m82(31970)}, new String[]{r2, C0201.m82(31971)}, new String[]{r3, C0201.m82(31972)}, new String[]{r1, C0201.m82(31973)}, new String[]{r1, C0201.m82(31974)}, new String[]{r1, C0201.m82(31975)}, new String[]{r1, C0201.m82(31976)}, new String[]{r1, C0201.m82(31977)}, new String[]{r1, C0201.m82(31978)}, new String[]{r1, C0201.m82(31979)}, new String[]{r3, C0201.m82(31980)}, new String[]{r1, C0201.m82(31981)}, new String[]{r1, C0201.m82(31982)}, new String[]{r1, C0201.m82(31983)}, new String[]{r3, C0201.m82(31984)}, new String[]{r1, C0201.m82(31985)}, new String[]{r1, C0201.m82(31986)}, new String[]{r1, C0201.m82(31987)}, new String[]{r2, C0201.m82(31988)}, new String[]{r2, C0201.m82(31989)}, new String[]{r2, C0201.m82(31990)}, new String[]{r2, C0201.m82(31991)}, new String[]{r2, C0201.m82(31992)}, new String[]{r2, C0201.m82(31993)}, new String[]{r2, C0201.m82(31994)}, new String[]{r2, C0201.m82(31995)}, new String[]{r2, C0201.m82(31996)}, new String[]{r2, C0201.m82(31997)}, new String[]{r2, C0201.m82(31998)}, new String[]{r2, C0201.m82(31999)}};
    }

    public static void a(k4 k4Var) {
        for (String[] strArr : a) {
            k4Var.T(strArr[1], null);
        }
        k4Var.T(C0201.m82(32000), null);
        k4Var.T(C0201.m82(32001), null);
        k4Var.T(C0201.m82(32002), null);
    }

    public static void b(ViewGroup viewGroup, t62 t62, int i2, int i3, byte[] bArr) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new c(viewGroup, t62, i2, i3, bArr, reactContext));
    }

    public static void c(ViewGroup viewGroup, xy2 xy2) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new b(viewGroup, xy2, reactContext));
    }

    public static void d(ViewGroup viewGroup, WritableArray writableArray, byte[] bArr) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new a(viewGroup, writableArray, bArr, reactContext));
    }

    public static void e(ViewGroup viewGroup) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new f(viewGroup, reactContext));
    }

    public static void f(ViewGroup viewGroup, org.reactnative.facedetector.b bVar) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new m(viewGroup, bVar, reactContext));
    }

    public static void g(ViewGroup viewGroup, WritableArray writableArray) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new l(viewGroup, writableArray, reactContext));
    }

    public static void h(ViewGroup viewGroup, String str) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new RunnableC0165e(viewGroup, str, reactContext));
    }

    public static void i(ViewGroup viewGroup, WritableMap writableMap) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new g(viewGroup, writableMap, reactContext));
    }

    public static void j(ViewGroup viewGroup) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new h(viewGroup, reactContext));
    }

    public static void k(ViewGroup viewGroup) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new j(viewGroup, reactContext));
    }

    public static void l(ViewGroup viewGroup, WritableMap writableMap) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new i(viewGroup, writableMap, reactContext));
    }

    public static void m(ViewGroup viewGroup, WritableArray writableArray) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new d(viewGroup, writableArray, reactContext));
    }

    public static void n(ViewGroup viewGroup, boolean z, int i2, int i3) {
        ReactContext reactContext = (ReactContext) viewGroup.getContext();
        reactContext.runOnNativeModulesQueueThread(new k(viewGroup, z, i2, i3, reactContext));
    }

    public static CamcorderProfile o(int i2) {
        CamcorderProfile camcorderProfile = CamcorderProfile.get(1);
        int p = p(i2);
        if (CamcorderProfile.hasProfile(p)) {
            camcorderProfile = CamcorderProfile.get(p);
            if (i2 == 4) {
                camcorderProfile.videoFrameWidth = 640;
            }
        }
        return camcorderProfile;
    }

    private static int p(int i2) {
        if (i2 == 0) {
            return Build.VERSION.SDK_INT >= 21 ? 8 : 6;
        }
        if (i2 == 1) {
            return 6;
        }
        if (i2 != 2) {
            return (i2 == 3 || i2 == 4) ? 4 : 1;
        }
        return 5;
    }

    public static int q(int i2, int i3, int i4) {
        if (i3 == 1) {
            return (i4 + i2) % 360;
        }
        return ((i4 - i2) + (s(i2) ? 180 : 0)) % 360;
    }

    public static WritableMap r(k4 k4Var) {
        WritableMap createMap = Arguments.createMap();
        String[][] strArr = a;
        for (String[] strArr2 : strArr) {
            String str = strArr2[1];
            if (k4Var.i(str) != null) {
                String str2 = strArr2[0];
                char c2 = 65535;
                int hashCode = str2.hashCode();
                if (hashCode != -1325958191) {
                    if (hashCode != -891985903) {
                        if (hashCode == 104431 && str2.equals(C0201.m82(32003))) {
                            c2 = 1;
                        }
                    } else if (str2.equals(C0201.m82(32004))) {
                        c2 = 0;
                    }
                } else if (str2.equals(C0201.m82(32005))) {
                    c2 = 2;
                }
                if (c2 == 0) {
                    createMap.putString(str, k4Var.i(str));
                } else if (c2 == 1) {
                    createMap.putInt(str, k4Var.k(str, 0));
                } else if (c2 == 2) {
                    createMap.putDouble(str, k4Var.j(str, 0.0d));
                }
            }
        }
        double[] o = k4Var.o();
        if (o != null) {
            createMap.putDouble(C0201.m82(32006), o[0]);
            createMap.putDouble(C0201.m82(32007), o[1]);
            createMap.putDouble(C0201.m82(32008), k4Var.h(0.0d));
        }
        return createMap;
    }

    private static boolean s(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public static void t(k4 k4Var, ReadableMap readableMap) {
        String[][] strArr = a;
        for (String[] strArr2 : strArr) {
            String str = strArr2[1];
            if (readableMap.hasKey(str)) {
                String str2 = strArr2[0];
                char c2 = 65535;
                int hashCode = str2.hashCode();
                if (hashCode != -1325958191) {
                    if (hashCode != -891985903) {
                        if (hashCode == 104431 && str2.equals(C0201.m82(32009))) {
                            c2 = 1;
                        }
                    } else if (str2.equals(C0201.m82(32010))) {
                        c2 = 0;
                    }
                } else if (str2.equals(C0201.m82(32011))) {
                    c2 = 2;
                }
                if (c2 == 0) {
                    k4Var.T(str, readableMap.getString(str));
                } else if (c2 == 1) {
                    k4Var.T(str, Integer.toString(readableMap.getInt(str)));
                    readableMap.getInt(str);
                } else if (c2 == 2) {
                    k4Var.T(str, Double.toString(readableMap.getDouble(str)));
                    readableMap.getDouble(str);
                }
            }
        }
        String r0 = C0201.m82(32012);
        if (readableMap.hasKey(r0)) {
            String r1 = C0201.m82(32013);
            if (readableMap.hasKey(r1)) {
                k4Var.U(readableMap.getDouble(r0), readableMap.getDouble(r1));
            }
        }
        String r02 = C0201.m82(32014);
        if (readableMap.hasKey(r02)) {
            k4Var.S(readableMap.getDouble(r02));
        }
    }
}
