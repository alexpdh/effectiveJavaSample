/**
 * Project Name:effectiveJavaSample
 * File Name:NutritionFacts.java
 * Package Name:com.sample.chapter02.item02.javabeans
 * Date:2016年11月29日下午11:08:14
 *
*/

package com.sample.chapter02.item02.javabeans;
/**
 * 
 * ClassName: NutritionFacts
 * Function: JavaBeans Pattern - allows inconsistency,mandates mutability
 * JavaBean的模式 - 允许不一致,任务易变的
 * Reason: TODO ADD REASON(可选)
 * date: 2016年11月29日 下午11:14:56
 *
 * @author Administrator
 * @version 
 * @since JDK 1.8
 */
public class NutritionFacts {
	//paramters initialized to default values(if any) 参数初始化为默认值（如果有）
	 private int servingSize = -1;		
	 private int servings = -1;		
	 private int calories = 0;		
	 private int fat = 0;				
	 private int sodium = 0;			
	 private int carbohydrate = 0;
	 
	 public NutritionFacts(){}
	 
	 public void setServingSize(int val) {
			servingSize = val;
		}

		public void setServings(int val) {
			servings = val;
		}

		public void setCalories(int val) {
			calories = val;
		}

		public void setFat(int val) {
			fat = val;
		}

		public void setSodium(int val) {
			sodium = val;
		}

		public void setCarbohydrate(int val) {
			carbohydrate = val;
		}
		
}

