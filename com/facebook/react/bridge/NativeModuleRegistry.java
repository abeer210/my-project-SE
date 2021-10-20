package com.facebook.react.bridge;

import com.facebook.systrace.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

public class NativeModuleRegistry {
    private final Map<String, ModuleHolder> mModules;
    private final ReactApplicationContext mReactApplicationContext;

    public NativeModuleRegistry(ReactApplicationContext reactApplicationContext, Map<String, ModuleHolder> map) {
        this.mReactApplicationContext = reactApplicationContext;
        this.mModules = map;
    }

    private Map<String, ModuleHolder> getModuleMap() {
        return this.mModules;
    }

    private ReactApplicationContext getReactApplicationContext() {
        return this.mReactApplicationContext;
    }

    public List<NativeModule> getAllModules() {
        ArrayList arrayList = new ArrayList();
        for (ModuleHolder moduleHolder : this.mModules.values()) {
            arrayList.add(moduleHolder.getModule());
        }
        return arrayList;
    }

    public Collection<ModuleHolder> getCxxModules() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ModuleHolder> entry : this.mModules.entrySet()) {
            if (entry.getValue().isCxxModule()) {
                arrayList.add(entry.getValue());
            }
        }
        return arrayList;
    }

    public Collection<JavaModuleWrapper> getJavaModules(JSInstance jSInstance) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ModuleHolder> entry : this.mModules.entrySet()) {
            if (!entry.getValue().isCxxModule()) {
                arrayList.add(new JavaModuleWrapper(jSInstance, entry.getValue()));
            }
        }
        return arrayList;
    }

    public <T extends NativeModule> T getModule(Class<T> cls) {
        pj0 pj0 = (pj0) cls.getAnnotation(pj0.class);
        if (pj0 != null) {
            ModuleHolder moduleHolder = this.mModules.get(pj0.name());
            yh0.d(moduleHolder, pj0.name() + C0201.m82(15470) + cls.getName());
            return (T) moduleHolder.getModule();
        }
        throw new IllegalArgumentException(C0201.m82(15471) + cls.getName());
    }

    public <T extends NativeModule> boolean hasModule(Class<T> cls) {
        return this.mModules.containsKey(((pj0) cls.getAnnotation(pj0.class)).name());
    }

    public void notifyJSInstanceDestroy() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread();
        a.c(0, C0201.m82(15473));
        try {
            for (ModuleHolder moduleHolder : this.mModules.values()) {
                moduleHolder.destroy();
            }
        } finally {
            a.g(0);
        }
    }

    public void notifyJSInstanceInitialized() {
        this.mReactApplicationContext.assertOnNativeModulesQueueThread(C0201.m82(15474));
        ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_START);
        a.c(0, C0201.m82(15475));
        try {
            for (ModuleHolder moduleHolder : this.mModules.values()) {
                moduleHolder.markInitializable();
            }
        } finally {
            a.g(0);
            ReactMarker.logMarker(ReactMarkerConstants.NATIVE_MODULE_INITIALIZE_END);
        }
    }

    public void onBatchComplete() {
        ModuleHolder moduleHolder = this.mModules.get(C0201.m82(15476));
        if (moduleHolder != null && moduleHolder.hasInstance()) {
            ((OnBatchCompleteListener) moduleHolder.getModule()).onBatchComplete();
        }
    }

    public void registerModules(NativeModuleRegistry nativeModuleRegistry) {
        yh0.b(this.mReactApplicationContext.equals(nativeModuleRegistry.getReactApplicationContext()), C0201.m82(15477));
        for (Map.Entry<String, ModuleHolder> entry : nativeModuleRegistry.getModuleMap().entrySet()) {
            String key = entry.getKey();
            if (!this.mModules.containsKey(key)) {
                this.mModules.put(key, entry.getValue());
            }
        }
    }

    public boolean hasModule(String str) {
        return this.mModules.containsKey(str);
    }

    public NativeModule getModule(String str) {
        ModuleHolder moduleHolder = this.mModules.get(str);
        yh0.d(moduleHolder, C0201.m82(15472) + str);
        return moduleHolder.getModule();
    }
}
