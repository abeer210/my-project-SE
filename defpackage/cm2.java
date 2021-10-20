package defpackage;

import android.view.ViewGroup;
import com.reactnativenavigation.views.bottomtabs.BottomTabsBehaviour;
import java.util.List;

/* renamed from: cm2  reason: default package */
/* compiled from: AttachMode */
public abstract class cm2 {
    public final ViewGroup a;
    public final List<nl2> b;
    public final nl2 c;

    /* renamed from: cm2$a */
    /* compiled from: AttachMode */
    static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[kf2.values().length];
            a = iArr;
            iArr[kf2.AFTER_INITIAL_TAB.ordinal()] = 1;
            a[kf2.ON_SWITCH_TO_TAB.ordinal()] = 2;
            a[kf2.UNDEFINED.ordinal()] = 3;
            try {
                a[kf2.TOGETHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public cm2(ViewGroup viewGroup, List<nl2> list, bi2 bi2, bf2 bf2) {
        this.a = viewGroup;
        this.b = list;
        this.c = list.get(((Integer) bf2.e.f.e(0)).intValue());
    }

    public static cm2 d(ViewGroup viewGroup, List<nl2> list, bi2 bi2, bf2 bf2) {
        int i = a.a[bf2.e.k.ordinal()];
        if (i == 1) {
            return new bm2(viewGroup, list, bi2, bf2);
        }
        if (i != 2) {
            return new im2(viewGroup, list, bi2, bf2);
        }
        return new gm2(viewGroup, list, bi2, bf2);
    }

    public abstract void a();

    public void b(nl2 nl2) {
        ViewGroup B = nl2.B();
        B.setVisibility(nl2 == this.c ? 0 : 4);
        this.a.addView(B, ej2.b(new BottomTabsBehaviour(nl2.y())));
    }

    public void c() {
    }

    public void e(nl2 nl2) {
    }
}
