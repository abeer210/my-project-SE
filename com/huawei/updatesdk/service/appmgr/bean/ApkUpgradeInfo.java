package com.huawei.updatesdk.service.appmgr.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.updatesdk.a.b.d.c.b;
import java.io.Serializable;
import vigqyno.C0201;

public class ApkUpgradeInfo extends b implements Serializable, Parcelable {
    public static final int APP_MUST_UPDATE = 0;
    public static final Parcelable.Creator<ApkUpgradeInfo> CREATOR = new a();
    public static final int HUAWEI_OFFICIAL_APP = 0;
    public static final int NOT_AUTOUPDATE = 0;
    private static final String TAG = null;
    public static final int UPGRADE_SAME_SIGNATURE = 0;
    private static final long serialVersionUID = 0;
    private long bundleSize_;
    private String detailId_;
    private int devType_ = 0;
    private String diffDownUrl;
    private String diffSha2_;
    private int diffSize_;
    private String downurl_;
    private String fullDownUrl_;
    private String icon_;
    private String id_;
    private int isAutoUpdate_ = 0;
    private int isCompulsoryUpdate_ = 0;
    private int maple_;
    private String name_;
    private String newFeatures_;
    private String notRcmReason_;
    private long obbSize_;
    private int oldVersionCode_;
    private String oldVersionName_;
    private String package_;
    private int packingType_;
    private String releaseDateDesc_;
    private String releaseDate_;
    private int sameS_ = 0;
    private String sha256_;
    private long size_;
    private int state_ = 2;
    private int versionCode_;
    private String version_;

    static class a implements Parcelable.Creator<ApkUpgradeInfo> {
        @Override // android.os.Parcelable.Creator
        public ApkUpgradeInfo createFromParcel(Parcel parcel) {
            return new ApkUpgradeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ApkUpgradeInfo[] newArray(int i) {
            return new ApkUpgradeInfo[i];
        }
    }

    static {
        C0201.m83(ApkUpgradeInfo.class, 581);
    }

    public ApkUpgradeInfo() {
    }

    public ApkUpgradeInfo(Parcel parcel) {
        this.id_ = parcel.readString();
        this.name_ = parcel.readString();
        this.package_ = parcel.readString();
        this.oldVersionName_ = parcel.readString();
        this.version_ = parcel.readString();
        this.diffSize_ = parcel.readInt();
        this.diffDownUrl = parcel.readString();
        this.diffSha2_ = parcel.readString();
        this.sameS_ = parcel.readInt();
        this.size_ = parcel.readLong();
        this.obbSize_ = parcel.readLong();
        this.releaseDate_ = parcel.readString();
        this.icon_ = parcel.readString();
        this.oldVersionCode_ = parcel.readInt();
        this.versionCode_ = parcel.readInt();
        this.downurl_ = parcel.readString();
        this.sha256_ = parcel.readString();
        this.newFeatures_ = parcel.readString();
        this.releaseDateDesc_ = parcel.readString();
        this.state_ = parcel.readInt();
        this.detailId_ = parcel.readString();
        this.isAutoUpdate_ = parcel.readInt();
        this.isCompulsoryUpdate_ = parcel.readInt();
        this.notRcmReason_ = parcel.readString();
        this.devType_ = parcel.readInt();
        this.fullDownUrl_ = parcel.readString();
        this.maple_ = parcel.readInt();
        this.packingType_ = parcel.readInt();
        this.bundleSize_ = parcel.readLong();
    }

    public int describeContents() {
        return 0;
    }

    public long getBundleSize_() {
        return this.bundleSize_;
    }

    public String getDetailId_() {
        return this.detailId_;
    }

    public int getDevType_() {
        return this.devType_;
    }

    public String getDiffDownUrl_() {
        return this.diffDownUrl;
    }

    public String getDiffSha2_() {
        return this.diffSha2_;
    }

    public int getDiffSize_() {
        return this.diffSize_;
    }

    public String getDownurl_() {
        return this.downurl_;
    }

    public String getFullDownUrl_() {
        return this.fullDownUrl_;
    }

    public String getIcon_() {
        return this.icon_;
    }

    public String getId_() {
        return this.id_;
    }

    public int getIsAutoUpdate_() {
        return this.isAutoUpdate_;
    }

    public int getIsCompulsoryUpdate_() {
        return this.isCompulsoryUpdate_;
    }

    public long getLongSize_() {
        return this.size_;
    }

    public int getMaple_() {
        return this.maple_;
    }

    public String getName_() {
        return this.name_;
    }

    public String getNewFeatures_() {
        return this.newFeatures_;
    }

    public String getNotRcmReason_() {
        return this.notRcmReason_;
    }

    public long getObbSize_() {
        return this.obbSize_;
    }

    public int getOldVersionCode_() {
        return this.oldVersionCode_;
    }

    public String getOldVersionName_() {
        return this.oldVersionName_;
    }

    public String getPackage_() {
        return this.package_;
    }

    public int getPackingType_() {
        return this.packingType_;
    }

    public String getReleaseDateDesc_() {
        return this.releaseDateDesc_;
    }

    public String getReleaseDate_() {
        return this.releaseDate_;
    }

    public int getSameS_() {
        return this.sameS_;
    }

    public String getSha256_() {
        return this.sha256_;
    }

    @Deprecated
    public int getSize_() {
        return (int) this.size_;
    }

    public int getState_() {
        return this.state_;
    }

    public int getVersionCode_() {
        return this.versionCode_;
    }

    public String getVersion_() {
        return this.version_;
    }

    public void setBundleSize_(long j) {
        this.bundleSize_ = j;
    }

    public void setDetailId_(String str) {
        this.detailId_ = str;
    }

    public void setDevType_(int i) {
        this.devType_ = i;
    }

    public void setDiffDownUrl_(String str) {
        this.diffDownUrl = str;
    }

    public void setDiffSha2_(String str) {
        this.diffSha2_ = str;
    }

    public void setDiffSize_(int i) {
        this.diffSize_ = i;
    }

    public void setDownurl_(String str) {
        this.downurl_ = str;
    }

    public void setFullDownUrl_(String str) {
        this.fullDownUrl_ = str;
    }

    public void setIcon_(String str) {
        this.icon_ = str;
    }

    public void setId_(String str) {
        this.id_ = str;
    }

    public void setIsAutoUpdate_(int i) {
        this.isAutoUpdate_ = i;
    }

    public void setIsCompulsoryUpdate_(int i) {
        this.isCompulsoryUpdate_ = i;
    }

    public void setMaple_(int i) {
        this.maple_ = i;
    }

    public void setName_(String str) {
        this.name_ = str;
    }

    public void setNewFeatures_(String str) {
        this.newFeatures_ = str;
    }

    public void setNotRcmReason_(String str) {
        this.notRcmReason_ = str;
    }

    public void setObbSize_(long j) {
        this.obbSize_ = j;
    }

    public void setOldVersionCode_(int i) {
        this.oldVersionCode_ = i;
    }

    public void setOldVersionName_(String str) {
        this.oldVersionName_ = str;
    }

    public void setPackage_(String str) {
        this.package_ = str;
    }

    public void setPackingType_(int i) {
        this.packingType_ = i;
    }

    public void setReleaseDateDesc_(String str) {
        this.releaseDateDesc_ = str;
    }

    public void setReleaseDate_(String str) {
        this.releaseDate_ = str;
    }

    public void setSameS_(int i) {
        this.sameS_ = i;
    }

    public void setSha256_(String str) {
        this.sha256_ = str;
    }

    public void setSize_(long j) {
        this.size_ = j;
    }

    public void setState_(int i) {
        this.state_ = i;
    }

    public void setVersionCode_(int i) {
        this.versionCode_ = i;
    }

    public void setVersion_(String str) {
        this.version_ = str;
    }

    public String toString() {
        return C0201.m82(19649) + getId_() + C0201.m82(19650) + getName_() + C0201.m82(19651) + getPackage_() + C0201.m82(19652) + getVersion_() + C0201.m82(19653) + getDiffSize_() + C0201.m82(19654) + getDiffDownUrl_() + C0201.m82(19655) + getDiffSha2_() + C0201.m82(19656) + getSameS_() + C0201.m82(19657) + getLongSize_() + C0201.m82(19658) + getReleaseDate_() + C0201.m82(19659) + getIcon_() + C0201.m82(19660) + getOldVersionCode_() + C0201.m82(19661) + getVersionCode_() + C0201.m82(19662) + getDownurl_() + C0201.m82(19663) + getNewFeatures_() + C0201.m82(19664) + getReleaseDateDesc_() + C0201.m82(19665) + getState_() + C0201.m82(19666) + getDetailId_() + C0201.m82(19667) + getFullDownUrl_() + C0201.m82(19668) + getIsCompulsoryUpdate_() + C0201.m82(19669) + getNotRcmReason_() + C0201.m82(19670) + getDevType_() + C0201.m82(19671);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id_);
        parcel.writeString(this.name_);
        parcel.writeString(this.package_);
        parcel.writeString(this.oldVersionName_);
        parcel.writeString(this.version_);
        parcel.writeInt(this.diffSize_);
        parcel.writeString(this.diffDownUrl);
        parcel.writeString(this.diffSha2_);
        parcel.writeInt(this.sameS_);
        parcel.writeLong(this.size_);
        parcel.writeLong(this.obbSize_);
        parcel.writeString(this.releaseDate_);
        parcel.writeString(this.icon_);
        parcel.writeInt(this.oldVersionCode_);
        parcel.writeInt(this.versionCode_);
        parcel.writeString(this.downurl_);
        parcel.writeString(this.sha256_);
        parcel.writeString(this.newFeatures_);
        parcel.writeString(this.releaseDateDesc_);
        parcel.writeInt(this.state_);
        parcel.writeString(this.detailId_);
        parcel.writeInt(this.isAutoUpdate_);
        parcel.writeInt(this.isCompulsoryUpdate_);
        parcel.writeString(this.notRcmReason_);
        parcel.writeInt(this.devType_);
        parcel.writeString(this.fullDownUrl_);
        parcel.writeInt(this.maple_);
        parcel.writeInt(this.packingType_);
        parcel.writeLong(this.bundleSize_);
    }
}
