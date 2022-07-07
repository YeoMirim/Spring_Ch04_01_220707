package com.mirim.bmi;

import java.util.ArrayList;

public class MyInfo {
	
	private String name;
	private double weight;
	private double height;
	private BMICalculator bmiCal;	// 의존
	private ArrayList<String> hobbys;		// ArrayList로 제작
	
	
	public void BMICalculation() {			// 메소드를 만들어 호출 가능하게끔 함
		bmiCal.bmiCalcu(weight, height);  	// 초기화된 값 넣어줌
	}
	
	
	public void getMyInfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("몸무게 : " + weight);
		System.out.println("키 : " + height);
		System.out.println("취미 : " + hobbys);
		
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


	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	
	
}
