package main;

import javax.swing.JOptionPane;

public class PocketKnife {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		item();
	}
	public static void item() {
		String fightOrFlight;
		System.out.println("You find a pocket knife sitting on a pedestal you grab "
				+ "it because who knows when you might need one");
		System.out.println("You hear the invisible audibly elderly man hobbling in your direction as fast"
				+ "as he can with intent to cause pain");
		System.out.println("You feel as if you could try to fight him but the odds of lethaly hurting"
				+ " someone you cannot even see with such a small blade seems very miniscule");
		fightOrFlight = JOptionPane.showInputDialog("You see there's also another door you can go through,"
				+ " do you RUN or do you stay and try to FIGHT him");
		if ("run".equalsIgnoreCase(fightOrFlight)) {
			System.out.println("Being an old man you figure that he can't chase you for that long "
					+ "so as you run away into the room you see that nothing is stopping you from returning"
					+ "you just don't feel as if you should go back there just in case");
			FalseBomb.puzzle();
		}
		if ("fight".equalsIgnoreCase(fightOrFlight)) {
			System.out.println("You get a lucky hit off on the old man and he collapses onto the ground.");
			System.out.println("Standing over him in victory all the doors close and one opens up");
			TrueWin.win();
		}
	}
}
