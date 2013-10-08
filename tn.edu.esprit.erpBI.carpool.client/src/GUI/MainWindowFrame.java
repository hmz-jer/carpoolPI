package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class MainWindowFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindowFrame frame = new MainWindowFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindowFrame() {
		setTitle("Welcome to your home page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 835, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.GRAY);
		panel.add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(null);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBounds(10, 11, 199, 515);
		desktopPane.add(MainPanel);
		MainPanel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 41, 143, 113);
		MainPanel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton = new JButton("Create Carpool");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 11, 119, 23);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Find a carpool");
		btnNewButton_1.setBounds(10, 45, 119, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnViewMyCarpools = new JButton("View my carpools");
		btnViewMyCarpools.setBounds(10, 79, 119, 23);
		panel_2.add(btnViewMyCarpools);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(10, 223, 143, 113);
		MainPanel.add(panel_3);
		panel_3.setLayout(null);
		
		JButton btnMyProfile = new JButton("My profile");
		btnMyProfile.setBounds(10, 11, 119, 23);
		panel_3.add(btnMyProfile);
		
		JButton btnEditMyProfile = new JButton("Edit my profile");
		btnEditMyProfile.setBounds(10, 45, 119, 23);
		panel_3.add(btnEditMyProfile);
		
		JButton btnDeleteMyAccount = new JButton("Delete my account");
		btnDeleteMyAccount.setBounds(10, 79, 123, 23);
		panel_3.add(btnDeleteMyAccount);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(10, 391, 143, 80);
		MainPanel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnInviteAFriend = new JButton("Invite a friend");
		btnInviteAFriend.setBounds(10, 11, 119, 23);
		panel_4.add(btnInviteAFriend);
		
		JButton btnShareAThought = new JButton("Share a thought");
		btnShareAThought.setBounds(10, 45, 119, 23);
		panel_4.add(btnShareAThought);
		
		JLabel lblManageCarpools = new JLabel("Manage Carpools");
		lblManageCarpools.setBounds(35, 16, 83, 14);
		MainPanel.add(lblManageCarpools);
		
		JLabel lblManageMyProfile = new JLabel("Manage my profile");
		lblManageMyProfile.setBounds(24, 198, 112, 14);
		MainPanel.add(lblManageMyProfile);
		
		JLabel lblSocialNetworks = new JLabel("Social networks");
		lblSocialNetworks.setBounds(21, 366, 112, 14);
		MainPanel.add(lblSocialNetworks);
		
		JButton btnLogout = new JButton("Log out");
		btnLogout.setBounds(20, 492, 119, 23);
		MainPanel.add(btnLogout);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(219, 11, 580, 515);
		desktopPane.add(panel_1);
	}
}
