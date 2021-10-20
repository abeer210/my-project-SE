package defpackage;

import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import vigqyno.C0201;

/* renamed from: h63  reason: default package */
/* compiled from: EnvelopedDataHelper */
public class h63 {
    public static final u73 b = o73.a;
    public static final Map c = new HashMap();
    public static final Map d = new HashMap();
    public static final Map e = new HashMap();
    private i63 a;

    /* renamed from: h63$a */
    /* compiled from: EnvelopedDataHelper */
    class a implements b {
        public final /* synthetic */ o43 a;
        public final /* synthetic */ Key b;

        public a(o43 o43, Key key) {
            this.a = o43;
            this.b = key;
        }

        @Override // defpackage.h63.b
        public Object a() throws h53, InvalidAlgorithmParameterException, InvalidKeyException, InvalidParameterSpecException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException {
            Cipher c2 = h63.this.c(this.a.g());
            g03 k = this.a.k();
            String u = this.a.g().u();
            String r3 = C0201.m82(25013);
            if (k != null && !(k instanceof n03)) {
                try {
                    AlgorithmParameters a2 = h63.this.a(this.a.g());
                    f63.a(a2, k);
                    c2.init(2, this.b, a2);
                } catch (NoSuchAlgorithmException e) {
                    if (u.equals(d53.a.u()) || u.equals(f53.a) || u.equals(r3) || u.equals(f53.b) || u.equals(f53.c) || u.equals(f53.d)) {
                        c2.init(2, this.b, new IvParameterSpec(q03.q(k).s()));
                    } else {
                        throw e;
                    }
                }
            } else if (u.equals(d53.a.u()) || u.equals(f53.a) || u.equals(r3) || u.equals(C0201.m82(25014))) {
                c2.init(2, this.b, new IvParameterSpec(new byte[8]));
            } else {
                c2.init(2, this.b);
            }
            return c2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h63$b */
    /* compiled from: EnvelopedDataHelper */
    public interface b {
        Object a() throws h53, InvalidAlgorithmParameterException, InvalidKeyException, InvalidParameterSpecException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchProviderException;
    }

    static {
        c.put(d53.a, C0201.m82(13864));
        c.put(d53.b, C0201.m82(13865));
        Map map = c;
        p03 p03 = d53.e;
        String r2 = C0201.m82(13866);
        map.put(p03, r2);
        c.put(d53.f, r2);
        c.put(d53.g, r2);
        c.put(d53.c, C0201.m82(13867));
        c.put(d53.d, C0201.m82(13868));
        Map map2 = c;
        p03 p032 = d53.h;
        String r22 = C0201.m82(13869);
        map2.put(p032, r22);
        c.put(d53.i, r22);
        c.put(d53.j, r22);
        c.put(d53.k, C0201.m82(13870));
        Map map3 = c;
        p03 p033 = d43.l;
        String r23 = C0201.m82(13871);
        map3.put(p033, r23);
        d.put(d53.a, C0201.m82(13872));
        d.put(d53.c, C0201.m82(13873));
        d.put(d53.b, C0201.m82(13874));
        Map map4 = d;
        p03 p034 = d53.e;
        String r3 = C0201.m82(13875);
        map4.put(p034, r3);
        d.put(d53.f, r3);
        d.put(d53.g, r3);
        d.put(d43.b, C0201.m82(13876));
        d.put(d53.d, C0201.m82(13877));
        Map map5 = d;
        p03 p035 = d53.h;
        String r32 = C0201.m82(13878);
        map5.put(p035, r32);
        d.put(d53.i, r32);
        d.put(d53.j, r32);
        d.put(d53.k, C0201.m82(13879));
        d.put(d43.l, r23);
        e.put(d53.b, C0201.m82(13880));
        Map map6 = e;
        p03 p036 = d53.e;
        String r24 = C0201.m82(13881);
        map6.put(p036, r24);
        e.put(d53.f, r24);
        e.put(d53.g, r24);
        e.put(d53.c, C0201.m82(13882));
    }

    public h63(i63 i63) {
        this.a = i63;
    }

    public static Object e(b bVar) throws h53 {
        try {
            return bVar.a();
        } catch (NoSuchAlgorithmException e2) {
            throw new h53(C0201.m82(13888), e2);
        } catch (InvalidKeyException e3) {
            throw new h53(C0201.m82(13887), e3);
        } catch (NoSuchProviderException e4) {
            throw new h53(C0201.m82(13886), e4);
        } catch (NoSuchPaddingException e5) {
            throw new h53(C0201.m82(13885), e5);
        } catch (InvalidAlgorithmParameterException e6) {
            throw new h53(C0201.m82(13884), e6);
        } catch (InvalidParameterSpecException e7) {
            throw new h53(C0201.m82(13883), e7);
        }
    }

    public AlgorithmParameters a(p03 p03) throws NoSuchAlgorithmException, NoSuchProviderException {
        String str = (String) c.get(p03);
        if (str != null) {
            try {
                return this.a.c(str);
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return this.a.c(p03.u());
    }

    public v73 b(o43 o43, PrivateKey privateKey) {
        return this.a.b(o43, privateKey);
    }

    public Cipher c(p03 p03) throws h53 {
        try {
            String str = (String) d.get(p03);
            if (str != null) {
                try {
                    return this.a.a(str);
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            return this.a.a(p03.u());
        } catch (GeneralSecurityException e2) {
            throw new h53(C0201.m82(13889) + e2.getMessage(), e2);
        }
    }

    public Cipher d(Key key, o43 o43) throws h53 {
        return (Cipher) e(new a(o43, key));
    }

    public String f(p03 p03) {
        String str = (String) c.get(p03);
        return str == null ? p03.u() : str;
    }

    public Key g(p03 p03, p73 p73) {
        if (p73.a() instanceof Key) {
            return (Key) p73.a();
        }
        if (p73.a() instanceof byte[]) {
            return new SecretKeySpec((byte[]) p73.a(), f(p03));
        }
        throw new IllegalArgumentException(C0201.m82(13890));
    }

    public void h(o43 o43, Key key) throws h53 {
        int a2 = b.a(o43);
        if (a2 > 0) {
            byte[] bArr = null;
            try {
                bArr = key.getEncoded();
            } catch (Exception unused) {
            }
            if (bArr != null && bArr.length * 8 != a2) {
                throw new h53(C0201.m82(13891));
            }
        }
    }
}
