/**
 * @Project Name:effectiveJavaSample
 * @File Name:ExtendedOperation.java
 * @Package Name:com.sample.chapter06.item34
 * @Date:2017年2月6日下午10:47:35
 *
*/

package com.sample.chapter06.item34;

import java.util.Collection;

/**
 * @ClassName:ExtendedOperation
 * @Function: Emulated extension enum
 * @version
 *
 * @author pengdh
 * @date: 2017年2月6日 下午10:47:35
 */
public enum ExtendedOperation implements Operation {
	EXP("^") {
		public double apply(double x, double y) {
			return Math.pow(x, y);
		}
	},
	REMAINDER("%") {
		public double apply(double x, double y) {
			return x % y;
		}
	};

	private final String symbol;

	ExtendedOperation(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}

	public static void main(String[] args) {
		double x = Double.parseDouble("20");
		double y = Double.parseDouble("3");
		test(ExtendedOperation.class, x, y);
	}

	// test parameter is a bounded type token (Item 29)
	private static <T extends Enum<T> & Operation> void test(Class<T> opSet, double x, double y) {
		for (Operation op : opSet.getEnumConstants())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
	}

	// test parameter is a bounded wildcard type (Item 28)
	@SuppressWarnings("unused")
	private static void test2(Collection<? extends Operation> opSet, double x, double y) {
		for (Operation op : opSet)
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
	}
}
