package cl.json;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

public class RNShareModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final int SHARE_REQUEST_CODE = 0;
    private final ReactApplicationContext reactContext;

    /* access modifiers changed from: package-private */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|(3:27|28|30)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|30) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            iArr[b.generic.ordinal()] = 1;
            a[b.facebook.ordinal()] = 2;
            a[b.pagesmanager.ordinal()] = 3;
            a[b.twitter.ordinal()] = 4;
            a[b.whatsapp.ordinal()] = 5;
            a[b.instagram.ordinal()] = 6;
            a[b.instagramstories.ordinal()] = 7;
            a[b.googleplus.ordinal()] = 8;
            a[b.email.ordinal()] = 9;
            a[b.pinterest.ordinal()] = 10;
            a[b.sms.ordinal()] = 11;
            a[b.snapchat.ordinal()] = 12;
            a[b.messenger.ordinal()] = 13;
            try {
                a[b.linkedin.ordinal()] = 14;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private enum b {
        facebook,
        generic,
        pagesmanager,
        twitter,
        whatsapp,
        instagram,
        instagramstories,
        googleplus,
        email,
        pinterest,
        messenger,
        snapchat,
        sms,
        linkedin;

        public static k8 b(String str, ReactApplicationContext reactApplicationContext) {
            switch (a.a[valueOf(str).ordinal()]) {
                case 1:
                    return new c8(reactApplicationContext);
                case 2:
                    return new b8(reactApplicationContext);
                case 3:
                    return new a8(reactApplicationContext);
                case 4:
                    return new o8(reactApplicationContext);
                case 5:
                    return new p8(reactApplicationContext);
                case 6:
                    return new e8(reactApplicationContext);
                case 7:
                    return new f8(reactApplicationContext);
                case 8:
                    return new d8(reactApplicationContext);
                case 9:
                    return new z7(reactApplicationContext);
                case 10:
                    return new i8(reactApplicationContext);
                case 11:
                    return new j8(reactApplicationContext);
                case 12:
                    return new m8(reactApplicationContext);
                case 13:
                    return new h8(reactApplicationContext);
                case 14:
                    return new g8(reactApplicationContext);
                default:
                    return null;
            }
        }
    }

    static {
        C0201.m83(RNShareModule.class, 555);
    }

    public RNShareModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        b[] values = b.values();
        for (b bVar : values) {
            hashMap.put(bVar.toString().toUpperCase(), bVar.toString());
        }
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(32957);
    }

    @ReactMethod
    public void isBase64File(String str, Callback callback, Callback callback2) {
        try {
            String scheme = Uri.parse(str).getScheme();
            if (scheme == null || !scheme.equals(C0201.m82(32958))) {
                callback2.invoke(Boolean.FALSE);
                return;
            }
            callback2.invoke(Boolean.TRUE);
        } catch (Exception e) {
            PrintStream printStream = System.out;
            printStream.println(C0201.m82(32959) + e.getMessage());
            e.printStackTrace(System.out);
            callback.invoke(e.getMessage());
        }
    }

    @ReactMethod
    public void isPackageInstalled(String str, Callback callback, Callback callback2) {
        try {
            callback2.invoke(Boolean.valueOf(k8.l(str, this.reactContext)));
        } catch (Exception e) {
            PrintStream printStream = System.out;
            printStream.println(C0201.m82(32960) + e.getMessage());
            callback.invoke(e.getMessage());
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 16845 && i2 == 0) {
            n8.d(true, Boolean.FALSE, C0201.m82(32961));
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Callback callback, Callback callback2) {
        String r0 = C0201.m82(32962);
        n8.c(callback2, callback);
        try {
            new c8(this.reactContext).m(readableMap);
        } catch (ActivityNotFoundException e) {
            PrintStream printStream = System.out;
            printStream.println(r0 + e.getMessage());
            e.printStackTrace(System.out);
            n8.d(false, C0201.m82(32963));
        } catch (Exception e2) {
            PrintStream printStream2 = System.out;
            printStream2.println(r0 + e2.getMessage());
            e2.printStackTrace(System.out);
            n8.d(false, e2.getMessage());
        }
    }

    @ReactMethod
    public void shareSingle(ReadableMap readableMap, Callback callback, Callback callback2) {
        String r0 = C0201.m82(32964);
        System.out.println(C0201.m82(32965));
        n8.c(callback2, callback);
        String r6 = C0201.m82(32966);
        if (k8.k(r6, readableMap)) {
            try {
                k8 b2 = b.b(readableMap.getString(r6), this.reactContext);
                if (b2 == null || !(b2 instanceof k8)) {
                    throw new ActivityNotFoundException(C0201.m82(32967));
                }
                b2.m(readableMap);
            } catch (ActivityNotFoundException e) {
                PrintStream printStream = System.out;
                printStream.println(r0 + e.getMessage());
                e.printStackTrace(System.out);
                n8.d(false, e.getMessage());
            } catch (Exception e2) {
                PrintStream printStream2 = System.out;
                printStream2.println(r0 + e2.getMessage());
                e2.printStackTrace(System.out);
                n8.d(false, e2.getMessage());
            }
        } else {
            n8.d(false, C0201.m82(32968));
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        onActivityResult(i, i2, intent);
    }
}
