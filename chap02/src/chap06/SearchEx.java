package chap06;

import java.util.Arrays;

public class SearchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		
		int index = Arrays.binarySearch(scores, 99);
		System.out.println("int Array 찾은 인덱스는 요 = " + index);
		
		String[] names = {"홍길동","박동수","김민수"};
		Arrays.sort(names);
		index = Arrays.binarySearch(names, "홍길동");
		System.out.println("String Array 찾은 인덱스는 요 = " + index);
		
		Memba a = new Memba("홍가야");
		Memba b = new Memba("박가야");
		Memba c = new Memba("강가딘");
		
		Memba[] membas = {a, b, c};
		Arrays.sort(membas);
		
		index = Arrays.binarySearch(membas, a);
		System.out.println("Memba Array 찾은 인덱스는 요 = " + index);
	
		System.out.println("-128~127 초과값 비교");
		Integer obj1 = 300;
		Integer obj2 = 300;
		
		System.out.println("== 비교 : " + (obj1 == obj2));
		System.out.println("언박싱후 == 비교 : " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals 비교 : " +obj1.equals(obj2));
		System.out.println();
		
		System.out.println(" -128~127 범위값일 경우 : ");
		obj1 = 30;
		obj2 = 30;
		
		System.out.println("== 비교 : " + (obj1 == obj2));
		System.out.println("언박싱후 == 비교 : " + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals 비교 : " +obj1.equals(obj2));
		System.out.println();
		
		
		
		
		
	}

}

