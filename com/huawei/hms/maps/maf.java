package com.huawei.hms.maps;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.maps.mag;
import com.huawei.hms.maps.mak;
import com.huawei.hms.maps.mal;
import com.huawei.hms.maps.mam;
import com.huawei.hms.maps.mbq;
import com.huawei.hms.maps.mbr;
import vigqyno.C0188;
import vigqyno.C0201;

public interface maf extends IInterface {

    public static abstract class maa extends Binder implements maf {

        /* renamed from: com.huawei.hms.maps.maf$maa$maa  reason: collision with other inner class name */
        static class C0087maa implements maf {
            private IBinder a;

            public C0087maa(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // com.huawei.hms.maps.maf
            public final mal a(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions) {
                return mal.maa.a(mby.a(this.a, C0201.m82(3610), 2, iObjectWrapper != null ? iObjectWrapper.asBinder() : null, huaweiMapOptions));
            }

            @Override // com.huawei.hms.maps.maf
            public final mbr a(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions) {
                return mbr.maa.a(mby.a(this.a, C0201.m82(3611), 7, iObjectWrapper != null ? iObjectWrapper.asBinder() : null, streetViewPanoramaOptions));
            }

            @Override // com.huawei.hms.maps.maf
            public final void a(IObjectWrapper iObjectWrapper) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0201.m82(3612));
                    obtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    obtain.writeInt(C0188.f18);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override // com.huawei.hms.maps.maf
            public final mak b(IObjectWrapper iObjectWrapper) {
                return mak.maa.a(mby.a(this.a, C0201.m82(3613), 5, iObjectWrapper != null ? iObjectWrapper.asBinder() : null));
            }

            @Override // com.huawei.hms.maps.maf
            public final mam b(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions) {
                return mam.maa.a(mby.a(this.a, C0201.m82(3614), 3, iObjectWrapper != null ? iObjectWrapper.asBinder() : null, huaweiMapOptions));
            }

            @Override // com.huawei.hms.maps.maf
            public final mbq b(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions) {
                return mbq.maa.a(mby.a(this.a, C0201.m82(3615), 10, iObjectWrapper != null ? iObjectWrapper.asBinder() : null, streetViewPanoramaOptions));
            }

            @Override // com.huawei.hms.maps.maf
            public final mag c(IObjectWrapper iObjectWrapper) {
                return mag.maa.a(mby.a(this.a, C0201.m82(3616), 6, iObjectWrapper != null ? iObjectWrapper.asBinder() : null));
            }

            @Override // com.huawei.hms.maps.maf
            public final mal c(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions) {
                return mal.maa.a(mby.a(this.a, C0201.m82(3617), 11, iObjectWrapper != null ? iObjectWrapper.asBinder() : null, huaweiMapOptions));
            }

            @Override // com.huawei.hms.maps.maf
            public final mam d(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions) {
                return mam.maa.a(mby.a(this.a, C0201.m82(3618), 12, iObjectWrapper != null ? iObjectWrapper.asBinder() : null, huaweiMapOptions));
            }
        }

        public static maf a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(28931));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof maf)) ? new C0087maa(iBinder) : (maf) queryLocalInterface;
        }
    }

    mal a(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions);

    mbr a(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions);

    void a(IObjectWrapper iObjectWrapper);

    mak b(IObjectWrapper iObjectWrapper);

    mam b(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions);

    mbq b(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions);

    mag c(IObjectWrapper iObjectWrapper);

    mal c(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions);

    mam d(IObjectWrapper iObjectWrapper, HuaweiMapOptions huaweiMapOptions);
}
