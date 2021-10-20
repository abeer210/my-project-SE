package com.huawei.hms.support.api.entity.hwid;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Checked {
    String permission() default "";

    String scope() default "";

    String value();
}
