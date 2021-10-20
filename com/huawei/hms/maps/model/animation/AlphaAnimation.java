package com.huawei.hms.maps.model.animation;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;

public class AlphaAnimation extends Animation {
    public static final Parcelable.Creator<AlphaAnimation> CREATOR = new Parcelable.Creator<AlphaAnimation>() {
        /* class com.huawei.hms.maps.model.animation.AlphaAnimation.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AlphaAnimation createFromParcel(Parcel parcel) {
            return new AlphaAnimation(new ParcelReader(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AlphaAnimation[] newArray(int i) {
            return new AlphaAnimation[0];
        }
    };
    private float h;
    private float i;

    public AlphaAnimation(float f, float f2) {
        this.a = 1;
        this.h = Math.min(Math.max(f, 0.0f), 1.0f);
        this.i = Math.min(Math.max(f2, 0.0f), 1.0f);
    }

    public AlphaAnimation(ParcelReader parcelReader) {
        super(parcelReader);
        this.h = parcelReader.readFloat(8, 0.0f);
        this.i = parcelReader.readFloat(9, 0.0f);
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    public final void a(ParcelWrite parcelWrite, int i2) {
        parcelWrite.writeFloat(8, this.h);
        parcelWrite.writeFloat(9, this.i);
    }

    public float getFromAlpha() {
        return this.h;
    }

    public float getToAlpha() {
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
