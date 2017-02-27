/**
 * @Project Name:effectiveJavaSample
 * @File Name:HideouslySlowProgram.java
 * @Package Name:com.sample.chapter07.item49
 * @Date:2017年2月26日下午9:54:19
 *
*/

package com.sample.chapter08.item49;
/**
 * @ClassName:HideouslySlowProgram
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月26日 下午9:54:19
 */
// Hideously slow program! can you spot the object creation
public class HideouslySlowProgram {
	public static void main(String[] args) {
		Long sum = 0L;
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

