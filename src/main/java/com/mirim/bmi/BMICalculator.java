// BMI���� ���

package com.mirim.bmi;

public class BMICalculator {

	private double lowWeight;		// ��ü��
	private double normalWeight;	// ����ü��
	private double overWeight;		// ��ü��
	private double obesityWeight;	// ��ü��
	
	
	
	public void setLowWeight(double lowWeight) {		// �ʱ�ȭ
		this.lowWeight = lowWeight;
	}


	public void setNormalWeight(double normalWeight) {	// �ʱ�ȭ
		this.normalWeight = normalWeight;
	}


	public void setOverWeight(double overWeight) {		// �ʱ�ȭ
		this.overWeight = overWeight;
	}


	public void setObesityWeight(double obesityWeight) {// �ʱ�ȭ
		this.obesityWeight = obesityWeight;
	}


	public void bmiCalcu(double weight, double height) {		//���
		// BMI ���� : ������ /  (Ű0.01)^2
		
		double height2 = height*(0.01);
		double bmiResult = weight / ((height2) * (height2));
		
		System.out.println("BMI���� : " + bmiResult);
		
		
		if (bmiResult > obesityWeight ) {
			System.out.println("���Դϴ�.");
		}
		else if (bmiResult > overWeight) {
			System.out.println("��ü���Դϴ�.");
		}
		else if (bmiResult > normalWeight) {
			System.out.println("����ü���Դϴ�.");
		}
		else {
			System.out.println("��ü���Դϴ�.");
		}
		
	}
}
