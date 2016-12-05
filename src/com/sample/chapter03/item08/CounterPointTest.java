/**
 * Project Name:effectiveJavaSample
 * File Name:CounterPointTest.java
 * Package Name:com.sample.chapter03.item08
 * Date:2016年12月6日上午12:42:48
 *
*/
// Test program that uses CounterPoint as Point
package com.sample.chapter03.item08;

import java.util.HashSet;
import java.util.Set;
/**
 * 覆盖equals方法需遵守约定 
 * 1 ：自反性 2：对称性 3：传递性 4：一致性 ClassName:Point Function: 传递性 
 * ClassName: CounterPointTest
 * Function: TODO ADD FUNCTION
 * date: 2016年12月6日 上午12:58:58
 *
 * @author Administrator
 * @version
 */
public class CounterPointTest {
	// Initialize UnitCircle to contain all Points on the unit circle
	private static final Set<Point> unitCircle;
	static {
		unitCircle = new HashSet<Point>();
		unitCircle.add(new Point(1, 0));
		unitCircle.add(new Point(0, 1));
		unitCircle.add(new Point(-1, 0));
		unitCircle.add(new Point(0, -1));
	}

	public static boolean onUnitCircle(Point p) {
		return unitCircle.contains(p);
	}

	public static void main(String[] args) {
		Point p1 = new Point(1, 0);
		Point p2 = new CounterPoint(1, 0);

		// Prints true
		System.out.println(onUnitCircle(p1));

		// Should print true, but doesn't if Point uses getClass-based equals
		System.out.println(onUnitCircle(p2));
	}
}
