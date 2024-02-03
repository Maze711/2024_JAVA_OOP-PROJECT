
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaLabel {
	public static void main(String[] args) {
		
		// JLabel = a GUI display area for a string of text, an image or both
		
		JLabel label = new JLabel(); //Creating a global name for label
		label.setText("Bro, do you even code?"); //Set text of label
		
		JFrame frame = new JFrame(); //Creates a frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		frame.setSize(500,500); //Sets the x-dimension, and y-dimension of frame
		frame.setVisible(true); //Make frame visible
		
		frame.add(label);
	}
}
