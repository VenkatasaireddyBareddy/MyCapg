package com.cg;

public class Pizza1 {
	Pizza p1 = new Pizza("Medium",20,3);
    Pizza p2 = new Pizza("Medium",20,3);
    
    if(p1.equals(p2))
    	System.out.println("Yes Identical");
    else
    	System.out.println("Not identical");