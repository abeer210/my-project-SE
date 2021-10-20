package com.facebook.react.uimanager;

import java.util.Comparator;
import vigqyno.C0201;

/* compiled from: ViewAtIndex */
public class w0 {
    public static Comparator<w0> c = new a();
    public final int a;
    public final int b;

    /* compiled from: ViewAtIndex */
    static class a implements Comparator<w0> {
        /* renamed from: a */
        public int compare(w0 w0Var, w0 w0Var2) {
            return w0Var.b - w0Var2.b;
        }
    }

    public w0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != w0.class) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (this.b == w0Var.b && this.a == w0Var.a) {
            return true;
        }
        return false;
    }

    public String toString() {
        return C0201.m82(22463) + this.a + C0201.m82(22464) + this.b + C0201.m82(22465);
    }
}
