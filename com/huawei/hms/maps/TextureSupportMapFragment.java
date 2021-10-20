package com.huawei.hms.maps;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.huawei.hms.maps.SupportMapFragment;
import com.huawei.hms.maps.internal.HmsUtil;
import vigqyno.C0201;

public class TextureSupportMapFragment extends Fragment {
    private final SupportMapFragment.maa a = new SupportMapFragment.maa(this, (byte) 0);

    public static TextureSupportMapFragment newInstance() {
        return new TextureSupportMapFragment();
    }

    public static TextureSupportMapFragment newInstance(HuaweiMapOptions huaweiMapOptions) {
        mco.b(C0201.m82(6336), C0201.m82(6337));
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0201.m82(6338), huaweiMapOptions);
        TextureSupportMapFragment textureSupportMapFragment = new TextureSupportMapFragment();
        textureSupportMapFragment.setArguments(bundle);
        return textureSupportMapFragment;
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        mco.a(C0201.m82(6339), C0201.m82(6340));
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
        mco.a(C0201.m82(6341), C0201.m82(6342));
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
        mco.a(C0201.m82(6343), C0201.m82(6344));
        this.a.onDestroy();
        HmsUtil.setRepeatFlag(true);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        mco.a(C0201.m82(6345), C0201.m82(6346));
        this.a.onDestroyView();
        super.onDestroyView();
    }

    public final void onEnterAmbient(Bundle bundle) {
        mco.a(C0201.m82(6347), C0201.m82(6348));
    }

    public final void onExitAmbient() {
        mco.a(C0201.m82(6349), C0201.m82(6350));
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"NewApi"})
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        String r0 = C0201.m82(6351);
        String r1 = C0201.m82(6352);
        mco.a(r0, r1);
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            mco.a(r0, r1);
            super.onInflate(activity, attributeSet, bundle);
            HuaweiMapOptions createFromAttributes = HuaweiMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(C0201.m82(6353), createFromAttributes);
            setArguments(bundle2);
            this.a.a = activity;
            this.a.onInflate(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onLowMemory() {
        mco.a(C0201.m82(6354), C0201.m82(6355));
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
        mco.a(C0201.m82(6356), C0201.m82(6357));
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
