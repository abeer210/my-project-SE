package androidx.fragment.app;

import android.util.Log;
import androidx.core.util.b;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import java.io.PrintWriter;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: BackStackRecord */
public final class a extends n implements j.k {
    public final j r;
    public boolean s;
    public int t = -1;

    public a(j jVar) {
        this.r = jVar;
    }

    private static boolean r(n.a aVar) {
        Fragment fragment = aVar.b;
        return fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed();
    }

    @Override // androidx.fragment.app.j.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (j.K) {
            Log.v(C0201.m82(19189), C0201.m82(19188) + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.h) {
            return true;
        }
        this.r.k(this);
        return true;
    }

    @Override // androidx.fragment.app.n
    public int d() {
        return i(false);
    }

    @Override // androidx.fragment.app.n
    public int e() {
        return i(true);
    }

    @Override // androidx.fragment.app.n
    public void f(int i, Fragment fragment, String str, int i2) {
        super.f(i, fragment, str, i2);
        fragment.mFragmentManager = this.r;
    }

    @Override // androidx.fragment.app.n
    public n g(Fragment fragment) {
        j jVar = fragment.mFragmentManager;
        if (jVar == null || jVar == this.r) {
            super.g(fragment);
            return this;
        }
        throw new IllegalStateException(C0201.m82(19190) + fragment.toString() + C0201.m82(19191));
    }

    public void h(int i) {
        if (this.h) {
            boolean z = j.K;
            String r1 = C0201.m82(19192);
            if (z) {
                Log.v(r1, C0201.m82(19193) + this + C0201.m82(19194) + i);
            }
            int size = this.a.size();
            for (int i2 = 0; i2 < size; i2++) {
                n.a aVar = this.a.get(i2);
                Fragment fragment = aVar.b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i;
                    if (j.K) {
                        Log.v(r1, C0201.m82(19195) + aVar.b + C0201.m82(19196) + aVar.b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public int i(boolean z) {
        if (!this.s) {
            if (j.K) {
                String r1 = C0201.m82(19198);
                Log.v(r1, C0201.m82(19197) + this);
                PrintWriter printWriter = new PrintWriter(new b(r1));
                j(C0201.m82(19199), printWriter);
                printWriter.close();
            }
            this.s = true;
            if (this.h) {
                this.t = this.r.n(this);
            } else {
                this.t = -1;
            }
            this.r.i0(this, z);
            return this.t;
        }
        throw new IllegalStateException(C0201.m82(19200));
    }

    public void j(String str, PrintWriter printWriter) {
        k(str, printWriter, true);
    }

    public void k(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print(C0201.m82(19201));
            printWriter.print(this.i);
            printWriter.print(C0201.m82(19202));
            printWriter.print(this.t);
            printWriter.print(C0201.m82(19203));
            printWriter.println(this.s);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print(C0201.m82(19204));
                printWriter.print(Integer.toHexString(this.f));
                printWriter.print(C0201.m82(19205));
                printWriter.println(Integer.toHexString(this.g));
            }
            if (!(this.b == 0 && this.c == 0)) {
                printWriter.print(str);
                printWriter.print(C0201.m82(19206));
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(C0201.m82(19207));
                printWriter.println(Integer.toHexString(this.c));
            }
            if (!(this.d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print(C0201.m82(19208));
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(C0201.m82(19209));
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.j == 0 && this.k == null)) {
                printWriter.print(str);
                printWriter.print(C0201.m82(19210));
                printWriter.print(Integer.toHexString(this.j));
                printWriter.print(C0201.m82(19211));
                printWriter.println(this.k);
            }
            if (!(this.l == 0 && this.m == null)) {
                printWriter.print(str);
                printWriter.print(C0201.m82(19212));
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(C0201.m82(19213));
                printWriter.println(this.m);
            }
        }
        if (!this.a.isEmpty()) {
            printWriter.print(str);
            printWriter.println(C0201.m82(19214));
            int size = this.a.size();
            for (int i = 0; i < size; i++) {
                n.a aVar = this.a.get(i);
                switch (aVar.a) {
                    case 0:
                        str2 = C0201.m82(19226);
                        break;
                    case 1:
                        str2 = C0201.m82(19225);
                        break;
                    case 2:
                        str2 = C0201.m82(19224);
                        break;
                    case 3:
                        str2 = C0201.m82(19223);
                        break;
                    case 4:
                        str2 = C0201.m82(19222);
                        break;
                    case 5:
                        str2 = C0201.m82(19221);
                        break;
                    case 6:
                        str2 = C0201.m82(19220);
                        break;
                    case 7:
                        str2 = C0201.m82(19219);
                        break;
                    case 8:
                        str2 = C0201.m82(19218);
                        break;
                    case 9:
                        str2 = C0201.m82(19217);
                        break;
                    case 10:
                        str2 = C0201.m82(19216);
                        break;
                    default:
                        str2 = C0201.m82(19215) + aVar.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print(C0201.m82(19227));
                printWriter.print(i);
                printWriter.print(C0201.m82(19228));
                printWriter.print(str2);
                printWriter.print(C0201.m82(19229));
                printWriter.println(aVar.b);
                if (z) {
                    if (!(aVar.c == 0 && aVar.d == 0)) {
                        printWriter.print(str);
                        printWriter.print(C0201.m82(19230));
                        printWriter.print(Integer.toHexString(aVar.c));
                        printWriter.print(C0201.m82(19231));
                        printWriter.println(Integer.toHexString(aVar.d));
                    }
                    if (aVar.e != 0 || aVar.f != 0) {
                        printWriter.print(str);
                        printWriter.print(C0201.m82(19232));
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(C0201.m82(19233));
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                }
            }
        }
    }

    public void l() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            n.a aVar = this.a.get(i);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setNextTransition(this.f, this.g);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setNextAnim(aVar.c);
                    this.r.l(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException(C0201.m82(19234) + aVar.a);
                case 3:
                    fragment.setNextAnim(aVar.d);
                    this.r.X0(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.d);
                    this.r.C0(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.c);
                    this.r.k1(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.d);
                    this.r.x(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.c);
                    this.r.q(fragment);
                    break;
                case 8:
                    this.r.j1(fragment);
                    break;
                case 9:
                    this.r.j1(null);
                    break;
                case 10:
                    this.r.i1(fragment, aVar.h);
                    break;
            }
            if (!(this.p || aVar.a == 1 || fragment == null)) {
                this.r.N0(fragment);
            }
        }
        if (!this.p) {
            j jVar = this.r;
            jVar.O0(jVar.p, true);
        }
    }

    public void m(boolean z) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            n.a aVar = this.a.get(size);
            Fragment fragment = aVar.b;
            if (fragment != null) {
                fragment.setNextTransition(j.c1(this.f), this.g);
            }
            switch (aVar.a) {
                case 1:
                    fragment.setNextAnim(aVar.f);
                    this.r.X0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException(C0201.m82(19235) + aVar.a);
                case 3:
                    fragment.setNextAnim(aVar.e);
                    this.r.l(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(aVar.e);
                    this.r.k1(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(aVar.f);
                    this.r.C0(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(aVar.e);
                    this.r.q(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(aVar.f);
                    this.r.x(fragment);
                    break;
                case 8:
                    this.r.j1(null);
                    break;
                case 9:
                    this.r.j1(fragment);
                    break;
                case 10:
                    this.r.i1(fragment, aVar.g);
                    break;
            }
            if (!(this.p || aVar.a == 3 || fragment == null)) {
                this.r.N0(fragment);
            }
        }
        if (!this.p && z) {
            j jVar = this.r;
            jVar.O0(jVar.p, true);
        }
    }

    public Fragment n(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.a.size()) {
            n.a aVar = this.a.get(i);
            int i2 = aVar.a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.b;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.a.add(i, new n.a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                n.a aVar2 = new n.a(3, fragment4);
                                aVar2.c = aVar.c;
                                aVar2.e = aVar.e;
                                aVar2.d = aVar.d;
                                aVar2.f = aVar.f;
                                this.a.add(i, aVar2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.a.remove(i);
                        i--;
                    } else {
                        aVar.a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList.remove(aVar.b);
                    Fragment fragment5 = aVar.b;
                    if (fragment5 == fragment2) {
                        this.a.add(i, new n.a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.a.add(i, new n.a(9, fragment2));
                        i++;
                        fragment2 = aVar.b;
                    }
                }
                i++;
            }
            arrayList.add(aVar.b);
            i++;
        }
        return fragment2;
    }

    public String o() {
        return this.i;
    }

    public boolean p(int i) {
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.a.get(i2).b;
            int i3 = fragment != null ? fragment.mContainerId : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    public boolean q(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.a.get(i4).b;
            int i5 = fragment != null ? fragment.mContainerId : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.a.get(i7).b;
                        if ((fragment2 != null ? fragment2.mContainerId : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    public boolean s() {
        for (int i = 0; i < this.a.size(); i++) {
            if (r(this.a.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void t() {
        if (this.q != null) {
            for (int i = 0; i < this.q.size(); i++) {
                this.q.get(i).run();
            }
            this.q = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(C0201.m82(19236));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.t >= 0) {
            sb.append(C0201.m82(19237));
            sb.append(this.t);
        }
        if (this.i != null) {
            sb.append(C0201.m82(19238));
            sb.append(this.i);
        }
        sb.append(C0201.m82(19239));
        return sb.toString();
    }

    public void u(Fragment.f fVar) {
        for (int i = 0; i < this.a.size(); i++) {
            n.a aVar = this.a.get(i);
            if (r(aVar)) {
                aVar.b.setOnStartEnterTransitionListener(fVar);
            }
        }
    }

    public Fragment v(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            n.a aVar = this.a.get(size);
            int i = aVar.a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.b;
                            break;
                        case 10:
                            aVar.h = aVar.g;
                            break;
                    }
                }
                arrayList.add(aVar.b);
            }
            arrayList.remove(aVar.b);
        }
        return fragment;
    }
}
