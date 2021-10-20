package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.x0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* renamed from: b0  reason: default package */
/* compiled from: SupportMenuInflater */
public class b0 extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;
    public final Object[] a;
    public final Object[] b;
    public Context c;
    private Object d;

    /* access modifiers changed from: private */
    /* renamed from: b0$a */
    /* compiled from: SupportMenuInflater */
    public static class a implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] c = {MenuItem.class};
        private Object a;
        private Method b;

        public a(Object obj, String str) {
            this.a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.b = cls.getMethod(str, c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException(C0201.m82(32753) + str + C0201.m82(32754) + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            w30.p(menuItem);
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    try {
                        return ((Boolean) this.b.invoke(this.a, menuItem)).booleanValue();
                    } finally {
                        w30.q();
                    }
                } else {
                    this.b.invoke(this.a, menuItem);
                    w30.q();
                    return true;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0$b */
    /* compiled from: SupportMenuInflater */
    public class b {
        public s2 A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;
        private Menu a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, b0.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w(C0201.m82(32735), C0201.m82(32734) + str, e2);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!b0.this.c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(b0.this.b(), this.z));
                } else {
                    throw new IllegalStateException(C0201.m82(32736));
                }
            }
            boolean z3 = menuItem instanceof i;
            if (z3) {
                i iVar = (i) menuItem;
            }
            if (this.r >= 2) {
                if (z3) {
                    ((i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, b0.e, b0.this.a));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w(C0201.m82(32737), C0201.m82(32738));
                }
            }
            s2 s2Var = this.A;
            if (s2Var != null) {
                y2.a(menuItem, s2Var);
            }
            y2.c(menuItem, this.B);
            y2.g(menuItem, this.C);
            y2.b(menuItem, this.n, this.o);
            y2.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                y2.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                y2.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.h = true;
            i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = b0.this.c.obtainStyledAttributes(attributeSet, m.MenuGroup);
            this.b = obtainStyledAttributes.getResourceId(m.MenuGroup_android_id, 0);
            this.c = obtainStyledAttributes.getInt(m.MenuGroup_android_menuCategory, 0);
            this.d = obtainStyledAttributes.getInt(m.MenuGroup_android_orderInCategory, 0);
            this.e = obtainStyledAttributes.getInt(m.MenuGroup_android_checkableBehavior, 0);
            this.f = obtainStyledAttributes.getBoolean(m.MenuGroup_android_visible, true);
            this.g = obtainStyledAttributes.getBoolean(m.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            x0 t2 = x0.t(b0.this.c, attributeSet, m.MenuItem);
            this.i = t2.n(m.MenuItem_android_id, 0);
            this.j = (t2.k(m.MenuItem_android_menuCategory, this.c) & -65536) | (t2.k(m.MenuItem_android_orderInCategory, this.d) & 65535);
            this.k = t2.p(m.MenuItem_android_title);
            this.l = t2.p(m.MenuItem_android_titleCondensed);
            this.m = t2.n(m.MenuItem_android_icon, 0);
            this.n = c(t2.o(m.MenuItem_android_alphabeticShortcut));
            this.o = t2.k(m.MenuItem_alphabeticModifiers, 4096);
            this.p = c(t2.o(m.MenuItem_android_numericShortcut));
            this.q = t2.k(m.MenuItem_numericModifiers, 4096);
            if (t2.r(m.MenuItem_android_checkable)) {
                this.r = t2.a(m.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.r = this.e;
            }
            this.s = t2.a(m.MenuItem_android_checked, false);
            this.t = t2.a(m.MenuItem_android_visible, this.f);
            this.u = t2.a(m.MenuItem_android_enabled, this.g);
            this.v = t2.k(m.MenuItem_showAsAction, -1);
            this.z = t2.o(m.MenuItem_android_onClick);
            this.w = t2.n(m.MenuItem_actionLayout, 0);
            this.x = t2.o(m.MenuItem_actionViewClass);
            String o2 = t2.o(m.MenuItem_actionProviderClass);
            this.y = o2;
            boolean z2 = o2 != null;
            if (z2 && this.w == 0 && this.x == null) {
                this.A = (s2) e(this.y, b0.f, b0.this.b);
            } else {
                if (z2) {
                    Log.w(C0201.m82(32739), C0201.m82(32740));
                }
                this.A = null;
            }
            this.B = t2.p(m.MenuItem_contentDescription);
            this.C = t2.p(m.MenuItem_tooltipText);
            if (t2.r(m.MenuItem_iconTintMode)) {
                this.E = e0.e(t2.k(m.MenuItem_iconTintMode, -1), this.E);
            } else {
                this.E = null;
            }
            if (t2.r(m.MenuItem_iconTint)) {
                this.D = t2.c(m.MenuItem_iconTint);
            } else {
                this.D = null;
            }
            t2.v();
            this.h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public b0(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        String r2;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            r2 = C0201.m82(1516);
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(r2)) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(C0201.m82(1517) + name);
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                String r9 = C0201.m82(1518);
                String r10 = C0201.m82(1519);
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            str = null;
                            z2 = false;
                        } else if (name2.equals(r10)) {
                            bVar.h();
                        } else if (name2.equals(r9)) {
                            if (!bVar.d()) {
                                s2 s2Var = bVar.A;
                                if (s2Var == null || !s2Var.a()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals(r2)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(r10)) {
                        bVar.f(attributeSet);
                    } else if (name3.equals(r9)) {
                        bVar.g(attributeSet);
                    } else if (name3.equals(r2)) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z2 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException(C0201.m82(1520));
            }
        }
    }

    public Object b() {
        if (this.d == null) {
            this.d = a(this.c);
        }
        return this.d;
    }

    public void inflate(int i, Menu menu) {
        String r0 = C0201.m82(1521);
        if (!(menu instanceof x1)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.c.getResources().getLayout(i);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e2) {
            throw new InflateException(r0, e2);
        } catch (IOException e3) {
            throw new InflateException(r0, e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
