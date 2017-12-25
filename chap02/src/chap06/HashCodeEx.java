package chap06;

import java.util.Objects;

public class HashCodeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "강가딘");
		Student s2 = new Student(1, "강가딘");
		
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
		
		
	}
	
	static class Student {
		int sno;
		String name;
		
		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}

		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
		
		
	}

}
