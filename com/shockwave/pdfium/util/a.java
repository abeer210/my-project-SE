package com.shockwave.pdfium.util;

import vigqyno.C0201;

/* compiled from: SizeF */
public class a {
    private final float a;
    private final float b;

    public a(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.b == aVar.b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a) ^ Float.floatToIntBits(this.b);
    }

    public String toString() {
        return this.a + C0201.m82(20795) + this.b;
    }
}
