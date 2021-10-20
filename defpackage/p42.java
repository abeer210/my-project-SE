package defpackage;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* renamed from: p42  reason: default package */
/* compiled from: Layer */
public abstract class p42 {
    private t42 a;

    public void a() throws IOException, XmlPullParserException {
        t42 t42 = this.a;
        if (t42 instanceof u52) {
            ((u52) t42).b0();
            return;
        }
        throw new UnsupportedOperationException(C0201.m82(26704));
    }

    public Iterable<j52> b() {
        t42 t42 = this.a;
        if (t42 instanceof u52) {
            return ((u52) t42).g0();
        }
        return null;
    }

    public void c(t42 t42) {
        this.a = t42;
    }
}
