package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ec  reason: default package */
/* compiled from: ImageAssetManager */
public class ec {
    private static final Object e = new Object();
    private final Context a;
    private String b;
    private ba c;
    private final Map<String, ha> d;

    public ec(Drawable.Callback callback, String str, ba baVar, Map<String, ha> map) {
        this.b = str;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.b;
            if (str2.charAt(str2.length() - 1) != '/') {
                this.b += '/';
            }
        }
        if (!(callback instanceof View)) {
            wf.c(C0201.m82(12351));
            this.d = new HashMap();
            this.a = null;
            return;
        }
        this.a = ((View) callback).getContext();
        this.d = map;
        d(baVar);
    }

    private Bitmap c(String str, Bitmap bitmap) {
        synchronized (e) {
            this.d.get(str).f(bitmap);
        }
        return bitmap;
    }

    public Bitmap a(String str) {
        ha haVar = this.d.get(str);
        if (haVar == null) {
            return null;
        }
        Bitmap a2 = haVar.a();
        if (a2 != null) {
            return a2;
        }
        ba baVar = this.c;
        if (baVar != null) {
            Bitmap a3 = baVar.a(haVar);
            if (a3 != null) {
                c(str, a3);
            }
            return a3;
        }
        String b2 = haVar.b();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b2.startsWith(C0201.m82(12352)) || b2.indexOf(C0201.m82(12353)) <= 0) {
            try {
                if (!TextUtils.isEmpty(this.b)) {
                    AssetManager assets = this.a.getAssets();
                    Bitmap l = ag.l(BitmapFactory.decodeStream(assets.open(this.b + b2), null, options), haVar.e(), haVar.c());
                    c(str, l);
                    return l;
                }
                throw new IllegalStateException(C0201.m82(12355));
            } catch (IOException e2) {
                wf.d(C0201.m82(12356), e2);
                return null;
            }
        } else {
            try {
                byte[] decode = Base64.decode(b2.substring(b2.indexOf(44) + 1), 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                c(str, decodeByteArray);
                return decodeByteArray;
            } catch (IllegalArgumentException e3) {
                wf.d(C0201.m82(12354), e3);
                return null;
            }
        }
    }

    public boolean b(Context context) {
        return (context == null && this.a == null) || this.a.equals(context);
    }

    public void d(ba baVar) {
        this.c = baVar;
    }
}
