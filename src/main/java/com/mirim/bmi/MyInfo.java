package com.mirim.bmi;

import java.util.ArrayList;

public class MyInfo {
	
	private String name;
	private double weight;
	private double height;
	private BMICalculator bmiCal;	// ����
	private ArrayList<String> hobbys;		// ArrayList�� ����
	
	
	public void BMICalculation() {			// �޼ҵ带 ����� ȣ�� �����ϰԲ� ��
		bmiCal.bmiCalcu(weight, height);  	// �ʱ�ȭ�� �� �־���
	}
	
	
	public void getMyInfo() {
		
		System.out.println("�̸� : " + name);
		System.out.println("������ : " + weight);
		System.out.println("Ű : " + height);
		System.out.println("��� : " + hobbys);
		
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


	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	
	
}
