package defpackage;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: yr  reason: default package */
/* compiled from: StringValue */
public final class yr {
    private final byte[] a;
    private final Charset b;

    public yr(byte[] bArr, Charset charset) {
        this.a = bArr;
        this.b = charset;
    }

    public byte[] a() {
        return this.a;
    }

    public String b(Charset charset) {
        if (charset != null) {
            try {
                return new String(this.a, charset.name());
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new String(this.a);
    }

    public String toString() {
        return b(this.b);
    }
}
