package defpackage;

/* renamed from: kb0  reason: default package */
/* compiled from: DropFramesFrameScheduler */
public class kb0 implements lb0 {
    private final ua0 a;
    private long b = -1;

    public kb0(ua0 ua0) {
        this.a = ua0;
    }

    @Override // defpackage.lb0
    public long a(long j) {
        long d = d();
        long j2 = 0;
        if (d == 0) {
            return -1;
        }
        if (!e() && j / d() >= ((long) this.a.d())) {
            return -1;
        }
        long j3 = j % d;
        int b2 = this.a.b();
        for (int i = 0; i < b2 && j2 <= j3; i++) {
            j2 += (long) this.a.h(i);
        }
        return j + (j2 - j3);
    }

    @Override // defpackage.lb0
    public int b(long j, long j2) {
        if (e() || j / d() < ((long) this.a.d())) {
            return c(j % d());
        }
        return -1;
    }

    public int c(long j) {
        int i = 0;
        long j2 = 0;
        do {
            j2 += (long) this.a.h(i);
            i++;
        } while (j >= j2);
        return i - 1;
    }

    public long d() {
        long j = this.b;
        if (j != -1) {
            return j;
        }
        this.b = 0;
        int b2 = this.a.b();
        for (int i = 0; i < b2; i++) {
            this.b += (long) this.a.h(i);
        }
        return this.b;
    }

    public boolean e() {
        return this.a.d() == 0;
    }
}
