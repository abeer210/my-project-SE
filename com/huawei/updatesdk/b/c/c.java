package com.huawei.updatesdk.b.c;

import com.huawei.updatesdk.a.b.c.b;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public final class c {
    private static c a = new c();
    private static a b = new a();

    static class a implements a {
        private final List<b> a = new ArrayList();

        @Override // com.huawei.updatesdk.b.c.a
        public void a(int i, b bVar) {
            synchronized (this.a) {
                for (b bVar2 : this.a) {
                    bVar2.a(i, bVar);
                }
            }
        }

        @Override // com.huawei.updatesdk.b.c.a
        public void a(b bVar) {
            String r4;
            String r1;
            synchronized (this.a) {
                if (bVar != null) {
                    if (!this.a.contains(bVar)) {
                        try {
                            this.a.add(bVar);
                        } catch (UnsupportedOperationException unused) {
                            r4 = C0201.m82(30395);
                            r1 = C0201.m82(30396);
                        } catch (ClassCastException unused2) {
                            r4 = C0201.m82(30393);
                            r1 = C0201.m82(30394);
                        } catch (IllegalArgumentException unused3) {
                            r4 = C0201.m82(30391);
                            r1 = C0201.m82(30392);
                        }
                    }
                }
                return;
            }
            com.huawei.updatesdk.a.a.b.a.a.a.b(r4, r1);
        }

        @Override // com.huawei.updatesdk.b.c.a
        public void b(b bVar) {
            synchronized (this.a) {
                try {
                    this.a.remove(bVar);
                } catch (UnsupportedOperationException unused) {
                    com.huawei.updatesdk.a.a.b.a.a.a.b(C0201.m82(30397), C0201.m82(30398));
                }
            }
        }
    }

    private c() {
    }

    public static a a() {
        return b;
    }

    public static c b() {
        return a;
    }

    public void a(b bVar) {
        b.a(1, bVar);
    }

    public void b(b bVar) {
        b.a(0, bVar);
    }

    public void c(b bVar) {
        b.a(2, bVar);
    }
}
