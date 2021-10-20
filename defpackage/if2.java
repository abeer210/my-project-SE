package defpackage;

import org.json.JSONObject;
import vigqyno.C0201;

/* renamed from: if2  reason: default package */
/* compiled from: StatusBarOptions */
public class if2 {
    public uf2 a = new ag2();
    public a b = a.None;
    public sf2 c = new zf2();
    public sf2 d = new zf2();
    public sf2 e = new zf2();

    /* renamed from: if2$a */
    /* compiled from: StatusBarOptions */
    public enum a {
        Light("light"),
        Dark("dark"),
        None("none");
        
        private String a;

        private a(String str) {
            this.a = str;
        }

        public static a b(String str) {
            a aVar = None;
            if (str == null) {
                return aVar;
            }
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3075958) {
                if (hashCode == 102970646 && str.equals("light")) {
                    c = 0;
                }
            } else if (str.equals("dark")) {
                c = 1;
            }
            if (c == 0) {
                return Light;
            }
            if (c != 1) {
                return aVar;
            }
            return Dark;
        }

        public boolean d() {
            return !this.a.equals(None.a);
        }
    }

    public static if2 e(JSONObject jSONObject) {
        if2 if2 = new if2();
        if (jSONObject == null) {
            return if2;
        }
        if2.a = mg2.a(jSONObject, C0201.m82(37394));
        if2.b = a.b(jSONObject.optString(C0201.m82(37395)));
        if2.c = lg2.a(jSONObject, C0201.m82(37396));
        if2.d = lg2.a(jSONObject, C0201.m82(37397));
        if2.e = lg2.a(jSONObject, C0201.m82(37398));
        return if2;
    }

    public boolean a() {
        return this.e.i() || this.c.g() || this.a.g();
    }

    public boolean b() {
        return this.d.i() || this.c.g();
    }

    public void c(if2 if2) {
        if (if2.a.f()) {
            this.a = if2.a;
        }
        if (if2.b.d()) {
            this.b = if2.b;
        }
        if (if2.c.f()) {
            this.c = if2.c;
        }
        if (if2.d.f()) {
            this.d = if2.d;
        }
        if (if2.e.f()) {
            this.e = if2.e;
        }
    }

    public void d(if2 if2) {
        if (!this.a.f()) {
            this.a = if2.a;
        }
        if (!this.b.d()) {
            this.b = if2.b;
        }
        if (!this.c.f()) {
            this.c = if2.c;
        }
        if (!this.d.f()) {
            this.d = if2.d;
        }
        if (!this.e.f()) {
            this.e = if2.e;
        }
    }
}
