package com.huawei.hms.maps.model.animation;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import java.util.ArrayList;
import java.util.List;

public class AnimationSet extends Animation {
    public static final Parcelable.Creator<AnimationSet> CREATOR = new Parcelable.Creator<AnimationSet>() {
        /* class com.huawei.hms.maps.model.animation.AnimationSet.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AnimationSet createFromParcel(Parcel parcel) {
            return new AnimationSet(new ParcelReader(parcel));
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AnimationSet[] newArray(int i) {
            return new AnimationSet[0];
        }
    };
    private boolean h;
    private List<Animation> i = new ArrayList();

    public AnimationSet(ParcelReader parcelReader) {
        super(parcelReader);
        this.h = parcelReader.readBoolean(8, false);
        this.i = parcelReader.createTypedList(9, Animation.CREATOR, new ArrayList());
    }

    public AnimationSet(boolean z) {
        this.a = 5;
        this.h = z;
    }

    @Override // com.huawei.hms.maps.model.animation.Animation
    public final void a(ParcelWrite parcelWrite, int i2) {
        parcelWrite.writeBoolean(8, this.h);
        parcelWrite.writeTypedList(9, this.i, false);
    }

    public void addAnimation(Animation animation) {
        this.i.add(animation);
    }

    public void cleanAnimation() {
        this.i.clear();
    }

    public List<Animation> getAnimations() {
        return this.i;
    }

    public boolean isShareInterpolator() {
        return this.h;
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
