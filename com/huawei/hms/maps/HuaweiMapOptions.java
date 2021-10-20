package com.huawei.hms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.api.R;
import com.huawei.hms.maps.model.CameraPosition;
import com.huawei.hms.maps.model.LatLng;
import com.huawei.hms.maps.model.LatLngBounds;
import vigqyno.C0201;

public final class HuaweiMapOptions implements Parcelable {
    public static final Parcelable.Creator<HuaweiMapOptions> CREATOR = new Parcelable.Creator<HuaweiMapOptions>() {
        /* class com.huawei.hms.maps.HuaweiMapOptions.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ HuaweiMapOptions createFromParcel(Parcel parcel) {
            return new HuaweiMapOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ HuaweiMapOptions[] newArray(int i) {
            return new HuaweiMapOptions[i];
        }
    };
    private int a = -1;
    private Boolean b;
    private Boolean c;
    private CameraPosition d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Float n;
    private Float o;
    private LatLngBounds p;
    private Boolean q;

    public HuaweiMapOptions() {
        Boolean bool = Boolean.TRUE;
        this.e = bool;
        this.f = bool;
        this.g = bool;
        this.h = bool;
        this.i = bool;
        this.j = bool;
        this.k = Boolean.FALSE;
        this.n = Float.valueOf(3.0f);
        this.o = Float.valueOf(20.0f);
        this.p = null;
    }

    public HuaweiMapOptions(Parcel parcel) {
        Boolean bool = Boolean.TRUE;
        this.e = bool;
        this.f = bool;
        this.g = bool;
        this.h = bool;
        this.i = bool;
        this.j = bool;
        this.k = Boolean.FALSE;
        this.n = Float.valueOf(3.0f);
        this.o = Float.valueOf(20.0f);
        this.p = null;
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.a = parcelReader.readInt(2, this.a);
        this.b = parcelReader.readBooleanObject(3, null);
        this.c = parcelReader.readBooleanObject(4, null);
        this.e = parcelReader.readBooleanObject(5, null);
        this.f = parcelReader.readBooleanObject(6, null);
        this.g = parcelReader.readBooleanObject(7, null);
        this.h = parcelReader.readBooleanObject(8, null);
        this.i = parcelReader.readBooleanObject(9, null);
        this.j = parcelReader.readBooleanObject(10, null);
        this.k = parcelReader.readBooleanObject(11, null);
        this.l = parcelReader.readBooleanObject(12, null);
        this.m = parcelReader.readBooleanObject(13, null);
        this.n = parcelReader.readFloatObject(14, null);
        this.o = parcelReader.readFloatObject(15, null);
        this.p = (LatLngBounds) parcelReader.readParcelable(16, LatLngBounds.CREATOR, null);
        this.d = (CameraPosition) parcelReader.readParcelable(17, CameraPosition.CREATOR, null);
        this.q = parcelReader.readBooleanObject(18, null);
    }

    public static CameraPosition buildCameraPosition(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLat) ? obtainAttributes.getFloat(R.styleable.MapAttrs_cameraTargetLat, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraTargetLng) ? obtainAttributes.getFloat(R.styleable.MapAttrs_cameraTargetLng, 0.0f) : 0.0f));
        CameraPosition.Builder builder = CameraPosition.builder();
        builder.target(latLng);
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraZoom)) {
            builder.zoom(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraZoom, 0.0f));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraBearing)) {
            builder.bearing(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraBearing, 0.0f));
        }
        if (obtainAttributes.hasValue(R.styleable.MapAttrs_cameraTilt)) {
            builder.tilt(obtainAttributes.getFloat(R.styleable.MapAttrs_cameraTilt, 0.0f));
        }
        obtainAttributes.recycle();
        return builder.build();
    }

    public static LatLngBounds buildLatLngBounds(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.MapAttrs);
        Float valueOf = obtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsSouthWestLatitude) ? Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsSouthWestLatitude, 0.0f)) : null;
        Float valueOf2 = obtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsSouthWestLongitude) ? Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsSouthWestLongitude, 0.0f)) : null;
        Float valueOf3 = obtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsNorthEastLatitude) ? Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsNorthEastLatitude, 0.0f)) : null;
        Float valueOf4 = obtainAttributes.hasValue(R.styleable.MapAttrs_latLngBoundsNorthEastLongitude) ? Float.valueOf(obtainAttributes.getFloat(R.styleable.MapAttrs_latLngBoundsNorthEastLongitude, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    public static HuaweiMapOptions createFromAttributes(Context context, AttributeSet attributeSet) {
        HuaweiMapOptions huaweiMapOptions = new HuaweiMapOptions();
        String r1 = C0201.m82(15858);
        if (attributeSet == null) {
            mco.a(r1, C0201.m82(15859));
            return huaweiMapOptions;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.MapAttrs, 0, 0);
        try {
            int i2 = obtainStyledAttributes.getInt(R.styleable.MapAttrs_mapType, 1);
            mco.a(r1, C0201.m82(15860).concat(String.valueOf(i2)));
            if (i2 == 0) {
                huaweiMapOptions.a = 0;
            } else {
                huaweiMapOptions.a = 1;
            }
            huaweiMapOptions.d = CameraPosition.createFromAttributes(context, attributeSet);
            huaweiMapOptions.e = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiZoomControls, true));
            huaweiMapOptions.f = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiCompass, true));
            if (obtainStyledAttributes.hasValue(R.styleable.MapAttrs_uiZoomGestures)) {
                huaweiMapOptions.h = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiZoomGestures, true));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MapAttrs_uiScrollGestures)) {
                huaweiMapOptions.g = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiScrollGestures, true));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MapAttrs_uiRotateGestures)) {
                huaweiMapOptions.j = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiRotateGestures, true));
            }
            if (obtainStyledAttributes.hasValue(R.styleable.MapAttrs_uiTiltGestures)) {
                huaweiMapOptions.i = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiTiltGestures, true));
            }
            huaweiMapOptions.b = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.MapAttrs_zOrderOnTop, false));
            huaweiMapOptions.c = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.MapAttrs_useViewLifecycle, true));
            huaweiMapOptions.k = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.MapAttrs_liteMode, false));
            huaweiMapOptions.q = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiScrollGesturesDuringRotateOrZoom, false));
            huaweiMapOptions.l = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.MapAttrs_uiMapToolbar, false));
            huaweiMapOptions.m = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.MapAttrs_ambientEnabled, false));
            huaweiMapOptions.n = Float.valueOf(obtainStyledAttributes.getFloat(R.styleable.MapAttrs_cameraMinZoomPreference, 0.0f));
            huaweiMapOptions.o = Float.valueOf(obtainStyledAttributes.getFloat(R.styleable.MapAttrs_cameraMaxZoomPreference, 22.0f));
            huaweiMapOptions.latLngBoundsForCameraTarget(buildLatLngBounds(context, attributeSet));
            return huaweiMapOptions;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final HuaweiMapOptions ambientEnabled(boolean z) {
        this.m = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions camera(CameraPosition cameraPosition) {
        this.d = cameraPosition;
        return this;
    }

    public final HuaweiMapOptions compassEnabled(boolean z) {
        this.f = Boolean.valueOf(z);
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final Boolean getAmbientEnabled() {
        return Boolean.FALSE;
    }

    public final CameraPosition getCamera() {
        return this.d;
    }

    public final Boolean getCompassEnabled() {
        return this.f;
    }

    public final LatLngBounds getLatLngBoundsForCameraTarget() {
        return this.p;
    }

    public final Boolean getLiteMode() {
        return this.k;
    }

    public final Boolean getMapToolbarEnabled() {
        return Boolean.FALSE;
    }

    public final int getMapType() {
        return this.a;
    }

    public final Float getMaxZoomPreference() {
        return this.o;
    }

    public final Float getMinZoomPreference() {
        return this.n;
    }

    public final Boolean getRotateGesturesEnabled() {
        return this.j;
    }

    public final Boolean getScrollGesturesEnabled() {
        return this.g;
    }

    public final Boolean getTiltGesturesEnabled() {
        return this.i;
    }

    public final Boolean getUseViewLifecycleInFragment() {
        return this.c;
    }

    public final Boolean getZOrderOnTop() {
        return this.b;
    }

    public final Boolean getZoomControlsEnabled() {
        return this.e;
    }

    public final Boolean getZoomGesturesEnabled() {
        return this.h;
    }

    public final HuaweiMapOptions latLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
        this.p = latLngBounds;
        return this;
    }

    public final HuaweiMapOptions liteMode(boolean z) {
        this.k = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions mapToolbarEnabled(boolean z) {
        this.l = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions mapType(int i2) {
        this.a = i2;
        return this;
    }

    public final HuaweiMapOptions maxZoomPreference(float f2) {
        this.o = Float.valueOf(f2);
        return this;
    }

    public final HuaweiMapOptions minZoomPreference(float f2) {
        this.n = Float.valueOf(f2);
        return this;
    }

    public final HuaweiMapOptions rotateGesturesEnabled(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions scrollGesturesEnabled(boolean z) {
        this.g = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions tiltGesturesEnabled(boolean z) {
        this.i = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        return C0201.m82(15861) + this.a + C0201.m82(15862) + this.b + C0201.m82(15863) + this.c + C0201.m82(15864) + this.d + C0201.m82(15865) + this.e + C0201.m82(15866) + this.f + C0201.m82(15867) + this.g + C0201.m82(15868) + this.h + C0201.m82(15869) + this.i + C0201.m82(15870) + this.j + C0201.m82(15871) + this.k + C0201.m82(15872) + this.l + C0201.m82(15873) + this.m + C0201.m82(15874) + this.n + C0201.m82(15875) + this.o + C0201.m82(15876) + this.p + '}';
    }

    public final HuaweiMapOptions useViewLifecycleInFragment(boolean z) {
        this.c = Boolean.valueOf(z);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.a);
        parcelWrite.writeBooleanObject(3, this.b);
        parcelWrite.writeBooleanObject(4, this.c);
        parcelWrite.writeBooleanObject(5, this.e);
        parcelWrite.writeBooleanObject(6, this.f);
        parcelWrite.writeBooleanObject(7, this.g);
        parcelWrite.writeBooleanObject(8, this.h);
        parcelWrite.writeBooleanObject(9, this.i);
        parcelWrite.writeBooleanObject(10, this.j);
        parcelWrite.writeBooleanObject(11, this.k);
        parcelWrite.writeBooleanObject(12, this.l);
        parcelWrite.writeBooleanObject(13, this.m);
        parcelWrite.writeFloatObject(14, this.n, true);
        parcelWrite.writeFloatObject(15, this.o, true);
        parcelWrite.writeParcelable(16, this.p, i2, false);
        parcelWrite.writeParcelable(17, this.d, i2, false);
        parcelWrite.writeBooleanObject(18, this.q);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public final HuaweiMapOptions zOrderOnTop(boolean z) {
        this.b = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions zoomControlsEnabled(boolean z) {
        this.e = Boolean.valueOf(z);
        return this;
    }

    public final HuaweiMapOptions zoomGesturesEnabled(boolean z) {
        this.h = Boolean.valueOf(z);
        return this;
    }
}
