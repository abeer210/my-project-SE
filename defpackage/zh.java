package defpackage;

import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.m;
import java.security.MessageDigest;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: zh  reason: default package */
/* compiled from: EngineKey */
public class zh implements g {
    private final Object b;
    private final int c;
    private final int d;
    private final Class<?> e;
    private final Class<?> f;
    private final g g;
    private final Map<Class<?>, m<?>> h;
    private final i i;
    private int j;

    public zh(Object obj, g gVar, int i2, int i3, Map<Class<?>, m<?>> map, Class<?> cls, Class<?> cls2, i iVar) {
        ep.d(obj);
        this.b = obj;
        ep.e(gVar, C0201.m82(21862));
        this.g = gVar;
        this.c = i2;
        this.d = i3;
        ep.d(map);
        this.h = map;
        ep.e(cls, C0201.m82(21863));
        this.e = cls;
        ep.e(cls2, C0201.m82(21864));
        this.f = cls2;
        ep.d(iVar);
        this.i = iVar;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof zh)) {
            return false;
        }
        zh zhVar = (zh) obj;
        if (!this.b.equals(zhVar.b) || !this.g.equals(zhVar.g) || this.d != zhVar.d || this.c != zhVar.c || !this.h.equals(zhVar.h) || !this.e.equals(zhVar.e) || !this.f.equals(zhVar.f) || !this.i.equals(zhVar.i)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        if (this.j == 0) {
            int hashCode = this.b.hashCode();
            this.j = hashCode;
            int hashCode2 = (hashCode * 31) + this.g.hashCode();
            this.j = hashCode2;
            int i2 = (hashCode2 * 31) + this.c;
            this.j = i2;
            int i3 = (i2 * 31) + this.d;
            this.j = i3;
            int hashCode3 = (i3 * 31) + this.h.hashCode();
            this.j = hashCode3;
            int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
            this.j = hashCode4;
            int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
            this.j = hashCode5;
            this.j = (hashCode5 * 31) + this.i.hashCode();
        }
        return this.j;
    }

    public String toString() {
        return C0201.m82(21865) + this.b + C0201.m82(21866) + this.c + C0201.m82(21867) + this.d + C0201.m82(21868) + this.e + C0201.m82(21869) + this.f + C0201.m82(21870) + this.g + C0201.m82(21871) + this.j + C0201.m82(21872) + this.h + C0201.m82(21873) + this.i + '}';
    }
}
