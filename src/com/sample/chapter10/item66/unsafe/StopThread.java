/**
 * @Project Name:effectiveJavaSample
 * @File Name:StopThread.java
 * @Package Name:com.sample.chapter09.item66.unsafe
 * @Date:2017年3月2日下午10:26:47
 *
*/

package com.sample.chapter10.item66.unsafe;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName:StopThread
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年3月2日 下午10:26:47
 */
// Broken! - How long would you except this program to run?
public class StopThread {
	private static boolean stopRequested;
	public static void main(String[] args) throws InterruptedException {
		Thread backgroundThread = new Thread(new Runnable() {
			@Override
			public void run() {
				@SuppressWarnings("unused")
				int i = 0;
				while (!stopRequested) {
					i++;
				}
			}
			
		});
		backgroundThread.start();
		TimeUnit.SECONDS.sleep(1);
		stopRequested = true;
	}
}

