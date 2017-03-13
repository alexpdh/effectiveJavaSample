/**
 * @Project Name:effectiveJavaSample
 * @File Name:SlowCountDownLatch.java
 * @Package Name:com.sample.chapter10.item72
 * @Date:2017年3月13日下午8:41:41
 *
*/

package com.sample.chapter10.item72;
/**
 * @ClassName:SlowCountDownLatch
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年3月13日 下午8:41:41
 */
// Awful CountDownLatch implementation - busy-watis incessantly!
public class SlowCountDownLatch {
	private int count;
	public SlowCountDownLatch(int count) {
		if (count < 0) {
			throw new IllegalArgumentException(count + " < 0");
		}
		this.count = count;
	}
	
	public void await() {
		while (true) {
			synchronized(this) {
				if (count == 0) {
					return;
				}
			}
		}
	}
	
	public synchronized void countDown() {
		if (count != 0) {
			count --;
		}
	}
}

