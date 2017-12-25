package chap06;

public class MemberEx {

	public static void main(String[] args) {
		Member original = new Member("blue", "hongkildong", "12345", 25, true, 
				new int[] {10, 20 ,30}, new Car("개나타"));
		
		Member cloned = original.getMember();
		
		cloned.password = "67890";
		cloned.scores[0] = 100;
		cloned.car.model = "우와 그랜져";
		
		System.out.println(original.id + original.password + original.name + " " + 
		original.age + " " + original.adult);
		
		System.out.println(cloned.id + cloned.password + cloned.name + " " + 
				cloned.age + " " + cloned.adult);
		
		int i = 0;
		for(int val : original.scores ) {
			i++;
			System.out.println("original scores[" +  i +  "]: " + val);
		}
		System.out.println(" Original Car Model " + original.car.model);
		
		
		i = 0;
		for(int val : cloned.scores ) {
			i++;
			System.out.println("cloned scores[" +  i +  "]: " + val);
		}
		System.out.println(" cloned Car Model " + cloned.car.model);

		
	}

}
