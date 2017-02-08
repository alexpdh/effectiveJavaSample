/**
 * @Project Name:effectiveJavaSample
 * @File Name:Test.java
 * @Package Name:com.sample.chapter06.item35
 * @Date:2017年2月8日下午10:55:57
 *
*/

package com.sample.chapter06.item35;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @ClassName:Test
 * @Function: Marker annotaion type declaration 
 * @version
 *
 * @author pengdh
 * @date: 2017年2月8日 下午10:55:57
 * 
 * Indicates that the annotated method is a test method	表示注释的方法是一种测试方法
 * Use only on parameterless static methods.	只用于无参数的静态方法。
 */
@Retention(RetentionPolicy.RUNTIME)	//元注解，表示Test注解应该在运行时被保留
@Target(ElementType.METHOD)	//元注解，表示Test只在方法申明中才是合法的
public @interface Test {

}

