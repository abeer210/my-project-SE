package defpackage;

import android.view.ViewGroup;
import com.reactnativenavigation.views.BehaviourDelegate;
import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: hi2  reason: default package */
/* compiled from: OverlayManager */
public class hi2 {
    private final HashMap<String, nl2> a = new HashMap<>();

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void f(ViewGroup viewGroup, nl2 nl2) {
        nl2.q();
        this.a.remove(nl2.x());
        if (e()) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean e() {
        return i() == 0;
    }

    public void a(ViewGroup viewGroup) {
        yi2.g(this.a.values(), new nh2(this, viewGroup));
    }

    public void c(ViewGroup viewGroup, String str, aj2 aj2) {
        nl2 nl2 = this.a.get(str);
        if (nl2 == null) {
            aj2.onError(C0201.m82(13096) + str + C0201.m82(13097));
            return;
        }
        f(viewGroup, nl2);
        aj2.a(str);
    }

    public nl2 d(String str) {
        return this.a.get(str);
    }

    public void h(ViewGroup viewGroup, nl2 nl2, aj2 aj2) {
        viewGroup.setVisibility(0);
        this.a.put(nl2.x(), nl2);
        nl2.i(new mh2(aj2, nl2));
        viewGroup.addView(nl2.B(), ej2.b(new BehaviourDelegate(nl2)));
    }

    public int i() {
        return this.a.size();
    }
}
