package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.i;
import com.bumptech.glide.c;
import com.bumptech.glide.k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: jn  reason: default package */
/* compiled from: SupportRequestManagerFragment */
public class jn extends Fragment {
    private final vm a;
    private final hn b;
    private final Set<jn> c;
    private jn d;
    private k e;
    private Fragment f;

    /* renamed from: jn$a */
    /* compiled from: SupportRequestManagerFragment */
    private class a implements hn {
        public a() {
        }

        @Override // defpackage.hn
        public Set<k> a() {
            Set<jn> u = jn.this.u();
            HashSet hashSet = new HashSet(u.size());
            for (jn jnVar : u) {
                if (jnVar.x() != null) {
                    hashSet.add(jnVar.x());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + C0201.m82(15680) + jn.this + C0201.m82(15681);
        }
    }

    public jn() {
        this(new vm());
    }

    private boolean A(Fragment fragment) {
        Fragment w = w();
        while (true) {
            Fragment parentFragment = fragment.getParentFragment();
            if (parentFragment == null) {
                return false;
            }
            if (parentFragment.equals(w)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void B(Context context, i iVar) {
        F();
        jn j = c.c(context).k().j(context, iVar);
        this.d = j;
        if (!equals(j)) {
            this.d.t(this);
        }
    }

    private void C(jn jnVar) {
        this.c.remove(jnVar);
    }

    private void F() {
        jn jnVar = this.d;
        if (jnVar != null) {
            jnVar.C(this);
            this.d = null;
        }
    }

    private void t(jn jnVar) {
        this.c.add(jnVar);
    }

    private Fragment w() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null ? parentFragment : this.f;
    }

    private static i z(Fragment fragment) {
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        return fragment.getFragmentManager();
    }

    public void D(Fragment fragment) {
        i z;
        this.f = fragment;
        if (fragment != null && fragment.getContext() != null && (z = z(fragment)) != null) {
            B(fragment.getContext(), z);
        }
    }

    public void E(k kVar) {
        this.e = kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        i z = z(this);
        String r1 = C0201.m82(24993);
        if (z != null) {
            try {
                B(getContext(), z);
            } catch (IllegalStateException e2) {
                if (Log.isLoggable(r1, 5)) {
                    Log.w(r1, C0201.m82(24995), e2);
                }
            }
        } else if (Log.isLoggable(r1, 5)) {
            Log.w(r1, C0201.m82(24994));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.a.c();
        F();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f = null;
        F();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.a.e();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + C0201.m82(24996) + w() + C0201.m82(24997);
    }

    public Set<jn> u() {
        jn jnVar = this.d;
        if (jnVar == null) {
            return Collections.emptySet();
        }
        if (equals(jnVar)) {
            return Collections.unmodifiableSet(this.c);
        }
        HashSet hashSet = new HashSet();
        for (jn jnVar2 : this.d.u()) {
            if (A(jnVar2.w())) {
                hashSet.add(jnVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public vm v() {
        return this.a;
    }

    public k x() {
        return this.e;
    }

    public hn y() {
        return this.b;
    }

    @SuppressLint({"ValidFragment"})
    public jn(vm vmVar) {
        this.b = new a();
        this.c = new HashSet();
        this.a = vmVar;
    }
}
