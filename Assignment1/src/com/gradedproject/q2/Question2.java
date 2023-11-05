package com.gradedproject.q2;

public class Question2 {
	public static int valueOfPower(int a,int b) {
		if(b==0) {
			return 1;
		}
		else {
			return a*valueOfPower(a,b-1);
		}
	}

	public static void main(String[] args) {
		
		int a=2,b=10;
		int power=valueOfPower(a,b);
		System.out.println(power);

	}

}
