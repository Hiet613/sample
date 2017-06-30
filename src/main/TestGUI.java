package main;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;

public class TestGUI extends Frame{

	public TestGUI(){
		super();
		setTitle("Hellio");
		setSize(300,150);


		Label mylabel;
		mylabel = new Label("Hellottt");
		this.add("Center",mylabel);

		Button mybutton;
		mybutton = new Button("OK");
		this.add("South", mybutton);

	}

	public static void main(String args[]){
		new TestGUI().setVisible(true);
	}
}
