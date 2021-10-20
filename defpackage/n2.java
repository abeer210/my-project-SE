package defpackage;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import androidx.core.util.c;
import vigqyno.C0201;

/* renamed from: n2  reason: default package */
/* compiled from: PrecomputedTextCompat */
public class n2 implements Spannable {
    private final Spannable a;
    private final a b;

    public a a() {
        return this.b;
    }

    public char charAt(int i) {
        return this.a.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.a.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.a.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.a.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.a.getSpans(i, i2, cls);
    }

    public int length() {
        return this.a.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.a.nextSpanTransition(i, i2, cls);
    }

    public void removeSpan(Object obj) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.a.removeSpan(obj);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(29379));
    }

    public void setSpan(Object obj, int i, int i2, int i3) {
        if (!(obj instanceof MetricAffectingSpan)) {
            this.a.setSpan(obj, i, i2, i3);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(29380));
    }

    public CharSequence subSequence(int i, int i2) {
        return this.a.subSequence(i, i2);
    }

    public String toString() {
        return this.a.toString();
    }

    /* renamed from: n2$a */
    /* compiled from: PrecomputedTextCompat */
    public static final class a {
        private final TextPaint a;
        private final TextDirectionHeuristic b;
        private final int c;
        private final int d;
        public final PrecomputedText.Params e = null;

        /* renamed from: n2$a$a  reason: collision with other inner class name */
        /* compiled from: PrecomputedTextCompat */
        public static class C0155a {
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;
            private int d;

            public C0155a(TextPaint textPaint) {
                this.a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.c = 1;
                    this.d = 1;
                } else {
                    this.d = 0;
                    this.c = 0;
                }
                if (Build.VERSION.SDK_INT >= 18) {
                    this.b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.b = null;
                }
            }

            public a a() {
                return new a(this.a, this.b, this.c, this.d);
            }

            public C0155a b(int i) {
                this.c = i;
                return this;
            }

            public C0155a c(int i) {
                this.d = i;
                return this;
            }

            public C0155a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i;
            this.d = i2;
        }

        public boolean a(a aVar) {
            PrecomputedText.Params params = this.e;
            if (params != null) {
                return params.equals(aVar.e);
            }
            if ((Build.VERSION.SDK_INT >= 23 && (this.c != aVar.b() || this.d != aVar.c())) || this.a.getTextSize() != aVar.e().getTextSize() || this.a.getTextScaleX() != aVar.e().getTextScaleX() || this.a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((Build.VERSION.SDK_INT >= 21 && (this.a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                if (!this.a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            if (this.a.getTypeface() == null) {
                if (aVar.e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.a.getTypeface().equals(aVar.e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.b == aVar.d();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            } else if (i >= 21) {
                return c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            } else if (i >= 18) {
                return c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            } else if (i >= 17) {
                return c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            } else {
                return c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(C0201.m82(30899));
            sb.append(C0201.m82(30900) + this.a.getTextSize());
            sb.append(C0201.m82(30901) + this.a.getTextScaleX());
            sb.append(C0201.m82(30902) + this.a.getTextSkewX());
            if (Build.VERSION.SDK_INT >= 21) {
                sb.append(C0201.m82(30903) + this.a.getLetterSpacing());
                sb.append(C0201.m82(30904) + this.a.isElegantTextHeight());
            }
            int i = Build.VERSION.SDK_INT;
            String r3 = C0201.m82(30905);
            if (i >= 24) {
                sb.append(r3 + this.a.getTextLocales());
            } else if (i >= 17) {
                sb.append(r3 + this.a.getTextLocale());
            }
            sb.append(C0201.m82(30906) + this.a.getTypeface());
            if (Build.VERSION.SDK_INT >= 26) {
                sb.append(C0201.m82(30907) + this.a.getFontVariationSettings());
            }
            sb.append(C0201.m82(30908) + this.b);
            sb.append(C0201.m82(30909) + this.c);
            sb.append(C0201.m82(30910) + this.d);
            sb.append(C0201.m82(30911));
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
        }
    }
}
