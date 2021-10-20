package defpackage;

import android.annotation.SuppressLint;
import com.bumptech.glide.load.g;
import defpackage.hj;

/* renamed from: gj  reason: default package */
/* compiled from: LruResourceCache */
public class gj extends bp<g, hi<?>> implements hj {
    private hj.a d;

    public gj(long j) {
        super(j);
    }

    @Override // defpackage.hj
    @SuppressLint({"InlinedApi"})
    public void a(int i) {
        if (i >= 40) {
            b();
        } else if (i >= 20 || i == 15) {
            m(h() / 2);
        }
    }

    @Override // defpackage.hj
    public /* bridge */ /* synthetic */ hi c(g gVar, hi hiVar) {
        return (hi) super.k(gVar, hiVar);
    }

    @Override // defpackage.hj
    public /* bridge */ /* synthetic */ hi d(g gVar) {
        return (hi) super.l(gVar);
    }

    @Override // defpackage.hj
    public void e(hj.a aVar) {
        this.d = aVar;
    }

    /* renamed from: n */
    public int i(hi<?> hiVar) {
        if (hiVar == null) {
            return super.i(null);
        }
        return hiVar.a();
    }

    /* renamed from: o */
    public void j(g gVar, hi<?> hiVar) {
        hj.a aVar = this.d;
        if (aVar != null && hiVar != null) {
            aVar.a(hiVar);
        }
    }
}
