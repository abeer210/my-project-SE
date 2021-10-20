package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ck1  reason: default package */
public final class ck1 implements Iterator {
    private int a = 0;
    private final int b = this.c.size();
    private final /* synthetic */ bk1 c;

    public ck1(bk1 bk1) {
        this.c = bk1;
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public final byte nextByte() {
        try {
            bk1 bk1 = this.c;
            int i = this.a;
            this.a = i + 1;
            return bk1.e(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
