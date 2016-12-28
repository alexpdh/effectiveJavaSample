/**
 * @Project Name:effectiveJavaSample
 * @File Name:Comparator.java
 * @Package Name:com.sample.chapter04.item21
 * @Date:2016年12月28日下午10:48:05
 *
*/

package com.sample.chapter04.item21;
/**
 * @ClassName:Comparator
 * @Function: strategy interface
 * 策略接口
 * @version
 *
 * @author pengdh
 * @date: 2016年12月28日 下午10:48:05
 */
public interface Comparator<T> {
	public int compare(T t1, T t2);
}

