package defpackage;

import com.bumptech.glide.load.g;
import java.security.MessageDigest;
import vigqyno.C0201;

/* renamed from: ph  reason: default package */
/* compiled from: DataCacheKey */
public final class ph implements g {
    private final g b;
    private final g c;

    public ph(g gVar, g gVar2) {
        this.b = gVar;
        this.c = gVar2;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
        this.c.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof ph)) {
            return false;
        }
        ph phVar = (ph) obj;
        if (!this.b.equals(phVar.b) || !this.c.equals(phVar.c)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public String toString() {
        return C0201.m82(36999) + this.b + C0201.m82(37000) + this.c + '}';
    }
}
