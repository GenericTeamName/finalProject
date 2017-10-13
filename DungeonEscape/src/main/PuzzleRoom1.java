package main;

import javax.swing.JOptionPane;

public class PuzzleRoom1 {
	public static String choice;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puzzle();
	}
	public static void puzzle() {
		
		System.out.println("This room seems decrepit and old the door tries to close behind you but short"
				+ " circuits and as you walk forward you hear a small explosion.");
		System.out.println("You turn around just in time to see rocks fall to close the door "
				+ "behind you.");
		System.out.println("There is a sign that says make the water green and put it on the pedestal.");
		System.out.println("On top of the pedestal is a green glass bottle.");
		System.out.println("In the corner is what appears to be a small broken pipe "
				+ "constantly spewing water out. ");
		System.out.println("You grab the green bottle.");
		choice();
		
	}
	public static void choice() {
		choice = JOptionPane.showInputDialog("You have 3 Options \n1 Use Bottle \n2 "
				+ "Use the Mine Turtle \n3 Use your hands to put water on the pedestal");
		if ("1".equals(choice)) {
			System.out.println("You fill the water with green water and place it on the pedestal");
			System.out.println("The pedestal hums for a second and then the door clicks open you proceed");
		}
		if ("2".equals(choice)) {
			System.out.println("You press the button and you get consumed in the resulting explosion");
			UniversalDeath.death();
		}
		if ("3".equals(choice)) {
			System.out.println("I don't know what you were trying to do but it didn't work");
		}
	}
}
