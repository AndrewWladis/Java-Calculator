package org.mphschool.Calculator;

import java.awt.Dimension;
import javax.swing.JTextField;

public class Display {
	public JTextField createGUIComponent() {
		JTextField label = new JTextField();
		label.setEditable(false);
		label.setPreferredSize(new Dimension(195, 70));
		return label;
	}
}
