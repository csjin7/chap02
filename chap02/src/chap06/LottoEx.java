package chap06;

import java.util.Arrays;
import java.util.Random;

public class LottoEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] selectNumber = new int[6];
		
		Random random = new Random();
		boolean isSame;
//		for (int i = 0; i < 6;)  {
//			selectNumber[i] = random.nextInt(45) + 1;
//			isSame = false;
//						
//			if (i == 0 ) { i++; }
//			else { 
//				for (int j = 0; j<i; j++) {
//					if (selectNumber[j] == selectNumber[i]) {
//						isSame = false; 
//						break;
//					} else { isSame = true;} 
//				}
//				
//				if (isSame) { i++; }
//				else
//				{ selectNumber[i] = random.nextInt(45) + 1; }
//			}
//		}
//		
//		System.out.println(Arrays.toString(selectNumber));
		
		int[] selectNumber = {2, 8 ,9 , 24, 34 , 42};
		int[] winNumber = new int[6];

		int cntWin = 0;
		String strSame = "";
		int cntSame =  0;
		
		for (int m = 0; m < 10000000; m++) {

			winNumber = new int[6];
			for (int i = 0; i < 6;)  {
				winNumber[i] = random.nextInt(45) + 1;
				isSame = false;
							
				if (i == 0 ) { i++; }
				else { 
					for (int j = 0; j<i; j++) {
						if (winNumber[j] == winNumber[i]) {
							isSame = false; 
							break;
						} else { isSame = true;} 
					}
					
					if (isSame) { i++; }
					else
					{ winNumber[i] = random.nextInt(45) + 1; }
				}
			}
			
	//		System.out.println(Arrays.toString(winNumber));
			
			Arrays.sort(selectNumber);
			Arrays.sort(winNumber);
			
			
	//		boolean bResult = Arrays.equals(selectNumber, winNumber);
	//		
	//		System.out.println("===============================");
			
			strSame = "";
			cntSame =  0;
			
			for (int i=0;i<6;i++)  {
				for (int j=0;j<6;j++) {
					if (selectNumber[i] == winNumber[j]) {
						cntSame++;
						strSame += selectNumber[i] + ", ";
					}  
				}
			}

			if (cntSame >= 6) {
				cntWin++;
				System.out.println("========================");
				System.out.println(Arrays.toString(selectNumber));
				System.out.println(Arrays.toString(winNumber));
				System.out.println("========================");
	
				System.out.println(cntSame);
				System.out.println(strSame);
			}	
		
		}
		System.out.println();
		System.out.println("========================");
		System.out.println("   1등 이상 당첨된 횟수!!!   ");
		System.out.println("   " + cntWin);
		System.out.println("========================");
		
	}
}
