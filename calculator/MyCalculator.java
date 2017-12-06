package com.calculator;

public class MyCalculator implements Calc1 {

	public void add()
	{

		System.out.println("it adds 2 nos");
	}

	public void sub() {
		System.out.println("it sub 2 nos");
	}

	public void mul() {

		System.out.println("it mul 2 nos");
	}

	public void div()
	{
		System.out.println("it div 2 nos");
		}

public static void main(String args[])
{
	Calc1 m = new MyCalculator();
	m.mul();
}




}
