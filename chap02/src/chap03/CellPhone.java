package chap03;

public class CellPhone {
	String model;
	String color;
	
	void powerOn() { System.out.println(" power On ");}
	void powerOff()	{System.out.println(" power OFF ");}
	void bell() {System.out.println(" Bells are ring ");}
	void sendVoice(String message) {System.out.println(" sendVoice :" + message);}
	void receiveVoice(String message) {System.out.println(" receiveVoice " + message);}
	void hangUp() {System.out.println(" Hang Up  ");} 
	
}
