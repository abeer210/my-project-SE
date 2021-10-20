package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.LogBoxModule;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.ExceptionsManagerModule;
import com.facebook.react.modules.core.HeadlessJsTaskSupportModule;
import com.facebook.react.modules.core.TimingModule;
import com.facebook.react.modules.debug.DevSettingsModule;
import com.facebook.react.modules.debug.SourceCodeModule;
import com.facebook.react.modules.deviceinfo.DeviceInfoModule;
import com.facebook.react.modules.systeminfo.AndroidInfoModule;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.p0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: bi0  reason: default package */
/* compiled from: CoreModulesPackage */
public class bi0 extends aj0 implements yi0 {
    public static final String e = null;
    public static final String f = null;
    private final si0 a;
    private final com.facebook.react.modules.core.b b;
    private final boolean c;
    private final int d;

    /* renamed from: bi0$a */
    /* compiled from: CoreModulesPackage */
    class a implements com.facebook.react.module.model.a {
        public final /* synthetic */ Map a;

        public a(bi0 bi0, Map map) {
            this.a = map;
        }

        @Override // com.facebook.react.module.model.a
        public Map<String, ReactModuleInfo> a() {
            return this.a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: bi0$b */
    /* compiled from: CoreModulesPackage */
    public class b implements UIManagerModule.g {
        public b() {
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.g
        public List<String> a() {
            return bi0.this.a.y();
        }

        @Override // com.facebook.react.uimanager.UIManagerModule.g
        public ViewManager b(String str) {
            return bi0.this.a.s(str);
        }
    }

    static {
        C0201.m83(bi0.class, 35);
    }

    public bi0(si0 si0, com.facebook.react.modules.core.b bVar, p0 p0Var, boolean z, int i) {
        this.a = si0;
        this.b = bVar;
        this.c = z;
        this.d = i;
    }

    private UIManagerModule h(ReactApplicationContext reactApplicationContext) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_START);
        com.facebook.systrace.a.c(0, C0201.m82(11517));
        try {
            if (this.c) {
                return new UIManagerModule(reactApplicationContext, new b(), this.d);
            }
            UIManagerModule uIManagerModule = new UIManagerModule(reactApplicationContext, this.a.x(reactApplicationContext), this.d);
            com.facebook.systrace.a.g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
            return uIManagerModule;
        } finally {
            com.facebook.systrace.a.g(0);
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_UI_MANAGER_MODULE_END);
        }
    }

    @Override // defpackage.yi0
    public void a() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_START);
    }

    @Override // defpackage.yi0
    public void b() {
        ReactMarker.logMarker(ReactMarkerConstants.PROCESS_CORE_REACT_PACKAGE_END);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.aj0
    public NativeModule c(String str, ReactApplicationContext reactApplicationContext) {
        char c2;
        switch (str.hashCode()) {
            case -2013505529:
                if (str.equals(C0201.m82(11527))) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1789797270:
                if (str.equals(C0201.m82(11526))) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1633589448:
                if (str.equals(C0201.m82(11525))) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1520650172:
                if (str.equals(C0201.m82(11524))) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1037217463:
                if (str.equals(C0201.m82(11523))) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -790603268:
                if (str.equals(C0201.m82(11522))) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 512434409:
                if (str.equals(C0201.m82(11521))) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 881516744:
                if (str.equals(C0201.m82(11520))) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 1256514152:
                if (str.equals(C0201.m82(11519))) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 1861242489:
                if (str.equals(C0201.m82(11518))) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                return new AndroidInfoModule(reactApplicationContext);
            case 1:
                return new DeviceEventManagerModule(reactApplicationContext, this.b);
            case 2:
                return new DevSettingsModule(reactApplicationContext, this.a.w());
            case 3:
                return new ExceptionsManagerModule(this.a.w());
            case 4:
                return new LogBoxModule(reactApplicationContext, this.a.w());
            case 5:
                return new HeadlessJsTaskSupportModule(reactApplicationContext);
            case 6:
                return new SourceCodeModule(reactApplicationContext);
            case 7:
                return new TimingModule(reactApplicationContext, this.a.w());
            case '\b':
                return h(reactApplicationContext);
            case '\t':
                return new DeviceInfoModule(reactApplicationContext);
            default:
                throw new IllegalArgumentException(C0201.m82(11528) + str);
        }
    }

    @Override // defpackage.aj0
    public com.facebook.react.module.model.a e() {
        String str = e;
        try {
            return (com.facebook.react.module.model.a) Class.forName(f).newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {AndroidInfoModule.class, DeviceEventManagerModule.class, DeviceInfoModule.class, DevSettingsModule.class, ExceptionsManagerModule.class, LogBoxModule.class, HeadlessJsTaskSupportModule.class, SourceCodeModule.class, TimingModule.class, UIManagerModule.class};
            HashMap hashMap = new HashMap();
            for (int i = 0; i < 10; i++) {
                Class cls = clsArr[i];
                pj0 pj0 = (pj0) cls.getAnnotation(pj0.class);
                hashMap.put(pj0.name(), new ReactModuleInfo(pj0.name(), cls.getName(), pj0.canOverrideExistingModule(), pj0.needsEagerInit(), pj0.hasConstants(), pj0.isCxxModule(), com.facebook.react.turbomodule.core.interfaces.a.class.isAssignableFrom(cls)));
            }
            return new a(this, hashMap);
        } catch (InstantiationException e2) {
            throw new RuntimeException(str, e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(str, e3);
        }
    }
}
