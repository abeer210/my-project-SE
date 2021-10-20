package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.reactnativenavigation.views.i;
import com.reactnativenavigation.views.j;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: fi2  reason: default package */
/* compiled from: FabPresenter */
public class fi2 {
    private ViewGroup a;
    private nl2 b;
    private i c;
    private j d;

    private void a(j jVar, re2 re2) {
        if (re2.g.j()) {
            jVar.H(true);
        }
        if (re2.g.g()) {
            jVar.u(true);
        }
        if (re2.b.f()) {
            jVar.setMenuButtonColorNormal(((Integer) re2.b.d()).intValue());
        }
        if (re2.c.f()) {
            jVar.setMenuButtonColorPressed(((Integer) re2.c.d()).intValue());
        }
        if (re2.d.f()) {
            jVar.setMenuButtonColorRipple(((Integer) re2.d.d()).intValue());
        }
        Iterator<i> it = jVar.getActions().iterator();
        while (it.hasNext()) {
            jVar.F(it.next());
        }
        jVar.getActions().clear();
        Iterator<re2> it2 = re2.h.iterator();
        while (it2.hasNext()) {
            re2 next = it2.next();
            i iVar = new i(this.a.getContext(), (String) next.a.d());
            b(iVar, next);
            iVar.setOnClickListener(new gh2(this, re2));
            jVar.getActions().add(iVar);
            jVar.k(iVar);
        }
        if (re2.k.i()) {
            jVar.L(this.b.z());
        }
        if (re2.k.h()) {
            jVar.K();
        }
    }

    private void b(i iVar, re2 re2) {
        if (re2.g.j()) {
            iVar.K(true);
        }
        if (re2.g.g()) {
            iVar.w(true);
        }
        if (re2.b.f()) {
            iVar.setColorNormal(((Integer) re2.b.d()).intValue());
        }
        if (re2.c.f()) {
            iVar.setColorPressed(((Integer) re2.c.d()).intValue());
        }
        if (re2.d.f()) {
            iVar.setColorRipple(((Integer) re2.d.d()).intValue());
        }
        if (re2.e.f()) {
            iVar.O((String) re2.e.d(), re2.f);
        }
        if (re2.l.f()) {
            iVar.setButtonSize(C0201.m82(28252).equals(re2.l.d()) ? 1 : 0);
        }
        if (re2.k.i()) {
            iVar.Q(this.b.z());
        }
        if (re2.k.h()) {
            iVar.P();
        }
    }

    private void d(re2 re2) {
        if (re2.h.size() > 0) {
            j jVar = new j(this.a.getContext(), (String) re2.a.d());
            this.d = jVar;
            z(jVar, re2);
            a(this.d, re2);
            this.a.addView(this.d);
            return;
        }
        i iVar = new i(this.a.getContext(), (String) re2.a.d());
        this.c = iVar;
        z(iVar, re2);
        b(this.c, re2);
        this.c.setOnClickListener(new jh2(this, re2));
        this.a.addView(this.c);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(fi2 fi2, re2 re2, View view) {
        w30.g(view);
        try {
            fi2.m(re2, view);
        } finally {
            w30.h();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void f(nl2 nl2, re2 re2, View view) {
        w30.g(view);
        try {
            n(nl2, re2, view);
        } finally {
            w30.h();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void g(fi2 fi2, re2 re2, View view) {
        w30.g(view);
        try {
            fi2.o(re2, view);
        } finally {
            w30.h();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void h(fi2 fi2, re2 re2, View view) {
        w30.g(view);
        try {
            fi2.p(re2, view);
        } finally {
            w30.h();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void i(nl2 nl2, re2 re2, View view) {
        w30.g(view);
        try {
            q(nl2, re2, view);
        } finally {
            w30.h();
        }
    }

    private /* synthetic */ void m(re2 re2, View view) {
        this.b.b0((String) re2.a.d());
    }

    private static /* synthetic */ void n(nl2 nl2, re2 re2, View view) {
        nl2.b0((String) re2.a.d());
    }

    private /* synthetic */ void o(re2 re2, View view) {
        this.b.b0((String) re2.a.d());
    }

    private /* synthetic */ void p(re2 re2, View view) {
        this.b.b0((String) re2.a.d());
    }

    private static /* synthetic */ void q(nl2 nl2, re2 re2, View view) {
        nl2.b0((String) re2.a.d());
    }

    private void t(j jVar, re2 re2) {
        if (re2.g.i()) {
            jVar.H(true);
        }
        if (re2.g.g()) {
            jVar.u(true);
        }
        if (re2.b.f()) {
            jVar.setMenuButtonColorNormal(((Integer) re2.b.d()).intValue());
        }
        if (re2.c.f()) {
            jVar.setMenuButtonColorPressed(((Integer) re2.c.d()).intValue());
        }
        if (re2.d.f()) {
            jVar.setMenuButtonColorRipple(((Integer) re2.d.d()).intValue());
        }
        if (re2.h.size() > 0) {
            Iterator<i> it = jVar.getActions().iterator();
            while (it.hasNext()) {
                jVar.F(it.next());
            }
            jVar.getActions().clear();
            Iterator<re2> it2 = re2.h.iterator();
            while (it2.hasNext()) {
                re2 next = it2.next();
                i iVar = new i(this.a.getContext(), (String) next.a.d());
                b(iVar, next);
                iVar.setOnClickListener(new ih2(this, re2));
                jVar.getActions().add(iVar);
                jVar.k(iVar);
            }
        }
        if (re2.k.i()) {
            jVar.L(this.b.z());
        }
        if (re2.k.g()) {
            jVar.K();
        }
    }

    private void u(i iVar, re2 re2) {
        if (re2.g.i()) {
            iVar.K(true);
        }
        if (re2.g.g()) {
            iVar.w(true);
        }
        if (re2.b.f()) {
            iVar.setColorNormal(((Integer) re2.b.d()).intValue());
        }
        if (re2.c.f()) {
            iVar.setColorPressed(((Integer) re2.c.d()).intValue());
        }
        if (re2.d.f()) {
            iVar.setColorRipple(((Integer) re2.d.d()).intValue());
        }
        if (re2.e.f()) {
            iVar.O((String) re2.e.d(), re2.f);
        }
        if (re2.l.f()) {
            iVar.setButtonSize(C0201.m82(28253).equals(re2.l.d()) ? 1 : 0);
        }
        if (re2.k.i()) {
            iVar.Q(this.b.z());
        }
        if (re2.k.g()) {
            iVar.P();
        }
    }

    private void w(View view, re2 re2) {
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) qj2.c(view, new CoordinatorLayout.f(-2, -2), lh2.a);
        view.setTag(qd2.fab_bottom_margin, Integer.valueOf(((ViewGroup.MarginLayoutParams) fVar).leftMargin));
        fVar.c = 80;
        if (re2.i.f()) {
            if (C0201.m82(28254).equals(re2.i.d())) {
                fVar.c |= 5;
            }
            if (C0201.m82(28255).equals(re2.i.d())) {
                fVar.c |= 5;
            }
        } else {
            fVar.c |= 5;
        }
        view.setLayoutParams(fVar);
    }

    private void x() {
        i iVar = this.c;
        if (iVar != null) {
            iVar.w(true);
            this.a.removeView(this.c);
            this.c = null;
        }
    }

    private void y() {
        j jVar = this.d;
        if (jVar != null) {
            jVar.u(true);
            this.a.removeView(this.d);
            this.d = null;
        }
    }

    private void z(View view, re2 re2) {
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-2, -2);
        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = (int) this.a.getContext().getResources().getDimension(od2.margin);
        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = (int) this.a.getContext().getResources().getDimension(od2.margin);
        int dimension = (int) this.a.getContext().getResources().getDimension(od2.margin);
        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = dimension;
        view.setTag(qd2.fab_bottom_margin, Integer.valueOf(dimension));
        fVar.c = 80;
        if (re2.i.f()) {
            if (C0201.m82(28256).equals(re2.i.d())) {
                fVar.c |= 5;
            }
            if (C0201.m82(28257).equals(re2.i.d())) {
                fVar.c |= 3;
            }
        } else {
            fVar.c |= 5;
        }
        view.setLayoutParams(fVar);
    }

    public void c(re2 re2, nl2 nl2, ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = nl2;
        if (re2.a.f()) {
            j jVar = this.d;
            if (jVar == null || !jVar.getFabId().equals(re2.a.d())) {
                i iVar = this.c;
                if (iVar == null || !iVar.getFabId().equals(re2.a.d())) {
                    d(re2);
                    return;
                }
                this.c.bringToFront();
                b(this.c, re2);
                z(this.c, re2);
                this.c.setOnClickListener(new kh2(nl2, re2));
                return;
            }
            this.d.bringToFront();
            a(this.d, re2);
            z(this.d, re2);
            return;
        }
        x();
        y();
    }

    public void v(re2 re2, nl2 nl2, ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = nl2;
        if (re2.a.f()) {
            j jVar = this.d;
            if (jVar == null || !jVar.getFabId().equals(re2.a.d())) {
                i iVar = this.c;
                if (iVar == null || !iVar.getFabId().equals(re2.a.d())) {
                    d(re2);
                    return;
                }
                w(this.c, re2);
                this.c.bringToFront();
                u(this.c, re2);
                this.c.setOnClickListener(new hh2(nl2, re2));
                return;
            }
            w(this.d, re2);
            this.d.bringToFront();
            t(this.d, re2);
        }
    }
}
