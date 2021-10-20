package com.samsung.android.sdk.pass;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.fingerprint.FingerprintIdentifyDialog;
import com.samsung.android.fingerprint.FingerprintManager;
import com.samsung.android.fingerprint.IFingerprintClient;
import com.samsung.android.sdk.pass.support.IFingerprintManagerProxy;
import com.samsung.android.sdk.pass.support.v1.FingerprintManagerProxyFactory;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import vigqyno.C0201;

public class SpassFingerprint {
    public static final String ACTION_FINGERPRINT_ADDED = null;
    public static final String ACTION_FINGERPRINT_REMOVED = null;
    public static final String ACTION_FINGERPRINT_RESET = null;
    public static final int STATUS_AUTHENTIFICATION_FAILED = 0;
    public static final int STATUS_AUTHENTIFICATION_PASSWORD_SUCCESS = 0;
    public static final int STATUS_AUTHENTIFICATION_SUCCESS = 0;
    public static final int STATUS_BUTTON_PRESSED = 0;
    public static final int STATUS_OPERATION_DENIED = 0;
    public static final int STATUS_QUALITY_FAILED = 0;
    public static final int STATUS_SENSOR_FAILED = 0;
    public static final int STATUS_TIMEOUT_FAILED = 0;
    public static final int STATUS_USER_CANCELLED = 0;
    public static final int STATUS_USER_CANCELLED_BY_TOUCH_OUTSIDE = 0;
    public static final String TAG = null;
    private static int n;
    private static boolean o;
    private static boolean p;
    private static boolean q;
    private static boolean r;
    private IFingerprintManagerProxy a;
    private Context b;
    private int c = -1;
    private String d = null;
    private ArrayList e = null;
    private String f = null;
    private int g = -1;
    private String h = null;
    private int i = -1;
    private boolean j = false;
    private String k = null;
    private String l = null;
    private boolean m = false;
    private Dialog s = null;
    private b t = null;
    private b u = null;
    private IBinder v = null;
    private Handler w;

    public interface IdentifyListener {
        void onCompleted();

        void onFinished(int i);

        void onReady();

        void onStarted();
    }

    public interface RegisterListener {
        void onFinished();
    }

    private static class a {
        private Bundle a;

        public a() {
            Bundle bundle = new Bundle();
            this.a = bundle;
            bundle.putString(C0201.m82(9952), C0201.m82(9953));
        }

        public final Bundle a() {
            return this.a;
        }

        public final a a(int[] iArr) {
            if (iArr.length > 0) {
                this.a.putIntArray(C0201.m82(9954), iArr);
            }
            return this;
        }
    }

    /* access modifiers changed from: private */
    public class b extends IFingerprintClient.Stub {
        private IdentifyListener a;
        private final int b;

        private b(IdentifyListener identifyListener) {
            this.b = SpassFingerprint.o ? 16 : 13;
            this.a = identifyListener;
        }

        public /* synthetic */ b(SpassFingerprint spassFingerprint, IdentifyListener identifyListener, byte b2) {
            this(identifyListener);
        }

        public final IdentifyListener a() {
            return this.a;
        }

        public final void a(IdentifyListener identifyListener) {
            this.a = identifyListener;
        }

        public final void onFingerprintEvent(FingerprintEvent fingerprintEvent) throws RemoteException {
            String str;
            String r0 = C0201.m82(9842);
            String r1 = C0201.m82(9843);
            if (fingerprintEvent == null) {
                str = C0201.m82(9844);
            } else {
                try {
                    Log.d(r1, C0201.m82(9845) + fingerprintEvent.eventId + r0 + fingerprintEvent.eventResult + r0 + fingerprintEvent.eventStatus);
                    IdentifyListener identifyListener = this.a;
                    if (fingerprintEvent.eventId == this.b) {
                        Log.d(r1, C0201.m82(9846) + this.b);
                        SpassFingerprint.this.t = null;
                        SpassFingerprint.this.f();
                    }
                    if (identifyListener == null) {
                        return;
                    }
                    if (SpassFingerprint.this.w != null) {
                        SpassFingerprint.this.w.post(new e(this, fingerprintEvent, identifyListener));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    str = C0201.m82(9847) + e;
                }
            }
            Log.w(r1, str);
        }
    }

    /* access modifiers changed from: private */
    public class c implements FingerprintIdentifyDialog.FingerprintListener {
        private IdentifyListener a;
        private FingerprintEvent b;

        private c(IdentifyListener identifyListener) {
            this.a = identifyListener;
        }

        public /* synthetic */ c(SpassFingerprint spassFingerprint, IdentifyListener identifyListener, byte b2) {
            this(identifyListener);
        }

        public final void a() {
            FingerprintEvent fingerprintEvent = this.b;
            IdentifyListener identifyListener = this.a;
            if (fingerprintEvent != null && identifyListener != null && SpassFingerprint.this.w != null) {
                SpassFingerprint.this.w.post(new g(this, fingerprintEvent, identifyListener));
                this.a = null;
                this.b = null;
            }
        }

        public final void onEvent(FingerprintEvent fingerprintEvent) {
            try {
                if (fingerprintEvent.eventId == 13 || SpassFingerprint.this.w == null) {
                    this.b = fingerprintEvent;
                } else {
                    SpassFingerprint.this.w.post(new f(this, fingerprintEvent));
                }
            } catch (Exception e) {
                Log.w(C0201.m82(9895), C0201.m82(9894) + e);
            }
        }
    }

    static {
        C0201.m83(SpassFingerprint.class, 139);
    }

    public SpassFingerprint(Context context) {
        if (context != null) {
            this.b = context;
            if (!p) {
                q = context.getPackageManager().hasSystemFeature(C0201.m82(14266));
                r = g();
                p = true;
            }
            boolean z = q;
            String r3 = C0201.m82(14267);
            if (z) {
                this.a = FingerprintManagerProxyFactory.create(this.b);
                this.w = new Handler(context.getMainLooper());
                if (this.a != null) {
                    try {
                        if (this.a.getSensorType() == FingerprintManager.class.getField(C0201.m82(14268)).getInt(null)) {
                            o = true;
                        }
                    } catch (Exception e2) {
                        Log.i(r3, C0201.m82(14269) + e2.toString());
                    }
                    n = this.a.getVersion();
                }
            }
            Log.i(r3, C0201.m82(14270) + n + C0201.m82(14271) + o);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(14272));
    }

    public static void a(Context context, String str) {
        if (g()) {
            int checkCallingOrSelfPermission = context.checkCallingOrSelfPermission(C0201.m82(14273));
            String r1 = C0201.m82(14274);
            if (checkCallingOrSelfPermission != 0) {
                Log.d(r1, C0201.m82(14275));
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(C0201.m82(14276), SpassFingerprint.class.getPackage().getName());
            contentValues.put(C0201.m82(14278), String.valueOf(context.getPackageName()) + C0201.m82(14277));
            if (str != null) {
                contentValues.put(C0201.m82(14279), str);
            }
            Intent intent = new Intent();
            intent.setAction(C0201.m82(14280));
            intent.putExtra(C0201.m82(14281), contentValues);
            intent.setPackage(C0201.m82(14282));
            context.sendBroadcast(intent);
            Log.i(r1, C0201.m82(14283) + contentValues.toString());
        }
    }

    public static /* synthetic */ void a(SpassFingerprint spassFingerprint, IdentifyListener identifyListener, FingerprintEvent fingerprintEvent, int i2) {
        spassFingerprint.d = C0201.m82(14284);
        if (fingerprintEvent == null) {
            spassFingerprint.c = 0;
        } else {
            spassFingerprint.c = fingerprintEvent.getFingerIndex();
            if (fingerprintEvent.eventStatus == 12 || fingerprintEvent.eventStatus == 11) {
                spassFingerprint.d = fingerprintEvent.getImageQualityFeedback();
            }
            int i3 = fingerprintEvent.eventStatus;
            i2 = 9;
            if (i3 == 0) {
                i2 = 0;
            } else if (i3 == 4) {
                i2 = 4;
            } else if (i3 == 51) {
                i2 = 51;
            } else if (i3 != 100) {
                if (i3 != 7) {
                    if (i3 != 8) {
                        if (i3 != 9) {
                            switch (i3) {
                                case 11:
                                    i2 = 16;
                                    break;
                                case 12:
                                    i2 = 12;
                                    break;
                                case 13:
                                    i2 = 13;
                                    break;
                            }
                        }
                    } else {
                        i2 = 8;
                    }
                }
                i2 = 7;
            } else {
                i2 = 100;
            }
        }
        identifyListener.onFinished(i2);
        spassFingerprint.c = -1;
        spassFingerprint.d = null;
        if (!spassFingerprint.m) {
            spassFingerprint.m = true;
            a(spassFingerprint.b, C0201.m82(14285));
        }
    }

    public static boolean a() {
        return n >= 16843008;
    }

    private boolean a(String str) {
        String packageName = this.b.getPackageName();
        try {
            Resources resourcesForApplication = this.b.getPackageManager().getResourcesForApplication(packageName);
            if (resourcesForApplication == null) {
                return false;
            }
            try {
                int identifier = resourcesForApplication.getIdentifier(str, C0201.m82(14286), packageName);
                if (identifier != 0) {
                    if (identifier != -1) {
                        return BitmapFactory.decodeResource(resourcesForApplication, identifier) != null;
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            return false;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private synchronized void e() throws UnsupportedOperationException {
        if (!q) {
            throw new UnsupportedOperationException(C0201.m82(14290));
        } else if (this.a == null) {
            Log.i(C0201.m82(14287), C0201.m82(14288));
            IFingerprintManagerProxy create = FingerprintManagerProxyFactory.create(this.b);
            this.a = create;
            if (create == null) {
                throw new UnsupportedOperationException(C0201.m82(14289));
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void f() {
        this.a.unregisterClient(this.v);
        this.v = null;
        b bVar = this.u;
        if (bVar != null) {
            bVar.a((IdentifyListener) null);
        }
    }

    private static boolean g() {
        String r0 = C0201.m82(14291);
        String r2 = C0201.m82(14292);
        String r3 = C0201.m82(14293);
        String r4 = C0201.m82(14294);
        if (p) {
            return r;
        }
        boolean z = false;
        try {
            Class<?> cls = Class.forName(C0201.m82(14295));
            Object invoke = cls.getMethod(r2, new Class[0]).invoke(null, new Object[0]);
            z = ((Boolean) cls.getMethod(C0201.m82(14296), String.class).invoke(invoke, r0)).booleanValue();
        } catch (Exception e2) {
            Log.d(r4, r3 + e2.toString());
            try {
                Class<?> cls2 = Class.forName(C0201.m82(14297));
                Object invoke2 = cls2.getMethod(r2, new Class[0]).invoke(null, new Object[0]);
                z = ((Boolean) cls2.getMethod(C0201.m82(14298), String.class).invoke(invoke2, r0)).booleanValue();
            } catch (Exception e3) {
                Log.d(r4, r3 + e3.toString());
            }
        }
        Log.i(r4, r3 + z);
        return z;
    }

    public final boolean b() {
        e();
        try {
            Class.forName(C0201.m82(14299)).getMethod(C0201.m82(14300), new Class[0]);
            return this.a.isSupportFingerprintIds();
        } catch (Exception e2) {
            Log.w(C0201.m82(14301), e2);
            return a();
        }
    }

    public final boolean c() {
        e();
        try {
            Class.forName(C0201.m82(14302)).getMethod(C0201.m82(14303), new Class[0]);
            return this.a.isSupportBackupPassword();
        } catch (Exception e2) {
            Log.w(C0201.m82(14304), e2);
            return true;
        }
    }

    public void cancelIdentify() {
        Handler handler;
        e();
        if (this.v == null && this.t == null && this.s == null) {
            throw new IllegalStateException(C0201.m82(14305));
        }
        IdentifyListener identifyListener = null;
        if (this.v != null) {
            b bVar = this.u;
            if (bVar != null) {
                identifyListener = bVar.a();
            }
            f();
            if (identifyListener != null && (handler = this.w) != null) {
                handler.postDelayed(new a(this, identifyListener), 100);
            }
        } else if (this.t != null || this.s != null) {
            this.a.notifyAppActivityState(4, null);
            this.t = null;
            this.s = null;
        }
    }

    public void changeStandbyString(String str) {
        e();
        if (c()) {
            throw new IllegalStateException(C0201.m82(14308));
        } else if (str == null) {
            throw new IllegalArgumentException(C0201.m82(14307));
        } else if (str.length() <= 100) {
            this.l = str;
        } else {
            throw new IllegalArgumentException(C0201.m82(14306));
        }
    }

    public String getGuideForPoorQuality() {
        e();
        String str = this.d;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException(C0201.m82(14309));
    }

    public int getIdentifiedFingerprintIndex() {
        e();
        int i2 = this.c;
        if (i2 != -1) {
            return i2;
        }
        throw new IllegalStateException(C0201.m82(14310));
    }

    public SparseArray getRegisteredFingerprintName() {
        e();
        SparseArray sparseArray = new SparseArray();
        int enrolledFingers = this.a.getEnrolledFingers();
        if (enrolledFingers <= 0) {
            return null;
        }
        for (int i2 = 1; i2 <= 10; i2++) {
            if (((1 << i2) & enrolledFingers) != 0) {
                sparseArray.put(i2, this.a.getIndexName(i2));
            }
        }
        return sparseArray;
    }

    public SparseArray getRegisteredFingerprintUniqueID() {
        e();
        if (b()) {
            SparseArray sparseArray = new SparseArray();
            int enrolledFingers = this.a.getEnrolledFingers();
            if (enrolledFingers <= 0) {
                return null;
            }
            for (int i2 = 1; i2 <= 10; i2++) {
                if (((1 << i2) & enrolledFingers) != 0) {
                    sparseArray.put(i2, this.a.getFingerprintId(i2));
                }
            }
            return sparseArray;
        }
        throw new IllegalStateException(C0201.m82(14311));
    }

    public boolean hasRegisteredFinger() {
        e();
        return this.a.getEnrolledFingers() != 0;
    }

    public void registerFinger(Context context, RegisterListener registerListener) {
        String r0 = C0201.m82(14312);
        e();
        if (context == null) {
            throw new IllegalArgumentException(C0201.m82(14314));
        } else if (registerListener != null) {
            if (this.a.isEnrolling()) {
                this.a.notifyEnrollEnd();
            }
            try {
                context.getPackageManager();
                try {
                    this.a.startEnrollActivity(context, new d(registerListener), toString());
                } catch (UndeclaredThrowableException unused) {
                    throw new IllegalArgumentException(r0);
                }
            } catch (NullPointerException unused2) {
                throw new IllegalArgumentException(r0);
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(14313));
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        e();
        if (a()) {
            this.j = z;
            return;
        }
        throw new IllegalStateException(C0201.m82(14315));
    }

    public void setDialogBgTransparency(int i2) {
        e();
        if (!a()) {
            throw new IllegalStateException(C0201.m82(14317));
        } else if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException(C0201.m82(14316));
        } else {
            this.i = i2;
        }
    }

    public void setDialogButton(String str) {
        e();
        if (c()) {
            throw new IllegalStateException(C0201.m82(14320));
        } else if (str == null) {
            throw new IllegalArgumentException(C0201.m82(14319));
        } else if (str.length() <= 32) {
            this.k = str;
        } else {
            throw new IllegalArgumentException(C0201.m82(14318));
        }
    }

    public void setDialogIcon(String str) {
        e();
        if (!a()) {
            throw new IllegalStateException(C0201.m82(14323));
        } else if (str == null) {
            throw new IllegalArgumentException(C0201.m82(14322));
        } else if (a(str)) {
            this.h = str;
        } else {
            throw new IllegalArgumentException(C0201.m82(14321));
        }
    }

    public void setDialogTitle(String str, int i2) {
        e();
        if (!a()) {
            throw new IllegalStateException(C0201.m82(14327));
        } else if (str == null) {
            throw new IllegalArgumentException(C0201.m82(14326));
        } else if (str.length() > 256) {
            throw new IllegalArgumentException(C0201.m82(14325));
        } else if ((i2 >>> 24) == 0) {
            this.f = str;
            this.g = i2 - 16777216;
        } else {
            throw new IllegalArgumentException(C0201.m82(14324));
        }
    }

    public void setIntendedFingerprintIndex(ArrayList arrayList) {
        e();
        if (arrayList == null) {
            Log.w(C0201.m82(14328), C0201.m82(14329));
        } else if (a()) {
            this.e = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                this.e.add((Integer) arrayList.get(i2));
            }
        } else {
            throw new IllegalStateException(C0201.m82(14330));
        }
    }

    public void startIdentify(IdentifyListener identifyListener) {
        a aVar = new a();
        ArrayList arrayList = this.e;
        if (arrayList != null && arrayList.size() > 0) {
            int[] iArr = new int[this.e.size()];
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                iArr[i2] = ((Integer) this.e.get(i2)).intValue();
            }
            this.e = null;
            aVar.a(iArr);
        }
        e();
        int enrolledFingers = this.a.getEnrolledFingers();
        String r4 = C0201.m82(14331);
        if (enrolledFingers != 0) {
            IBinder iBinder = this.v;
            String r5 = C0201.m82(14332);
            if (iBinder != null) {
                throw new IllegalStateException(r5);
            } else if (identifyListener != null) {
                if (this.u == null) {
                    this.u = new b(this, identifyListener, (byte) 0);
                }
                Bundle a2 = aVar.a();
                a2.putString(C0201.m82(14333), this.b.getPackageName());
                IBinder registerClient = this.a.registerClient(this.u, a2);
                this.v = registerClient;
                if (registerClient == null) {
                    IBinder registerClient2 = this.a.registerClient(this.u, a2);
                    this.v = registerClient2;
                    if (registerClient2 == null) {
                        Handler handler = this.w;
                        if (handler != null) {
                            handler.post(new b(this, identifyListener));
                            return;
                        }
                        throw new IllegalStateException(C0201.m82(14334));
                    }
                }
                int identify = this.a.identify(this.v, null);
                if (identify != 0) {
                    f();
                    Log.i(C0201.m82(14336), C0201.m82(14335) + identify);
                    if (identify == -2) {
                        throw new IllegalStateException(r5);
                    } else if (identify == 51) {
                        throw new SpassInvalidStateException(C0201.m82(14337), 1);
                    } else {
                        throw new IllegalStateException(r4);
                    }
                } else {
                    this.u.a(identifyListener);
                }
            } else {
                throw new IllegalArgumentException(C0201.m82(14338));
            }
        } else {
            throw new IllegalStateException(r4);
        }
    }

    public void startIdentifyWithDialog(Context context, IdentifyListener identifyListener, boolean z) {
        int[] iArr;
        e();
        if (context == null) {
            throw new IllegalArgumentException(C0201.m82(14357));
        } else if (identifyListener != null) {
            try {
                context.getPackageManager();
                if (!(context instanceof Activity)) {
                    Log.w(C0201.m82(14339), C0201.m82(14340));
                }
                boolean a2 = a();
                String r1 = C0201.m82(14341);
                if (a2) {
                    ArrayList arrayList = this.e;
                    if (arrayList == null || arrayList.size() <= 0) {
                        iArr = null;
                    } else {
                        iArr = new int[this.e.size()];
                        for (int i2 = 0; i2 < this.e.size(); i2++) {
                            iArr[i2] = ((Integer) this.e.get(i2)).intValue();
                        }
                    }
                    this.t = new b(this, identifyListener, (byte) 0);
                    try {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean(C0201.m82(14342), z);
                        bundle.putString(C0201.m82(14343), context.getPackageName());
                        bundle.putString(C0201.m82(14344), C0201.m82(14345));
                        bundle.putBoolean(C0201.m82(14346), true);
                        if (iArr != null) {
                            bundle.putIntArray(C0201.m82(14347), iArr);
                        }
                        if (this.f != null) {
                            bundle.putString(C0201.m82(14348), this.f);
                        }
                        if (this.g != -1) {
                            bundle.putInt(C0201.m82(14349), this.g);
                        }
                        if (this.h != null) {
                            bundle.putString(C0201.m82(14350), this.h);
                        }
                        if (this.i != -1) {
                            bundle.putInt(C0201.m82(14351), this.i);
                        }
                        if (this.j) {
                            bundle.putBoolean(C0201.m82(14352), this.j);
                        }
                        if (this.k != null) {
                            bundle.putString(C0201.m82(14353), this.k);
                        }
                        if (this.l != null) {
                            bundle.putString(C0201.m82(14354), this.l);
                        }
                        if (this.a.identifyWithDialog(context, this.t, bundle) != 0) {
                            throw new IllegalStateException(r1);
                        }
                    } finally {
                        this.e = null;
                        this.f = null;
                        this.g = -1;
                        this.i = -1;
                        this.h = null;
                        this.j = false;
                        this.l = null;
                        this.k = null;
                    }
                } else {
                    FingerprintIdentifyDialog.FingerprintListener cVar = new c(this, identifyListener, (byte) 0);
                    Dialog showIdentifyDialog = this.a.showIdentifyDialog(context, cVar, null, z);
                    this.s = showIdentifyDialog;
                    if (showIdentifyDialog != null) {
                        showIdentifyDialog.setOnDismissListener(new c(cVar));
                        this.s.show();
                        return;
                    }
                    throw new IllegalStateException(r1);
                }
            } catch (NullPointerException unused) {
                throw new IllegalArgumentException(C0201.m82(14355));
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(14356));
        }
    }
}
