package Program7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Program2.ICoach;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ICoach coach=(ICoach)context.getBean("myCricketCoach");
		
		//Using Constructor Method
		System.out.println("Using Contructor with Address Excluded.");
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune()+"");
		System.out.println(coach+"\n\n");
		
		
		//Using Setter Method
		System.out.println("Using Setter with Address Included.");
		ICoach coach1=(ICoach)context.getBean("myCricketCoach1");
		System.out.println(coach1.getDailyWorkout());
		System.out.println(coach1.getDailyFortune());
		System.out.println(coach1+"\n\n");

		System.out.println("Using Contructor with Address Included.");
		ICoach coach2 = (ICoach)context.getBean("myCricketCoach2");
		System.out.println(coach2.getDailyWorkout());
		System.out.println(coach2.getDailyFortune());
		System.out.println(coach2+"\n\n");
	}

}
