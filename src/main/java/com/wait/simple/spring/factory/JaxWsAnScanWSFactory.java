package com.wait.simple.spring.factory;

import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.beans.factory.FactoryBean;

import com.wait.simple.spring.TestChildClassA;

public class JaxWsAnScanWSFactory extends JaxWsProxyFactoryBean implements FactoryBean{

	private TestChildClassA service;
	 
	 public JaxWsAnScanWSFactory() {
	 }
	 
	 @Override
   public TestChildClassA getObject() throws Exception {
		  String urlString = getAddress()+getConfiguration().getConf();
		  URL url =null;
		  try {
			   url = new URL(urlString);
		  } catch (MalformedURLException e) {
           e.printStackTrace();
		  }
		 service=new TestChildClassA(url.toString());
       return service;
   }
	 @Override
   public Class getObjectType() {
       return TestChildClassA.class;
   }
	 @Override
   public boolean isSingleton() {
       return true;
   }
}


