package chap03;

public class Comp extends Calc {
	@Override
	double areaCircle(double r) {
		System.out.println("comp의 areaCircle 호출");
		return Math.PI * r * r;
	}
}
