package chap03;

public class Audio implements RemoteControl {
	private int volume;
	private boolean mute;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("현재의 Audio 볼륨은 : " + volume);		
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다. ");
		} else {
			System.out.println("Audio 무음 해제합니다. ");
		}		
	}

	
}
