package org.mphschool.Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;

public class Button {

	public static JButton createGuiButton(String input) {
		JButton button = new JButton(input);
		button.setOpaque(true);
		button.setPreferredSize(new Dimension(60, 60));
		button.setMargin(new Insets(5, 5, 5, 5));
		button.setFont(new Font("sans-serif", Font.PLAIN, 30));
		button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
		return button;
	}

}
