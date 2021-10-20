package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class c implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.a a(Context context, String str, DynamiteModule.b.AbstractC0060b bVar) throws DynamiteModule.a {
        DynamiteModule.b.a aVar = new DynamiteModule.b.a();
        int b = bVar.b(context, str, true);
        aVar.b = b;
        if (b != 0) {
            aVar.c = 1;
        } else {
            int a = bVar.a(context, str);
            aVar.a = a;
            if (a != 0) {
                aVar.c = -1;
            }
        }
        return aVar;
    }
}
