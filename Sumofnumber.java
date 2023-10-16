package com.cg;
public class Sumofnumber {
	public static void main(String[] args) {
		int a=123435,b,sum=0;
		
		while(a>0)
		{
			b=a%10;
			sum=sum+b;
			a=a/10;
		}
		System.out.println("sum of the digits  "+sum);
	}

}
