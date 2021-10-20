package defpackage;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* renamed from: l52  reason: default package */
/* compiled from: KmlFeatureParser */
public class l52 {
    private static LatLng a(String str) {
        String[] split = str.split(C0201.m82(17563));
        return new LatLng(Double.valueOf(Double.parseDouble(split[1])).doubleValue(), Double.valueOf(Double.parseDouble(split[0])).doubleValue());
    }

    private static ArrayList<LatLng> b(String str) {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        for (String str2 : str.trim().split(C0201.m82(17564))) {
            arrayList.add(a(str2));
        }
        return arrayList;
    }

    private static o42 c(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(str)) {
                return null;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(C0201.m82(17565))) {
                    return i(xmlPullParser);
                }
                if (xmlPullParser.getName().equals(C0201.m82(17566))) {
                    return f(xmlPullParser);
                }
                if (xmlPullParser.getName().equals(C0201.m82(17567))) {
                    return j(xmlPullParser);
                }
                if (xmlPullParser.getName().equals(C0201.m82(17568))) {
                    return g(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    public static m52 d(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        int eventType = xmlPullParser.getEventType();
        String str = null;
        float f = 0.0f;
        int i = 1;
        float f2 = 0.0f;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(C0201.m82(17569))) {
                return new m52(str, e((Double) hashMap2.get(C0201.m82(17570)), (Double) hashMap2.get(C0201.m82(17571)), (Double) hashMap2.get(C0201.m82(17572)), (Double) hashMap2.get(C0201.m82(17573))), f, i, hashMap, f2);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(C0201.m82(17574))) {
                    str = k(xmlPullParser);
                } else if (xmlPullParser.getName().equals(C0201.m82(17575))) {
                    f = Float.parseFloat(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(C0201.m82(17576))) {
                    i = Integer.parseInt(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(C0201.m82(17577))) {
                    hashMap.putAll(m(xmlPullParser));
                } else if (xmlPullParser.getName().equals(C0201.m82(17578))) {
                    f2 = l(xmlPullParser);
                } else if (xmlPullParser.getName().matches(C0201.m82(17579)) || xmlPullParser.getName().equals(C0201.m82(17580))) {
                    hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().matches(C0201.m82(17581))) {
                    hashMap2.put(xmlPullParser.getName(), Double.valueOf(Double.parseDouble(xmlPullParser.nextText())));
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static LatLngBounds e(Double d, Double d2, Double d3, Double d4) {
        return new LatLngBounds(new LatLng(d2.doubleValue(), d4.doubleValue()), new LatLng(d.doubleValue(), d3.doubleValue()));
    }

    private static o52 f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList<LatLng> arrayList = new ArrayList<>();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(C0201.m82(17582))) {
                return new o52(arrayList);
            }
            if (eventType == 2 && xmlPullParser.getName().equals(C0201.m82(17583))) {
                arrayList = b(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static p52 g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        int next = xmlPullParser.next();
        while (true) {
            if (next == 3 && xmlPullParser.getName().equals(C0201.m82(17584))) {
                return new p52(arrayList);
            }
            if (next == 2 && xmlPullParser.getName().matches(C0201.m82(17585))) {
                arrayList.add(c(xmlPullParser, xmlPullParser.getName()));
            }
            next = xmlPullParser.next();
        }
    }

    public static r52 h(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        HashMap hashMap = new HashMap();
        int eventType = xmlPullParser.getEventType();
        o42 o42 = null;
        String str = null;
        v52 v52 = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(C0201.m82(17586))) {
                return new r52(o42, str, v52, hashMap);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(C0201.m82(17587))) {
                    str = xmlPullParser.nextText();
                } else if (xmlPullParser.getName().matches(C0201.m82(17588))) {
                    o42 = c(xmlPullParser, xmlPullParser.getName());
                } else if (xmlPullParser.getName().matches(C0201.m82(17589))) {
                    hashMap.put(xmlPullParser.getName(), xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals(C0201.m82(17590))) {
                    hashMap.putAll(m(xmlPullParser));
                } else if (xmlPullParser.getName().equals(C0201.m82(17591))) {
                    v52 = w52.e(xmlPullParser);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static s52 i(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        LatLng latLng = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(C0201.m82(17592))) {
                return new s52(latLng);
            }
            if (eventType == 2 && xmlPullParser.getName().equals(C0201.m82(17593))) {
                latLng = a(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static t52 j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Boolean bool = Boolean.FALSE;
        ArrayList<LatLng> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(C0201.m82(17594))) {
                return new t52(arrayList, arrayList2);
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().matches(C0201.m82(17595))) {
                    bool = Boolean.valueOf(xmlPullParser.getName().equals(C0201.m82(17596)));
                } else if (xmlPullParser.getName().equals(C0201.m82(17597))) {
                    if (bool.booleanValue()) {
                        arrayList = b(xmlPullParser.nextText());
                    } else {
                        arrayList2.add(b(xmlPullParser.nextText()));
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static String k(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(C0201.m82(17598))) {
                return null;
            }
            if (eventType == 2 && xmlPullParser.getName().equals(C0201.m82(17599))) {
                return xmlPullParser.nextText();
            }
            eventType = xmlPullParser.next();
        }
    }

    private static float l(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        return -Float.parseFloat(xmlPullParser.nextText());
    }

    private static HashMap<String, String> m(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap<String, String> hashMap = new HashMap<>();
        int eventType = xmlPullParser.getEventType();
        String str = null;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals(C0201.m82(17600))) {
                return hashMap;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals(C0201.m82(17601))) {
                    str = xmlPullParser.getAttributeValue(null, C0201.m82(17602));
                } else if (xmlPullParser.getName().equals(C0201.m82(17603)) && str != null) {
                    hashMap.put(str, xmlPullParser.nextText());
                    str = null;
                }
            }
            eventType = xmlPullParser.next();
        }
    }
}
