package Program11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Bean Factory Called.");
		ClassA obj = (ClassA)context.getBean("program11ClassA");
		ClassA obj1 = (ClassA)context.getBean("program11ClassA");
		obj.setName("Prakash");
		obj1.setName("Singh");
		System.out.println(obj);
		System.out.println(obj1);
		((ClassPathXmlApplicationContext)context).close();
	}

}
