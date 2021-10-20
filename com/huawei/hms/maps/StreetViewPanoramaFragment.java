package com.huawei.hms.maps;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

@TargetApi(11)
@Deprecated
public class StreetViewPanoramaFragment extends Fragment {
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

        private boolean a() {
            return this.e == null || this.d == null || getDelegate() != null;
        }

        private void b() {
            maf a2;
            String r0 = C0201.m82(19375);
            if (!a()) {
                try {
                    if (c() && (a2 = mbu.a(this.e)) != null) {
                        MapClientIdentify mapClientIdentify = new MapClientIdentify();
                        Context b2 = mbu.b(this.e);
                        this.g = mapClientIdentify.a(this.e, a2);
                        Bundle arguments = this.c.getArguments();
                        if (arguments != null && arguments.containsKey(r0)) {
                            this.f = (StreetViewPanoramaOptions) arguments.getParcelable(r0);
                        }
                        mbq b3 = a2.b(ObjectWrapper.wrap(b2), this.f);
                        if (b3 == null) {
                            b3 = d();
                        }
                        if (b3 != null) {
                            this.d.onDelegateCreated(new mab(this.c, b3, this.e));
                            for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.a) {
                                ((mab) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
                            }
                            this.a.clear();
                        }
                    }
                } catch (RemoteException e2) {
                    throw new RuntimeRemoteException(e2);
                }
            }
        }

        private boolean c() {
            MapsInitializer.initialize(this.e);
            int isHmsAvailable = HmsUtil.isHmsAvailable(this.e);
            if (isHmsAvailable == 0) {
                return true;
            }
            mco.d(C0201.m82(19377), C0201.m82(19376).concat(String.valueOf(isHmsAvailable)));
            return false;
        }

        private mbq d() {
            String r0 = C0201.m82(19378);
            try {
                Context b2 = mbu.b(this.e);
                int i = 1;
                while (!this.g && i < 30) {
                    try {
                        mco.a(r0, C0201.m82(19379) + i + C0201.m82(19380) + this.g);
                        i++;
                        Thread.sleep(100);
                    } catch (InterruptedException e2) {
                        mco.d(r0, C0201.m82(19381) + e2.getMessage());
                    }
                }
                maf a2 = mbu.a(this.e);
                mbq b3 = a2.b(ObjectWrapper.wrap(b2), this.f);
                mco.b(r0, C0201.m82(19382).concat(String.valueOf(a2)));
                return b3;
            } catch (RemoteException e3) {
                mco.d(r0, C0201.m82(19383) + e3.toString());
                return null;
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
        private mbq b;
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
                    /* class com.huawei.hms.maps.StreetViewPanoramaFragment.mab.AnonymousClass1 */
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) {
            String r0 = C0201.m82(19319);
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
                    String r0 = C0201.m82(19320);
                    mco.b(r0, C0201.m82(19321) + this.b);
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
            if (bundle != null) {
                StreetViewPanoramaOptions streetViewPanoramaOptions = (StreetViewPanoramaOptions) bundle.getParcelable(C0201.m82(19322));
                try {
                    Bundle a2 = mbv.a(bundle2);
                    this.b.a(ObjectWrapper.wrap(activity), streetViewPanoramaOptions, a2);
                    mbv.a(a2);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } else {
                mco.d(C0201.m82(19323), C0201.m82(19324));
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
                mco.a(C0201.m82(19325), C0201.m82(19326));
                this.b.e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(Bundle bundle) {
            try {
                new Bundle();
                Bundle a2 = mbv.a(bundle);
                this.b.b(a2);
                mbv.a(a2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onStart() {
            try {
                mco.a(C0201.m82(19327), C0201.m82(19328));
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

    public static StreetViewPanoramaFragment newInstance() {
        return new StreetViewPanoramaFragment();
    }

    public static StreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        mco.b(C0201.m82(9679), C0201.m82(9680));
        StreetViewPanoramaFragment streetViewPanoramaFragment = new StreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0201.m82(9681), streetViewPanoramaOptions);
        streetViewPanoramaFragment.setArguments(bundle);
        return streetViewPanoramaFragment;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        mco.a(C0201.m82(9682), C0201.m82(9683));
        maa maa2 = this.a;
        if (maa2.getDelegate() != null) {
            ((mab) maa2.getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        } else {
            maa2.a.add(onStreetViewPanoramaReadyCallback);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        mco.a(C0201.m82(9684), C0201.m82(9685));
        super.onAttach(activity);
        maa.a(this.a, activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = this.a.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    public void onDestroy() {
        this.a.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.a.onDestroyView();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            mco.a(C0201.m82(9686), C0201.m82(9687));
            super.onInflate(activity, attributeSet, bundle);
            StreetViewPanoramaOptions streetViewPanoramaOptions = new StreetViewPanoramaOptions();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(C0201.m82(9688), streetViewPanoramaOptions);
            maa.a(this.a, activity);
            this.a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        this.a.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        super.onPause();
        this.a.onPause();
    }

    public void onResume() {
        super.onResume();
        this.a.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.a.onStart();
    }

    public void onStop() {
        this.a.onStop();
        super.onStop();
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
