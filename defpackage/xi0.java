package defpackage;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: xi0  reason: default package */
/* compiled from: ReactPackageHelper */
public class xi0 {

    /* access modifiers changed from: package-private */
    /* renamed from: xi0$a */
    /* compiled from: ReactPackageHelper */
    public static class a implements Iterable<ModuleHolder> {
        public final /* synthetic */ List a;

        /* renamed from: xi0$a$a  reason: collision with other inner class name */
        /* compiled from: ReactPackageHelper */
        class C0225a implements Iterator<ModuleHolder> {
            public int a = 0;

            public C0225a() {
            }

            /* renamed from: a */
            public ModuleHolder next() {
                List list = a.this.a;
                int i = this.a;
                this.a = i + 1;
                return new ModuleHolder((NativeModule) list.get(i));
            }

            public boolean hasNext() {
                return this.a < a.this.a.size();
            }

            public void remove() {
                throw new UnsupportedOperationException(C0201.m82(18879));
            }
        }

        public a(List list) {
            this.a = list;
        }

        @Override // java.lang.Iterable
        public Iterator<ModuleHolder> iterator() {
            return new C0225a();
        }
    }

    public static Iterable<ModuleHolder> a(wi0 wi0, ReactApplicationContext reactApplicationContext, si0 si0) {
        List<NativeModule> list;
        f60.b(C0201.m82(12093), wi0.getClass().getSimpleName() + C0201.m82(12092));
        if (wi0 instanceof ui0) {
            list = ((ui0) wi0).a(reactApplicationContext, si0);
        } else {
            list = wi0.createNativeModules(reactApplicationContext);
        }
        return new a(list);
    }
}
