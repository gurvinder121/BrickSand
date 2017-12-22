package com.calculator;


public class result

{

	public static int exp1(int x, int y) {
		int c;
		c = x * x + y * y;
		return c;
	}

	public void res(double x, double y, double z) {
		double res1;
		double res2;
		res1= x * x * x + y * y * y + z * z * z;
		res2 = x * x  + y * y  + z * z ;
		System.out.println(res1);
		System.out.println(res2);
	}

	public static void main(String args[]) {
		result obj1=new result();
		obj1.res(1.1,2.1,3.1);
		System.out.println(result.exp1(7, 9));
		
		

	}
}
