package defpackage;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: a32  reason: default package */
/* compiled from: JsonAdapter */
public @interface a32 {
    boolean nullSafe() default true;

    Class<?> value();
}
