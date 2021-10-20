package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;
import vigqyno.C0201;

/* renamed from: aj0  reason: default package */
/* compiled from: TurboReactPackage */
public abstract class aj0 implements wi0 {

    /* access modifiers changed from: package-private */
    /* renamed from: aj0$a */
    /* compiled from: TurboReactPackage */
    public class a implements Iterable<ModuleHolder> {
        public final /* synthetic */ Iterator a;
        public final /* synthetic */ ReactApplicationContext b;

        /* renamed from: aj0$a$a  reason: collision with other inner class name */
        /* compiled from: TurboReactPackage */
        class C0002a implements Iterator<ModuleHolder> {
            public Map.Entry<String, ReactModuleInfo> a = null;

            public C0002a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:2:0x000a  */
            private void a() {
                while (a.this.a.hasNext()) {
                    Map.Entry<String, ReactModuleInfo> entry = (Map.Entry) a.this.a.next();
                    ReactModuleInfo value = entry.getValue();
                    if (!dj0.a || !value.e()) {
                        this.a = entry;
                        return;
                    }
                    while (a.this.a.hasNext()) {
                    }
                }
                this.a = null;
            }

            /* renamed from: b */
            public ModuleHolder next() {
                if (this.a == null) {
                    a();
                }
                Map.Entry<String, ReactModuleInfo> entry = this.a;
                if (entry != null) {
                    a();
                    a aVar = a.this;
                    return new ModuleHolder(entry.getValue(), new b(entry.getKey(), aVar.b));
                }
                throw new NoSuchElementException(C0201.m82(5455));
            }

            public boolean hasNext() {
                if (this.a == null) {
                    a();
                }
                return this.a != null;
            }

            public void remove() {
                throw new UnsupportedOperationException(C0201.m82(5456));
            }
        }

        public a(Iterator it, ReactApplicationContext reactApplicationContext) {
            this.a = it;
            this.b = reactApplicationContext;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0002a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: aj0$b */
    /* compiled from: TurboReactPackage */
    public class b implements Provider<NativeModule> {
        private final String a;
        private final ReactApplicationContext b;

        public b(String str, ReactApplicationContext reactApplicationContext) {
            this.a = str;
            this.b = reactApplicationContext;
        }

        /* renamed from: a */
        public NativeModule get() {
            return aj0.this.c(this.a, this.b);
        }
    }

    public abstract NativeModule c(String str, ReactApplicationContext reactApplicationContext);

    @Override // defpackage.wi0
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        throw new UnsupportedOperationException(C0201.m82(21425));
    }

    @Override // defpackage.wi0
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        List<ModuleSpec> f = f(reactApplicationContext);
        if (f == null || f.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ModuleSpec moduleSpec : f) {
            arrayList.add((ViewManager) moduleSpec.getProvider().get());
        }
        return arrayList;
    }

    public Iterable<ModuleHolder> d(ReactApplicationContext reactApplicationContext) {
        return new a(e().a().entrySet().iterator(), reactApplicationContext);
    }

    public abstract com.facebook.react.module.model.a e();

    public List<ModuleSpec> f(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }
}
