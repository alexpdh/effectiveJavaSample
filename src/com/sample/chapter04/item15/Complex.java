/**
 * @Project Name:effectiveJavaSample
 * @File Name:Complex.java
 * @Package Name:com.sample.chapter03.item15
 * @Date:2016年12月19日上午12:11:28
 *
*/

package com.sample.chapter04.item15;
/**
 * @ClassName:Complex
 * @Function: TODO ADD FUNCTION.
 * @Date:     2016年12月19日 上午12:11:28
 *
 * @author   Administrator
 * @version
 */
public final class Complex {
	private final double re;
	private final double im;
	
	public Complex(double re, double im){
		this.re = re;
		this.im = im;
	}
	
	//Accessors with no corresponding mutators
	public double realPart() {
		return re;
	}
	
	public double imaginaryPart() {
		return im;
	}
	
	public Complex add(Complex c) {
		return new Complex(re + c.re, im + c.im);
	}
	
	public Complex subtract(Complex c) {
		return new Complex(re - c.re, im - c.im);
	}
	
	public Complex multiply(Complex c) {
		return new Complex(re * c.re, im * c.im);
	}
	
	public Complex divide(Complex c) {
		double tmp = c.re * c.re + c.im * c.im;
		return new Complex((re * c.re + im * c.im) / tmp,(im * c.im + im * c.im) /tmp);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this)
			return true;
		if(!(o instanceof Complex))
			return false;
		Complex c = (Complex) o;
		return Double.compare(re, c.re) == 0 &&
				Double.compare(im, c.im) == 0;
	}
	
	@Override
	public int hashCode() {
		int result = 17 + hashDouble(re);
		result = 31 * result + hashDouble(im);
		return result;
	}

	private int hashDouble(double val) {
		long longBits = Double.doubleToLongBits(val);
		return (int) (longBits ^ (longBits >>> 32));
	}
	
	@Override
	public String toString() {
		return "(" + re + "+" + im + ")";
	}
}

