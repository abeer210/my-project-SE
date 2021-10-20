package androidx.lifecycle;

import androidx.lifecycle.d;
import vigqyno.C0201;

public class FullLifecycleObserverAdapter implements e {
    private final b a;
    private final e b;

    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[d.a.values().length];
            a = iArr;
            iArr[d.a.ON_CREATE.ordinal()] = 1;
            a[d.a.ON_START.ordinal()] = 2;
            a[d.a.ON_RESUME.ordinal()] = 3;
            a[d.a.ON_PAUSE.ordinal()] = 4;
            a[d.a.ON_STOP.ordinal()] = 5;
            a[d.a.ON_DESTROY.ordinal()] = 6;
            try {
                a[d.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public FullLifecycleObserverAdapter(b bVar, e eVar) {
        this.a = bVar;
        this.b = eVar;
    }

    @Override // androidx.lifecycle.e
    public void c(g gVar, d.a aVar) {
        switch (a.a[aVar.ordinal()]) {
            case 1:
                this.a.b(gVar);
                break;
            case 2:
                this.a.g(gVar);
                break;
            case 3:
                this.a.a(gVar);
                break;
            case 4:
                this.a.d(gVar);
                break;
            case 5:
                this.a.e(gVar);
                break;
            case 6:
                this.a.f(gVar);
                break;
            case 7:
                throw new IllegalArgumentException(C0201.m82(18073));
        }
        e eVar = this.b;
        if (eVar != null) {
            eVar.c(gVar, aVar);
        }
    }
}
