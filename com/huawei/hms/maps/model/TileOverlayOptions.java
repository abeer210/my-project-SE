package com.huawei.hms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.huawei.hms.common.Preconditions;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.mci;
import vigqyno.C0201;

public class TileOverlayOptions implements Parcelable {
    public static final Parcelable.Creator<TileOverlayOptions> CREATOR = new Parcelable.Creator<TileOverlayOptions>() {
        /* class com.huawei.hms.maps.model.TileOverlayOptions.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TileOverlayOptions createFromParcel(Parcel parcel) {
            return new TileOverlayOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TileOverlayOptions[] newArray(int i) {
            return new TileOverlayOptions[i];
        }
    };
    private float a;
    private boolean b = true;
    private float c = 0.0f;
    private mci d = null;
    private boolean e = true;
    private TileProvider f;

    public TileOverlayOptions() {
    }

    public TileOverlayOptions(Parcel parcel) {
        ParcelReader parcelReader = new ParcelReader(parcel);
        this.a = parcelReader.readFloat(2, 0.0f);
        this.b = parcelReader.readBoolean(3, true);
        this.c = parcelReader.readFloat(4, 0.0f);
        IBinder readIBinder = parcelReader.readIBinder(5, null);
        if (readIBinder != null) {
            this.d = mci.maa.a(readIBinder);
        }
        this.e = parcelReader.readBoolean(6, true);
        this.f = new TileProvider() {
            /* class com.huawei.hms.maps.model.TileOverlayOptions.AnonymousClass2 */

            @Override // com.huawei.hms.maps.model.TileProvider
            public final Tile getTile(int i, int i2, int i3) {
                try {
                    return TileOverlayOptions.this.d.a(i, i2, i3);
                } catch (RemoteException unused) {
                    return null;
                }
            }
        };
    }

    public int describeContents() {
        return 0;
    }

    public TileOverlayOptions fadeIn(boolean z) {
        this.e = z;
        return this;
    }

    public boolean getFadeIn() {
        return this.e;
    }

    public TileProvider getTileProvider() {
        return this.f;
    }

    public float getTransparency() {
        return this.c;
    }

    public float getZIndex() {
        return this.a;
    }

    public boolean isVisible() {
        return this.b;
    }

    public TileOverlayOptions tileProvider(TileProvider tileProvider) {
        this.f = tileProvider;
        this.d = tileProvider == null ? null : new mci.maa() {
            /* class com.huawei.hms.maps.model.TileOverlayOptions.AnonymousClass3 */

            @Override // com.huawei.hms.maps.mci
            public final Tile a(int i, int i2, int i3) {
                return TileOverlayOptions.this.f.getTile(i, i2, i3);
            }
        };
        return this;
    }

    public TileOverlayOptions transparency(float f2) {
        boolean z = true;
        Preconditions.checkArgument(f2 >= 0.0f, C0201.m82(34336));
        if (f2 > 1.0f) {
            z = false;
        }
        Preconditions.checkArgument(z, C0201.m82(34337));
        this.c = f2;
        return this;
    }

    public TileOverlayOptions visible(boolean z) {
        this.b = z;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeFloat(2, this.a);
        parcelWrite.writeBoolean(3, this.b);
        parcelWrite.writeFloat(4, this.c);
        parcelWrite.writeIBinder(5, this.d.asBinder(), false);
        parcelWrite.writeBoolean(6, this.e);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }

    public TileOverlayOptions zIndex(float f2) {
        this.a = f2;
        return this;
    }
}
