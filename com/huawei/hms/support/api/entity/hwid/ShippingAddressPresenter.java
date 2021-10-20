package com.huawei.hms.support.api.entity.hwid;

import vigqyno.C0201;

public class ShippingAddressPresenter {

    public interface LabelType {
        public static final int TYPE_DEFAULT = 0;
        public static final int TYPE_NONE = 0;
        public static final int TYPE_SELF = 0;

        static {
            C0201.m83(LabelType.class, 599);
        }
    }
}
