package com.huawei.hms.support.api.entity.hwid;

public class QueryShippingAddressResp extends IHwIDRespEntity {
    @Checked(permission = "com.huawei.android.hms.account.getShippingAddress", scope = "https://www.huawei.com/auth/account/shipping.address", value = "SHIPPING_ADDRESS")
    private ShippingAddressParcelable shippingAddressParcelable;

    public ShippingAddressParcelable getShippingAddressParcelable() {
        return this.shippingAddressParcelable;
    }
}
