/**
 * @Project Name:effectiveJavaSample
 * @File Name:GenericSingletonFactory.java
 * @Package Name:com.sample.chapter05.item27
 * @Date:2017年1月12日下午11:04:47
 *
*/

package com.sample.chapter05.item27;
/**
 * @ClassName:GenericSingletonFactory
 * @Function:  
 * @version
 *
 * @author pengdh
 * @date: 2017年1月12日 下午11:04:47
 */
public class GenericSingletonFactory {
	//Generic singlton factory pattern
	private static UnaryFunction<Object> IDENTITY_FUNCTION = new UnaryFunction<Object>() {
		public Object apply(Object arg) {
			return arg;
		}
	};
	
	// IDENTITY_FUNCTION is stateless and its type parameter is
	// unbounded so it's safe to share one instance across all types.
	@SuppressWarnings("unchecked")
	public static<T> UnaryFunction<T> identityFunction() {
		return (UnaryFunction<T>) IDENTITY_FUNCTION;
	}
	
	//Sample program to exercise generic singleton
	public static void main(String[] args) {
		String[] strings = { "jute", "hemp", "nylon" };
		UnaryFunction<String> samString = identityFunction();
		for(String s : strings) {
			System.out.println(samString.apply(s));
		}
		
		Number[] numbers = { 1, 2.0, 3L };
		UnaryFunction<Number> sameNumber = identityFunction();
		for (Number n : numbers)
			System.out.println(sameNumber.apply(n));
	}
}

