package extra;

import javax.swing.JOptionPane;

public class VotingBooth {
public static void main(String[] args) {
	String age= JOptionPane.showInputDialog(null, "How old are you?");
int num = Integer.parseInt(age);

if (num>=18) {
	String pres = JOptionPane.showInputDialog("Who do you want the next president to be?");
	JOptionPane.showMessageDialog(null, pres+ " Won the election by one vote!!");
}
else {
	JOptionPane.showMessageDialog(null, "Hey, go back to living under a rock you noob!!! No voting for you!");
}


}
}
