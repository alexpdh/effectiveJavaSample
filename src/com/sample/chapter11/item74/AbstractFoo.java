/**
 * @Project Name:effectiveJavaSample
 * @File Name:AbstractFoo.java
 * @Package Name:com.sample.chapter11.item74
 * @Date:2017年3月13日下午9:58:32
 *
*/

package com.sample.chapter11.item74;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @ClassName:AbstractFoo
 * @Function: Nonserializable stateful class allowing serializable subclass
 * 非序列化的状态类允许序列化的类
 * @version
 *
 * @author pengdh
 * @date: 2017年3月13日 下午9:58:32
 */
public class AbstractFoo {
	private int x, y;	// Our state
	
	// This enum and field are used to track initialization
	private enum State { NEW, INITIALIZING, INITIALIZED };
	private final AtomicReference<State> init = 
			new AtomicReference<State>(State.NEW);
	
	public AbstractFoo(int x, int y) {
		initialize(x, y);
	}
	
	// This constructor and the following method allow
	// Subclass's readObject method to initialize our state.
	protected AbstractFoo() {}
	protected final void initialize(int x, int y) {
		if (!init.compareAndSet(State.NEW, State.INITIALIZING)) {
			throw new IllegalStateException("Already initialized");
		}
		this.x = x;
		this.y = y;
		// Do anything else the original constructor did
		init.set(State.INITIALIZED);
	}
	
	// These methods provide access to internal state so it can
	// be manually serialized by subclass's writeObject method
	protected final int getX() {
		checkInit();
		return x;
	}
	protected final int getY() {
		checkInit();
		return y;
	}
	// Must call from all public and protected instance methods
	private void checkInit() {
		if(init.get() != State.INITIALIZED) {
			throw new IllegalStateException("Uninitialized");
		}
	}
	// Remainder omitted
}

