package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import defpackage.s2;
import vigqyno.C0201;

/* compiled from: MenuItemImpl */
public final class i implements y1 {
    private View A;
    private s2 B;
    private MenuItem.OnActionExpandListener C;
    private boolean D = false;
    private ContextMenu.ContextMenuInfo E;
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private int i = 4096;
    private char j;
    private int k = 4096;
    private Drawable l;
    private int m = 0;
    public g n;
    private r o;
    private Runnable p;
    private MenuItem.OnMenuItemClickListener q;
    private CharSequence r;
    private CharSequence s;
    private ColorStateList t = null;
    private PorterDuff.Mode u = null;
    private boolean v = false;
    private boolean w = false;
    private boolean x = false;
    private int y = 16;
    private int z = 0;

    /* compiled from: MenuItemImpl */
    class a implements s2.b {
        public a() {
        }

        @Override // defpackage.s2.b
        public void onActionProviderVisibilityChanged(boolean z) {
            i iVar = i.this;
            iVar.n.J(iVar);
        }
    }

    public i(g gVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.n = gVar;
        this.a = i3;
        this.b = i2;
        this.c = i4;
        this.d = i5;
        this.e = charSequence;
        this.z = i6;
    }

    private static void d(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable != null && this.x && (this.v || this.w)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (this.v) {
                androidx.core.graphics.drawable.a.o(drawable, this.t);
            }
            if (this.w) {
                androidx.core.graphics.drawable.a.p(drawable, this.u);
            }
            this.x = false;
        }
        return drawable;
    }

    public boolean A() {
        return this.n.H() && g() != 0;
    }

    public boolean B() {
        return (this.z & 4) == 4;
    }

    @Override // defpackage.y1
    public y1 a(s2 s2Var) {
        s2 s2Var2 = this.B;
        if (s2Var2 != null) {
            s2Var2.h();
        }
        this.A = null;
        this.B = s2Var;
        this.n.K(true);
        s2 s2Var3 = this.B;
        if (s2Var3 != null) {
            s2Var3.j(new a());
        }
        return this;
    }

    @Override // defpackage.y1
    public s2 b() {
        return this.B;
    }

    public void c() {
        this.n.I(this);
    }

    @Override // defpackage.y1
    public boolean collapseActionView() {
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.n.f(this);
        }
        return false;
    }

    @Override // defpackage.y1
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.n.k(this);
        }
        return false;
    }

    public int f() {
        return this.d;
    }

    public char g() {
        return this.n.G() ? this.j : this.h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException(C0201.m82(4966));
    }

    @Override // defpackage.y1
    public View getActionView() {
        View view = this.A;
        if (view != null) {
            return view;
        }
        s2 s2Var = this.B;
        if (s2Var == null) {
            return null;
        }
        View d2 = s2Var.d(this);
        this.A = d2;
        return d2;
    }

    @Override // defpackage.y1
    public int getAlphabeticModifiers() {
        return this.k;
    }

    public char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // defpackage.y1
    public CharSequence getContentDescription() {
        return this.r;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.m == 0) {
            return null;
        }
        Drawable d2 = n.d(this.n.u(), this.m);
        this.m = 0;
        this.l = d2;
        return e(d2);
    }

    @Override // defpackage.y1
    public ColorStateList getIconTintList() {
        return this.t;
    }

    @Override // defpackage.y1
    public PorterDuff.Mode getIconTintMode() {
        return this.u;
    }

    public Intent getIntent() {
        return this.g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.E;
    }

    @Override // defpackage.y1
    public int getNumericModifiers() {
        return this.i;
    }

    public char getNumericShortcut() {
        return this.h;
    }

    public int getOrder() {
        return this.c;
    }

    public SubMenu getSubMenu() {
        return this.o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f;
        if (charSequence == null) {
            charSequence = this.e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    @Override // defpackage.y1
    public CharSequence getTooltipText() {
        return this.s;
    }

    public String h() {
        char g2 = g();
        if (g2 == 0) {
            return C0201.m82(4967);
        }
        Resources resources = this.n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(k.abc_prepend_shortcut_label));
        }
        int i2 = this.n.G() ? this.k : this.i;
        d(sb, i2, 65536, resources.getString(k.abc_menu_meta_shortcut_label));
        d(sb, i2, 4096, resources.getString(k.abc_menu_ctrl_shortcut_label));
        d(sb, i2, 2, resources.getString(k.abc_menu_alt_shortcut_label));
        d(sb, i2, 1, resources.getString(k.abc_menu_shift_shortcut_label));
        d(sb, i2, 4, resources.getString(k.abc_menu_sym_shortcut_label));
        d(sb, i2, 8, resources.getString(k.abc_menu_function_shortcut_label));
        if (g2 == '\b') {
            sb.append(resources.getString(k.abc_menu_delete_shortcut_label));
        } else if (g2 == '\n') {
            sb.append(resources.getString(k.abc_menu_enter_shortcut_label));
        } else if (g2 != ' ') {
            sb.append(g2);
        } else {
            sb.append(resources.getString(k.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.o != null;
    }

    public CharSequence i(n.a aVar) {
        if (aVar == null || !aVar.e()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    @Override // defpackage.y1
    public boolean isActionViewExpanded() {
        return this.D;
    }

    public boolean isCheckable() {
        return (this.y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.y & 16) != 0;
    }

    public boolean isVisible() {
        s2 s2Var = this.B;
        if (s2Var == null || !s2Var.g()) {
            if ((this.y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.y & 8) != 0 || !this.B.b()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean j() {
        s2 s2Var;
        if ((this.z & 8) == 0) {
            return false;
        }
        if (this.A == null && (s2Var = this.B) != null) {
            this.A = s2Var.d(this);
        }
        if (this.A != null) {
            return true;
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        g gVar = this.n;
        if (gVar.h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.g != null) {
            try {
                this.n.u().startActivity(this.g);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e(C0201.m82(4968), C0201.m82(4969), e2);
            }
        }
        s2 s2Var = this.B;
        if (s2Var == null || !s2Var.e()) {
            return false;
        }
        return true;
    }

    public boolean l() {
        return (this.y & 32) == 32;
    }

    public boolean m() {
        return (this.y & 4) != 0;
    }

    public boolean n() {
        return (this.z & 1) == 1;
    }

    public boolean o() {
        return (this.z & 2) == 2;
    }

    public y1 p(int i2) {
        Context u2 = this.n.u();
        q(LayoutInflater.from(u2).inflate(i2, (ViewGroup) new LinearLayout(u2), false));
        return this;
    }

    public y1 q(View view) {
        int i2;
        this.A = view;
        this.B = null;
        if (view != null && view.getId() == -1 && (i2 = this.a) > 0) {
            view.setId(i2);
        }
        this.n.I(this);
        return this;
    }

    public void r(boolean z2) {
        this.D = z2;
        this.n.K(false);
    }

    public void s(boolean z2) {
        int i2 = this.y;
        int i3 = (z2 ? 2 : 0) | (i2 & -3);
        this.y = i3;
        if (i2 != i3) {
            this.n.K(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException(C0201.m82(4970));
    }

    @Override // defpackage.y1, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        p(i2);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        if (this.j == c2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.n.K(false);
        return this;
    }

    public MenuItem setCheckable(boolean z2) {
        int i2 = this.y;
        int i3 = (z2 ? 1 : 0) | (i2 & -2);
        this.y = i3;
        if (i2 != i3) {
            this.n.K(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z2) {
        if ((this.y & 4) != 0) {
            this.n.T(this);
        } else {
            s(z2);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.y |= 16;
        } else {
            this.y &= -17;
        }
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.x = true;
        this.n.K(false);
        return this;
    }

    @Override // defpackage.y1
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.t = colorStateList;
        this.v = true;
        this.x = true;
        this.n.K(false);
        return this;
    }

    @Override // defpackage.y1
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.u = mode;
        this.w = true;
        this.x = true;
        this.n.K(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.n.K(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.j = Character.toLowerCase(c3);
        this.n.K(false);
        return this;
    }

    @Override // defpackage.y1
    public void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 == 0 || i3 == 1 || i3 == 2) {
            this.z = i2;
            this.n.I(this);
            return;
        }
        throw new IllegalArgumentException(C0201.m82(4971));
    }

    @Override // defpackage.y1
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        w(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        this.n.K(false);
        r rVar = this.o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        this.n.K(false);
        return this;
    }

    public MenuItem setVisible(boolean z2) {
        if (y(z2)) {
            this.n.J(this);
        }
        return this;
    }

    public void t(boolean z2) {
        this.y = (z2 ? 4 : 0) | (this.y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z2) {
        if (z2) {
            this.y |= 32;
        } else {
            this.y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.E = contextMenuInfo;
    }

    public y1 w(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public void x(r rVar) {
        this.o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z2) {
        int i2 = this.y;
        int i3 = (z2 ? 0 : 8) | (i2 & -9);
        this.y = i3;
        if (i2 != i3) {
            return true;
        }
        return false;
    }

    public boolean z() {
        return this.n.A();
    }

    @Override // defpackage.y1, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        q(view);
        return this;
    }

    @Override // defpackage.y1
    public y1 setContentDescription(CharSequence charSequence) {
        this.r = charSequence;
        this.n.K(false);
        return this;
    }

    @Override // defpackage.y1
    public y1 setTooltipText(CharSequence charSequence) {
        this.s = charSequence;
        this.n.K(false);
        return this;
    }

    @Override // defpackage.y1
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.j == c2 && this.k == i2) {
            return this;
        }
        this.j = Character.toLowerCase(c2);
        this.k = KeyEvent.normalizeMetaState(i2);
        this.n.K(false);
        return this;
    }

    @Override // defpackage.y1
    public MenuItem setNumericShortcut(char c2, int i2) {
        if (this.h == c2 && this.i == i2) {
            return this;
        }
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.n.K(false);
        return this;
    }

    @Override // defpackage.y1
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.h = c2;
        this.i = KeyEvent.normalizeMetaState(i2);
        this.j = Character.toLowerCase(c3);
        this.k = KeyEvent.normalizeMetaState(i3);
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.l = null;
        this.m = i2;
        this.x = true;
        this.n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        setTitle(this.n.u().getString(i2));
        return this;
    }
}
