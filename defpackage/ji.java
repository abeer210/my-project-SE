package defpackage;

import com.bumptech.glide.load.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.m;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import vigqyno.C0201;

/* renamed from: ji  reason: default package */
/* compiled from: ResourceCacheKey */
public final class ji implements g {
    private static final bp<Class<?>, byte[]> j = new bp<>(50);
    private final ni b;
    private final g c;
    private final g d;
    private final int e;
    private final int f;
    private final Class<?> g;
    private final i h;
    private final m<?> i;

    public ji(ni niVar, g gVar, g gVar2, int i2, int i3, m<?> mVar, Class<?> cls, i iVar) {
        this.b = niVar;
        this.c = gVar;
        this.d = gVar2;
        this.e = i2;
        this.f = i3;
        this.i = mVar;
        this.g = cls;
        this.h = iVar;
    }

    private byte[] c() {
        byte[] g2 = j.g(this.g);
        if (g2 != null) {
            return g2;
        }
        byte[] bytes = this.g.getName().getBytes(g.a);
        j.k(this.g, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.b.d(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        m<?> mVar = this.i;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        messageDigest.update(c());
        this.b.c(bArr);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof ji)) {
            return false;
        }
        ji jiVar = (ji) obj;
        if (this.f != jiVar.f || this.e != jiVar.e || !fp.c(this.i, jiVar.i) || !this.g.equals(jiVar.g) || !this.c.equals(jiVar.c) || !this.d.equals(jiVar.d) || !this.h.equals(jiVar.h)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        int hashCode = (((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e) * 31) + this.f;
        m<?> mVar = this.i;
        if (mVar != null) {
            hashCode = (hashCode * 31) + mVar.hashCode();
        }
        return (((hashCode * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public String toString() {
        return C0201.m82(24784) + this.c + C0201.m82(24785) + this.d + C0201.m82(24786) + this.e + C0201.m82(24787) + this.f + C0201.m82(24788) + this.g + C0201.m82(24789) + this.i + '\'' + C0201.m82(24790) + this.h + '}';
    }
}
