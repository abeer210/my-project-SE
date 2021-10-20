package defpackage;

import android.content.Context;
import com.google.android.gms.maps.c;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import vigqyno.C0201;

/* renamed from: n52  reason: default package */
/* compiled from: KmlLayer */
public class n52 extends p42 {
    public n52(c cVar, InputStream inputStream, Context context) throws XmlPullParserException, IOException {
        if (inputStream != null) {
            u52 u52 = new u52(cVar, context);
            q52 q52 = new q52(e(inputStream));
            q52.f();
            inputStream.close();
            u52.j0(q52.e(), q52.d(), q52.c(), q52.a(), q52.b());
            c(u52);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(7867));
    }

    private static XmlPullParser e(InputStream inputStream) throws XmlPullParserException {
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        XmlPullParser newPullParser = newInstance.newPullParser();
        newPullParser.setInput(inputStream, null);
        return newPullParser;
    }

    @Override // defpackage.p42
    public Iterable<j52> b() {
        return super.b();
    }

    public void d() throws IOException, XmlPullParserException {
        super.a();
    }
}
