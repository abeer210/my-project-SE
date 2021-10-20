package defpackage;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import vigqyno.C0201;

/* renamed from: l2  reason: default package */
/* compiled from: BidiFormatter */
public final class l2 {
    public static final o2 d = p2.c;
    private static final String e = Character.toString(8206);
    private static final String f = Character.toString(8207);
    public static final l2 g = new l2(false, 2, d);
    public static final l2 h = new l2(true, 2, d);
    private final boolean a;
    private final int b;
    private final o2 c;

    /* renamed from: l2$a */
    /* compiled from: BidiFormatter */
    public static final class a {
        private boolean a;
        private int b;
        private o2 c;

        public a() {
            c(l2.e(Locale.getDefault()));
        }

        private static l2 b(boolean z) {
            return z ? l2.h : l2.g;
        }

        private void c(boolean z) {
            this.a = z;
            this.c = l2.d;
            this.b = 2;
        }

        public l2 a() {
            if (this.b == 2 && this.c == l2.d) {
                return b(this.a);
            }
            return new l2(this.a, this.b, this.c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l2$b */
    /* compiled from: BidiFormatter */
    public static class b {
        private static final byte[] f = new byte[1792];
        private final CharSequence a;
        private final boolean b;
        private final int c;
        private int d;
        private char e;

        static {
            for (int i = 0; i < 1792; i++) {
                f[i] = Character.getDirectionality(i);
            }
        }

        public b(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.b = z;
            this.c = charSequence.length();
        }

        private static byte c(char c2) {
            return c2 < 1792 ? f[c2] : Character.getDirectionality(c2);
        }

        private byte f() {
            char charAt;
            int i = this.d;
            do {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.d = i3;
                charAt = charSequence.charAt(i3);
                this.e = charAt;
                if (charAt == '&') {
                    return 12;
                }
            } while (charAt != ';');
            this.d = i;
            this.e = ';';
            return 13;
        }

        private byte g() {
            char charAt;
            do {
                int i = this.d;
                if (i >= this.c) {
                    return 12;
                }
                CharSequence charSequence = this.a;
                this.d = i + 1;
                charAt = charSequence.charAt(i);
                this.e = charAt;
            } while (charAt != ';');
            return 12;
        }

        private byte h() {
            char charAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 <= 0) {
                    break;
                }
                CharSequence charSequence = this.a;
                int i3 = i2 - 1;
                this.d = i3;
                char charAt2 = charSequence.charAt(i3);
                this.e = charAt2;
                if (charAt2 == '<') {
                    return 12;
                }
                if (charAt2 == '>') {
                    break;
                } else if (charAt2 == '\"' || charAt2 == '\'') {
                    char c2 = this.e;
                    do {
                        int i4 = this.d;
                        if (i4 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.a;
                        int i5 = i4 - 1;
                        this.d = i5;
                        charAt = charSequence2.charAt(i5);
                        this.e = charAt;
                    } while (charAt != c2);
                }
            }
            this.d = i;
            this.e = '>';
            return 13;
        }

        private byte i() {
            char charAt;
            int i = this.d;
            while (true) {
                int i2 = this.d;
                if (i2 < this.c) {
                    CharSequence charSequence = this.a;
                    this.d = i2 + 1;
                    char charAt2 = charSequence.charAt(i2);
                    this.e = charAt2;
                    if (charAt2 == '>') {
                        return 12;
                    }
                    if (charAt2 == '\"' || charAt2 == '\'') {
                        char c2 = this.e;
                        do {
                            int i3 = this.d;
                            if (i3 >= this.c) {
                                break;
                            }
                            CharSequence charSequence2 = this.a;
                            this.d = i3 + 1;
                            charAt = charSequence2.charAt(i3);
                            this.e = charAt;
                        } while (charAt != c2);
                    }
                } else {
                    this.d = i;
                    this.e = '<';
                    return 13;
                }
            }
        }

        public byte a() {
            char charAt = this.a.charAt(this.d - 1);
            this.e = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.a, this.d);
                this.d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.d--;
            byte c2 = c(this.e);
            if (!this.b) {
                return c2;
            }
            char c3 = this.e;
            if (c3 == '>') {
                return h();
            }
            return c3 == ';' ? f() : c2;
        }

        public byte b() {
            char charAt = this.a.charAt(this.d);
            this.e = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.a, this.d);
                this.d += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.d++;
            byte c2 = c(this.e);
            if (!this.b) {
                return c2;
            }
            char c3 = this.e;
            if (c3 == '<') {
                return i();
            }
            return c3 == '&' ? g() : c2;
        }

        public int d() {
            this.d = 0;
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (this.d < this.c && i == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (i3 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                break;
                            case 16:
                            case 17:
                                i3++;
                                i2 = 1;
                                break;
                            case 18:
                                i3--;
                                i2 = 0;
                                break;
                        }
                    }
                } else if (i3 == 0) {
                    return -1;
                }
                i = i3;
            }
            if (i == 0) {
                return 0;
            }
            if (i2 != 0) {
                return i2;
            }
            while (this.d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i == i3) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i == i3) {
                            return 1;
                        }
                        break;
                    case 18:
                        i3++;
                        continue;
                }
                i3--;
            }
            return 0;
        }

        public int e() {
            this.d = this.c;
            int i = 0;
            int i2 = 0;
            while (this.d > 0) {
                byte a2 = a();
                if (a2 != 0) {
                    if (a2 == 1 || a2 == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 != 0) {
                        }
                    } else if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i == 0) {
                    return -1;
                } else {
                    if (i2 != 0) {
                    }
                }
                i2 = i;
            }
            return 0;
        }
    }

    public l2(boolean z, int i, o2 o2Var) {
        this.a = z;
        this.b = i;
        this.c = o2Var;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static l2 c() {
        return new a().a();
    }

    public static boolean e(Locale locale) {
        return q2.b(locale) == 1;
    }

    private String f(CharSequence charSequence, o2 o2Var) {
        boolean a2 = o2Var.a(charSequence, 0, charSequence.length());
        if (this.a || (!a2 && b(charSequence) != 1)) {
            return (!this.a || (a2 && b(charSequence) != -1)) ? C0201.m82(25031) : f;
        }
        return e;
    }

    private String g(CharSequence charSequence, o2 o2Var) {
        boolean a2 = o2Var.a(charSequence, 0, charSequence.length());
        if (this.a || (!a2 && a(charSequence) != 1)) {
            return (!this.a || (a2 && a(charSequence) != -1)) ? C0201.m82(25032) : f;
        }
        return e;
    }

    public boolean d() {
        return (this.b & 2) != 0;
    }

    public CharSequence h(CharSequence charSequence) {
        return i(charSequence, this.c, true);
    }

    public CharSequence i(CharSequence charSequence, o2 o2Var, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean a2 = o2Var.a(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (d() && z) {
            spannableStringBuilder.append((CharSequence) g(charSequence, a2 ? p2.b : p2.a));
        }
        if (a2 != this.a) {
            spannableStringBuilder.append(a2 ? (char) 8235 : 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) f(charSequence, a2 ? p2.b : p2.a));
        }
        return spannableStringBuilder;
    }
}
