package Program7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Prototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ICoach coach=(ICoach)context.getBean("myTennisCoach1");
		coach.setName("Prakash");
		ICoach coach1 = (ICoach)context.getBean("myTennisCoach1");
		coach1.setName("Singh");
		System.out.println(coach+"\n"+coach1);
		System.out.println("The Object is equal : "+coach.equals(coach1));
		System.out.println(coach.getName()+"\n"+coach1.getName());
		((ClassPathXmlApplicationContext)context).close();
	}

}
