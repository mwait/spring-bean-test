package com.wait.simple.spring;

public class TestChildClassB extends TestParentClass{

	private String textChildClass;

	public String getTextChildClass() {
		return textChildClass;
	}

	public void setTextChildClass(String textChildClass) {
		this.textChildClass = textChildClass;
	}
	
	public TestChildClassB() {
		super();
	}

	public TestChildClassB(String address) {
		super(address);
	}
}
