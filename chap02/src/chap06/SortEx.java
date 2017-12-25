package chap06;

import java.util.Arrays;

public class SortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {99, 97, 98};
		Arrays.sort(scores);
		for (int i = 0; i < scores.length; i++) {
			System.out.println("scores[" + i + "] = " + scores[i]);
		}
		System.out.println();
		
		String[] name = {"홍가야","박가야","강가딘"};
		Arrays.sort(name);
		for (int i = 0; i < name.length; i++) {
			System.out.println("name[" + i + "] = " + name[i]);
		}
		System.out.println();
		
		Memba a = new Memba("홍가야");
		Memba b = new Memba("박가야");
		Memba c = new Memba("강가딘");
		
		Memba[] membas = {a, b, c};
		Arrays.sort(membas);
		for (int i = 0; i < membas.length; i++) {
			System.out.println("membas[" + i + "] = " + membas[i].name);
		}
	}
}
