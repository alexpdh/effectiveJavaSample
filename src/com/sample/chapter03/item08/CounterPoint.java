/**
 * Project Name:effectiveJavaSample
 * File Name:CounterPoint.java
 * Package Name:com.sample.chapter03.item08
 * Date:2016年12月6日上午12:42:48
 *
*/

package com.sample.chapter03.item08;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 覆盖equals方法需遵守约定 
 * 1 ：自反性 2：对称性 3：传递性 4：一致性 ClassName:Point Function: 传递性 
 * ClassName:CounterPoint
 * Function: TODO ADD FUNCTION.
 * Date:     2016年12月6日 上午12:42:48
 *
 * @author   Administrator
 * @version
 */
//Trivial subclass of Point - doesn't add a value component
public class CounterPoint extends Point {
	private static final AtomicInteger counter = new AtomicInteger();

	public CounterPoint(int x, int y) {
		super(x, y);
		counter.incrementAndGet();
	}
	
	public int numberCreated() {
		return counter.get();
	}

}

