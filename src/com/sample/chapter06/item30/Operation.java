/**
 * @Project Name:effectiveJavaSample
 * @File Name:Operation.java
 * @Package Name:com.sample.chapter06.item30
 * @Date:2017年1月19日下午11:22:12
 *
*/

package com.sample.chapter06.item30;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:Operation
 * @Function:  Enum type with constant-specific class bodies and data
 * @version
 *
 * @author pengdh
 * @date: 2017年1月19日 下午11:22:12
 */
public enum Operation {
	PLUS("+") {
		double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		double apply(double x, double y) {
			return x / y;
		}
	};
	
	private final String symbol;
	
	Operation(String symbol) {
		this.symbol = symbol;
	}
	
	@Override
	public String toString() {
		return symbol;
	}
	
	// Implementing a fromString method on an enum type
	private static final Map<String, Operation> stringToEnum = new HashMap<String, Operation>();
	static {
		// Initialize map from constant name to enum constant
		for(Operation op : Operation.values()){
			stringToEnum.put(op.toString(), op);
		}
	}
	// Returns Operation for string, or null if string is invalid
	public static Operation fromString(String symbol) {
		return stringToEnum.get(symbol);
	}
	
	abstract double apply(double x, double y);
	
	public static void main(String[] args) {
		double x = Double.parseDouble("2");
		double y = Double.parseDouble("4");
		for(Operation op : Operation.values()){
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
		}
	}
}

