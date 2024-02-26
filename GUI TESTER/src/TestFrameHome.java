import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JSplitPane;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
import javax.swing.border.LineBorder;



public class TestFrameHome extends JFrame {

	DefaultTableModel model;
	private JPanel contentPane;
	private JTable table;
	private final TestFrameDBCONN conn = new TestFrameDBCONN();


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrameHome frame = new TestFrameHome();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setTitle("Home Page"); // sets a title of frame
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TestFrameHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(245, 222, 179));
		panel.setBounds(0, 0, 222, 761);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME ADMIN");
		lblNewLabel.setBounds(22, 54, 177, 27);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Source Code Pro", Font.BOLD, 21));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USER LIST");
		lblNewLabel_1.setBounds(232, 25, 178, 71);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Source Code Pro", Font.BOLD, 30));
		contentPane.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(135, 206, 250));
		panel_1.setBounds(232, 89, 842, 645);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 70, 822, 564);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		model = new DefaultTableModel();
		Object[] column = {"ID", "Full Name", "Address", "Phone", "Course"};
		model.setColumnIdentifiers(column);
		table.setModel(model);
		table.setFont(new Font("Source Code Pro", Font.PLAIN, 14));
		scrollPane.setViewportView(table);
		
		JButton EditButton = new JButton("EDIT");
		EditButton.setBounds(460, 22, 103, 37);
		EditButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestFrameAddUser add = new TestFrameAddUser();
				add.setVisible(true);
				add.setLocationRelativeTo(null);
			}
		});
		EditButton.setFont(new Font("Source Code Pro", Font.BOLD, 16));
		panel_1.add(EditButton);
		
		JButton DeleteButton = new JButton("DELETE");
		DeleteButton.setBounds(573, 22, 103, 37);
		DeleteButton.setFont(new Font("Source Code Pro", Font.BOLD, 16));
		panel_1.add(DeleteButton);
		
		JButton btnRefresh = new JButton("REFRESH");
		btnRefresh.setFont(new Font("Source Code Pro", Font.BOLD, 16));
		btnRefresh.setBounds(686, 22, 126, 37);
		panel_1.add(btnRefresh);
		
        
        fetchData();
    }

    private void fetchData() {
        try {
            Connection connection = conn.getConnection(); // Assuming you have a method to get the connection
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM user");

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String fullName = resultSet.getString("FullName");
                String address = resultSet.getString("Address");
                String phone = resultSet.getString("Phone");
                String course = resultSet.getString("Course");

                model.addRow(new Object[]{id, fullName, address, phone, course, "", ""});
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
