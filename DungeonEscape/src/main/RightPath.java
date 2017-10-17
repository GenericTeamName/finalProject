package main;

import javax.swing.JOptionPane;

public class RightPath {
    static boolean windDagger = false;
	static String attack;
	static String run;
	static String spook;
	static int random;
	static boolean player;
	static boolean enemy;
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
			dagger();
			
		}
		skeleton();
		if (player = true) {
			System.out.println("you exit the room in triumph and proceed down the hall");
			System.out.println("you enter a room resembling a library");
			System.out.println("a book case ");
		}
		
				
			}
	
/////////////////////////////!!!Treasures!!!/////////////////////////////////////////////////////////////////////////
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
			windDagger = true;
		}
	}
		
	
	
//////////////////////////!!!!!BATTLES GO HERE!!!!!/////////////////////////////////////////////////////////////////////
	public static void skeleton() {
		System.out.println("you walk into a small room with a skeleton holding a spork");
		System.out.println("there was peice of paper that went out the way you came in it got disintegrated");
		System.out.println("instantly, you realize there’s no going back that way.");
		attack = JOptionPane.showInputDialog("Do you want to ATTACK the skeleton\nDo you want to RUN past the skeleton\n do you want to try to SPOOK the skeleton");
		if("ATTACK".equalsIgnoreCase(attack) ) {
			random = 1 + (int)(Math.random() * 100);
			while(enemy == true && player == true) {
			if(windDagger = true) {
				if(random < 90 && random > 50) {
					System.out.println("you won the fight by hiting the skeleton in the head");
					enemy = false;
				}
				if(random <= 50 && random >=11) {
					System.out.println("you hit the wall next to the skeliton and miss");
					System.out.println("you stepped back out of the skeletons range");
				}
				if(random <= 10) {
					System.out.println("you somehow not only missed but hit the floor");
					System.out.println("the skeleton hits you while your down");
					System.out.println("YOU DIED");
					player = false;
					Dead.Death();
					
				}
			}
				if (windDagger = false) {
					if(random < 90 && random > 70) {
						System.out.println("you won the fight by hiting the skeleton in the head");
						enemy = false;
					}
					else if(random <= 70 && random >=31) {
						System.out.println("you hit the wall next to the skeliton and miss");
						System.out.println("you stepped back out of the skeletons range");
					}
					else if(random <= 30) {
						System.out.println("you somehow not only missed but hit the floor");
						System.out.println("the skeleton hits you while your down");
						Dead.Death();
						
				}
					
		   }
			
		}
			
			
		
	}
		if ("RUN".equalsIgnoreCase(run)) {
			System.out.println("youturn to run and the skeleton attacks you");
			Dead.Death();
			
		 }
		if("Spook".equalsIgnoreCase(spook)) {
			System.out.println("the skeleton finds your atemt funny then procceeds to spook you");
			System.out.println("the skeleton spooks you to death");
			Dead.Death();
		}
		}
}
		
		
	


