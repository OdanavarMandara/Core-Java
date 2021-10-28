package com.xworkz.crud;

import com.xworkz.crud.operator.*;

public class UpdateStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UpdateDeleteOperation cool = new UpdateDeleteOperation();
		UpdateDeleteOperation c = new UpdateDeleteOperation();
		UpdateDeleteOperation d = new UpdateDeleteOperation();
		UpdateDeleteOperation e = new UpdateDeleteOperation();
		UpdateDeleteOperation f= new UpdateDeleteOperation();

        
		cool.addCoolDrinks("slice");
		cool.addCoolDrinks("dew");
		cool.addCoolDrinks("maaza");
		cool.addCoolDrinks("lime");
		cool.addCoolDrinks("sprite");
		cool.addCoolDrinks("coke");
		cool.addCoolDrinks("dew");
		cool.addCoolDrinks("fanta");
		cool.displayCoolDrinks();
		
		
		c.addLabourName("sonali");
		c.addLabourName("diksha");
		c.addLabourName("sinchana");
		c.addLabourName("inchara");
		c.addLabourName("john");
		c.addLabourName("astha");
		c.addLabourName("daksh");
		c.addLabourName("cccc");
		c.displayLabourName();

		
		d.addCoffee("c1");
		d.addCoffee("c2");
		d.addCoffee("c3");
		d.addCoffee("c4");
		d.addCoffee("c5");
		d.addCoffee("c6");
		d.addCoffee("c7");
		d.addCoffee("c8");
		d.displayCoffee();

		e.addAirPort("a1");
		e.addAirPort("a2");
		e.addAirPort("a3");
		e.addAirPort("a4");
		e.addAirPort("a5");
		e.addAirPort("a6");
		e.addAirPort("a7");
		e.addAirPort("a8");
		e.displayairport();

		f.addstadium("aaa");
		f.addstadium("bbb");
		f.addstadium("ccc");
		f.addstadium("ddd");
		f.addstadium("eee");
		f.addstadium("fff");
		f.addstadium("gggg");
		f.addstadium("hhh");
		f.displaystadium();
	}

}
