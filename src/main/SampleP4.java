package main;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;




public class SampleP4 extends Frame {
	boolean b1;


	public static void main(String aregs[]){

		SampleP4 sm = new SampleP4();

	}
	 public SampleP4(){

		 super("米Dao（ノンフィクション）");

		 b1 = false;

		 addWindowListener(new SampleWindowListener());
		 addMouseListener(new SampleMouseAdapter());

		 setSize(450,200);
		 setVisible(true);

	}

	public void paint(Graphics g){
		if(b1 == true){
			g.drawString("よねだお「直接やってました！(^ω^)」", 100, 100);

		}else{
			g.drawString("質問「データベースのアクセスはどんな感じ？」",100 , 100);
		}
	}

	class SampleWindowListener extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}

	class SampleMouseAdapter extends MouseAdapter{
		public void mouseEntered(MouseEvent e){
			b1 = true;
			repaint();
		}

		public void mouseExited(MouseEvent e){
			b1 = false;
			repaint();
		}

	}
}
