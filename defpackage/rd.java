package defpackage;

import android.graphics.Paint;
import java.util.List;

/* renamed from: rd  reason: default package */
/* compiled from: ShapeStroke */
public class rd implements dd {
    private final String a;
    private final pc b;
    private final List<pc> c;
    private final oc d;
    private final rc e;
    private final pc f;
    private final b g;
    private final c h;
    private final float i;
    private final boolean j;

    /* renamed from: rd$a */
    /* compiled from: ShapeStroke */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            iArr2[b.BUTT.ordinal()] = 1;
            a[b.ROUND.ordinal()] = 2;
            a[b.UNKNOWN.ordinal()] = 3;
        }
    }

    /* renamed from: rd$b */
    /* compiled from: ShapeStroke */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap b() {
            int i = a.a[ordinal()];
            if (i == 1) {
                return Paint.Cap.BUTT;
            }
            if (i != 2) {
                return Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }
    }

    /* renamed from: rd$c */
    /* compiled from: ShapeStroke */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join b() {
            int i = a.b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public rd(String str, pc pcVar, List<pc> list, oc ocVar, rc rcVar, pc pcVar2, b bVar, c cVar, float f2, boolean z) {
        this.a = str;
        this.b = pcVar;
        this.c = list;
        this.d = ocVar;
        this.e = rcVar;
        this.f = pcVar2;
        this.g = bVar;
        this.h = cVar;
        this.i = f2;
        this.j = z;
    }

    @Override // defpackage.dd
    public wa a(ga gaVar, td tdVar) {
        return new lb(gaVar, tdVar, this);
    }

    public b b() {
        return this.g;
    }

    public oc c() {
        return this.d;
    }

    public pc d() {
        return this.b;
    }

    public c e() {
        return this.h;
    }

    public List<pc> f() {
        return this.c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.a;
    }

    public rc i() {
        return this.e;
    }

    public pc j() {
        return this.f;
    }

    public boolean k() {
        return this.j;
    }
}
