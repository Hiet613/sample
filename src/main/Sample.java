package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class Sample {
	public static void main(String[] args)
	{

		try{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("text1.txt")));

			pw.println("Hello!");
			pw.println("Goodbye");


			pw.close();

		}catch(IOException e){
			System.out.println("入出力エラーです。");
		}


	}
}
