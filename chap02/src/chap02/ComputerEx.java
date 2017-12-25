package chap02;

public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myCom = new Computer();
		
		int[] values1 = {1, 2, 3};
		
		int result1 = myCom.sum1(values1);
		System.out.println(" sum1 result 1 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println(" sum1 result 2 : " + result2);
		
		int result3 = myCom.sum2(1, 2, 3);
		System.out.println(" sum2 result 3 : " + result3);
		
		int result4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println(" sum2 result 4 : " + result4);
		
		int result5 = myCom.sum2(values1);
		System.out.println(" sum2 result 5 : " + result5);
		
		int result6 = myCom.sum2(new int[] {1,2,3,4,5});
		System.out.println(" sum2 result 6 : " + result6);		
	}

}
