package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter */
public class e implements m, AdapterView.OnItemClickListener {
    public Context a;
    public LayoutInflater b;
    public g c;
    public ExpandedMenuView d;
    public int e;
    public int f;
    public int g;
    private m.a h;
    public a i;

    /* access modifiers changed from: private */
    /* compiled from: ListMenuPresenter */
    public class a extends BaseAdapter {
        private int a = -1;

        public a() {
            a();
        }

        public void a() {
            i v = e.this.c.v();
            if (v != null) {
                ArrayList<i> z = e.this.c.z();
                int size = z.size();
                for (int i = 0; i < size; i++) {
                    if (z.get(i) == v) {
                        this.a = i;
                        return;
                    }
                }
            }
            this.a = -1;
        }

        /* renamed from: b */
        public i getItem(int i) {
            ArrayList<i> z = e.this.c.z();
            int i2 = i + e.this.e;
            int i3 = this.a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return z.get(i2);
        }

        public int getCount() {
            int size = e.this.c.z().size() - e.this.e;
            return this.a < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.b.inflate(eVar.g, viewGroup, false);
            }
            ((n.a) view).f(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i2) {
        this(i2, 0);
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.i == null) {
            this.i = new a();
        }
        return this.i;
    }

    public n b(ViewGroup viewGroup) {
        if (this.d == null) {
            this.d = (ExpandedMenuView) this.b.inflate(j.abc_expanded_menu_layout, viewGroup, false);
            if (this.i == null) {
                this.i = new a();
            }
            this.d.setAdapter((ListAdapter) this.i);
            this.d.setOnItemClickListener(this);
        }
        return this.d;
    }

    @Override // androidx.appcompat.view.menu.m
    public void c(g gVar, boolean z) {
        m.a aVar = this.h;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void d(boolean z) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e() {
        return false;
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
        this.h = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public void i(Context context, g gVar) {
        if (this.f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f);
            this.a = contextThemeWrapper;
            this.b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = gVar;
        a aVar = this.i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean k(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).b(null);
        m.a aVar = this.h;
        if (aVar == null) {
            return true;
        }
        aVar.d(rVar);
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
        w30.l(view, i2);
        try {
            this.c.M(this.i.getItem(i2), this, 0);
        } finally {
            w30.m();
        }
    }

    public e(int i2, int i3) {
        this.g = i2;
        this.f = i3;
    }
}
