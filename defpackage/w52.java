package defpackage;

import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* renamed from: w52  reason: default package */
/* compiled from: KmlStyleParser */
public class w52 {
    private static void a(XmlPullParser xmlPullParser, v52 v52) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals(C0201.m82(17479))) {
                if (eventType == 2 && xmlPullParser.getName().equals(C0201.m82(17480))) {
                    v52.H(xmlPullParser.nextText());
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    private static void b(XmlPullParser xmlPullParser, v52 v52) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals(C0201.m82(17481))) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals(C0201.m82(17482))) {
                        v52.C(Float.parseFloat(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(C0201.m82(17483))) {
                        h(xmlPullParser, v52);
                    } else if (xmlPullParser.getName().equals(C0201.m82(17484))) {
                        g(xmlPullParser, v52);
                    } else if (xmlPullParser.getName().equals(C0201.m82(17485))) {
                        v52.F(Double.parseDouble(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(C0201.m82(17486))) {
                        v52.J(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(C0201.m82(17487))) {
                        v52.E(xmlPullParser.nextText());
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    private static void c(XmlPullParser xmlPullParser, v52 v52) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals(C0201.m82(17488))) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals(C0201.m82(17489))) {
                        v52.L(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(C0201.m82(17490))) {
                        v52.O(Float.valueOf(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(C0201.m82(17491))) {
                        v52.I(xmlPullParser.nextText());
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    private static void d(XmlPullParser xmlPullParser, v52 v52) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals(C0201.m82(17492))) {
                if (eventType == 2) {
                    if (xmlPullParser.getName().equals(C0201.m82(17493))) {
                        v52.B(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(C0201.m82(17494))) {
                        v52.K(i52.a(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(C0201.m82(17495))) {
                        v52.A(i52.a(xmlPullParser.nextText()));
                    } else if (xmlPullParser.getName().equals(C0201.m82(17496))) {
                        v52.M(xmlPullParser.nextText());
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    public static v52 e(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        v52 v52 = new v52();
        i(xmlPullParser.getAttributeValue(null, C0201.m82(17497)), v52);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(C0201.m82(17498))) {
                return v52;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(C0201.m82(17499))) {
                    b(xmlPullParser, v52);
                } else if (xmlPullParser.getName().equals(C0201.m82(17500))) {
                    c(xmlPullParser, v52);
                } else if (xmlPullParser.getName().equals(C0201.m82(17501))) {
                    d(xmlPullParser, v52);
                } else if (xmlPullParser.getName().equals(C0201.m82(17502))) {
                    a(xmlPullParser, v52);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    public static HashMap<String, String> f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap<String, String> hashMap = new HashMap<>();
        Boolean bool = Boolean.FALSE;
        String str = C0201.m82(17503) + xmlPullParser.getAttributeValue(null, C0201.m82(17504));
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(C0201.m82(17505))) {
                return hashMap;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(C0201.m82(17506)) && xmlPullParser.nextText().equals(C0201.m82(17507))) {
                    bool = Boolean.TRUE;
                } else if (xmlPullParser.getName().equals(C0201.m82(17508)) && bool.booleanValue()) {
                    hashMap.put(str, xmlPullParser.nextText());
                    bool = Boolean.FALSE;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void g(XmlPullParser xmlPullParser, v52 v52) {
        Float valueOf = Float.valueOf(Float.parseFloat(xmlPullParser.getAttributeValue(null, C0201.m82(17509))));
        Float valueOf2 = Float.valueOf(Float.parseFloat(xmlPullParser.getAttributeValue(null, C0201.m82(17510))));
        v52.D(valueOf.floatValue(), valueOf2.floatValue(), xmlPullParser.getAttributeValue(null, C0201.m82(17511)), xmlPullParser.getAttributeValue(null, C0201.m82(17512)));
    }

    private static void h(XmlPullParser xmlPullParser, v52 v52) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 3 || !xmlPullParser.getName().equals(C0201.m82(17513))) {
                if (eventType == 2 && xmlPullParser.getName().equals(C0201.m82(17514))) {
                    v52.G(xmlPullParser.nextText());
                }
                eventType = xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    private static void i(String str, v52 v52) {
        if (str != null) {
            v52.N(C0201.m82(17515) + str);
        }
    }
}
