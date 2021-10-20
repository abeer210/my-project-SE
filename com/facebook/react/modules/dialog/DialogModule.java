package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.d;
import androidx.fragment.app.i;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.e;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "DialogManagerAndroid")
public class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {
    public static final String ACTION_BUTTON_CLICKED = null;
    public static final String ACTION_DISMISSED = null;
    public static final Map<String, Object> CONSTANTS = e.h(C0201.m82(36971), C0201.m82(36972), C0201.m82(36973), C0201.m82(36974), C0201.m82(36975), -1, C0201.m82(36976), -2, C0201.m82(36977), -3);
    public static final String FRAGMENT_TAG = null;
    public static final String KEY_BUTTON_NEGATIVE = null;
    public static final String KEY_BUTTON_NEUTRAL = null;
    public static final String KEY_BUTTON_POSITIVE = null;
    public static final String KEY_CANCELABLE = null;
    public static final String KEY_ITEMS = null;
    public static final String KEY_MESSAGE = null;
    public static final String KEY_TITLE = null;
    public static final String NAME = null;
    private boolean mIsInForeground;

    class a implements Runnable {
        public final /* synthetic */ c a;
        public final /* synthetic */ Bundle b;
        public final /* synthetic */ Callback c;

        public a(DialogModule dialogModule, c cVar, Bundle bundle, Callback callback) {
            this.a = cVar;
            this.b = bundle;
            this.c = callback;
        }

        public void run() {
            this.a.b(this.b, this.c);
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {
        private final Callback a;
        private boolean b = false;

        public b(Callback callback) {
            this.a = callback;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!this.b && DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.a.invoke(C0201.m82(34957), Integer.valueOf(i));
                this.b = true;
            }
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (!this.b && DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                this.a.invoke(C0201.m82(34958));
                this.b = true;
            }
        }
    }

    /* access modifiers changed from: private */
    public class c {
        private final i a;
        private Object b;

        public c(i iVar) {
            this.a = iVar;
        }

        private void a() {
            a aVar;
            if (DialogModule.this.mIsInForeground && (aVar = (a) this.a.c(C0201.m82(35281))) != null && aVar.isResumed()) {
                aVar.t();
            }
        }

        public void b(Bundle bundle, Callback callback) {
            UiThreadUtil.assertOnUiThread();
            a();
            a aVar = new a(callback != null ? new b(callback) : null, bundle);
            if (!DialogModule.this.mIsInForeground || this.a.f()) {
                this.b = aVar;
                return;
            }
            String r0 = C0201.m82(35282);
            if (bundle.containsKey(r0)) {
                aVar.z(bundle.getBoolean(r0));
            }
            aVar.C(this.a, C0201.m82(35283));
        }

        public void c() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(DialogModule.this.mIsInForeground, C0201.m82(35284));
            if (this.b != null) {
                a();
                ((a) this.b).C(this.a, C0201.m82(35285));
                this.b = null;
            }
        }
    }

    static {
        C0201.m83(DialogModule.class, 319);
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private c getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof d)) {
            return null;
        }
        return new c(((d) currentActivity).p());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(36978);
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mIsInForeground = true;
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.c();
        } else {
            f60.w(DialogModule.class, C0201.m82(36979));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke(C0201.m82(36980));
            return;
        }
        Bundle bundle = new Bundle();
        String r2 = C0201.m82(36981);
        if (readableMap.hasKey(r2)) {
            bundle.putString(r2, readableMap.getString(r2));
        }
        String r22 = C0201.m82(36982);
        if (readableMap.hasKey(r22)) {
            bundle.putString(r22, readableMap.getString(r22));
        }
        String r23 = C0201.m82(36983);
        if (readableMap.hasKey(r23)) {
            bundle.putString(C0201.m82(36984), readableMap.getString(r23));
        }
        String r24 = C0201.m82(36985);
        if (readableMap.hasKey(r24)) {
            bundle.putString(C0201.m82(36986), readableMap.getString(r24));
        }
        String r25 = C0201.m82(36987);
        if (readableMap.hasKey(r25)) {
            bundle.putString(C0201.m82(36988), readableMap.getString(r25));
        }
        String r26 = C0201.m82(36989);
        if (readableMap.hasKey(r26)) {
            ReadableArray array = readableMap.getArray(r26);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray(r26, charSequenceArr);
        }
        String r1 = C0201.m82(36990);
        if (readableMap.hasKey(r1)) {
            bundle.putBoolean(r1, readableMap.getBoolean(r1));
        }
        UiThreadUtil.runOnUiThread(new a(this, fragmentManagerHelper, bundle, callback2));
    }
}
