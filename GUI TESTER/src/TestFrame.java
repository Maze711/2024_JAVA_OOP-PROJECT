import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestFrame extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame frame = new TestFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setTitle("Login"); //sets a title of frame
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 499);
		getContentPane().setLayout(null);
		
		JPanel textPanel = new JPanel();
		textPanel.setBounds(10, 11, 168, 438);
		textPanel.setBackground(new Color(153, 0, 51));
		getContentPane().add(textPanel);
		textPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("WELCOME");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Source Code Pro", Font.BOLD, 21));
		textPanel.add(lblNewLabel, BorderLayout.CENTER);
		
		JPanel uiPanel = new JPanel();
		uiPanel.setBounds(188, 11, 285, 438);
		uiPanel.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(uiPanel);
		uiPanel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 151, 265, 28);
		uiPanel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 126, 265, 14);
		uiPanel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 239, 265, 28);
		uiPanel.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 214, 265, 14);
		uiPanel.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("SIGN IN");
		btnNewButton.setBounds(10, 316, 113, 48);
		uiPanel.add(btnNewButton);
		
		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.setBounds(157, 316, 118, 48);
		uiPanel.add(btnSignUp);
		
	}
}
