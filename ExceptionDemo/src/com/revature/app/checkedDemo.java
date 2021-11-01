package com.revature.app;

import com.revature.exceptions.DivideByZeroException;

public class checkedDemo {
	public static void demo()  {
		try {
			divide(10,8);
		} catch(DivideByZeroException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static double divide(double d1, double d2) throws DivideByZeroException {
		// If d2 == 0, throw an exception
		// In this case, we will create our own custom checked exception called DivideByZeroException
		if(d2 == 0) {
			throw new DivideByZeroException("Tried to divide " + d1 + "by " + d2);
		}
		
		return d1/d2;
	}
}
