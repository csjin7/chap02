package chap03;

public interface ChildInterface2 extends ParentInterface {

	@Override
	public default void method2() {	
		System.out.println("Childif2 Method2");
	}
	
	public void method3();

}
