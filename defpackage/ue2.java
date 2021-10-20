package defpackage;

import android.app.Activity;
import com.reactnativenavigation.views.g;
import com.reactnativenavigation.views.topbar.c;
import defpackage.ve2;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: ue2  reason: default package */
/* compiled from: LayoutFactory */
public class ue2 {
    private Activity a;
    private dl2 b;
    private final si0 c;
    private oi2 d;
    private Map<String, nm2> e;
    private bf2 f = new bf2();
    private vj2 g;

    /* access modifiers changed from: package-private */
    /* renamed from: ue2$a */
    /* compiled from: LayoutFactory */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[ve2.a.values().length];
            a = iArr;
            iArr[ve2.a.Component.ordinal()] = 1;
            a[ve2.a.ExternalComponent.ordinal()] = 2;
            a[ve2.a.Stack.ordinal()] = 3;
            a[ve2.a.BottomTabs.ordinal()] = 4;
            a[ve2.a.SideMenuRoot.ordinal()] = 5;
            a[ve2.a.SideMenuCenter.ordinal()] = 6;
            a[ve2.a.SideMenuLeft.ordinal()] = 7;
            a[ve2.a.SideMenuRight.ordinal()] = 8;
            try {
                a[ve2.a.TopTabs.ordinal()] = 9;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public ue2(si0 si0) {
        this.c = si0;
    }

    private nl2 b(ve2 ve2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ve2.d.size(); i++) {
            arrayList.add(a(ve2.d.get(i)));
        }
        bi2 bi2 = new bi2(arrayList, this.f);
        return new fm2(this.a, arrayList, this.b, this.d, new kj2(), ve2.a, bf2.k(this.g, ve2.a()), new ii2(this.a, this.f), new em2(arrayList, bi2, this.f), bi2, new ai2(this.a, arrayList, new kj2(), this.f));
    }

    private List<nl2> c(List<ve2> list) {
        ArrayList arrayList = new ArrayList();
        for (ve2 ve2 : list) {
            arrayList.add(a(ve2));
        }
        return arrayList;
    }

    private nl2 d(ve2 ve2) {
        return new el2(this.a, this.b, ve2.a, ve2.c.optString(C0201.m82(29370)), new g(this.c), bf2.k(this.g, ve2.a()), new ii2(this.a, this.f), new ci2(this.f));
    }

    private nl2 e(ve2 ve2) {
        qe2 a2 = qe2.a(ve2.c);
        Activity activity = this.a;
        si0 si0 = this.c;
        return new om2(activity, this.b, ve2.a, new ii2(activity, this.f), a2, this.e.get(a2.a.d()), si0, new oi2(si0.v()), new ei2(), bf2.k(this.g, ve2.a()));
    }

    private nl2 f(ve2 ve2) {
        return a(ve2.d.get(0));
    }

    private nl2 g(ve2 ve2) {
        return a(ve2.d.get(0));
    }

    private nl2 h(ve2 ve2) {
        return a(ve2.d.get(0));
    }

    private nl2 i(ve2 ve2) {
        fn2 fn2 = new fn2(this.a, this.b, ve2.a, bf2.k(this.g, ve2.a()), new li2(), new ii2(this.a, this.f));
        nl2 nl2 = null;
        nl2 nl22 = null;
        nl2 nl23 = null;
        for (ve2 ve22 : ve2.d) {
            int i = a.a[ve22.b.ordinal()];
            if (i == 6) {
                nl2 = a(ve22);
                nl2.d0(fn2);
            } else if (i == 7) {
                nl22 = a(ve22);
                nl22.d0(fn2);
            } else if (i == 8) {
                nl23 = a(ve22);
                nl23.d0(fn2);
            } else {
                throw new IllegalArgumentException(C0201.m82(29371) + ve2.b);
            }
        }
        if (nl2 != null) {
            fn2.O0(nl2);
        }
        if (nl22 != null) {
            fn2.P0(nl22);
        }
        if (nl23 != null) {
            fn2.Q0(nl23);
        }
        return fn2;
    }

    private nl2 j(ve2 ve2) {
        rn2 rn2 = new rn2(this.a, this.d);
        rn2.c(c(ve2.d));
        rn2.b(this.b);
        rn2.h(new yn2());
        rn2.d(ve2.a);
        rn2.e(bf2.k(this.g, ve2.a()));
        rn2.g(new mi2(this.a, new hp2(this.c), new c(this.c), new ep2(this.c), new jm2(this.a, new kj2()), new ji2(), this.f));
        rn2.f(new ii2(this.a, this.f));
        return rn2.a();
    }

    private nl2 k(ve2 ve2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ve2.d.size(); i++) {
            nl2 a2 = a(ve2.d.get(i));
            bf2.k(this.g, ve2.d.get(i).a()).l(i);
            arrayList.add(a2);
        }
        Activity activity = this.a;
        return new ho2(activity, this.b, ve2.a, arrayList, new lp2(activity, arrayList), bf2.k(this.g, ve2.a()), new ii2(this.a, this.f));
    }

    public nl2 a(ve2 ve2) {
        switch (a.a[ve2.b.ordinal()]) {
            case 1:
                return d(ve2);
            case 2:
                return e(ve2);
            case 3:
                return j(ve2);
            case 4:
                return b(ve2);
            case 5:
                return i(ve2);
            case 6:
                return f(ve2);
            case 7:
                return g(ve2);
            case 8:
                return h(ve2);
            case 9:
                return k(ve2);
            default:
                throw new IllegalArgumentException(C0201.m82(29372) + ve2.b);
        }
    }

    public void l(Activity activity, oi2 oi2, dl2 dl2, Map<String, nm2> map) {
        this.a = activity;
        this.d = oi2;
        this.b = dl2;
        this.e = map;
        this.g = new vj2(activity);
    }

    public void m(bf2 bf2) {
        vi2.a(bf2);
        this.f = bf2;
    }
}
