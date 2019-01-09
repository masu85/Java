package com.masu.springboot.firststeps.springbootlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootLearnApplication {

	public static void main(String[] args)
        {
            ApplicationContext applicationContext = SpringApplication.run(SpringbootLearnApplication.class, args);
            
            for(String name : applicationContext.getBeanDefinitionNames())
            {
                System.out.println(name);
            }
	}

}

