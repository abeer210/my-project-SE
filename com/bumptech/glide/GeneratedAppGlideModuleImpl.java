package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.integration.okhttp3.a;
import com.dylanvann.fastimage.FastImageGlideModule;
import com.dylanvann.fastimage.b;
import java.util.Collections;
import java.util.Set;
import vigqyno.C0201;

public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final FastImageGlideModule a = new FastImageGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        String r2 = C0201.m82(38937);
        if (Log.isLoggable(r2, 3)) {
            Log.d(r2, C0201.m82(38938));
            Log.d(r2, C0201.m82(38939));
            Log.d(r2, C0201.m82(38940));
        }
    }

    @Override // defpackage.nn
    public void a(Context context, c cVar, i iVar) {
        new a().a(context, cVar, iVar);
        new b().a(context, cVar, iVar);
        this.a.a(context, cVar, iVar);
    }

    @Override // defpackage.ln
    public void b(Context context, d dVar) {
        this.a.b(context, dVar);
    }

    @Override // defpackage.ln
    public boolean c() {
        return this.a.c();
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public Set<Class<?>> d() {
        return Collections.emptySet();
    }

    /* renamed from: f */
    public a e() {
        return new a();
    }
}
