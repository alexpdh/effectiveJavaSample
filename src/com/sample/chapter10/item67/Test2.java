/**
 * @Project Name:effectiveJavaSample
 * @File Name:Test2.java
 * @Package Name:com.sample.chapter10.item67
 * @Date:2017年3月6日下午10:13:36
 *
*/

package com.sample.chapter10.item67;

import java.util.HashSet;

/**
 * @ClassName:Test2
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年3月6日 下午10:13:36
 */
public class Test2 {
	public static void main(String[] args) {
		ObservableSet<Integer> set = new ObservableSet<Integer>(new HashSet<Integer>());
		
		set.addObserver(new SetObserver<Integer>() {
			
			@Override
			public void added(ObservableSet<Integer> set, Integer element) {
				System.out.println(element);
				if (element == 23) {
					set.removeObserver(this);
				}
			}
		});
		for (int i = 0; i < 100; i++)
			set.add(i);
	}
}

