package main;

import java.util.Scanner;

	class PrintingThread extends Thread {
		public void run(){
			for(int i = 0; i < 10; i++){
				System.out.print(i);
			}
		}
	}



public class ThredExperiment {

	public static void main(String[] args){

		System.out.println("何か入力してください。");

		Thread t = new PrintingThread();
		t.start();

		new Scanner(System.in).nextLine();
	}
}
