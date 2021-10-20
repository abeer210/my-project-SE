package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.k;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

@Deprecated
/* renamed from: fn  reason: default package */
/* compiled from: RequestManagerFragment */
public class fn extends Fragment {
    private final vm a;
    private final hn b;
    private final Set<fn> c;
    private k d;
    private fn e;
    private Fragment f;

    /* renamed from: fn$a */
    /* compiled from: RequestManagerFragment */
    private class a implements hn {
        public a() {
        }

        @Override // defpackage.hn
        public Set<k> a() {
            Set<fn> b = fn.this.b();
            HashSet hashSet = new HashSet(b.size());
            for (fn fnVar : b) {
                if (fnVar.e() != null) {
                    hashSet.add(fnVar.e());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + C0201.m82(4491) + fn.this + C0201.m82(4492);
        }
    }

    public fn() {
        this(new vm());
    }

    private void a(fn fnVar) {
        this.c.add(fnVar);
    }

    @TargetApi(17)
    private Fragment d() {
        Fragment parentFragment = Build.VERSION.SDK_INT >= 17 ? getParentFragment() : null;
        return parentFragment != null ? parentFragment : this.f;
    }

    @TargetApi(17)
    private boolean g(Fragment fragment) {
        Fragment parentFragment = getParentFragment();
        while (true) {
            Fragment parentFragment2 = fragment.getParentFragment();
            if (parentFragment2 == null) {
                return false;
            }
            if (parentFragment2.equals(parentFragment)) {
                return true;
            }
            fragment = fragment.getParentFragment();
        }
    }

    private void h(Activity activity) {
        l();
        fn h = c.c(activity).k().h(activity);
        this.e = h;
        if (!equals(h)) {
            this.e.a(this);
        }
    }

    private void i(fn fnVar) {
        this.c.remove(fnVar);
    }

    private void l() {
        fn fnVar = this.e;
        if (fnVar != null) {
            fnVar.i(this);
            this.e = null;
        }
    }

    @TargetApi(17)
    public Set<fn> b() {
        if (equals(this.e)) {
            return Collections.unmodifiableSet(this.c);
        }
        if (this.e == null || Build.VERSION.SDK_INT < 17) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet();
        for (fn fnVar : this.e.b()) {
            if (g(fnVar.getParentFragment())) {
                hashSet.add(fnVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public vm c() {
        return this.a;
    }

    public k e() {
        return this.d;
    }

    public hn f() {
        return this.b;
    }

    public void j(Fragment fragment) {
        this.f = fragment;
        if (fragment != null && fragment.getActivity() != null) {
            h(fragment.getActivity());
        }
    }

    public void k(k kVar) {
        this.d = kVar;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            h(activity);
        } catch (IllegalStateException e2) {
            String r1 = C0201.m82(15346);
            if (Log.isLoggable(r1, 5)) {
                Log.w(r1, C0201.m82(15347), e2);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.a.c();
        l();
    }

    public void onDetach() {
        super.onDetach();
        l();
    }

    public void onStart() {
        super.onStart();
        this.a.d();
    }

    public void onStop() {
        super.onStop();
        this.a.e();
    }

    public String toString() {
        return super.toString() + C0201.m82(15348) + d() + C0201.m82(15349);
    }

    @SuppressLint({"ValidFragment"})
    public fn(vm vmVar) {
        this.b = new a();
        this.c = new HashSet();
        this.a = vmVar;
    }
}
