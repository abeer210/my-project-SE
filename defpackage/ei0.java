package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ei0  reason: default package */
/* compiled from: LazyReactPackage */
public abstract class ei0 implements wi0 {

    /* access modifiers changed from: package-private */
    /* renamed from: ei0$a */
    /* compiled from: LazyReactPackage */
    public class a implements Iterable<ModuleHolder> {
        public final /* synthetic */ List a;
        public final /* synthetic */ Map b;

        /* renamed from: ei0$a$a  reason: collision with other inner class name */
        /* compiled from: LazyReactPackage */
        class C0136a implements Iterator<ModuleHolder> {
            public int a = 0;

            public C0136a() {
            }

            /* JADX INFO: finally extract failed */
            /* renamed from: a */
            public ModuleHolder next() {
                List list = a.this.a;
                int i = this.a;
                this.a = i + 1;
                ModuleSpec moduleSpec = (ModuleSpec) list.get(i);
                String name = moduleSpec.getName();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) a.this.b.get(name);
                if (reactModuleInfo != null) {
                    return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
                }
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, name);
                try {
                    NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().get();
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                    return new ModuleHolder(nativeModule);
                } catch (Throwable th) {
                    ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                    throw th;
                }
            }

            public boolean hasNext() {
                return this.a < a.this.a.size();
            }

            public void remove() {
                throw new UnsupportedOperationException(C0201.m82(7682));
            }
        }

        public a(ei0 ei0, List list, Map map) {
            this.a = list;
            this.b = map;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0136a();
        }
    }

    public Iterable<ModuleHolder> a(ReactApplicationContext reactApplicationContext) {
        return new a(this, b(reactApplicationContext), c().a());
    }

    public abstract List<ModuleSpec> b(ReactApplicationContext reactApplicationContext);

    public abstract com.facebook.react.module.model.a c();

    /* JADX INFO: finally extract failed */
    @Override // defpackage.wi0
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : b(reactApplicationContext)) {
            b.AbstractC0053b a2 = b.a(0, C0201.m82(34147));
            a2.b(C0201.m82(34148), moduleSpec.getType());
            a2.c();
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
            try {
                NativeModule nativeModule = (NativeModule) moduleSpec.getProvider().get();
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                b.b(0).c();
                arrayList.add(nativeModule);
            } catch (Throwable th) {
                ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
                b.b(0).c();
                throw th;
            }
        }
        return arrayList;
    }

    @Override // defpackage.wi0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> d = d(reactApplicationContext);
        if (d == null || d.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : d) {
            arrayList.add((ViewManager) moduleSpec.getProvider().get());
        }
        return arrayList;
    }

    public List<ModuleSpec> d(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
