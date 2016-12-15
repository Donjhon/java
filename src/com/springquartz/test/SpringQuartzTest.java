package com.springquartz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springquartz.service.IPrintInfoService;

/** 
 * @className:SpringQuartzTest.java
 * @classDescription:
 * @author:Wentasy
 * @createTime:2012-7-15 ����07:14:55
 * @since:JDK 1.6
 */
public class SpringQuartzTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("开始测试");
		ApplicationContext  actx = new ClassPathXmlApplicationContext("applicationContext.xml");
		IPrintInfoService User = (IPrintInfoService) actx.getBean("printInfoService");
		User.save();
		System.out.println("结束测试");
	}

}
