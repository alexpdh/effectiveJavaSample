/**
 * @Project Name:effectiveJavaSample
 * @File Name:Initialization.java
 * @Package Name:com.sample.chapter10
 * @Date:2017年3月12日下午10:25:17
 *
*/

package com.sample.chapter10.item71;
/**
 * @ClassName:Initialization
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年3月12日 下午10:25:17
 */
public class Initialization {
	// Nomal initialization of an instance field
	private final FieldType field1 = computeFieldValue();
	
	// lazy initialization of instance field - synchronized accessor
	private FieldType field2;
	synchronized FieldType getField() {
		if (field2 == null) {
			field2 = computeFieldValue();
		}
		return field2;
	}
	
	// lazy initialization holder class idiom for static fields
	private static class FieldHolder {
		static final FieldType field3 = computeFieldValue();
	}
	static FieldType getField3() {
		return FieldHolder.field3;
	}
	
	// Double-check idiom for lazy initialization of instance fields
	private volatile FieldType field4;
	FieldType getField4() {
		FieldType result = field4;
		if (result == null) {	// First check (no locking)
			synchronized(this) {
				result = field4;
				if (result == null) {	// Second check (with locking)
					field4 = result = computeFieldValue();
				}
			}
		}
		return result;
	}
	
	// Single-check idiom - can cause repeated initializtion!
	private volatile FieldType field5;
	private FieldType getField5() {
		FieldType result = field5;
		if (result == null) {
			field5 = result = computeFieldValue();
		}
		return result;
	}
	
	private static FieldType computeFieldValue() {
		return new FieldType();
	}
}

class FieldType {}
