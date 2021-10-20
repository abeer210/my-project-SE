package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.facebook.react.bridge.JSBundleLoader;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.devsupport.f;
import com.facebook.react.jscexecutor.a;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.p0;
import com.facebook.soloader.SoLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ti0  reason: default package */
/* compiled from: ReactInstanceManagerBuilder */
public class ti0 {
    private final List<wi0> a = new ArrayList();
    private String b;
    private JSBundleLoader c;
    private String d;
    private NotThreadSafeBridgeIdleDebugListener e;
    private Application f;
    private boolean g;
    private LifecycleState h;
    private p0 i;
    private NativeModuleCallExceptionHandler j;
    private Activity k;
    private b l;
    private f m;
    private boolean n;
    private ej0 o;
    private JavaScriptExecutorFactory p;
    private int q = 1;
    private int r = -1;
    private JSIModulePackage s;
    private Map<String, Object> t;

    private JavaScriptExecutorFactory c(String str, String str2, Context context) {
        try {
            si0.A(context);
            SoLoader.j(C0201.m82(1469));
            return new a(str, str2);
        } catch (UnsatisfiedLinkError e2) {
            if (!e2.getMessage().contains(C0201.m82(1470))) {
                try {
                    return new com.facebook.hermes.reactexecutor.a();
                } catch (UnsatisfiedLinkError e3) {
                    e3.printStackTrace();
                    throw e2;
                }
            } else {
                throw e2;
            }
        }
    }

    public ti0 a(wi0 wi0) {
        this.a.add(wi0);
        return this;
    }

    public si0 b() {
        String str;
        yh0.d(this.f, C0201.m82(1471));
        if (this.h == LifecycleState.RESUMED) {
            yh0.d(this.k, C0201.m82(1472));
        }
        boolean z = true;
        yh0.b((!this.g && this.b == null && this.c == null) ? false : true, C0201.m82(1473));
        if (this.d == null && this.b == null && this.c == null) {
            z = false;
        }
        yh0.b(z, C0201.m82(1474));
        if (this.i == null) {
            this.i = new p0();
        }
        String packageName = this.f.getPackageName();
        String a2 = com.facebook.react.modules.systeminfo.a.a();
        Application application = this.f;
        Activity activity = this.k;
        b bVar = this.l;
        JavaScriptExecutorFactory javaScriptExecutorFactory = this.p;
        JavaScriptExecutorFactory c2 = javaScriptExecutorFactory == null ? c(packageName, a2, application.getApplicationContext()) : javaScriptExecutorFactory;
        JSBundleLoader createAssetLoader = (this.c != null || (str = this.b) == null) ? this.c : JSBundleLoader.createAssetLoader(this.f, str, false);
        String str2 = this.d;
        List<wi0> list = this.a;
        boolean z2 = this.g;
        NotThreadSafeBridgeIdleDebugListener notThreadSafeBridgeIdleDebugListener = this.e;
        LifecycleState lifecycleState = this.h;
        yh0.d(lifecycleState, C0201.m82(1475));
        return new si0(application, activity, bVar, c2, createAssetLoader, str2, list, z2, notThreadSafeBridgeIdleDebugListener, lifecycleState, this.i, this.j, this.m, this.n, this.o, this.q, this.r, this.s, this.t);
    }

    public ti0 d(Application application) {
        this.f = application;
        return this;
    }

    public ti0 e(String str) {
        String str2;
        if (str == null) {
            str2 = null;
        } else {
            str2 = C0201.m82(1476) + str;
        }
        this.b = str2;
        this.c = null;
        return this;
    }

    public ti0 f(ej0 ej0) {
        this.o = ej0;
        return this;
    }

    public ti0 g(LifecycleState lifecycleState) {
        this.h = lifecycleState;
        return this;
    }

    public ti0 h(String str) {
        if (str.startsWith(C0201.m82(1477))) {
            this.b = str;
            this.c = null;
            return this;
        }
        i(JSBundleLoader.createFileLoader(str));
        return this;
    }

    public ti0 i(JSBundleLoader jSBundleLoader) {
        this.c = jSBundleLoader;
        this.b = null;
        return this;
    }

    public ti0 j(JSIModulePackage jSIModulePackage) {
        this.s = jSIModulePackage;
        return this;
    }

    public ti0 k(String str) {
        this.d = str;
        return this;
    }

    public ti0 l(JavaScriptExecutorFactory javaScriptExecutorFactory) {
        this.p = javaScriptExecutorFactory;
        return this;
    }

    public ti0 m(f fVar) {
        this.m = fVar;
        return this;
    }

    public ti0 n(p0 p0Var) {
        this.i = p0Var;
        return this;
    }

    public ti0 o(boolean z) {
        this.g = z;
        return this;
    }
}
