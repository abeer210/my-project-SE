package defpackage;

import android.util.Log;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.rnhms.location.RNHMSLocation;
import com.rnhms.utils.RNHMSBase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vigqyno.C0201;

/* renamed from: pp2  reason: default package */
/* compiled from: RNHMSPackage */
public class pp2 implements wi0 {
    @Override // defpackage.wi0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNHMSBase(reactApplicationContext));
        arrayList.add(new RNHMSLocation(reactApplicationContext));
        Log.i(C0201.m82(7412), C0201.m82(7413));
        return arrayList;
    }

    @Override // defpackage.wi0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
