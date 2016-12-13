/**
 * @Project Name:effectiveJavaSample
 * @File Name:Time.java
 * @Package Name:com.sample.chapter03.item14
 * @Date:2016年12月13日下午11:36:02
 *
*/

package com.sample.chapter03.item14;
/**
 * @ClassName:Time
 * @Function: TODO ADD FUNCTION.
 * @Date:     2016年12月13日 下午11:36:02
 *
 * @author   Administrator
 * @version
 */
//Public class with exposed immutable fields - questionable
public final class Time {
	private static final int HOURS_PER_DAY = 24;
	private static final int MINUTES_PER_HOUR = 60;
	
	private final int hour;
	private final int minute;
	
	public Time(int hour, int minute) {
		if(hour < 0 || hour > HOURS_PER_DAY) {
			throw new IllegalArgumentException("Hour:"+ hour);
		}
		if (minute < 0 || minute >= MINUTES_PER_HOUR)
			throw new IllegalArgumentException("Min: " + minute);
		this.hour = hour;
		this.minute = minute;
	}
}

