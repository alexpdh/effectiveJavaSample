/**
 * @Project Name:effectiveJavaSample
 * @File Name:Period.java
 * @Package Name:com.sample.chapter11.item76
 * @Date:2017年3月15日下午9:45:04
 *
*/

package com.sample.chapter11.item76;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName:Period
 * @Function:  Immutable class that uses defensive copy 
 * @version
 *
 * @author pengdh
 * @date: 2017年3月15日 下午9:45:04
 */
public final class Period implements Serializable {

	/**
	 * serialVersionUID:
	 */
	private static final long serialVersionUID = 3031684903991126645L;
	private final Date start;
	private final Date end;
	
	/**
	 * @param start
	 *            the beginning of the period
	 * @param end
	 *            the end of the period; must not precede start
	 * @throws IllegalArgumentException
	 *             if start is after end
	 * @throws NullPointerException
	 *             if start or end is null
	 */
	public Period(Date start, Date end) {
		this.start = new Date(start.getTime());
		this.end = new Date(end.getTime());
		if (this.start.compareTo(this.end) > 0) {
			throw new IllegalArgumentException(start + " After " + end);
		}
		
	}
	public Date start () {
		return new Date(start.getTime());
	}
	public Date end () {
		return new Date(end.getTime());
	}
	public String toString() {
		return start + " - " + end;
	}
	// Remainder omitted
}

