package Program2;

public class BasetBall implements ICoach {
	
	private IFortune fortune;
	public BasetBall(IFortune fortune) {
		// TODO Auto-generated constructor stub
		System.out.println("This is BasketBall.");
		this.fortune = fortune;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Go Gym And do exercise";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortune.getFortune();
	}

}
