package com.huawei.hms.maps;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.maps.MapFragment;
import com.huawei.hms.maps.internal.HmsUtil;
import vigqyno.C0201;

@TargetApi(11)
public class TextureMapFragment extends Fragment {
    private final MapFragment.maa a = new MapFragment.maa(this, (byte) 0);

    public static TextureMapFragment newInstance() {
        return new TextureMapFragment();
    }

    public static TextureMapFragment newInstance(HuaweiMapOptions huaweiMapOptions) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0201.m82(3772), huaweiMapOptions);
        TextureMapFragment textureMapFragment = new TextureMapFragment();
        textureMapFragment.setArguments(bundle);
        return textureMapFragment;
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        mco.a(C0201.m82(3773), C0201.m82(3774));
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
        mco.a(C0201.m82(3775), C0201.m82(3776));
        super.onAttach(activity);
        this.a.a = activity;
    }

    public void onCreate(Bundle bundle) {
        mco.a(C0201.m82(3777), C0201.m82(3778));
        super.onCreate(bundle);
        this.a.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mco.a(C0201.m82(3779), C0201.m82(3780));
        View onCreateView = this.a.onCreateView(layoutInflater, viewGroup, bundle);
        onCreateView.setClickable(true);
        return onCreateView;
    }

    public void onDestroy() {
        mco.a(C0201.m82(3781), C0201.m82(3782));
        this.a.onDestroy();
        HmsUtil.setRepeatFlag(true);
        super.onDestroy();
    }

    public void onDestroyView() {
        this.a.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        mco.a(C0201.m82(3783), C0201.m82(3784));
    }

    public final void onExitAmbient() {
        mco.a(C0201.m82(3785), C0201.m82(3786));
    }

    @Override // android.app.Fragment
    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        mco.a(C0201.m82(3787), C0201.m82(3788));
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            HuaweiMapOptions createFromAttributes = HuaweiMapOptions.createFromAttributes(activity, attributeSet);
            super.onInflate(activity, attributeSet, bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(C0201.m82(3789), createFromAttributes);
            setArguments(bundle2);
            this.a.a = activity;
            this.a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onLowMemory() {
        mco.a(C0201.m82(3790), C0201.m82(3791));
        this.a.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        mco.a(C0201.m82(3792), C0201.m82(3793));
        this.a.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.a.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        mco.a(C0201.m82(3794), C0201.m82(3795));
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
