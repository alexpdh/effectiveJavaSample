/**
 * @Project Name:effectiveJavaSample
 * @File Name:AbstractMapEntry.java
 * @Package Name:com.sample.chapter03.item18
 * @Date:2016年12月28日上午12:10:21
 *
*/

package com.sample.chapter04.item18;

import java.util.Map;

/**
 * @ClassName:AbstractMapEntry
 * @Function:  骨架的实现
 * @version
 *
 * @author pengdh
 * @date: 2016年12月28日 上午12:10:21
 */
//Skeletal Implementation
public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {
	//Primitive operations
	public abstract K getKey();
	public abstract V getValue();
	
	//Entries in modifiable maps must override this method
	//在修改的映射条目必须重写这个方法
	public V setValue(V value) {
		throw new UnsupportedOperationException();
	}
	
	//Implements the general contract of Map.Entry.equals
	//实现了map.entry.equals一般合同
	@Override
	public boolean equals(Object o) {
		if(o == this)
			return true;
		if(!(o instanceof Map.Entry))
			return false;
		Map.Entry<?, ?> arg = (Map.Entry<?, ?>) o;
		return equals(getKey(), arg.getKey()) && equals(getValue(), arg.getValue());
	}
	private static boolean equals(Object o1, Object o2) {
		return o1 == null ? o2 == null : o1.equals(o2);
	}
	//Implements the general contract of Map.Entry.hashCode
	//实现了map.entry.hashCode一般合同
	@Override
	public int hashCode() {
		return hashCode(getKey()) ^ hashCode(getValue());
	}
	private static int hashCode(Object obj) {
		return obj == null ? 0 : obj.hashCode();
	}
}

