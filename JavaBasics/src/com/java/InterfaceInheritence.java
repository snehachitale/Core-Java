package com.java;

import javax.security.auth.login.FailedLoginException;

interface InterfaceA {
	public default void foo() {
		System.out.println("Hello from Interface A");
	}
}

interface InterfaceB extends InterfaceA{
	public default void foo() {
		System.out.println("Hello from Interface B");
	}
}

public class InterfaceInheritence implements InterfaceA, InterfaceB{

	InterfaceA c = new InterfaceInheritence();
}
