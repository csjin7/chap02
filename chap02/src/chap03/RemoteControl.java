package chap03;

public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	default void setMute (boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다. ");
		} else {
			System.out.println("무음 해제합니다. ");
		}
	}
	
	static void changeBettery() {
		System.out.println("배터리를 교체합니다. ");
	}
}
