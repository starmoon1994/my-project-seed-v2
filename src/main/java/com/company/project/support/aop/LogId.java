package com.company.project.support.aop;


import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * 自定义日志注解
 */
@Target(METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LogId {
    String value() default "";
}
