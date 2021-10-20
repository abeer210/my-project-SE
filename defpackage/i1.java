package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: i1  reason: default package */
/* compiled from: FontResourcesParserCompat */
public class i1 {

    /* renamed from: i1$a */
    /* compiled from: FontResourcesParserCompat */
    public interface a {
    }

    /* renamed from: i1$b */
    /* compiled from: FontResourcesParserCompat */
    public static final class b implements a {
        private final c[] a;

        public b(c[] cVarArr) {
            this.a = cVarArr;
        }

        public c[] a() {
            return this.a;
        }
    }

    /* renamed from: i1$c */
    /* compiled from: FontResourcesParserCompat */
    public static final class c {
        private final String a;
        private int b;
        private boolean c;
        private String d;
        private int e;
        private int f;

        public c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = str2;
            this.e = i2;
            this.f = i3;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

    /* renamed from: i1$d */
    /* compiled from: FontResourcesParserCompat */
    public static final class d implements a {
        private final i2 a;
        private final int b;
        private final int c;

        public d(i2 i2Var, int i, int i2) {
            this.a = i2Var;
            this.c = i;
            this.b = i2;
        }

        public int a() {
            return this.c;
        }

        public i2 b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }
    }

    private static int a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException(C0201.m82(17997));
    }

    public static List<List<byte[]>> c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        String r2 = C0201.m82(17998);
        xmlPullParser.require(2, null, r2);
        if (xmlPullParser.getName().equals(r2)) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), f1.FontFamily);
        String string = obtainAttributes.getString(f1.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(f1.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(f1.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(f1.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(f1.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(f1.FontFamily_fontProviderFetchTimeout, C0188.f21);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals(C0201.m82(17999))) {
                        arrayList.add(f(xmlPullParser, resources));
                    } else {
                        g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new b((c[]) arrayList.toArray(new c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new d(new i2(string, string2, string3, c(resources, resourceId)), integer, integer2);
    }

    private static c f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), f1.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(f1.FontFamilyFont_fontWeight) ? f1.FontFamilyFont_fontWeight : f1.FontFamilyFont_android_fontWeight, C0188.f25);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(f1.FontFamilyFont_fontStyle) ? f1.FontFamilyFont_fontStyle : f1.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(f1.FontFamilyFont_ttcIndex) ? f1.FontFamilyFont_ttcIndex : f1.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(f1.FontFamilyFont_fontVariationSettings) ? f1.FontFamilyFont_fontVariationSettings : f1.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(f1.FontFamilyFont_font) ? f1.FontFamilyFont_font : f1.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new c(string2, i, z, string, i3, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
