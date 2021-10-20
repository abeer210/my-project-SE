package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import vigqyno.C0201;

/* compiled from: UCrop */
public class i {
    private Intent a = new Intent();
    private Bundle b;

    /* compiled from: UCrop */
    public static class a {
        private final Bundle a = new Bundle();

        public Bundle a() {
            return this.a;
        }

        public void b(int i) {
            this.a.putInt(C0201.m82(37647), i);
        }

        public void c(int i, int i2, int i3) {
            this.a.putIntArray(C0201.m82(37648), new int[]{i, i2, i3});
        }

        public void d(boolean z) {
            this.a.putBoolean(C0201.m82(37649), z);
        }

        public void e(Bitmap.CompressFormat compressFormat) {
            this.a.putString(C0201.m82(37650), compressFormat.name());
        }

        public void f(int i) {
            this.a.putInt(C0201.m82(37651), i);
        }

        public void g(boolean z) {
            this.a.putBoolean(C0201.m82(37652), z);
        }

        public void h(boolean z) {
            this.a.putBoolean(C0201.m82(37653), z);
        }

        public void i(boolean z) {
            this.a.putBoolean(C0201.m82(37654), z);
        }

        public void j(boolean z) {
            this.a.putBoolean(C0201.m82(37655), z);
        }

        public void k(int i) {
            this.a.putInt(C0201.m82(37656), i);
        }

        public void l(int i) {
            this.a.putInt(C0201.m82(37657), i);
        }

        public void m(String str) {
            this.a.putString(C0201.m82(37658), str);
        }

        public void n(int i) {
            this.a.putInt(C0201.m82(37659), i);
        }
    }

    private i(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.b = bundle;
        bundle.putParcelable(C0201.m82(27504), uri);
        this.b.putParcelable(C0201.m82(27505), uri2);
    }

    public static Uri b(Intent intent) {
        return (Uri) intent.getParcelableExtra(C0201.m82(27506));
    }

    public static i c(Uri uri, Uri uri2) {
        return new i(uri, uri2);
    }

    public Intent a(Context context) {
        this.a.setClass(context, UCropActivity.class);
        this.a.putExtras(this.b);
        return this.a;
    }

    public void d(Activity activity) {
        e(activity, 69);
    }

    public void e(Activity activity, int i) {
        activity.startActivityForResult(a(activity), i);
    }

    public i f(float f, float f2) {
        this.b.putFloat(C0201.m82(27507), f);
        this.b.putFloat(C0201.m82(27508), f2);
        return this;
    }

    public i g(a aVar) {
        this.b.putAll(aVar.a());
        return this;
    }
}
