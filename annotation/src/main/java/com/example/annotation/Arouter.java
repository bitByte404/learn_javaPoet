package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // 类上
@Retention(RetentionPolicy.CLASS) // 编译期
public @interface Arouter {

    String path();

    String group() default "";
}
