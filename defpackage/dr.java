package defpackage;

import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: dr  reason: default package */
/* compiled from: ByteTrie */
public class dr<T> {
    private final a<T> a = new a<>();
    private int b;

    /* renamed from: dr$a */
    /* compiled from: ByteTrie */
    static class a<T> {
        private final Map<Byte, a<T>> a = new HashMap();
        private T b = null;

        public void c(T t) {
            if (this.b == null) {
                this.b = t;
                return;
            }
            throw new RuntimeException(C0201.m82(23021));
        }
    }

    public void a(T t, byte[]... bArr) {
        a<T> aVar = this.a;
        int i = 0;
        for (byte[] bArr2 : bArr) {
            for (byte b2 : bArr2) {
                a<T> aVar2 = (a) ((a) aVar).a.get(Byte.valueOf(b2));
                if (aVar2 == null) {
                    aVar2 = new a<>();
                    ((a) aVar).a.put(Byte.valueOf(b2), aVar2);
                }
                aVar = aVar2;
                i++;
            }
        }
        if (i != 0) {
            aVar.c(t);
            this.b = Math.max(this.b, i);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(10735));
    }

    public T b(byte[] bArr) {
        a<T> aVar = this.a;
        T t = (T) ((a) aVar).b;
        for (byte b2 : bArr) {
            aVar = (a) ((a) aVar).a.get(Byte.valueOf(b2));
            if (aVar == null) {
                break;
            }
            if (((a) aVar).b != null) {
                t = (T) ((a) aVar).b;
            }
        }
        return t;
    }

    public int c() {
        return this.b;
    }

    public void d(T t) {
        this.a.c(t);
    }
}
