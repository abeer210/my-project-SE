package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* renamed from: k52  reason: default package */
/* compiled from: KmlContainerParser */
public class k52 {
    private static j52 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        String r8 = C0201.m82(29392);
        String attributeValue = xmlPullParser.getAttributeValue(null, r8) != null ? xmlPullParser.getAttributeValue(null, r8) : null;
        xmlPullParser.next();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(name)) {
                return new j52(hashMap, hashMap2, hashMap3, hashMap4, arrayList, hashMap5, attributeValue);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches(C0201.m82(29393))) {
                    q52.g(xmlPullParser);
                } else if (xmlPullParser.getName().matches(C0201.m82(29394))) {
                    arrayList.add(a(xmlPullParser));
                } else if (xmlPullParser.getName().matches(C0201.m82(29395))) {
                    hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(C0201.m82(29396))) {
                    e(xmlPullParser, hashMap4);
                } else if (xmlPullParser.getName().equals(C0201.m82(29397))) {
                    d(xmlPullParser, hashMap2);
                } else if (xmlPullParser.getName().equals(C0201.m82(29398))) {
                    c(xmlPullParser, hashMap3);
                } else if (xmlPullParser.getName().equals(C0201.m82(29399))) {
                    f(xmlPullParser, hashMap);
                } else if (xmlPullParser.getName().equals(C0201.m82(29400))) {
                    hashMap5.put(l52.d(xmlPullParser), null);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    public static j52 b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return a(xmlPullParser);
    }

    private static void c(XmlPullParser xmlPullParser, HashMap<r52, Object> hashMap) throws XmlPullParserException, IOException {
        hashMap.put(l52.h(xmlPullParser), null);
    }

    private static void d(XmlPullParser xmlPullParser, HashMap<String, v52> hashMap) throws XmlPullParserException, IOException {
        if (xmlPullParser.getAttributeValue(null, C0201.m82(29401)) != null) {
            v52 e = w52.e(xmlPullParser);
            hashMap.put(e.s(), e);
        }
    }

    private static void e(XmlPullParser xmlPullParser, HashMap<String, String> hashMap) throws XmlPullParserException, IOException {
        hashMap.putAll(w52.f(xmlPullParser));
    }

    private static void f(XmlPullParser xmlPullParser, HashMap<String, String> hashMap) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        String str = null;
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals(C0201.m82(29402))) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals(C0201.m82(29403))) {
                        str = xmlPullParser.getAttributeValue(null, C0201.m82(29404));
                    } else if (xmlPullParser.getName().equals(C0201.m82(29405)) && str != null) {
                        hashMap.put(str, xmlPullParser.nextText());
                        str = null;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }
}
