# aaa
package test1;

import java.awt.*;

import javax.swing.*;


public class test1 extends JPanel {
	
	public test1() {
		
		setBounds(0,0,500,300);
		setPreferredSize(new Dimension(500,300));
		setLayout(null);
		
		JLabel label = new JLabel("A Simple Form");
		label.setBounds(10, 10, label.getPreferredSize().width, 
				label.getPreferredSize().height);

		JLabel labelName = new JLabel("Name");
		labelName.setBounds(10, 100, labelName.getPreferredSize().width, 
				labelName.getPreferredSize().height);

		JTextField textName = new JTextField(30);
		textName.setBounds(80, 100, textName.getPreferredSize().width, 
				textName.getPreferredSize().height);

		JButton btnName = new JButton(" OK ");
		btnName.setBounds(10, 200, btnName.getPreferredSize().width, 
				btnName.getPreferredSize().height);

		add(label);
		add(labelName);
		add(textName);
		add(btnName);
	}
public static void main(String[] args) {
		
		test1 panel = new test1();
		panel.setBackground(Color.green);
		panel.setOpaque(true);
		
		JFrame frame = new JFrame();
		frame.setContentPane(panel);
		frame.setVisible(true);
		frame.pack();
		
	}

}
