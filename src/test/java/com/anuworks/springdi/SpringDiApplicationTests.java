package com.anuworks.springdi;

import com.anuworks.springdi.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringDiApplicationTests {

	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testGetContext() {
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println(controller.hello());
	}

	@Test
	void testAutowireOfController(){
		System.out.println(myController.hello());
	}


	@Test
	void contextLoads() {
	}

}
