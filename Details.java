package com.cg;

public class Details {
	public static void main(String[] args) {
		Student s=new Student();
		s.setStno(2);
		s.setName("sai");
		s.setSub1 (85);
		s.setSub2 (77);
		s.setSub3(66);
		
		int Stno=s.getStno();
		String Name=s.getName();
		int sub1=s.getSub1();
		int sub2=s.getSub2();
		int sub3=s.getSub3();
		
		System.out.println(s);
		
		
		
	}
	
	

}
