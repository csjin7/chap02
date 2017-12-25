package chap06;

import java.util.Arrays;

public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	public int[] scores;
	public Car car;
	

	public Member(String id, String name, String password, int age, boolean adult, int[] scores, Car car) {
		
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
		this.scores = scores;
		this.car = car;
	}

	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Member cloned = (Member) super.clone();
		
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		
		return cloned;
	}



	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member) clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}

}
