//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. OPTIONAL: Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		for (int i = 0; i < 8; i++) {
		int randomNumber = new Random().nextInt(6);
		
		// 2. On paper, write all the numbers that get printed when you run this class 10 times
		
		//1, 0, 0, 1, 3, 3, 1, 0, 1, 3
		System.out.println(randomNumber);

		// 3. Use each value of randomNumber to give the user a random compliment.

if (randomNumber == 0) {
	JOptionPane.showMessageDialog(null, "Hi, you like nice today");
}
		// 4. Repeat all the code above 10 times

else if (randomNumber == 1) {
	JOptionPane.showMessageDialog(null, "You are not an Id10t error. :)"); }
else if (randomNumber == 2) {
	JOptionPane.showMessageDialog(null, "You are funny!"); }
else if (randomNumber == 3) {
	JOptionPane.showMessageDialog(null, "You are kind."); }
else if (randomNumber == 4) {
	JOptionPane.showMessageDialog(null, "You are a good coder!"); }
else if (randomNumber == 5) {
	JOptionPane.showMessageDialog(null, "You are very talented"); }


		// 5. Find someone to test out your program. They will like it :)
	}
}
}