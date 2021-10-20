package com.airbnb.android.react.maps;

import android.content.Context;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.a0;
import com.google.android.gms.maps.model.b0;
import com.google.android.gms.maps.model.d0;
import java.net.MalformedURLException;
import java.net.URL;
import vigqyno.C0201;

/* compiled from: AirMapWMSTile */
public class m extends c {
    private static final double[] j = {-2.003750834789244E7d, 2.003750834789244E7d};
    private b0 a;
    private a0 b;
    private a c;
    private String d;
    private float e;
    private float f;
    private float g;
    private int h;
    private float i;

    /* access modifiers changed from: package-private */
    /* compiled from: AirMapWMSTile */
    public class a extends d0 {
        private String d;
        private int e;
        private int f;

        public a(int i, int i2, String str) {
            super(i, i2);
            this.d = str;
            this.e = i;
            this.f = i2;
        }

        private double[] b(int i, int i2, int i3) {
            double pow = 4.007501669578488E7d / Math.pow(2.0d, (double) i3);
            double d2 = m.j[0];
            double d3 = (double) i;
            Double.isNaN(d3);
            double d4 = m.j[1];
            double d5 = (double) (i2 + 1);
            Double.isNaN(d5);
            double d6 = m.j[0];
            double d7 = (double) (i + 1);
            Double.isNaN(d7);
            double d8 = m.j[1];
            double d9 = (double) i2;
            Double.isNaN(d9);
            return new double[]{d2 + (d3 * pow), d4 - (d5 * pow), d6 + (d7 * pow), d8 - (d9 * pow)};
        }

        @Override // com.google.android.gms.maps.model.d0
        public synchronized URL a(int i, int i2, int i3) {
            if (m.this.f > 0.0f && ((float) i3) > m.this.f) {
                return null;
            }
            if (m.this.g > 0.0f && ((float) i3) < m.this.g) {
                return null;
            }
            double[] b = b(i, i2, i3);
            try {
                return new URL(this.d.replace(C0201.m82(8518), Double.toString(b[0])).replace(C0201.m82(8519), Double.toString(b[1])).replace(C0201.m82(8520), Double.toString(b[2])).replace(C0201.m82(8521), Double.toString(b[3])).replace(C0201.m82(8522), Integer.toString(this.e)).replace(C0201.m82(8523), Integer.toString(this.f)));
            } catch (MalformedURLException e2) {
                throw new AssertionError(e2);
            }
        }

        public void c(String str) {
            this.d = str;
        }
    }

    public m(Context context) {
        super(context);
    }

    private b0 k() {
        b0 b0Var = new b0();
        b0Var.y(this.e);
        b0Var.w(1.0f - this.i);
        int i2 = this.h;
        a aVar = new a(i2, i2, this.d);
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

    public void setOpacity(float f2) {
        this.i = f2;
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.c(1.0f - f2);
        }
    }

    public void setTileSize(int i2) {
        this.h = i2;
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public void setUrlTemplate(String str) {
        this.d = str;
        a aVar = this.c;
        if (aVar != null) {
            aVar.c(str);
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
