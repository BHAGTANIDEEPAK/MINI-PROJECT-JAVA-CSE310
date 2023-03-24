import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Demo3 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo3 window = new Demo3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Demo3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		 lblNewLabel = new JLabel("student-img");
		 lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/images/student imag.jpg")));
		
		lblNewLabel.setBounds(675, 134, 632, 442);
		frame.getContentPane().add(lblNewLabel);
		 
		
		 lblNewLabel_1 = new JLabel("teacher-img");
		 lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/images/teacher image 1.png")));
		 lblNewLabel_1.setBounds(10, 134, 611, 442);
		 frame.getContentPane().add(lblNewLabel_1);
		 
		 lblNewLabel_2 = new JLabel("Welocme to Classroom management System");
		 lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 34));
		 lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_2.setBounds(245, 20, 761, 41);
		 frame.getContentPane().add(lblNewLabel_2);
		 
		 lblNewLabel_3 = new JLabel("You are a");
		 lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		 lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		 lblNewLabel_3.setBounds(450, 71, 261, 47);
		 frame.getContentPane().add(lblNewLabel_3);
		 
		 JButton btnNewButton = new JButton("Teacher");
		 btnNewButton.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Demo4 d1 = new Demo4();
		 		d1.setVisible(true);
		 	}
		 });
		 btnNewButton.addMouseListener(new MouseAdapter() {
		 	@Override
		 	public void mouseClicked(MouseEvent e) {
		 	}
		 });
		 btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 btnNewButton.setBounds(234, 615, 191, 52);
		 frame.getContentPane().add(btnNewButton);
		 
		 JButton btnNewButton_1 = new JButton("Student");
		 btnNewButton_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Demo4 d2 = new Demo4();
		 		d2.setVisible(true);
		 	}
		 });
		 btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		 btnNewButton_1.setBounds(907, 615, 159, 52);
		 frame.getContentPane().add(btnNewButton_1);
	}
}
