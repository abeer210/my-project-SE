package defpackage;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: dc  reason: default package */
/* compiled from: FontAssetManager */
public class dc {
    private final nc<String> a = new nc<>();
    private final Map<nc<String>, Typeface> b = new HashMap();
    private final Map<String, Typeface> c = new HashMap();
    private final AssetManager d;
    private aa e;
    private String f = C0201.m82(9980);

    public dc(Drawable.Callback callback, aa aaVar) {
        this.e = aaVar;
        if (!(callback instanceof View)) {
            wf.c(C0201.m82(9981));
            this.d = null;
            return;
        }
        this.d = ((View) callback).getContext().getAssets();
    }

    private Typeface a(String str) {
        Typeface typeface = this.c.get(str);
        if (typeface != null) {
            return typeface;
        }
        aa aaVar = this.e;
        if (aaVar != null) {
            aaVar.a(str);
            throw null;
        } else if (aaVar != null) {
            aaVar.b(str);
            throw null;
        } else {
            Typeface createFromAsset = Typeface.createFromAsset(this.d, C0201.m82(9982) + str + this.f);
            this.c.put(str, createFromAsset);
            return createFromAsset;
        }
    }

    private Typeface d(Typeface typeface, String str) {
        boolean contains = str.contains(C0201.m82(9983));
        boolean contains2 = str.contains(C0201.m82(9984));
        int i = (!contains || !contains2) ? contains ? 2 : contains2 ? 1 : 0 : 3;
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }

    public Typeface b(String str, String str2) {
        this.a.b(str, str2);
        Typeface typeface = this.b.get(this.a);
        if (typeface != null) {
            return typeface;
        }
        Typeface d2 = d(a(str), str2);
        this.b.put(this.a, d2);
        return d2;
    }

    public void c(aa aaVar) {
        this.e = aaVar;
    }
}
