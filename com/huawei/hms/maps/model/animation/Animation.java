package com.huawei.hms.maps.model.animation;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.animation.Interpolator;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import vigqyno.C0201;

public abstract class Animation implements Parcelable {
    public static final Parcelable.Creator<Animation> CREATOR = new Parcelable.Creator<Animation>() {
        /* class com.huawei.hms.maps.model.animation.Animation.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Animation createFromParcel(Parcel parcel) {
            return Animation.a(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Animation[] newArray(int i) {
            return new Animation[0];
        }
    };
    public static final int FILL_MODE_BACKWARDS = 0;
    public static final int FILL_MODE_FORWARDS = 0;
    public static final int INFINITE = 0;
    public static final int RESTART = 0;
    public static final int REVERSE = 0;
    public int a;
    public int b = 0;
    public int c = 1;
    public int d = 0;
    public long e = 250;
    public Interpolator f;
    public AnimationListener g;

    public interface AnimationListener {
        void onAnimationEnd();

        void onAnimationStart();
    }

    static {
        C0201.m83(Animation.class, 439);
    }

    public Animation() {
    }

    public Animation(ParcelReader parcelReader) {
        this.a = parcelReader.readInt(2, 0);
        this.b = parcelReader.readInt(3, 0);
        this.c = parcelReader.readInt(4, 0);
        this.d = parcelReader.readInt(5, 0);
        this.e = parcelReader.readLong(6, 0);
        IBinder readIBinder = parcelReader.readIBinder(7, null);
        if (readIBinder != null) {
            this.f = (Interpolator) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(readIBinder));
        }
    }

    public static /* synthetic */ Animation a(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        int readInt = parcelReader.readInt(2, 0);
        if (readInt == 1) {
            return new AlphaAnimation(parcelReader);
        }
        if (readInt == 2) {
            return new RotateAnimation(parcelReader);
        }
        if (readInt == 3) {
            return new ScaleAnimation(parcelReader);
        }
        if (readInt == 4) {
            return new TranslateAnimation(parcelReader);
        }
        if (readInt != 5) {
            return null;
        }
        return new AnimationSet(parcelReader);
    }

    public abstract void a(ParcelWrite parcelWrite, int i);

    public int describeContents() {
        return 0;
    }

    public long getDuration() {
        return this.e;
    }

    public int getFillMode() {
        return this.b;
    }

    public Interpolator getInterpolator() {
        return this.f;
    }

    public AnimationListener getListener() {
        return this.g;
    }

    public int getRepeatCount() {
        return this.d;
    }

    public int getRepeatMode() {
        return this.c;
    }

    public void setAnimationListener(AnimationListener animationListener) {
        this.g = animationListener;
    }

    public abstract void setDuration(long j);

    public void setFillMode(int i) {
        this.b = i;
    }

    public abstract void setInterpolator(Interpolator interpolator);

    public void setRepeatCount(int i) {
        this.d = i;
    }

    public void setRepeatMode(int i) {
        this.c = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeInt(2, this.a);
        parcelWrite.writeInt(3, this.b);
        parcelWrite.writeInt(4, this.c);
        parcelWrite.writeInt(5, this.d);
        parcelWrite.writeLong(6, this.e);
        parcelWrite.writeIBinder(7, ObjectWrapper.wrap(this.f).asBinder(), false);
        a(parcelWrite, i);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
