import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaLabel {
	public static void main(String[] args) {
		
		// JLabel = a GUI display area for a string of text, an image or both
		
//		ImageIcon image = new ImageIcon(""); Getting image file from SRC
		
		JLabel label = new JLabel(); //Creating a global name for label
		label.setText("Bro, do you even code?"); //Set text of label
//		label.setIcon(image); // Displaying image if there's image
//		label.setHorizontalTextPosition(JLabel.CENTER) // Set text LEFT, CENTER, RIGHT of image icon
//		label.setVerticalTextPosition(JLabel.TOP); // Set text TOP, CENTER, BOTTOM of image icon
		label.setForeground(new Color(0x00FF00)); // USE HEX CODE set font color of text
		label.setFont(new Font("MV Boli",Font.PLAIN,20)); // set font of text
		
		JFrame frame = new JFrame(); //Creates a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		frame.setSize(500,500); //Sets the x-dimension, and y-dimension of frame
		frame.setVisible(true); //Make frame visible
		
		frame.add(label);
	}
}
