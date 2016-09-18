import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class colorTeaching implements ActionListener {
	JFrame myFrame = new JFrame("Color Teacher");
	JPanel myPanel = new JPanel();
	
	JButton yellow = new JButton();
	JButton red = new JButton();
	JButton blue = new JButton();
	JButton green = new JButton();
	public static void main(String[] args) {
		colorTeaching col = new colorTeaching();
		col.setup();
		
	}

	void setup(){

		
		yellow.addActionListener(this);
		red.addActionListener(this);
		blue.addActionListener(this);
		green.addActionListener(this);
			
		yellow.setBackground(Color.yellow);
		yellow.setOpaque(true);
		red.setBackground(Color.red);
		red.setOpaque(true);
		blue.setBackground(Color.blue);
		blue.setOpaque(true);
		green.setBackground(Color.green);
		green.setOpaque(true);
		
		myPanel.add(yellow);
		myPanel.add(red);
		myPanel.add(blue);
		myPanel.add(green);
		
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setVisible(true);
		
	}


		
		void speak(String words) {
			try{
				Runtime.getRuntime().exec("say " + words);
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == yellow){
				speak("yellow");
			}
			
			if(e.getSource() == red){
				speak("red");
			}
			
			if(e.getSource() == blue){
				speak("blue");
			}
			
			if(e.getSource() == green){
				speak("green");
			}
			
		}
	
}
