package chap06;

public class MathEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-3.14);
		
		System.out.println(v1 + " : " + v2);
		
		System.out.println(Math.max(5, 3));
		
		
		double v12 = Math.rint(5.3);
		double v13 = Math.rint(5.7);
		
		System.out.println(v12 + " : " + v13);
		
		int num = (int) (Math.random() * 6) + 1;
		
		
		
	}

}
