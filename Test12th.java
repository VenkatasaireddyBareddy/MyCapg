package com.cg;
import java.util.Scanner;

public class Test12th {
	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);

		Vehicle []v= new Vehicle[2];

		v[0]= new Car();

	 

	    v[1]= new Truck();
	    for(int i=0;i<v.length;i++)
	    {	
	    	v[i].speed();
	    	v[i].mileage();
	    }

	    //    
//	      Car c = new Car();
//	      
//		  Garage.servicing(new Car());
	//	
		}
}
