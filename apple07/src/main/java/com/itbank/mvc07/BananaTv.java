package com.itbank.mvc07;

public class BananaTv implements Tv {

	@Override
	public void powerOn() {
		System.out.println("바나나 TV를 켜다.");
	}
	@Override
	public void powerOff() {
		System.out.println("바나나 TV를 끄다.");
	}
	@Override
	public void volumUp() {
		 System.out.println("바나나 TV 볼륨 UP");
	}
	@Override
	public void volumDown() {
		System.out.println("바나나 TV 볼륨Down");
	}

}
