package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.g;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: sj  reason: default package */
/* compiled from: GlideUrl */
public class sj implements g {
    private final tj b;
    private final URL c;
    private final String d;
    private String e;
    private URL f;
    private volatile byte[] g;
    private int h;

    public sj(URL url) {
        this(url, tj.a);
    }

    private byte[] d() {
        if (this.g == null) {
            this.g = c().getBytes(g.a);
        }
        return this.g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.e)) {
            String str = this.d;
            if (TextUtils.isEmpty(str)) {
                URL url = this.c;
                ep.d(url);
                str = url.toString();
            }
            this.e = Uri.encode(str, C0201.m82(5507));
        }
        return this.e;
    }

    private URL g() throws MalformedURLException {
        if (this.f == null) {
            this.f = new URL(f());
        }
        return this.f;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        ep.d(url);
        return url.toString();
    }

    public Map<String, String> e() {
        return this.b.a();
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof sj)) {
            return false;
        }
        sj sjVar = (sj) obj;
        if (!c().equals(sjVar.c()) || !this.b.equals(sjVar.b)) {
            return false;
        }
        return true;
    }

    public String h() {
        return f();
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        if (this.h == 0) {
            int hashCode = c().hashCode();
            this.h = hashCode;
            this.h = (hashCode * 31) + this.b.hashCode();
        }
        return this.h;
    }

    public URL i() throws MalformedURLException {
        return g();
    }

    public String toString() {
        return c();
    }

    public sj(String str) {
        this(str, tj.a);
    }

    public sj(URL url, tj tjVar) {
        ep.d(url);
        this.c = url;
        this.d = null;
        ep.d(tjVar);
        this.b = tjVar;
    }

    public sj(String str, tj tjVar) {
        this.c = null;
        ep.b(str);
        this.d = str;
        ep.d(tjVar);
        this.b = tjVar;
    }
}
