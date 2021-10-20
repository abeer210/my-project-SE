package com.facebook.react.devsupport;

import android.view.View;
import com.facebook.fbreact.specs.NativeJSDevSupportSpec;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

@pj0(name = "JSDevSupport")
public class JSDevSupport extends NativeJSDevSupportSpec {
    public static final int ERROR_CODE_EXCEPTION = 0;
    public static final int ERROR_CODE_VIEW_NOT_FOUND = 0;
    public static final String MODULE_NAME = null;
    private volatile a mCurrentCallback = null;

    public interface JSDevSupportModule extends JavaScriptModule {
        void getJSHierarchy(int i);
    }

    public interface a {
        void a(String str);

        void b(int i, Exception exc);
    }

    static {
        C0201.m83(JSDevSupport.class, 326);
    }

    public JSDevSupport(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public synchronized void computeDeepestJSHierarchy(View view, a aVar) {
        getJSHierarchy(Integer.valueOf(((View) g.a(view).first).getId()).intValue(), aVar);
    }

    public synchronized void getJSHierarchy(int i, a aVar) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        JSDevSupportModule jSDevSupportModule = null;
        if (reactApplicationContextIfActiveOrWarn != null) {
            jSDevSupportModule = (JSDevSupportModule) reactApplicationContextIfActiveOrWarn.getJSModule(JSDevSupportModule.class);
        }
        if (jSDevSupportModule == null) {
            aVar.b(0, new JSCHeapCapture.b(C0201.m82(1981)));
            return;
        }
        this.mCurrentCallback = aVar;
        jSDevSupportModule.getJSHierarchy(i);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(1982);
    }

    @Override // com.facebook.fbreact.specs.NativeJSDevSupportSpec
    public Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(C0201.m82(1983), 0);
        hashMap.put(C0201.m82(1984), 1);
        return hashMap;
    }

    @Override // com.facebook.fbreact.specs.NativeJSDevSupportSpec
    public synchronized void onFailure(double d, String str) {
        int i = (int) d;
        if (this.mCurrentCallback != null) {
            this.mCurrentCallback.b(i, new RuntimeException(str));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeJSDevSupportSpec
    public synchronized void onSuccess(String str) {
        if (this.mCurrentCallback != null) {
            this.mCurrentCallback.a(str);
        }
    }
}
