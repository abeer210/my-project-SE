package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import vigqyno.C0201;

/* renamed from: zi  reason: default package */
/* compiled from: SizeConfigStrategy */
public class zi implements xi {
    private static final Bitmap.Config[] d;
    private static final Bitmap.Config[] e;
    private static final Bitmap.Config[] f = {Bitmap.Config.RGB_565};
    private static final Bitmap.Config[] g = {Bitmap.Config.ARGB_4444};
    private static final Bitmap.Config[] h = {Bitmap.Config.ALPHA_8};
    private final c a = new c();
    private final ti<b, Bitmap> b = new ti<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> c = new HashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: zi$a */
    /* compiled from: SizeConfigStrategy */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            a = iArr;
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            a[Bitmap.Config.RGB_565.ordinal()] = 2;
            a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            try {
                a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: zi$b */
    /* compiled from: SizeConfigStrategy */
    public static final class b implements yi {
        private final c a;
        public int b;
        private Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        @Override // defpackage.yi
        public void a() {
            this.a.c(this);
        }

        public void b(int i, Bitmap.Config config) {
            this.b = i;
            this.c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b != bVar.b || !fp.c(this.c, bVar.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.b * 31;
            Bitmap.Config config = this.c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return zi.h(this.b, this.c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: zi$c */
    /* compiled from: SizeConfigStrategy */
    public static class c extends pi<b> {
        /* renamed from: d */
        public b a() {
            return new b(this);
        }

        public b e(int i, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.b(i, config);
            return bVar;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        e = configArr;
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> j = j(bitmap.getConfig());
        Integer num2 = (Integer) j.get(num);
        if (num2 == null) {
            throw new NullPointerException(C0201.m82(21797) + num + C0201.m82(21798) + e(bitmap) + C0201.m82(21799) + this);
        } else if (num2.intValue() == 1) {
            j.remove(num);
        } else {
            j.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    private b g(int i, Bitmap.Config config) {
        b e2 = this.a.e(i, config);
        Bitmap.Config[] i2 = i(config);
        for (Bitmap.Config config2 : i2) {
            Integer ceilingKey = j(config2).ceilingKey(Integer.valueOf(i));
            if (ceilingKey != null && ceilingKey.intValue() <= i * 8) {
                if (ceilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return e2;
                        }
                    } else if (config2.equals(config)) {
                        return e2;
                    }
                }
                this.a.c(e2);
                return this.a.e(ceilingKey.intValue(), config2);
            }
        }
        return e2;
    }

    public static String h(int i, Bitmap.Config config) {
        return C0201.m82(21800) + i + C0201.m82(21801) + config + C0201.m82(21802);
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return e;
        }
        int i = a.a[config.ordinal()];
        if (i == 1) {
            return d;
        }
        if (i == 2) {
            return f;
        }
        if (i == 3) {
            return g;
        }
        if (i == 4) {
            return h;
        }
        return new Bitmap.Config[]{config};
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(config, treeMap);
        return treeMap;
    }

    @Override // defpackage.xi
    public String a(int i, int i2, Bitmap.Config config) {
        return h(fp.f(i, i2, config), config);
    }

    @Override // defpackage.xi
    public int b(Bitmap bitmap) {
        return fp.g(bitmap);
    }

    @Override // defpackage.xi
    public void c(Bitmap bitmap) {
        b e2 = this.a.e(fp.g(bitmap), bitmap.getConfig());
        this.b.d(e2, bitmap);
        NavigableMap<Integer, Integer> j = j(bitmap.getConfig());
        Integer num = (Integer) j.get(Integer.valueOf(e2.b));
        Integer valueOf = Integer.valueOf(e2.b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        j.put(valueOf, Integer.valueOf(i));
    }

    @Override // defpackage.xi
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        b g2 = g(fp.f(i, i2, config), config);
        Bitmap a2 = this.b.a(g2);
        if (a2 != null) {
            f(Integer.valueOf(g2.b), a2);
            a2.reconfigure(i, i2, config);
        }
        return a2;
    }

    @Override // defpackage.xi
    public String e(Bitmap bitmap) {
        return h(fp.g(bitmap), bitmap.getConfig());
    }

    @Override // defpackage.xi
    public Bitmap removeLast() {
        Bitmap f2 = this.b.f();
        if (f2 != null) {
            f(Integer.valueOf(fp.g(f2)), f2);
        }
        return f2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(21803));
        sb.append(this.b);
        sb.append(C0201.m82(21804));
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append(C0201.m82(21805));
        }
        if (!this.c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), C0201.m82(21806));
        }
        sb.append(C0201.m82(21807));
        return sb.toString();
    }
}
