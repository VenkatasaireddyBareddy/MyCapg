package com.cg;

public class Operator {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if(a>b && a>c) {
			System.out.println("the biggest number is "+a);}
		else if (b>c && b>a) {
			System.out.println("the bigger number is "+b);}
		else {
			System.out.println("The biggest number is "+c);}

	}

}
