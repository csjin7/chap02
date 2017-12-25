package chap03;

public class ChildEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		if(parent instanceof Child) {
		
			Child child = (Child) parent;
			child.field2 = "yyy";
			child.method3();
		}
		
	}	

}

