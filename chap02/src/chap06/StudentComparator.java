package chap06;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.sno < o2.sno ) return -1;
		else if (o1.sno == o2.sno) return 0;
		else return 1;
	}

	
}

class Student {
	int sno;

	public Student(int sno) {
		this.sno = sno;
	}
	
}
