package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import domain.Student;
import edu.app.client.delegate.StudentServiceDelegate;

public class ConnectionFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Login;
	private JLabel lblNewLabel_1;
	private JTextField Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					ConnectionFrame frame = new ConnectionFrame();
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
	public ConnectionFrame() {
		/**/
		setTitle("Authentification");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		final JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login:");
		lblNewLabel.setBounds(65, 99, 46, 14);
		panel.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(65, 139, 64, 14);
		panel.add(lblPassword);
		
		Login = new JTextField();
		Login.setBounds(178, 96, 135, 20);
		panel.add(Login);
		Login.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Sign in");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1.setBounds(172, 11, 127, 32);
		panel.add(lblNewLabel_1);
		final JLabel lblLoginpasswordIncorrect = new JLabel("Login/Password incorrect");
		lblLoginpasswordIncorrect.setForeground(Color.RED);
		lblLoginpasswordIncorrect.setBounds(139, 167, 149, 26);
		lblLoginpasswordIncorrect.setVisible(false);
		panel.add(lblLoginpasswordIncorrect);
		JButton Signin = new JButton("Sign in");
		Signin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Student student=null;
				student= (Student)StudentServiceDelegate.doFindStudentByLoginAndPassword(Login.getText(), Password.getText());
				if(student==null)
				{
					lblLoginpasswordIncorrect.setVisible(true);
				}else
				{
					MainWindowFrame pf = new MainWindowFrame();
					pf.setVisible(true);
					
				}
			}
		});
		Signin.setBounds(98, 235, 89, 23);
		panel.add(Signin);
		
		JButton Exit = new JButton("Exit");
		Exit.setBounds(222, 235, 89, 23);
		panel.add(Exit);
		
		JButton btnNewSignUp = new JButton("New? Sign up");
		btnNewSignUp.setBounds(10, 269, 404, 23);
		panel.add(btnNewSignUp);
		
		Password = new JTextField();
		Password.setBounds(178, 136, 135, 20);
		panel.add(Password);
		Password.setColumns(10);
		
		
	}
}
