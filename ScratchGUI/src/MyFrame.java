import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;


public class MyFrame extends JFrame {
	
	// Create Constructor for instance of MyFrame 
		MyFrame(){
			
			this.setTitle("Hi Girls"); //sets a title of frame
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
			this.setResizable(false); //Prevent Frame from being resize
			this.setSize(420,420); //Sets the x-dimension, and y-dimension of frame
			this.setVisible(true); //Make frame visible
			
//			ImageIcon image = new ImageIcon(""); //Create an ImageIcon
//			this.setIconImage(image.getImage()); //Change Icon of Frame
			
			//Color. you can choose the built in color within it
//			this.getContentPane().setBackground(Color.gray);
			
			//new Color() you can customize color such as RGB or HEX
//			this.getContentPane().setBackground(new Color(0, 0 ,0));
	}
}
