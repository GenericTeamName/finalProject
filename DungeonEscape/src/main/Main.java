package main;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static void game() {
		String choicePath, continueGame = "no";
		String puzzleItems1;
		continueGame = JOptionPane.showInputDialog("Pre-Start note words in all CAPS are options do you "
				+ "understand? If so type YES");
		
		System.out.println("You wake up in an unfamiliar room you have no idea how you got there.");
		System.out.println("You appear to have an empty backpack & amnesia you don’t like where"
				+ " you are now escape from what appears to be a dungeon.");
		System.out.println("You see two paths in front of you. One leads left and the "
				+ "other leads right.");
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
		System.out.println("You see two more paths ahead of you, what is up with this labyrinth?");
		System.out.println("On the right you feel a mystical energy remenating.");
		System.out.println("On the left you see something faintly glimmering.");
		puzzleItems1 = JOptionPane.showInputDialog("Which way do you choose LEFT or RIGHT");
		if ("Left".equalsIgnoreCase(puzzleItems1)) {
			PuzzleShield.item();
			PocketKnife.item();
		}
	}
	public static void win() {
		String playAgain;
		playAgain = JOptionPane.showInputDialog("You have beaten the game do you wish to try for a"
				+ "different ending? YES or NO");
		if ("Yes".equalsIgnoreCase(playAgain)) {
			game();
		}
	}

}
