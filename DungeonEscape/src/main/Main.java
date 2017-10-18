package main;



import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
	}
	
=======
	game2();
		
		
		
	}
public static void game2() {
	String choice1;
	
	JOptionPane.showMessageDialog(null, "You wake up in an unfamiliar room you have no idea how you got there.");
	JOptionPane.showMessageDialog(null, "You appear to have an empty backpack & amnesia you don’t like where "
			                        + "you are now escape from what appears to be a dungeon.");
	JOptionPane.showMessageDialog(null, "You see two paths in front of you. One leads left and the other leads right."); 
	choice1 = JOptionPane.showInputDialog("Please choose a path LEFT or RIGHT");
	
	if ( "RIGHT".equalsIgnoreCase(choice1)) {
		RightPath.right();
	}
}
}

