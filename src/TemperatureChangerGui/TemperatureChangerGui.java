package TemperatureChangerGui;

import javax.swing.*;
import java.awt.*;

public class TemperatureChangerGui extends JFrame {
	public TemperatureChangerGui() {

		setSize(350, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		setTitle("MyFrame");

		JPanel panel1 = new JPanel();
		JLabel label1 = new JLabel("Fahrenheit temperature", JLabel.LEFT);
		JTextField cTemp = new JTextField(10);

		JPanel panel2 = new JPanel();
		JLabel label2 = new JLabel("Celsius temperature", JLabel.LEFT);
		JTextField fTemp = new JTextField(10);

		JPanel panel3 = new JPanel();
		JButton button = new JButton("Convert");

		panel1.add(label1);
		panel1.add(cTemp);

		panel2.add(label2);
		panel2.add(fTemp);

		panel3.add(button);
		button.addActionListener(e -> {
			if (cTemp.getText().isEmpty())
				fTemp.setText("");
			else {
				String s = cTemp.getText();
				double c = Double.parseDouble(s);
				double f = c * 9.0 / 5.0 + 32;
				fTemp.setText("" + f);
			}
		});

		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);
		add(panel3, BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TemperatureChangerGui();
	}
}