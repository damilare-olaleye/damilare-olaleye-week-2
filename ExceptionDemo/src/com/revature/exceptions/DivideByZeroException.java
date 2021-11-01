package com.revature.exceptions;

public class DivideByZeroException extends Exception {

	public DivideByZeroException() {
		super();

	}

	public DivideByZeroException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
		
	}

	public DivideByZeroException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	
	}

	public DivideByZeroException(String arg0) {
		super(arg0);
	
	}

	public DivideByZeroException(Throwable cause) {
		super(cause);
	}
	
}
