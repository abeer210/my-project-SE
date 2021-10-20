package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.b;
import androidx.appcompat.view.menu.m;

/* compiled from: MenuDialogHelper */
public class h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, m.a {
    private g a;
    private b b;
    public e c;
    private m.a d;

    public h(g gVar) {
        this.a = gVar;
    }

    public void a() {
        b bVar = this.b;
        if (bVar != null) {
            bVar.dismiss();
        }
    }

    public void b(IBinder iBinder) {
        g gVar = this.a;
        b.a aVar = new b.a(gVar.u());
        e eVar = new e(aVar.b(), j.abc_list_menu_item_layout);
        this.c = eVar;
        eVar.h(this);
        this.a.b(this.c);
        aVar.c(this.c.a(), this);
        View y = gVar.y();
        if (y != null) {
            aVar.e(y);
        } else {
            aVar.f(gVar.w());
            aVar.l(gVar.x());
        }
        aVar.i(this);
        b a2 = aVar.a();
        this.b = a2;
        a2.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.b.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.b.show();
    }

    @Override // androidx.appcompat.view.menu.m.a
    public void c(g gVar, boolean z) {
        if (z || gVar == this.a) {
            a();
        }
        m.a aVar = this.d;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.m.a
    public boolean d(g gVar) {
        m.a aVar = this.d;
        if (aVar != null) {
            return aVar.d(gVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.L((i) this.c.a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.c.c(this.a, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.b.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.b.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.a.e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.a.performShortcut(i, keyEvent, 0);
    }
}
