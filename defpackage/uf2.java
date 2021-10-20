package defpackage;

import android.graphics.Color;
import vigqyno.C0201;

/* renamed from: uf2  reason: default package */
/* compiled from: Colour */
public class uf2 extends hg2<Integer> {
    public uf2(int i) {
        super(Integer.valueOf(i));
    }

    public boolean g() {
        return f() && Color.alpha(this.a.intValue()) < 1;
    }

    public String toString() {
        return String.format(C0201.m82(27086), Integer.valueOf(((Integer) d()).intValue() & 16777215));
    }
}
