package Program;

public class MainConsumer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer c1 = new Consumer(Factory.getObject());
		c1.work();
		
	}
}
