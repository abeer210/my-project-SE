package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.b;

/* compiled from: ActionMenuItem */
public class a implements y1 {
    private final int a;
    private final int b;
    private final int c;
    private CharSequence d;
    private CharSequence e;
    private Intent f;
    private char g;
    private int h = 4096;
    private char i;
    private int j = 4096;
    private Drawable k;
    private Context l;
    private CharSequence m;
    private CharSequence n;
    private ColorStateList o = null;
    private PorterDuff.Mode p = null;
    private boolean q = false;
    private boolean r = false;
    private int s = 16;

    public a(Context context, int i2, int i3, int i4, int i5, CharSequence charSequence) {
        this.l = context;
        this.a = i3;
        this.b = i2;
        this.c = i5;
        this.d = charSequence;
    }

    private void c() {
        if (this.k == null) {
            return;
        }
        if (this.q || this.r) {
            Drawable r2 = androidx.core.graphics.drawable.a.r(this.k);
            this.k = r2;
            Drawable mutate = r2.mutate();
            this.k = mutate;
            if (this.q) {
                androidx.core.graphics.drawable.a.o(mutate, this.o);
            }
            if (this.r) {
                androidx.core.graphics.drawable.a.p(this.k, this.p);
            }
        }
    }

    @Override // defpackage.y1
    public y1 a(s2 s2Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.y1
    public s2 b() {
        return null;
    }

    @Override // defpackage.y1
    public boolean collapseActionView() {
        return false;
    }

    public y1 d(int i2) {
        throw new UnsupportedOperationException();
    }

    public y1 e(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.y1
    public boolean expandActionView() {
        return false;
    }

    public y1 f(int i2) {
        setShowAsAction(i2);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.y1
    public View getActionView() {
        return null;
    }

    @Override // defpackage.y1
    public int getAlphabeticModifiers() {
        return this.j;
    }

    public char getAlphabeticShortcut() {
        return this.i;
    }

    @Override // defpackage.y1
    public CharSequence getContentDescription() {
        return this.m;
    }

    public int getGroupId() {
        return this.b;
    }

    public Drawable getIcon() {
        return this.k;
    }

    @Override // defpackage.y1
    public ColorStateList getIconTintList() {
        return this.o;
    }

    @Override // defpackage.y1
    public PorterDuff.Mode getIconTintMode() {
        return this.p;
    }

    public Intent getIntent() {
        return this.f;
    }

    public int getItemId() {
        return this.a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // defpackage.y1
    public int getNumericModifiers() {
        return this.h;
    }

    public char getNumericShortcut() {
        return this.g;
    }

    public int getOrder() {
        return this.c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.e;
        return charSequence != null ? charSequence : this.d;
    }

    @Override // defpackage.y1
    public CharSequence getTooltipText() {
        return this.n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    @Override // defpackage.y1
    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.y1, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(int i2) {
        d(i2);
        throw null;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        this.i = Character.toLowerCase(c2);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.s = (z ? 1 : 0) | (this.s & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.s = (z ? 2 : 0) | (this.s & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.s = (z ? 16 : 0) | (this.s & -17);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.k = drawable;
        c();
        return this;
    }

    @Override // defpackage.y1
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        this.q = true;
        c();
        return this;
    }

    @Override // defpackage.y1
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.p = mode;
        this.r = true;
        c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        this.g = c2;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        this.g = c2;
        this.i = Character.toLowerCase(c3);
        return this;
    }

    @Override // defpackage.y1
    public void setShowAsAction(int i2) {
    }

    @Override // defpackage.y1
    public /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        f(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i2 = 8;
        int i3 = this.s & 8;
        if (z) {
            i2 = 0;
        }
        this.s = i3 | i2;
        return this;
    }

    @Override // defpackage.y1, android.view.MenuItem
    public /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        e(view);
        throw null;
    }

    @Override // defpackage.y1
    public MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.i = Character.toLowerCase(c2);
        this.j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // defpackage.y1
    public y1 setContentDescription(CharSequence charSequence) {
        this.m = charSequence;
        return this;
    }

    @Override // defpackage.y1
    public MenuItem setNumericShortcut(char c2, int i2) {
        this.g = c2;
        this.h = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i2) {
        this.d = this.l.getResources().getString(i2);
        return this;
    }

    @Override // defpackage.y1
    public y1 setTooltipText(CharSequence charSequence) {
        this.n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i2) {
        this.k = b.f(this.l, i2);
        c();
        return this;
    }

    @Override // defpackage.y1
    public MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.g = c2;
        this.h = KeyEvent.normalizeMetaState(i2);
        this.i = Character.toLowerCase(c3);
        this.j = KeyEvent.normalizeMetaState(i3);
        return this;
    }
}
