package com.cg;

public class Garage {
	

		// signature of the method

		// method behaves

		public static void servicing(Vehicle v) {


			if( v instanceof Car ) {

				// do some thing

			Car c=(Car)v;

			c.startAc();

			c.stopAc();


			}

			if(v instanceof Truck) {

				Truck t= (Truck)v;

				t.load();

				t.unload();

				// do something


			}

			v.speed();

			v.mileage();




		}

	 

	}


