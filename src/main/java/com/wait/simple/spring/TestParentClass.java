package com.wait.simple.spring;

public class TestParentClass {

	private String address;
	private String configuration;
	
	public void hello(){
		System.out.println("Witaj w klasie"+this.getClass().getSimpleName());
	}

	public TestParentClass() {
		
	}
	
	public TestParentClass(String address){
		this.address=address;
	}
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}
	
	
	
}
