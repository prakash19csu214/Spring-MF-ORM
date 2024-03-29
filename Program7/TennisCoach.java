package Program7;

import Program2.IFortune;
import Program4.Address;

public class TennisCoach implements ICoach {

	private IFortune fortune;
	private String name;
	private String email_id;
	private Integer age;
	private Address address;
	
	public TennisCoach(IFortune fortune, String name, String email_id, Integer age, Address address) {
		super();
		this.fortune = fortune;
		this.name = name;
		this.email_id = email_id;
		this.age = age;
		this.address = address;
	}

	

	
	public TennisCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	public IFortune getFortune() {
		return fortune;
	}

	public void setFortune(IFortune fortune) {
		this.fortune = fortune;
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
