/**
 * @Project Name:effectiveJavaSample
 * @File Name:StringLengthComparator.java
 * @Package Name:com.sample.chapter04.item21
 * @Date:2016年12月28日下午10:44:50
 *
*/

package com.sample.chapter04.item21;

/**
 * @ClassName:StringLengthComparator
 * @Function:  单例
 * @version
 *
 * @author pengdh
 * @date: 2016年12月28日 下午10:44:50
 */
class StringLengthComparator {
	private StringLengthComparator(){}
	public static final StringLengthComparator INSTANCE = new StringLengthComparator();
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

