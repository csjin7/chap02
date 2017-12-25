package chap03;

public class MyClass {
	RemoteControl rc = new Television();
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
	}
	
	void methodA( ) {
		RemoteControl rc = new Audio();
	}
	
	
}
