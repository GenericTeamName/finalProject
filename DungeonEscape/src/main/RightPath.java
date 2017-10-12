package main;

import javax.swing.JOptionPane;

public class RightPath {

	public static void main (String [] args) {
		

	}


	public static void right() {
		System.out.println("You decided to go right and the door slams shut behind you.");
		String choice2 = JOptionPane.showInputDialog("Do you PROCEED or WAIT");
		
		
		if ("WAIT".equalsIgnoreCase(choice2)) {
			System.out.println("you can see the other door now matches the wall.");
			System.out.println("");
		}
		if ("PROCEED".equalsIgnoreCase(choice2)) {
			
			
		}
		
		
	}

}
