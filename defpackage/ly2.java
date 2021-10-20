package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: ly2  reason: default package */
/* compiled from: Pipe */
public final class ly2 {
    public final long a;
    public final ay2 b = new ay2();
    public boolean c;
    public boolean d;
    private final sy2 e = new a();
    private final ty2 f = new b();
    private sy2 g;

    /* renamed from: ly2$a */
    /* compiled from: Pipe */
    final class a implements sy2 {
        public final my2 a = new my2();

        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
            r7.a.b(r1.timeout());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r1.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
            r7.a.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        @Override // java.io.Closeable, defpackage.sy2, java.lang.AutoCloseable
        public void close() throws IOException {
            sy2 sy2;
            synchronized (ly2.this.b) {
                if (!ly2.this.c) {
                    if (ly2.this.g != null) {
                        sy2 = ly2.this.g;
                    } else {
                        if (ly2.this.d) {
                            if (ly2.this.b.Q() > 0) {
                                throw new IOException(C0201.m82(14511));
                            }
                        }
                        ly2.this.c = true;
                        ly2.this.b.notifyAll();
                        sy2 = null;
                    }
                }
            }
        }

        @Override // defpackage.sy2, java.io.Flushable
        public void flush() throws IOException {
            sy2 sy2;
            synchronized (ly2.this.b) {
                if (ly2.this.c) {
                    throw new IllegalStateException(C0201.m82(14513));
                } else if (ly2.this.g != null) {
                    sy2 = ly2.this.g;
                } else {
                    if (ly2.this.d) {
                        if (ly2.this.b.Q() > 0) {
                            throw new IOException(C0201.m82(14512));
                        }
                    }
                    sy2 = null;
                }
            }
            if (sy2 != null) {
                this.a.b(sy2.timeout());
                try {
                    sy2.flush();
                } finally {
                    this.a.a();
                }
            }
        }

        @Override // defpackage.sy2
        public uy2 timeout() {
            return this.a;
        }

        @Override // defpackage.sy2
        public void write(ay2 ay2, long j) throws IOException {
            sy2 sy2;
            synchronized (ly2.this.b) {
                if (!ly2.this.c) {
                    while (true) {
                        if (j <= 0) {
                            sy2 = null;
                            break;
                        } else if (ly2.this.g != null) {
                            sy2 = ly2.this.g;
                            break;
                        } else if (!ly2.this.d) {
                            long Q = ly2.this.a - ly2.this.b.Q();
                            if (Q == 0) {
                                this.a.waitUntilNotified(ly2.this.b);
                            } else {
                                long min = Math.min(Q, j);
                                ly2.this.b.write(ay2, min);
                                j -= min;
                                ly2.this.b.notifyAll();
                            }
                        } else {
                            throw new IOException(C0201.m82(14514));
                        }
                    }
                } else {
                    throw new IllegalStateException(C0201.m82(14515));
                }
            }
            if (sy2 != null) {
                this.a.b(sy2.timeout());
                try {
                    sy2.write(ay2, j);
                } finally {
                    this.a.a();
                }
            }
        }
    }

    /* renamed from: ly2$b */
    /* compiled from: Pipe */
    final class b implements ty2 {
        public final uy2 a = new uy2();

        public b() {
        }

        @Override // java.io.Closeable, defpackage.ty2, java.lang.AutoCloseable
        public void close() throws IOException {
            synchronized (ly2.this.b) {
                ly2.this.d = true;
                ly2.this.b.notifyAll();
            }
        }

        @Override // defpackage.ty2
        public long read(ay2 ay2, long j) throws IOException {
            synchronized (ly2.this.b) {
                if (!ly2.this.d) {
                    while (ly2.this.b.Q() == 0) {
                        if (ly2.this.c) {
                            return -1;
                        }
                        this.a.waitUntilNotified(ly2.this.b);
                    }
                    long read = ly2.this.b.read(ay2, j);
                    ly2.this.b.notifyAll();
                    return read;
                }
                throw new IllegalStateException(C0201.m82(14434));
            }
        }

        @Override // defpackage.ty2
        public uy2 timeout() {
            return this.a;
        }
    }

    public ly2(long j) {
        if (j >= 1) {
            this.a = j;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(16806) + j);
    }

    public final sy2 b() {
        return this.e;
    }

    public final ty2 c() {
        return this.f;
    }
}
