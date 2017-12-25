package chap03;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(String model, String color, int channel) {
		// TODO Auto-generated constructor stub
		this.model = model;
		this.color = color;
		this.channel = channel;
	}

	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송을 수신 합니다." );
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다." );
	}
	
	void turnOffDmb() {
		System.out.println( " DMB 방송 수신을 멈춥니다." );
	}
	
	
	
}
