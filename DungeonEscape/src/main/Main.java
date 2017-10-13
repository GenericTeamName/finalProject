package main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choicePath, continueGame = "no";
		continueGame = JOptionPane.showInputDialog("Pre-Start note words in all CAPS are options do you "
				+ "understand?");
		
		System.out.println("You wake up in an unfamiliar room you have no idea how you got there.");
		System.out.println("You appear to have an empty backpack & amnesia you don’t like where"
				+ " you are now escape from what appears to be a dungeon.");
		System.out.println("You see two paths in front of you. One leads left and the other leads right.");
		choicePath = JOptionPane.showInputDialog("Please choose a path LEFT or RIGHT");
		
		if ("Left".equalsIgnoreCase(choicePath) || "l".equalsIgnoreCase(choicePath)) {
			StartLeft.mineTurtle();
			String push;
			push = JOptionPane.showInputDialog("Do you PRESS the button or KEEP it");
			if ("Press".equalsIgnoreCase(push)) {
				UniversalDeath.death();
				continueGame = JOptionPane.showInputDialog("Do you wish to continue? YES or NO?");
			}
		}
		PuzzleRoom1.puzzle();
		PuzzleRoom1.choice();
		
	}

}
