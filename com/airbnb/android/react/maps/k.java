package com.airbnb.android.react.maps;

import android.content.Context;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.a0;
import com.google.android.gms.maps.model.b0;
import com.google.android.gms.maps.model.d0;
import java.net.MalformedURLException;
import java.net.URL;
import vigqyno.C0201;

/* compiled from: AirMapUrlTile */
public class k extends c {
    private b0 a;
    private a0 b;
    private a c;
    private String d;
    private float e;
    private float f;
    private float g;
    private boolean h;

    /* access modifiers changed from: package-private */
    /* compiled from: AirMapUrlTile */
    public class a extends d0 {
        private String d;

        public a(int i, int i2, String str) {
            super(i, i2);
            this.d = str;
        }

        @Override // com.google.android.gms.maps.model.d0
        public synchronized URL a(int i, int i2, int i3) {
            if (k.this.h) {
                i2 = ((1 << i3) - i2) - 1;
            }
            String replace = this.d.replace(C0201.m82(24154), Integer.toString(i)).replace(C0201.m82(24155), Integer.toString(i2)).replace(C0201.m82(24156), Integer.toString(i3));
            if (k.this.f > 0.0f && ((float) i3) > k.this.f) {
                return null;
            }
            if (k.this.g > 0.0f && ((float) i3) < k.this.g) {
                return null;
            }
            try {
                return new URL(replace);
            } catch (MalformedURLException e2) {
                throw new AssertionError(e2);
            }
        }

        public void b(String str) {
            this.d = str;
        }
    }

    public k(Context context) {
        super(context);
    }

    private b0 k() {
        b0 b0Var = new b0();
        b0Var.y(this.e);
        a aVar = new a(256, 256, this.d);
        this.c = aVar;
        b0Var.u(aVar);
        return b0Var;
    }

    @Override // com.airbnb.android.react.maps.c
    public void e(c cVar) {
        this.b.b();
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.b;
    }

    public b0 getTileOverlayOptions() {
        if (this.a == null) {
            this.a = k();
        }
        return this.a;
    }

    public void j(c cVar) {
        this.b = cVar.f(getTileOverlayOptions());
    }

    public void setFlipY(boolean z) {
        this.h = z;
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public void setMaximumZ(float f2) {
        this.f = f2;
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public void setMinimumZ(float f2) {
        this.g = f2;
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public void setUrlTemplate(String str) {
        this.d = str;
        a aVar = this.c;
        if (aVar != null) {
            aVar.b(str);
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public void setZIndex(float f2) {
        this.e = f2;
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.d(f2);
        }
    }
}
