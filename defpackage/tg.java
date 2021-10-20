package defpackage;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.a;
import defpackage.vg;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: tg  reason: default package */
/* compiled from: AssetPathFetcher */
public abstract class tg<T> implements vg<T> {
    private final String a;
    private final AssetManager b;
    private T c;

    public tg(AssetManager assetManager, String str) {
        this.b = assetManager;
        this.a = str;
    }

    @Override // defpackage.vg
    public void b() {
        T t = this.c;
        if (t != null) {
            try {
                c(t);
            } catch (IOException unused) {
            }
        }
    }

    public abstract void c(T t) throws IOException;

    @Override // defpackage.vg
    public void cancel() {
    }

    @Override // defpackage.vg
    public a d() {
        return a.LOCAL;
    }

    @Override // defpackage.vg
    public void e(g gVar, vg.a<? super T> aVar) {
        try {
            T f = f(this.b, this.a);
            this.c = f;
            aVar.f(f);
        } catch (IOException e) {
            String r1 = C0201.m82(7975);
            if (Log.isLoggable(r1, 3)) {
                Log.d(r1, C0201.m82(7976), e);
            }
            aVar.c(e);
        }
    }

    public abstract T f(AssetManager assetManager, String str) throws IOException;
}
