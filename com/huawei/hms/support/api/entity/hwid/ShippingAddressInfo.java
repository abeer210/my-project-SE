package com.huawei.hms.support.api.entity.hwid;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

public class ShippingAddressInfo implements Parcelable, IMessageEntity {
    public static final Parcelable.Creator<ShippingAddressInfo> CREATOR = new Parcelable.Creator<ShippingAddressInfo>() {
        /* class com.huawei.hms.support.api.entity.hwid.ShippingAddressInfo.AnonymousClass1 */

        /* renamed from: a */
        public ShippingAddressInfo createFromParcel(Parcel parcel) {
            return new ShippingAddressInfo(parcel);
        }

        /* renamed from: a */
        public ShippingAddressInfo[] newArray(int i) {
            return new ShippingAddressInfo[i];
        }
    };
    private static final String TAG = null;
    private Integer addressId = -1;
    private Integer addressType = 1;
    private String city;
    private String countryName;
    private Integer defaultAddress = 0;
    private String detailAddress;
    private String district;
    private String firstName;
    private String lastName;
    private String lastUpdateTime;
    private String phoneNumber;
    private String postalCode;
    private String province;
    private LabelInfo selectedLabelInfo;
    private String street;
    private Long userId = 0L;

    static {
        C0201.m83(ShippingAddressInfo.class, 620);
    }

    public ShippingAddressInfo() {
        String r0 = C0201.m82(36330);
        this.province = r0;
        this.city = r0;
        this.district = r0;
        this.street = r0;
        this.detailAddress = r0;
        this.selectedLabelInfo = new LabelInfo();
    }

    public int describeContents() {
        return 0;
    }

    public Integer getAddressId() {
        return this.addressId;
    }

    public Integer getAddressType() {
        return this.addressType;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public Integer getDefaultAddress() {
        return this.defaultAddress;
    }

    public String getDetailAddress() {
        return this.detailAddress;
    }

    public String getDistrict() {
        return this.district;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getProvince() {
        return this.province;
    }

    public LabelInfo getSelectedLabelInfo() {
        return this.selectedLabelInfo;
    }

    public String getStreet() {
        return this.street;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void parseJson(JSONObject jSONObject) {
        String r0 = C0201.m82(36332);
        String r1 = C0201.m82(36333);
        String r2 = C0201.m82(36334);
        String r3 = C0201.m82(36335);
        String r4 = C0201.m82(36336);
        String r5 = C0201.m82(36337);
        String r6 = C0201.m82(36338);
        String r7 = C0201.m82(36339);
        String r8 = C0201.m82(36340);
        String r9 = C0201.m82(36341);
        try {
            this.userId = Long.valueOf(jSONObject.getLong(C0201.m82(36342)));
            if (jSONObject.has(r9)) {
                this.addressId = Integer.valueOf(jSONObject.getInt(r9));
            }
            this.addressType = Integer.valueOf(jSONObject.getInt(C0201.m82(36343)));
            this.defaultAddress = Integer.valueOf(jSONObject.getInt(C0201.m82(36344)));
            this.firstName = jSONObject.getString(C0201.m82(36345));
            if (jSONObject.has(r8)) {
                this.lastName = jSONObject.getString(r8);
            }
            if (jSONObject.has(r7)) {
                this.phoneNumber = jSONObject.getString(r7);
            }
            this.countryName = jSONObject.getString(C0201.m82(36346));
            this.province = jSONObject.getString(C0201.m82(36347));
            this.city = jSONObject.getString(C0201.m82(36348));
            if (jSONObject.has(r6)) {
                this.district = jSONObject.getString(r6);
            }
            if (jSONObject.has(r5)) {
                this.street = jSONObject.getString(r5);
            }
            if (jSONObject.has(r4)) {
                this.detailAddress = jSONObject.getString(r4);
            }
            if (jSONObject.has(r3)) {
                this.postalCode = jSONObject.getString(r3);
            }
            if (jSONObject.has(r2)) {
                if (this.selectedLabelInfo == null) {
                    this.selectedLabelInfo = new LabelInfo();
                }
                this.selectedLabelInfo.setLabelName(jSONObject.getString(r2));
            }
            if (jSONObject.has(r1)) {
                if (this.selectedLabelInfo == null) {
                    this.selectedLabelInfo = new LabelInfo();
                }
                this.selectedLabelInfo.setLabelType(jSONObject.getInt(r1));
            }
            if (jSONObject.has(r0)) {
                this.lastUpdateTime = jSONObject.getString(r0);
            }
        } catch (JSONException unused) {
            HMSLog.e(C0201.m82(36349), C0201.m82(36350));
        }
    }

    public void setAddressId(Integer num) {
        this.addressId = num;
    }

    public void setAddressType(Integer num) {
        this.addressType = num;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountryName(String str) {
        this.countryName = str;
    }

    public void setDefaultAddress(Integer num) {
        this.defaultAddress = num;
    }

    public void setDetailAddress(String str) {
        this.detailAddress = str;
    }

    public void setDistrict(String str) {
        this.district = str;
    }

    public void setFirstName(String str) {
        this.firstName = str;
    }

    public void setLastName(String str) {
        this.lastName = str;
    }

    public void setLastUpdateTime(String str) {
        this.lastUpdateTime = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    public void setPostalCode(String str) {
        this.postalCode = str;
    }

    public void setProvince(String str) {
        this.province = str;
    }

    public void setSelectedLabelInfo(LabelInfo labelInfo) {
        this.selectedLabelInfo = labelInfo;
    }

    public void setStreet(String str) {
        this.street = str;
    }

    public void setUserId(Long l) {
        this.userId = l;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0201.m82(36351), this.userId);
            jSONObject.put(C0201.m82(36352), this.addressId);
            jSONObject.put(C0201.m82(36353), this.addressType);
            jSONObject.put(C0201.m82(36354), this.defaultAddress);
            jSONObject.put(C0201.m82(36355), this.firstName);
            jSONObject.put(C0201.m82(36356), this.lastName);
            jSONObject.put(C0201.m82(36357), this.phoneNumber);
            jSONObject.put(C0201.m82(36358), this.countryName);
            jSONObject.put(C0201.m82(36359), this.province);
            jSONObject.put(C0201.m82(36360), this.city);
            jSONObject.put(C0201.m82(36361), this.district);
            jSONObject.put(C0201.m82(36362), this.street);
            jSONObject.put(C0201.m82(36363), this.detailAddress);
            jSONObject.put(C0201.m82(36364), this.postalCode);
            if (!(this.selectedLabelInfo == null || -1 == this.selectedLabelInfo.getLabelType() || TextUtils.isEmpty(this.selectedLabelInfo.getLabelName()))) {
                jSONObject.put(C0201.m82(36365), this.selectedLabelInfo.getLabelName());
                jSONObject.put(C0201.m82(36366), this.selectedLabelInfo.getLabelType());
            }
            jSONObject.put(C0201.m82(36367), this.lastUpdateTime);
        } catch (JSONException unused) {
            HMSLog.e(C0201.m82(36368), C0201.m82(36369));
        }
        return jSONObject;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.userId.longValue());
        parcel.writeInt(this.addressId.intValue());
        parcel.writeInt(this.addressType.intValue());
        parcel.writeInt(this.defaultAddress.intValue());
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.phoneNumber);
        parcel.writeString(this.countryName);
        parcel.writeString(this.province);
        parcel.writeString(this.city);
        parcel.writeString(this.district);
        parcel.writeString(this.street);
        parcel.writeString(this.detailAddress);
        parcel.writeString(this.postalCode);
        parcel.writeString(this.lastUpdateTime);
        parcel.writeParcelable(this.selectedLabelInfo, i);
    }

    public ShippingAddressInfo(Parcel parcel) {
        String r0 = C0201.m82(36331);
        this.province = r0;
        this.city = r0;
        this.district = r0;
        this.street = r0;
        this.detailAddress = r0;
        this.selectedLabelInfo = new LabelInfo();
        this.userId = Long.valueOf(parcel.readLong());
        this.addressId = Integer.valueOf(parcel.readInt());
        this.addressType = Integer.valueOf(parcel.readInt());
        this.defaultAddress = Integer.valueOf(parcel.readInt());
        this.firstName = parcel.readString();
        this.lastName = parcel.readString();
        this.phoneNumber = parcel.readString();
        this.countryName = parcel.readString();
        this.province = parcel.readString();
        this.city = parcel.readString();
        this.district = parcel.readString();
        this.street = parcel.readString();
        this.detailAddress = parcel.readString();
        this.postalCode = parcel.readString();
        this.lastUpdateTime = parcel.readString();
        this.selectedLabelInfo = (LabelInfo) parcel.readParcelable(LabelInfo.class.getClassLoader());
    }
}
