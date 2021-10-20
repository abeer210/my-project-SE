package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: BaseMenuPresenter */
public abstract class b implements m {
    public Context a;
    public Context b;
    public g c;
    public LayoutInflater d;
    private m.a e;
    private int f;
    private int g;
    public n h;

    public b(Context context, int i, int i2) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.f = i;
        this.g = i2;
    }

    public void a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.h).addView(view, i);
    }

    public abstract void b(i iVar, n.a aVar);

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z) {
        m.a aVar = this.e;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.h;
        if (viewGroup != null) {
            g gVar = this.c;
            int i = 0;
            if (gVar != null) {
                gVar.r();
                ArrayList<i> E = this.c.E();
                int size = E.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar = E.get(i3);
                    if (q(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View n = n(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            n.setPressed(false);
                            n.jumpDrawablesToCurrentState();
                        }
                        if (n != childAt) {
                            a(n, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!l(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean g(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.e = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(Context context, g gVar) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = gVar;
    }

    public n.a j(ViewGroup viewGroup) {
        return (n.a) this.d.inflate(this.g, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        m.a aVar = this.e;
        if (aVar != null) {
            return aVar.d(rVar);
        }
        return false;
    }

    public boolean l(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public m.a m() {
        return this.e;
    }

    public View n(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar;
        if (view instanceof n.a) {
            aVar = (n.a) view;
        } else {
            aVar = j(viewGroup);
        }
        b(iVar, aVar);
        return (View) aVar;
    }

    public n o(ViewGroup viewGroup) {
        if (this.h == null) {
            n nVar = (n) this.d.inflate(this.f, viewGroup, false);
            this.h = nVar;
            nVar.b(this.c);
            d(true);
        }
        return this.h;
    }

    public void p(int i) {
    }

    public abstract boolean q(int i, i iVar);
}
