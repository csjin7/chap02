package chap04;

public class Button {
	OnClickListener listener;
	
	void setOnClickLIstener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	interface OnClickListener {
		void onClick();
	}
}
