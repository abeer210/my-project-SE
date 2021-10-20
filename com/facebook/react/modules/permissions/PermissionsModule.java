package com.facebook.react.modules.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import java.util.ArrayList;
import vigqyno.C0201;

@pj0(name = "PermissionsAndroid")
public class PermissionsModule extends NativePermissionsAndroidSpec implements f {
    private static final String ERROR_INVALID_ACTIVITY = null;
    public static final String NAME = null;
    private final String DENIED = C0201.m82(29565);
    private final String GRANTED = C0201.m82(29564);
    private final String NEVER_ASK_AGAIN = C0201.m82(29566);
    private final SparseArray<Callback> mCallbacks = new SparseArray<>();
    private int mRequestCode = 0;

    class a implements Callback {
        public final /* synthetic */ Promise a;
        public final /* synthetic */ String b;

        public a(PermissionsModule permissionsModule, Promise promise, String str) {
            this.a = promise;
            this.b = str;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            int[] iArr = (int[]) objArr[0];
            if (iArr.length > 0 && iArr[0] == 0) {
                this.a.resolve(C0201.m82(29489));
            } else if (((e) objArr[1]).shouldShowRequestPermissionRationale(this.b)) {
                this.a.resolve(C0201.m82(29490));
            } else {
                this.a.resolve(C0201.m82(29491));
            }
        }
    }

    class b implements Callback {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ WritableMap b;
        public final /* synthetic */ Promise c;

        public b(PermissionsModule permissionsModule, ArrayList arrayList, WritableMap writableMap, Promise promise) {
            this.a = arrayList;
            this.b = writableMap;
            this.c = promise;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            int[] iArr = (int[]) objArr[0];
            e eVar = (e) objArr[1];
            for (int i = 0; i < this.a.size(); i++) {
                String str = (String) this.a.get(i);
                if (iArr.length > 0 && iArr[i] == 0) {
                    this.b.putString(str, C0201.m82(29501));
                } else if (eVar.shouldShowRequestPermissionRationale(str)) {
                    this.b.putString(str, C0201.m82(29502));
                } else {
                    this.b.putString(str, C0201.m82(29503));
                }
            }
            this.c.resolve(this.b);
        }
    }

    static {
        C0201.m83(PermissionsModule.class, 570);
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private e getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            throw new IllegalStateException(C0201.m82(29568));
        } else if (currentActivity instanceof e) {
            return (e) currentActivity;
        } else {
            throw new IllegalStateException(C0201.m82(29567));
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void checkPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        boolean z = true;
        if (Build.VERSION.SDK_INT < 23) {
            if (baseContext.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                z = false;
            }
            promise.resolve(Boolean.valueOf(z));
            return;
        }
        if (baseContext.checkSelfPermission(str) != 0) {
            z = false;
        }
        promise.resolve(Boolean.valueOf(z));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(29569);
    }

    @Override // com.facebook.react.modules.core.f
    public boolean onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mCallbacks.get(i).invoke(iArr, getPermissionAwareActivity());
        this.mCallbacks.remove(i);
        if (this.mCallbacks.size() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestMultiplePermissions(ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i = 0;
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            String string = readableArray.getString(i2);
            int i3 = Build.VERSION.SDK_INT;
            String r9 = C0201.m82(29570);
            if (i3 < 23) {
                if (baseContext.checkPermission(string, Process.myPid(), Process.myUid()) != 0) {
                    r9 = C0201.m82(29571);
                }
                writableNativeMap.putString(string, r9);
            } else if (baseContext.checkSelfPermission(string) == 0) {
                writableNativeMap.putString(string, r9);
            } else {
                arrayList.add(string);
            }
            i++;
        }
        if (readableArray.size() == i) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            e permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new b(this, arrayList, writableNativeMap, promise));
            permissionAwareActivity.i((String[]) arrayList.toArray(new String[0]), this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e) {
            promise.reject(C0201.m82(29572), e);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i = Build.VERSION.SDK_INT;
        String r2 = C0201.m82(29573);
        if (i < 23) {
            if (baseContext.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                r2 = C0201.m82(29574);
            }
            promise.resolve(r2);
        } else if (baseContext.checkSelfPermission(str) == 0) {
            promise.resolve(r2);
        } else {
            try {
                e permissionAwareActivity = getPermissionAwareActivity();
                this.mCallbacks.put(this.mRequestCode, new a(this, promise, str));
                permissionAwareActivity.i(new String[]{str}, this.mRequestCode, this);
                this.mRequestCode++;
            } catch (IllegalStateException e) {
                promise.reject(C0201.m82(29575), e);
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        if (Build.VERSION.SDK_INT < 23) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e) {
            promise.reject(C0201.m82(29576), e);
        }
    }
}
