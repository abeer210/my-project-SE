package defpackage;

import vigqyno.C0201;

/* renamed from: mc  reason: default package */
/* compiled from: Marker */
public class mc {
    private static String d;
    private final String a;
    public final float b;
    public final float c;

    static {
        C0201.m83(mc.class, 610);
    }

    public mc(String str, float f, float f2) {
        this.a = str;
        this.c = f2;
        this.b = f;
    }

    public boolean a(String str) {
        if (this.a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.a.endsWith(d)) {
            String str2 = this.a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
