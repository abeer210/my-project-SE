package defpackage;

import defpackage.wg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: xg  reason: default package */
/* compiled from: DataRewinderRegistry */
public class xg {
    private static final wg.a<?> b = new a();
    private final Map<Class<?>, wg.a<?>> a = new HashMap();

    /* renamed from: xg$a */
    /* compiled from: DataRewinderRegistry */
    class a implements wg.a<Object> {
        @Override // defpackage.wg.a
        public Class<Object> a() {
            throw new UnsupportedOperationException(C0201.m82(30807));
        }

        @Override // defpackage.wg.a
        public wg<Object> b(Object obj) {
            return new b(obj);
        }
    }

    /* renamed from: xg$b */
    /* compiled from: DataRewinderRegistry */
    private static final class b implements wg<Object> {
        private final Object a;

        public b(Object obj) {
            this.a = obj;
        }

        @Override // defpackage.wg
        public Object a() {
            return this.a;
        }

        @Override // defpackage.wg
        public void b() {
        }
    }

    public synchronized <T> wg<T> a(T t) {
        wg.a<?> aVar;
        ep.d(t);
        aVar = this.a.get(t.getClass());
        if (aVar == null) {
            Iterator<wg.a<?>> it = this.a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                wg.a<?> next = it.next();
                if (next.a().isAssignableFrom(t.getClass())) {
                    aVar = next;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = b;
        }
        return (wg<T>) aVar.b(t);
    }

    public synchronized void b(wg.a<?> aVar) {
        this.a.put(aVar.a(), aVar);
    }
}
