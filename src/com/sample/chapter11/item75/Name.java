/**
 * @Project Name:effectiveJavaSample
 * @File Name:Name.java
 * @Package Name:com.sample.chapter11.item75
 * @Date:2017年3月14日下午9:51:42
 *
*/

package com.sample.chapter11.item75;

import java.io.Serializable;

/**
 * @ClassName:Name
 * @Function: Good candidate for default serialized form 
 * @version
 *
 * @author pengdh
 * @date: 2017年3月14日 下午9:51:42
 */
public class Name implements Serializable {

	/**
	 * serialVersionUID:
	 */
	private static final long serialVersionUID = 8761549648158557131L;
	/**
	 * Last name. Must be non-null
	 */
	private final String lastName;
	/**
	 * First name. Must be non-null
	 */
	private final String firstName;
	/**
	 * Middle name. Must be non-null
	 */
	private final String middleName;
	public Name(String lastName, String firstName, String middleName) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.middleName = middleName;
	}
	// Remainder omitted
}

