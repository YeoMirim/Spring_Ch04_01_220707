package com.mirim.bmi;

public class MyInfo {
	
	private String name;
	private double weight;
	private double height;
	private BMICalculator bmiCal;	// ����
	
	
	public void BMICalculation() {			// �޼ҵ带 ����� ȣ�� �����ϰԲ� ��
		bmiCal.bmiCalcu(weight, height);  	// �ʱ�ȭ�� �� �־���
	}
	
	
	public void getMyInfo() {
		
		System.out.println("�̸� : " + name);
		System.out.println("������ : " + weight);
		System.out.println("Ű : " + height);
		
		BMICalculation();	// ȣ��
		
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
