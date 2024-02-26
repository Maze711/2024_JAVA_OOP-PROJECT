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

	private JPanel contentPane;
	
	private final TestFrameDBCONN conn = new TestFrameDBCONN();
	private JTextField textField_FullName;
	private JTextField textField_Password;
	private JTextField textField_Address;
	private JTextField textField_Phone;

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

		textField_FullName = new JTextField();
		textField_FullName.setColumns(10);
		textField_FullName.setBounds(10, 82, 265, 28);
		uiPanel.add(textField_FullName);

		JLabel lblNewLabel_2 = new JLabel("Full Name");
		lblNewLabel_2.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(10, 57, 265, 14);
		uiPanel.add(lblNewLabel_2);

		textField_Password = new JTextField();
		textField_Password.setColumns(10);
		textField_Password.setBounds(10, 146, 265, 28);
		uiPanel.add(textField_Password);

		JLabel lblNewLabel_3 = new JLabel("Password");
		lblNewLabel_3.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(10, 121, 265, 14);
		uiPanel.add(lblNewLabel_3);

		textField_Address = new JTextField();
		textField_Address.setColumns(10);
		textField_Address.setBounds(10, 210, 265, 28);
		uiPanel.add(textField_Address);

		JLabel lblNewLabel_4 = new JLabel("Address");
		lblNewLabel_4.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(10, 185, 265, 14);
		uiPanel.add(lblNewLabel_4);
		
		textField_Phone = new JTextField();
		textField_Phone.setColumns(10);
		textField_Phone.setBounds(10, 274, 265, 28);
		uiPanel.add(textField_Phone);

		JLabel lblNewLabel_5 = new JLabel("Phone Number");
		lblNewLabel_5.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(10, 249, 265, 14);
		uiPanel.add(lblNewLabel_5);

		JButton btnNewButton = new JButton("SIGN IN");
		btnNewButton.setBounds(10, 340, 113, 32);
		uiPanel.add(btnNewButton);

		JButton btnSignUp = new JButton("SIGN UP");
		btnSignUp.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Get the user input
		        String fullname = textField_FullName.getText();
		        String password = textField_Password.getText();
		        String address = textField_Address.getText();
		        String phone = textField_Phone.getText();
		        
		        // Insert the user into the database using the conn instance
		        try {
		            String query = "INSERT INTO user (FullName, Password, Address, Phone) VALUES (?, ?, ?, ?)";
		            try (PreparedStatement preparedStatement = conn.getConnection().prepareStatement(query)) {
		                preparedStatement.setString(1, fullname);
		                preparedStatement.setString(2, password);
		                preparedStatement.setString(3, address);
		                preparedStatement.setString(4, phone);
		                int rowsAffected = preparedStatement.executeUpdate();
		                if (rowsAffected > 0) {
		                    System.out.println("User registered successfully.");
		                } else {
		                    System.out.println("Failed to register user.");
		                }
		            }
		        } catch (SQLException ex) {
		            System.err.println("Error registering user: " + ex.getMessage());
		            ex.printStackTrace();
		        }
		    }
		});
		btnSignUp.setBounds(157, 340, 118, 32);
		uiPanel.add(btnSignUp);
	}
}