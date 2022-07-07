// BMI지수 계산

package com.mirim.bmi;

public class BMICalculator {

	private double lowWeight;		// 저체중
	private double normalWeight;	// 보통체중
	private double overWeight;		// 과체중
	private double obesityWeight;	// 비만체중
	
	
	
	public void setLowWeight(double lowWeight) {		// 초기화
		this.lowWeight = lowWeight;
	}


	public void setNormalWeight(double normalWeight) {	// 초기화
		this.normalWeight = normalWeight;
	}


	public void setOverWeight(double overWeight) {		// 초기화
		this.overWeight = overWeight;
	}


	public void setObesityWeight(double obesityWeight) {// 초기화
		this.obesityWeight = obesityWeight;
	}


	public void bmiCalcu(double weight, double height) {		//계산
		// BMI 계산식 : 몸무게 /  (키0.01)^2
		
		double height2 = height*(0.01);
		double bmiResult = weight / ((height2) * (height2));
		
		System.out.println("BMI지수 : " + bmiResult);
		
		
		if (bmiResult > obesityWeight ) {
			System.out.println("비만입니다.");
		}
		else if (bmiResult > overWeight) {
			System.out.println("과체중입니다.");
		}
		else if (bmiResult > normalWeight) {
			System.out.println("정상체중입니다.");
		}
		else {
			System.out.println("저체중입니다.");
		}
		
	}
}
