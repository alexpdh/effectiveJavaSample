/**
 * @Project Name:effectiveJavaSample
 * @File Name:BasicOperation.java
 * @Package Name:com.sample.chapter06.item34
 * @Date:2017年2月6日下午10:44:59
 *
*/

package com.sample.chapter06.item34;
/**
 * @ClassName:BasicOperation
 * @Function: Emulated extensible enum using an interface 
 * @version
 *
 * @author pengdh
 * @date: 2017年2月6日 下午10:44:59
 */
public enum BasicOperation implements Operation {
	PLUS("+") {
		public double apply(double x, double y) {
			return x + y;
		}
	},
	MINUS("-") {
		public double apply(double x, double y) {
			return x - y;
		}
	},
	TIMES("*") {
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE("/") {
		public double apply(double x, double y) {
			return x / y;
		}
	};
	private final String symbol;

	BasicOperation(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return symbol;
	}
}

