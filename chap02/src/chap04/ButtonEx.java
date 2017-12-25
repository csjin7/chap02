package chap04;

public class ButtonEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Button btn = new Button();
		
		btn.setOnClickLIstener(new CallListener());
		btn.touch();
		
		btn.setOnClickLIstener(new MessageListener());
		btn.touch();		
		
	}

}
