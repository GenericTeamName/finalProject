package main;

import javax.swing.JOptionPane;

public class RightPath {
	public boolean windDagger = false;
	public static void main (String [] args) {
		

	}


	public static void right() {
		System.out.println("You decided to go right and the door slams shut behind you.");
		String choice2 = JOptionPane.showInputDialog("Do you PROCEED or WAIT");
		
		
		if ("WAIT".equalsIgnoreCase(choice2)) {
			System.out.println("you can see the other door now matches the wall.");
			System.out.println("you should continue forward");
		}

		if ("PROCEED".equalsIgnoreCase(choice2)) {
			System.out.println("You proceed down a long empty coridor that lookes to have walls made");
			System.out.println("out of stone and steel you eventualy come apon a room");
			TreasureRoom.dagger();
			
		}
			BattleEncounters.skeleton();
		
			
		}
		
		
	}


