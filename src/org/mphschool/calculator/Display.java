package org.mphschool.Calculator;

import java.awt.Dimension;
import javax.swing.JTextField;

public class Display {
	
	private JTextField field;
	
	public JTextField createGUIComponent() {
		field = new JTextField();
		field.setEditable(false);
		field.setPreferredSize(new Dimension(195, 70));
		return field;
	}
	
	public void update(String text) {
		field.setText(text);
	}
}
