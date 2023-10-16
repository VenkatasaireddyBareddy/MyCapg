package com.cg;

public class Circle {
	

	 

		private int x; // these are called data members

		private int y;// also we can also field member

		private int r;

		public double z;


		public int getX() {

			return x;

		}

		public void setX(int x) {


			this.x = x;

		}


	  public void area() {

		  System.out.println(3.142*r*r);

	  }


		public int getY() {

			return y;

		}

		public void setY(int y) {

			this.y = y;

		}



		public int getR() {

			return r;

		}

		public void setR(int r) {

			this.r = r;

		}


		@Override

		public String toString() {

			return "My Circle "+r;

		}



		// getter and setter methods











	}


	
	 

	// the class name must start with upper case

	// method name first character should in lowe case and first char of next word uper case

	 

	

		