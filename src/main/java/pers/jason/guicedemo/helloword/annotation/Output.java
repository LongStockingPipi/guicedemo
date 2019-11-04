package pers.jason.guicedemo.helloword.annotation;

import com.google.inject.BindingAnnotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author 姜治昊
 * @description 用来标记实例绑定
 */
@BindingAnnotation
@Retention(RetentionPolicy.RUNTIME)
public @interface Output {
}
