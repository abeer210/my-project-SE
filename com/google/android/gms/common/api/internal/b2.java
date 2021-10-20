package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class b2 implements ss1<Boolean, Void> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [zs1] */
    @Override // defpackage.ss1
    public final /* synthetic */ Void a(zs1<Boolean> zs1) throws Exception {
        if (zs1.l().booleanValue()) {
            return null;
        }
        throw new b(new Status(13, C0201.m82(16984)));
    }
}
