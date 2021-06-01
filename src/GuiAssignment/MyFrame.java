package GuiAssignment;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	JPanel panel;
	JButton button1, button2, button3;
	JLabel label1, label2;
	JTextField text;

	public MyFrame() {

		setSize(750, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		setLocationRelativeTo(null);

		panel = new JPanel();
		label1 = new JLabel("Welcome to Java pizza. Choose the type of pizza.");
		button1 = new JButton("Combination pizza");
		button2 = new JButton("Potato pizza");
		button3 = new JButton("Roasted meat pizza");
		label2 = new JLabel("count");
		text = new JTextField(10);

		button1.setBounds(30, 70, 150, 30);
		button2.setBounds(210, 70, 150, 30);
		button3.setBounds(390, 70, 150, 30);
		label2.setBounds(570, 70, 120, 30);
		text.setBounds(610, 70, 80, 30);

		button1.setBackground(Color.WHITE);
		button2.setBackground(Color.WHITE);
		button3.setBackground(Color.WHITE);

		panel.add(label1);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(label2);
		panel.add(text);

		getContentPane().add(button1);
		getContentPane().add(button2);
		getContentPane().add(button3);
		getContentPane().add(label2);
		getContentPane().add(text);

		add(panel);
		setVisible(true);
	}
}