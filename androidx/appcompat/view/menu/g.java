package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import vigqyno.C0201;

/* compiled from: MenuBuilder */
public class g implements x1 {
    private static final int[] A = {1, 4, 5, 3, 2, 0};
    private final Context a;
    private final Resources b;
    private boolean c;
    private boolean d;
    private a e;
    private ArrayList<i> f;
    private ArrayList<i> g;
    private boolean h;
    private ArrayList<i> i;
    private ArrayList<i> j;
    private boolean k;
    private int l = 0;
    private ContextMenu.ContextMenuInfo m;
    public CharSequence n;
    public Drawable o;
    public View p;
    private boolean q = false;
    private boolean r = false;
    private boolean s = false;
    private boolean t = false;
    private boolean u = false;
    private ArrayList<i> v = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<m>> w = new CopyOnWriteArrayList<>();
    private i x;
    private boolean y = false;
    private boolean z;

    /* compiled from: MenuBuilder */
    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    /* compiled from: MenuBuilder */
    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        this.a = context;
        this.b = context.getResources();
        this.f = new ArrayList<>();
        this.g = new ArrayList<>();
        this.h = true;
        this.i = new ArrayList<>();
        this.j = new ArrayList<>();
        this.k = true;
        b0(true);
    }

    private static int B(int i2) {
        int i3 = (-65536 & i2) >> 16;
        if (i3 >= 0) {
            int[] iArr = A;
            if (i3 < iArr.length) {
                return (i2 & 65535) | (iArr[i3] << 16);
            }
        }
        throw new IllegalArgumentException(C0201.m82(4926));
    }

    private void N(int i2, boolean z2) {
        if (i2 >= 0 && i2 < this.f.size()) {
            this.f.remove(i2);
            if (z2) {
                K(true);
            }
        }
    }

    private void W(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources C = C();
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (i2 > 0) {
                this.n = C.getText(i2);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (i3 > 0) {
                this.o = androidx.core.content.b.f(u(), i3);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        K(false);
    }

    private void b0(boolean z2) {
        boolean z3 = true;
        if (!z2 || this.b.getConfiguration().keyboard == 1 || !l3.e(ViewConfiguration.get(this.a), this.a)) {
            z3 = false;
        }
        this.d = z3;
    }

    private i g(int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        return new i(this, i2, i3, i4, i5, charSequence, i6);
    }

    private void i(boolean z2) {
        if (!this.w.isEmpty()) {
            d0();
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    mVar.d(z2);
                }
            }
            c0();
        }
    }

    private boolean j(r rVar, m mVar) {
        boolean z2 = false;
        if (this.w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z2 = mVar.k(rVar);
        }
        Iterator<WeakReference<m>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null) {
                this.w.remove(next);
            } else if (!z2) {
                z2 = mVar2.k(rVar);
            }
        }
        return z2;
    }

    private static int n(ArrayList<i> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f() <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean A() {
        return this.t;
    }

    public Resources C() {
        return this.b;
    }

    public g D() {
        return this;
    }

    public ArrayList<i> E() {
        if (!this.h) {
            return this.g;
        }
        this.g.clear();
        int size = this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.isVisible()) {
                this.g.add(iVar);
            }
        }
        this.h = false;
        this.k = true;
        return this.g;
    }

    public boolean F() {
        return this.y;
    }

    public boolean G() {
        return this.c;
    }

    public boolean H() {
        return this.d;
    }

    public void I(i iVar) {
        this.k = true;
        K(true);
    }

    public void J(i iVar) {
        this.h = true;
        K(true);
    }

    public void K(boolean z2) {
        if (!this.q) {
            if (z2) {
                this.h = true;
                this.k = true;
            }
            i(z2);
            return;
        }
        this.r = true;
        if (z2) {
            this.s = true;
        }
    }

    public boolean L(MenuItem menuItem, int i2) {
        return M(menuItem, null, i2);
    }

    public boolean M(MenuItem menuItem, m mVar, int i2) {
        i iVar = (i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean k2 = iVar.k();
        s2 b2 = iVar.b();
        boolean z2 = b2 != null && b2.a();
        if (iVar.j()) {
            k2 |= iVar.expandActionView();
            if (k2) {
                e(true);
            }
        } else if (iVar.hasSubMenu() || z2) {
            if ((i2 & 4) == 0) {
                e(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.x(new r(u(), this, iVar));
            }
            r rVar = (r) iVar.getSubMenu();
            if (z2) {
                b2.f(rVar);
            }
            k2 |= j(rVar, mVar);
            if (!k2) {
                e(true);
            }
        } else if ((i2 & 1) == 0) {
            e(true);
        }
        return k2;
    }

    public void O(m mVar) {
        Iterator<WeakReference<m>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar2 = next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.w.remove(next);
            }
        }
    }

    public void P(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(t());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((r) item.getSubMenu()).P(bundle);
                }
            }
            int i3 = bundle.getInt(C0201.m82(4927));
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(C0201.m82(4928), item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(t(), sparseArray);
        }
    }

    public void R(a aVar) {
        this.e = aVar;
    }

    public g S(int i2) {
        this.l = i2;
        return this;
    }

    public void T(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f.size();
        d0();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.f.get(i2);
            if (iVar.getGroupId() == groupId && iVar.m() && iVar.isCheckable()) {
                iVar.s(iVar == menuItem);
            }
        }
        c0();
    }

    public g U(int i2) {
        W(0, null, i2, null, null);
        return this;
    }

    public g V(Drawable drawable) {
        W(0, null, 0, drawable, null);
        return this;
    }

    public g X(int i2) {
        W(i2, null, 0, null, null);
        return this;
    }

    public g Y(CharSequence charSequence) {
        W(0, charSequence, 0, null, null);
        return this;
    }

    public g Z(View view) {
        W(0, null, 0, null, view);
        return this;
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int B = B(i4);
        i g2 = g(i2, i3, i4, B, charSequence, this.l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.m;
        if (contextMenuInfo != null) {
            g2.v(contextMenuInfo);
        }
        ArrayList<i> arrayList = this.f;
        arrayList.add(n(arrayList, B), g2);
        K(true);
        return g2;
    }

    public void a0(boolean z2) {
        this.z = z2;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        int i6;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i7 = 0; i7 < size; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i8 < 0 ? intent : intentArr[i8]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar) {
        c(mVar, this.a);
    }

    public void c(m mVar, Context context) {
        this.w.add(new WeakReference<>(mVar));
        mVar.i(context, this);
        this.k = true;
    }

    public void c0() {
        this.q = false;
        if (this.r) {
            this.r = false;
            K(this.s);
        }
    }

    public void clear() {
        i iVar = this.x;
        if (iVar != null) {
            f(iVar);
        }
        this.f.clear();
        K(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        K(false);
    }

    public void close() {
        e(true);
    }

    public void d() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public void d0() {
        if (!this.q) {
            this.q = true;
            this.r = false;
            this.s = false;
        }
    }

    public final void e(boolean z2) {
        if (!this.u) {
            this.u = true;
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    mVar.c(this, z2);
                }
            }
            this.u = false;
        }
    }

    public boolean f(i iVar) {
        boolean z2 = false;
        if (!this.w.isEmpty() && this.x == iVar) {
            d0();
            Iterator<WeakReference<m>> it = this.w.iterator();
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    z2 = mVar.f(this, iVar);
                    if (z2) {
                        break;
                    }
                }
            }
            c0();
            if (z2) {
                this.x = null;
            }
        }
        return z2;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f.get(i3);
            if (iVar.getItemId() == i2) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public MenuItem getItem(int i2) {
        return this.f.get(i2);
    }

    public boolean h(g gVar, MenuItem menuItem) {
        a aVar = this.e;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public boolean hasVisibleItems() {
        if (this.z) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return p(i2, keyEvent) != null;
    }

    public boolean k(i iVar) {
        boolean z2 = false;
        if (this.w.isEmpty()) {
            return false;
        }
        d0();
        Iterator<WeakReference<m>> it = this.w.iterator();
        while (it.hasNext()) {
            WeakReference<m> next = it.next();
            m mVar = next.get();
            if (mVar == null) {
                this.w.remove(next);
            } else {
                z2 = mVar.g(this, iVar);
                if (z2) {
                    break;
                }
            }
        }
        c0();
        if (z2) {
            this.x = iVar;
        }
        return z2;
    }

    public int l(int i2) {
        return m(i2, 0);
    }

    public int m(int i2, int i3) {
        int size = size();
        if (i3 < 0) {
            i3 = 0;
        }
        while (i3 < size) {
            if (this.f.get(i3).getGroupId() == i2) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public int o(int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            if (this.f.get(i3).getItemId() == i2) {
                return i3;
            }
        }
        return -1;
    }

    public i p(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList<i> arrayList = this.v;
        arrayList.clear();
        q(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean G = G();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = arrayList.get(i3);
            if (G) {
                c2 = iVar.getAlphabeticShortcut();
            } else {
                c2 = iVar.getNumericShortcut();
            }
            if ((c2 == keyData.meta[0] && (metaState & 2) == 0) || ((c2 == keyData.meta[2] && (metaState & 2) != 0) || (G && c2 == '\b' && i2 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return L(findItem(i2), i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        i p2 = p(i2, keyEvent);
        boolean L = p2 != null ? L(p2, i3) : false;
        if ((i3 & 2) != 0) {
            e(true);
        }
        return L;
    }

    public void q(List<i> list, int i2, KeyEvent keyEvent) {
        boolean G = G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.f.size();
            for (int i3 = 0; i3 < size; i3++) {
                i iVar = this.f.get(i3);
                if (iVar.hasSubMenu()) {
                    ((g) iVar.getSubMenu()).q(list, i2, keyEvent);
                }
                char alphabeticShortcut = G ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((G ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (G && alphabeticShortcut == '\b' && i2 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public void r() {
        ArrayList<i> E = E();
        if (this.k) {
            Iterator<WeakReference<m>> it = this.w.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                WeakReference<m> next = it.next();
                m mVar = next.get();
                if (mVar == null) {
                    this.w.remove(next);
                } else {
                    z2 |= mVar.e();
                }
            }
            if (z2) {
                this.i.clear();
                this.j.clear();
                int size = E.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = E.get(i2);
                    if (iVar.l()) {
                        this.i.add(iVar);
                    } else {
                        this.j.add(iVar);
                    }
                }
            } else {
                this.i.clear();
                this.j.clear();
                this.j.addAll(E());
            }
            this.k = false;
        }
    }

    public void removeGroup(int i2) {
        int l2 = l(i2);
        if (l2 >= 0) {
            int size = this.f.size() - l2;
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (i3 >= size || this.f.get(l2).getGroupId() != i2) {
                    K(true);
                } else {
                    N(l2, false);
                    i3 = i4;
                }
            }
            K(true);
        }
    }

    public void removeItem(int i2) {
        N(o(i2), true);
    }

    public ArrayList<i> s() {
        r();
        return this.i;
    }

    public void setGroupCheckable(int i2, boolean z2, boolean z3) {
        int size = this.f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.t(z3);
                iVar.setCheckable(z2);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z2) {
        this.y = z2;
    }

    public void setGroupEnabled(int i2, boolean z2) {
        int size = this.f.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f.get(i3);
            if (iVar.getGroupId() == i2) {
                iVar.setEnabled(z2);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z2) {
        int size = this.f.size();
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.f.get(i3);
            if (iVar.getGroupId() == i2 && iVar.y(z2)) {
                z3 = true;
            }
        }
        if (z3) {
            K(true);
        }
    }

    public void setQwertyMode(boolean z2) {
        this.c = z2;
        K(false);
    }

    public int size() {
        return this.f.size();
    }

    public String t() {
        return C0201.m82(4929);
    }

    public Context u() {
        return this.a;
    }

    public i v() {
        return this.x;
    }

    public Drawable w() {
        return this.o;
    }

    public CharSequence x() {
        return this.n;
    }

    public View y() {
        return this.p;
    }

    public ArrayList<i> z() {
        r();
        return this.j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2) {
        return a(0, 0, 0, this.b.getString(i2));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, this.b.getString(i2));
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        i iVar = (i) a(i2, i3, i4, charSequence);
        r rVar = new r(this.a, this, iVar);
        iVar.x(rVar);
        return rVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.b.getString(i5));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, this.b.getString(i5));
    }
}
