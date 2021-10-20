package com.google.firebase.messaging;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;

public final class c extends ip0 {
    public static final Parcelable.Creator<c> CREATOR = new k();
    public Bundle a;
    private Map<String, String> b;
    private b c;

    public static class a {
        private final Bundle a = new Bundle();
        private final Map<String, String> b = new r0();

        public a(String str) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? "Invalid to: ".concat(valueOf) : new String("Invalid to: "));
            } else {
                this.a.putString("google.to", str);
            }
        }

        public a a(String str, String str2) {
            this.b.put(str, str2);
            return this;
        }

        public c b() {
            Bundle bundle = new Bundle();
            for (Map.Entry<String, String> entry : this.b.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
            bundle.putAll(this.a);
            this.a.remove("from");
            return new c(bundle);
        }

        public a c(String str) {
            this.a.putString("collapse_key", str);
            return this;
        }

        public a d(String str) {
            this.a.putString("google.message_id", str);
            return this;
        }

        public a e(String str) {
            this.a.putString("message_type", str);
            return this;
        }

        public a f(int i) {
            this.a.putString("google.ttl", String.valueOf(i));
            return this;
        }
    }

    public static class b {
        private final String a;
        private final String b;
        private final String[] c;
        private final String d;
        private final String e;
        private final String[] f;
        private final String g;
        private final String h;
        private final String i;
        private final String j;
        private final String k;
        private final String l;
        private final String m;
        private final Uri n;

        private b(Bundle bundle) {
            this.a = f.b(bundle, "gcm.n.title");
            this.b = f.i(bundle, "gcm.n.title");
            this.c = n(bundle, "gcm.n.title");
            this.d = f.b(bundle, "gcm.n.body");
            this.e = f.i(bundle, "gcm.n.body");
            this.f = n(bundle, "gcm.n.body");
            this.g = f.b(bundle, "gcm.n.icon");
            this.i = f.n(bundle);
            this.j = f.b(bundle, "gcm.n.tag");
            this.k = f.b(bundle, "gcm.n.color");
            this.l = f.b(bundle, "gcm.n.click_action");
            this.m = f.b(bundle, "gcm.n.android_channel_id");
            this.n = f.o(bundle);
            this.h = f.b(bundle, "gcm.n.image");
        }

        private static String[] n(Bundle bundle, String str) {
            Object[] f2 = f.f(bundle, str);
            if (f2 == null) {
                return null;
            }
            String[] strArr = new String[f2.length];
            for (int i2 = 0; i2 < f2.length; i2++) {
                strArr[i2] = String.valueOf(f2[i2]);
            }
            return strArr;
        }

        public String a() {
            return this.d;
        }

        public String[] b() {
            return this.f;
        }

        public String c() {
            return this.e;
        }

        public String d() {
            return this.m;
        }

        public String e() {
            return this.l;
        }

        public String f() {
            return this.k;
        }

        public String g() {
            return this.g;
        }

        public Uri h() {
            String str = this.h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public String i() {
            return this.i;
        }

        public String j() {
            return this.j;
        }

        public String k() {
            return this.a;
        }

        public String[] l() {
            return this.c;
        }

        public String m() {
            return this.b;
        }
    }

    public c(Bundle bundle) {
        this.a = bundle;
    }

    public final int A() {
        Object obj = this.a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
            sb.append("Invalid TTL: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    public final String o() {
        return this.a.getString("collapse_key");
    }

    public final Map<String, String> p() {
        if (this.b == null) {
            Bundle bundle = this.a;
            r0 r0Var = new r0();
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        r0Var.put(str, str2);
                    }
                }
            }
            this.b = r0Var;
        }
        return this.b;
    }

    public final String r() {
        return this.a.getString("from");
    }

    public final String s() {
        String string = this.a.getString("google.message_id");
        return string == null ? this.a.getString("message_id") : string;
    }

    public final String u() {
        return this.a.getString("message_type");
    }

    public final b w() {
        if (this.c == null && f.m(this.a)) {
            this.c = new b(this.a);
        }
        return this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.e(parcel, 2, this.a, false);
        kp0.b(parcel, a2);
    }

    public final long y() {
        Object obj = this.a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
            sb.append("Invalid sent time: ");
            sb.append(valueOf);
            Log.w("FirebaseMessaging", sb.toString());
            return 0;
        }
    }

    public final String z() {
        return this.a.getString("google.to");
    }
}
