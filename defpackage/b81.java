package defpackage;

import java.util.NoSuchElementException;

/* renamed from: b81  reason: default package */
public final class b81 extends d81 {
    private int a = 0;
    private final int b = this.c.size();
    private final /* synthetic */ c81 c;

    public b81(c81 c81) {
        this.c = c81;
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // defpackage.g81
    public final byte nextByte() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return this.c.f(i);
        }
        throw new NoSuchElementException();
    }
}
