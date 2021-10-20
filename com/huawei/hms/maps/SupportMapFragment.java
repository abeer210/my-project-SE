package com.huawei.hms.maps;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.feature.dynamic.DeferredLifecycleHelper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.feature.dynamic.OnDelegateCreatedListener;
import com.huawei.hms.maps.internal.HmsUtil;
import com.huawei.hms.maps.mbb;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

public class SupportMapFragment extends Fragment {
    private final maa a = new maa(this);

    static class maa extends DeferredLifecycleHelper<mab> {
        public Activity a;
        public boolean b = false;
        private final Fragment c;
        private final List<OnMapReadyCallback> d = new ArrayList();
        private OnDelegateCreatedListener<mab> e;
        private HuaweiMapOptions f;
        private boolean g = false;
        private int h = 0;
        private boolean i;

        public maa(Fragment fragment) {
            this.c = fragment;
        }

        public maa(Fragment fragment, byte b2) {
            this.c = fragment;
            this.i = true;
        }

        private mal a(maf maf, Context context, HuaweiMapOptions huaweiMapOptions) {
            try {
                return this.i ? maf.c(ObjectWrapper.wrap(context), huaweiMapOptions) : maf.a(ObjectWrapper.wrap(context), huaweiMapOptions);
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }

        private void a() {
            String r0 = C0201.m82(13692);
            if (!(this.a == null || this.e == null || getDelegate() != null)) {
                mab.a(this.a.getApplicationContext());
                try {
                    MapsInitializer.initialize(this.a);
                    int isHmsAvailable = HmsUtil.isHmsAvailable(this.a);
                    if (isHmsAvailable != 0) {
                        mco.d(C0201.m82(13693), C0201.m82(13694).concat(String.valueOf(isHmsAvailable)));
                        return;
                    }
                    maf a2 = mbu.a(this.a);
                    if (a2 != null) {
                        MapClientIdentify mapClientIdentify = new MapClientIdentify();
                        Context b2 = mbu.b(this.a);
                        this.g = mapClientIdentify.a(this.a, a2);
                        Bundle arguments = this.c.getArguments();
                        if (arguments != null && arguments.containsKey(r0)) {
                            this.f = (HuaweiMapOptions) arguments.getParcelable(r0);
                        }
                        mal mal = null;
                        if (this.h < 2 && b2 != null) {
                            this.h++;
                            mal = a(a2, b2, this.f);
                        }
                        if (mal != null) {
                            mal.a(ObjectWrapper.wrap(this.a));
                            this.e.onDelegateCreated(new mab(this.c, mal, this.a));
                            for (OnMapReadyCallback onMapReadyCallback : this.d) {
                                ((mab) getDelegate()).getMapAsync(onMapReadyCallback);
                            }
                            this.d.clear();
                        }
                    }
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                }
            }
        }

        public final void a(OnMapReadyCallback onMapReadyCallback) {
            if (getDelegate() != null) {
                ((mab) getDelegate()).getMapAsync(onMapReadyCallback);
            } else {
                this.d.add(onMapReadyCallback);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public final void createDelegate(OnDelegateCreatedListener<mab> onDelegateCreatedListener) {
            if (!this.b) {
                this.b = true;
                this.e = onDelegateCreatedListener;
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
                try {
                    a();
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class mab implements MapLifecycleDelegate {
        private final Fragment a;
        private final mal b;
        private Activity c;
        private boolean d = false;

        public mab(Fragment fragment, mal mal, Activity activity) {
            this.b = (mal) Preconditions.checkNotNull(mal);
            this.a = (Fragment) Preconditions.checkNotNull(fragment);
            this.c = activity;
        }

        private static void a() {
            MapsInitializer.initialize(null);
            MapClientIdentify.a((Context) null);
            mbu.a();
        }

        @Override // com.huawei.hms.maps.MapLifecycleDelegate
        public final void getMapAsync(final OnMapReadyCallback onMapReadyCallback) {
            try {
                this.b.a(new mbb.maa() {
                    /* class com.huawei.hms.maps.SupportMapFragment.mab.AnonymousClass1 */

                    @Override // com.huawei.hms.maps.mbb
                    public final void a(mah mah) {
                        onMapReadyCallback.onMapReady(new HuaweiMap(mah));
                    }
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) {
            String r0 = C0201.m82(16127);
            try {
                Bundle a2 = mbv.a(bundle);
                Bundle arguments = this.a.getArguments();
                if (arguments != null && arguments.containsKey(r0)) {
                    mbv.a(a2, r0, arguments.getParcelable(r0));
                }
                this.b.a();
                mbv.a(a2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            return maa.a(this.c, this.b, viewGroup, bundle);
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.b.e();
                if (!this.d) {
                    mco.a(C0201.m82(16128), C0201.m82(16129));
                    a();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            try {
                this.b.d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                HuaweiMapOptions huaweiMapOptions = (HuaweiMapOptions) bundle.getParcelable(C0201.m82(16130));
                try {
                    Bundle a2 = mbv.a(bundle2);
                    this.b.a(ObjectWrapper.wrap(activity), huaweiMapOptions, a2);
                    mbv.a(a2);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } else {
                mco.d(C0201.m82(16131), C0201.m82(16132));
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.b.f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.b.c();
                if (this.c != null && this.c.isFinishing()) {
                    mco.a(C0201.m82(16133), C0201.m82(16134));
                    a();
                    this.d = true;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                this.b.b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle a2 = mbv.a(bundle);
                this.b.a(a2);
                mbv.a(a2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.b.g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.b.h();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public static SupportMapFragment newInstance() {
        return new SupportMapFragment();
    }

    public static SupportMapFragment newInstance(HuaweiMapOptions huaweiMapOptions) {
        mco.b(C0201.m82(30250), C0201.m82(30251));
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0201.m82(30252), huaweiMapOptions);
        supportMapFragment.setArguments(bundle);
        return supportMapFragment;
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        mco.a(C0201.m82(30253), C0201.m82(30254));
        this.a.a(onMapReadyCallback);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        mco.a(C0201.m82(30255), C0201.m82(30256));
        super.onAttach(activity);
        this.a.a = activity;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = this.a.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        mco.a(C0201.m82(30257), C0201.m82(30258));
        this.a.onDestroy();
        HmsUtil.setRepeatFlag(true);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        mco.a(C0201.m82(30259), C0201.m82(30260));
        this.a.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        mco.a(C0201.m82(30261), C0201.m82(30262));
    }

    public final void onExitAmbient() {
        mco.a(C0201.m82(30263), C0201.m82(30264));
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        String r0 = C0201.m82(30265);
        String r1 = C0201.m82(30266);
        mco.a(r0, r1);
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            mco.a(r0, r1);
            super.onInflate(activity, attributeSet, bundle);
            HuaweiMapOptions createFromAttributes = HuaweiMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(C0201.m82(30267), createFromAttributes);
            setArguments(bundle2);
            this.a.a = activity;
            this.a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onLowMemory() {
        mco.a(C0201.m82(30268), C0201.m82(30269));
        this.a.onLowMemory();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.a.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.a.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        mco.a(C0201.m82(30270), C0201.m82(30271));
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
            super.onSaveInstanceState(bundle);
            this.a.onSaveInstanceState(bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.a.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        this.a.onStop();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
