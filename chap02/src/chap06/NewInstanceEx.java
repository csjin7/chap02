package chap06;

public class NewInstanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Class clazz = Class.forName("chap06.SendAction");
			Class clazz = Class.forName("chap06.ReceiveAction");
			Action action;
			action = (Action) clazz.newInstance();
			action.execute();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
