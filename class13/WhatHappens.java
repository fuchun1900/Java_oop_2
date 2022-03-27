package class13;

public class WhatHappens implements Runnable{
	public static void main(String args[]) {
		WhatHappens mahcine = new WhatHappens();
		Thread t = new Thread();
		t.start();
	}
	public void run() {
		System.out.println("hi");
	}
	

}
