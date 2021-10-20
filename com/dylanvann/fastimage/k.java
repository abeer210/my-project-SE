package com.dylanvann.fastimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.c;

/* compiled from: GlideRequests */
public class k extends com.bumptech.glide.k {
    public k(c cVar, cn cnVar, hn hnVar, Context context) {
        super(cVar, cnVar, hnVar, context);
    }

    /* renamed from: A */
    public j<Bitmap> j() {
        return (j) super.j();
    }

    /* renamed from: B */
    public j<Drawable> k() {
        return (j) super.k();
    }

    /* renamed from: C */
    public j<Drawable> q(Object obj) {
        return (j) super.q(obj);
    }

    @Override // com.bumptech.glide.k
    public void v(ao aoVar) {
        if (aoVar instanceof i) {
            super.v(aoVar);
        } else {
            super.v(new i().a(aoVar));
        }
    }

    /* renamed from: z */
    public <ResourceType> j<ResourceType> i(Class<ResourceType> cls) {
        return new j<>(this.a, this, cls, this.b);
    }
}
