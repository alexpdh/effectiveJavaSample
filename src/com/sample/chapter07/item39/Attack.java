/**
 * @Project Name:effectiveJavaSample
 * @File Name:Attack.java
 * @Package Name:com.sample.chapter07.item39
 * @Date:2017年2月15日下午10:34:01
 *
*/

package com.sample.chapter07.item39;

import java.util.Date;

/**
 * @ClassName:Attack
 * @Function: Attack the internals of a Period instance
 * @version
 *
 * @author pengdh
 * @date: 2017年2月15日 下午10:34:01
 */
public class Attack {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// Attack the internals of a Period instance
		Date start = new Date();
		Date end = new Date();
		Period p = new Period(start, end);
		end.setYear(78); // Modifies internals of p!
		System.out.println(p);

		// Second attack on the internals of a Period instance
		start = new Date();
		end = new Date();
		p = new Period(start, end);
		p.end().setYear(78); // Modifies internals of p!
		System.out.println(p);
	}
}
