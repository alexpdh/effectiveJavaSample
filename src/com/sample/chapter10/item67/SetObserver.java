/**
 * @Project Name:effectiveJavaSample
 * @File Name:SetObserver.java
 * @Package Name:com.sample.chapter10.item67
 * @Date:2017年3月6日下午9:48:42
 *
*/

package com.sample.chapter10.item67;
/**
 * @ClassName:SetObserver
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年3月6日 下午9:48:42
 */
public interface SetObserver<E> {
	// Invoked when an element is added to the observable set
	void added(ObservableSet<E> set, E element);
}

