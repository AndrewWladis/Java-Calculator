package org.mphschool.Calculator;

import java.awt.Dimension;
import javax.swing.JTextField;

public class Display {
	public JTextField createGUIComponent() {
		JTextField label = new JTextField();
		label.setPreferredSize(new Dimension(150, 60));
		return label;
	}
}
