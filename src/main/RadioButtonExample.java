package main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;


public class RadioButtonExample extends JFrame implements ActionListener {

	public static void main(String[] args){
		new RadioButtonExample();
	}

	JRadioButton rb1 = new JRadioButton("君たち前の現場は一緒だったの？",true);
	JRadioButton rb2 = new JRadioButton("データベースのアクセスはどんな感じだったの？");




	RadioButtonExample(){
	getContentPane().setLayout(new FlowLayout());



	JButton button = new JButton("OK");
	button.addActionListener(this);
	ButtonGroup bg = new ButtonGroup();

	bg.add(rb1);
	bg.add(rb2);


	getContentPane().add(rb1);
	getContentPane().add(rb2);

	getContentPane().add(button);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(350, 200);
	setVisible(true);
	}

	public void actionPerformed(ActionEvent e){
		if(rb1.isSelected()){
			System.out.println("いえ違います！今日僕たち初めて会いました！");
		}
		if(rb2.isSelected()){
			System.out.println("直接やっていました！");
		}

	}
}
