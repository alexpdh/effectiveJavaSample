/**
 * Project Name:effectiveJavaSample
 * File Name:Person.java
 * Package Name:com.sample.chapter02.item05.fastVersion
 * Date:2016年12月4日下午8:49:15
 *
*/

package com.sample.chapter02.item05.fastVersion;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * ClassName:Person Function: TODO ADD Doesn't creates unnecessary duplicate
 * objects. 不会创建不必要的重复对象 Date: 2016年12月4日 下午8:49:15
 * 
 * @author Administrator
 * @version
 */
public class Person {
	private final Date birthDate;

	// Defensive copy - see Item 39
	public Person(Date birthDate) {
		this.birthDate = new Date(birthDate.getTime());
	}

	// Other fields, methods

	/**
	 * The starting and ending dates of the baby boom.
	 */
	private static final Date BOOM_START;
	private static final Date BOOM_END;
	
	static {
		Calendar gtmCal = Calendar.getInstance(TimeZone.getTimeZone("GTM"));
		gtmCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_START = gtmCal.getTime();
		gtmCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_END = gtmCal.getTime();
	}

	public boolean isBabyBoomer() {
		return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;

	}
}
