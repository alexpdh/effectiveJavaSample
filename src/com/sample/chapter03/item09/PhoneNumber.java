/**
 * Project Name:effectiveJavaSample
 * File Name:PhoneNumber.java
 * Package Name:com.sample.chapter03.item09
 * Date:2016年12月8日下午11:00:58
 *
*/

package com.sample.chapter03.item09;

import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:PhoneNumber
 * Function: Shows the need for overriding hashcode when you override equals
 * 当覆盖equals的时候需要同时覆盖hashcode
 * Date:     2016年12月8日 下午11:00:58
 *
 * @author   Administrator
 * @version
 */
public class PhoneNumber {
	private final short areaCode;
	private final short prefix;
	private final short lineNumber;
	
	public PhoneNumber(int areaCode, int prefix, int lineNumber){
		rangeCheck(areaCode, 999, "area code");
		rangeCheck(prefix, 999, "prefix");
		rangeCheck(lineNumber, 9999,"line number");
		
		this.areaCode = (short) areaCode;
		this.prefix = (short) prefix;
		this.lineNumber = (short) lineNumber;
	}

	private static void rangeCheck(int arg, int max, String name) {
		if(arg < 0 || arg > max)
			throw new IllegalArgumentException(name +":"+ arg);
	}
	
	@Override
	public boolean equals(Object o){
		if(o == this){
			return true;
		}
		if(!(o instanceof PhoneNumber)){
			return false;
		}
		PhoneNumber pn = (PhoneNumber)o;
		return pn.lineNumber == lineNumber && pn.prefix == prefix && pn.areaCode == areaCode;
	}
	// Broken - no hashCode method!
	
	
	/*@Override
	public int hashCode(){
		return 42;
	}*/
	
	// A decent hashCode method
	@Override
	public int hashCode(){
		int result = 17;
		result = 31 * result + areaCode;
		result = 31 * result + prefix;
		result = 31 * result + lineNumber;
		return result;
	}
	
	// Lazily initialized, cached hashCode - Page 49
	// private volatile int hashCode; // (See Item 71)
	//
	// @Override 
	//public int hashCode() {
	// int result = hashCode;
	// if (result == 0) {
	// result = 17;
	// result = 31 * result + areaCode;
	// result = 31 * result + prefix;
	// result = 31 * result + lineNumber;
	// hashCode = result;
	// }
	// return result;
	// }
	
	public static void main(String[] args) {
		Map<PhoneNumber, String> m = new HashMap<PhoneNumber, String>();
		m.put(new PhoneNumber(707, 867 ,5039), "Jenny");
		String s = m.get(new PhoneNumber(707, 867, 5039));
		System.out.println(s);
	}

}

