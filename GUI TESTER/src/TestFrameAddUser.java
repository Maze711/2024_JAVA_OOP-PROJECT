import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TestFrameAddUser extends JFrame {

	private JPanel contentPane;
	private final TestFrameDBCONN conn = new TestFrameDBCONN();
	private JTextField textField_FullName;
	private JTextField textField_Password;
	private JTextField textField_Address;
	private JTextField textField_Phone;
	private JTextField textField_Course;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrameAddUser frame = new TestFrameAddUser();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setTitle("Add User"); // sets a title of frame
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestFrameAddUser() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 316, 499);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
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
		textField_Phone.setBounds(8, 272, 265, 28);
		uiPanel.add(textField_Phone);

		JLabel lblNewLabel_5 = new JLabel("Phone Number");
		lblNewLabel_5.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
		lblNewLabel_5.setBounds(9, 249, 265, 14);
		uiPanel.add(lblNewLabel_5);
		
		textField_Course = new JTextField();
		textField_Course.setColumns(10);
		textField_Course.setBounds(10, 339, 265, 28);
		uiPanel.add(textField_Course);

		JLabel lblNewLabel_6 = new JLabel("Course");
		lblNewLabel_6.setFont(new Font("Source Code Pro", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(13, 318, 265, 14);
		uiPanel.add(lblNewLabel_6);
		
		JButton btnSignUp = new JButton("Add User");
		btnSignUp.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        // Get the user input
		        String fullname = textField_FullName.getText();
		        String password = textField_Password.getText();
		        String address = textField_Address.getText();
		        String phone = textField_Phone.getText();
		        String course = textField_Course.getText();
		        
		        // Insert the user into the database using the conn instance
		        try {
		            String query = "INSERT INTO user (FullName, Password, Address, Phone, Course) VALUES (?, ?, ?, ?, ?)";
		            try (PreparedStatement preparedStatement = conn.getConnection().prepareStatement(query)) {
		                preparedStatement.setString(1, fullname);
		                preparedStatement.setString(2, password);
		                preparedStatement.setString(3, address);
		                preparedStatement.setString(4, phone);
		                preparedStatement.setString(5, course);
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
		btnSignUp.setBounds(155, 386, 118, 32);
		uiPanel.add(btnSignUp);
	}

}
