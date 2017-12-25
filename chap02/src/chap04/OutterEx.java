package chap04;

public class OutterEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outter outter = new Outter();
		Outter.Nested nested = outter.new Nested();

		nested.print();
		outter.print2();
	}

}
