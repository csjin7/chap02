package chap03;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmbcellPhone = new DmbCellPhone("javaPhone","black",10);

		System.out.println(dmbcellPhone.model);
		System.out.println(dmbcellPhone.color);
		
		System.out.println(dmbcellPhone.channel);
		
		
		dmbcellPhone.powerOn();
		
		dmbcellPhone.powerOff();
		
		dmbcellPhone.hangUp();
		
		dmbcellPhone.bell();
		
		dmbcellPhone.sendVoice("hahaha");
		
		dmbcellPhone.receiveVoice("hohoho");
		
		dmbcellPhone.turnOnDmb();
		dmbcellPhone.turnOffDmb();
		dmbcellPhone.changeChannelDmb(12);
				
	}

}
