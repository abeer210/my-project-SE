package defpackage;

import com.google.android.gms.maps.model.j;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* renamed from: q52  reason: default package */
/* compiled from: KmlParser */
public class q52 {
    private final XmlPullParser a;
    private final HashMap<r52, Object> b = new HashMap<>();
    private final ArrayList<j52> c = new ArrayList<>();
    private final HashMap<String, v52> d = new HashMap<>();
    private final HashMap<String, String> e = new HashMap<>();
    private final HashMap<m52, j> f = new HashMap<>();

    public q52(XmlPullParser xmlPullParser) {
        this.a = xmlPullParser;
    }

    public static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    public ArrayList<j52> a() {
        return this.c;
    }

    public HashMap<m52, j> b() {
        return this.f;
    }

    public HashMap<r52, Object> c() {
        return this.b;
    }

    public HashMap<String, String> d() {
        return this.e;
    }

    public HashMap<String, v52> e() {
        return this.d;
    }

    public void f() throws XmlPullParserException, IOException {
        int eventType = this.a.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                if (this.a.getName().matches(C0201.m82(21012))) {
                    g(this.a);
                }
                if (this.a.getName().matches(C0201.m82(21013))) {
                    this.c.add(k52.b(this.a));
                }
                if (this.a.getName().equals(C0201.m82(21014))) {
                    v52 e2 = w52.e(this.a);
                    this.d.put(e2.s(), e2);
                }
                if (this.a.getName().equals(C0201.m82(21015))) {
                    this.e.putAll(w52.f(this.a));
                }
                if (this.a.getName().equals(C0201.m82(21016))) {
                    this.b.put(l52.h(this.a), null);
                }
                if (this.a.getName().equals(C0201.m82(21017))) {
                    this.f.put(l52.d(this.a), null);
                }
            }
            eventType = this.a.next();
        }
        this.d.put(null, new v52());
    }
}
