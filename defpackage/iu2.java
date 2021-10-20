package defpackage;

import android.graphics.Bitmap;

/* renamed from: iu2  reason: default package */
/* compiled from: CropParameters */
public class iu2 {
    private int a;
    private int b;
    private Bitmap.CompressFormat c;
    private int d;
    private String e;
    private String f;
    private ju2 g;

    public iu2(int i, int i2, Bitmap.CompressFormat compressFormat, int i3, String str, String str2, ju2 ju2) {
        this.a = i;
        this.b = i2;
        this.c = compressFormat;
        this.d = i3;
        this.e = str;
        this.f = str2;
        this.g = ju2;
    }

    public Bitmap.CompressFormat a() {
        return this.c;
    }

    public int b() {
        return this.d;
    }

    public ju2 c() {
        return this.g;
    }

    public String d() {
        return this.e;
    }

    public String e() {
        return this.f;
    }

    public int f() {
        return this.a;
    }

    public int g() {
        return this.b;
    }
}
