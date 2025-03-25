package com.anuworks.springdi;

import com.anuworks.springdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(SpringDiApplication.class, args);
		MyController controller = context.getBean(MyController.class);
		System.out.println("This is main class");
		System.out.println(controller.hello());
	}

}
