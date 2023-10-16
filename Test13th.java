package com.cg;

public class Test13th {
	public static void main(String[] args) {
		int sum=0;
		String str="20;30;40;60";
		String []mystr=str.split(";");
		for(String s:mystr) {
			int i=Integer.parseInt(s);
			sum =sum+i;
		}
		System.out.println(sum);
	}

}
