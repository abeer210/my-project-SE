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
import com.huawei.hms.maps.mbb;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

@TargetApi(11)
public class MapFragment extends Fragment {
    private final maa a = new maa(this);

    static class maa extends DeferredLifecycleHelper<mab> {
        public Activity a;
        public boolean b = false;
        private final Fragment c;
        private final List<OnMapReadyCallback> d = new ArrayList();
        private OnDelegateCreatedListener<mab> e;
        private HuaweiMapOptions f;
        private boolean g;
        private boolean h = false;
        private int i = 0;
        private boolean j = false;
        private boolean k;

        public maa(Fragment fragment) {
            this.c = fragment;
        }

        public maa(Fragment fragment, byte b2) {
            this.c = fragment;
            this.k = true;
        }

        private mal a(maf maf, Context context, HuaweiMapOptions huaweiMapOptions) {
            try {
                return this.k ? maf.c(ObjectWrapper.wrap(context), huaweiMapOptions) : maf.a(ObjectWrapper.wrap(context), huaweiMapOptions);
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }

        private void a() {
            String r0 = C0201.m82(36000);
            if (!(this.a == null || this.e == null || getDelegate() != null)) {
                mab.a(this.a.getApplicationContext());
                try {
                    MapsInitializer.initialize(this.a);
                    int isHmsAvailable = HmsUtil.isHmsAvailable(this.a);
                    if (isHmsAvailable != 0) {
                        mco.d(C0201.m82(36001), C0201.m82(36002).concat(String.valueOf(isHmsAvailable)));
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
                        if (this.i < 2 && b2 != null) {
                            this.i++;
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
                    /* class com.huawei.hms.maps.MapFragment.mab.AnonymousClass1 */

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
            String r0 = C0201.m82(36041);
            try {
                Bundle a2 = mbv.a(bundle);
                Bundle arguments = this.a.getArguments();
                if (arguments != null && arguments.containsKey(r0)) {
                    mbv.a(a2, r0, arguments.getParcelable(r0));
                }
                this.b.a();
                mbv.a(bundle);
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
                    mco.a(C0201.m82(36042), C0201.m82(36043));
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
                HuaweiMapOptions huaweiMapOptions = (HuaweiMapOptions) bundle.getParcelable(C0201.m82(36044));
                try {
                    Bundle a2 = mbv.a(bundle2);
                    this.b.a(ObjectWrapper.wrap(activity), huaweiMapOptions, a2);
                    mbv.a(a2);
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } else {
                mco.d(C0201.m82(36045), C0201.m82(36046));
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
                    mco.a(C0201.m82(36047), C0201.m82(36048));
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

    public static MapFragment newInstance() {
        return new MapFragment();
    }

    public static MapFragment newInstance(HuaweiMapOptions huaweiMapOptions) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0201.m82(24521), huaweiMapOptions);
        MapFragment mapFragment = new MapFragment();
        mapFragment.setArguments(bundle);
        return mapFragment;
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        mco.a(C0201.m82(24522), C0201.m82(24523));
        this.a.a(onMapReadyCallback);
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        mco.a(C0201.m82(24524), C0201.m82(24525));
        super.onAttach(activity);
        this.a.a = activity;
    }

    public void onCreate(Bundle bundle) {
        mco.a(C0201.m82(24526), C0201.m82(24527));
        super.onCreate(bundle);
        this.a.onCreate(bundle);
        MapClientIdentify.a(System.currentTimeMillis());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mco.a(C0201.m82(24528), C0201.m82(24529));
        if (MapClientIdentify.a() == 0) {
            MapClientIdentify.a(System.currentTimeMillis());
        }
        View onCreateView = this.a.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    public void onDestroy() {
        mco.a(C0201.m82(24530), C0201.m82(24531));
        this.a.onDestroy();
        HmsUtil.setRepeatFlag(true);
        super.onDestroy();
    }

    public void onDestroyView() {
        this.a.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        mco.a(C0201.m82(24532), C0201.m82(24533));
    }

    public final void onExitAmbient() {
        mco.a(C0201.m82(24534), C0201.m82(24535));
    }

    @Override // android.app.Fragment
    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        mco.a(C0201.m82(24536), C0201.m82(24537));
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            HuaweiMapOptions createFromAttributes = HuaweiMapOptions.createFromAttributes(activity, attributeSet);
            super.onInflate(activity, attributeSet, bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(C0201.m82(24538), createFromAttributes);
            setArguments(bundle2);
            this.a.a = activity;
            this.a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        mco.a(C0201.m82(24539), C0201.m82(24540));
        this.a.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        mco.a(C0201.m82(24541), C0201.m82(24542));
        this.a.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.a.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        mco.a(C0201.m82(24543), C0201.m82(24544));
        if (bundle != null) {
            bundle.setClassLoader(MapFragment.class.getClassLoader());
            super.onSaveInstanceState(bundle);
            this.a.onSaveInstanceState(bundle);
        }
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
