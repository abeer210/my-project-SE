package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.core.content.b;
import vigqyno.C0201;

/* compiled from: AHBottomNavigationItem */
public class r {
    private String a = C0201.m82(17914);
    private Drawable b;
    private Drawable c;
    private String d;
    private int e = -7829368;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;

    public r(String str, Drawable drawable, Drawable drawable2, String str2) {
        this.a = str;
        this.b = drawable;
        this.c = drawable2;
        this.d = str2;
    }

    private Drawable c(Context context, int i2) {
        if (i2 == 0) {
            return null;
        }
        try {
            return n.d(context, i2);
        } catch (Resources.NotFoundException unused) {
            return b.f(context, i2);
        }
    }

    public int a(Context context) {
        int i2 = this.i;
        if (i2 != 0) {
            return b.d(context, i2);
        }
        return this.e;
    }

    public Drawable b(Context context) {
        Drawable drawable = this.b;
        if (drawable == null) {
            drawable = c(context, this.f);
        }
        Drawable drawable2 = this.c;
        if (drawable2 == null) {
            drawable2 = c(context, this.g);
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        if (drawable2 != null) {
            stateListDrawable.addState(new int[]{16842913}, drawable2);
        }
        stateListDrawable.addState(new int[0], drawable);
        return stateListDrawable;
    }

    public String d() {
        return this.d;
    }

    public String e(Context context) {
        int i2 = this.h;
        if (i2 != 0) {
            return context.getString(i2);
        }
        return this.a;
    }

    public boolean f() {
        return (this.b == null && this.f == 0 && this.c == null && this.g == 0) ? false : true;
    }

    public void g(Drawable drawable) {
        this.b = drawable;
        this.f = 0;
    }

    public void h(Drawable drawable) {
        this.c = drawable;
    }

    public void i(String str) {
        this.a = str;
        this.h = 0;
    }
}
