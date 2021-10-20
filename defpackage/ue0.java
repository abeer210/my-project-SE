package defpackage;

import java.util.Collections;
import java.util.List;
import vigqyno.C0188;

/* renamed from: ue0  reason: default package */
/* compiled from: SimpleProgressiveJpegConfig */
public class ue0 implements se0 {
    private final c a;

    /* renamed from: ue0$b */
    /* compiled from: SimpleProgressiveJpegConfig */
    private static class b implements c {
        private b() {
        }

        @Override // defpackage.ue0.c
        public List<Integer> a() {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.ue0.c
        public int b() {
            return 0;
        }
    }

    /* renamed from: ue0$c */
    /* compiled from: SimpleProgressiveJpegConfig */
    public interface c {
        List<Integer> a();

        int b();
    }

    public ue0() {
        this(new b());
    }

    @Override // defpackage.se0
    public df0 a(int i) {
        return cf0.d(i, i >= this.a.b(), false);
    }

    @Override // defpackage.se0
    public int b(int i) {
        List<Integer> a2 = this.a.a();
        if (a2 == null || a2.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < a2.size(); i2++) {
            if (a2.get(i2).intValue() > i) {
                return a2.get(i2).intValue();
            }
        }
        return C0188.f24;
    }

    public ue0(c cVar) {
        z50.g(cVar);
        this.a = cVar;
    }
}
