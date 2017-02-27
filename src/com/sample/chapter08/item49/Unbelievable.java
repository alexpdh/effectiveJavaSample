/**
 * @Project Name:effectiveJavaSample
 * @File Name:Unbelievable.java
 * @Package Name:com.sample.chapter07.item49
 * @Date:2017年2月26日下午9:41:46
 *
*/

package com.sample.chapter08.item49;
/**
 * @ClassName:Unbelievable
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月26日 下午9:41:46
 */
public class Unbelievable {
	static Integer i;	// i 初始引用为null
	public static void main(String[] args) {
		if (i == 42) {	// i 自动撤箱报 NullPointerException
			System.out.println("Unbelievable");
		}
	}
}

