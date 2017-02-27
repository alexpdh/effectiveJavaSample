/**
 * @Project Name:effectiveJavaSample
 * @File Name:StringConcatenation.java
 * @Package Name:com.sample.chapter07.item51
 * @Date:2017年2月26日下午10:39:42
 *
*/

package com.sample.chapter08.item51;
/**
 * @ClassName:StringConcatenation
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月26日 下午10:39:42
 */
public class StringConcatenation {
	// Inappropriate use of string concatenation - Performs horribly!
//	public static String statement() {
//		String result = "";
//		for (int i = 0; i < numItems(); i++) {
//			result += lineForItem(i);	// String concatenation
//		}
//		return result;
//	}
	
	public static String statement() {
		StringBuilder b = new StringBuilder(numItems() * 80);
		for (int i = 0; i < numItems(); i++) {
			b.append(lineForItem(i));
		}
		return b.toString();
	}

	private static String lineForItem(int i) {
		return "abcidunfljsfsifhfisls";
	}

	private static int numItems() {
		return 100;
	}
	
	public static void main(String[] args) {
		long begin = System.currentTimeMillis();
		String s =  statement();
		System.out.println(System.currentTimeMillis() - begin);
		System.out.println(s);
	}
}

