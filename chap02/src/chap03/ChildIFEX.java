package chap03;


class Child3 implements ChildInterface3 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("1");
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("3");
	}
	
}

class Child2 implements ChildInterface2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("11");
	}

//	@Override
//	public void method2() {
//		// TODO Auto-generated method stub
//		System.out.println("22");
//	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("33");
	}
	
}

class Child1 implements ChildInterface1 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("111");
	}

//	@Override
//	public void method2() {
//		// TODO Auto-generated method stub
//		System.out.println("22");
//	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("333");
	}
	
}


public class ChildIFEX {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInterface3 cf1 = new Child3();
		cf1.method1();
		cf1.method2();
		cf1.method3();
		
		ParentInterface cf11 = new Child3();
		cf11.method1();
		cf11.method2();
		System.out.println();
		
		
		ParentInterface cf2 = new Child2();
		
		cf2.method1();
		cf2.method2();
		
		ChildInterface1 cf3 = new Child1();
		cf3.method1();
		cf3.method2();
		cf3.method3();
		
	}

}
