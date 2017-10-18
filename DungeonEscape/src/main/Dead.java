package main;

import javax.swing.JOptionPane;

public class Dead {
	static String choice5;
	public static void main(String[] args) {
		Death();
	}
		
	public static void Death() {
		JOptionPane.showMessageDialog(null, "YOU DIED");
		choice5 = JOptionPane.showInputDialog("Would you like to continue yes or no ");
		if("YES".equalsIgnoreCase(choice5)) {
			Main.game2();
		}
		if ("No".equalsIgnoreCase(choice5)){
			System.exit(0);
		}
		
	}

}
