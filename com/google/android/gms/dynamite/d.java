package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class d implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.AbstractC0060b bVar) throws DynamiteModule.a {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int a = bVar.a(context, str);
        aVar.a = a;
        if (a != 0) {
            aVar.b = bVar.b(context, str, false);
        } else {
            aVar.b = bVar.b(context, str, true);
        }
        if (aVar.a == 0 && aVar.b == 0) {
            aVar.c = 0;
        } else if (aVar.a >= aVar.b) {
            aVar.c = -1;
        } else {
            aVar.c = 1;
        }
        return aVar;
    }
}
