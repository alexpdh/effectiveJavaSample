/**
 * @Project Name:effectiveJavaSample
 * @File Name:GenericStaticFactory.java
 * @Package Name:com.sample.chapter05.item27
 * @Date:2017年1月12日下午10:54:09
 *
*/

package com.sample.chapter05.item27;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName:GenericStaticFactory
 * @Function:  泛型静态工厂方法
 * @version
 *
 * @author pengdh
 * @date: 2017年1月12日 下午10:54:09
 */
public class GenericStaticFactory {
	//Generic static factory method
	public static <K, V> HashMap<K, V> newHashMap() {
		return new HashMap<K, V>();
	}
	
	public static void main(String[] args) {
		//Parameterized type instance creation with static factory
		Map<String, List<String>> anagrams = new HashMap();
	}
}

