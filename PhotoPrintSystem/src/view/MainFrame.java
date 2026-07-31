package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame  extends JFrame {
	
	private JPanel headerPanel;
	private JPanel mainPanel;
	private JLabel lblTitle;
	private JPanel customerPanel;
	private JPanel cameraPanel;
	private JPanel photoPanel;
	private JPanel buttonPanel;
	private JPanel statusPanel;
	private JLabel lblCustomerName;
	private JLabel lblCustomerId;

	private JTextField txtCustomerName;
	private JTextField txtCustomerId;
	
	
	
	public MainFrame(){

		initializeFrame();

		createHeader();
		
		createMainPanel();

		createCustomerPanel();

		createCameraPanel();

		createPhotoPanel();

		createButtonPanel();

		createStatusBar();

		setVisible(true);

		}
	
	private void initializeFrame() {
		setTitle("Photo Print Manegement System");
		setSize(1200,700);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(new BorderLayout());
	
		
		
	}

	private void createHeader() {
		headerPanel = new JPanel();

		lblTitle = new JLabel("PHOTO PRINT MANAGEMENT SYSTEM");
	
		headerPanel.setBackground(new Color(25, 45, 95));
		headerPanel.add(lblTitle);
		headerPanel.setPreferredSize(new Dimension(0,50));
		
		lblTitle.setForeground(Color.white);
		lblTitle.setFont(new Font("Arial" , Font.BOLD,22));
		add(headerPanel, BorderLayout.NORTH);
	
		
		
	}

	private void createCustomerPanel() {
		
		customerPanel = new JPanel();
		lblCustomerName = new JLabel("Customer Name :");
		txtCustomerName = new JTextField(20);
		
		lblCustomerId = new JLabel("Customer ID :");
		txtCustomerId = new JTextField(20);
		customerPanel.add(lblCustomerName);
		customerPanel.add(txtCustomerName);
		customerPanel.add(lblCustomerId);
		customerPanel.add(txtCustomerId);
		mainPanel.add(customerPanel);

		
		
	}
	private void createMainPanel()
	{
	mainPanel  = new JPanel();
	add(mainPanel,BorderLayout.CENTER);	
	}

	private void createCameraPanel() {
		
		
		
	}

	private void createPhotoPanel() {
		
	}

	private void createButtonPanel() {
		
	}

	private void createStatusBar() {
		
	}

}
