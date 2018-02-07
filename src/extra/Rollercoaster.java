package extra;

import javax.swing.JOptionPane;

public class Rollercoaster {
public static void main(String[] args) {
String height=	JOptionPane.showInputDialog("How tall are you in inches?");
int num = Integer.parseInt(height);
if (num>48) {
JOptionPane.showMessageDialog(null, "You are tall enough! Enjoy the ride!");	
}
else {
JOptionPane.showMessageDialog(null, "Hey grow a bit more!" );	
}
}
}

