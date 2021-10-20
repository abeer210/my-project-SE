package defpackage;

import java.util.NoSuchElementException;

/* renamed from: tw2  reason: default package */
/* compiled from: ProgressionIterators.kt */
public final class tw2 extends zv2 {
    private final int a;
    private boolean b;
    private int c;
    private final int d;

    public tw2(int i, int i2, int i3) {
        this.d = i3;
        this.a = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.b = z;
        this.c = !z ? this.a : i;
    }

    @Override // defpackage.zv2
    public int b() {
        int i = this.c;
        if (i != this.a) {
            this.c = this.d + i;
        } else if (this.b) {
            this.b = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.b;
    }
}
