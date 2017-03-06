/**
 * @Project Name:effectiveJavaSample
 * @File Name:Test1.java
 * @Package Name:com.sample.chapter10.item67
 * @Date:2017年3月6日下午10:12:13
 *
*/

package com.sample.chapter10.item67;

import java.util.HashSet;

/**
 * @ClassName:Test1
 * @Function:
 * @version
 *
 * @author pengdh
 * @date: 2017年3月6日 下午10:12:13
 */
public class Test1 {
	public static void main(String[] args) {
		ObservableSet<Integer> set = new ObservableSet<Integer>(new HashSet<Integer>());

		set.addObserver(new SetObserver<Integer>() {

			@Override
			public void added(ObservableSet<Integer> set, Integer element) {
				System.out.println(element);
			}
		});
		for (int i = 0; i < 100; i++) {
			set.add(i);
		}
	}
}
