/**
 * @Project Name:effectiveJavaSample
 * @File Name:Period.java
 * @Package Name:com.sample.chapter11.item78
 * @Date:2017年3月15日下午10:29:12
 *
*/

package com.sample.chapter11.item78;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName:Period
 * @Function: Period class with serialization proxy 
 * @version
 *
 * @author pengdh
 * @date: 2017年3月15日 下午10:29:12
 */
public final class Period implements Serializable {
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
		if (this.start.compareTo(this.end) > 0)
			throw new IllegalArgumentException(start + " after " + end);
	}

	public Date start() {
		return new Date(start.getTime());
	}

	public Date end() {
		return new Date(end.getTime());
	}

	public String toString() {
		return start + " - " + end;
	}

	// Serialization proxy for Period class - page 312
	private static class SerializationProxy implements Serializable {
		
		private final Date start;
		private final Date end;

		SerializationProxy(Period p) {
			this.start = p.start;
			this.end = p.end;
		}
		/**
		 * serialVersionUID:
		 */
		private static final long serialVersionUID = -4319274047661517045L; // Any
																			// number
																			// will
																			// do
																			// (Item
																			// 75)

		// readResolve method for Period.SerializationProxy - Page 313
		private Object readResolve() {
			return new Period(start, end); // Uses public constructor
		}
	}

	// writeReplace method for the serialization proxy pattern - page 312
	private Object writeReplace() {
		return new SerializationProxy(this);
	}

	// readObject method for the serialization proxy pattern - Page 313
	private void readObject(ObjectInputStream stream)
			throws InvalidObjectException {
		throw new InvalidObjectException("Proxy required");
	}
}

