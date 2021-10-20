package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: gu0  reason: default package */
public final class gu0 implements Iterator {
    private int a = 0;
    private final int b = this.c.size();
    private final /* synthetic */ fu0 c;

    public gu0(fu0 fu0) {
        this.c = fu0;
    }

    private final byte nextByte() {
        try {
            fu0 fu0 = this.c;
            int i = this.a;
            this.a = i + 1;
            return fu0.k(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(nextByte());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
