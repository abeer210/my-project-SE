package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class LifecycleCallback {
    public final j a;

    public LifecycleCallback(j jVar) {
        this.a = jVar;
    }

    public static j c(Activity activity) {
        return d(new i(activity));
    }

    public static j d(i iVar) {
        if (iVar.c()) {
            return i3.u(iVar.b());
        }
        if (iVar.d()) {
            return f3.b(iVar.a());
        }
        throw new IllegalArgumentException(C0201.m82(4924));
    }

    @Keep
    private static j getChimeraLifecycleFragmentImpl(i iVar) {
        throw new IllegalStateException(C0201.m82(4925));
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity b() {
        return this.a.h();
    }

    public void e(int i, int i2, Intent intent) {
    }

    public void f(Bundle bundle) {
    }

    public void g() {
    }

    public void h() {
    }

    public void i(Bundle bundle) {
    }

    public void j() {
    }

    public void k() {
    }
}
