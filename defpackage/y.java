package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import vigqyno.C0201;

/* renamed from: y  reason: default package */
/* compiled from: ContextThemeWrapper */
public class y extends ContextWrapper {
    private int a;
    private Resources.Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;

    public y() {
        super(null);
    }

    private Resources a() {
        if (this.e == null) {
            Configuration configuration = this.d;
            if (configuration == null) {
                this.e = super.getResources();
            } else if (Build.VERSION.SDK_INT >= 17) {
                this.e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.e;
    }

    private void c() {
        boolean z = this.b == null;
        if (z) {
            this.b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        d(this.b, this.a, z);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int b() {
        return this.a;
    }

    public void d(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        return a();
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!C0201.m82(27952).equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = l.Theme_AppCompat_Light;
        }
        c();
        return this.b;
    }

    public void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            c();
        }
    }

    public y(Context context, int i) {
        super(context);
        this.a = i;
    }

    public y(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }
}
