package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.g;
import com.bumptech.glide.load.a;
import defpackage.vg;
import java.io.FileNotFoundException;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: dh  reason: default package */
/* compiled from: LocalUriFetcher */
public abstract class dh<T> implements vg<T> {
    private final Uri a;
    private final ContentResolver b;
    private T c;

    public dh(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.a = uri;
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
    public final void e(g gVar, vg.a<? super T> aVar) {
        try {
            T f = f(this.a, this.b);
            this.c = f;
            aVar.f(f);
        } catch (FileNotFoundException e) {
            String r1 = C0201.m82(10220);
            if (Log.isLoggable(r1, 3)) {
                Log.d(r1, C0201.m82(10221), e);
            }
            aVar.c(e);
        }
    }

    public abstract T f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException;
}
