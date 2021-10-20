package com.huawei.hms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.maps.model.RuntimeRemoteException;
import vigqyno.C0201;

public final class maa {
    public static View a(Activity activity, mal mal, ViewGroup viewGroup, Bundle bundle) {
        View view;
        String r0 = C0201.m82(35065);
        try {
            Bundle a = mbv.a(bundle);
            Context b = mbu.b(activity);
            if (mal != null) {
                mco.a(r0, C0201.m82(35066).concat(String.valueOf(mal)));
                view = (View) ObjectWrapper.unwrap(mal.a(ObjectWrapper.wrap(LayoutInflater.from(b)), ObjectWrapper.wrap(viewGroup), a));
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        mco.a(r0, C0201.m82(35067));
                        ((ViewGroup) parent).removeView(view);
                    }
                }
            } else {
                view = LayoutInflater.from(b).inflate(R.layout.empty_layout, (ViewGroup) null);
            }
            mbv.a(a);
            return view;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
