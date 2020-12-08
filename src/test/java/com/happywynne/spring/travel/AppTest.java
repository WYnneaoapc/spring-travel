package com.happywynne.spring.travel;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


/**
 * @author Wynne.Lu
 * @date 2020/12/8 下午2:49
 * @desc
 */
public class AppTest {

	@Test
	public void MyTestBeanTest() {
		ApplicationContext context = new FileSystemXmlApplicationContext
				("classpath:spring-config.xml");
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		MyTestBean myTestBean = (MyTestBean) context.getBean("myTestBean");
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-config.xml"));
//		MyTestBean myTestBean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(myTestBean.getName());
	}
}
