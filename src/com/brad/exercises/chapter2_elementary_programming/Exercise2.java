package com.brad.exercises.chapter2_elementary_programming;

import javax.swing.JOptionPane;

public class Exercise2 {

	public static void main(String[] args) {
		double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the Length: "));
		double breadth = Double.parseDouble(JOptionPane.showInputDialog(null,
				"Enter the Breadth: ",
				"Breadth",
				JOptionPane.QUESTION_MESSAGE));
		
		JOptionPane.showMessageDialog(null, 
				"The area is " + length * breadth 
				+ "\n The perimeter is " + 2 * (length + breadth),
				"Results",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
