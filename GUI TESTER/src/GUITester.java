import javax.swing.JOptionPane;

public class GUITester {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("Enter you Name: ");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you Age: "));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you Height: "));
		
		
		JOptionPane.showMessageDialog(null, "Hello "+name);
		JOptionPane.showMessageDialog(null, "You are "+age+" years old");
		JOptionPane.showMessageDialog(null, "Your are "+height+" cm tall");
	}

}
