package defpackage;

import com.bumptech.glide.load.g;
import java.security.MessageDigest;
import vigqyno.C0201;

/* renamed from: uo  reason: default package */
/* compiled from: ObjectKey */
public final class uo implements g {
    private final Object b;

    public uo(Object obj) {
        ep.d(obj);
        this.b = obj;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(g.a));
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof uo) {
            return this.b.equals(((uo) obj).b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return C0201.m82(10535) + this.b + '}';
    }
}
