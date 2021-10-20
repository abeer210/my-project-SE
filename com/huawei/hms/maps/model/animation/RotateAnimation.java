package com.huawei.hms.maps.model.animation;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;

public class RotateAnimation extends Animation {
    public static final Parcelable.Creator<RotateAnimation> CREATOR = new Parcelable.Creator<RotateAnimation>() {
        /* class com.huawei.hms.maps.model.animation.RotateAnimation.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RotateAnimation createFromParcel(Parcel parcel) {
            return new RotateAnimation(new ParcelReader(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RotateAnimation[] newArray(int i) {
            return new RotateAnimation[0];
        }
    };
    private float h;
    private float i;

    public RotateAnimation(float f, float f2) {
        this.a = 2;
        this.h = f;
        this.i = f2;
    }

    public RotateAnimation(ParcelReader parcelReader) {
        super(parcelReader);
        this.h = parcelReader.readFloat(8, 0.0f);
        this.i = parcelReader.readFloat(9, 0.0f);
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    public final void a(ParcelWrite parcelWrite, int i2) {
        parcelWrite.writeFloat(8, this.h);
        parcelWrite.writeFloat(9, this.i);
    }

    public float getFromDegree() {
        return this.h;
    }

    public float getToDegree() {
        return this.i;
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    public void setDuration(long j) {
        this.e = j;
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    public void setInterpolator(Interpolator interpolator) {
        this.f = interpolator;
    }
}
