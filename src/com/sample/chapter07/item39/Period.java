/**
 * @Project Name:effectiveJavaSample
 * @File Name:Period.java
 * @Package Name:com.sample.chapter07.item39
 * @Date:2017年2月15日下午10:22:19
 *
*/

package com.sample.chapter07.item39;

import java.util.Date;

/**
 * @ClassName:Period
 * @Function: Broken "immutable" time period class 
 * @version
 *
 * @author pengdh
 * @date: 2017年2月15日 下午10:22:19
 */
public final class Period {
	private final Date start;
	private final Date end;
	
	/**
	 * @param start the beginning of the period
	 * @param end the end of the period; must not precede start
	 * @throws IllegalArgumentException if start is after end
	 * @throws NullPointerException if start or end is null
	 */
//	public Period(Date start, Date end) {
//		if(start.compareTo(end) > 0) {
//			throw new IllegalArgumentException(start + " after " + end);
//		}
//		this.start = start;
//		this.end = end;
//	}
	
	public Period(Date start, Date end) {
		this.start = start;
		this.end = end;
		
		if(this.start.compareTo(this.end) > 0) {
			throw new IllegalArgumentException(start + " after " + end);
		}
	}
	
	public Date start() {
		return start;
	}
	
	public Date end() {
		return end;
	}
	
	// Repaired accessors - make defensive copies of internal fields
	// Stops second attack
//	public Date start() {
//		return new Date(start.getTime());
//	}
//	
//	public Date end() {
//		return new Date(end.getTime());
//	}

	@Override
	public String toString() {
		return start + " - " + end;
	}
	
}

