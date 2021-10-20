package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import vigqyno.C0201;

/* renamed from: o22  reason: default package */
/* compiled from: JsonElement */
public abstract class o22 {
    public m22 a() {
        if (d()) {
            return (m22) this;
        }
        throw new IllegalStateException(C0201.m82(32927) + this);
    }

    public r22 b() {
        if (f()) {
            return (r22) this;
        }
        throw new IllegalStateException(C0201.m82(32928) + this);
    }

    public t22 c() {
        if (g()) {
            return (t22) this;
        }
        throw new IllegalStateException(C0201.m82(32929) + this);
    }

    public boolean d() {
        return this instanceof m22;
    }

    public boolean e() {
        return this instanceof q22;
    }

    public boolean f() {
        return this instanceof r22;
    }

    public boolean g() {
        return this instanceof t22;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            h42 h42 = new h42(stringWriter);
            h42.E(true);
            o32.a(this, h42);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
