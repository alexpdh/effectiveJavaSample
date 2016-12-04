/**
 * Project Name:effectiveJavaSample
 * File Name:UtilityClass.java
 * Package Name:com.sample.chapter02.item04
 * Date:2016年12月4日下午8:11:45
 *
*/

package com.sample.chapter02.item04;
/**
 * ClassName:UtilityClass
 * Function: TODO Noninstantiable utility class
 * Date:     2016年12月4日 下午8:11:45
 * @author   Administrator
 * @version
 */
public class UtilityClass {
	// Suppress default constructor for noninstantiability
	// 防止默认构造器实现非实例化
	private UtilityClass(){
		throw new AssertionError();
	}
	 //Remainder omitted
}

