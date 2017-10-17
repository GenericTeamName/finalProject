package main;

import javax.swing.JOptionPane;

public class KeyRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		item();
	}
	public static void item() {
		String choice;
		JOptionPane.showMessageDialog(null, "You find a golden key with a skull design on the base of it, just looking"
				+ " at it you feel like it \n might fall apart it’s probably only going to work for one door.");
		JOptionPane.showMessageDialog(null, "As you look around you find not only a door but a hole in the wall that "
				+ "looks like you could climb through and a keyhole.");
		choice = JOptionPane.showInputDialog("You must make a choice do you \n1 climb through the hole in the wall \n2 "
				+ "Use the key on the keyhole");
		if ("1".equalsIgnoreCase(choice)) {
			  
		}
	}
}
