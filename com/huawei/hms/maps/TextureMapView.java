package com.huawei.hms.maps;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.MapView;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import vigqyno.C0201;

public class TextureMapView extends MapView {
    private maa a;

    static class maa extends MapView.maa {
        public maa(ViewGroup viewGroup, Context context, HuaweiMapOptions huaweiMapOptions) {
            super(viewGroup, context, huaweiMapOptions);
        }

        @Override // com.huawei.hms.maps.MapView.maa
        public final mam a(maf maf, Context context, HuaweiMapOptions huaweiMapOptions) {
            try {
                Log.i(C0201.m82(35226), C0201.m82(35227));
                return maf.d(ObjectWrapper.wrap(context), huaweiMapOptions);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    public TextureMapView(Context context) {
        super(context);
        this.a = new maa(this, context, null);
    }

    public TextureMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new maa(this, context, HuaweiMapOptions.createFromAttributes(context, attributeSet));
    }

    public TextureMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new maa(this, context, HuaweiMapOptions.createFromAttributes(context, attributeSet));
    }

    public TextureMapView(Context context, HuaweiMapOptions huaweiMapOptions) {
        super(context, huaweiMapOptions);
        this.a = new maa(this, context, huaweiMapOptions);
    }

    @Override // com.huawei.hms.maps.MapView
    public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        this.a.a(onMapReadyCallback);
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.onCreate(bundle);
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onDestroy() {
        this.a.onDestroy();
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onPause() {
        this.a.onPause();
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onResume() {
        this.a.onResume();
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onSaveInstanceState(Bundle bundle) {
        this.a.onSaveInstanceState(bundle);
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onStart() {
        this.a.onStart();
    }

    @Override // com.huawei.hms.maps.MapView
    public final void onStop() {
        this.a.onStop();
    }
}
