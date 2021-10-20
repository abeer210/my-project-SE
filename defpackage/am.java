package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.util.List;
import vigqyno.C0201;

/* renamed from: am  reason: default package */
/* compiled from: ResourceDrawableDecoder */
public class am implements k<Uri, Drawable> {
    private final Context a;

    public am(Context context) {
        this.a = context.getApplicationContext();
    }

    private Context d(Uri uri, String str) {
        if (str.equals(this.a.getPackageName())) {
            return this.a;
        }
        try {
            return this.a.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.a.getPackageName())) {
                return this.a;
            }
            throw new IllegalArgumentException(C0201.m82(3568) + uri, e);
        }
    }

    private int e(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(C0201.m82(3569) + uri, e);
        }
    }

    private int f(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, C0201.m82(3570));
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException(C0201.m82(3571) + uri);
    }

    private int g(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return f(context, uri);
        }
        if (pathSegments.size() == 1) {
            return e(uri);
        }
        throw new IllegalArgumentException(C0201.m82(3572) + uri);
    }

    /* renamed from: c */
    public hi<Drawable> b(Uri uri, int i, int i2, i iVar) {
        Context d = d(uri, uri.getAuthority());
        return zl.d(xl.b(this.a, d, g(d, uri)));
    }

    /* renamed from: h */
    public boolean a(Uri uri, i iVar) {
        return uri.getScheme().equals(C0201.m82(3573));
    }
}
