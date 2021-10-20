package defpackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.JSCHeapCapture;
import com.facebook.react.module.model.ReactModuleInfo;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ci0  reason: default package */
/* compiled from: DebugCorePackage */
public class ci0 extends aj0 {
    public static final String a = null;
    public static final String b = null;

    /* renamed from: ci0$a */
    /* compiled from: DebugCorePackage */
    class a implements com.facebook.react.module.model.a {
        public final /* synthetic */ Map a;

        public a(ci0 ci0, Map map) {
            this.a = map;
        }

        @Override // com.facebook.react.module.model.a
        public Map<String, ReactModuleInfo> a() {
            return this.a;
        }
    }

    static {
        C0201.m83(ci0.class, 28);
    }

    @Override // defpackage.aj0
    public NativeModule c(String str, ReactApplicationContext reactApplicationContext) {
        if (((str.hashCode() == 133931840 && str.equals(C0201.m82(9772))) ? (char) 0 : 65535) == 0) {
            return new JSCHeapCapture(reactApplicationContext);
        }
        throw new IllegalArgumentException(C0201.m82(9773) + str);
    }

    @Override // defpackage.aj0
    public com.facebook.react.module.model.a e() {
        String str = b;
        try {
            return (com.facebook.react.module.model.a) Class.forName(a).newInstance();
        } catch (ClassNotFoundException unused) {
            Class[] clsArr = {JSCHeapCapture.class};
            HashMap hashMap = new HashMap();
            for (int i = 0; i < 1; i++) {
                Class cls = clsArr[i];
                pj0 pj0 = (pj0) cls.getAnnotation(pj0.class);
                hashMap.put(pj0.name(), new ReactModuleInfo(pj0.name(), cls.getName(), pj0.canOverrideExistingModule(), pj0.needsEagerInit(), pj0.hasConstants(), pj0.isCxxModule(), com.facebook.react.turbomodule.core.interfaces.a.class.isAssignableFrom(cls)));
            }
            return new a(this, hashMap);
        } catch (InstantiationException e) {
            throw new RuntimeException(str, e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(str, e2);
        }
    }
}
