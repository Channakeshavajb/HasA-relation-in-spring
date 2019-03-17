package com.xworkz.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.bean.Xworkz;
import com.xworkz.spring.flipkart.Flipkart;

public class FlipkartTest {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("resource/context.xml");
		Flipkart flips=container.getBean(Flipkart.class);
		flips.sellProduct("mobile");
	}
}
