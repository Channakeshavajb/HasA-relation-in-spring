package com.xworkz.spring.tester;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.bean.Xworkz;

public class RelattionTest {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("resource/context.xml");
		Xworkz refFrom = container.getBean(Xworkz.class);
		refFrom.training("java");
	}

}
