/**
 * @Project Name:effectiveJavaSample
 * @File Name:RandomBug.java
 * @Package Name:com.sample.chapter07.item47
 * @Date:2017年2月23日下午11:01:15
 *
*/

package com.sample.chapter07.item47;

import java.util.Random;

/**
 * @ClassName:RandomBug
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年2月23日 下午11:01:15
 */
public class RandomBug {
	private static final Random rnd = new Random();
	
	// Common but deeply flawed!
	static int random(int n) {
		return Math.abs(rnd.nextInt()) % n;
	}
	
	public static void main(String[] args) {
		int n = 2 * (Integer.MAX_VALUE / 3);
		int low = 0;
		for (int i = 0; i < 1000000; i++) {
			if (random(n) < n/2) {
				low++;
			}
			System.out.println(low);
		}
	}
}

