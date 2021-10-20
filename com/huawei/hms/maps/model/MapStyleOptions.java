package com.huawei.hms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.common.parcel.ParcelReader;
import com.huawei.hms.common.parcel.ParcelWrite;
import com.huawei.hms.maps.mco;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

public class MapStyleOptions implements Parcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new Parcelable.Creator<MapStyleOptions>() {
        /* class com.huawei.hms.maps.model.MapStyleOptions.AnonymousClass1 */

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MapStyleOptions createFromParcel(Parcel parcel) {
            return new MapStyleOptions(parcel);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MapStyleOptions[] newArray(int i) {
            return new MapStyleOptions[i];
        }
    };
    private String a;

    public MapStyleOptions(Parcel parcel) {
        this.a = new ParcelReader(parcel).createString(2, null);
    }

    public MapStyleOptions(String str) {
        this.a = str;
    }

    public static MapStyleOptions loadAssetResouceStyle(String str) {
        return new MapStyleOptions(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004f, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        throw new android.content.res.Resources.NotFoundException(vigqyno.C0201.m82(36101).concat(java.lang.String.valueOf(r8)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006a, code lost:
        com.huawei.hms.maps.mco.d(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        com.huawei.hms.maps.mco.d(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        throw r8;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0051 */
    public static MapStyleOptions loadRawResourceStyle(Context context, int i) {
        String r0 = C0201.m82(36098);
        String r1 = C0201.m82(36099);
        InputStream openRawResource = context.getResources().openRawResource(i);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = openRawResource.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                MapStyleOptions mapStyleOptions = new MapStyleOptions(new String(byteArrayOutputStream.toByteArray(), C0201.m82(36100)));
                try {
                    openRawResource.close();
                } catch (IOException unused) {
                    mco.d(r1, r0);
                }
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused2) {
                    mco.d(r1, r0);
                }
                return mapStyleOptions;
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public String getJson() {
        return this.a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        ParcelWrite parcelWrite = new ParcelWrite(parcel);
        int beginObjectHeader = parcelWrite.beginObjectHeader();
        parcelWrite.writeString(2, this.a, false);
        parcelWrite.finishObjectHeader(beginObjectHeader);
    }
}
