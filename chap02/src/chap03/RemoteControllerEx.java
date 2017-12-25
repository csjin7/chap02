package chap03;

public class RemoteControllerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		rc.setMute(true);
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		
		RemoteControl.changeBettery();
		
	}

}
