package com.wait.simple.spring.factory;


public class JaxWsProxyFactoryBean{

    private Configuration configuration;
    private String address;
   

    public Configuration getConfiguration() {
        return this.configuration;
    }
    

	public void setConfiguration(final Configuration configuration) {
        this.configuration = configuration;
    }

    
    public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
    
    
    

}


