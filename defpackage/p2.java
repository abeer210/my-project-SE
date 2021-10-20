package defpackage;

import java.util.Locale;

/* renamed from: p2  reason: default package */
/* compiled from: TextDirectionHeuristicsCompat */
public final class p2 {
    public static final o2 a = new e(null, false);
    public static final o2 b = new e(null, true);
    public static final o2 c = new e(b.a, false);
    public static final o2 d = new e(b.a, true);

    /* renamed from: p2$a */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class a implements c {
        public static final a b = new a(true);
        private final boolean a;

        private a(boolean z) {
            this.a = z;
        }

        @Override // defpackage.p2.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a2 = p2.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i++;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i++;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: p2$b */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class b implements c {
        public static final b a = new b();

        private b() {
        }

        @Override // defpackage.p2.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = p2.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p2$c */
    /* compiled from: TextDirectionHeuristicsCompat */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: p2$d */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static abstract class d implements o2 {
        private final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        private boolean c(CharSequence charSequence, int i, int i2) {
            int a2 = this.a.a(charSequence, i, i2);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return b();
            }
            return false;
        }

        @Override // defpackage.o2
        public boolean a(CharSequence charSequence, int i, int i2) {
            if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            } else if (this.a == null) {
                return b();
            } else {
                return c(charSequence, i, i2);
            }
        }

        public abstract boolean b();
    }

    /* renamed from: p2$e */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class e extends d {
        private final boolean b;

        public e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // defpackage.p2.d
        public boolean b() {
            return this.b;
        }
    }

    /* renamed from: p2$f */
    /* compiled from: TextDirectionHeuristicsCompat */
    private static class f extends d {
        public static final f b = new f();

        public f() {
            super(null);
        }

        @Override // defpackage.p2.d
        public boolean b() {
            return q2.b(Locale.getDefault()) == 1;
        }
    }

    static {
        a aVar = a.b;
        f fVar = f.b;
    }

    public static int a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
