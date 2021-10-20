package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import defpackage.vt2;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: qp2  reason: default package */
/* compiled from: SecurePreferences */
public class qp2 implements SharedPreferences {
    private static boolean d;
    private static final String e = qp2.class.getName();
    private SharedPreferences a;
    private vt2.c b;
    private String c;

    /* renamed from: qp2$b */
    /* compiled from: SecurePreferences */
    public class b implements SharedPreferences.Editor {
        private SharedPreferences.Editor a;

        @TargetApi(9)
        public void apply() {
            if (Build.VERSION.SDK_INT >= 9) {
                this.a.apply();
            } else {
                commit();
            }
        }

        public SharedPreferences.Editor clear() {
            this.a.clear();
            return this;
        }

        public boolean commit() {
            return this.a.commit();
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            this.a.putString(qp2.i(str), qp2.this.e(Boolean.toString(z)));
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f) {
            this.a.putString(qp2.i(str), qp2.this.e(Float.toString(f)));
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i) {
            this.a.putString(qp2.i(str), qp2.this.e(Integer.toString(i)));
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j) {
            this.a.putString(qp2.i(str), qp2.this.e(Long.toString(j)));
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            this.a.putString(qp2.i(str), qp2.this.e(str2));
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @TargetApi(11)
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            HashSet hashSet = new HashSet(set.size());
            for (String str2 : set) {
                hashSet.add(qp2.this.e(str2));
            }
            this.a.putStringSet(qp2.i(str), hashSet);
            return this;
        }

        public SharedPreferences.Editor remove(String str) {
            this.a.remove(qp2.i(str));
            return this;
        }

        private b() {
            this.a = qp2.this.a.edit();
        }
    }

    static {
        C0201.m83(qp2.class, 642);
    }

    public qp2(Context context, String str, String str2) {
        this(context, null, str, str2);
    }

    private String c(String str) {
        String r0 = C0201.m82(4004);
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return vt2.d(new vt2.a(str), this.b);
        } catch (GeneralSecurityException e2) {
            if (!d) {
                return null;
            }
            Log.w(e, r0, e2);
            return null;
        } catch (UnsupportedEncodingException e3) {
            if (!d) {
                return null;
            }
            Log.w(e, r0, e3);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String e(String str) {
        String r0 = C0201.m82(4005);
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return vt2.f(str, this.b).toString();
        } catch (GeneralSecurityException e2) {
            if (d) {
                Log.w(e, r0, e2);
            }
            return null;
        } catch (UnsupportedEncodingException e3) {
            if (d) {
                Log.w(e, r0, e3);
            }
            return null;
        }
    }

    private static String f(Context context) throws GeneralSecurityException {
        vt2.c l = vt2.l(context.getPackageName(), g(context).getBytes());
        if (l != null) {
            return i(l.toString());
        }
        throw new GeneralSecurityException(C0201.m82(4006));
    }

    private static String g(Context context) {
        String r0 = C0201.m82(4007);
        try {
            String str = (String) Build.class.getField(C0201.m82(4008)).get(null);
            return TextUtils.isEmpty(str) ? Settings.Secure.getString(context.getContentResolver(), r0) : str;
        } catch (Exception unused) {
            return Settings.Secure.getString(context.getContentResolver(), r0);
        }
    }

    private SharedPreferences h(Context context, String str) {
        this.c = this.c;
        if (TextUtils.isEmpty(str)) {
            return PreferenceManager.getDefaultSharedPreferences(context);
        }
        return context.getSharedPreferences(str, 0);
    }

    public static String i(String str) {
        String r0 = C0201.m82(4009);
        try {
            MessageDigest instance = MessageDigest.getInstance(C0201.m82(4010));
            byte[] bytes = str.getBytes(C0201.m82(4011));
            instance.update(bytes, 0, bytes.length);
            return Base64.encodeToString(instance.digest(), 2);
        } catch (NoSuchAlgorithmException e2) {
            if (!d) {
                return null;
            }
            Log.w(e, r0, e2);
            return null;
        } catch (UnsupportedEncodingException e3) {
            if (!d) {
                return null;
            }
            Log.w(e, r0, e3);
            return null;
        }
    }

    public boolean contains(String str) {
        return this.a.contains(i(str));
    }

    /* renamed from: d */
    public b edit() {
        return new b();
    }

    @Override // android.content.SharedPreferences
    public Map<String, String> getAll() {
        Map<String, ?> all = this.a.getAll();
        HashMap hashMap = new HashMap(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            try {
                Object value = entry.getValue();
                if (value != null && !value.equals(this.b.toString())) {
                    hashMap.put(entry.getKey(), c(value.toString()));
                }
            } catch (Exception e2) {
                if (d) {
                    Log.w(e, C0201.m82(4012), e2);
                }
                hashMap.put(entry.getKey(), entry.getValue().toString());
            }
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        String string = this.a.getString(i(str), null);
        if (string == null) {
            return z;
        }
        try {
            return Boolean.parseBoolean(c(string));
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    public float getFloat(String str, float f) {
        String string = this.a.getString(i(str), null);
        if (string == null) {
            return f;
        }
        try {
            return Float.parseFloat(c(string));
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    public int getInt(String str, int i) {
        String string = this.a.getString(i(str), null);
        if (string == null) {
            return i;
        }
        try {
            return Integer.parseInt(c(string));
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    public long getLong(String str, long j) {
        String string = this.a.getString(i(str), null);
        if (string == null) {
            return j;
        }
        try {
            return Long.parseLong(c(string));
        } catch (NumberFormatException e2) {
            throw new ClassCastException(e2.getMessage());
        }
    }

    public String getString(String str, String str2) {
        String string = this.a.getString(i(str), null);
        return string != null ? c(string) : str2;
    }

    @Override // android.content.SharedPreferences
    @TargetApi(11)
    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> stringSet = this.a.getStringSet(i(str), null);
        if (stringSet == null) {
            return set;
        }
        HashSet hashSet = new HashSet(stringSet.size());
        for (String str2 : stringSet) {
            hashSet.add(c(str2));
        }
        return hashSet;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    private qp2(Context context, vt2.c cVar, String str, String str2) {
        if (this.a == null) {
            this.a = h(context, str2);
        }
        if (cVar != null) {
            this.b = cVar;
        } else if (TextUtils.isEmpty(str)) {
            try {
                String f = f(context);
                String string = this.a.getString(f, null);
                if (string == null) {
                    this.b = vt2.k();
                    if (!this.a.edit().putString(f, this.b.toString()).commit()) {
                        Log.w(e, C0201.m82(3999));
                    }
                } else {
                    this.b = vt2.o(string);
                }
                if (this.b == null) {
                    throw new GeneralSecurityException(C0201.m82(4000));
                }
            } catch (GeneralSecurityException e2) {
                if (d) {
                    String str3 = e;
                    Log.e(str3, C0201.m82(4001) + e2.getMessage());
                }
                throw new IllegalStateException(e2);
            }
        } else {
            try {
                vt2.c l = vt2.l(str, g(context).getBytes());
                this.b = l;
                if (l == null) {
                    throw new GeneralSecurityException(C0201.m82(4002));
                }
            } catch (GeneralSecurityException e3) {
                if (d) {
                    String str4 = e;
                    Log.e(str4, C0201.m82(4003) + e3.getMessage());
                }
                throw new IllegalStateException(e3);
            }
        }
    }
}
