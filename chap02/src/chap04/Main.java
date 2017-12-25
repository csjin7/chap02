package chap04;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		
		//A.B b = a.new B();
		A.B b = a.new B();
		b.field1 = 3;
		b.method1();
		
		A.C c =  new A.C();
		c.field1 = 3;
		c.method1();
		A.C.field2 = 5;
		A.C.method2(); 
		
		System.out.println("aaaazzzz");
		a.method();
		
	}

}
