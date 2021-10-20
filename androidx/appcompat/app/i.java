package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.y0;
import java.util.ArrayList;

/* compiled from: ToolbarActionBar */
public class i extends a {
    public d0 a;
    public boolean b;
    public Window.Callback c;
    private boolean d;
    private boolean e;
    private ArrayList<a.b> f = new ArrayList<>();
    private final Runnable g = new a();
    private final Toolbar.f h = new b();

    /* compiled from: ToolbarActionBar */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            i.this.y();
        }
    }

    /* compiled from: ToolbarActionBar */
    class b implements Toolbar.f {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.f
        public boolean onMenuItemClick(MenuItem menuItem) {
            return i.this.c.onMenuItemSelected(0, menuItem);
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ToolbarActionBar */
    public final class c implements m.a {
        private boolean a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void c(g gVar, boolean z) {
            if (!this.a) {
                this.a = true;
                i.this.a.h();
                Window.Callback callback = i.this.c;
                if (callback != null) {
                    callback.onPanelClosed(108, gVar);
                }
                this.a = false;
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean d(g gVar) {
            Window.Callback callback = i.this.c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ToolbarActionBar */
    public final class d implements g.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(g gVar) {
            i iVar = i.this;
            if (iVar.c == null) {
                return;
            }
            if (iVar.a.b()) {
                i.this.c.onPanelClosed(108, gVar);
            } else if (i.this.c.onPreparePanel(0, null, gVar)) {
                i.this.c.onMenuOpened(108, gVar);
            }
        }
    }

    /* compiled from: ToolbarActionBar */
    private class e extends d0 {
        public e(Window.Callback callback) {
            super(callback);
        }

        @Override // defpackage.d0
        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(i.this.a.getContext());
            }
            return super.onCreatePanelView(i);
        }

        @Override // defpackage.d0
        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                i iVar = i.this;
                if (!iVar.b) {
                    iVar.a.c();
                    i.this.b = true;
                }
            }
            return onPreparePanel;
        }
    }

    public i(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        this.a = new y0(toolbar, false);
        e eVar = new e(callback);
        this.c = eVar;
        this.a.setWindowCallback(eVar);
        toolbar.setOnMenuItemClickListener(this.h);
        this.a.setWindowTitle(charSequence);
    }

    private Menu w() {
        if (!this.d) {
            this.a.p(new c(), new d());
            this.d = true;
        }
        return this.a.l();
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        return this.a.f();
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        if (!this.a.j()) {
            return false;
        }
        this.a.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z) {
        if (z != this.e) {
            this.e = z;
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                this.f.get(i).a(z);
            }
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.a.s();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        return this.a.getContext();
    }

    @Override // androidx.appcompat.app.a
    public boolean l() {
        this.a.q().removeCallbacks(this.g);
        k3.a0(this.a.q(), this.g);
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        super.m(configuration);
    }

    @Override // androidx.appcompat.app.a
    public void n() {
        this.a.q().removeCallbacks(this.g);
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i, KeyEvent keyEvent) {
        Menu w = w();
        if (w == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        w.setQwertyMode(z);
        return w.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public boolean p(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            q();
        }
        return true;
    }

    @Override // androidx.appcompat.app.a
    public boolean q() {
        return this.a.g();
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
        z(z ? 8 : 0, 8);
    }

    @Override // androidx.appcompat.app.a
    public void t(boolean z) {
    }

    @Override // androidx.appcompat.app.a
    public void u(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public Window.Callback x() {
        return this.c;
    }

    public void y() {
        Menu w = w();
        g gVar = w instanceof g ? (g) w : null;
        if (gVar != null) {
            gVar.d0();
        }
        try {
            w.clear();
            if (!this.c.onCreatePanelMenu(0, w) || !this.c.onPreparePanel(0, null, w)) {
                w.clear();
            }
        } finally {
            if (gVar != null) {
                gVar.c0();
            }
        }
    }

    public void z(int i, int i2) {
        this.a.k((i & i2) | ((i2 ^ -1) & this.a.s()));
    }
}
