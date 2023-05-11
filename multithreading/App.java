package multithreading;

public class App {
    package org.studyeasy;

import javax.rmi.ssl.SslRMIClientSocketFactory;

class MyCounter extends Thread{
	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}
	
	@Override
	public void run() {
		countMe();
	}
	
	public void countMe(){
		for(int i=1; i<=9;i++){
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The value if i is: "+i+" and the thread number is: "+threadNo);
		}
	}
	SslRMIClientSocketFactory
}

}
