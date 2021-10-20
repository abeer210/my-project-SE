package androidx.fragment.app;

import androidx.lifecycle.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: FragmentTransaction */
public abstract class n {
    public ArrayList<a> a = new ArrayList<>();
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public String i;
    public int j;
    public CharSequence k;
    public int l;
    public CharSequence m;
    public ArrayList<String> n;
    public ArrayList<String> o;
    public boolean p = false;
    public ArrayList<Runnable> q;

    /* access modifiers changed from: package-private */
    /* compiled from: FragmentTransaction */
    public static final class a {
        public int a;
        public Fragment b;
        public int c;
        public int d;
        public int e;
        public int f;
        public d.b g;
        public d.b h;

        public a() {
        }

        public a(int i, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            d.b bVar = d.b.RESUMED;
            this.g = bVar;
            this.h = bVar;
        }
    }

    public n b(Fragment fragment, String str) {
        f(0, fragment, str, 1);
        return this;
    }

    public void c(a aVar) {
        this.a.add(aVar);
        aVar.c = this.b;
        aVar.d = this.c;
        aVar.e = this.d;
        aVar.f = this.e;
    }

    public abstract int d();

    public abstract int e();

    public void f(int i2, Fragment fragment, String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException(C0201.m82(17775) + cls.getCanonicalName() + C0201.m82(17776));
        }
        String r0 = C0201.m82(17768);
        String r1 = C0201.m82(17769);
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 == null || str.equals(str2)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException(C0201.m82(17770) + fragment + r1 + fragment.mTag + r0 + str);
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = fragment.mFragmentId;
                if (i4 == 0 || i4 == i2) {
                    fragment.mFragmentId = i2;
                    fragment.mContainerId = i2;
                } else {
                    throw new IllegalStateException(C0201.m82(17771) + fragment + r1 + fragment.mFragmentId + r0 + i2);
                }
            } else {
                throw new IllegalArgumentException(C0201.m82(17772) + fragment + C0201.m82(17773) + str + C0201.m82(17774));
            }
        }
        c(new a(i3, fragment));
    }

    public n g(Fragment fragment) {
        c(new a(3, fragment));
        return this;
    }
}
