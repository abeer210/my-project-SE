package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;
import java.util.Map;

/* compiled from: BaseMenuWrapper */
public abstract class c {
    public final Context a;
    private Map<y1, MenuItem> b;
    private Map<z1, SubMenu> c;

    public c(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof y1)) {
            return menuItem;
        }
        y1 y1Var = (y1) menuItem;
        if (this.b == null) {
            this.b = new r0();
        }
        MenuItem menuItem2 = this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.a, y1Var);
        this.b.put(y1Var, jVar);
        return jVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof z1)) {
            return subMenu;
        }
        z1 z1Var = (z1) subMenu;
        if (this.c == null) {
            this.c = new r0();
        }
        SubMenu subMenu2 = this.c.get(z1Var);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.a, z1Var);
        this.c.put(z1Var, sVar);
        return sVar;
    }

    public final void e() {
        Map<y1, MenuItem> map = this.b;
        if (map != null) {
            map.clear();
        }
        Map<z1, SubMenu> map2 = this.c;
        if (map2 != null) {
            map2.clear();
        }
    }

    public final void f(int i) {
        Map<y1, MenuItem> map = this.b;
        if (map != null) {
            Iterator<y1> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getGroupId()) {
                    it.remove();
                }
            }
        }
    }

    public final void g(int i) {
        Map<y1, MenuItem> map = this.b;
        if (map != null) {
            Iterator<y1> it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == it.next().getItemId()) {
                    it.remove();
                    return;
                }
            }
        }
    }
}
