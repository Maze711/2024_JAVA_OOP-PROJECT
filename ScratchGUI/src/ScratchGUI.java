import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class ScratchGUI {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame(); //Creates a frame
		frame.setTitle("Hi Girls"); //sets a title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
		frame.setResizable(false); //Prevent Frame from being resize
		frame.setSize(420,420); //Sets the x-dimension, and y-dimension of frame
		frame.setVisible(true); //Make frame visible
		
//		ImageIcon image = new ImageIcon(""); //Create an ImageIcon
//		frame.setIconImage(image.getImage()); //Change Icon of Frame
	}

}
