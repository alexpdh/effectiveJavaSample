/**
 * @Project Name:effectiveJavaSample
 * @File Name:StopThread.java
 * @Package Name:com.sample.chapter10.item66.fixed01
 * @Date:2017年3月2日下午10:40:40
 *
*/

package com.sample.chapter10.item66.fixed01;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName:StopThread
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年3月2日 下午10:40:40
 */
// Properly synchronized cooperative thread termination
public class StopThread {
	private static boolean stopRequested;
	private static synchronized void requestStop() {
		stopRequested = true;
	}
	private static synchronized boolean stopRequested() {
		return stopRequested;
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread backgroudThread = new Thread(new Runnable() {
			@Override
			public void run() {
				@SuppressWarnings("unused")
				int i = 0;
				while (!stopRequested()) {
					i++;
				}
			}
		});
		backgroudThread.start();
		TimeUnit.SECONDS.sleep(1);
		requestStop();
	}
}

