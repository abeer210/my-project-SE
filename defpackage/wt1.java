package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0188;

/* renamed from: wt1  reason: default package */
public class wt1 extends ip0 {
    public static final Parcelable.Creator<wt1> CREATOR = new zt1();
    public int a;
    public String b;
    public String c;
    public int d;
    public Point[] e;
    public f f;
    public i g;
    public j h;
    public l i;
    public k j;
    public g k;
    public c l;
    public d m;
    public e n;

    /* renamed from: wt1$a */
    public static class a extends ip0 {
        public static final Parcelable.Creator<a> CREATOR = new yt1();
        public int a;
        public String[] b;

        public a() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = kp0.a(parcel);
            kp0.n(parcel, 2, this.a);
            kp0.v(parcel, 3, this.b, false);
            kp0.b(parcel, a2);
        }

        public a(int i, String[] strArr) {
            this.a = i;
            this.b = strArr;
        }
    }

    /* renamed from: wt1$b */
    public static class b extends ip0 {
        public static final Parcelable.Creator<b> CREATOR = new bu1();
        public int a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public boolean g;
        public String h;

        public b() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = kp0.a(parcel);
            kp0.n(parcel, 2, this.a);
            kp0.n(parcel, 3, this.b);
            kp0.n(parcel, 4, this.c);
            kp0.n(parcel, 5, this.d);
            kp0.n(parcel, 6, this.e);
            kp0.n(parcel, 7, this.f);
            kp0.c(parcel, 8, this.g);
            kp0.u(parcel, 9, this.h, false);
            kp0.b(parcel, a2);
        }

        public b(int i, int i2, int i3, int i4, int i5, int i6, boolean z, String str) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = z;
            this.h = str;
        }
    }

    /* renamed from: wt1$c */
    public static class c extends ip0 {
        public static final Parcelable.Creator<c> CREATOR = new cu1();
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public b f;
        public b g;

        public c() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = kp0.a(parcel);
            kp0.u(parcel, 2, this.a, false);
            kp0.u(parcel, 3, this.b, false);
            kp0.u(parcel, 4, this.c, false);
            kp0.u(parcel, 5, this.d, false);
            kp0.u(parcel, 6, this.e, false);
            kp0.s(parcel, 7, this.f, i, false);
            kp0.s(parcel, 8, this.g, i, false);
            kp0.b(parcel, a2);
        }

        public c(String str, String str2, String str3, String str4, String str5, b bVar, b bVar2) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = bVar;
            this.g = bVar2;
        }
    }

    /* renamed from: wt1$d */
    public static class d extends ip0 {
        public static final Parcelable.Creator<d> CREATOR = new du1();
        public h a;
        public String b;
        public String c;
        public i[] d;
        public f[] e;
        public String[] f;
        public a[] g;

        public d() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = kp0.a(parcel);
            kp0.s(parcel, 2, this.a, i, false);
            kp0.u(parcel, 3, this.b, false);
            kp0.u(parcel, 4, this.c, false);
            kp0.x(parcel, 5, this.d, i, false);
            kp0.x(parcel, 6, this.e, i, false);
            kp0.v(parcel, 7, this.f, false);
            kp0.x(parcel, 8, this.g, i, false);
            kp0.b(parcel, a2);
        }

        public d(h hVar, String str, String str2, i[] iVarArr, f[] fVarArr, String[] strArr, a[] aVarArr) {
            this.a = hVar;
            this.b = str;
            this.c = str2;
            this.d = iVarArr;
            this.e = fVarArr;
            this.f = strArr;
            this.g = aVarArr;
        }
    }

    /* renamed from: wt1$e */
    public static class e extends ip0 {
        public static final Parcelable.Creator<e> CREATOR = new eu1();
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;
        public String m;
        public String n;

        public e() {
        }

        public void writeToParcel(Parcel parcel, int i2) {
            int a2 = kp0.a(parcel);
            kp0.u(parcel, 2, this.a, false);
            kp0.u(parcel, 3, this.b, false);
            kp0.u(parcel, 4, this.c, false);
            kp0.u(parcel, 5, this.d, false);
            kp0.u(parcel, 6, this.e, false);
            kp0.u(parcel, 7, this.f, false);
            kp0.u(parcel, 8, this.g, false);
            kp0.u(parcel, 9, this.h, false);
            kp0.u(parcel, 10, this.i, false);
            kp0.u(parcel, 11, this.j, false);
            kp0.u(parcel, 12, this.k, false);
            kp0.u(parcel, 13, this.l, false);
            kp0.u(parcel, 14, this.m, false);
            kp0.u(parcel, 15, this.n, false);
            kp0.b(parcel, a2);
        }

        public e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
            this.j = str10;
            this.k = str11;
            this.l = str12;
            this.m = str13;
            this.n = str14;
        }
    }

    /* renamed from: wt1$f */
    public static class f extends ip0 {
        public static final Parcelable.Creator<f> CREATOR = new fu1();
        public int a;
        public String b;
        public String c;
        public String d;

        public f() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = kp0.a(parcel);
            kp0.n(parcel, 2, this.a);
            kp0.u(parcel, 3, this.b, false);
            kp0.u(parcel, 4, this.c, false);
            kp0.u(parcel, 5, this.d, false);
            kp0.b(parcel, a2);
        }

        public f(int i, String str, String str2, String str3) {
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }
    }

    /* renamed from: wt1$g */
    public static class g extends ip0 {
        public static final Parcelable.Creator<g> CREATOR = new gu1();
        public double a;
        public double b;

        public g() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = kp0.a(parcel);
            kp0.i(parcel, 2, this.a);
            kp0.i(parcel, 3, this.b);
            kp0.b(parcel, a2);
        }

        public g(double d, double d2) {
            this.a = d;
            this.b = d2;
        }
    }

    /* renamed from: wt1$h */
    public static class h extends ip0 {
        public static final Parcelable.Creator<h> CREATOR = new hu1();
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        public h() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = kp0.a(parcel);
            kp0.u(parcel, 2, this.a, false);
            kp0.u(parcel, 3, this.b, false);
            kp0.u(parcel, 4, this.c, false);
            kp0.u(parcel, 5, this.d, false);
            kp0.u(parcel, 6, this.e, false);
            kp0.u(parcel, 7, this.f, false);
            kp0.u(parcel, 8, this.g, false);
            kp0.b(parcel, a2);
        }

        public h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
        }
    }

    /* renamed from: wt1$i */
    public static class i extends ip0 {
        public static final Parcelable.Creator<i> CREATOR = new iu1();
        public int a;
        public String b;

        public i() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = kp0.a(parcel);
            kp0.n(parcel, 2, this.a);
            kp0.u(parcel, 3, this.b, false);
            kp0.b(parcel, a2);
        }

        public i(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    /* renamed from: wt1$j */
    public static class j extends ip0 {
        public static final Parcelable.Creator<j> CREATOR = new ju1();
        public String a;
        public String b;

        public j() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = kp0.a(parcel);
            kp0.u(parcel, 2, this.a, false);
            kp0.u(parcel, 3, this.b, false);
            kp0.b(parcel, a2);
        }

        public j(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* renamed from: wt1$k */
    public static class k extends ip0 {
        public static final Parcelable.Creator<k> CREATOR = new ku1();
        public String a;
        public String b;

        public k() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = kp0.a(parcel);
            kp0.u(parcel, 2, this.a, false);
            kp0.u(parcel, 3, this.b, false);
            kp0.b(parcel, a2);
        }

        public k(String str, String str2) {
            this.a = str;
            this.b = str2;
        }
    }

    /* renamed from: wt1$l */
    public static class l extends ip0 {
        public static final Parcelable.Creator<l> CREATOR = new lu1();
        public String a;
        public String b;
        public int c;

        public l() {
        }

        public void writeToParcel(Parcel parcel, int i) {
            int a2 = kp0.a(parcel);
            kp0.u(parcel, 2, this.a, false);
            kp0.u(parcel, 3, this.b, false);
            kp0.n(parcel, 4, this.c);
            kp0.b(parcel, a2);
        }

        public l(String str, String str2, int i) {
            this.a = str;
            this.b = str2;
            this.c = i;
        }
    }

    public wt1() {
    }

    public Rect o() {
        int i2 = C0188.f23;
        int i3 = C0188.f23;
        int i4 = C0188.f24;
        int i5 = C0188.f24;
        int i6 = 0;
        while (true) {
            Point[] pointArr = this.e;
            if (i6 >= pointArr.length) {
                return new Rect(i4, i5, i2, i3);
            }
            Point point = pointArr[i6];
            i4 = Math.min(i4, point.x);
            i2 = Math.max(i2, point.x);
            i5 = Math.min(i5, point.y);
            i3 = Math.max(i3, point.y);
            i6++;
        }
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 2, this.a);
        kp0.u(parcel, 3, this.b, false);
        kp0.u(parcel, 4, this.c, false);
        kp0.n(parcel, 5, this.d);
        kp0.x(parcel, 6, this.e, i2, false);
        kp0.s(parcel, 7, this.f, i2, false);
        kp0.s(parcel, 8, this.g, i2, false);
        kp0.s(parcel, 9, this.h, i2, false);
        kp0.s(parcel, 10, this.i, i2, false);
        kp0.s(parcel, 11, this.j, i2, false);
        kp0.s(parcel, 12, this.k, i2, false);
        kp0.s(parcel, 13, this.l, i2, false);
        kp0.s(parcel, 14, this.m, i2, false);
        kp0.s(parcel, 15, this.n, i2, false);
        kp0.b(parcel, a2);
    }

    public wt1(int i2, String str, String str2, int i3, Point[] pointArr, f fVar, i iVar, j jVar, l lVar, k kVar, g gVar, c cVar, d dVar, e eVar) {
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = i3;
        this.e = pointArr;
        this.f = fVar;
        this.g = iVar;
        this.h = jVar;
        this.i = lVar;
        this.j = kVar;
        this.k = gVar;
        this.l = cVar;
        this.m = dVar;
        this.n = eVar;
    }
}
