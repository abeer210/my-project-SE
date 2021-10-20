package defpackage;

import android.graphics.PointF;
import java.util.Arrays;
import java.util.List;

/* renamed from: nu1  reason: default package */
public class nu1 {
    private int a;
    private PointF b;
    private float c;
    private float d;
    private float e;
    private float f;
    private List<pu1> g;
    private float h;
    private float i;
    private float j;

    public nu1(int i2, PointF pointF, float f2, float f3, float f4, float f5, float f6, pu1[] pu1Arr, mu1[] mu1Arr, float f7, float f8, float f9) {
        this.a = i2;
        this.b = pointF;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        this.g = Arrays.asList(pu1Arr);
        Arrays.asList(mu1Arr);
        if (f7 < 0.0f || f7 > 1.0f) {
            this.h = -1.0f;
        } else {
            this.h = f7;
        }
        if (f8 < 0.0f || f8 > 1.0f) {
            this.i = -1.0f;
        } else {
            this.i = f8;
        }
        if (f9 < 0.0f || f9 > 1.0f) {
            this.j = -1.0f;
        } else {
            this.j = f9;
        }
    }

    public float a() {
        return this.e;
    }

    public float b() {
        return this.f;
    }

    public float c() {
        return this.d;
    }

    public int d() {
        return this.a;
    }

    public float e() {
        return this.h;
    }

    public float f() {
        return this.i;
    }

    public float g() {
        return this.j;
    }

    public List<pu1> h() {
        return this.g;
    }

    public PointF i() {
        PointF pointF = this.b;
        return new PointF(pointF.x - (this.c / 2.0f), pointF.y - (this.d / 2.0f));
    }

    public float j() {
        return this.c;
    }
}
