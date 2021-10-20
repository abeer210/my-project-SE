package com.dylanvann.fastimage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import vigqyno.C0201;

/* compiled from: FastImageSource */
public class e extends nl0 {
    private tj e;
    private Uri f;

    public e(Context context, String str, tj tjVar) {
        this(context, str, 0.0d, 0.0d, tjVar);
    }

    public static boolean k(Uri uri) {
        return C0201.m82(19358).equals(uri.getScheme());
    }

    public static boolean m(Uri uri) {
        return C0201.m82(19359).equals(uri.getScheme());
    }

    public static boolean o(Uri uri) {
        return C0201.m82(19360).equals(uri.getScheme());
    }

    public static boolean p(Uri uri) {
        return C0201.m82(19361).equals(uri.getScheme());
    }

    public static boolean q(Uri uri) {
        return C0201.m82(19362).equals(uri.getScheme());
    }

    @Override // defpackage.nl0
    public Uri e() {
        return this.f;
    }

    @Override // defpackage.nl0
    public boolean f() {
        Uri uri = this.f;
        return uri != null && q(uri);
    }

    public sj g() {
        return new sj(e().toString(), h());
    }

    public tj h() {
        return this.e;
    }

    public Object i() {
        if (l()) {
            return d();
        }
        if (j()) {
            return d();
        }
        if (f()) {
            return e();
        }
        if (n()) {
            return e().toString();
        }
        return g();
    }

    public boolean j() {
        Uri uri = this.f;
        return uri != null && k(uri);
    }

    public boolean l() {
        Uri uri = this.f;
        return uri != null && m(uri);
    }

    public boolean n() {
        Uri uri = this.f;
        return uri != null && o(uri);
    }

    public e(Context context, String str, double d, double d2, tj tjVar) {
        super(context, str, d, d2);
        this.e = tjVar == null ? tj.a : tjVar;
        this.f = super.e();
        if (f() && TextUtils.isEmpty(this.f.toString())) {
            throw new Resources.NotFoundException(C0201.m82(19353) + d() + C0201.m82(19354));
        } else if (p(this.f)) {
            String uri = this.f.toString();
            this.f = Uri.parse(uri.replace(C0201.m82(19357), C0201.m82(19355) + context.getPackageName() + C0201.m82(19356)));
        }
    }
}
