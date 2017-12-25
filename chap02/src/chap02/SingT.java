package chap02;

public class SingT {
	private static SingT sing = new SingT();
	
	private SingT() {}
	
	static SingT getInstance() {
		return sing;
	}
}
