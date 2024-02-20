import javax.swing.JPanel;
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestFrameRegister extends JFrame {

	private JTextField textField_FirstName;
	private JTextField textField_MiddleName;
	private JTextField textField_LastName;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame frame = new TestFrame();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setTitle("Register"); // sets a title of frame
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TestFrameRegister() {
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

		textField_FirstName = new JTextField();
		textField_FirstName.setColumns(10);
		textField_FirstName.setBounds(10, 136, 265, 28);
		uiPanel.add(textField_FirstName);

		JLabel lblNewLabel_2 = new JLabel("FIRST NAME");
		lblNewLabel_2.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 111, 265, 14);
		uiPanel.add(lblNewLabel_2);

		textField_MiddleName = new JTextField();
		textField_MiddleName.setColumns(10);
		textField_MiddleName.setBounds(10, 205, 265, 28);
		uiPanel.add(textField_MiddleName);

		JLabel lblNewLabel_3 = new JLabel("MIDDLE NAME");
		lblNewLabel_3.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 180, 265, 14);
		uiPanel.add(lblNewLabel_3);

		textField_LastName = new JTextField();
		textField_LastName.setColumns(10);
		textField_LastName.setBounds(10, 274, 265, 28);
		uiPanel.add(textField_LastName);

		JLabel lblNewLabel_4 = new JLabel("LAST NAME");
		lblNewLabel_4.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 249, 265, 14);
		uiPanel.add(lblNewLabel_4);

		JButton btnNewButton = new JButton("SIGN IN");
		btnNewButton.setBounds(10, 310, 113, 32);
		uiPanel.add(btnNewButton);

		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.setBounds(157, 310, 118, 32);
		uiPanel.add(btnSignUp);
	}
}