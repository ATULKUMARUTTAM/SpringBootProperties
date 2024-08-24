package com.atuluttam.propertyPro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PropertyProApplication {
	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(PropertyProApplication.class, args);
        MyService ms =  ctx.getBean(MyService.class);
		System.out.println(ms.getMessage());
		System.out.println(ms.getMyName());
		System.out.println(ms.getMobileno());
		int a = ms.getCabinno();
		System.out.println(a);

		/*System.out.println("My java Version is ");
		System.out.println(ms.getJavaVersion());
		System.out.println(ms.getOsName());
		System.out.println(ms.readProperty());*/

	}

}
