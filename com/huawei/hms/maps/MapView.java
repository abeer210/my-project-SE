package com.huawei.hms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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

public class MapView extends FrameLayout {
    private maa a;

    static class maa extends DeferredLifecycleHelper<mab> {
        public boolean a = false;
        private ViewGroup b;
        private Context c;
        private OnDelegateCreatedListener<mab> d;
        private HuaweiMapOptions e;
        private List<OnMapReadyCallback> f = new ArrayList();
        private boolean g = false;
        private int h = 0;
        private boolean i = false;

        public maa(ViewGroup viewGroup, Context context, HuaweiMapOptions huaweiMapOptions) {
            this.b = viewGroup;
            this.c = context;
            this.e = huaweiMapOptions;
        }

        public mam a(maf maf, Context context, HuaweiMapOptions huaweiMapOptions) {
            try {
                return maf.b(ObjectWrapper.wrap(context), huaweiMapOptions);
            } catch (RemoteException e2) {
                throw new RuntimeRemoteException(e2);
            }
        }

        public final void a(OnMapReadyCallback onMapReadyCallback) {
            if (getDelegate() == null) {
                this.f.add(onMapReadyCallback);
            } else {
                ((mab) getDelegate()).getMapAsync(onMapReadyCallback);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public void createDelegate(OnDelegateCreatedListener<mab> onDelegateCreatedListener) {
            if (!this.a) {
                this.a = true;
                mab.a(this.c);
                this.d = onDelegateCreatedListener;
                if (onDelegateCreatedListener != null && getDelegate() == null) {
                    MapsInitializer.initialize(this.c);
                    mam mam = null;
                    try {
                        int isHmsAvailable = HmsUtil.isHmsAvailable(this.c);
                        String r2 = C0201.m82(18530);
                        if (isHmsAvailable != 0) {
                            mco.d(r2, C0201.m82(18531).concat(String.valueOf(isHmsAvailable)));
                            return;
                        }
                        maf a2 = mbu.a(this.c);
                        if (a2 != null) {
                            MapClientIdentify mapClientIdentify = new MapClientIdentify();
                            Context b2 = mbu.b(this.c);
                            mapClientIdentify.a(this.c, a2);
                            if (this.h < 2 && b2 != null) {
                                this.h++;
                                mam = a(a2, b2, this.e);
                            }
                            mco.b(r2, C0201.m82(18532).concat(String.valueOf(mam)));
                            if (mam == null) {
                                mco.c(r2, C0201.m82(18533));
                                return;
                            }
                            mam.a(ObjectWrapper.wrap(this.c));
                            this.d.onDelegateCreated(new mab(this.b, mam));
                            for (OnMapReadyCallback onMapReadyCallback : this.f) {
                                ((mab) getDelegate()).getMapAsync(onMapReadyCallback);
                            }
                        }
                    } catch (RemoteException e2) {
                        throw new RuntimeRemoteException(e2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class mab implements MapLifecycleDelegate {
        private ViewGroup a;
        private mam b;
        private View c;
        private boolean d = false;

        public mab(ViewGroup viewGroup, mam mam) {
            this.a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
            this.b = (mam) Preconditions.checkNotNull(mam);
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
                    /* class com.huawei.hms.maps.MapView.mab.AnonymousClass1 */

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
            try {
                Bundle a2 = mbv.a(bundle);
                this.b.a(a2);
                mbv.a(a2);
                this.c = (View) ObjectWrapper.unwrap(this.b.a());
                this.a.removeAllViews();
                this.a.addView(this.c);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException(C0201.m82(19395));
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroy() {
            try {
                this.b.b();
                if (!this.d) {
                    mco.a(C0201.m82(19396), C0201.m82(19397));
                    a();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            throw new UnsupportedOperationException(C0201.m82(19398));
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException(C0201.m82(19399));
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
            Activity activity;
            try {
                this.b.d();
                if ((MapClientIdentify.b() instanceof Activity) && (activity = (Activity) MapClientIdentify.b()) != null && activity.isFinishing()) {
                    mco.a(C0201.m82(19400), C0201.m82(19401));
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
                mco.a(C0201.m82(19402), C0201.m82(19403));
                this.b.e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(Bundle bundle) {
            Bundle a2 = mbv.a(bundle);
            try {
                this.b.b(a2);
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

    public MapView(Context context) {
        super(context);
        this.a = new maa(this, context, null);
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new maa(this, context, HuaweiMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new maa(this, context, HuaweiMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, HuaweiMapOptions huaweiMapOptions) {
        super(context);
        this.a = new maa(this, context, huaweiMapOptions);
        setClickable(true);
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        mco.a(C0201.m82(30272), C0201.m82(30273));
        this.a.a(onMapReadyCallback);
    }

    public void onCreate(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        MapClientIdentify.a(System.currentTimeMillis());
        try {
            this.a.onCreate(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onDestroy() {
        this.a.onDestroy();
        HmsUtil.setRepeatFlag(true);
    }

    public final void onEnterAmbient(Bundle bundle) {
        mco.a(C0201.m82(30274), C0201.m82(30275));
    }

    public final void onExitAmbient() {
        mco.a(C0201.m82(30276), C0201.m82(30277));
    }

    public final void onLowMemory() {
        this.a.onLowMemory();
    }

    public void onPause() {
        mco.a(C0201.m82(30278), C0201.m82(30279));
        this.a.onPause();
    }

    public void onResume() {
        this.a.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.a.onSaveInstanceState(bundle);
    }

    public void onStart() {
        this.a.onStart();
    }

    public void onStop() {
        this.a.onStop();
    }
}
