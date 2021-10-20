package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: gi0  reason: default package */
/* compiled from: NativeModuleRegistryBuilder */
public class gi0 {
    private final ReactApplicationContext a;
    private final si0 b;
    private final Map<String, ModuleHolder> c = new HashMap();

    public gi0(ReactApplicationContext reactApplicationContext, si0 si0) {
        this.a = reactApplicationContext;
        this.b = si0;
    }

    public NativeModuleRegistry a() {
        return new NativeModuleRegistry(this.a, this.c);
    }

    public void b(wi0 wi0) {
        Iterable<ModuleHolder> iterable;
        if (wi0 instanceof ei0) {
            iterable = ((ei0) wi0).a(this.a);
        } else if (wi0 instanceof aj0) {
            iterable = ((aj0) wi0).d(this.a);
        } else {
            iterable = xi0.a(wi0, this.a, this.b);
        }
        for (ModuleHolder moduleHolder : iterable) {
            String name = moduleHolder.getName();
            if (this.c.containsKey(name)) {
                ModuleHolder moduleHolder2 = this.c.get(name);
                if (moduleHolder.getCanOverrideExistingModule()) {
                    this.c.remove(moduleHolder2);
                } else {
                    throw new IllegalStateException(C0201.m82(15488) + name + C0201.m82(15489) + moduleHolder2.getClassName() + C0201.m82(15490));
                }
            }
            this.c.put(name, moduleHolder);
        }
    }
}
