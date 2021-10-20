package defpackage;

import android.util.Log;
import com.bumptech.glide.load.c;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.l;
import java.io.File;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: hm  reason: default package */
/* compiled from: GifDrawableEncoder */
public class hm implements l<gm> {
    @Override // com.bumptech.glide.load.l
    public c b(i iVar) {
        return c.SOURCE;
    }

    /* renamed from: c */
    public boolean a(hi<gm> hiVar, File file, i iVar) {
        try {
            vo.e(hiVar.get().c(), file);
            return true;
        } catch (IOException e) {
            String r4 = C0201.m82(20310);
            if (Log.isLoggable(r4, 5)) {
                Log.w(r4, C0201.m82(20311), e);
            }
            return false;
        }
    }
}
