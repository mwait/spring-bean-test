package com.wait.simple.spring.factory;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.FactoryBean;

import com.wait.simple.spring.TestChildClassB;

public class JaxWsAnScanWSFactory extends JaxWsProxyFactoryBean implements FactoryBean{

	private TestChildClassB service;
	 
	 public JaxWsAnScanWSFactory() {
	 }
	 
	 @Override
   public TestChildClassB getObject() throws Exception {
		  String urlString = getAddress()+getConfiguration().getConf();
		  URL url =null;
		  try {
			   url = new URL(urlString);
		  } catch (MalformedURLException e) {
           e.printStackTrace();
		  }
		 service=new TestChildClassB(url.toString());
       return service;
   }
	 @Override
   public Class<TestChildClassB> getObjectType() {
       return TestChildClassB.class;
   }
	 @Override
   public boolean isSingleton() {
       return true;
   }
}


