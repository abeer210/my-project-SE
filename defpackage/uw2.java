package defpackage;

import vigqyno.C0201;

/* renamed from: uw2  reason: default package */
/* compiled from: Ranges.kt */
public final class uw2 extends sw2 {
    static {
        new uw2(1, 0);
    }

    public uw2(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.sw2
    public boolean equals(Object obj) {
        if (obj instanceof uw2) {
            if (!isEmpty() || !((uw2) obj).isEmpty()) {
                uw2 uw2 = (uw2) obj;
                if (!(a() == uw2.a() && b() == uw2.b())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.sw2
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    @Override // defpackage.sw2
    public boolean isEmpty() {
        return a() > b();
    }

    @Override // defpackage.sw2
    public String toString() {
        return a() + C0201.m82(27258) + b();
    }
}
