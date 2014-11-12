import java.awt.EventQueue;
import java.awt.event.ActionEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.SpringLayout;
import javax.swing.JRadioButton;


public class NumberThree {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NumberThree window = new NumberThree();
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
	public NumberThree() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		
		JRadioButton Small = new JRadioButton("Small");
		Small.setSelected(true);
		frame.getContentPane().add(Small);
		
		JRadioButton Medium = new JRadioButton("Medium");
		springLayout.putConstraint(SpringLayout.SOUTH, Medium, -135, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, Small, 0, SpringLayout.WEST, Medium);
		springLayout.putConstraint(SpringLayout.SOUTH, Small, -24, SpringLayout.NORTH, Medium);
		springLayout.putConstraint(SpringLayout.WEST, Medium, 153, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(Medium);
		
		JRadioButton Large = new JRadioButton("Large");
		springLayout.putConstraint(SpringLayout.NORTH, Large, 24, SpringLayout.SOUTH, Medium);
		springLayout.putConstraint(SpringLayout.WEST, Large, 0, SpringLayout.WEST, Small);
		frame.getContentPane().add(Large);
	
		ButtonGroup group = new ButtonGroup();
			group.add(Small);
			group.add(Medium);
			group.add(Large);

	}
}
