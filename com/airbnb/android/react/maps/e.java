package com.airbnb.android.react.maps;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.a0;
import com.google.android.gms.maps.model.b0;
import defpackage.a62;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0201;

/* compiled from: AirMapHeatmap */
public class e extends c {
    private b0 a;
    private a0 b;
    private a62 c;
    private List<b62> d;
    private z52 e;
    private Double f;
    private Integer g;

    public e(Context context) {
        super(context);
    }

    private b0 h() {
        b0 b0Var = new b0();
        if (this.c == null) {
            a62.b bVar = new a62.b();
            bVar.i(this.d);
            Integer num = this.g;
            if (num != null) {
                bVar.h(num.intValue());
            }
            Double d2 = this.f;
            if (d2 != null) {
                bVar.g(d2.doubleValue());
            }
            z52 z52 = this.e;
            if (z52 != null) {
                bVar.f(z52);
            }
            this.c = bVar.e();
        }
        b0Var.u(this.c);
        return b0Var;
    }

    @Override // com.airbnb.android.react.maps.c
    public void e(c cVar) {
        this.b.b();
    }

    public void f(c cVar) {
        Log.d(C0201.m82(37096), C0201.m82(37097));
        this.b = cVar.f(getHeatmapOptions());
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.b;
    }

    public b0 getHeatmapOptions() {
        if (this.a == null) {
            this.a = h();
        }
        return this.a;
    }

    public void setGradient(z52 z52) {
        this.e = z52;
        a62 a62 = this.c;
        if (a62 != null) {
            a62.h(z52);
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public void setOpacity(double d2) {
        this.f = new Double(d2);
        a62 a62 = this.c;
        if (a62 != null) {
            a62.i(d2);
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public void setPoints(b62[] b62Arr) {
        List<b62> asList = Arrays.asList(b62Arr);
        this.d = asList;
        a62 a62 = this.c;
        if (a62 != null) {
            a62.k(asList);
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.a();
        }
    }

    public void setRadius(int i) {
        this.g = new Integer(i);
        a62 a62 = this.c;
        if (a62 != null) {
            a62.j(i);
        }
        a0 a0Var = this.b;
        if (a0Var != null) {
            a0Var.a();
        }
    }
}
