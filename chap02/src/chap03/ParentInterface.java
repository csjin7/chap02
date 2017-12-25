package chap03;

public interface ParentInterface {
	public void method1();
	public default void method2() {
		System.out.println("Parent method2");
	}
}
