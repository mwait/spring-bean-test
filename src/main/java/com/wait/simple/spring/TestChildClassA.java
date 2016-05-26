package com.wait.simple.spring;

public class TestChildClassA extends TestParentClass {

	private String textChildClass;

	public String getTextChildClass() {
		return textChildClass;
	}

	public void setTextChildClass(String textChildClass) {
		this.textChildClass = textChildClass;
	}
	
	public TestChildClassA() {
		super();
	}

	public TestChildClassA(String address) {
		super(address);
	}
	
	
}
