package chap02;

public class SingletonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton obj1 = new Singleton();
//		Singleton obj2 = new Singleton();
		
		//Singleton o1 = Singleton.getInstance();
		//Singleton o2 = Singleton.getInstance();
		SingT o1 = SingT.getInstance();
		SingT o2 = null; //SingT.getInstance();
		
		if (o1 == o2) 
			System.out.println(" o1 o2는 같은 객체 입니다.");
		else 
			System.out.println(" o1 o2는 다른 객체 입니다.");
	}

}
