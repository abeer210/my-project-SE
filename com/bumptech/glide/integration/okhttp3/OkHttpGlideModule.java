package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.i;
import com.bumptech.glide.integration.okhttp3.c;
import java.io.InputStream;

@Deprecated
public class OkHttpGlideModule implements mn {
    @Override // defpackage.mn
    public void a(Context context, d dVar) {
    }

    @Override // defpackage.mn
    public void b(Context context, c cVar, i iVar) {
        iVar.r(sj.class, InputStream.class, new c.a());
    }
}
