/**
 * Project Name:effectiveJavaSample
 * File Name:Person.java
 * Package Name:com.sample.chapter02.item05.slowVersion
 * Date:2016年12月4日下午8:35:51
 *
*/

package com.sample.chapter02.item05.slowVersion;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * ClassName:Person
 * Function: TODO ADD isBabyBoomer方法调用时都会新建一个Calendar，一个TimeZone和两个Date实例
 * 没必要这样，效率很低.
 * Date:     2016年12月4日 下午8:35:51
 * @author   Administrator
 * @version
 */
public class Person {
	private final Date birthDate;
	
	// Defensive copy - see Item 39
	public Person(Date birthDate){
		this.birthDate = new Date(birthDate.getTime());
	}
	// other fields,method,and constructor omitted
	// DON'T DO THIS
	public boolean isBabyBoomer(){
		Calendar gtmCal = Calendar.getInstance(TimeZone.getTimeZone("GTM"));
		gtmCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomStart = gtmCal.getTime();
		gtmCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = gtmCal.getTime();
		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
		
	}
}

