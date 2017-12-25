package chap04;

public class Anon {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
				
		field = 10;
						
		Calculator calc = new Calculator() {
			@Override
			public int sum() {
				// TODO Auto-generated method stub
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
