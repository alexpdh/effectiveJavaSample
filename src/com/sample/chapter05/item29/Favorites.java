/**
 * @Project Name:effectiveJavaSample
 * @File Name:Favorites.java
 * @Package Name:com.sample.chapter05.item29
 * @Date:2017年1月16日下午11:35:47
 *
*/

package com.sample.chapter05.item29;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName:Favorites
 * @Function:  Typesafe heterogeneous container pattern - implementation
 * 类型安全的异构容器模式的实现
 * @version
 *
 * @author pengdh
 * @date: 2017年1月16日 下午11:35:47
 */
public class Favorites {
	private Map<Class<?>, Object> favorites = new HashMap<Class<?>, Object>();
	
	public <T> void putFavorite(Class<T> type, T instance) {
		if(type == null)
			throw new NullPointerException("Type is null");
		favorites.put(type, instance);
	}
	
	public <T> T getFavorite(Class<T> type) {
		return type.cast(favorites.get(type));
	}
	
	// Typesafe heterogeneous container pattern - client
	public static void main(String[] args) {
		Favorites f = new Favorites();
		f.putFavorite(String.class, "Java");
		f.putFavorite(Integer.class, 0xcafebabe);
		f.putFavorite(Class.class, Favorites.class);
		String favoriteString = f.getFavorite(String.class);
		int favoriteInteger = f.getFavorite(Integer.class);
		Class<?> favoriteClass = f.getFavorite(Class.class);
		System.out.printf("%s %x %s%n", favoriteString, favoriteInteger, favoriteClass.getName());
	}
}

