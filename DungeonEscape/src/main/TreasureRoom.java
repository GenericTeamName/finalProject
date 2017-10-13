package main;

import javax.swing.JOptionPane;

public class TreasureRoom {

	public static void main(String[] args) {
		
	}
	public static void dagger() {
		
		 System.out.println("There was a very vibrant energy coming from the center of this room	");
		System.out.println( "on a pedestal there was a dagger with a curved blade" );
		String choice3 = JOptionPane.showInputDialog("would you like to PICK UP the dagger or LEAVE it");
		if ("LEAVE".equalsIgnoreCase(choice3)) {
			System.out.println("you choose to leave the dagger behind and procced out the exit");
			System.out.println("after exiting the door it shuts and locks behind you");
		}
		if("PICK UP".equalsIgnoreCase(choice3)) {
			System.out.println("you decided to pick up the dagger it crackles with energy");
			System.out.println("as you procced to the exit you feel a gentle breeze");
			System.out.println("after exiting the room the door shuts and locks behind you");
			
		}
		
	}
}
