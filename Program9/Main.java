package Program9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Program7.ICoach;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Bean Factory Called.");
		CountingNumbers counter =(CountingNumbers) context.getBean("program9");
		

		
		
		((ClassPathXmlApplicationContext)context).close();
		
	}

}
