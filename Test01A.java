package test01;

import java.awt.*;
import java.awt.Dimension;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Test01A extends JPanel {
	
	public Test01A() {
		
		setBounds(0, 0, 500, 300);
		setPreferredSize(new Dimension(400, 300));
		setLayout(null);
		
		JLabel label = new JLabel("A Simple Form");
		label.setBounds(20, 20, label.getPreferredSize().width, 
				label.getPreferredSize().height);

		JLabel labelName = new JLabel("Name");
		labelName.setBounds(20, 100, labelName.getPreferredSize().width, 
				labelName.getPreferredSize().height);

		JTextField textName = new JTextField(30);
		textName.setBounds(80, 100, textName.getPreferredSize().width, 
				textName.getPreferredSize().height);

		JButton btnName = new JButton(" OK ");
		btnName.setBounds(20, 200, btnName.getPreferredSize().width, 
				btnName.getPreferredSize().height);

		add(label);
		add(labelName);
		add(textName);
		add(btnName);
		
	}

	public static void main(String[] args) {
		
		Test01A panel = new Test01A();
		panel.setBackground(Color.green);
		panel.setOpaque(true);
		
		JFrame frame = new JFrame();
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.pack();
		
	}
}
