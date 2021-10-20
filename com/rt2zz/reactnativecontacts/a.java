package com.rt2zz.reactnativecontacts;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* compiled from: ContactsProvider */
public class a {
    public static final String A = null;
    public static final String B = null;
    public static final String C = null;
    public static final String D = null;
    public static final String E = null;
    public static final String F = null;
    public static final String G = null;
    public static final String H = null;
    public static final String I = null;
    public static final String J = null;
    public static final String K = null;
    public static final String L = null;
    public static final String M = null;
    public static final String N = null;
    public static final String O = null;
    public static final String P = null;
    public static final String Q = null;
    public static final String R = null;
    public static final String S = null;
    public static final String T = null;
    public static final String U = null;
    public static final String V = null;
    public static final String W = null;
    public static final String X = null;
    public static final String Y = null;
    public static final String Z = null;
    public static final String aa = null;
    public static final String ab = null;
    public static final String ac = null;
    public static final String ad = null;
    private static final List<String> b = new C0124a();
    private static final List<String> c = new b();
    private static final List<String> d = new c();
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    public static final String v = null;
    public static final String w = null;
    public static final String x = null;
    public static final String y = null;
    public static final String z = null;
    private final ContentResolver a;

    /* renamed from: com.rt2zz.reactnativecontacts.a$a  reason: collision with other inner class name */
    /* compiled from: ContactsProvider */
    static class C0124a extends ArrayList<String> {
        public C0124a() {
            add(C0201.m82(2272));
            add(C0201.m82(2273));
            add(C0201.m82(2274));
            add(C0201.m82(2275));
            add(C0201.m82(2276));
            add(C0201.m82(2277));
            add(C0201.m82(2278));
            String r0 = C0201.m82(2279);
            add(r0);
            String r1 = C0201.m82(2280);
            add(r1);
            String r2 = C0201.m82(2281);
            add(r2);
            String r3 = C0201.m82(2282);
            add(r3);
            String r4 = C0201.m82(2283);
            add(r4);
            String r5 = C0201.m82(2284);
            add(r5);
            add(r0);
            add(r4);
            add(r1);
            add(r3);
            add(r0);
            add(r0);
            add(r1);
            add(r3);
            add(r0);
            add(r4);
            add(r2);
            add(r0);
            add(r1);
            add(r3);
            add(r4);
            add(r2);
            add(r5);
            add(C0201.m82(2285));
            add(C0201.m82(2286));
            add(C0201.m82(2287));
            add(C0201.m82(2288));
            add(r0);
            add(r0);
            add(r0);
            add(r0);
            add(r1);
        }
    }

    /* compiled from: ContactsProvider */
    static class b extends ArrayList<String> {
        public b() {
            addAll(a.b);
        }
    }

    /* compiled from: ContactsProvider */
    static class c extends ArrayList<String> {
        public c() {
            add(C0201.m82(2185));
        }
    }

    static {
        C0201.m83(a.class, 24);
    }

    public a(ContentResolver contentResolver) {
        this.a = contentResolver;
    }

    private Map<String, d> j(Cursor cursor) {
        String str;
        String str2;
        String str3;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor != null && cursor.moveToNext()) {
            int columnIndex = cursor.getColumnIndex(ab);
            int columnIndex2 = cursor.getColumnIndex(T);
            int columnIndex3 = cursor.getColumnIndex(I);
            char c2 = 65535;
            if (columnIndex != -1) {
                str = cursor.getString(columnIndex);
            } else {
                str = String.valueOf(-1);
            }
            if (columnIndex2 != -1) {
                str2 = cursor.getString(columnIndex2);
            } else {
                str2 = String.valueOf(-1);
            }
            if (columnIndex3 != -1) {
                str3 = cursor.getString(columnIndex3);
            } else {
                str3 = String.valueOf(-1);
            }
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, new d(str));
            }
            d dVar = (d) linkedHashMap.get(str);
            String string = cursor.getString(cursor.getColumnIndex(y));
            String string2 = cursor.getString(cursor.getColumnIndex(e));
            dVar.b = str3;
            if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(dVar.c)) {
                dVar.c = string2;
            }
            if (TextUtils.isEmpty(dVar.p)) {
                String string3 = cursor.getString(cursor.getColumnIndex(u));
                if (!TextUtils.isEmpty(string3)) {
                    dVar.p = string3;
                    dVar.o = true;
                }
            }
            switch (string.hashCode()) {
                case -1569536764:
                    if (string.equals(R)) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1328682538:
                    if (string.equals(X)) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -1079224304:
                    if (string.equals(p)) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -601229436:
                    if (string.equals(W)) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 456415478:
                    if (string.equals(H)) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 684173810:
                    if (string.equals(k)) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 689862072:
                    if (string.equals(A)) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 950831081:
                    if (string.equals(S)) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            String str4 = Y;
            String str5 = x;
            String str6 = P;
            String str7 = t;
            String str8 = U;
            String str9 = r;
            String str10 = m;
            String str11 = g;
            String str12 = i;
            String str13 = h;
            String str14 = j;
            switch (c2) {
                case 0:
                    dVar.d = cursor.getString(cursor.getColumnIndex(str11));
                    if (cursor.getString(cursor.getColumnIndex(str10)) != null) {
                        dVar.e = cursor.getString(cursor.getColumnIndex(str10));
                    } else {
                        dVar.e = str13;
                    }
                    if (cursor.getString(cursor.getColumnIndex(str12)) != null) {
                        dVar.f = cursor.getString(cursor.getColumnIndex(str12));
                    } else {
                        dVar.f = str13;
                    }
                    dVar.g = cursor.getString(cursor.getColumnIndex(str5));
                    dVar.h = cursor.getString(cursor.getColumnIndex(str6));
                    break;
                case 1:
                    String string4 = cursor.getString(cursor.getColumnIndex(str14));
                    int i2 = cursor.getInt(cursor.getColumnIndex(str11));
                    if (!TextUtils.isEmpty(string4)) {
                        if (i2 == 1) {
                            str4 = str8;
                        } else if (i2 != 2) {
                            str4 = i2 != 3 ? str9 : str7;
                        }
                        dVar.r.add(new d.b(str4, string4, str2));
                        break;
                    } else {
                        break;
                    }
                case 2:
                    String string5 = cursor.getString(cursor.getColumnIndex(str14));
                    int i3 = cursor.getInt(cursor.getColumnIndex(str11));
                    if (!TextUtils.isEmpty(string5)) {
                        if (i3 == 0) {
                            str4 = cursor.getString(cursor.getColumnIndex(str12)) != null ? cursor.getString(cursor.getColumnIndex(str12)).toLowerCase() : str13;
                        } else if (i3 == 1) {
                            str4 = str8;
                        } else if (i3 == 2) {
                            str4 = str7;
                        } else if (i3 != 4) {
                            str4 = str9;
                        }
                        dVar.q.add(new d.b(str4, string5, str2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    String string6 = cursor.getString(cursor.getColumnIndex(str14));
                    int i4 = cursor.getInt(cursor.getColumnIndex(str11));
                    if (TextUtils.isEmpty(string6)) {
                        break;
                    } else {
                        switch (i4) {
                            case 0:
                                if (cursor.getString(cursor.getColumnIndex(str12)) == null) {
                                    str7 = str13;
                                    break;
                                } else {
                                    str7 = cursor.getString(cursor.getColumnIndex(str12)).toLowerCase();
                                    break;
                                }
                            case 1:
                                str7 = C;
                                break;
                            case 2:
                                str7 = K;
                                break;
                            case 3:
                                str7 = F;
                                break;
                            case 4:
                                str7 = str8;
                                break;
                            case 5:
                                break;
                            case 6:
                                str7 = ac;
                                break;
                            default:
                                str7 = str9;
                                break;
                        }
                        dVar.m.add(new d.b(str7, string6, str2));
                        break;
                    }
                case 4:
                    String string7 = cursor.getString(cursor.getColumnIndex(str14));
                    int i5 = cursor.getInt(cursor.getColumnIndex(str10));
                    if (TextUtils.isEmpty(string7)) {
                        break;
                    } else {
                        switch (i5) {
                            case -1:
                                if (cursor.getString(cursor.getColumnIndex(str6)) == null) {
                                    str9 = str13;
                                    break;
                                } else {
                                    str9 = cursor.getString(cursor.getColumnIndex(str6));
                                    break;
                                }
                            case 0:
                                str9 = M;
                                break;
                            case 1:
                                str9 = w;
                                break;
                            case 2:
                                str9 = L;
                                break;
                            case 3:
                                str9 = O;
                                break;
                            case 4:
                                str9 = D;
                                break;
                            case 5:
                                str9 = B;
                                break;
                            case 6:
                                str9 = Z;
                                break;
                            case 7:
                                str9 = aa;
                                break;
                            case 8:
                                str9 = o;
                                break;
                        }
                        dVar.n.add(new d.b(str9, string7, str2));
                        break;
                    }
                case 5:
                    dVar.i = cursor.getString(cursor.getColumnIndex(str14));
                    dVar.j = cursor.getString(cursor.getColumnIndex(str5));
                    dVar.k = cursor.getString(cursor.getColumnIndex(str10));
                    break;
                case 6:
                    dVar.s.add(new d.c(cursor));
                    break;
                case 7:
                    if (cursor.getInt(cursor.getColumnIndex(str11)) != 3) {
                        break;
                    } else {
                        try {
                            List asList = Arrays.asList(cursor.getString(cursor.getColumnIndex(str14)).replace(J, str13).split(f));
                            if (asList.size() != 2) {
                                if (asList.size() != 3) {
                                    break;
                                } else {
                                    int parseInt = Integer.parseInt((String) asList.get(0));
                                    int parseInt2 = Integer.parseInt((String) asList.get(1));
                                    int parseInt3 = Integer.parseInt((String) asList.get(2));
                                    if (parseInt > 0 && parseInt2 >= 1 && parseInt2 <= 12 && parseInt3 >= 1 && parseInt3 <= 31) {
                                        dVar.t = new d.C0125a(parseInt, parseInt2, parseInt3);
                                        break;
                                    }
                                }
                            } else {
                                int parseInt4 = Integer.parseInt((String) asList.get(0));
                                int parseInt5 = Integer.parseInt((String) asList.get(1));
                                if (parseInt4 >= 1 && parseInt4 <= 12 && parseInt5 >= 1 && parseInt5 <= 31) {
                                    dVar.t = new d.C0125a(parseInt4, parseInt5);
                                    break;
                                }
                            }
                        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e2) {
                            Log.w(l, e2.toString());
                            break;
                        }
                    }
            }
        }
        return linkedHashMap;
    }

    public WritableMap b(String str) {
        ContentResolver contentResolver = this.a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = c;
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), C0201.m82(7631), new String[]{str}, null);
        try {
            Map<String, d> j2 = j(query);
            if (j2.values().size() > 0) {
                return j2.values().iterator().next().u();
            }
            return null;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public WritableMap c(String str) {
        int columnIndex;
        String r0 = C0201.m82(7632);
        Cursor query = this.a.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{r0}, C0201.m82(7633), new String[]{str}, null);
        query.getCount();
        String string = (!query.moveToNext() || (columnIndex = query.getColumnIndex(r0)) == -1) ? null : query.getString(columnIndex);
        query.close();
        return b(string);
    }

    public WritableArray d() {
        ContentResolver contentResolver = this.a;
        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Profile.CONTENT_URI, E);
        List<String> list = b;
        Cursor query = contentResolver.query(withAppendedPath, (String[]) list.toArray(new String[list.size()]), null, null, null);
        try {
            Map<String, d> j2 = j(query);
            ContentResolver contentResolver2 = this.a;
            Uri uri = ContactsContract.Data.CONTENT_URI;
            List<String> list2 = c;
            Cursor query2 = contentResolver2.query(uri, (String[]) list2.toArray(new String[list2.size()]), Q, new String[]{ad, V, q, z, N, n, s, G, v}, null);
            try {
                Map<String, d> j3 = j(query2);
                WritableArray createArray = Arguments.createArray();
                for (d dVar : j2.values()) {
                    createArray.pushMap(dVar.u());
                }
                for (d dVar2 : j3.values()) {
                    createArray.pushMap(dVar2.u());
                }
                return createArray;
            } finally {
                if (query2 != null) {
                    query2.close();
                }
            }
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public WritableArray e(String str) {
        ContentResolver contentResolver = this.a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = c;
        StringBuilder sb = new StringBuilder();
        String r5 = C0201.m82(7634);
        sb.append(r5);
        sb.append(str);
        sb.append(r5);
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), C0201.m82(7635), new String[]{sb.toString()}, null);
        try {
            Map<String, d> j2 = j(query);
            WritableArray createArray = Arguments.createArray();
            for (d dVar : j2.values()) {
                createArray.pushMap(dVar.u());
            }
            return createArray;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public WritableArray f(String str) {
        ContentResolver contentResolver = this.a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = c;
        StringBuilder sb = new StringBuilder();
        String r5 = C0201.m82(7636);
        sb.append(r5);
        sb.append(str);
        sb.append(r5);
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), C0201.m82(7637), new String[]{sb.toString(), r5 + str + r5}, null);
        try {
            Map<String, d> j2 = j(query);
            WritableArray createArray = Arguments.createArray();
            for (d dVar : j2.values()) {
                createArray.pushMap(dVar.u());
            }
            return createArray;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public Integer g() {
        return Integer.valueOf(this.a.query(ContactsContract.Contacts.CONTENT_URI, null, null, null, null).getCount());
    }

    public WritableArray h(String str) {
        ContentResolver contentResolver = this.a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = c;
        StringBuilder sb = new StringBuilder();
        String r5 = C0201.m82(7638);
        sb.append(r5);
        sb.append(str);
        sb.append(r5);
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), C0201.m82(7639), new String[]{sb.toString(), r5 + str + r5}, null);
        try {
            Map<String, d> j2 = j(query);
            WritableArray createArray = Arguments.createArray();
            for (d dVar : j2.values()) {
                createArray.pushMap(dVar.u());
            }
            return createArray;
        } finally {
            if (query != null) {
                query.close();
            }
        }
    }

    public String i(String str) {
        ContentResolver contentResolver = this.a;
        Uri uri = ContactsContract.Data.CONTENT_URI;
        List<String> list = d;
        Cursor query = contentResolver.query(uri, (String[]) list.toArray(new String[list.size()]), C0201.m82(7640), new String[]{str}, null);
        if (query != null) {
            try {
                if (query.moveToNext()) {
                    String string = query.getString(query.getColumnIndex(C0201.m82(7641)));
                    if (!TextUtils.isEmpty(string)) {
                        return string;
                    }
                }
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }
        if (query == null) {
            return null;
        }
        query.close();
        return null;
    }

    /* access modifiers changed from: private */
    /* compiled from: ContactsProvider */
    public static class d {
        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;
        private List<b> m = new ArrayList();
        private List<b> n = new ArrayList();
        private boolean o = false;
        private String p;
        private List<b> q = new ArrayList();
        private List<b> r = new ArrayList();
        private List<c> s = new ArrayList();
        private C0125a t;

        /* compiled from: ContactsProvider */
        public static class b {
            public String a;
            public String b;
            public String c;

            public b(String str, String str2, String str3) {
                this.c = str3;
                this.a = str;
                this.b = str2;
            }
        }

        /* compiled from: ContactsProvider */
        public static class c {
            public final WritableMap a;

            public c(Cursor cursor) {
                WritableMap createMap = Arguments.createMap();
                this.a = createMap;
                createMap.putString(C0201.m82(22360), a(cursor));
                b(cursor, C0201.m82(22361), C0201.m82(22362));
                b(cursor, C0201.m82(22363), C0201.m82(22364));
                b(cursor, C0201.m82(22365), C0201.m82(22366));
                b(cursor, C0201.m82(22367), C0201.m82(22368));
                b(cursor, C0201.m82(22369), C0201.m82(22370));
                String r0 = C0201.m82(22371);
                String r1 = C0201.m82(22372);
                b(cursor, r0, r1);
                b(cursor, C0201.m82(22373), r1);
                b(cursor, C0201.m82(22374), C0201.m82(22375));
                b(cursor, C0201.m82(22376), C0201.m82(22377));
            }

            public static String a(Cursor cursor) {
                int i = cursor.getInt(cursor.getColumnIndex(C0201.m82(22378)));
                if (i == 0) {
                    String string = cursor.getString(cursor.getColumnIndex(C0201.m82(22382)));
                    return string != null ? string : C0201.m82(22383);
                } else if (i != 1) {
                    return i != 2 ? C0201.m82(22379) : C0201.m82(22380);
                } else {
                    return C0201.m82(22381);
                }
            }

            private void b(Cursor cursor, String str, String str2) {
                String string = cursor.getString(cursor.getColumnIndex(str2));
                if (!TextUtils.isEmpty(string)) {
                    this.a.putString(str, string);
                }
            }
        }

        public d(String str) {
            String r0 = C0201.m82(2220);
            this.d = r0;
            this.e = r0;
            this.f = r0;
            this.g = r0;
            this.h = r0;
            this.i = r0;
            this.j = r0;
            this.k = r0;
            this.l = r0;
            this.a = str;
        }

        public WritableMap u() {
            String r4;
            String r5;
            WritableMap createMap = Arguments.createMap();
            createMap.putString(C0201.m82(2221), this.a);
            createMap.putString(C0201.m82(2222), this.b);
            createMap.putString(C0201.m82(2223), TextUtils.isEmpty(this.d) ? this.c : this.d);
            createMap.putString(C0201.m82(2224), this.c);
            createMap.putString(C0201.m82(2225), this.e);
            createMap.putString(C0201.m82(2226), this.f);
            createMap.putString(C0201.m82(2227), this.g);
            createMap.putString(C0201.m82(2228), this.h);
            createMap.putString(C0201.m82(2229), this.i);
            createMap.putString(C0201.m82(2230), this.j);
            createMap.putString(C0201.m82(2231), this.k);
            createMap.putString(C0201.m82(2232), this.l);
            createMap.putBoolean(C0201.m82(2233), this.o);
            String str = this.p;
            if (str == null) {
                str = C0201.m82(2234);
            }
            createMap.putString(C0201.m82(2235), str);
            WritableArray createArray = Arguments.createArray();
            Iterator<b> it = this.r.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                r4 = C0201.m82(2236);
                r5 = C0201.m82(2237);
                if (!hasNext) {
                    break;
                }
                b next = it.next();
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString(C0201.m82(2238), next.b);
                createMap2.putString(r4, next.a);
                createMap2.putString(r5, next.c);
                createArray.pushMap(createMap2);
            }
            createMap.putArray(C0201.m82(2239), createArray);
            WritableArray createArray2 = Arguments.createArray();
            for (b bVar : this.m) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putString(C0201.m82(2240), bVar.b);
                createMap3.putString(r5, bVar.c);
                createArray2.pushMap(createMap3);
            }
            createMap.putArray(C0201.m82(2241), createArray2);
            WritableArray createArray3 = Arguments.createArray();
            for (b bVar2 : this.n) {
                WritableMap createMap4 = Arguments.createMap();
                createMap4.putString(C0201.m82(2242), bVar2.b);
                createMap4.putString(C0201.m82(2243), bVar2.a);
                createArray3.pushMap(createMap4);
            }
            createMap.putArray(C0201.m82(2244), createArray3);
            WritableArray createArray4 = Arguments.createArray();
            for (b bVar3 : this.q) {
                WritableMap createMap5 = Arguments.createMap();
                createMap5.putString(C0201.m82(2245), bVar3.b);
                createMap5.putString(r4, bVar3.a);
                createMap5.putString(r5, bVar3.c);
                createArray4.pushMap(createMap5);
            }
            createMap.putArray(C0201.m82(2246), createArray4);
            WritableArray createArray5 = Arguments.createArray();
            for (c cVar : this.s) {
                createArray5.pushMap(cVar.a);
            }
            createMap.putArray(C0201.m82(2247), createArray5);
            WritableMap createMap6 = Arguments.createMap();
            C0125a aVar = this.t;
            if (aVar != null) {
                int i2 = aVar.a;
                if (i2 > 0) {
                    createMap6.putInt(C0201.m82(2248), i2);
                }
                createMap6.putInt(C0201.m82(2249), this.t.b);
                createMap6.putInt(C0201.m82(2250), this.t.c);
                createMap.putMap(C0201.m82(2251), createMap6);
            }
            return createMap;
        }

        /* renamed from: com.rt2zz.reactnativecontacts.a$d$a  reason: collision with other inner class name */
        /* compiled from: ContactsProvider */
        public static class C0125a {
            public int a = 0;
            public int b = 0;
            public int c = 0;

            public C0125a(int i, int i2, int i3) {
                this.a = i;
                this.b = i2;
                this.c = i3;
            }

            public C0125a(int i, int i2) {
                this.b = i;
                this.c = i2;
            }
        }
    }
}
