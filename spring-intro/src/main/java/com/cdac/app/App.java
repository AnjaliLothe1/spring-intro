package com.cdac.app;

import org.springframework.aop.framework.autoproxy.AbstractAdvisorAutoProxyCreator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.component.Calculator;
import com.cdac.component.CurrencyConverter;
import com.cdac.component.HelloWorld;
import com.cdac.component.TextEditor;

public class App {
public static void main(String[] args) {
	ApplicationContext apx=new ClassPathXmlApplicationContext("app-config.xml");
	HelloWorld h=(HelloWorld)apx.getBean("hw");
	System.out.println(h.SayHello("Anjali"));
	
	Calculator cal=(Calculator)apx.getBean("calc");
	System.out.println(cal.add(11, 121));
	
	CurrencyConverter converter=(CurrencyConverter)apx.getBean("cc");
	//System.out.println("USD","INR", 75);
	System.out.println(converter.convert("USD","INR",75));
	
	TextEditor txt=(TextEditor)apx.getBean("txtEdtr");
	txt.loadDocument("abc.txt");
	
	
}
}
