package chap03;

public class CompEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r = 10;
		
		Calc calc = new Calc();
		System.out.println("원면적" + calc.areaCircle(r));
		System.out.println();
		
		Comp comp = new Comp();
		System.out.println("원면적" + comp.areaCircle(r));
		System.out.println();
		
		comp2 comp2 = new comp2();
		System.out.println("원면적" + comp2.areaCircle(r));
		
		
	}

}
