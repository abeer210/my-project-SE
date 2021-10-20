package com.huawei.hms.maps.model.animation;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;

public class ScaleAnimation extends Animation {
    public static final Parcelable.Creator<ScaleAnimation> CREATOR = new Parcelable.Creator<ScaleAnimation>() {
        /* class com.huawei.hms.maps.model.animation.ScaleAnimation.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ScaleAnimation createFromParcel(Parcel parcel) {
            return new ScaleAnimation(new ParcelReader(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ScaleAnimation[] newArray(int i) {
            return new ScaleAnimation[0];
        }
    };
    private float h;
    private float i;
    private float j;
    private float k;

    public ScaleAnimation(float f, float f2, float f3, float f4) {
        this.a = 3;
        this.b = 1;
        this.h = Math.max(f, 0.0f);
        this.i = Math.max(f2, 0.0f);
        this.j = Math.max(f3, 0.0f);
        this.k = Math.max(f4, 0.0f);
    }

    public ScaleAnimation(ParcelReader parcelReader) {
        super(parcelReader);
        this.h = parcelReader.readFloat(8, 0.0f);
        this.i = parcelReader.readFloat(9, 0.0f);
        this.j = parcelReader.readFloat(10, 0.0f);
        this.k = parcelReader.readFloat(11, 0.0f);
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    public final void a(ParcelWrite parcelWrite, int i2) {
        parcelWrite.writeFloat(8, this.h);
        parcelWrite.writeFloat(9, this.i);
        parcelWrite.writeFloat(10, this.j);
        parcelWrite.writeFloat(11, this.k);
    }

    public float getFromX() {
        return this.h;
    }

    public float getFromY() {
        return this.j;
    }

    public float getToX() {
        return this.i;
    }

    public float getToY() {
        return this.k;
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    public void setDuration(long j2) {
        this.e = j2;
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    public void setInterpolator(Interpolator interpolator) {
        this.f = interpolator;
    }
}
