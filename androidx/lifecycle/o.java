package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.lifecycle.d;
import vigqyno.C0201;

/* compiled from: ReportFragment */
public class o extends Fragment {
    private a a;

    /* access modifiers changed from: package-private */
    /* compiled from: ReportFragment */
    public interface a {
        void a();

        void onResume();

        void onStart();
    }

    private void a(d.a aVar) {
        Activity activity = getActivity();
        if (activity instanceof i) {
            ((i) activity).getLifecycle().i(aVar);
        } else if (activity instanceof g) {
            d lifecycle = ((g) activity).getLifecycle();
            if (lifecycle instanceof h) {
                ((h) lifecycle).i(aVar);
            }
        }
    }

    private void b(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public static void e(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        String r0 = C0201.m82(13703);
        if (fragmentManager.findFragmentByTag(r0) == null) {
            fragmentManager.beginTransaction().add(new o(), r0).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.a);
        a(d.a.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        a(d.a.ON_DESTROY);
        this.a = null;
    }

    public void onPause() {
        super.onPause();
        a(d.a.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        c(this.a);
        a(d.a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        d(this.a);
        a(d.a.ON_START);
    }

    public void onStop() {
        super.onStop();
        a(d.a.ON_STOP);
    }
}
