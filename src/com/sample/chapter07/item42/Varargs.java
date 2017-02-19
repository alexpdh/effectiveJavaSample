/**
 * @Project Name:effectiveJavaSample
 * @File Name:Varargs.java
 * @Package Name:com.sample.chapter07.item42
 * @Date:2017年2月20日上午12:25:35
 *
*/

package com.sample.chapter07.item42;
/**
 * @ClassName:Varargs
 * @Function: simple use of varargs
 * @version
 *
 * @author pengdh
 * @date: 2017年2月20日 上午12:25:35
 */
public class Varargs {
	static int sum(int... args) {
		int sum = 0;
		for(int arg : args) {
			sum += arg;
		}
		return sum;
	}
	
// The WRONG way to use varargs to pass one or more arguments!
//	static int min(int... args) {
//		if(args.length == 0) {
//			throw new IllegalArgumentException("Too few arguments");
//		}
//		int min = args[0];
//		for(int i = 1; i <args.length; i++) {
//			if(args[i] < min) {
//				min = args[i];
//			}
//		}
//		return min;
//	}
	
// The right way to use varargs to pass one or more arguments
	static int min(int firstArg, int... remainingArgs) {
		int min = firstArg;
		for(int arg : remainingArgs) {
			if(arg < min) {
				min = arg;
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		System.out.println(min(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
	}
}

