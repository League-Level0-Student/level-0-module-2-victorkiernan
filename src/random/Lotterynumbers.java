package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lotterynumbers {
public static void main(String[] args) {
	
	Random rand = new Random();
	String message= "";
	for (int i = 0; i < 5; i++) {

	int number= rand.nextInt(60) +1;


message +=" ";
message += number;


}
JOptionPane.showMessageDialog(null, "Here are the numbers: "+ message); 


}
}
