/**
 * @Project Name:effectiveJavaSample
 * @File Name:Foo.java
 * @Package Name:com.sample.chapter11.item74
 * @Date:2017年3月13日下午10:25:43
 *
*/

package com.sample.chapter11.item74;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @ClassName:Foo
 * @Function: Serializable subclass of nonserializable stateful class 
 * @version
 *
 * @author pengdh
 * @date: 2017年3月13日 下午10:25:43
 */
public class Foo extends AbstractFoo implements Serializable {
	/**
	 * serialVersionUID:
	 */
	private static final long serialVersionUID = 2275301397088472355L;

	private void readObject(ObjectInputStream s) throws ClassNotFoundException, IOException {
		s.defaultReadObject();
		
		// Manually deserialize and initialize superclass state
		int x = s.readInt();
		int y = s.readInt();
		initialize(x, y);
	}
	private void writeObject(ObjectOutputStream s) throws IOException {
		s.defaultWriteObject();
		
		// Manually serialize superclass state
		s.writeInt(getX());
		s.writeInt(getY());
	}
	
	// Constructor does not use the fancy mechanism
	public Foo(int x, int y) {
		super(x, y);
	}
	
}

