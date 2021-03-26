package Program1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainConsumer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Consumer c1 = new Consumer((Producer)context.getBean("SlowProducer", SlowProducer.class));
		
		c1.work();
    
	}
}
