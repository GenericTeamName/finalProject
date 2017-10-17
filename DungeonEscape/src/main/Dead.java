package main;

import javax.swing.JOptionPane;

public class Dead {
	static String yes;
	static String no;
	public static void main(String[] args) {	
	}

	public static void Death() {
		System.out.println("YOU DIED");
		JOptionPane.showInputDialog("Would you like to continue yes or no ");
		if("YES".equalsIgnoreCase(yes)) {
			Main.game2();
		}
		if ("No".equalsIgnoreCase(no)){
			
		}
		
	}

}
