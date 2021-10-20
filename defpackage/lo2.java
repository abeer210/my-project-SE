package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: lo2  reason: default package */
/* compiled from: SharedElementTransition.kt */
public final class lo2 extends mo2 {
    private final String a;
    private final String b;
    public View c;
    public View d;
    private nl2<?> e;
    private final ef2 f;

    public lo2(nl2<?> nl2, ef2 ef2) {
        ow2.c(nl2, C0201.m82(36928));
        ow2.c(ef2, C0201.m82(36929));
        this.f = ef2;
        Object d2 = ef2.b().d();
        ow2.b(d2, C0201.m82(36930));
        this.a = (String) d2;
        Object d3 = this.f.e().d();
        ow2.b(d3, C0201.m82(36931));
        this.b = (String) d3;
        this.e = nl2;
    }

    private final List<so2<?>> d() {
        so2[] so2Arr = new so2[8];
        View view = this.c;
        String r3 = C0201.m82(36932);
        if (view != null) {
            View view2 = this.d;
            String r6 = C0201.m82(36933);
            if (view2 != null) {
                so2Arr[0] = new ro2(view, view2);
                View view3 = this.c;
                if (view3 != null) {
                    View view4 = this.d;
                    if (view4 != null) {
                        so2Arr[1] = new xo2(view3, view4);
                        View view5 = this.c;
                        if (view5 != null) {
                            View view6 = this.d;
                            if (view6 != null) {
                                so2Arr[2] = new yo2(view5, view6);
                                View view7 = this.c;
                                if (view7 != null) {
                                    View view8 = this.d;
                                    if (view8 != null) {
                                        so2Arr[3] = new to2(view7, view8);
                                        View view9 = this.c;
                                        if (view9 != null) {
                                            View view10 = this.d;
                                            if (view10 != null) {
                                                so2Arr[4] = new uo2(view9, view10);
                                                View view11 = this.c;
                                                if (view11 != null) {
                                                    View view12 = this.d;
                                                    if (view12 != null) {
                                                        so2Arr[5] = new vo2(view11, view12);
                                                        View view13 = this.c;
                                                        if (view13 != null) {
                                                            View view14 = this.d;
                                                            if (view14 != null) {
                                                                so2Arr[6] = new po2(view13, view14);
                                                                View view15 = this.c;
                                                                if (view15 != null) {
                                                                    View view16 = this.d;
                                                                    if (view16 != null) {
                                                                        so2Arr[7] = new wo2(view15, view16);
                                                                        return ov2.c(so2Arr);
                                                                    }
                                                                    ow2.i(r6);
                                                                    throw null;
                                                                }
                                                                ow2.i(r3);
                                                                throw null;
                                                            }
                                                            ow2.i(r6);
                                                            throw null;
                                                        }
                                                        ow2.i(r3);
                                                        throw null;
                                                    }
                                                    ow2.i(r6);
                                                    throw null;
                                                }
                                                ow2.i(r3);
                                                throw null;
                                            }
                                            ow2.i(r6);
                                            throw null;
                                        }
                                        ow2.i(r3);
                                        throw null;
                                    }
                                    ow2.i(r6);
                                    throw null;
                                }
                                ow2.i(r3);
                                throw null;
                            }
                            ow2.i(r6);
                            throw null;
                        }
                        ow2.i(r3);
                        throw null;
                    }
                    ow2.i(r6);
                    throw null;
                }
                ow2.i(r3);
                throw null;
            }
            ow2.i(r6);
            throw null;
        }
        ow2.i(r3);
        throw null;
    }

    @Override // defpackage.mo2
    public int a() {
        return c().A();
    }

    @Override // defpackage.mo2
    public View b() {
        View view = this.d;
        if (view != null) {
            return view;
        }
        ow2.i(C0201.m82(36934));
        throw null;
    }

    @Override // defpackage.mo2
    public nl2<?> c() {
        return this.e;
    }

    public AnimatorSet e() {
        List<so2<?>> d2 = d();
        ArrayList<so2> arrayList = new ArrayList();
        for (T t : d2) {
            if (t.f()) {
                arrayList.add(t);
            }
        }
        ArrayList arrayList2 = new ArrayList(pv2.e(arrayList, 10));
        for (so2 so2 : arrayList) {
            Animator a2 = so2.a(this.f);
            a2.setDuration(this.f.a());
            a2.setStartDelay(this.f.d());
            a2.setInterpolator(this.f.c());
            arrayList2.add(a2);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList2);
        return animatorSet;
    }

    public final View f() {
        View view = this.c;
        if (view != null) {
            return view;
        }
        ow2.i(C0201.m82(36935));
        throw null;
    }

    public final String g() {
        return this.a;
    }

    public final String h() {
        return this.b;
    }

    public final boolean i() {
        return this.c != null;
    }

    public final void j(View view) {
        ow2.c(view, C0201.m82(36936));
        this.c = view;
    }

    public final void k(View view) {
        ow2.c(view, C0201.m82(36937));
        this.d = view;
    }
}
