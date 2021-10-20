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
import com.huawei.hms.maps.mbm;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

@Deprecated
public class SupportStreetViewPanoramaFragment extends Fragment {
    private final maa a = new maa(this);

    static class maa extends DeferredLifecycleHelper<mab> {
        public final List<OnStreetViewPanoramaReadyCallback> a = new ArrayList();
        public boolean b = false;
        private final Fragment c;
        private OnDelegateCreatedListener<mab> d;
        private Activity e;
        private StreetViewPanoramaOptions f;
        private boolean g = false;

        public maa(Fragment fragment) {
            this.c = fragment;
        }

        public static /* synthetic */ void a(maa maa, Activity activity) {
            maa.e = activity;
            maa.b();
        }

        private void a(mbq mbq) {
            this.d.onDelegateCreated(new mab(this.c, mbq, this.e));
            for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.a) {
                ((mab) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            }
            this.a.clear();
        }

        private void a(mbq mbq, int i) {
            String r0 = C0201.m82(24263);
            while (!this.g && mbq == null && i < 30) {
                try {
                    mco.a(r0, C0201.m82(24264) + i + C0201.m82(24265) + this.g);
                    i++;
                    Thread.sleep(100);
                } catch (InterruptedException e2) {
                    mco.d(r0, C0201.m82(24266) + e2.getMessage());
                }
            }
        }

        private boolean a() {
            return this.e == null || this.d == null || getDelegate() != null;
        }

        private void b() {
            String r0 = C0201.m82(24267);
            if (!a()) {
                try {
                    MapsInitializer.initialize(this.e);
                    int isHmsAvailable = HmsUtil.isHmsAvailable(this.e);
                    String r2 = C0201.m82(24268);
                    if (isHmsAvailable != 0) {
                        mco.d(r2, C0201.m82(24269).concat(String.valueOf(isHmsAvailable)));
                        return;
                    }
                    maf a2 = mbu.a(this.e);
                    if (a2 != null) {
                        MapClientIdentify mapClientIdentify = new MapClientIdentify();
                        Context b2 = mbu.b(this.e);
                        this.g = mapClientIdentify.a(this.e, a2);
                        Bundle arguments = this.c.getArguments();
                        if (arguments != null && arguments.containsKey(r0)) {
                            this.f = (StreetViewPanoramaOptions) arguments.getParcelable(r0);
                        }
                        mbq b3 = a2.b(ObjectWrapper.wrap(b2), this.f);
                        if (b3 == null) {
                            try {
                                Context b4 = mbu.b(this.e);
                                a(b3, 1);
                                maf a3 = mbu.a(this.e);
                                b3 = a3.b(ObjectWrapper.wrap(b4), this.f);
                                mco.b(r2, C0201.m82(24270).concat(String.valueOf(a3)));
                            } catch (RemoteException e2) {
                                mco.d(r2, C0201.m82(24271) + e2.toString());
                            }
                        }
                        if (b3 != null) {
                            a(b3);
                        }
                    }
                } catch (RemoteException e3) {
                    throw new RuntimeRemoteException(e3);
                }
            }
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public final void createDelegate(OnDelegateCreatedListener<mab> onDelegateCreatedListener) {
            if (!this.b) {
                this.b = true;
                this.d = onDelegateCreatedListener;
                b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class mab implements StreetLifecycleDelegate {
        private final Fragment a;
        private final mbq b;
        private Activity c;

        public mab(Fragment fragment, mbq mbq, Activity activity) {
            this.b = (mbq) Preconditions.checkNotNull(mbq);
            this.a = (Fragment) Preconditions.checkNotNull(fragment);
            this.c = activity;
        }

        @Override // com.huawei.hms.maps.StreetLifecycleDelegate
        public final void getStreetViewPanoramaAsync(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.b.a(new mbm.maa() {
                    /* class com.huawei.hms.maps.SupportStreetViewPanoramaFragment.mab.AnonymousClass1 */
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) {
            String r0 = C0201.m82(24209);
            try {
                Bundle a2 = mbv.a(bundle);
                Bundle arguments = this.a.getArguments();
                if (arguments != null && arguments.containsKey(r0)) {
                    mbv.a(a2, r0, arguments.getParcelable(r0));
                }
                this.b.a(a2);
                mbv.a(a2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            View view;
            try {
                Bundle a2 = mbv.a(bundle);
                Context b2 = mbu.b(this.c);
                if (this.b != null) {
                    String r0 = C0201.m82(24210);
                    mco.b(r0, C0201.m82(24211) + this.b);
                    view = (View) ObjectWrapper.unwrap(this.b.a(ObjectWrapper.wrap(LayoutInflater.from(b2)), ObjectWrapper.wrap(viewGroup), a2));
                } else {
                    view = LayoutInflater.from(b2).inflate(R.layout.empty_layout, (ViewGroup) null);
                }
                mbv.a(a2);
                return view;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.b.a();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            try {
                this.b.b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            String r0 = C0201.m82(24212);
            if (bundle != null) {
                StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) bundle.getParcelable(C0201.m82(24213));
                try {
                    mco.a(r0, C0201.m82(24214));
                    Bundle a2 = mbv.a(bundle2);
                    this.b.a(ObjectWrapper.wrap(activity), streetViewPanoramaOptions, a2);
                    mbv.a(a2);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } else {
                mco.d(r0, C0201.m82(24215));
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            try {
                this.b.c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onPause() {
            try {
                this.b.d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onResume() {
            try {
                this.b.e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle a2 = mbv.a(bundle);
                this.b.b(bundle);
                mbv.a(a2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                this.b.f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStop() {
            try {
                this.b.g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public static SupportStreetViewPanoramaFragment newInstance() {
        return new SupportStreetViewPanoramaFragment();
    }

    public static SupportStreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        mco.b(C0201.m82(27745), C0201.m82(27746));
        SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = new SupportStreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0201.m82(27747), streetViewPanoramaOptions);
        supportStreetViewPanoramaFragment.setArguments(bundle);
        return supportStreetViewPanoramaFragment;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        mco.a(C0201.m82(27748), C0201.m82(27749));
        maa maa2 = this.a;
        if (maa2.getDelegate() != null) {
            ((mab) maa2.getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            maa2.a.add(onStreetViewPanoramaReadyCallback);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        mco.a(C0201.m82(27750), C0201.m82(27751));
        super.onAttach(activity);
        maa.a(this.a, activity);
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
        this.a.onDestroy();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.a.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        mco.a(C0201.m82(27752), C0201.m82(27753));
    }

    public final void onExitAmbient() {
        mco.a(C0201.m82(27754), C0201.m82(27755));
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            mco.a(C0201.m82(27756), C0201.m82(27757));
            super.onInflate(activity, attributeSet, bundle);
            StreetViewPanoramaOptions streetViewPanoramaOptions = new StreetViewPanoramaOptions();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(C0201.m82(27758), streetViewPanoramaOptions);
            maa.a(this.a, activity);
            this.a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onLowMemory() {
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
