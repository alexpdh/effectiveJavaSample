/**
 * @Project Name:effectiveJavaSample
 * @File Name:StringList.java
 * @Package Name:com.sample.chapter11.item75
 * @Date:2017年3月14日下午10:02:29
 *
*/

package com.sample.chapter11.item75;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @ClassName:StringList
 * @Function: StringList with a reasonable custom serialized form
 * @version
 *
 * @author pengdh
 * @date: 2017年3月14日 下午10:02:29
 */
public class StringList implements Serializable {
	// transient 修饰符表明这个实例域将从一个类的默认序列化形式中省略掉
	private transient int size = 0;
	private transient Entry head = null;
	
	// No longer Serialiable!
	private static class Entry {
		String data;
		Entry next;
		Entry previous;
	}
	
	// Appends the specified string to the list
	public final void add(String s) {  }
	/**
	 * Serialize this {@code StringList} instance.
	 * 
	 * @serialData The size of the list (the number of strings it contains) is
	 *             emitted ({@code int}), followed by all of its elements (each
	 *             a {@code String}), in the proper sequence.
	 */
	private void writeObject(ObjectOutputStream s) throws IOException {
		s.defaultWriteObject();
		s.writeInt(size);
		
		// Write out all elements in the proper order
		for (Entry e = head; e != null; e = e.next) {
			s.writeObject(e.data);
		}
	}
	
	private void readObejct(ObjectInputStream s) throws ClassNotFoundException, IOException {
		s.defaultReadObject();
		int numElements = s.readInt();
		
		// Read in all elements and insert them in list
		for (int i = 0; i < numElements; i++) {
			add((String) s.readObject());
		}
		// Remainder omitted
	}
}

