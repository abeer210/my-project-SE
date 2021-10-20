package com.huawei.hms.maps;

import android.graphics.Point;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.CameraUpdateParam;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import vigqyno.C0201;

public final class CameraUpdateFactory {
    private CameraUpdateFactory() {
    }

    public static CameraUpdate newCameraPosition(CameraPosition cameraPosition) {
        mco.a(C0201.m82(12621), C0201.m82(12622));
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setCameraPosition(cameraPosition);
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate newLatLng(LatLng latLng) {
        mco.a(C0201.m82(12623), C0201.m82(12624));
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setLatLng(latLng);
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i) {
        mco.a(C0201.m82(12625), C0201.m82(12626));
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setNewLatLngBounds(new CameraUpdateParam.NewLatLngBounds(latLngBounds, i));
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate newLatLngBounds(LatLngBounds latLngBounds, int i, int i2, int i3) {
        mco.a(C0201.m82(12627), C0201.m82(12628));
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setNewLatLngBoundsWidthHeight(new CameraUpdateParam.NewLatLngBoundsWidthHeight(latLngBounds, i, i2, i3));
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate newLatLngZoom(LatLng latLng, float f) {
        mco.a(C0201.m82(12629), C0201.m82(12630));
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setNewLatLngZoom(new CameraUpdateParam.NewLatLngZoom(latLng, f));
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate scrollBy(float f, float f2) {
        mco.a(C0201.m82(12631), C0201.m82(12632));
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setScrollBy(new CameraUpdateParam.ScrollBy(f, f2));
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate zoomBy(float f) {
        mco.a(C0201.m82(12633), C0201.m82(12634));
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setZoomBy(new CameraUpdateParam.ZoomBy(f));
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate zoomBy(float f, Point point) {
        mco.a(C0201.m82(12635), C0201.m82(12636));
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setZoomByWithFocus(new CameraUpdateParam.ZoomByWithFocus(f, point));
        return new CameraUpdate(cameraUpdateParam);
    }

    public static CameraUpdate zoomIn() {
        mco.a(C0201.m82(12637), C0201.m82(12638));
        return zoomBy(1.0f);
    }

    public static CameraUpdate zoomOut() {
        return zoomBy(-1.0f);
    }

    public static CameraUpdate zoomTo(float f) {
        mco.a(C0201.m82(12639), C0201.m82(12640));
        CameraUpdateParam cameraUpdateParam = new CameraUpdateParam();
        cameraUpdateParam.setZoomTo(new CameraUpdateParam.ZoomTo(f));
        return new CameraUpdate(cameraUpdateParam);
    }
}
