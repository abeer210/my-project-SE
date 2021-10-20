package com.huawei.hms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
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
import com.huawei.hms.maps.mbm;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

@Deprecated
public class StreetViewPanoramaView extends FrameLayout {
    private StreetViewDeferredLifecycleHelper a;

    static class StreetViewDeferredLifecycleHelper extends DeferredLifecycleHelper<StreetViewLifecycleDelegate> {
        public boolean a = false;
        private ViewGroup b;
        private Context c;
        private OnDelegateCreatedListener<StreetViewLifecycleDelegate> d;
        private StreetViewPanoramaOptions e;
        private List<OnStreetViewPanoramaReadyCallback> f = new ArrayList();

        public StreetViewDeferredLifecycleHelper(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.b = viewGroup;
            this.c = context;
            this.e = streetViewPanoramaOptions;
        }

        @Override // com.huawei.hms.feature.dynamic.DeferredLifecycleHelper
        public void createDelegate(OnDelegateCreatedListener<StreetViewLifecycleDelegate> onDelegateCreatedListener) {
            if (!this.a) {
                int i = 1;
                this.a = true;
                this.d = onDelegateCreatedListener;
                if (onDelegateCreatedListener != null && getDelegate() == null) {
                    MapsInitializer.initialize(this.c);
                    try {
                        int isHmsAvailable = HmsUtil.isHmsAvailable(this.c);
                        String r1 = C0201.m82(36822);
                        if (isHmsAvailable != 0) {
                            mco.d(r1, C0201.m82(36823).concat(String.valueOf(isHmsAvailable)));
                            return;
                        }
                        maf a2 = mbu.a(this.c);
                        if (a2 == null) {
                            while (a2 == null && i < 30) {
                                try {
                                    mco.a(r1, C0201.m82(36824) + i + C0201.m82(36825) + a2);
                                    i++;
                                    a2 = mbu.a(this.c);
                                    Thread.sleep(100);
                                } catch (InterruptedException e2) {
                                    mco.d(r1, C0201.m82(36826) + e2.getMessage());
                                }
                            }
                            mco.b(r1, C0201.m82(36827).concat(String.valueOf(a2)));
                        }
                        if (a2 != null) {
                            MapClientIdentify mapClientIdentify = new MapClientIdentify();
                            Context b2 = mbu.b(this.c);
                            mapClientIdentify.a(this.c, a2);
                            mbr a3 = a2.a(ObjectWrapper.wrap(b2), this.e);
                            mco.b(r1, C0201.m82(36828).concat(String.valueOf(a3)));
                            if (a3 == null) {
                                mco.c(r1, C0201.m82(36829));
                                return;
                            }
                            this.d.onDelegateCreated(new StreetViewLifecycleDelegate(this.b, a3));
                            for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.f) {
                                ((StreetViewLifecycleDelegate) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
                            }
                        }
                    } catch (RemoteException e3) {
                        throw new RuntimeRemoteException(e3);
                    }
                }
            }
        }

        public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            if (getDelegate() != null) {
                ((StreetViewLifecycleDelegate) getDelegate()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            } else {
                this.f.add(onStreetViewPanoramaReadyCallback);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class StreetViewLifecycleDelegate implements StreetLifecycleDelegate {
        private ViewGroup a;
        private mbr b;
        private View c;

        public StreetViewLifecycleDelegate(ViewGroup viewGroup, mbr mbr) {
            this.a = (ViewGroup) Preconditions.checkNotNull(viewGroup);
            this.b = (mbr) Preconditions.checkNotNull(mbr);
        }

        @Override // com.huawei.hms.maps.StreetLifecycleDelegate
        public void getStreetViewPanoramaAsync(final OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.b.a(new mbm.maa() {
                    /* class com.huawei.hms.maps.StreetViewPanoramaView.StreetViewLifecycleDelegate.AnonymousClass1 */

                    public void onStreetViewPanoramaReadyCallback(mbp mbp) {
                        onStreetViewPanoramaReadyCallback.onStreetViewPanoramaReady(new StreetViewPanorama(mbp));
                    }
                });
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onCreate(Bundle bundle) {
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
        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException(C0201.m82(37114));
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onDestroy() {
            try {
                this.b.b();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onDestroyView() {
            throw new UnsupportedOperationException(C0201.m82(37115));
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException(C0201.m82(37116));
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onLowMemory() {
            try {
                this.b.c();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onPause() {
            try {
                this.b.d();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onResume() {
            try {
                mco.a(C0201.m82(37117), C0201.m82(37118));
                this.b.e();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onSaveInstanceState(Bundle bundle) {
            try {
                Bundle a2 = mbv.a(bundle);
                this.b.b(a2);
                mbv.a(a2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onStart() {
            try {
                mco.a(C0201.m82(37119), C0201.m82(37120));
                this.b.f();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.huawei.hms.feature.dynamic.LifecycleDelegate
        public void onStop() {
            try {
                this.b.g();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.a = new StreetViewDeferredLifecycleHelper(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.a = new StreetViewDeferredLifecycleHelper(this, context, streetViewPanoramaOptions);
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        mco.a(C0201.m82(31395), C0201.m82(31396));
        this.a.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
    }

    public final void onCreate(Bundle bundle) {
        mco.a(C0201.m82(31397), C0201.m82(31398));
        this.a.onCreate(bundle);
    }

    public final void onDestroy() {
        mco.a(C0201.m82(31399), C0201.m82(31400));
        this.a.onDestroy();
    }

    public final void onLowMemory() {
        mco.a(C0201.m82(31401), C0201.m82(31402));
        this.a.onLowMemory();
    }

    public final void onPause() {
        mco.a(C0201.m82(31403), C0201.m82(31404));
        this.a.onPause();
    }

    public final void onResume() {
        mco.a(C0201.m82(31405), C0201.m82(31406));
        this.a.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        mco.a(C0201.m82(31407), C0201.m82(31408));
        this.a.onSaveInstanceState(bundle);
    }
}
