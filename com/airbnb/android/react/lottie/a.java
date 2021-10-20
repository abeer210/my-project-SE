package com.airbnb.android.react.lottie;

import android.graphics.Color;
import android.widget.ImageView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import vigqyno.C0201;

/* compiled from: LottieAnimationViewPropertyManager */
public class a {
    private final WeakReference<da> a;
    private String b;
    private Float c;
    private Boolean d;
    private Float e;
    private boolean f;
    private String g;
    private ImageView.ScaleType h;
    private String i;
    private Boolean j;
    private ReadableArray k;
    private qa l;

    public a(da daVar) {
        this.a = new WeakReference<>(daVar);
    }

    public void a() {
        da daVar = this.a.get();
        if (daVar != null) {
            String str = this.b;
            if (str != null) {
                daVar.t(str, Integer.toString(str.hashCode()));
                this.b = null;
            }
            if (this.f) {
                daVar.setAnimation(this.g);
                this.f = false;
            }
            Float f2 = this.c;
            if (f2 != null) {
                daVar.setProgress(f2.floatValue());
                this.c = null;
            }
            Boolean bool = this.d;
            if (bool != null) {
                daVar.setRepeatCount(bool.booleanValue() ? -1 : 0);
                this.d = null;
            }
            Float f3 = this.e;
            if (f3 != null) {
                daVar.setSpeed(f3.floatValue());
                this.e = null;
            }
            ImageView.ScaleType scaleType = this.h;
            if (scaleType != null) {
                daVar.setScaleType(scaleType);
                this.h = null;
            }
            qa qaVar = this.l;
            if (qaVar != null) {
                daVar.setRenderMode(qaVar);
                this.l = null;
            }
            String str2 = this.i;
            if (str2 != null) {
                daVar.setImageAssetsFolder(str2);
                this.i = null;
            }
            Boolean bool2 = this.j;
            if (bool2 != null) {
                daVar.k(bool2.booleanValue());
                this.j = null;
            }
            ReadableArray readableArray = this.k;
            if (readableArray != null && readableArray.size() > 0) {
                for (int i2 = 0; i2 < this.k.size(); i2++) {
                    ReadableMap map = this.k.getMap(i2);
                    String string = map.getString(C0201.m82(2927));
                    String string2 = map.getString(C0201.m82(2928));
                    ra raVar = new ra(Color.parseColor(string));
                    daVar.g(new jc((string2 + C0201.m82(2929)).split(Pattern.quote(C0201.m82(2930)))), la.C, new dg(raVar));
                }
            }
        }
    }

    public void b(String str) {
        this.b = str;
    }

    public void c(String str) {
        this.g = str;
        this.f = true;
    }

    public void d(ReadableArray readableArray) {
        this.k = readableArray;
    }

    public void e(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    public void f(String str) {
        this.i = str;
    }

    public void g(boolean z) {
        this.d = Boolean.valueOf(z);
    }

    public void h(Float f2) {
        this.c = f2;
    }

    public void i(qa qaVar) {
        this.l = qaVar;
    }

    public void j(ImageView.ScaleType scaleType) {
        this.h = scaleType;
    }

    public void k(float f2) {
        this.e = Float.valueOf(f2);
    }
}
