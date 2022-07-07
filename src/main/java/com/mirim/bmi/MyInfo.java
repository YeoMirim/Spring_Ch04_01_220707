package com.mirim.bmi;

public class MyInfo {
	
	private String name;
	private double weight;
	private double height;
	private BMICalculator bmiCal;	// 의존
	
	
	public void BMICalculation() {			// 메소드를 만들어 호출 가능하게끔 함
		bmiCal.bmiCalcu(weight, height);  	// 초기화된 값 넣어줌
	}
	
	
	public void getMyInfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("몸무게 : " + weight);
		System.out.println("키 : " + height);
		
		BMICalculation();	// 호출
		
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setBmiCal(BMICalculator bmiCal) {
		this.bmiCal = bmiCal;
	}
	
	
	
}
